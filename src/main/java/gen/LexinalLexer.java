// Generated from C:/Users/gargs/OneDrive - Arizona State University/Desktop/Stuff/Class Stuff/SER 502/Project/Project_Workspace/src/main/antlr\Lexinal.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexinalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, DIGITS=26, BOOLEAN=27, ADD=28, SUB=29, MUL=30, DIV=31, AND=32, 
		OR=33, LESS_THAN=34, GREATER_THAN=35, LESS_THAN_OR_EQUL=36, MORE_THAN_OR_EQUL=37, 
		NOT_EQUL_TO=38, IS_EQUL_TO=39, IDENTIFIER=40, VALID_STRING=41, EQUALS_TO=42, 
		WHITE_SPACES=43, Comment=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"DIGITS", "BOOLEAN", "ADD", "SUB", "MUL", "DIV", "AND", "OR", "LESS_THAN", 
			"GREATER_THAN", "LESS_THAN_OR_EQUL", "MORE_THAN_OR_EQUL", "NOT_EQUL_TO", 
			"IS_EQUL_TO", "IDENTIFIER", "VALID_STRING", "EQUALS_TO", "WHITE_SPACES", 
			"Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
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
		return new String[] {
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


	public LexinalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexinal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u013b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\7\33\u00da\n\33\f\33\16\33\u00dd\13\33\3"+
		"\33\5\33\u00e0\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00eb\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\7)\u010f"+
		"\n)\f)\16)\u0112\13)\3*\3*\7*\u0116\n*\f*\16*\u0119\13*\3*\3*\3+\3+\3"+
		",\6,\u0120\n,\r,\16,\u0121\3,\3,\3-\3-\7-\u0128\n-\f-\16-\u012b\13-\3"+
		"-\3-\3-\3-\7-\u0131\n-\f-\16-\u0134\13-\3-\3-\5-\u0138\n-\3-\3-\3\u0132"+
		"\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\t\3\2\63;\3\2\62;\5\2C\\aac|"+
		"\6\2\62;C\\aac|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0143"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\tc\3"+
		"\2\2\2\13k\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25\u0080"+
		"\3\2\2\2\27\u0087\3\2\2\2\31\u0092\3\2\2\2\33\u0097\3\2\2\2\35\u00a0\3"+
		"\2\2\2\37\u00a6\3\2\2\2!\u00b0\3\2\2\2#\u00b4\3\2\2\2%\u00b7\3\2\2\2\'"+
		"\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c7\3\2\2\2-\u00ca\3\2\2\2/\u00cd\3\2"+
		"\2\2\61\u00cf\3\2\2\2\63\u00d1\3\2\2\2\65\u00df\3\2\2\2\67\u00ea\3\2\2"+
		"\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f2\3\2\2\2A\u00f4"+
		"\3\2\2\2C\u00f8\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I\u00ff\3\2\2\2K"+
		"\u0102\3\2\2\2M\u0105\3\2\2\2O\u0109\3\2\2\2Q\u010c\3\2\2\2S\u0113\3\2"+
		"\2\2U\u011c\3\2\2\2W\u011f\3\2\2\2Y\u0137\3\2\2\2[\\\7}\2\2\\\4\3\2\2"+
		"\2]^\7\177\2\2^\6\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2b\b\3\2\2\2cd\7d\2"+
		"\2de\7q\2\2ef\7q\2\2fg\7n\2\2gh\7g\2\2hi\7c\2\2ij\7p\2\2j\n\3\2\2\2kl"+
		"\7u\2\2lm\7v\2\2mn\7t\2\2no\7k\2\2op\7p\2\2pq\7i\2\2q\f\3\2\2\2rs\7*\2"+
		"\2s\16\3\2\2\2tu\7+\2\2u\20\3\2\2\2vw\7k\2\2wx\7h\2\2x\22\3\2\2\2yz\7"+
		"g\2\2z{\7p\2\2{|\7f\2\2|}\7/\2\2}~\7k\2\2~\177\7h\2\2\177\24\3\2\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2"+
		"\u0084\u0085\7K\2\2\u0085\u0086\7h\2\2\u0086\26\3\2\2\2\u0087\u0088\7"+
		"g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7f\2\2\u008a\u008b\7/\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0091\7h\2\2\u0091\30\3\2\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\32\3\2\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a\u009b\7/\2\2"+
		"\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f"+
		"\7g\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\36\3\2\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7/\2\2\u00aa"+
		"\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7n\2\2"+
		"\u00ae\u00af\7g\2\2\u00af \3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7q\2"+
		"\2\u00b2\u00b3\7t\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7"+
		"p\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7g\2\2\u00bc&\3\2\2\2\u00bd\u00be"+
		"\7=\2\2\u00be(\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2"+
		"\7f\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\u00c9\7/\2\2\u00c9"+
		",\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc\7-\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\7A\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0\62\3\2\2\2\u00d1\u00d2"+
		"\7r\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\64\3\2\2\2\u00d7\u00db\t\2\2\2\u00d8\u00da\t\3\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\7\62\2\2"+
		"\u00df\u00d7\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\66\3\2\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4\u00eb\7g\2\2\u00e5"+
		"\u00e6\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7u\2\2"+
		"\u00e9\u00eb\7g\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb8\3\2"+
		"\2\2\u00ec\u00ed\7-\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef<\3\2\2"+
		"\2\u00f0\u00f1\7,\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3@\3\2\2"+
		"\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7f\2\2\u00f7B\3\2"+
		"\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00faD\3\2\2\2\u00fb\u00fc"+
		"\7>\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7@\2\2\u00feH\3\2\2\2\u00ff\u0100\7"+
		">\2\2\u0100\u0101\7?\2\2\u0101J\3\2\2\2\u0102\u0103\7@\2\2\u0103\u0104"+
		"\7?\2\2\u0104L\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107\7q\2\2\u0107\u0108"+
		"\7v\2\2\u0108N\3\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\7?\2\2\u010bP\3"+
		"\2\2\2\u010c\u0110\t\4\2\2\u010d\u010f\t\5\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111R\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0113\u0117\7<\2\2\u0114\u0116\t\6\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7<\2\2\u011bT\3\2\2\2\u011c"+
		"\u011d\7?\2\2\u011dV\3\2\2\2\u011e\u0120\t\7\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0124\b,\2\2\u0124X\3\2\2\2\u0125\u0129\7%\2\2\u0126\u0128"+
		"\n\b\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u0138\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\61"+
		"\2\2\u012d\u012e\7%\2\2\u012e\u0132\3\2\2\2\u012f\u0131\13\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0133\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7%\2\2\u0136"+
		"\u0138\7\61\2\2\u0137\u0125\3\2\2\2\u0137\u012c\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0139\u013a\b-\2\2\u013aZ\3\2\2\2\f\2\u00db\u00df\u00ea\u0110\u0117"+
		"\u0121\u0129\u0132\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}