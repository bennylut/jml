// Generated from /home/bennyl/IdeaProjects/test-antlr/src/main/java/antlr/JavaX.g4 by ANTLR 4.5.1
package com.github.bennyl.jml.javax.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaXParser}.
 */
public interface JavaXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaXParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaXParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaXParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaXParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaXParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaXParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaXParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JavaXParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JavaXParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JavaXParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JavaXParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JavaXParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JavaXParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaXParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaXParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaXParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaXParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaXParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaXParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JavaXParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JavaXParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaXParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaXParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaXParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaXParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaXParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaXParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JavaXParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JavaXParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaXParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaXParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JavaXParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JavaXParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaXParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaXParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JavaXParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JavaXParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaXParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaXParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JavaXParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JavaXParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JavaXParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JavaXParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaXParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaXParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaXParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaXParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JavaXParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JavaXParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaXParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaXParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JavaXParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JavaXParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaXParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaXParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaXParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaXParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JavaXParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JavaXParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaXParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaXParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JavaXParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JavaXParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JavaXParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JavaXParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JavaXParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JavaXParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JavaXParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JavaXParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaXParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaXParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaXParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaXParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JavaXParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JavaXParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JavaXParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JavaXParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaXParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaXParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JavaXParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JavaXParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(JavaXParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(JavaXParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(JavaXParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(JavaXParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JavaXParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JavaXParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaXParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaXParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaXParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaXParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaXParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaXParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaXParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaXParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JavaXParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JavaXParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JavaXParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JavaXParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaXParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaXParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaXParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaXParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaXParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaXParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(JavaXParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(JavaXParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primitiveTypeReferece}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveTypeReferece(JavaXParser.PrimitiveTypeRefereceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primitiveTypeReferece}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveTypeReferece(JavaXParser.PrimitiveTypeRefereceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#referenceTypeReference}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTypeReference(JavaXParser.ReferenceTypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#referenceTypeReference}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTypeReference(JavaXParser.ReferenceTypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classOrInterfaceTypeReference}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeReference(JavaXParser.ClassOrInterfaceTypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classOrInterfaceTypeReference}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeReference(JavaXParser.ClassOrInterfaceTypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classOrInterfaceTypeReferenceSimple}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeReferenceSimple(JavaXParser.ClassOrInterfaceTypeReferenceSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classOrInterfaceTypeReferenceSimple}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeReferenceSimple(JavaXParser.ClassOrInterfaceTypeReferenceSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classTypeReferenceAnnotated}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeReferenceAnnotated(JavaXParser.ClassTypeReferenceAnnotatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classTypeReferenceAnnotated}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeReferenceAnnotated(JavaXParser.ClassTypeReferenceAnnotatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classTypeReference}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeReference(JavaXParser.ClassTypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classTypeReference}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeReference(JavaXParser.ClassTypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeVariableReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableReference(JavaXParser.TypeVariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeVariableReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableReference(JavaXParser.TypeVariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#arrayTypeReference}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeReference(JavaXParser.ArrayTypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#arrayTypeReference}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeReference(JavaXParser.ArrayTypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaXParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaXParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JavaXParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JavaXParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaXParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaXParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaXParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaXParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaXParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaXParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodParameterList}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameterList(JavaXParser.MethodParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodParameterList}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameterList(JavaXParser.MethodParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameters(JavaXParser.MethodParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameters(JavaXParser.MethodParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(JavaXParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(JavaXParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#variadicMethodParameter}.
	 * @param ctx the parse tree
	 */
	void enterVariadicMethodParameter(JavaXParser.VariadicMethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#variadicMethodParameter}.
	 * @param ctx the parse tree
	 */
	void exitVariadicMethodParameter(JavaXParser.VariadicMethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaXParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaXParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaXParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaXParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JavaXParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JavaXParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JavaXParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JavaXParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JavaXParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JavaXParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaXParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaXParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JavaXParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JavaXParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(JavaXParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(JavaXParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaXParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaXParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JavaXParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JavaXParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JavaXParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JavaXParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JavaXParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JavaXParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JavaXParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JavaXParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JavaXParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JavaXParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaXParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaXParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JavaXParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JavaXParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JavaXParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JavaXParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaXParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaXParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JavaXParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JavaXParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaXParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaXParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaXParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaXParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JavaXParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JavaXParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JavaXParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JavaXParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JavaXParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JavaXParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaXParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaXParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaXParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaXParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JavaXParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JavaXParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JavaXParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JavaXParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaXParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaXParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaXParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaXParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaXParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaXParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaXParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaXParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JavaXParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JavaXParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaXParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaXParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(JavaXParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(JavaXParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaXParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaXParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaXParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaXParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JavaXParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JavaXParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JavaXParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JavaXParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaXParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaXParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaXParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaXParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaXParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaXParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JavaXParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JavaXParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JavaXParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JavaXParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JavaXParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JavaXParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaXParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaXParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JavaXParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JavaXParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaXParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaXParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JavaXParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JavaXParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaXParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaXParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaXParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaXParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaXParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaXParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaXParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaXParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JavaXParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JavaXParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JavaXParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JavaXParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaXParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaXParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JavaXParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JavaXParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(JavaXParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(JavaXParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaXParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaXParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaXParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaXParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JavaXParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JavaXParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(JavaXParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(JavaXParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(JavaXParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(JavaXParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(JavaXParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(JavaXParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaXParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaXParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JavaXParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JavaXParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaXParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaXParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JavaXParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JavaXParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaXParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaXParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JavaXParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JavaXParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaXParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaXParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(JavaXParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(JavaXParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JavaXParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JavaXParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaXParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaXParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JavaXParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JavaXParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JavaXParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JavaXParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(JavaXParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(JavaXParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaXParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaXParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaXParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaXParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JavaXParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JavaXParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JavaXParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JavaXParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(JavaXParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(JavaXParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaXParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaXParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaXParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaXParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaXParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaXParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JavaXParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JavaXParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JavaXParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JavaXParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JavaXParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JavaXParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JavaXParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JavaXParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaXParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaXParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(JavaXParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(JavaXParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaXParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaXParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(JavaXParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(JavaXParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(JavaXParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(JavaXParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaXParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaXParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JavaXParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JavaXParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaXParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaXParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaXParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaXParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(JavaXParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(JavaXParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(JavaXParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(JavaXParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaXParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaXParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(JavaXParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(JavaXParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaXParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaXParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaXParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaXParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(JavaXParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(JavaXParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(JavaXParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(JavaXParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaXParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaXParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JavaXParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JavaXParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(JavaXParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(JavaXParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(JavaXParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(JavaXParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavaXParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavaXParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(JavaXParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(JavaXParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(JavaXParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(JavaXParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#simpleMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMethodInvocation(JavaXParser.SimpleMethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#simpleMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMethodInvocation(JavaXParser.SimpleMethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#referencedMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterReferencedMethodInvocation(JavaXParser.ReferencedMethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#referencedMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitReferencedMethodInvocation(JavaXParser.ReferencedMethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noPrimaryMethodInvocation_}
	 * labeled alternative in {@link JavaXParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterNoPrimaryMethodInvocation_(JavaXParser.NoPrimaryMethodInvocation_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code noPrimaryMethodInvocation_}
	 * labeled alternative in {@link JavaXParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitNoPrimaryMethodInvocation_(JavaXParser.NoPrimaryMethodInvocation_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryMethodInvocation}
	 * labeled alternative in {@link JavaXParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryMethodInvocation(JavaXParser.PrimaryMethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryMethodInvocation}
	 * labeled alternative in {@link JavaXParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryMethodInvocation(JavaXParser.PrimaryMethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleMethodInvocation_}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleMethodInvocation_(JavaXParser.SimpleMethodInvocation_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleMethodInvocation_}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleMethodInvocation_(JavaXParser.SimpleMethodInvocation_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code staticReferencedMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterStaticReferencedMethodInvocation(JavaXParser.StaticReferencedMethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticReferencedMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitStaticReferencedMethodInvocation(JavaXParser.StaticReferencedMethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionReferencedMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionReferencedMethodInvocation(JavaXParser.ExpressionReferencedMethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionReferencedMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionReferencedMethodInvocation(JavaXParser.ExpressionReferencedMethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterSuperMethodInvocation(JavaXParser.SuperMethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitSuperMethodInvocation(JavaXParser.SuperMethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticSuperMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterStaticSuperMethodInvocation(JavaXParser.StaticSuperMethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticSuperMethodInvocation}
	 * labeled alternative in {@link JavaXParser#noPrimaryMethodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitStaticSuperMethodInvocation(JavaXParser.StaticSuperMethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaXParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaXParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JavaXParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JavaXParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(JavaXParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(JavaXParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(JavaXParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(JavaXParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JavaXParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JavaXParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JavaXParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JavaXParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JavaXParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JavaXParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JavaXParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JavaXParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaXParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaXParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaXParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaXParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaXParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaXParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(JavaXParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(JavaXParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaXParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaXParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaXParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaXParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaXParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaXParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaXParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaXParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaXParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaXParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaXParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaXParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JavaXParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JavaXParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JavaXParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JavaXParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JavaXParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JavaXParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JavaXParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JavaXParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JavaXParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JavaXParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaXParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaXParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaXParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaXParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JavaXParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JavaXParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaXParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaXParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JavaXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JavaXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaXParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaXParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JavaXParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JavaXParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JavaXParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JavaXParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_(JavaXParser.PostfixExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_(JavaXParser.PostfixExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseNegateExpression}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNegateExpression(JavaXParser.BitwiseNegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseNegateExpression}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNegateExpression(JavaXParser.BitwiseNegateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanNegateExpression}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNegateExpression(JavaXParser.BooleanNegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanNegateExpression}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNegateExpression(JavaXParser.BooleanNegateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression_(JavaXParser.CastExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link JavaXParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression_(JavaXParser.CastExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JavaXParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JavaXParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JavaXParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JavaXParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(JavaXParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(JavaXParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JavaXParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JavaXParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(JavaXParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(JavaXParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaXParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JavaXParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaXParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JavaXParser.CastExpressionContext ctx);
}