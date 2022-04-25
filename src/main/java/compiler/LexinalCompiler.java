package compiler;

import gen.LexinalBaseVisitor;
import gen.LexinalParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import runtimeUtility.Constants;

import java.util.ArrayList;

public class LexinalCompiler extends LexinalBaseVisitor<Object> {

    private ArrayList<String> variableList = new ArrayList<>();
    private IntermediateCode intermediateCode = new IntermediateCode();

    public String getOutput() {
        return intermediateCode.getIntermediateCode();
    }

    public void addVariableToList(String namedVariable) {
        variableList.add(namedVariable);
    }

    public boolean doesVariableExist(String namedVariable) {
        return variableList.contains(namedVariable);
    }

    public void missingVariableError(String identifier){
        System.err.println("Compiletime error: Variable " +identifier+ " not defined. Did you forget to declare variable " + identifier + "?");
        System.exit(1);
    }

    @Override
    public Object visitProgram(LexinalParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitBlock(LexinalParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitCommand(LexinalParser.CommandContext ctx) {
        return super.visitCommand(ctx);
    }

    @Override
    public Object visitIntegerAssignment(LexinalParser.IntegerAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        if(ctx.getText().contains("int")) {
            addVariableToList(identifier);
        }
        else if(!doesVariableExist(identifier)) {
            missingVariableError(identifier);
        }

        if(ctx.EQUALS_TO() != null) {
            //if initialization and assignment done during declaration
            visit(ctx.num_expr());
            visit(ctx.ternary_expr());
        }
        else {
            //assign default value 0
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION +" " +
                    Constants.ACCUMULATOR_REGISTER + " " + Constants.DEFAULT_INT);
        }

        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION +" " +
                identifier + " " + Constants.ACCUMULATOR_REGISTER);

        return null;
    }

    @Override
    public Object visitBooleanAssignment(LexinalParser.BooleanAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        if(ctx.getText().contains("boolean")) {
            addVariableToList(identifier);
        }
        else if(!doesVariableExist(identifier)) {
            missingVariableError(identifier);
        }

        if(ctx.EQUALS_TO() != null) {
            //if initialization and assignment done during declaration
            visit(ctx.bool_expr());
            visit(ctx.ternary_expr());
        }
        else {
            //assign default value false
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION +" " +
                    Constants.ACCUMULATOR_REGISTER + " " + Constants.DEFAULT_BOOL);
        }

        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION +" " +
                identifier + " " + Constants.ACCUMULATOR_REGISTER);

        return null;
    }

    @Override
    public Object visitStringAssignment(LexinalParser.StringAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        if(ctx.getText().contains("string")) {
            addVariableToList(identifier);
        }
        else if(!doesVariableExist(identifier)) {
            missingVariableError(identifier);
        }

        if(ctx.EQUALS_TO() != null) {
            //if initialization and assignment done during declaration
            visit(ctx.VALID_STRING());
            visit(ctx.ternary_expr());
        }
        else {
            //assign default value ""
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION +" " +
                    Constants.ACCUMULATOR_REGISTER + " " + Constants.DEFAULT_STRING);
        }

        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION +" " +
                identifier + " " + Constants.ACCUMULATOR_REGISTER);

        return null;
    }

    @Override
    public Object visitExprs(LexinalParser.ExprsContext ctx) {
        visit(ctx.num_expr());
        visit(ctx.bool_expr());
        return null;
    }

    @Override
    public Object visitBooleanExpressionInBrackets(LexinalParser.BooleanExpressionInBracketsContext ctx) {
        visit(ctx.bool_expr());
        return null;
    }

    @Override
    public Object visitBooleanIdentifierOnlyExpression(LexinalParser.BooleanIdentifierOnlyExpressionContext ctx) {

        String identifier = ctx.IDENTIFIER().getText();

        if(doesVariableExist(identifier)) {
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER + " "  + identifier);
        }
        else {
            missingVariableError(identifier);
        }
        return null;
    }

    @Override
    public Object visitPrimitiveBooleanValuesOnly(LexinalParser.PrimitiveBooleanValuesOnlyContext ctx) {
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER +" "+ ctx.BOOLEAN().getText());
        return null;
    }

    @Override
    public Object visitBooleanLogicalExpression(LexinalParser.BooleanLogicalExpressionContext ctx) {

        visit(ctx.bool_expr(0));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.REGISTER_TWO + " "
                + Constants.ACCUMULATOR_REGISTER);
        visit(ctx.bool_expr(1));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.REGISTER_THREE + " "
                + Constants.ACCUMULATOR_REGISTER);

        switch (ctx.op.getType()) {
            case LexinalParser.AND -> intermediateCode.addIntermediateOutput(Constants.AND + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.OR -> intermediateCode.addIntermediateOutput(Constants.OR + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.IS_EQUL_TO -> intermediateCode.addIntermediateOutput(Constants.EQUAL_TO + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.NOT_EQUL_TO -> intermediateCode.addIntermediateOutput(Constants.NOT_EQUAL_TO + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
        }
        return null;
    }

    @Override
    public Object visitBooleanComparisonExpression(LexinalParser.BooleanComparisonExpressionContext ctx) {
        visit(ctx.comp_expr());
        return null;
    }

    @Override
    public Object visitNumberComparisonExpression(LexinalParser.NumberComparisonExpressionContext ctx) {
        visit(ctx.num_expr(0));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.REGISTER_TWO + " "
                + Constants.ACCUMULATOR_REGISTER);
        visit(ctx.num_expr(1));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.REGISTER_THREE + " "
                + Constants.ACCUMULATOR_REGISTER);

        //GREATER_THAN|LESS_THAN|MORE_THAN_OR_EQUL|LESS_THAN_OR_EQUL|IS_EQUL_TO|NOT_EQUL_TO
        switch (ctx.op.getType()) {
            case LexinalParser.GREATER_THAN -> intermediateCode.addIntermediateOutput(Constants.GT + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.LESS_THAN -> intermediateCode.addIntermediateOutput(Constants.LT + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.MORE_THAN_OR_EQUL -> intermediateCode.addIntermediateOutput(Constants.GTE + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.LESS_THAN_OR_EQUL -> intermediateCode.addIntermediateOutput(Constants.LTE + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.IS_EQUL_TO -> intermediateCode.addIntermediateOutput(Constants.EQUAL_TO + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
            case LexinalParser.NOT_EQUL_TO -> intermediateCode.addIntermediateOutput(Constants.NOT_EQUAL_TO + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_TWO + " "
                    + Constants.REGISTER_THREE);
        }
        return null;
    }

    @Override
    public Object visitNumberMultiplyDivideExpression(LexinalParser.NumberMultiplyDivideExpressionContext ctx) {
        return super.visitNumberMultiplyDivideExpression(ctx);
    }

    @Override
    public Object visitNumberIdentifierOnly(LexinalParser.NumberIdentifierOnlyContext ctx) {
        return super.visitNumberIdentifierOnly(ctx);
    }

    @Override
    public Object visitNumberBracketsExpression(LexinalParser.NumberBracketsExpressionContext ctx) {
        return super.visitNumberBracketsExpression(ctx);
    }

    @Override
    public Object visitNumberOnly(LexinalParser.NumberOnlyContext ctx) {
        return super.visitNumberOnly(ctx);
    }

    @Override
    public Object visitCond_expr(LexinalParser.Cond_exprContext ctx) {
        return super.visitCond_expr(ctx);
    }

    @Override
    public Object visitIf_expr(LexinalParser.If_exprContext ctx) {
        return super.visitIf_expr(ctx);
    }

    @Override
    public Object visitElse_if_expr(LexinalParser.Else_if_exprContext ctx) {
        return super.visitElse_if_expr(ctx);
    }

    @Override
    public Object visitElse_expr(LexinalParser.Else_exprContext ctx) {
        return super.visitElse_expr(ctx);
    }

    @Override
    public Object visitWhile_expr(LexinalParser.While_exprContext ctx) {
        return super.visitWhile_expr(ctx);
    }

    @Override
    public Object visitFor_enhanced(LexinalParser.For_enhancedContext ctx) {
        return super.visitFor_enhanced(ctx);
    }

    @Override
    public Object visitRangeVal(LexinalParser.RangeValContext ctx) {
        return super.visitRangeVal(ctx);
    }

    @Override
    public Object visitFor_loop(LexinalParser.For_loopContext ctx) {
        return super.visitFor_loop(ctx);
    }

    @Override
    public Object visitVariable_change_part(LexinalParser.Variable_change_partContext ctx) {
        return super.visitVariable_change_part(ctx);
    }

    @Override
    public Object visitDecrement_expression(LexinalParser.Decrement_expressionContext ctx) {
        return super.visitDecrement_expression(ctx);
    }

    @Override
    public Object visitIncrement_expression(LexinalParser.Increment_expressionContext ctx) {
        return super.visitIncrement_expression(ctx);
    }

    @Override
    public Object visitDecrement_operator(LexinalParser.Decrement_operatorContext ctx) {
        return super.visitDecrement_operator(ctx);
    }

    @Override
    public Object visitIncrement_operator(LexinalParser.Increment_operatorContext ctx) {
        return super.visitIncrement_operator(ctx);
    }

    @Override
    public Object visitAssignment_command(LexinalParser.Assignment_commandContext ctx) {
        return super.visitAssignment_command(ctx);
    }

    @Override
    public Object visitTernary_expr(LexinalParser.Ternary_exprContext ctx) {
        return super.visitTernary_expr(ctx);
    }

    @Override
    public Object visitPrint(LexinalParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
