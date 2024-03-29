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

    public void missingVariableError(String identifier) {
        System.err.println("Compiletime error: Variable " + identifier + " not defined. Did you forget to declare variable " + identifier + "?");
        System.exit(1);
    }

    @Override
    public Object visitProgram(LexinalParser.ProgramContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitBlock(LexinalParser.BlockContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitCommand(LexinalParser.CommandContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitIntegerAssignment(LexinalParser.IntegerAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        if (ctx.getText().contains("int")) {
            addVariableToList(identifier);
        } else if (!doesVariableExist(identifier)) {
            missingVariableError(identifier);
        }

        if (ctx.EQUALS_TO() != null) {
            //if initialization done during declaration
            if (ctx.getText().contains("?") && ctx.getText().contains(":")) {
                visit(ctx.ternary_expr());
            } else {
                visit(ctx.num_expr());
            }
        } else {
            //assign default value 0
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                    Constants.ACCUMULATOR_REGISTER + " " + Constants.DEFAULT_INT);
        }

        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                identifier + " " + Constants.ACCUMULATOR_REGISTER);

        return null;
    }

    @Override
    public Object visitBooleanAssignment(LexinalParser.BooleanAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        if (ctx.getText().contains("boolean")) {
            addVariableToList(identifier);
        } else if (!doesVariableExist(identifier)) {
            missingVariableError(identifier);
        }

        if (ctx.EQUALS_TO() != null) {
            //if initialization and assignment done during declaration
            if (ctx.getText().contains("?") && ctx.getText().contains(":")) {
                visit(ctx.ternary_expr());
            } else {
                visit(ctx.bool_expr());
            }
        } else {
            //assign default value false
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                    Constants.ACCUMULATOR_REGISTER + " " + Constants.DEFAULT_BOOL);
        }

        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                identifier + " " + Constants.ACCUMULATOR_REGISTER);

        return null;
    }

    @Override
    public Object visitStringAssignment(LexinalParser.StringAssignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        if (ctx.getText().contains("string")) {
            addVariableToList(identifier);
        } else if (!doesVariableExist(identifier)) {
            missingVariableError(identifier);
        }

        if (ctx.EQUALS_TO() != null) {
            //if initialization and assignment done during declaration
            if (ctx.getText().contains("?") && ctx.getText().contains(":")) {
                visit(ctx.ternary_expr());
            } else {
                //visit(ctx.VALID_STRING());
                intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                        Constants.ACCUMULATOR_REGISTER + " " + ctx.VALID_STRING().getText());
            }
        } else {
            //assign default value ""
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                    Constants.ACCUMULATOR_REGISTER + " " + Constants.DEFAULT_STRING);
        }

        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
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

        if (doesVariableExist(identifier)) {
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER + " " + identifier);
        } else {
            missingVariableError(identifier);
        }
        return null;
    }

    @Override
    public Object visitPrimitiveBooleanValuesOnly(LexinalParser.PrimitiveBooleanValuesOnlyContext ctx) {
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER + " " + ctx.BOOLEAN().getText());
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
                + Constants.REGISTER_THREE+ " "
                + Constants.ACCUMULATOR_REGISTER);
        visit(ctx.num_expr(1));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.REGISTER_FOUR + " "
                + Constants.ACCUMULATOR_REGISTER);

        //GREATER_THAN|LESS_THAN|MORE_THAN_OR_EQUL|LESS_THAN_OR_EQUL|IS_EQUL_TO|NOT_EQUL_TO
        switch (ctx.op.getType()) {
            case LexinalParser.GREATER_THAN -> intermediateCode.addIntermediateOutput(Constants.GT + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_THREE + " "
                    + Constants.REGISTER_FOUR);
            case LexinalParser.LESS_THAN -> intermediateCode.addIntermediateOutput(Constants.LT + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_THREE + " "
                    + Constants.REGISTER_FOUR);
            case LexinalParser.MORE_THAN_OR_EQUL -> intermediateCode.addIntermediateOutput(Constants.GTE + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_THREE + " "
                    + Constants.REGISTER_FOUR);
            case LexinalParser.LESS_THAN_OR_EQUL -> intermediateCode.addIntermediateOutput(Constants.LTE + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_THREE + " "
                    + Constants.REGISTER_FOUR);
            case LexinalParser.IS_EQUL_TO -> intermediateCode.addIntermediateOutput(Constants.EQUAL_TO + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_THREE + " "
                    + Constants.REGISTER_FOUR);
            case LexinalParser.NOT_EQUL_TO -> intermediateCode.addIntermediateOutput(Constants.NOT_EQUAL_TO + " "
                    + Constants.ACCUMULATOR_REGISTER + " "
                    + Constants.REGISTER_THREE + " "
                    + Constants.REGISTER_FOUR);
        }
        return null;
    }

    @Override
    public Object visitNumberMultiplyDivideExpression(LexinalParser.NumberMultiplyDivideExpressionContext ctx) {

        int tree1 = 0;
        int tree2 = 1;

        String reg1 = Constants.REGISTER_TWO;
        String reg2 = Constants.REGISTER_THREE;

        if(ctx.num_expr(1).getChildCount() > ctx.num_expr(0).getChildCount()) {
            tree1 = 1; tree2 = 0;
        }

        if(!((ctx.num_expr(1).getChildCount() > 2) && (ctx.num_expr(0).getChildCount() > 2))) {
            reg1 = Constants.REGISTER_THREE;
            reg2 = Constants.REGISTER_FOUR;
        }

        visit(ctx.num_expr(tree1));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + reg1 + " " + Constants.ACCUMULATOR_REGISTER);
        visit(ctx.num_expr(tree2));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + reg2 + " " + Constants.ACCUMULATOR_REGISTER);

        switch (ctx.op.getType()) {
            case LexinalParser.MUL -> intermediateCode.addIntermediateOutput(Constants.MULTIPLICATION + " "
                    + Constants.ACCUMULATOR_REGISTER + " " + reg1 + " " + reg2);
            case LexinalParser.DIV -> intermediateCode.addIntermediateOutput(Constants.DIVISION + " "
                    + Constants.ACCUMULATOR_REGISTER + " " + reg1 + " " + reg2);
        }

        return null;
    }

    @Override
    public Object visitNumberAddSubExpression(LexinalParser.NumberAddSubExpressionContext ctx) {

        int tree1 = 0;
        int tree2 = 1;

        String reg1 = Constants.REGISTER_TWO;
        String reg2 = Constants.REGISTER_THREE;

        if(ctx.num_expr(1).getChildCount() > ctx.num_expr(0).getChildCount()) {
            tree1 = 1; tree2 = 0;
        }

        if(!((ctx.num_expr(1).getChildCount() > 2) && (ctx.num_expr(0).getChildCount() > 2))) {
            reg1 = Constants.REGISTER_THREE;
            reg2 = Constants.REGISTER_FOUR;
        }

        visit(ctx.num_expr(tree1));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + reg1 + " " + Constants.ACCUMULATOR_REGISTER);
        visit(ctx.num_expr(tree2));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + reg2 + " " + Constants.ACCUMULATOR_REGISTER);

        switch (ctx.op.getType()) {
            case LexinalParser.ADD -> intermediateCode.addIntermediateOutput(Constants.ADDITION + " "
                    + Constants.ACCUMULATOR_REGISTER + " " + reg1 + " " + reg2);
            case LexinalParser.SUB -> intermediateCode.addIntermediateOutput(Constants.SUBTRACTION + " "
                    + Constants.ACCUMULATOR_REGISTER + " " + reg1 + " " + reg2);
        }
        return null;
    }

    @Override
    public Object visitNumberIdentifierOnly(LexinalParser.NumberIdentifierOnlyContext ctx) {

        String identifier = ctx.IDENTIFIER().getText();

        if (doesVariableExist(identifier)) {
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER + " " + identifier);
            if (ctx.SUB() != null) {
                intermediateCode.addIntermediateOutput(Constants.UNARY_MINUS + " " + Constants.ACCUMULATOR_REGISTER);
            }
        } else {
            missingVariableError(identifier);
        }

        return null;
    }

    @Override
    public Object visitNumberBracketsExpression(LexinalParser.NumberBracketsExpressionContext ctx) {
        visit(ctx.num_expr());
        return null;
    }

    @Override
    public Object visitNumberOnly(LexinalParser.NumberOnlyContext ctx) {

        if (ctx.DIGITS() != null && ctx.DIGITS().getText() != null) {
            String value = ctx.DIGITS().getText();
            int intVal = Integer.parseInt(value);
            if (ctx.SUB() != null) {
                intVal *= -1;
            }
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER + " " + intVal);
        }

        return null;
    }

    @Override
    public Object visitCond_expr(LexinalParser.Cond_exprContext ctx) {
        intermediateCode.addIntermediateOutput(Constants.CONDITION_START);
        visit(ctx.bool_expr());
        intermediateCode.addIntermediateOutput(Constants.CONDITION_END);
        return null;
    }

    @Override
    public Object visitIf_expr(LexinalParser.If_exprContext ctx) {

        intermediateCode.addIntermediateOutput(Constants.IF_ELSE_START);
        intermediateCode.addIntermediateOutput(Constants.IF_START);
        visit(ctx.cond_expr());
        visit(ctx.block());
        intermediateCode.addIntermediateOutput(Constants.IF_END);
        for (int i = 0; i < ctx.else_if_expr().size(); i++) {
            visit(ctx.else_if_expr(i));
        }
        if (ctx.else_expr() != null) {
            visit(ctx.else_expr());
        }
        intermediateCode.addIntermediateOutput(Constants.IF_ELSE_END);

        return null;
    }

    @Override
    public Object visitElse_if_expr(LexinalParser.Else_if_exprContext ctx) {
        intermediateCode.addIntermediateOutput(Constants.ELSE_IF_START);
        visit(ctx.cond_expr());
        visit(ctx.block());
        intermediateCode.addIntermediateOutput(Constants.ELSE_IF_END);
        return null;
    }

    @Override
    public Object visitElse_expr(LexinalParser.Else_exprContext ctx) {
        intermediateCode.addIntermediateOutput(Constants.ELSE_START);
        visit(ctx.block());
        intermediateCode.addIntermediateOutput(Constants.ELSE_END);
        return null;
    }

    @Override
    public Object visitWhile_expr(LexinalParser.While_exprContext ctx) {
        intermediateCode.addIntermediateOutput(Constants.WHILE_START);
        visit(ctx.cond_expr());
        visit(ctx.block());
        intermediateCode.addIntermediateOutput(Constants.WHILE_END);
        return null;
    }

    @Override
    public Object visitFor_enhanced(LexinalParser.For_enhancedContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        addVariableToList(identifier);
        visit(ctx.rangeVal(0));
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + identifier + " " + Constants.ACCUMULATOR_REGISTER);
        intermediateCode.addIntermediateOutput(Constants.FOR_START);
        intermediateCode.addIntermediateOutput(Constants.CONDITION_START);

        String maxRange;
        if(ctx.rangeVal(1).IDENTIFIER() != null){
            maxRange = ctx.rangeVal(1).IDENTIFIER().getText();
        } else {
            maxRange = ctx.rangeVal(1).DIGITS().getText();
        }
        updateIdentifierInFor(Constants.LT, identifier, maxRange);
        intermediateCode.addIntermediateOutput(Constants.CONDITION_END);
        updateIdentifierInFor(Constants.ADDITION, ctx.IDENTIFIER().getText(), "1");
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                ctx.IDENTIFIER().getText() + " " + Constants.ACCUMULATOR_REGISTER);
        visit(ctx.block());
        intermediateCode.addIntermediateOutput(Constants.FOR_END);

        return null;
    }

    @Override
    public Object visitRangeVal(LexinalParser.RangeValContext ctx) {
        String value = "0";
        if(ctx.DIGITS() != null){
            value = ctx.DIGITS().getText();
        } else if (ctx.IDENTIFIER() != null){
            value = ctx.IDENTIFIER().getText();
        }

        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.ACCUMULATOR_REGISTER + " " + value);
        return null;
    }

    @Override
    public Object visitFor_loop(LexinalParser.For_loopContext ctx) {
        visit(ctx.assignment_expr());
        intermediateCode.addIntermediateOutput(Constants.FOR_START);
        intermediateCode.addIntermediateOutput(Constants.CONDITION_START);
        visit(ctx.bool_expr());
        intermediateCode.addIntermediateOutput(Constants.CONDITION_END);
        visit(ctx.block());
        visit(ctx.variable_change_part());
        intermediateCode.addIntermediateOutput(Constants.FOR_END);
        return null;
    }

    @Override
    public Object visitVariable_change_part(LexinalParser.Variable_change_partContext ctx) {
        if (ctx.increment_expression() != null) {
            visit(ctx.increment_expression());
        } else if (ctx.decrement_expression() != null) {
            visit(ctx.decrement_expression());
        } else if (ctx.num_expr() != null) {
            visit(ctx.num_expr());
        }

        return null;
    }

    public void updateIdentifierInFor(String operation, String identifier, String constant){
        //load ACC i
        //load E ACC
        //load ACC 1
        //load F ACC
        //Operation ACC E F
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                Constants.ACCUMULATOR_REGISTER  + " " + identifier);
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.REGISTER_FOUR + " " + Constants.ACCUMULATOR_REGISTER);
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.ACCUMULATOR_REGISTER + " " + constant);
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                + Constants.REGISTER_FIVE + " " + Constants.ACCUMULATOR_REGISTER);
        intermediateCode.addIntermediateOutput(operation + " " + Constants.ACCUMULATOR_REGISTER + " "
                + Constants.REGISTER_FOUR + " " + Constants.REGISTER_FIVE);
    }

    @Override
    public Object visitDecrement_expression(LexinalParser.Decrement_expressionContext ctx) {
        updateIdentifierInFor(Constants.SUBTRACTION, ctx.IDENTIFIER().getText(), "1");
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                ctx.IDENTIFIER().getText() + " " + Constants.ACCUMULATOR_REGISTER);
        return null;
    }

    @Override
    public Object visitIncrement_expression(LexinalParser.Increment_expressionContext ctx) {
        updateIdentifierInFor(Constants.ADDITION, ctx.IDENTIFIER().getText(), "1");
        intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " " +
                ctx.IDENTIFIER().getText() + " " + Constants.ACCUMULATOR_REGISTER);
        return null;
    }

    @Override
    public Object visitTernary_expr(LexinalParser.Ternary_exprContext ctx) {

        intermediateCode.addIntermediateOutput(Constants.IF_ELSE_START);
        intermediateCode.addIntermediateOutput(Constants.IF_START);
        visit(ctx.cond_expr());
        // block1
        ternaryBlock(ctx, 0);
        intermediateCode.addIntermediateOutput(Constants.IF_END);
        intermediateCode.addIntermediateOutput(Constants.ELSE_START);
        //block2
        ternaryBlock(ctx, 1);
        intermediateCode.addIntermediateOutput(Constants.ELSE_END);
        intermediateCode.addIntermediateOutput(Constants.IF_ELSE_END);
        return null;
    }

    public void ternaryBlock(LexinalParser.Ternary_exprContext ctx, int index){
        if (ctx.exprs(index) != null){
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                    + Constants.ACCUMULATOR_REGISTER + " " +ctx.exprs(index).getText());
        } else if (ctx.BOOLEAN(index) != null){
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                    + Constants.ACCUMULATOR_REGISTER + " " +ctx.BOOLEAN(index).getText());
        } else if (ctx.VALID_STRING(index) != null){
            intermediateCode.addIntermediateOutput(Constants.STORE_INSTRUCTION + " "
                    + Constants.ACCUMULATOR_REGISTER + " " +ctx.VALID_STRING(index).getText());
        }
    }

    @Override
    public Object visitPrint(LexinalParser.PrintContext ctx) {
        //: 'print' '(' (DIGITS|BOOLEAN|IDENTIFIER|num_expr|bool_expr|VALID_STRING) ')'
        //    | 'print' '(' VALID_STRING ',' (IDENTIFIER|BOOLEAN|VALID_STRING|DIGITS) ')'

        if (ctx.VALID_STRING() != null) {
            if (ctx.getText().contains(",") && ctx.IDENTIFIER() != null) {
                visit(ctx.VALID_STRING(0));
                intermediateCode.addIntermediateOutput(Constants.WRITE_INSTRUCTION + " " + ctx.VALID_STRING(0).getText());
            } else if (ctx.VALID_STRING(0) != null) {
                intermediateCode.addIntermediateOutput(Constants.WRITE_INSTRUCTION + " " + ctx.VALID_STRING(0).getText());
            }
        }

        if (ctx.IDENTIFIER() != null) {
            if (doesVariableExist(ctx.IDENTIFIER().getText())) {
                intermediateCode.addIntermediateOutput(Constants.WRITE_INSTRUCTION + " " + ctx.IDENTIFIER().getText());
            } else {
                missingVariableError(ctx.IDENTIFIER().getText());
            }
        } else if (ctx.DIGITS() != null) {
            intermediateCode.addIntermediateOutput(Constants.WRITE_INSTRUCTION + " " + ctx.DIGITS().getText());
        } else if (ctx.BOOLEAN() != null) {
            intermediateCode.addIntermediateOutput(Constants.WRITE_INSTRUCTION + " " + ctx.BOOLEAN().getText());
        } else if (ctx.num_expr() != null) {
            visit(ctx.num_expr());
            intermediateCode.addIntermediateOutput(Constants.WRITE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER);
        } else if (ctx.bool_expr() != null) {
            visit(ctx.bool_expr());
            intermediateCode.addIntermediateOutput(Constants.WRITE_INSTRUCTION + " " + Constants.ACCUMULATOR_REGISTER);
        }

        return null;
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
