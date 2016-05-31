/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.javax.processor;

import com.github.bennyl.jml.javax.parser.JavaXBaseVisitor;
import com.github.bennyl.jml.javax.parser.JavaXParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;
import org.antlr.v4.runtime.ParserRuleContext;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.reference.CtTypeParameterReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.PrettyPrinter;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;

/**
 *
 * @author bennyl
 */
public class SpoonASTParser extends JavaXBaseVisitor<Object> {

    private static final Map<String, ModifierKind> MODIFIERS = new HashMap<>();

    static {
        MODIFIERS.put("abstract", ModifierKind.ABSTRACT);
        MODIFIERS.put("final", ModifierKind.FINAL);
//        MODIFIERS.put("default", ModifierKind.DEFAULT);
        MODIFIERS.put("native", ModifierKind.NATIVE);
        MODIFIERS.put("private", ModifierKind.PRIVATE);
        MODIFIERS.put("protected", ModifierKind.PROTECTED);
        MODIFIERS.put("public", ModifierKind.PUBLIC);
        MODIFIERS.put("static", ModifierKind.STATIC);
        MODIFIERS.put("strictfs", ModifierKind.STRICTFP);
        MODIFIERS.put("synchronized", ModifierKind.SYNCHRONIZED);
        MODIFIERS.put("transient", ModifierKind.TRANSIENT);
        MODIFIERS.put("volatile", ModifierKind.VOLATILE);
    }

    private Factory factory;
    private GlobalTypesStack global;

    public SpoonASTParser() {
        final StandardEnvironment env = new StandardEnvironment();
        env.setAutoImports(true);
        this.factory = new FactoryImpl(new DefaultCoreFactory(), env);
        this.global = new GlobalTypesStack(factory);
    }

    @Override
    public CompilationUnit visitCompilationUnit(JavaXParser.CompilationUnitContext ctx) {
        CtPackage pack = factory.Package().getOrCreate(ctx.packageDeclaration().packageName().getText());
        CompilationUnit cu = factory.CompilationUnit().create();

        global.pushNewFrame();

        ctx.importDeclaration().forEach(this::visit);

        Function<CtPackage, CtType> mainType = lookup(ctx.typeDeclaration());
        cu.setDeclaredTypes(Arrays.asList(mainType.apply(pack)));

        global.popTopFrame();
        return cu;
    }

    @Override
    public Object visitSingleTypeImportDeclaration(JavaXParser.SingleTypeImportDeclarationContext ctx) {
        String imported = ctx.typeName().getText();
        int globalNameIndex = imported.lastIndexOf(".");
        String globalName = imported;
        if (globalNameIndex >= 0) {
            globalName = imported.substring(globalNameIndex + 1, imported.length());
        }

        global.defineGlobal(globalName, imported);
        return null;
    }

    @Override
    public Function<CtPackage, CtType> visitNormalClassDeclaration(JavaXParser.NormalClassDeclarationContext ctx) {

        return pack -> {
            CtType type = factory.Class().create(pack, ctx.Identifier().getText());
            type.setModifiers(
                    modifiers(ctx.classModifier().stream()
                            .filter(m -> m.annotation() == null)
                            .map(m -> m.getText())));
            Consumer<CtType> body = lookup(ctx.classBody());
            body.accept(type);
            return type;
        };

    }

    @Override
    public Consumer<CtType> visitClassBody(JavaXParser.ClassBodyContext ctx) {
        return type -> {
            ctx.classBodyDeclaration().forEach(d -> {
                Consumer<CtType> v = lookup(d);
                v.accept(type);
            });
        };
    }

    @Override
    public Consumer<CtType> visitMethodDeclaration(JavaXParser.MethodDeclarationContext ctx) {
        return type -> {
            CtMethod m = factory.Core().createMethod();

            Consumer<CtMethod> header = lookup(ctx.methodHeader());
            header.accept(m);

            Consumer<CtMethod> body = lookup(ctx.methodBody().block());

            type.addMethod(m);
        };
    }

    @Override
    public CtIf visitIfThenElseStatement(JavaXParser.IfThenElseStatementContext ctx) {
        CtIf ifStmt = factory.Core().createIf();
        final CtExpression<Boolean> exp = lookup(ctx.expression());
        ifStmt.setCondition(exp);
        return ifStmt;
    }

    @Override
    public Object visitBooleanNegateExpression(JavaXParser.BooleanNegateExpressionContext ctx) {
        CtUnaryOperator<Object> op = factory.Core().createUnaryOperator();
        op.setOperand(lookup(ctx.unaryExpression()));
        op.setKind(UnaryOperatorKind.NEG);
        return op;
    }

    @Override
    public Consumer<CtMethod> visitMethodHeader(JavaXParser.MethodHeaderContext ctx) {
        return method -> {
            global.pushNewFrame();
            if (ctx.typeParameters() != null) {
                List<CtTypeParameterReference> parameters = lookup(ctx.typeParameters().typeParameterList());
                global.defineGlobalTypeVariables(parameters);
                method.setFormalTypeParameters((List) parameters);
            }

            CtTypeReference returnType = lookup(ctx.result());
            method.setType(returnType);
            method.setSimpleName(ctx.methodDeclarator().Identifier().getText());

            if (ctx.methodDeclarator().methodParameterList() != null) {
                Consumer<CtMethod> parameters = lookup(ctx.methodDeclarator().methodParameterList());
                parameters.accept(method);
            }

            global.popTopFrame();
        };
    }

    @Override
    public Consumer<CtMethod> visitMethodParameterList(JavaXParser.MethodParameterListContext ctx) {
        return method -> {
            if (ctx.methodParameters() != null) {
                ctx.methodParameters().methodParameter().stream()
                        .map(this::visit)
                        .map(p -> (Consumer<CtMethod>) p)
                        .forEach(c -> c.accept(method));
            }

            if (ctx.variadicMethodParameter() != null) {
                throw new UnsupportedOperationException("not supported yet");
            }
        };
    }

    @Override
    public Consumer<CtMethod> visitMethodParameter(JavaXParser.MethodParameterContext ctx) {
        CtTypeReference type = lookup(ctx.typeReference());
        String varName = ctx.variableDeclaratorId().Identifier().getText();
        if (ctx.variableDeclaratorId().dims() != null) {
            int dims = ctx.variableDeclaratorId().dims().dim.size();
            type = factory.Type().createArrayReference(type, dims);
        }

        CtTypeReference ftype = type;
        return method -> {
            factory.Method().createParameter(method, ftype, varName);
        };
    }

    @Override
    public CtTypeParameterReference visitTypeParameter(JavaXParser.TypeParameterContext ctx) {
        String typeName = ctx.typeVariable().Identifier().getText();
        if (ctx.typeBound() != null) {
            return factory.Type().createTypeParameterReference(typeName, lookup(ctx.typeBound()));
        } else {
            return factory.Type().createTypeParameterReference(typeName);
        }
    }

    @Override
    public List<CtTypeParameterReference> visitTypeBound(JavaXParser.TypeBoundContext ctx) {
        if (ctx.typeVariable() != null) {
            return Arrays.asList(lookup(ctx.typeVariable()));
        }

        List<CtTypeParameterReference> result = new ArrayList<>();
        result.add(lookup(ctx.classOrInterfaceType()));
        ctx.additionalBound().forEach(t -> result.add(lookup(t.interfaceType())));
        return result;
    }

    @Override
    public Object visitClassOrInterfaceTypeReferenceSimple(JavaXParser.ClassOrInterfaceTypeReferenceSimpleContext ctx) {
        System.out.println("visiting type ref: " + ctx.getText() + ", typeArgs: " + ctx.typeArguments());
        String typeName = ctx.Identifier().getText();
        CtTypeReference typeRef = global.lookup(typeName);
        if (ctx.typeArguments() != null) {
            typeRef = clone(typeRef);
            final List<CtTypeReference<?>> typeArguments = lookup(ctx.typeArguments().typeArgumentList());
            System.out.println("type ref for " + ctx.getText() + " has type arguments: " + typeArguments);
            typeRef.setActualTypeArguments(typeArguments);
        }
        return typeRef;
    }

    @Override
    public List<CtTypeReference> visitTypeArgumentList(JavaXParser.TypeArgumentListContext ctx) {
        return ctx.typeArgument().stream()
                .map((typeArg) -> {
                    return this.lookup(typeArg);
                })
                .map(t -> (CtTypeReference) t)
                .collect(toList());
    }

    @Override
    public List<CtTypeParameterReference> visitTypeParameterList(JavaXParser.TypeParameterListContext ctx) {
        return ctx.typeParameter().stream()
                .map((typeArg) -> {
                    return this.lookup(typeArg);
                })
                .map(t -> (CtTypeParameterReference) t)
                .collect(toList());
    }

    private <T extends CtElement> T clone(T element) {
        return factory.Core().clone(element);
    }

    public String toString(CompilationUnit cu) {
        PrettyPrinter pp = createPrettyPrinter();
        pp.calculate(cu, cu.getDeclaredTypes());
        return pp.getResult();
    }

    private PrettyPrinter createPrettyPrinter() {
        return new DefaultJavaPrettyPrinter(factory.getEnvironment());
    }

    private static Set<ModifierKind> modifiers(Stream<String> names) {
        return names.map(n -> MODIFIERS.get(n)).collect(toSet());
    }

    private <T> T lookup(ParserRuleContext ctx) {
        return (T) visit(ctx);
    }
}
