// Generated from C:/Users/gargs/OneDrive - Arizona State University/Desktop/Stuff/Class Stuff/SER 502/Project/Project_Workspace/src/main/antlr\Lexinal.g4 by ANTLR 4.9.2
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, DIGITS=23, BOOLEAN=24, 
		ADD=25, SUB=26, MUL=27, DIV=28, AND=29, OR=30, LESS_THAN=31, GREATER_THAN=32, 
		LESS_THAN_OR_EQUL=33, MORE_THAN_OR_EQUL=34, NOT_EQUL_TO=35, IS_EQUL_TO=36, 
		IDENTIFIER=37, VALID_STRING=38, EQUALS_TO=39, WHITE_SPACES=40, Comment=41;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "DIGITS", "BOOLEAN", "ADD", 
			"SUB", "MUL", "DIV", "AND", "OR", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUL", 
			"MORE_THAN_OR_EQUL", "NOT_EQUL_TO", "IS_EQUL_TO", "IDENTIFIER", "VALID_STRING", 
			"EQUALS_TO", "WHITE_SPACES", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'int'", "'boolean'", "'string'", "'('", "')'", "'if'", 
			"'end-if'", "'elseIf'", "'else'", "'while'", "'end-while'", "'for'", 
			"'in'", "'range'", "';'", "'--'", "'++'", "'?'", "':'", "'print'", null, 
			null, "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'<'", "'>'", "'<='", 
			"'>='", "'not'", "'=='", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "DIGITS", 
			"BOOLEAN", "ADD", "SUB", "MUL", "DIV", "AND", "OR", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUL", "MORE_THAN_OR_EQUL", "NOT_EQUL_TO", "IS_EQUL_TO", 
			"IDENTIFIER", "VALID_STRING", "EQUALS_TO", "WHITE_SPACES", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\7\30\u00b8\n\30\f\30\16\30\u00bb\13\30\3\30\5\30\u00be"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c9\n\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\7&\u00ed"+
		"\n&\f&\16&\u00f0\13&\3\'\3\'\7\'\u00f4\n\'\f\'\16\'\u00f7\13\'\3\'\3\'"+
		"\3(\3(\3)\6)\u00fe\n)\r)\16)\u00ff\3)\3)\3*\3*\7*\u0106\n*\f*\16*\u0109"+
		"\13*\3*\3*\3*\3*\7*\u010f\n*\f*\16*\u0112\13*\3*\3*\5*\u0116\n*\3*\3*"+
		"\3\u0110\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\t\3\2\63;\3\2\62;\5\2C\\aac"+
		"|\6\2\62;C\\aac|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0121"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3"+
		"U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t]\3\2\2\2\13e\3\2\2\2\rl\3\2\2\2\17n"+
		"\3\2\2\2\21p\3\2\2\2\23s\3\2\2\2\25z\3\2\2\2\27\u0081\3\2\2\2\31\u0086"+
		"\3\2\2\2\33\u008c\3\2\2\2\35\u0096\3\2\2\2\37\u009a\3\2\2\2!\u009d\3\2"+
		"\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a8\3\2\2\2)\u00ab\3\2\2\2+\u00ad"+
		"\3\2\2\2-\u00af\3\2\2\2/\u00bd\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2"+
		"\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d6"+
		"\3\2\2\2?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00e0\3\2\2\2G"+
		"\u00e3\3\2\2\2I\u00e7\3\2\2\2K\u00ea\3\2\2\2M\u00f1\3\2\2\2O\u00fa\3\2"+
		"\2\2Q\u00fd\3\2\2\2S\u0115\3\2\2\2UV\7}\2\2V\4\3\2\2\2WX\7\177\2\2X\6"+
		"\3\2\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\\b\3\2\2\2]^\7d\2\2^_\7q\2\2_`\7"+
		"q\2\2`a\7n\2\2ab\7g\2\2bc\7c\2\2cd\7p\2\2d\n\3\2\2\2ef\7u\2\2fg\7v\2\2"+
		"gh\7t\2\2hi\7k\2\2ij\7p\2\2jk\7i\2\2k\f\3\2\2\2lm\7*\2\2m\16\3\2\2\2n"+
		"o\7+\2\2o\20\3\2\2\2pq\7k\2\2qr\7h\2\2r\22\3\2\2\2st\7g\2\2tu\7p\2\2u"+
		"v\7f\2\2vw\7/\2\2wx\7k\2\2xy\7h\2\2y\24\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7"+
		"u\2\2}~\7g\2\2~\177\7K\2\2\177\u0080\7h\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085"+
		"\30\3\2\2\2\u0086\u0087\7y\2\2\u0087\u0088\7j\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\32\3\2\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\7p\2\2\u008e\u008f\7f\2\2\u008f\u0090\7/\2\2\u0090\u0091\7y\2\2"+
		"\u0091\u0092\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2\u0094\u0095"+
		"\7g\2\2\u0095\34\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098\u0099"+
		"\7t\2\2\u0099\36\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c "+
		"\3\2\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7i\2\2\u00a1\u00a2\7g\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7=\2\2\u00a4"+
		"$\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7/\2\2\u00a7&\3\2\2\2\u00a8\u00a9"+
		"\7-\2\2\u00a9\u00aa\7-\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7A\2\2\u00ac*\3"+
		"\2\2\2\u00ad\u00ae\7<\2\2\u00ae,\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		".\3\2\2\2\u00b5\u00b9\t\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\7\62\2\2\u00bd\u00b5\3\2\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7"+
		"t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c9\7g\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c9\7g\2\2\u00c8"+
		"\u00bf\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7-\2\2"+
		"\u00cb\64\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7,\2"+
		"\2\u00cf8\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7c\2"+
		"\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7f\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7"+
		"q\2\2\u00d7\u00d8\7t\2\2\u00d8>\3\2\2\2\u00d9\u00da\7>\2\2\u00da@\3\2"+
		"\2\2\u00db\u00dc\7@\2\2\u00dcB\3\2\2\2\u00dd\u00de\7>\2\2\u00de\u00df"+
		"\7?\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7?\2\2\u00e2F\3"+
		"\2\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"H\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9\7?\2\2\u00e9J\3\2\2\2\u00ea\u00ee"+
		"\t\4\2\2\u00eb\u00ed\t\5\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efL\3\2\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f1\u00f5\7<\2\2\u00f2\u00f4\t\6\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7<\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"P\3\2\2\2\u00fc\u00fe\t\7\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\b)\2\2\u0102R\3\2\2\2\u0103\u0107\7%\2\2\u0104\u0106\n\b\2\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0116\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\61\2\2\u010b\u010c\7"+
		"%\2\2\u010c\u0110\3\2\2\2\u010d\u010f\13\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7%\2\2\u0114\u0116\7\61\2\2\u0115"+
		"\u0103\3\2\2\2\u0115\u010a\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\b*"+
		"\2\2\u0118T\3\2\2\2\f\2\u00b9\u00bd\u00c8\u00ee\u00f5\u00ff\u0107\u0110"+
		"\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}