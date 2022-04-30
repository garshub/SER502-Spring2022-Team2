// Generated from C:/Users/gargs/OneDrive - Arizona State University/Desktop/Stuff/Class Stuff/SER 502/Project/Project_Workspace/src/main/antlr\Lexinal.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexinalParser}.
 */
public interface LexinalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexinalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LexinalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LexinalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LexinalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LexinalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LexinalParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LexinalParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAssignment(LexinalParser.IntegerAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAssignment(LexinalParser.IntegerAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAssignment(LexinalParser.BooleanAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAssignment(LexinalParser.BooleanAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignment(LexinalParser.StringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link LexinalParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignment(LexinalParser.StringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(LexinalParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(LexinalParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpressionInBrackets}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionInBrackets(LexinalParser.BooleanExpressionInBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpressionInBrackets}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionInBrackets(LexinalParser.BooleanExpressionInBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanIdentifierOnlyExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanIdentifierOnlyExpression(LexinalParser.BooleanIdentifierOnlyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanIdentifierOnlyExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanIdentifierOnlyExpression(LexinalParser.BooleanIdentifierOnlyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveBooleanValuesOnly}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveBooleanValuesOnly(LexinalParser.PrimitiveBooleanValuesOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveBooleanValuesOnly}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveBooleanValuesOnly(LexinalParser.PrimitiveBooleanValuesOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLogicalExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLogicalExpression(LexinalParser.BooleanLogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLogicalExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLogicalExpression(LexinalParser.BooleanLogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanComparisonExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanComparisonExpression(LexinalParser.BooleanComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanComparisonExpression}
	 * labeled alternative in {@link LexinalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanComparisonExpression(LexinalParser.BooleanComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberComparisonExpression}
	 * labeled alternative in {@link LexinalParser#comp_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberComparisonExpression(LexinalParser.NumberComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberComparisonExpression}
	 * labeled alternative in {@link LexinalParser#comp_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberComparisonExpression(LexinalParser.NumberComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberMultiplyDivideExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberMultiplyDivideExpression(LexinalParser.NumberMultiplyDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberMultiplyDivideExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberMultiplyDivideExpression(LexinalParser.NumberMultiplyDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberIdentifierOnly}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberIdentifierOnly(LexinalParser.NumberIdentifierOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberIdentifierOnly}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberIdentifierOnly(LexinalParser.NumberIdentifierOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberBracketsExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberBracketsExpression(LexinalParser.NumberBracketsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberBracketsExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberBracketsExpression(LexinalParser.NumberBracketsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberOnly}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberOnly(LexinalParser.NumberOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberOnly}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberOnly(LexinalParser.NumberOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAddSubExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberAddSubExpression(LexinalParser.NumberAddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAddSubExpression}
	 * labeled alternative in {@link LexinalParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberAddSubExpression(LexinalParser.NumberAddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterCond_expr(LexinalParser.Cond_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitCond_expr(LexinalParser.Cond_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(LexinalParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(LexinalParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#else_if_expr}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_expr(LexinalParser.Else_if_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#else_if_expr}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_expr(LexinalParser.Else_if_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#else_expr}.
	 * @param ctx the parse tree
	 */
	void enterElse_expr(LexinalParser.Else_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#else_expr}.
	 * @param ctx the parse tree
	 */
	void exitElse_expr(LexinalParser.Else_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expr(LexinalParser.While_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expr(LexinalParser.While_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#for_enhanced}.
	 * @param ctx the parse tree
	 */
	void enterFor_enhanced(LexinalParser.For_enhancedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#for_enhanced}.
	 * @param ctx the parse tree
	 */
	void exitFor_enhanced(LexinalParser.For_enhancedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#rangeVal}.
	 * @param ctx the parse tree
	 */
	void enterRangeVal(LexinalParser.RangeValContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#rangeVal}.
	 * @param ctx the parse tree
	 */
	void exitRangeVal(LexinalParser.RangeValContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(LexinalParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(LexinalParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#variable_change_part}.
	 * @param ctx the parse tree
	 */
	void enterVariable_change_part(LexinalParser.Variable_change_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#variable_change_part}.
	 * @param ctx the parse tree
	 */
	void exitVariable_change_part(LexinalParser.Variable_change_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#decrement_expression}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_expression(LexinalParser.Decrement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#decrement_expression}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_expression(LexinalParser.Decrement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#increment_expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_expression(LexinalParser.Increment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#increment_expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_expression(LexinalParser.Increment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#ternary_expr}.
	 * @param ctx the parse tree
	 */
	void enterTernary_expr(LexinalParser.Ternary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#ternary_expr}.
	 * @param ctx the parse tree
	 */
	void exitTernary_expr(LexinalParser.Ternary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexinalParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LexinalParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexinalParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LexinalParser.PrintContext ctx);
}