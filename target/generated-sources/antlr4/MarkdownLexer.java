// Generated from MarkdownLexer.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, STARTORDER=2, STARTUNORDER=3, REAL=4, DIGIT=5, ESCAPEDCHARS=6, 
		BOLD=7, ITALICS=8, STRIKETHROUGH=9, HORIZONTALRULE=10, HEADER=11, WHITESPACE=12, 
		STAR=13, WHOLENUMBERSELECTION=14, REALNUMBERSELECTION=15, WORDCLOUD=16, 
		BACKSLASH=17, TABLESEPARATOR=18, EXCLAMATIONMARK=19, QUOTE=20, HASH=21, 
		SLASH=22, LPAREN=23, RPAREN=24, LBRACKET=25, RBRACKET=26, LBRACE=27, RBRACE=28, 
		DOT=29, COLON=30, COMMA=31, SEMICOLON=32, UNDERSCORE=33, PLUS=34, MINUS=35, 
		ASTERISK=36, TILDE=37, BACKTICK=38, GREATERTHAN=39, EQUAL=40, QUESTIONMARK=41, 
		NEWLINE=42, WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TEXT", "STARTORDER", "STARTUNORDER", "REAL", "DIGIT", "ESCAPEDCHARS", 
		"BOLD", "ITALICS", "STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "WHITESPACE", 
		"STAR", "WHOLENUMBERSELECTION", "REALNUMBERSELECTION", "WORDCLOUD", "BACKSLASH", 
		"TABLESEPARATOR", "EXCLAMATIONMARK", "QUOTE", "HASH", "SLASH", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DOT", "COLON", 
		"COMMA", "SEMICOLON", "UNDERSCORE", "PLUS", "MINUS", "ASTERISK", "TILDE", 
		"BACKTICK", "GREATERTHAN", "EQUAL", "QUESTIONMARK", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'\\'", "'|'", "'!'", "'\"'", "'#'", "'/'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "':'", "','", "';'", 
		"'_'", "'+'", "'-'", "'*'", "'~'", "'`'", "'>'", "'='", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXT", "STARTORDER", "STARTUNORDER", "REAL", "DIGIT", "ESCAPEDCHARS", 
		"BOLD", "ITALICS", "STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "WHITESPACE", 
		"STAR", "WHOLENUMBERSELECTION", "REALNUMBERSELECTION", "WORDCLOUD", "BACKSLASH", 
		"TABLESEPARATOR", "EXCLAMATIONMARK", "QUOTE", "HASH", "SLASH", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DOT", "COLON", 
		"COMMA", "SEMICOLON", "UNDERSCORE", "PLUS", "MINUS", "ASTERISK", "TILDE", 
		"BACKTICK", "GREATERTHAN", "EQUAL", "QUESTIONMARK", "NEWLINE", "WS"
	};
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


	public MarkdownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarkdownLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0157\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\6\2^\n\2\r\2\16\2_\3\2\5\2c\n\2\3\2\5\2f\n\2\3\2"+
		"\6\2i\n\2\r\2\16\2j\3\2\5\2n\n\2\7\2p\n\2\f\2\16\2s\13\2\5\2u\n\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\6\6\u0083\n\6\r\6\16\6\u0084"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095\n\7"+
		"\6\7\u0097\n\7\r\7\16\7\u0098\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\6\b\u00a6\n\b\r\b\16\b\u00a7\3\b\3\b\3\b\7\b\u00ad"+
		"\n\b\f\b\16\b\u00b0\13\b\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\t\3\t"+
		"\3\t\3\t\6\t\u00bc\n\t\r\t\16\t\u00bd\3\t\3\t\7\t\u00c2\n\t\f\t\16\t\u00c5"+
		"\13\t\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb\13\n\3\n\3\n\3\n\3\n\3\n\6\n\u00d2"+
		"\n\n\r\n\16\n\u00d3\3\n\3\n\3\n\7\n\u00d9\n\n\f\n\16\n\u00dc\13\n\3\13"+
		"\3\13\3\13\3\13\6\13\u00e2\n\13\r\13\16\13\u00e3\3\f\6\f\u00e7\n\f\r\f"+
		"\16\f\u00e8\3\f\3\f\3\f\3\f\6\f\u00ef\n\f\r\f\16\f\u00f0\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\5\20\u010b\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\5+\u014d\n+\3+\3+\3,\6,\u0152"+
		"\n,\r,\16,\u0153\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\5\5\2\62"+
		";C\\c|\3\2\62;\5\2\13\13\"\"))\u0185\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3t\3\2\2\2\5v"+
		"\3\2\2\2\7z\3\2\2\2\t}\3\2\2\2\13\u0082\3\2\2\2\r\u0096\3\2\2\2\17\u009d"+
		"\3\2\2\2\21\u00b4\3\2\2\2\23\u00c9\3\2\2\2\25\u00dd\3\2\2\2\27\u00e6\3"+
		"\2\2\2\31\u00f2\3\2\2\2\33\u00fa\3\2\2\2\35\u0101\3\2\2\2\37\u0105\3\2"+
		"\2\2!\u010e\3\2\2\2#\u0119\3\2\2\2%\u011b\3\2\2\2\'\u011d\3\2\2\2)\u011f"+
		"\3\2\2\2+\u0121\3\2\2\2-\u0123\3\2\2\2/\u0125\3\2\2\2\61\u0127\3\2\2\2"+
		"\63\u0129\3\2\2\2\65\u012b\3\2\2\2\67\u012d\3\2\2\29\u012f\3\2\2\2;\u0131"+
		"\3\2\2\2=\u0133\3\2\2\2?\u0135\3\2\2\2A\u0137\3\2\2\2C\u0139\3\2\2\2E"+
		"\u013b\3\2\2\2G\u013d\3\2\2\2I\u013f\3\2\2\2K\u0141\3\2\2\2M\u0143\3\2"+
		"\2\2O\u0145\3\2\2\2Q\u0147\3\2\2\2S\u0149\3\2\2\2U\u014c\3\2\2\2W\u0151"+
		"\3\2\2\2Yu\5\21\t\2Zu\5\17\b\2[u\5\23\n\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2ac\5\r\7\2b]\3\2\2\2ba\3\2\2\2cq\3\2"+
		"\2\2df\7\"\2\2ed\3\2\2\2ef\3\2\2\2fm\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2ln\5\r\7\2mh\3\2\2\2ml\3\2\2\2np\3\2"+
		"\2\2oe\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tY\3\2"+
		"\2\2tZ\3\2\2\2t[\3\2\2\2tb\3\2\2\2u\4\3\2\2\2vw\5\13\6\2wx\5;\36\2xy\7"+
		"\"\2\2y\6\3\2\2\2z{\5G$\2{|\7\"\2\2|\b\3\2\2\2}~\5\13\6\2~\177\5;\36\2"+
		"\177\u0080\5\13\6\2\u0080\n\3\2\2\2\u0081\u0083\t\3\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\f\3\2\2\2\u0086\u0094\5#\22\2\u0087\u0095\5#\22\2\u0088\u0095\5M\'\2"+
		"\u0089\u0095\5I%\2\u008a\u0095\5C\"\2\u008b\u0095\5\63\32\2\u008c\u0095"+
		"\5\65\33\2\u008d\u0095\5/\30\2\u008e\u0095\5\61\31\2\u008f\u0095\5+\26"+
		"\2\u0090\u0095\5E#\2\u0091\u0095\5G$\2\u0092\u0095\5;\36\2\u0093\u0095"+
		"\5\'\24\2\u0094\u0087\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u0089\3\2\2\2"+
		"\u0094\u008a\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d"+
		"\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0086\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\16\3\2\2\2\u009a\u009c\7\"\2\2\u009b\u009a\3\2\2"+
		"\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5I%\2\u00a1\u00a5\5I%\2\u00a2"+
		"\u00a6\5\3\2\2\u00a3\u00a6\5\21\t\2\u00a4\u00a6\5\23\n\2\u00a5\u00a2\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5I"+
		"%\2\u00aa\u00ae\5I%\2\u00ab\u00ad\7\"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\20\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b3\7\"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00bb\5C\"\2\u00b8\u00bc\5\3\2\2\u00b9\u00bc\5\17"+
		"\b\2\u00ba\u00bc\5\23\n\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\5C\"\2\u00c0\u00c2\7\"\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\22\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7\"\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5K&\2\u00cd\u00d1\5K&\2"+
		"\u00ce\u00d2\5\3\2\2\u00cf\u00d2\5\21\t\2\u00d0\u00d2\5\17\b\2\u00d1\u00ce"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5K"+
		"&\2\u00d6\u00da\5K&\2\u00d7\u00d9\7\"\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\24\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\5U+\2\u00de\u00df\5I%\2\u00df\u00e1\5I%\2\u00e0"+
		"\u00e2\5I%\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e3\u00e4\3\2\2\2\u00e4\26\3\2\2\2\u00e5\u00e7\5+\26\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ee\3\2\2\2\u00ea\u00ef\5\3\2\2\u00eb\u00ef\5\21\t\2\u00ec\u00ef\5"+
		"\17\b\2\u00ed\u00ef\5\23\n\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\30\3\2\2\2\u00f2\u00f3\5#\22\2\u00f3\u00f4"+
		"\7u\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7e\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7u\2\2\u00f9\32\3\2\2\2\u00fa\u00fb\5#\22\2"+
		"\u00fb\u00fc\7u\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff"+
		"\7t\2\2\u00ff\u0100\7u\2\2\u0100\34\3\2\2\2\u0101\u0102\5\63\32\2\u0102"+
		"\u0103\5\13\6\2\u0103\u0104\5\65\33\2\u0104\36\3\2\2\2\u0105\u0106\5\67"+
		"\34\2\u0106\u010a\5\13\6\2\u0107\u0108\5;\36\2\u0108\u0109\7\67\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\59\35\2\u010d \3\2\2\2\u010e\u010f\5#\22\2\u010f\u0110"+
		"\7y\2\2\u0110\u0111\7q\2\2\u0111\u0112\7t\2\2\u0112\u0113\7f\2\2\u0113"+
		"\u0114\7e\2\2\u0114\u0115\7n\2\2\u0115\u0116\7q\2\2\u0116\u0117\7w\2\2"+
		"\u0117\u0118\7f\2\2\u0118\"\3\2\2\2\u0119\u011a\7^\2\2\u011a$\3\2\2\2"+
		"\u011b\u011c\7~\2\2\u011c&\3\2\2\2\u011d\u011e\7#\2\2\u011e(\3\2\2\2\u011f"+
		"\u0120\7$\2\2\u0120*\3\2\2\2\u0121\u0122\7%\2\2\u0122,\3\2\2\2\u0123\u0124"+
		"\7\61\2\2\u0124.\3\2\2\2\u0125\u0126\7*\2\2\u0126\60\3\2\2\2\u0127\u0128"+
		"\7+\2\2\u0128\62\3\2\2\2\u0129\u012a\7]\2\2\u012a\64\3\2\2\2\u012b\u012c"+
		"\7_\2\2\u012c\66\3\2\2\2\u012d\u012e\7}\2\2\u012e8\3\2\2\2\u012f\u0130"+
		"\7\177\2\2\u0130:\3\2\2\2\u0131\u0132\7\60\2\2\u0132<\3\2\2\2\u0133\u0134"+
		"\7<\2\2\u0134>\3\2\2\2\u0135\u0136\7.\2\2\u0136@\3\2\2\2\u0137\u0138\7"+
		"=\2\2\u0138B\3\2\2\2\u0139\u013a\7a\2\2\u013aD\3\2\2\2\u013b\u013c\7-"+
		"\2\2\u013cF\3\2\2\2\u013d\u013e\7/\2\2\u013eH\3\2\2\2\u013f\u0140\7,\2"+
		"\2\u0140J\3\2\2\2\u0141\u0142\7\u0080\2\2\u0142L\3\2\2\2\u0143\u0144\7"+
		"b\2\2\u0144N\3\2\2\2\u0145\u0146\7@\2\2\u0146P\3\2\2\2\u0147\u0148\7?"+
		"\2\2\u0148R\3\2\2\2\u0149\u014a\7A\2\2\u014aT\3\2\2\2\u014b\u014d\7\17"+
		"\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\7\f\2\2\u014fV\3\2\2\2\u0150\u0152\t\4\2\2\u0151\u0150\3\2\2\2"+
		"\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\b,\2\2\u0156X\3\2\2\2 \2_bejmqt\u0084\u0094\u0098"+
		"\u009d\u00a5\u00a7\u00ae\u00b4\u00bb\u00bd\u00c3\u00c9\u00d1\u00d3\u00da"+
		"\u00e3\u00e8\u00ee\u00f0\u010a\u014c\u0153\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}