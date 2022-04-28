// Generated from C:/Users/gargs/OneDrive - Arizona State University/Desktop/Stuff/Class Stuff/SER 502/Project/Project_Workspace/src/main/antlr\Lexinal.g4 by ANTLR 4.10.1
package gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexinalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, DIGITS=29, BOOLEAN=30, ADD=31, 
		SUB=32, MUL=33, DIV=34, AND=35, OR=36, LESS_THAN=37, GREATER_THAN=38, 
		LESS_THAN_OR_EQUL=39, MORE_THAN_OR_EQUL=40, NOT_EQUL_TO=41, IS_EQUL_TO=42, 
		IDENTIFIER=43, VALID_STRING=44, EQUALS_TO=45, WHITE_SPACES=46, Comment=47;
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
			"T__25", "T__26", "T__27", "DIGITS", "BOOLEAN", "ADD", "SUB", "MUL", 
			"DIV", "AND", "OR", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUL", 
			"MORE_THAN_OR_EQUL", "NOT_EQUL_TO", "IS_EQUL_TO", "IDENTIFIER", "VALID_STRING", 
			"EQUALS_TO", "WHITE_SPACES", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'end'", "'{'", "'}'", "'int'", "'boolean'", "'string'", 
			"'('", "')'", "'if'", "'end-if'", "'elseIf'", "'end-elseIf'", "'else'", 
			"'end-else'", "'while'", "'end-while'", "'for'", "'in'", "'range'", "';'", 
			"'end-for'", "'--'", "'++'", "'?'", "':'", "'print'", "','", null, null, 
			"'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'<'", "'>'", "'<='", "'>='", 
			"'not'", "'=='", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DIGITS", "BOOLEAN", "ADD", "SUB", "MUL", 
			"DIV", "AND", "OR", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUL", 
			"MORE_THAN_OR_EQUL", "NOT_EQUL_TO", "IS_EQUL_TO", "IDENTIFIER", "VALID_STRING", 
			"EQUALS_TO", "WHITE_SPACES", "Comment"
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
		"\u0004\u0000/\u014b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u00ea\b\u001c\n\u001c\f\u001c\u00ed\t\u001c\u0001\u001c\u0003"+
		"\u001c\u00f0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00fb"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0005*\u011f"+
		"\b*\n*\f*\u0122\t*\u0001+\u0001+\u0005+\u0126\b+\n+\f+\u0129\t+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0004-\u0130\b-\u000b-\f-\u0131\u0001-\u0001"+
		"-\u0001.\u0001.\u0005.\u0138\b.\n.\f.\u013b\t.\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u0141\b.\n.\f.\u0144\t.\u0001.\u0001.\u0003.\u0148\b.\u0001."+
		"\u0001.\u0001\u0142\u0000/\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/\u0001\u0000\u0006\u0001"+
		"\u000019\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000\n\n\r\r\u0153\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0001_\u0001\u0000\u0000"+
		"\u0000\u0003e\u0001\u0000\u0000\u0000\u0005i\u0001\u0000\u0000\u0000\u0007"+
		"k\u0001\u0000\u0000\u0000\tm\u0001\u0000\u0000\u0000\u000bq\u0001\u0000"+
		"\u0000\u0000\ry\u0001\u0000\u0000\u0000\u000f\u0080\u0001\u0000\u0000"+
		"\u0000\u0011\u0082\u0001\u0000\u0000\u0000\u0013\u0084\u0001\u0000\u0000"+
		"\u0000\u0015\u0087\u0001\u0000\u0000\u0000\u0017\u008e\u0001\u0000\u0000"+
		"\u0000\u0019\u0095\u0001\u0000\u0000\u0000\u001b\u00a0\u0001\u0000\u0000"+
		"\u0000\u001d\u00a5\u0001\u0000\u0000\u0000\u001f\u00ae\u0001\u0000\u0000"+
		"\u0000!\u00b4\u0001\u0000\u0000\u0000#\u00be\u0001\u0000\u0000\u0000%"+
		"\u00c2\u0001\u0000\u0000\u0000\'\u00c5\u0001\u0000\u0000\u0000)\u00cb"+
		"\u0001\u0000\u0000\u0000+\u00cd\u0001\u0000\u0000\u0000-\u00d5\u0001\u0000"+
		"\u0000\u0000/\u00d8\u0001\u0000\u0000\u00001\u00db\u0001\u0000\u0000\u0000"+
		"3\u00dd\u0001\u0000\u0000\u00005\u00df\u0001\u0000\u0000\u00007\u00e5"+
		"\u0001\u0000\u0000\u00009\u00ef\u0001\u0000\u0000\u0000;\u00fa\u0001\u0000"+
		"\u0000\u0000=\u00fc\u0001\u0000\u0000\u0000?\u00fe\u0001\u0000\u0000\u0000"+
		"A\u0100\u0001\u0000\u0000\u0000C\u0102\u0001\u0000\u0000\u0000E\u0104"+
		"\u0001\u0000\u0000\u0000G\u0108\u0001\u0000\u0000\u0000I\u010b\u0001\u0000"+
		"\u0000\u0000K\u010d\u0001\u0000\u0000\u0000M\u010f\u0001\u0000\u0000\u0000"+
		"O\u0112\u0001\u0000\u0000\u0000Q\u0115\u0001\u0000\u0000\u0000S\u0119"+
		"\u0001\u0000\u0000\u0000U\u011c\u0001\u0000\u0000\u0000W\u0123\u0001\u0000"+
		"\u0000\u0000Y\u012c\u0001\u0000\u0000\u0000[\u012f\u0001\u0000\u0000\u0000"+
		"]\u0147\u0001\u0000\u0000\u0000_`\u0005s\u0000\u0000`a\u0005t\u0000\u0000"+
		"ab\u0005a\u0000\u0000bc\u0005r\u0000\u0000cd\u0005t\u0000\u0000d\u0002"+
		"\u0001\u0000\u0000\u0000ef\u0005e\u0000\u0000fg\u0005n\u0000\u0000gh\u0005"+
		"d\u0000\u0000h\u0004\u0001\u0000\u0000\u0000ij\u0005{\u0000\u0000j\u0006"+
		"\u0001\u0000\u0000\u0000kl\u0005}\u0000\u0000l\b\u0001\u0000\u0000\u0000"+
		"mn\u0005i\u0000\u0000no\u0005n\u0000\u0000op\u0005t\u0000\u0000p\n\u0001"+
		"\u0000\u0000\u0000qr\u0005b\u0000\u0000rs\u0005o\u0000\u0000st\u0005o"+
		"\u0000\u0000tu\u0005l\u0000\u0000uv\u0005e\u0000\u0000vw\u0005a\u0000"+
		"\u0000wx\u0005n\u0000\u0000x\f\u0001\u0000\u0000\u0000yz\u0005s\u0000"+
		"\u0000z{\u0005t\u0000\u0000{|\u0005r\u0000\u0000|}\u0005i\u0000\u0000"+
		"}~\u0005n\u0000\u0000~\u007f\u0005g\u0000\u0000\u007f\u000e\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005(\u0000\u0000\u0081\u0010\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005)\u0000\u0000\u0083\u0012\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005i\u0000\u0000\u0085\u0086\u0005f\u0000\u0000\u0086\u0014"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u0089\u0005"+
		"n\u0000\u0000\u0089\u008a\u0005d\u0000\u0000\u008a\u008b\u0005-\u0000"+
		"\u0000\u008b\u008c\u0005i\u0000\u0000\u008c\u008d\u0005f\u0000\u0000\u008d"+
		"\u0016\u0001\u0000\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090"+
		"\u0005l\u0000\u0000\u0090\u0091\u0005s\u0000\u0000\u0091\u0092\u0005e"+
		"\u0000\u0000\u0092\u0093\u0005I\u0000\u0000\u0093\u0094\u0005f\u0000\u0000"+
		"\u0094\u0018\u0001\u0000\u0000\u0000\u0095\u0096\u0005e\u0000\u0000\u0096"+
		"\u0097\u0005n\u0000\u0000\u0097\u0098\u0005d\u0000\u0000\u0098\u0099\u0005"+
		"-\u0000\u0000\u0099\u009a\u0005e\u0000\u0000\u009a\u009b\u0005l\u0000"+
		"\u0000\u009b\u009c\u0005s\u0000\u0000\u009c\u009d\u0005e\u0000\u0000\u009d"+
		"\u009e\u0005I\u0000\u0000\u009e\u009f\u0005f\u0000\u0000\u009f\u001a\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005e\u0000\u0000\u00a1\u00a2\u0005l\u0000"+
		"\u0000\u00a2\u00a3\u0005s\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4"+
		"\u001c\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u00a7"+
		"\u0005n\u0000\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8\u00a9\u0005-"+
		"\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa\u00ab\u0005l\u0000\u0000"+
		"\u00ab\u00ac\u0005s\u0000\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u001e"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005w\u0000\u0000\u00af\u00b0\u0005"+
		"h\u0000\u0000\u00b0\u00b1\u0005i\u0000\u0000\u00b1\u00b2\u0005l\u0000"+
		"\u0000\u00b2\u00b3\u0005e\u0000\u0000\u00b3 \u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005e\u0000\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6\u00b7\u0005"+
		"d\u0000\u0000\u00b7\u00b8\u0005-\u0000\u0000\u00b8\u00b9\u0005w\u0000"+
		"\u0000\u00b9\u00ba\u0005h\u0000\u0000\u00ba\u00bb\u0005i\u0000\u0000\u00bb"+
		"\u00bc\u0005l\u0000\u0000\u00bc\u00bd\u0005e\u0000\u0000\u00bd\"\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005f\u0000\u0000\u00bf\u00c0\u0005o\u0000"+
		"\u0000\u00c0\u00c1\u0005r\u0000\u0000\u00c1$\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005i\u0000\u0000\u00c3\u00c4\u0005n\u0000\u0000\u00c4&\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005r\u0000\u0000\u00c6\u00c7\u0005a\u0000"+
		"\u0000\u00c7\u00c8\u0005n\u0000\u0000\u00c8\u00c9\u0005g\u0000\u0000\u00c9"+
		"\u00ca\u0005e\u0000\u0000\u00ca(\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		";\u0000\u0000\u00cc*\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005e\u0000"+
		"\u0000\u00ce\u00cf\u0005n\u0000\u0000\u00cf\u00d0\u0005d\u0000\u0000\u00d0"+
		"\u00d1\u0005-\u0000\u0000\u00d1\u00d2\u0005f\u0000\u0000\u00d2\u00d3\u0005"+
		"o\u0000\u0000\u00d3\u00d4\u0005r\u0000\u0000\u00d4,\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005-\u0000\u0000\u00d6\u00d7\u0005-\u0000\u0000\u00d7"+
		".\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005+\u0000\u0000\u00d9\u00da\u0005"+
		"+\u0000\u0000\u00da0\u0001\u0000\u0000\u0000\u00db\u00dc\u0005?\u0000"+
		"\u0000\u00dc2\u0001\u0000\u0000\u0000\u00dd\u00de\u0005:\u0000\u0000\u00de"+
		"4\u0001\u0000\u0000\u0000\u00df\u00e0\u0005p\u0000\u0000\u00e0\u00e1\u0005"+
		"r\u0000\u0000\u00e1\u00e2\u0005i\u0000\u0000\u00e2\u00e3\u0005n\u0000"+
		"\u0000\u00e3\u00e4\u0005t\u0000\u0000\u00e46\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005,\u0000\u0000\u00e68\u0001\u0000\u0000\u0000\u00e7\u00eb\u0007"+
		"\u0000\u0000\u0000\u00e8\u00ea\u0007\u0001\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005"+
		"0\u0000\u0000\u00ef\u00e7\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0:\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005t\u0000\u0000"+
		"\u00f2\u00f3\u0005r\u0000\u0000\u00f3\u00f4\u0005u\u0000\u0000\u00f4\u00fb"+
		"\u0005e\u0000\u0000\u00f5\u00f6\u0005f\u0000\u0000\u00f6\u00f7\u0005a"+
		"\u0000\u0000\u00f7\u00f8\u0005l\u0000\u0000\u00f8\u00f9\u0005s\u0000\u0000"+
		"\u00f9\u00fb\u0005e\u0000\u0000\u00fa\u00f1\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fb<\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005+\u0000\u0000\u00fd>\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005-"+
		"\u0000\u0000\u00ff@\u0001\u0000\u0000\u0000\u0100\u0101\u0005*\u0000\u0000"+
		"\u0101B\u0001\u0000\u0000\u0000\u0102\u0103\u0005/\u0000\u0000\u0103D"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005a\u0000\u0000\u0105\u0106\u0005"+
		"n\u0000\u0000\u0106\u0107\u0005d\u0000\u0000\u0107F\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005o\u0000\u0000\u0109\u010a\u0005r\u0000\u0000\u010a"+
		"H\u0001\u0000\u0000\u0000\u010b\u010c\u0005<\u0000\u0000\u010cJ\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005>\u0000\u0000\u010eL\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005<\u0000\u0000\u0110\u0111\u0005=\u0000\u0000\u0111"+
		"N\u0001\u0000\u0000\u0000\u0112\u0113\u0005>\u0000\u0000\u0113\u0114\u0005"+
		"=\u0000\u0000\u0114P\u0001\u0000\u0000\u0000\u0115\u0116\u0005n\u0000"+
		"\u0000\u0116\u0117\u0005o\u0000\u0000\u0117\u0118\u0005t\u0000\u0000\u0118"+
		"R\u0001\u0000\u0000\u0000\u0119\u011a\u0005=\u0000\u0000\u011a\u011b\u0005"+
		"=\u0000\u0000\u011bT\u0001\u0000\u0000\u0000\u011c\u0120\u0007\u0002\u0000"+
		"\u0000\u011d\u011f\u0007\u0003\u0000\u0000\u011e\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121V\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0127\u0005:\u0000\u0000\u0124"+
		"\u0126\u0007\u0003\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005:\u0000\u0000\u012bX\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005=\u0000\u0000\u012dZ\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0007\u0004\u0000\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0006-\u0000\u0000\u0134\\\u0001\u0000\u0000\u0000"+
		"\u0135\u0139\u0005#\u0000\u0000\u0136\u0138\b\u0005\u0000\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u0148\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0005/\u0000\u0000\u013d\u013e\u0005#\u0000\u0000\u013e\u0142\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\t\u0000\u0000\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000"+
		"\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0005#\u0000"+
		"\u0000\u0146\u0148\u0005/\u0000\u0000\u0147\u0135\u0001\u0000\u0000\u0000"+
		"\u0147\u013c\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0006.\u0000\u0000\u014a^\u0001\u0000\u0000\u0000\n\u0000"+
		"\u00eb\u00ef\u00fa\u0120\u0127\u0131\u0139\u0142\u0147\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}