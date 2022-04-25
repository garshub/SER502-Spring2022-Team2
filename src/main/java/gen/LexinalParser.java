package gen;
// Generated from C:/Users/gargs/OneDrive - Arizona State University/Desktop/Stuff/Class Stuff/SER 502/Project/Project_Workspace/src/main/antlr\Lexinal.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexinalParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.10", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, DIGITS = 26, BOOLEAN = 27, ADD = 28, SUB = 29, MUL = 30, DIV = 31, AND = 32,
            OR = 33, LESS_THAN = 34, GREATER_THAN = 35, LESS_THAN_OR_EQUL = 36, MORE_THAN_OR_EQUL = 37,
            NOT_EQUL_TO = 38, IS_EQUL_TO = 39, IDENTIFIER = 40, VALID_STRING = 41, EQUALS_TO = 42,
            WHITE_SPACES = 43, Comment = 44;
    public static final int
            RULE_program = 0, RULE_block = 1, RULE_command = 2, RULE_assignment_expr = 3,
            RULE_exprs = 4, RULE_bool_expr = 5, RULE_comp_expr = 6, RULE_num_expr = 7,
            RULE_cond_expr = 8, RULE_if_expr = 9, RULE_else_if_expr = 10, RULE_else_expr = 11,
            RULE_while_expr = 12, RULE_for_enhanced = 13, RULE_rangeVal = 14, RULE_for_loop = 15,
            RULE_variable_change_part = 16, RULE_decrement_expression = 17, RULE_increment_expression = 18,
            RULE_decrement_operator = 19, RULE_increment_operator = 20, RULE_assignment_command = 21,
            RULE_ternary_expr = 22, RULE_print = 23;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "block", "command", "assignment_expr", "exprs", "bool_expr",
                "comp_expr", "num_expr", "cond_expr", "if_expr", "else_if_expr", "else_expr",
                "while_expr", "for_enhanced", "rangeVal", "for_loop", "variable_change_part",
                "decrement_expression", "increment_expression", "decrement_operator",
                "increment_operator", "assignment_command", "ternary_expr", "print"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'{'", "'}'", "'int'", "'boolean'", "'string'", "'('", "')'", "'if'",
                "'end-if'", "'elseIf'", "'end-elseIf'", "'else'", "'end-else'", "'while'",
                "'end-while'", "'for'", "'in'", "'range'", "';'", "'end-for'", "'--'",
                "'++'", "'?'", "':'", "'print'", null, null, "'+'", "'-'", "'*'", "'/'",
                "'and'", "'or'", "'<'", "'>'", "'<='", "'>='", "'not'", "'=='", null,
                null, "'='"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, "DIGITS", "BOOLEAN", "ADD", "SUB", "MUL", "DIV", "AND", "OR",
                "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUL", "MORE_THAN_OR_EQUL",
                "NOT_EQUL_TO", "IS_EQUL_TO", "IDENTIFIER", "VALID_STRING", "EQUALS_TO",
                "WHITE_SPACES", "Comment"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Lexinal.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public LexinalParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgramContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(48);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockContext extends ParserRuleContext {
        public List<CommandContext> command() {
            return getRuleContexts(CommandContext.class);
        }

        public CommandContext command(int i) {
            return getRuleContext(CommandContext.class, i);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(50);
                match(T__0);
                setState(52);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(51);
                            command();
                        }
                    }
                    setState(54);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__13) | (1L << T__15) | (1L << T__24) | (1L << IDENTIFIER))) != 0));
                setState(56);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CommandContext extends ParserRuleContext {
        public If_exprContext if_expr() {
            return getRuleContext(If_exprContext.class, 0);
        }

        public While_exprContext while_expr() {
            return getRuleContext(While_exprContext.class, 0);
        }

        public For_enhancedContext for_enhanced() {
            return getRuleContext(For_enhancedContext.class, 0);
        }

        public For_loopContext for_loop() {
            return getRuleContext(For_loopContext.class, 0);
        }

        public PrintContext print() {
            return getRuleContext(PrintContext.class, 0);
        }

        public Assignment_exprContext assignment_expr() {
            return getRuleContext(Assignment_exprContext.class, 0);
        }

        public CommandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterCommand(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitCommand(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitCommand(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CommandContext command() throws RecognitionException {
        CommandContext _localctx = new CommandContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(64);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                    case 1: {
                        setState(58);
                        if_expr();
                    }
                    break;
                    case 2: {
                        setState(59);
                        while_expr();
                    }
                    break;
                    case 3: {
                        setState(60);
                        for_enhanced();
                    }
                    break;
                    case 4: {
                        setState(61);
                        for_loop();
                    }
                    break;
                    case 5: {
                        setState(62);
                        print();
                    }
                    break;
                    case 6: {
                        setState(63);
                        assignment_expr();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assignment_exprContext extends ParserRuleContext {
        public Assignment_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_expr;
        }

        public Assignment_exprContext() {
        }

        public void copyFrom(Assignment_exprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class IntegerAssignmentContext extends Assignment_exprContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode EQUALS_TO() {
            return getToken(LexinalParser.EQUALS_TO, 0);
        }

        public Num_exprContext num_expr() {
            return getRuleContext(Num_exprContext.class, 0);
        }

        public Ternary_exprContext ternary_expr() {
            return getRuleContext(Ternary_exprContext.class, 0);
        }

        public IntegerAssignmentContext(Assignment_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterIntegerAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitIntegerAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitIntegerAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringAssignmentContext extends Assignment_exprContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode EQUALS_TO() {
            return getToken(LexinalParser.EQUALS_TO, 0);
        }

        public TerminalNode VALID_STRING() {
            return getToken(LexinalParser.VALID_STRING, 0);
        }

        public StringAssignmentContext(Assignment_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterStringAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitStringAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitStringAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanAssignmentContext extends Assignment_exprContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode EQUALS_TO() {
            return getToken(LexinalParser.EQUALS_TO, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public BooleanAssignmentContext(Assignment_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterBooleanAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitBooleanAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitBooleanAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TernaryExpressionContext extends Assignment_exprContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode EQUALS_TO() {
            return getToken(LexinalParser.EQUALS_TO, 0);
        }

        public Ternary_exprContext ternary_expr() {
            return getRuleContext(Ternary_exprContext.class, 0);
        }

        public TernaryExpressionContext(Assignment_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterTernaryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitTernaryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitTernaryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Assignment_exprContext assignment_expr() throws RecognitionException {
        Assignment_exprContext _localctx = new Assignment_exprContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_assignment_expr);
        int _la;
        try {
            setState(99);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    _localctx = new IntegerAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(66);
                    match(T__2);
                    setState(67);
                    match(IDENTIFIER);
                    setState(70);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == EQUALS_TO) {
                        {
                            setState(68);
                            match(EQUALS_TO);
                            setState(69);
                            num_expr(0);
                        }
                    }

                }
                break;
                case 2:
                    _localctx = new IntegerAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(72);
                    match(T__2);
                    setState(73);
                    match(IDENTIFIER);
                    setState(76);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == EQUALS_TO) {
                        {
                            setState(74);
                            match(EQUALS_TO);
                            setState(75);
                            ternary_expr();
                        }
                    }

                }
                break;
                case 3:
                    _localctx = new BooleanAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(78);
                    match(T__3);
                    setState(79);
                    match(IDENTIFIER);
                    setState(82);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == EQUALS_TO) {
                        {
                            setState(80);
                            match(EQUALS_TO);
                            setState(81);
                            bool_expr(0);
                        }
                    }

                }
                break;
                case 4:
                    _localctx = new StringAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(84);
                    match(T__4);
                    setState(85);
                    match(IDENTIFIER);
                    setState(88);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == EQUALS_TO) {
                        {
                            setState(86);
                            match(EQUALS_TO);
                            setState(87);
                            match(VALID_STRING);
                        }
                    }

                }
                break;
                case 5:
                    _localctx = new IntegerAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(90);
                    match(IDENTIFIER);
                    setState(91);
                    match(EQUALS_TO);
                    setState(92);
                    num_expr(0);
                }
                break;
                case 6:
                    _localctx = new BooleanAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(93);
                    match(IDENTIFIER);
                    setState(94);
                    match(EQUALS_TO);
                    setState(95);
                    bool_expr(0);
                }
                break;
                case 7:
                    _localctx = new TernaryExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(96);
                    match(IDENTIFIER);
                    setState(97);
                    match(EQUALS_TO);
                    setState(98);
                    ternary_expr();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprsContext extends ParserRuleContext {
        public Num_exprContext num_expr() {
            return getRuleContext(Num_exprContext.class, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public ExprsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprs;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterExprs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitExprs(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitExprs(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprsContext exprs() throws RecognitionException {
        ExprsContext _localctx = new ExprsContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_exprs);
        try {
            setState(103);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(101);
                    num_expr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(102);
                    bool_expr(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Bool_exprContext extends ParserRuleContext {
        public Bool_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr;
        }

        public Bool_exprContext() {
        }

        public void copyFrom(Bool_exprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BooleanExpressionInBracketsContext extends Bool_exprContext {
        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public BooleanExpressionInBracketsContext(Bool_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener)
                ((LexinalListener) listener).enterBooleanExpressionInBrackets(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitBooleanExpressionInBrackets(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitBooleanExpressionInBrackets(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanIdentifierOnlyExpressionContext extends Bool_exprContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public BooleanIdentifierOnlyExpressionContext(Bool_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener)
                ((LexinalListener) listener).enterBooleanIdentifierOnlyExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener)
                ((LexinalListener) listener).exitBooleanIdentifierOnlyExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitBooleanIdentifierOnlyExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrimitiveBooleanValuesOnlyContext extends Bool_exprContext {
        public TerminalNode BOOLEAN() {
            return getToken(LexinalParser.BOOLEAN, 0);
        }

        public PrimitiveBooleanValuesOnlyContext(Bool_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterPrimitiveBooleanValuesOnly(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitPrimitiveBooleanValuesOnly(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitPrimitiveBooleanValuesOnly(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanLogicalExpressionContext extends Bool_exprContext {
        public Token op;

        public List<Bool_exprContext> bool_expr() {
            return getRuleContexts(Bool_exprContext.class);
        }

        public Bool_exprContext bool_expr(int i) {
            return getRuleContext(Bool_exprContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(LexinalParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(LexinalParser.OR, 0);
        }

        public TerminalNode IS_EQUL_TO() {
            return getToken(LexinalParser.IS_EQUL_TO, 0);
        }

        public TerminalNode NOT_EQUL_TO() {
            return getToken(LexinalParser.NOT_EQUL_TO, 0);
        }

        public BooleanLogicalExpressionContext(Bool_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterBooleanLogicalExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitBooleanLogicalExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitBooleanLogicalExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanComparisonExpressionContext extends Bool_exprContext {
        public Comp_exprContext comp_expr() {
            return getRuleContext(Comp_exprContext.class, 0);
        }

        public BooleanComparisonExpressionContext(Bool_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener)
                ((LexinalListener) listener).enterBooleanComparisonExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitBooleanComparisonExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitBooleanComparisonExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Bool_exprContext bool_expr() throws RecognitionException {
        return bool_expr(0);
    }

    private Bool_exprContext bool_expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
        Bool_exprContext _prevctx = _localctx;
        int _startState = 10;
        enterRecursionRule(_localctx, 10, RULE_bool_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                    case 1: {
                        _localctx = new BooleanComparisonExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(106);
                        comp_expr();
                    }
                    break;
                    case 2: {
                        _localctx = new BooleanExpressionInBracketsContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(107);
                        match(T__5);
                        setState(108);
                        bool_expr(0);
                        setState(109);
                        match(T__6);
                    }
                    break;
                    case 3: {
                        _localctx = new PrimitiveBooleanValuesOnlyContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(111);
                        match(BOOLEAN);
                    }
                    break;
                    case 4: {
                        _localctx = new BooleanIdentifierOnlyExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(112);
                        match(IDENTIFIER);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(120);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new BooleanLogicalExpressionContext(new Bool_exprContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
                                setState(115);
                                if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                setState(116);
                                ((BooleanLogicalExpressionContext) _localctx).op = _input.LT(1);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT_EQUL_TO) | (1L << IS_EQUL_TO))) != 0))) {
                                    ((BooleanLogicalExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(117);
                                bool_expr(6);
                            }
                        }
                    }
                    setState(122);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class Comp_exprContext extends ParserRuleContext {
        public Comp_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comp_expr;
        }

        public Comp_exprContext() {
        }

        public void copyFrom(Comp_exprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class NumberComparisonExpressionContext extends Comp_exprContext {
        public Token op;

        public List<Num_exprContext> num_expr() {
            return getRuleContexts(Num_exprContext.class);
        }

        public Num_exprContext num_expr(int i) {
            return getRuleContext(Num_exprContext.class, i);
        }

        public TerminalNode GREATER_THAN() {
            return getToken(LexinalParser.GREATER_THAN, 0);
        }

        public TerminalNode LESS_THAN() {
            return getToken(LexinalParser.LESS_THAN, 0);
        }

        public TerminalNode MORE_THAN_OR_EQUL() {
            return getToken(LexinalParser.MORE_THAN_OR_EQUL, 0);
        }

        public TerminalNode LESS_THAN_OR_EQUL() {
            return getToken(LexinalParser.LESS_THAN_OR_EQUL, 0);
        }

        public TerminalNode IS_EQUL_TO() {
            return getToken(LexinalParser.IS_EQUL_TO, 0);
        }

        public TerminalNode NOT_EQUL_TO() {
            return getToken(LexinalParser.NOT_EQUL_TO, 0);
        }

        public NumberComparisonExpressionContext(Comp_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterNumberComparisonExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitNumberComparisonExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitNumberComparisonExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Comp_exprContext comp_expr() throws RecognitionException {
        Comp_exprContext _localctx = new Comp_exprContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_comp_expr);
        int _la;
        try {
            _localctx = new NumberComparisonExpressionContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(123);
                num_expr(0);
                setState(124);
                ((NumberComparisonExpressionContext) _localctx).op = _input.LT(1);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_OR_EQUL) | (1L << MORE_THAN_OR_EQUL) | (1L << NOT_EQUL_TO) | (1L << IS_EQUL_TO))) != 0))) {
                    ((NumberComparisonExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(125);
                num_expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Num_exprContext extends ParserRuleContext {
        public Num_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_num_expr;
        }

        public Num_exprContext() {
        }

        public void copyFrom(Num_exprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class NumberMultiplyDivideExpressionContext extends Num_exprContext {
        public Token op;

        public List<Num_exprContext> num_expr() {
            return getRuleContexts(Num_exprContext.class);
        }

        public Num_exprContext num_expr(int i) {
            return getRuleContext(Num_exprContext.class, i);
        }

        public TerminalNode ADD() {
            return getToken(LexinalParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(LexinalParser.SUB, 0);
        }

        public TerminalNode MUL() {
            return getToken(LexinalParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(LexinalParser.DIV, 0);
        }

        public NumberMultiplyDivideExpressionContext(Num_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener)
                ((LexinalListener) listener).enterNumberMultiplyDivideExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener)
                ((LexinalListener) listener).exitNumberMultiplyDivideExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitNumberMultiplyDivideExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberIdentifierOnlyContext extends Num_exprContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode SUB() {
            return getToken(LexinalParser.SUB, 0);
        }

        public NumberIdentifierOnlyContext(Num_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterNumberIdentifierOnly(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitNumberIdentifierOnly(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitNumberIdentifierOnly(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberBracketsExpressionContext extends Num_exprContext {
        public Num_exprContext num_expr() {
            return getRuleContext(Num_exprContext.class, 0);
        }

        public NumberBracketsExpressionContext(Num_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterNumberBracketsExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitNumberBracketsExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitNumberBracketsExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberOnlyContext extends Num_exprContext {
        public TerminalNode DIGITS() {
            return getToken(LexinalParser.DIGITS, 0);
        }

        public TerminalNode SUB() {
            return getToken(LexinalParser.SUB, 0);
        }

        public NumberOnlyContext(Num_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterNumberOnly(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitNumberOnly(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitNumberOnly(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Num_exprContext num_expr() throws RecognitionException {
        return num_expr(0);
    }

    private Num_exprContext num_expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Num_exprContext _localctx = new Num_exprContext(_ctx, _parentState);
        Num_exprContext _prevctx = _localctx;
        int _startState = 14;
        enterRecursionRule(_localctx, 14, RULE_num_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(140);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                    case 1: {
                        _localctx = new NumberBracketsExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(128);
                        match(T__5);
                        setState(129);
                        num_expr(0);
                        setState(130);
                        match(T__6);
                    }
                    break;
                    case 2: {
                        _localctx = new NumberOnlyContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(133);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == SUB) {
                            {
                                setState(132);
                                match(SUB);
                            }
                        }

                        setState(135);
                        match(DIGITS);
                    }
                    break;
                    case 3: {
                        _localctx = new NumberIdentifierOnlyContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(137);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == SUB) {
                            {
                                setState(136);
                                match(SUB);
                            }
                        }

                        setState(139);
                        match(IDENTIFIER);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(147);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new NumberMultiplyDivideExpressionContext(new Num_exprContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
                                setState(142);
                                if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                setState(143);
                                ((NumberMultiplyDivideExpressionContext) _localctx).op = _input.LT(1);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0))) {
                                    ((NumberMultiplyDivideExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(144);
                                num_expr(5);
                            }
                        }
                    }
                    setState(149);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class Cond_exprContext extends ParserRuleContext {
        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public Cond_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cond_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterCond_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitCond_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitCond_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Cond_exprContext cond_expr() throws RecognitionException {
        Cond_exprContext _localctx = new Cond_exprContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_cond_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(150);
                match(T__5);
                setState(151);
                bool_expr(0);
                setState(152);
                match(T__6);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class If_exprContext extends ParserRuleContext {
        public Cond_exprContext cond_expr() {
            return getRuleContext(Cond_exprContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<Else_if_exprContext> else_if_expr() {
            return getRuleContexts(Else_if_exprContext.class);
        }

        public Else_if_exprContext else_if_expr(int i) {
            return getRuleContext(Else_if_exprContext.class, i);
        }

        public Else_exprContext else_expr() {
            return getRuleContext(Else_exprContext.class, 0);
        }

        public If_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterIf_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitIf_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitIf_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_exprContext if_expr() throws RecognitionException {
        If_exprContext _localctx = new If_exprContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_if_expr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(154);
                match(T__7);
                setState(155);
                cond_expr();
                setState(156);
                block();
                setState(160);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__9) {
                    {
                        {
                            setState(157);
                            else_if_expr();
                        }
                    }
                    setState(162);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(164);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__11) {
                    {
                        setState(163);
                        else_expr();
                    }
                }

                setState(166);
                match(T__8);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Else_if_exprContext extends ParserRuleContext {
        public Cond_exprContext cond_expr() {
            return getRuleContext(Cond_exprContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public Else_if_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_if_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterElse_if_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitElse_if_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitElse_if_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Else_if_exprContext else_if_expr() throws RecognitionException {
        Else_if_exprContext _localctx = new Else_if_exprContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_else_if_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(168);
                match(T__9);
                setState(169);
                cond_expr();
                setState(170);
                block();
                setState(171);
                match(T__10);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Else_exprContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public Else_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterElse_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitElse_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitElse_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Else_exprContext else_expr() throws RecognitionException {
        Else_exprContext _localctx = new Else_exprContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_else_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(173);
                match(T__11);
                setState(174);
                block();
                setState(175);
                match(T__12);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class While_exprContext extends ParserRuleContext {
        public Cond_exprContext cond_expr() {
            return getRuleContext(Cond_exprContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public While_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_while_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterWhile_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitWhile_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitWhile_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final While_exprContext while_expr() throws RecognitionException {
        While_exprContext _localctx = new While_exprContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_while_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(177);
                match(T__13);
                setState(178);
                cond_expr();
                setState(179);
                block();
                setState(180);
                match(T__14);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class For_enhancedContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public List<RangeValContext> rangeVal() {
            return getRuleContexts(RangeValContext.class);
        }

        public RangeValContext rangeVal(int i) {
            return getRuleContext(RangeValContext.class, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public For_enhancedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_enhanced;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterFor_enhanced(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitFor_enhanced(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitFor_enhanced(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_enhancedContext for_enhanced() throws RecognitionException {
        For_enhancedContext _localctx = new For_enhancedContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_for_enhanced);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
                match(T__15);
                setState(183);
                match(IDENTIFIER);
                setState(184);
                match(T__16);
                setState(185);
                match(T__17);
                setState(186);
                match(T__5);
                setState(187);
                rangeVal();
                setState(188);
                match(T__18);
                setState(189);
                rangeVal();
                setState(190);
                match(T__6);
                setState(191);
                block();
                setState(192);
                match(T__19);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RangeValContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode DIGITS() {
            return getToken(LexinalParser.DIGITS, 0);
        }

        public RangeValContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rangeVal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterRangeVal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitRangeVal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitRangeVal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RangeValContext rangeVal() throws RecognitionException {
        RangeValContext _localctx = new RangeValContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_rangeVal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                _la = _input.LA(1);
                if (!(_la == DIGITS || _la == IDENTIFIER)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class For_loopContext extends ParserRuleContext {
        public Assignment_commandContext assignment_command() {
            return getRuleContext(Assignment_commandContext.class, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public Variable_change_partContext variable_change_part() {
            return getRuleContext(Variable_change_partContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public For_loopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_loop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterFor_loop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitFor_loop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitFor_loop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_loopContext for_loop() throws RecognitionException {
        For_loopContext _localctx = new For_loopContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_for_loop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                match(T__15);
                setState(197);
                match(T__5);
                setState(198);
                assignment_command();
                setState(199);
                match(T__18);
                setState(200);
                bool_expr(0);
                setState(201);
                match(T__18);
                setState(202);
                variable_change_part();
                setState(203);
                match(T__6);
                setState(204);
                block();
                setState(205);
                match(T__19);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Variable_change_partContext extends ParserRuleContext {
        public Increment_expressionContext increment_expression() {
            return getRuleContext(Increment_expressionContext.class, 0);
        }

        public Decrement_expressionContext decrement_expression() {
            return getRuleContext(Decrement_expressionContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode EQUALS_TO() {
            return getToken(LexinalParser.EQUALS_TO, 0);
        }

        public Num_exprContext num_expr() {
            return getRuleContext(Num_exprContext.class, 0);
        }

        public Variable_change_partContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable_change_part;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterVariable_change_part(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitVariable_change_part(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitVariable_change_part(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Variable_change_partContext variable_change_part() throws RecognitionException {
        Variable_change_partContext _localctx = new Variable_change_partContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_variable_change_part);
        try {
            setState(212);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(207);
                    increment_expression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(208);
                    decrement_expression();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(209);
                    match(IDENTIFIER);
                    setState(210);
                    match(EQUALS_TO);
                    setState(211);
                    num_expr(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Decrement_expressionContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public Decrement_operatorContext decrement_operator() {
            return getRuleContext(Decrement_operatorContext.class, 0);
        }

        public Decrement_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decrement_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterDecrement_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitDecrement_expression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitDecrement_expression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Decrement_expressionContext decrement_expression() throws RecognitionException {
        Decrement_expressionContext _localctx = new Decrement_expressionContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_decrement_expression);
        try {
            setState(219);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(214);
                    match(IDENTIFIER);
                    setState(215);
                    decrement_operator();
                }
                break;
                case T__20:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(216);
                    decrement_operator();
                    setState(217);
                    match(IDENTIFIER);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Increment_expressionContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public Increment_operatorContext increment_operator() {
            return getRuleContext(Increment_operatorContext.class, 0);
        }

        public Increment_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_increment_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterIncrement_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitIncrement_expression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitIncrement_expression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Increment_expressionContext increment_expression() throws RecognitionException {
        Increment_expressionContext _localctx = new Increment_expressionContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_increment_expression);
        try {
            setState(226);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(221);
                    match(IDENTIFIER);
                    setState(222);
                    increment_operator();
                }
                break;
                case T__21:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(223);
                    increment_operator();
                    setState(224);
                    match(IDENTIFIER);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Decrement_operatorContext extends ParserRuleContext {
        public Decrement_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decrement_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterDecrement_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitDecrement_operator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitDecrement_operator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Decrement_operatorContext decrement_operator() throws RecognitionException {
        Decrement_operatorContext _localctx = new Decrement_operatorContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_decrement_operator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                match(T__20);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Increment_operatorContext extends ParserRuleContext {
        public Increment_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_increment_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterIncrement_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitIncrement_operator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitIncrement_operator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Increment_operatorContext increment_operator() throws RecognitionException {
        Increment_operatorContext _localctx = new Increment_operatorContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_increment_operator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(230);
                match(T__21);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assignment_commandContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public TerminalNode EQUALS_TO() {
            return getToken(LexinalParser.EQUALS_TO, 0);
        }

        public Num_exprContext num_expr() {
            return getRuleContext(Num_exprContext.class, 0);
        }

        public Assignment_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterAssignment_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitAssignment_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitAssignment_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Assignment_commandContext assignment_command() throws RecognitionException {
        Assignment_commandContext _localctx = new Assignment_commandContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_assignment_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(232);
                match(T__2);
                setState(233);
                match(IDENTIFIER);
                setState(234);
                match(EQUALS_TO);
                setState(235);
                num_expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Ternary_exprContext extends ParserRuleContext {
        public Cond_exprContext cond_expr() {
            return getRuleContext(Cond_exprContext.class, 0);
        }

        public List<ExprsContext> exprs() {
            return getRuleContexts(ExprsContext.class);
        }

        public ExprsContext exprs(int i) {
            return getRuleContext(ExprsContext.class, i);
        }

        public Ternary_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ternary_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterTernary_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitTernary_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor)
                return ((LexinalVisitor<? extends T>) visitor).visitTernary_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Ternary_exprContext ternary_expr() throws RecognitionException {
        Ternary_exprContext _localctx = new Ternary_exprContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_ternary_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(237);
                cond_expr();
                setState(238);
                match(T__22);
                setState(239);
                exprs();
                setState(240);
                match(T__23);
                setState(241);
                exprs();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrintContext extends ParserRuleContext {
        public TerminalNode DIGITS() {
            return getToken(LexinalParser.DIGITS, 0);
        }

        public TerminalNode BOOLEAN() {
            return getToken(LexinalParser.BOOLEAN, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(LexinalParser.IDENTIFIER, 0);
        }

        public Num_exprContext num_expr() {
            return getRuleContext(Num_exprContext.class, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public TerminalNode VALID_STRING() {
            return getToken(LexinalParser.VALID_STRING, 0);
        }

        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LexinalListener) ((LexinalListener) listener).exitPrint(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LexinalVisitor) return ((LexinalVisitor<? extends T>) visitor).visitPrint(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrintContext print() throws RecognitionException {
        PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_print);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                match(T__24);
                setState(244);
                match(T__5);
                setState(251);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                    case 1: {
                        setState(245);
                        match(DIGITS);
                    }
                    break;
                    case 2: {
                        setState(246);
                        match(BOOLEAN);
                    }
                    break;
                    case 3: {
                        setState(247);
                        match(IDENTIFIER);
                    }
                    break;
                    case 4: {
                        setState(248);
                        num_expr(0);
                    }
                    break;
                    case 5: {
                        setState(249);
                        bool_expr(0);
                    }
                    break;
                    case 6: {
                        setState(250);
                        match(VALID_STRING);
                    }
                    break;
                }
                setState(253);
                match(T__6);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 5:
                return bool_expr_sempred((Bool_exprContext) _localctx, predIndex);
            case 7:
                return num_expr_sempred((Num_exprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 5);
        }
        return true;
    }

    private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 4);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0102\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\3\2\3\2\3\3\3\3\6\3\67\n\3\r\3\16\38\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\5\4C\n\4\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3" +
                    "\5\3\5\5\5U\n\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\3\5\5\5f\n\5\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7t" +
                    "\n\7\3\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3" +
                    "\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\5\t\u008c\n\t\3\t\5\t\u008f\n\t\3\t\3" +
                    "\t\3\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13" +
                    "\3\13\7\13\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13\5\13\u00a7\n\13\3\13" +
                    "\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22" +
                    "\3\22\5\22\u00d7\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00de\n\23\3\24\3" +
                    "\24\3\24\3\24\3\24\5\24\u00e5\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27" +
                    "\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\5\31\u00fe\n\31\3\31\3\31\3\31\2\4\f\20\32\2\4\6\b\n\f\16\20" +
                    "\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\4\2\"#()\3\2$)\3\2\36!\4\2\34\34" +
                    "**\2\u010e\2\62\3\2\2\2\4\64\3\2\2\2\6B\3\2\2\2\be\3\2\2\2\ni\3\2\2\2" +
                    "\fs\3\2\2\2\16}\3\2\2\2\20\u008e\3\2\2\2\22\u0098\3\2\2\2\24\u009c\3\2" +
                    "\2\2\26\u00aa\3\2\2\2\30\u00af\3\2\2\2\32\u00b3\3\2\2\2\34\u00b8\3\2\2" +
                    "\2\36\u00c4\3\2\2\2 \u00c6\3\2\2\2\"\u00d6\3\2\2\2$\u00dd\3\2\2\2&\u00e4" +
                    "\3\2\2\2(\u00e6\3\2\2\2*\u00e8\3\2\2\2,\u00ea\3\2\2\2.\u00ef\3\2\2\2\60" +
                    "\u00f5\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\66\7\3\2\2\65\67\5\6\4\2" +
                    "\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\4\2\2;" +
                    "\5\3\2\2\2<C\5\24\13\2=C\5\32\16\2>C\5\34\17\2?C\5 \21\2@C\5\60\31\2A" +
                    "C\5\b\5\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2" +
                    "C\7\3\2\2\2DE\7\5\2\2EH\7*\2\2FG\7,\2\2GI\5\20\t\2HF\3\2\2\2HI\3\2\2\2" +
                    "If\3\2\2\2JK\7\5\2\2KN\7*\2\2LM\7,\2\2MO\5.\30\2NL\3\2\2\2NO\3\2\2\2O" +
                    "f\3\2\2\2PQ\7\6\2\2QT\7*\2\2RS\7,\2\2SU\5\f\7\2TR\3\2\2\2TU\3\2\2\2Uf" +
                    "\3\2\2\2VW\7\7\2\2WZ\7*\2\2XY\7,\2\2Y[\7+\2\2ZX\3\2\2\2Z[\3\2\2\2[f\3" +
                    "\2\2\2\\]\7*\2\2]^\7,\2\2^f\5\20\t\2_`\7*\2\2`a\7,\2\2af\5\f\7\2bc\7*" +
                    "\2\2cd\7,\2\2df\5.\30\2eD\3\2\2\2eJ\3\2\2\2eP\3\2\2\2eV\3\2\2\2e\\\3\2" +
                    "\2\2e_\3\2\2\2eb\3\2\2\2f\t\3\2\2\2gj\5\20\t\2hj\5\f\7\2ig\3\2\2\2ih\3" +
                    "\2\2\2j\13\3\2\2\2kl\b\7\1\2lt\5\16\b\2mn\7\b\2\2no\5\f\7\2op\7\t\2\2" +
                    "pt\3\2\2\2qt\7\35\2\2rt\7*\2\2sk\3\2\2\2sm\3\2\2\2sq\3\2\2\2sr\3\2\2\2" +
                    "tz\3\2\2\2uv\f\7\2\2vw\t\2\2\2wy\5\f\7\bxu\3\2\2\2y|\3\2\2\2zx\3\2\2\2" +
                    "z{\3\2\2\2{\r\3\2\2\2|z\3\2\2\2}~\5\20\t\2~\177\t\3\2\2\177\u0080\5\20" +
                    "\t\2\u0080\17\3\2\2\2\u0081\u0082\b\t\1\2\u0082\u0083\7\b\2\2\u0083\u0084" +
                    "\5\20\t\2\u0084\u0085\7\t\2\2\u0085\u008f\3\2\2\2\u0086\u0088\7\37\2\2" +
                    "\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008f" +
                    "\7\34\2\2\u008a\u008c\7\37\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2" +
                    "\u008c\u008d\3\2\2\2\u008d\u008f\7*\2\2\u008e\u0081\3\2\2\2\u008e\u0087" +
                    "\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0095\3\2\2\2\u0090\u0091\f\6\2\2\u0091" +
                    "\u0092\t\4\2\2\u0092\u0094\5\20\t\7\u0093\u0090\3\2\2\2\u0094\u0097\3" +
                    "\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\21\3\2\2\2\u0097" +
                    "\u0095\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7\t" +
                    "\2\2\u009b\23\3\2\2\2\u009c\u009d\7\n\2\2\u009d\u009e\5\22\n\2\u009e\u00a2" +
                    "\5\4\3\2\u009f\u00a1\5\26\f\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2" +
                    "\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2" +
                    "\3\2\2\2\u00a5\u00a7\5\30\r\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2" +
                    "\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\13\2\2\u00a9\25\3\2\2\2\u00aa\u00ab" +
                    "\7\f\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\7\r\2\2" +
                    "\u00ae\27\3\2\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2" +
                    "\7\17\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\5\22\n\2\u00b5" +
                    "\u00b6\5\4\3\2\u00b6\u00b7\7\21\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\22" +
                    "\2\2\u00b9\u00ba\7*\2\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\7\24\2\2\u00bc" +
                    "\u00bd\7\b\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\7\25\2\2\u00bf\u00c0" +
                    "\5\36\20\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\4\3\2\u00c2\u00c3\7\26\2" +
                    "\2\u00c3\35\3\2\2\2\u00c4\u00c5\t\5\2\2\u00c5\37\3\2\2\2\u00c6\u00c7\7" +
                    "\22\2\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\5,\27\2\u00c9\u00ca\7\25\2\2\u00ca" +
                    "\u00cb\5\f\7\2\u00cb\u00cc\7\25\2\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce\7" +
                    "\t\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d0\7\26\2\2\u00d0!\3\2\2\2\u00d1\u00d7" +
                    "\5&\24\2\u00d2\u00d7\5$\23\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\7,\2\2\u00d5" +
                    "\u00d7\5\20\t\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3" +
                    "\2\2\2\u00d7#\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9\u00de\5(\25\2\u00da\u00db" +
                    "\5(\25\2\u00db\u00dc\7*\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd" +
                    "\u00da\3\2\2\2\u00de%\3\2\2\2\u00df\u00e0\7*\2\2\u00e0\u00e5\5*\26\2\u00e1" +
                    "\u00e2\5*\26\2\u00e2\u00e3\7*\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00df\3\2" +
                    "\2\2\u00e4\u00e1\3\2\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\7\27\2\2\u00e7)\3" +
                    "\2\2\2\u00e8\u00e9\7\30\2\2\u00e9+\3\2\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec" +
                    "\7*\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\5\20\t\2\u00ee-\3\2\2\2\u00ef\u00f0" +
                    "\5\22\n\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2\5\n\6\2\u00f2\u00f3\7\32\2" +
                    "\2\u00f3\u00f4\5\n\6\2\u00f4/\3\2\2\2\u00f5\u00f6\7\33\2\2\u00f6\u00fd" +
                    "\7\b\2\2\u00f7\u00fe\7\34\2\2\u00f8\u00fe\7\35\2\2\u00f9\u00fe\7*\2\2" +
                    "\u00fa\u00fe\5\20\t\2\u00fb\u00fe\5\f\7\2\u00fc\u00fe\7+\2\2\u00fd\u00f7" +
                    "\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd" +
                    "\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\t" +
                    "\2\2\u0100\61\3\2\2\2\268BHNTZeisz\u0087\u008b\u008e\u0095\u00a2\u00a6" +
                    "\u00d6\u00dd\u00e4\u00fd";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}