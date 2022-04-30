// Generated from C:/Users/gargs/OneDrive - Arizona State University/Desktop/Stuff/Class Stuff/SER 502/Project/Project_Workspace/src/main/antlr\Lexinal.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexinalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexinalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexinalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LexinalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LexinalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(LexinalParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAssignment(LexinalParser.IntegerAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAssignment(LexinalParser.BooleanAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(LexinalParser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(LexinalParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpressionInBrackets}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionInBrackets(LexinalParser.BooleanExpressionInBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanIdentifierOnlyExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanIdentifierOnlyExpression(LexinalParser.BooleanIdentifierOnlyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveBooleanValuesOnly}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveBooleanValuesOnly(LexinalParser.PrimitiveBooleanValuesOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLogicalExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLogicalExpression(LexinalParser.BooleanLogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanComparisonExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanComparisonExpression(LexinalParser.BooleanComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberComparisonExpression}
	 * labeled alternative in {@link LexinalParser#comp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberComparisonExpression(LexinalParser.NumberComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberMultiplyDivideExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberMultiplyDivideExpression(LexinalParser.NumberMultiplyDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberIdentifierOnly}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberIdentifierOnly(LexinalParser.NumberIdentifierOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberBracketsExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBracketsExpression(LexinalParser.NumberBracketsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberOnly}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOnly(LexinalParser.NumberOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAddSubExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAddSubExpression(LexinalParser.NumberAddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#cond_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expr(LexinalParser.Cond_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#if_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expr(LexinalParser.If_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#else_if_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_expr(LexinalParser.Else_if_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#else_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_expr(LexinalParser.Else_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#while_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_expr(LexinalParser.While_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#for_enhanced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_enhanced(LexinalParser.For_enhancedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#rangeVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeVal(LexinalParser.RangeValContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(LexinalParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#variable_change_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_change_part(LexinalParser.Variable_change_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#decrement_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement_expression(LexinalParser.Decrement_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#increment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_expression(LexinalParser.Increment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#ternary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_expr(LexinalParser.Ternary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexinalParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LexinalParser.PrintContext ctx);
}