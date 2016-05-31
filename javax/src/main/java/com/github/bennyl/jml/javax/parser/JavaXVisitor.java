// Generated from /home/bennyl/IdeaProjects/test-antlr/src/main/java/antlr/JavaX.g4 by ANTLR 4.5.1
package com.github.bennyl.jml.javax.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaXParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaXParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaXParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaXParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(JavaXParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(JavaXParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(JavaXParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JavaXParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaXParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaXParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(JavaXParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JavaXParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(JavaXParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaXParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(JavaXParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaXParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(JavaXParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaXParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(JavaXParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaXParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(JavaXParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(JavaXParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(JavaXParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JavaXParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(JavaXParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(JavaXParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(JavaXParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaXParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaXParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(JavaXParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaXParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(JavaXParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(JavaXParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(JavaXParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(JavaXParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaXParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaXParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(JavaXParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(JavaXParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaXParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(JavaXParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(JavaXParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(JavaXParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(JavaXParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaXParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaXParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(JavaXParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaXParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(JavaXParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(JavaXParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaXParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaXParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaXParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(JavaXParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primitiveTypeReferece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveTypeReferece(JavaXParser.PrimitiveTypeRefereceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#referenceTypeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceTypeReference(JavaXParser.ReferenceTypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classOrInterfaceTypeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceTypeReference(JavaXParser.ClassOrInterfaceTypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classOrInterfaceTypeReferenceSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceTypeReferenceSimple(JavaXParser.ClassOrInterfaceTypeReferenceSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classTypeReferenceAnnotated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTypeReferenceAnnotated(JavaXParser.ClassTypeReferenceAnnotatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classTypeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTypeReference(JavaXParser.ClassTypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeVariableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableReference(JavaXParser.TypeVariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#arrayTypeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeReference(JavaXParser.ArrayTypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaXParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(JavaXParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(JavaXParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JavaXParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(JavaXParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameterList(JavaXParser.MethodParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameters(JavaXParser.MethodParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(JavaXParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#variadicMethodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariadicMethodParameter(JavaXParser.VariadicMethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaXParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaXParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(JavaXParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(JavaXParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(JavaXParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaXParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(JavaXParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(JavaXParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaXParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(JavaXParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(JavaXParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(JavaXParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JavaXParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(JavaXParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaXParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(JavaXParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(JavaXParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaXParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(JavaXParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaXParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaXParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(JavaXParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(JavaXParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(JavaXParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaXParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaXParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(JavaXParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(JavaXParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaXParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaXParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaXParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaXParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(JavaXParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaXParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(JavaXParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaXParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaXParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(JavaXParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(JavaXParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaXParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaXParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaXParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(JavaXParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(JavaXParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(JavaXParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaXParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(JavaXParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaXParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(JavaXParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaXParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JavaXParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaXParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaXParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(JavaXParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(JavaXParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(JavaXParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(JavaXParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(JavaXParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaXParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JavaXParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(JavaXParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(JavaXParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(JavaXParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(JavaXParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JavaXParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(JavaXParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaXParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(JavaXParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaXParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(JavaXParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaXParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(JavaXParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(JavaXParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavaXParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(JavaXParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(JavaXParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(JavaXParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaXParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JavaXParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(JavaXParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(JavaXParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(JavaXParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaXParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaXParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaXParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JavaXParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(JavaXParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(JavaXParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(JavaXParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaXParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(JavaXParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaXParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(JavaXParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(JavaXParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaXParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(JavaXParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaXParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaXParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(JavaXParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(JavaXParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaXParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(JavaXParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaXParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(JavaXParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(JavaXParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(JavaXParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaXParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(JavaXParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(JavaXParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(JavaXParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JavaXParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(JavaXParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(JavaXParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#simpleMethodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleMethodInvocation(JavaXParser.SimpleMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#referencedMethodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencedMethodInvocation(JavaXParser.ReferencedMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noPrimaryMethodInvocation_}
	 * labeled alternative in {@link JavaXParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPrimaryMethodInvocation_(JavaXParser.NoPrimaryMethodInvocation_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryMethodInvocation}
	 * labeled alternative in {@link JavaXParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryMethodInvocation(JavaXParser.PrimaryMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleMethodInvocation_}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleMethodInvocation_(JavaXParser.SimpleMethodInvocation_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code staticReferencedMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticReferencedMethodInvocation(JavaXParser.StaticReferencedMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionReferencedMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionReferencedMethodInvocation(JavaXParser.ExpressionReferencedMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperMethodInvocation(JavaXParser.SuperMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticSuperMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticSuperMethodInvocation(JavaXParser.StaticSuperMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaXParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(JavaXParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(JavaXParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(JavaXParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(JavaXParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(JavaXParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(JavaXParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(JavaXParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaXParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaXParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JavaXParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(JavaXParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JavaXParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaXParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaXParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(JavaXParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JavaXParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JavaXParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(JavaXParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(JavaXParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(JavaXParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(JavaXParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JavaXParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JavaXParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaXParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(JavaXParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JavaXParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JavaXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaXParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(JavaXParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(JavaXParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_(JavaXParser.PostfixExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseNegateExpression}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNegateExpression(JavaXParser.BitwiseNegateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanNegateExpression}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanNegateExpression(JavaXParser.BooleanNegateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression_(JavaXParser.CastExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JavaXParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(JavaXParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(JavaXParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(JavaXParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(JavaXParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaXParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(JavaXParser.CastExpressionContext ctx);
}