// Generated from C:/Users/gargs/OneDrive - Arizona State University/Desktop/Stuff/Class Stuff/SER 502/Project/Project_Workspace/src/main/antlr\Lexinal.g4 by ANTLR 4.10.1
package gen;

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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, DIGITS=28, BOOLEAN=29, ADD=30, SUB=31, MUL=32, 
		DIV=33, AND=34, OR=35, LESS_THAN=36, GREATER_THAN=37, LESS_THAN_OR_EQUL=38, 
		MORE_THAN_OR_EQUL=39, NOT_EQUL_TO=40, IS_EQUL_TO=41, IDENTIFIER=42, VALID_STRING=43, 
		EQUALS_TO=44, WHITE_SPACES=45, Comment=46;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_command = 2, RULE_assignment_expr = 3, 
		RULE_exprs = 4, RULE_bool_expr = 5, RULE_comp_expr = 6, RULE_num_expr = 7, 
		RULE_cond_expr = 8, RULE_if_expr = 9, RULE_else_if_expr = 10, RULE_else_expr = 11, 
		RULE_while_expr = 12, RULE_for_enhanced = 13, RULE_rangeVal = 14, RULE_for_loop = 15, 
		RULE_variable_change_part = 16, RULE_decrement_expression = 17, RULE_increment_expression = 18, 
		RULE_decrement_operator = 19, RULE_increment_operator = 20, RULE_assignment_command = 21, 
		RULE_ternary_expr = 22, RULE_print = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "command", "assignment_expr", "exprs", "bool_expr", 
			"comp_expr", "num_expr", "cond_expr", "if_expr", "else_if_expr", "else_expr", 
			"while_expr", "for_enhanced", "rangeVal", "for_loop", "variable_change_part", 
			"decrement_expression", "increment_expression", "decrement_operator", 
			"increment_operator", "assignment_command", "ternary_expr", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'end'", "'{'", "'}'", "'int'", "'boolean'", "'string'", 
			"'('", "')'", "'if'", "'end-if'", "'elseIf'", "'end-elseIf'", "'else'", 
			"'end-else'", "'while'", "'end-while'", "'for'", "'in'", "'range'", "';'", 
			"'end-for'", "'--'", "'++'", "'?'", "':'", "'print'", null, null, "'+'", 
			"'-'", "'*'", "'/'", "'and'", "'or'", "'<'", "'>'", "'<='", "'>='", "'not'", 
			"'=='", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "DIGITS", "BOOLEAN", "ADD", "SUB", "MUL", "DIV", 
			"AND", "OR", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUL", "MORE_THAN_OR_EQUL", 
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
	public String getGrammarFileName() { return "Lexinal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexinalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitProgram(this);
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
			match(T__0);
			setState(49);
			block();
			setState(50);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(52);
			match(T__2);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				command();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__26) | (1L << IDENTIFIER))) != 0) );
			setState(58);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public For_enhancedContext for_enhanced() {
			return getRuleContext(For_enhancedContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(60);
				if_expr();
				}
				break;
			case 2:
				{
				setState(61);
				while_expr();
				}
				break;
			case 3:
				{
				setState(62);
				for_enhanced();
				}
				break;
			case 4:
				{
				setState(63);
				for_loop();
				}
				break;
			case 5:
				{
				setState(64);
				print();
				}
				break;
			case 6:
				{
				setState(65);
				assignment_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_exprContext extends ParserRuleContext {
		public Assignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expr; }
	 
		public Assignment_exprContext() { }
		public void copyFrom(Assignment_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerAssignmentContext extends Assignment_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_TO() { return getToken(LexinalParser.EQUALS_TO, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Ternary_exprContext ternary_expr() {
			return getRuleContext(Ternary_exprContext.class,0);
		}
		public IntegerAssignmentContext(Assignment_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterIntegerAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitIntegerAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitIntegerAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignmentContext extends Assignment_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_TO() { return getToken(LexinalParser.EQUALS_TO, 0); }
		public TerminalNode VALID_STRING() { return getToken(LexinalParser.VALID_STRING, 0); }
		public Ternary_exprContext ternary_expr() {
			return getRuleContext(Ternary_exprContext.class,0);
		}
		public StringAssignmentContext(Assignment_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAssignmentContext extends Assignment_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_TO() { return getToken(LexinalParser.EQUALS_TO, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Ternary_exprContext ternary_expr() {
			return getRuleContext(Ternary_exprContext.class,0);
		}
		public BooleanAssignmentContext(Assignment_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterBooleanAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitBooleanAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitBooleanAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_exprContext assignment_expr() throws RecognitionException {
		Assignment_exprContext _localctx = new Assignment_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment_expr);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IntegerAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__4);
				setState(69);
				match(IDENTIFIER);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_TO) {
					{
					setState(70);
					match(EQUALS_TO);
					setState(71);
					num_expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new IntegerAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__4);
				setState(75);
				match(IDENTIFIER);
				setState(76);
				match(EQUALS_TO);
				setState(77);
				ternary_expr();
				}
				break;
			case 3:
				_localctx = new BooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(T__5);
				setState(79);
				match(IDENTIFIER);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_TO) {
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
				_localctx = new BooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(T__5);
				setState(85);
				match(IDENTIFIER);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_TO) {
					{
					setState(86);
					match(EQUALS_TO);
					setState(87);
					ternary_expr();
					}
				}

				}
				break;
			case 5:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(T__6);
				setState(91);
				match(IDENTIFIER);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_TO) {
					{
					setState(92);
					match(EQUALS_TO);
					setState(93);
					match(VALID_STRING);
					}
				}

				}
				break;
			case 6:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(T__6);
				setState(97);
				match(IDENTIFIER);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS_TO) {
					{
					setState(98);
					match(EQUALS_TO);
					setState(99);
					ternary_expr();
					}
				}

				}
				break;
			case 7:
				_localctx = new IntegerAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				match(IDENTIFIER);
				setState(103);
				match(EQUALS_TO);
				setState(104);
				num_expr(0);
				}
				break;
			case 8:
				_localctx = new BooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				match(IDENTIFIER);
				setState(106);
				match(EQUALS_TO);
				setState(107);
				bool_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprs);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				num_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				bool_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
	 
		public Bool_exprContext() { }
		public void copyFrom(Bool_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanExpressionInBracketsContext extends Bool_exprContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BooleanExpressionInBracketsContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterBooleanExpressionInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitBooleanExpressionInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitBooleanExpressionInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanIdentifierOnlyExpressionContext extends Bool_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public BooleanIdentifierOnlyExpressionContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterBooleanIdentifierOnlyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitBooleanIdentifierOnlyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitBooleanIdentifierOnlyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveBooleanValuesOnlyContext extends Bool_exprContext {
		public TerminalNode BOOLEAN() { return getToken(LexinalParser.BOOLEAN, 0); }
		public PrimitiveBooleanValuesOnlyContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterPrimitiveBooleanValuesOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitPrimitiveBooleanValuesOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitPrimitiveBooleanValuesOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLogicalExpressionContext extends Bool_exprContext {
		public Token op;
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LexinalParser.AND, 0); }
		public TerminalNode OR() { return getToken(LexinalParser.OR, 0); }
		public TerminalNode IS_EQUL_TO() { return getToken(LexinalParser.IS_EQUL_TO, 0); }
		public TerminalNode NOT_EQUL_TO() { return getToken(LexinalParser.NOT_EQUL_TO, 0); }
		public BooleanLogicalExpressionContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterBooleanLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitBooleanLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitBooleanLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanComparisonExpressionContext extends Bool_exprContext {
		public Comp_exprContext comp_expr() {
			return getRuleContext(Comp_exprContext.class,0);
		}
		public BooleanComparisonExpressionContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterBooleanComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitBooleanComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitBooleanComparisonExpression(this);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BooleanComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				comp_expr();
				}
				break;
			case 2:
				{
				_localctx = new BooleanExpressionInBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(T__7);
				setState(117);
				bool_expr(0);
				setState(118);
				match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new PrimitiveBooleanValuesOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new BooleanIdentifierOnlyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanLogicalExpressionContext(new Bool_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(124);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(125);
					((BooleanLogicalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT_EQUL_TO) | (1L << IS_EQUL_TO))) != 0)) ) {
						((BooleanLogicalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(126);
					bool_expr(6);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comp_exprContext extends ParserRuleContext {
		public Comp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_expr; }
	 
		public Comp_exprContext() { }
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
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(LexinalParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(LexinalParser.LESS_THAN, 0); }
		public TerminalNode MORE_THAN_OR_EQUL() { return getToken(LexinalParser.MORE_THAN_OR_EQUL, 0); }
		public TerminalNode LESS_THAN_OR_EQUL() { return getToken(LexinalParser.LESS_THAN_OR_EQUL, 0); }
		public TerminalNode IS_EQUL_TO() { return getToken(LexinalParser.IS_EQUL_TO, 0); }
		public TerminalNode NOT_EQUL_TO() { return getToken(LexinalParser.NOT_EQUL_TO, 0); }
		public NumberComparisonExpressionContext(Comp_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterNumberComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitNumberComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitNumberComparisonExpression(this);
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
			setState(132);
			num_expr(0);
			setState(133);
			((NumberComparisonExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_OR_EQUL) | (1L << MORE_THAN_OR_EQUL) | (1L << NOT_EQUL_TO) | (1L << IS_EQUL_TO))) != 0)) ) {
				((NumberComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_exprContext extends ParserRuleContext {
		public Num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expr; }
	 
		public Num_exprContext() { }
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
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LexinalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LexinalParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(LexinalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LexinalParser.DIV, 0); }
		public NumberMultiplyDivideExpressionContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterNumberMultiplyDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitNumberMultiplyDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitNumberMultiplyDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberIdentifierOnlyContext extends Num_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public TerminalNode SUB() { return getToken(LexinalParser.SUB, 0); }
		public NumberIdentifierOnlyContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterNumberIdentifierOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitNumberIdentifierOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitNumberIdentifierOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberBracketsExpressionContext extends Num_exprContext {
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public NumberBracketsExpressionContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterNumberBracketsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitNumberBracketsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitNumberBracketsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberOnlyContext extends Num_exprContext {
		public TerminalNode DIGITS() { return getToken(LexinalParser.DIGITS, 0); }
		public TerminalNode SUB() { return getToken(LexinalParser.SUB, 0); }
		public NumberOnlyContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterNumberOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitNumberOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitNumberOnly(this);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NumberBracketsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				match(T__7);
				setState(138);
				num_expr(0);
				setState(139);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new NumberOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(141);
					match(SUB);
					}
				}

				setState(144);
				match(DIGITS);
				}
				break;
			case 3:
				{
				_localctx = new NumberIdentifierOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(145);
					match(SUB);
					}
				}

				setState(148);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NumberMultiplyDivideExpressionContext(new Num_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
					setState(151);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(152);
					((NumberMultiplyDivideExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
						((NumberMultiplyDivideExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(153);
					num_expr(5);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cond_exprContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Cond_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterCond_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitCond_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitCond_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_exprContext cond_expr() throws RecognitionException {
		Cond_exprContext _localctx = new Cond_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__7);
			setState(160);
			bool_expr(0);
			setState(161);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_exprContext extends ParserRuleContext {
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Else_if_exprContext> else_if_expr() {
			return getRuleContexts(Else_if_exprContext.class);
		}
		public Else_if_exprContext else_if_expr(int i) {
			return getRuleContext(Else_if_exprContext.class,i);
		}
		public Else_exprContext else_expr() {
			return getRuleContext(Else_exprContext.class,0);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitIf_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitIf_expr(this);
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
			setState(163);
			match(T__9);
			setState(164);
			cond_expr();
			setState(165);
			block();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(166);
				else_if_expr();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(172);
				else_expr();
				}
			}

			setState(175);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_exprContext extends ParserRuleContext {
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_if_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterElse_if_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitElse_if_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitElse_if_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_exprContext else_if_expr() throws RecognitionException {
		Else_if_exprContext _localctx = new Else_if_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__11);
			setState(178);
			cond_expr();
			setState(179);
			block();
			setState(180);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_exprContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterElse_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitElse_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitElse_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_exprContext else_expr() throws RecognitionException {
		Else_exprContext _localctx = new Else_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__13);
			setState(183);
			block();
			setState(184);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_exprContext extends ParserRuleContext {
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterWhile_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitWhile_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitWhile_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__15);
			setState(187);
			cond_expr();
			setState(188);
			block();
			setState(189);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_enhancedContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public List<RangeValContext> rangeVal() {
			return getRuleContexts(RangeValContext.class);
		}
		public RangeValContext rangeVal(int i) {
			return getRuleContext(RangeValContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_enhancedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_enhanced; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterFor_enhanced(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitFor_enhanced(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitFor_enhanced(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_enhancedContext for_enhanced() throws RecognitionException {
		For_enhancedContext _localctx = new For_enhancedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_enhanced);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__17);
			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(T__18);
			setState(194);
			match(T__19);
			setState(195);
			match(T__7);
			setState(196);
			rangeVal();
			setState(197);
			match(T__20);
			setState(198);
			rangeVal();
			setState(199);
			match(T__8);
			setState(200);
			block();
			setState(201);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeValContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public TerminalNode DIGITS() { return getToken(LexinalParser.DIGITS, 0); }
		public RangeValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterRangeVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitRangeVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitRangeVal(this);
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
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public Assignment_commandContext assignment_command() {
			return getRuleContext(Assignment_commandContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Variable_change_partContext variable_change_part() {
			return getRuleContext(Variable_change_partContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__17);
			setState(206);
			match(T__7);
			setState(207);
			assignment_command();
			setState(208);
			match(T__20);
			setState(209);
			bool_expr(0);
			setState(210);
			match(T__20);
			setState(211);
			variable_change_part();
			setState(212);
			match(T__8);
			setState(213);
			block();
			setState(214);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_change_partContext extends ParserRuleContext {
		public Increment_expressionContext increment_expression() {
			return getRuleContext(Increment_expressionContext.class,0);
		}
		public Decrement_expressionContext decrement_expression() {
			return getRuleContext(Decrement_expressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_TO() { return getToken(LexinalParser.EQUALS_TO, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Variable_change_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_change_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterVariable_change_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitVariable_change_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitVariable_change_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_change_partContext variable_change_part() throws RecognitionException {
		Variable_change_partContext _localctx = new Variable_change_partContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable_change_part);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				increment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				decrement_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(IDENTIFIER);
				setState(219);
				match(EQUALS_TO);
				setState(220);
				num_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decrement_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public Decrement_operatorContext decrement_operator() {
			return getRuleContext(Decrement_operatorContext.class,0);
		}
		public Decrement_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterDecrement_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitDecrement_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitDecrement_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decrement_expressionContext decrement_expression() throws RecognitionException {
		Decrement_expressionContext _localctx = new Decrement_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decrement_expression);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(IDENTIFIER);
				setState(224);
				decrement_operator();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				decrement_operator();
				setState(226);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increment_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public Increment_operatorContext increment_operator() {
			return getRuleContext(Increment_operatorContext.class,0);
		}
		public Increment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterIncrement_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitIncrement_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitIncrement_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increment_expressionContext increment_expression() throws RecognitionException {
		Increment_expressionContext _localctx = new Increment_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_increment_expression);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(IDENTIFIER);
				setState(231);
				increment_operator();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				increment_operator();
				setState(233);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decrement_operatorContext extends ParserRuleContext {
		public Decrement_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterDecrement_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitDecrement_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitDecrement_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decrement_operatorContext decrement_operator() throws RecognitionException {
		Decrement_operatorContext _localctx = new Decrement_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decrement_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increment_operatorContext extends ParserRuleContext {
		public Increment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterIncrement_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitIncrement_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitIncrement_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increment_operatorContext increment_operator() throws RecognitionException {
		Increment_operatorContext _localctx = new Increment_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_increment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_commandContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_TO() { return getToken(LexinalParser.EQUALS_TO, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Assignment_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterAssignment_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitAssignment_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitAssignment_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_commandContext assignment_command() throws RecognitionException {
		Assignment_commandContext _localctx = new Assignment_commandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__4);
			setState(242);
			match(IDENTIFIER);
			setState(243);
			match(EQUALS_TO);
			setState(244);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ternary_exprContext extends ParserRuleContext {
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(LexinalParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(LexinalParser.BOOLEAN, i);
		}
		public List<TerminalNode> VALID_STRING() { return getTokens(LexinalParser.VALID_STRING); }
		public TerminalNode VALID_STRING(int i) {
			return getToken(LexinalParser.VALID_STRING, i);
		}
		public Ternary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterTernary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitTernary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitTernary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_exprContext ternary_expr() throws RecognitionException {
		Ternary_exprContext _localctx = new Ternary_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ternary_expr);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				cond_expr();
				setState(247);
				match(T__24);
				setState(248);
				exprs();
				setState(249);
				match(T__25);
				setState(250);
				exprs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				cond_expr();
				setState(253);
				match(T__24);
				setState(254);
				match(BOOLEAN);
				setState(255);
				match(T__25);
				setState(256);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				cond_expr();
				setState(259);
				match(T__24);
				setState(260);
				match(VALID_STRING);
				setState(261);
				match(T__25);
				setState(262);
				match(VALID_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LexinalParser.DIGITS, 0); }
		public TerminalNode BOOLEAN() { return getToken(LexinalParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LexinalParser.IDENTIFIER, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode VALID_STRING() { return getToken(LexinalParser.VALID_STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexinalListener ) ((LexinalListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexinalVisitor ) return ((LexinalVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__26);
			setState(267);
			match(T__7);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(268);
				match(DIGITS);
				}
				break;
			case 2:
				{
				setState(269);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(270);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(271);
				num_expr(0);
				}
				break;
			case 5:
				{
				setState(272);
				bool_expr(0);
				}
				break;
			case 6:
				{
				setState(273);
				match(VALID_STRING);
				}
				break;
			}
			setState(276);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 7:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
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
		"\u0004\u0001.\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u00017\b\u0001"+
		"\u000b\u0001\f\u00018\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003S\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003_\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003m\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005{\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0080\b\u0005\n\u0005\f\u0005\u0083\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u008f\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0093\b\u0007\u0001\u0007\u0003\u0007\u0096\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u009b\b\u0007\n\u0007\f\u0007\u009e"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab\t\t\u0001\t\u0003\t\u00ae\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00de\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e5\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ec\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0109\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0113\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0000"+
		"\u0002\n\u000e\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0004\u0002\u0000\"#()\u0001"+
		"\u0000$)\u0001\u0000\u001e!\u0002\u0000\u001c\u001c**\u0127\u00000\u0001"+
		"\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000"+
		"\u0000\u0006l\u0001\u0000\u0000\u0000\bp\u0001\u0000\u0000\u0000\nz\u0001"+
		"\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u0095\u0001\u0000"+
		"\u0000\u0000\u0010\u009f\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000"+
		"\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000"+
		"\u0000\u0000\u0018\u00ba\u0001\u0000\u0000\u0000\u001a\u00bf\u0001\u0000"+
		"\u0000\u0000\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00cd\u0001\u0000"+
		"\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000"+
		"\u0000$\u00eb\u0001\u0000\u0000\u0000&\u00ed\u0001\u0000\u0000\u0000("+
		"\u00ef\u0001\u0000\u0000\u0000*\u00f1\u0001\u0000\u0000\u0000,\u0108\u0001"+
		"\u0000\u0000\u0000.\u010a\u0001\u0000\u0000\u000001\u0005\u0001\u0000"+
		"\u000012\u0003\u0002\u0001\u000023\u0005\u0002\u0000\u00003\u0001\u0001"+
		"\u0000\u0000\u000046\u0005\u0003\u0000\u000057\u0003\u0004\u0002\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\u0004"+
		"\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<C\u0003\u0012\t\u0000=C\u0003"+
		"\u0018\f\u0000>C\u0003\u001a\r\u0000?C\u0003\u001e\u000f\u0000@C\u0003"+
		".\u0017\u0000AC\u0003\u0006\u0003\u0000B<\u0001\u0000\u0000\u0000B=\u0001"+
		"\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0005\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0005\u0000\u0000EH\u0005*\u0000\u0000FG\u0005,\u0000"+
		"\u0000GI\u0003\u000e\u0007\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000Im\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005"+
		"*\u0000\u0000LM\u0005,\u0000\u0000Mm\u0003,\u0016\u0000NO\u0005\u0006"+
		"\u0000\u0000OR\u0005*\u0000\u0000PQ\u0005,\u0000\u0000QS\u0003\n\u0005"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000Sm\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0006\u0000\u0000UX\u0005*\u0000\u0000VW\u0005,\u0000"+
		"\u0000WY\u0003,\u0016\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Ym\u0001\u0000\u0000\u0000Z[\u0005\u0007\u0000\u0000[^\u0005*\u0000"+
		"\u0000\\]\u0005,\u0000\u0000]_\u0005+\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_m\u0001\u0000\u0000\u0000`a\u0005\u0007"+
		"\u0000\u0000ad\u0005*\u0000\u0000bc\u0005,\u0000\u0000ce\u0003,\u0016"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000em\u0001\u0000"+
		"\u0000\u0000fg\u0005*\u0000\u0000gh\u0005,\u0000\u0000hm\u0003\u000e\u0007"+
		"\u0000ij\u0005*\u0000\u0000jk\u0005,\u0000\u0000km\u0003\n\u0005\u0000"+
		"lD\u0001\u0000\u0000\u0000lJ\u0001\u0000\u0000\u0000lN\u0001\u0000\u0000"+
		"\u0000lT\u0001\u0000\u0000\u0000lZ\u0001\u0000\u0000\u0000l`\u0001\u0000"+
		"\u0000\u0000lf\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000m\u0007"+
		"\u0001\u0000\u0000\u0000nq\u0003\u000e\u0007\u0000oq\u0003\n\u0005\u0000"+
		"pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\t\u0001\u0000\u0000"+
		"\u0000rs\u0006\u0005\uffff\uffff\u0000s{\u0003\f\u0006\u0000tu\u0005\b"+
		"\u0000\u0000uv\u0003\n\u0005\u0000vw\u0005\t\u0000\u0000w{\u0001\u0000"+
		"\u0000\u0000x{\u0005\u001d\u0000\u0000y{\u0005*\u0000\u0000zr\u0001\u0000"+
		"\u0000\u0000zt\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{\u0081\u0001\u0000\u0000\u0000|}\n\u0005\u0000\u0000"+
		"}~\u0007\u0000\u0000\u0000~\u0080\u0003\n\u0005\u0006\u007f|\u0001\u0000"+
		"\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u000b\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u000e"+
		"\u0007\u0000\u0085\u0086\u0007\u0001\u0000\u0000\u0086\u0087\u0003\u000e"+
		"\u0007\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u0089\u0006\u0007\uffff"+
		"\uffff\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a\u008b\u0003\u000e\u0007"+
		"\u0000\u008b\u008c\u0005\t\u0000\u0000\u008c\u0096\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0005\u001f\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0096\u0005\u001c\u0000\u0000\u0091\u0093\u0005\u001f\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0005*\u0000\u0000\u0095"+
		"\u0088\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000\u0000\u0095"+
		"\u0092\u0001\u0000\u0000\u0000\u0096\u009c\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\n\u0004\u0000\u0000\u0098\u0099\u0007\u0002\u0000\u0000\u0099\u009b"+
		"\u0003\u000e\u0007\u0005\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u000f\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a1\u0003"+
		"\n\u0005\u0000\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u0011\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a5\u0003\u0010\b"+
		"\u0000\u00a5\u00a9\u0003\u0002\u0001\u0000\u00a6\u00a8\u0003\u0014\n\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0003\u0016\u000b\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u000b\u0000\u0000\u00b0\u0013\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0005\f\u0000\u0000\u00b2\u00b3\u0003\u0010\b\u0000\u00b3"+
		"\u00b4\u0003\u0002\u0001\u0000\u00b4\u00b5\u0005\r\u0000\u0000\u00b5\u0015"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u000e\u0000\u0000\u00b7\u00b8"+
		"\u0003\u0002\u0001\u0000\u00b8\u00b9\u0005\u000f\u0000\u0000\u00b9\u0017"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0010\u0000\u0000\u00bb\u00bc"+
		"\u0003\u0010\b\u0000\u00bc\u00bd\u0003\u0002\u0001\u0000\u00bd\u00be\u0005"+
		"\u0011\u0000\u0000\u00be\u0019\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0012\u0000\u0000\u00c0\u00c1\u0005*\u0000\u0000\u00c1\u00c2\u0005\u0013"+
		"\u0000\u0000\u00c2\u00c3\u0005\u0014\u0000\u0000\u00c3\u00c4\u0005\b\u0000"+
		"\u0000\u00c4\u00c5\u0003\u001c\u000e\u0000\u00c5\u00c6\u0005\u0015\u0000"+
		"\u0000\u00c6\u00c7\u0003\u001c\u000e\u0000\u00c7\u00c8\u0005\t\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0002\u0001\u0000\u00c9\u00ca\u0005\u0016\u0000\u0000"+
		"\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0003\u0000\u0000"+
		"\u00cc\u001d\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0012\u0000\u0000"+
		"\u00ce\u00cf\u0005\b\u0000\u0000\u00cf\u00d0\u0003*\u0015\u0000\u00d0"+
		"\u00d1\u0005\u0015\u0000\u0000\u00d1\u00d2\u0003\n\u0005\u0000\u00d2\u00d3"+
		"\u0005\u0015\u0000\u0000\u00d3\u00d4\u0003 \u0010\u0000\u00d4\u00d5\u0005"+
		"\t\u0000\u0000\u00d5\u00d6\u0003\u0002\u0001\u0000\u00d6\u00d7\u0005\u0016"+
		"\u0000\u0000\u00d7\u001f\u0001\u0000\u0000\u0000\u00d8\u00de\u0003$\u0012"+
		"\u0000\u00d9\u00de\u0003\"\u0011\u0000\u00da\u00db\u0005*\u0000\u0000"+
		"\u00db\u00dc\u0005,\u0000\u0000\u00dc\u00de\u0003\u000e\u0007\u0000\u00dd"+
		"\u00d8\u0001\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd"+
		"\u00da\u0001\u0000\u0000\u0000\u00de!\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005*\u0000\u0000\u00e0\u00e5\u0003&\u0013\u0000\u00e1\u00e2\u0003&"+
		"\u0013\u0000\u00e2\u00e3\u0005*\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e4\u00df\u0001\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e5#\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005*\u0000\u0000\u00e7"+
		"\u00ec\u0003(\u0014\u0000\u00e8\u00e9\u0003(\u0014\u0000\u00e9\u00ea\u0005"+
		"*\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00ec%\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0017\u0000\u0000\u00ee\'\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0018\u0000\u0000\u00f0)\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0005\u0000\u0000\u00f2\u00f3\u0005*\u0000\u0000\u00f3\u00f4"+
		"\u0005,\u0000\u0000\u00f4\u00f5\u0003\u000e\u0007\u0000\u00f5+\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0003\u0010\b\u0000\u00f7\u00f8\u0005\u0019\u0000"+
		"\u0000\u00f8\u00f9\u0003\b\u0004\u0000\u00f9\u00fa\u0005\u001a\u0000\u0000"+
		"\u00fa\u00fb\u0003\b\u0004\u0000\u00fb\u0109\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0003\u0010\b\u0000\u00fd\u00fe\u0005\u0019\u0000\u0000\u00fe\u00ff"+
		"\u0005\u001d\u0000\u0000\u00ff\u0100\u0005\u001a\u0000\u0000\u0100\u0101"+
		"\u0005\u001d\u0000\u0000\u0101\u0109\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0003\u0010\b\u0000\u0103\u0104\u0005\u0019\u0000\u0000\u0104\u0105\u0005"+
		"+\u0000\u0000\u0105\u0106\u0005\u001a\u0000\u0000\u0106\u0107\u0005+\u0000"+
		"\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00f6\u0001\u0000\u0000"+
		"\u0000\u0108\u00fc\u0001\u0000\u0000\u0000\u0108\u0102\u0001\u0000\u0000"+
		"\u0000\u0109-\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u001b\u0000\u0000"+
		"\u010b\u0112\u0005\b\u0000\u0000\u010c\u0113\u0005\u001c\u0000\u0000\u010d"+
		"\u0113\u0005\u001d\u0000\u0000\u010e\u0113\u0005*\u0000\u0000\u010f\u0113"+
		"\u0003\u000e\u0007\u0000\u0110\u0113\u0003\n\u0005\u0000\u0111\u0113\u0005"+
		"+\u0000\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u010d\u0001\u0000"+
		"\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u010f\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0005\t\u0000"+
		"\u0000\u0115/\u0001\u0000\u0000\u0000\u00168BHRX^dlpz\u0081\u008e\u0092"+
		"\u0095\u009c\u00a9\u00ad\u00dd\u00e4\u00eb\u0108\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}