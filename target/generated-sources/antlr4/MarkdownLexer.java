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
		TEXT=1, STARTLIST=2, REAL=3, DIGIT=4, ESCAPEDCHARS=5, BOLD=6, ITALICS=7, 
		STRIKETHROUGH=8, HORIZONTALRULE=9, HEADER=10, WHITESPACE=11, STAR=12, 
		WHOLENUMBERSELECTION=13, REALNUMBERSELECTION=14, WORDCLOUD=15, LISTSTART=16, 
		BACKSLASH=17, TABLESEPARATOR=18, EXCLAMATIONMARK=19, QUOTE=20, HASH=21, 
		SLASH=22, LPAREN=23, RPAREN=24, LBRACKET=25, RBRACKET=26, LBRACE=27, RBRACE=28, 
		DOT=29, COLON=30, COMMA=31, SEMICOLON=32, UNDERSCORE=33, PLUS=34, MINUS=35, 
		ASTERISK=36, TILDE=37, BACKTICK=38, GREATERTHAN=39, EQUAL=40, QUESTIONMARK=41, 
		NEWLINE=42, WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TEXT", "STARTLIST", "REAL", "DIGIT", "ESCAPEDCHARS", "BOLD", "ITALICS", 
		"STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "WHITESPACE", "STAR", "WHOLENUMBERSELECTION", 
		"REALNUMBERSELECTION", "WORDCLOUD", "LISTSTART", "BACKSLASH", "TABLESEPARATOR", 
		"EXCLAMATIONMARK", "QUOTE", "HASH", "SLASH", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "DOT", "COLON", "COMMA", "SEMICOLON", 
		"UNDERSCORE", "PLUS", "MINUS", "ASTERISK", "TILDE", "BACKTICK", "GREATERTHAN", 
		"EQUAL", "QUESTIONMARK", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'\\'", "'|'", "'!'", "'\"'", "'#'", "'/'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "':'", "','", "';'", 
		"'_'", "'+'", "'-'", "'*'", "'~'", "'`'", "'>'", "'='", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXT", "STARTLIST", "REAL", "DIGIT", "ESCAPEDCHARS", "BOLD", "ITALICS", 
		"STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "WHITESPACE", "STAR", "WHOLENUMBERSELECTION", 
		"REALNUMBERSELECTION", "WORDCLOUD", "LISTSTART", "BACKSLASH", "TABLESEPARATOR", 
		"EXCLAMATIONMARK", "QUOTE", "HASH", "SLASH", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "DOT", "COLON", "COMMA", "SEMICOLON", 
		"UNDERSCORE", "PLUS", "MINUS", "ASTERISK", "TILDE", "BACKTICK", "GREATERTHAN", 
		"EQUAL", "QUESTIONMARK", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0135\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\6\2^\n\2\r\2\16\2_\3\2\5\2c\n\2\3\2\5\2f\n\2\3\2"+
		"\6\2i\n\2\r\2\16\2j\3\2\5\2n\n\2\7\2p\n\2\f\2\16\2s\13\2\5\2u\n\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5\177\n\5\r\5\16\5\u0080\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0091\n\6\6\6\u0093\n\6"+
		"\r\6\16\6\u0094\3\7\3\7\3\7\3\7\3\7\6\7\u009c\n\7\r\7\16\7\u009d\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\6\b\u00a7\n\b\r\b\16\b\u00a8\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\6\t\u00b2\n\t\r\t\16\t\u00b3\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6"+
		"\n\u00bd\n\n\r\n\16\n\u00be\3\13\6\13\u00c2\n\13\r\13\16\13\u00c3\3\13"+
		"\3\13\3\13\3\13\6\13\u00ca\n\13\r\13\16\13\u00cb\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\5+\u012b\n+\3+\3+\3,\6,\u0130"+
		"\n,\r,\16,\u0131\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\5\5\2\62"+
		";C\\c|\3\2\62;\5\2\13\13\"\"))\u015d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3t\3\2\2\2\5v"+
		"\3\2\2\2\7y\3\2\2\2\t~\3\2\2\2\13\u0092\3\2\2\2\r\u0096\3\2\2\2\17\u00a2"+
		"\3\2\2\2\21\u00ac\3\2\2\2\23\u00b8\3\2\2\2\25\u00c1\3\2\2\2\27\u00cd\3"+
		"\2\2\2\31\u00d5\3\2\2\2\33\u00dc\3\2\2\2\35\u00e0\3\2\2\2\37\u00e9\3\2"+
		"\2\2!\u00f4\3\2\2\2#\u00f7\3\2\2\2%\u00f9\3\2\2\2\'\u00fb\3\2\2\2)\u00fd"+
		"\3\2\2\2+\u00ff\3\2\2\2-\u0101\3\2\2\2/\u0103\3\2\2\2\61\u0105\3\2\2\2"+
		"\63\u0107\3\2\2\2\65\u0109\3\2\2\2\67\u010b\3\2\2\29\u010d\3\2\2\2;\u010f"+
		"\3\2\2\2=\u0111\3\2\2\2?\u0113\3\2\2\2A\u0115\3\2\2\2C\u0117\3\2\2\2E"+
		"\u0119\3\2\2\2G\u011b\3\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2"+
		"\2\2O\u0123\3\2\2\2Q\u0125\3\2\2\2S\u0127\3\2\2\2U\u012a\3\2\2\2W\u012f"+
		"\3\2\2\2Yu\5\17\b\2Zu\5\r\7\2[u\5\21\t\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2"+
		"\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2ac\5\13\6\2b]\3\2\2\2ba\3\2\2\2cq\3\2"+
		"\2\2df\7\"\2\2ed\3\2\2\2ef\3\2\2\2fm\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2ln\5\13\6\2mh\3\2\2\2ml\3\2\2\2np\3"+
		"\2\2\2oe\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tY\3"+
		"\2\2\2tZ\3\2\2\2t[\3\2\2\2tb\3\2\2\2u\4\3\2\2\2vw\5\t\5\2wx\5;\36\2x\6"+
		"\3\2\2\2yz\5\t\5\2z{\5;\36\2{|\5\t\5\2|\b\3\2\2\2}\177\t\3\2\2~}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\n\3\2\2"+
		"\2\u0082\u0090\5#\22\2\u0083\u0091\5#\22\2\u0084\u0091\5M\'\2\u0085\u0091"+
		"\5I%\2\u0086\u0091\5C\"\2\u0087\u0091\5\63\32\2\u0088\u0091\5\65\33\2"+
		"\u0089\u0091\5/\30\2\u008a\u0091\5\61\31\2\u008b\u0091\5+\26\2\u008c\u0091"+
		"\5E#\2\u008d\u0091\5G$\2\u008e\u0091\5;\36\2\u008f\u0091\5\'\24\2\u0090"+
		"\u0083\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0085\3\2\2\2\u0090\u0086\3\2"+
		"\2\2\u0090\u0087\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u0089\3\2\2\2\u0090"+
		"\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0082\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\f\3\2\2\2\u0096\u0097\5I%\2\u0097\u009b\5I%\2\u0098\u009c\5"+
		"\3\2\2\u0099\u009c\5\17\b\2\u009a\u009c\5\21\t\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5I%\2\u00a0\u00a1"+
		"\5I%\2\u00a1\16\3\2\2\2\u00a2\u00a6\5C\"\2\u00a3\u00a7\5\3\2\2\u00a4\u00a7"+
		"\5\r\7\2\u00a5\u00a7\5\21\t\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\5C\"\2\u00ab\20\3\2\2\2\u00ac"+
		"\u00ad\5K&\2\u00ad\u00b1\5K&\2\u00ae\u00b2\5\3\2\2\u00af\u00b2\5\17\b"+
		"\2\u00b0\u00b2\5\r\7\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\5K&\2\u00b6\u00b7\5K&\2\u00b7\22\3\2\2\2\u00b8"+
		"\u00b9\5U+\2\u00b9\u00ba\5Q)\2\u00ba\u00bc\5Q)\2\u00bb\u00bd\5Q)\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\24\3\2\2\2\u00c0\u00c2\5+\26\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c9\3\2\2\2\u00c5"+
		"\u00ca\5\3\2\2\u00c6\u00ca\5\17\b\2\u00c7\u00ca\5\r\7\2\u00c8\u00ca\5"+
		"\21\t\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\26\3\2\2\2\u00cd\u00ce\5#\22\2\u00ce\u00cf\7u\2\2\u00cf\u00d0"+
		"\7r\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\5#\22\2\u00d6\u00d7\7u\2\2"+
		"\u00d7\u00d8\7v\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7t\2\2\u00da\u00db"+
		"\7u\2\2\u00db\32\3\2\2\2\u00dc\u00dd\5\63\32\2\u00dd\u00de\5\t\5\2\u00de"+
		"\u00df\5\65\33\2\u00df\34\3\2\2\2\u00e0\u00e1\5\67\34\2\u00e1\u00e5\5"+
		"\t\5\2\u00e2\u00e3\5;\36\2\u00e3\u00e4\7\67\2\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\59"+
		"\35\2\u00e8\36\3\2\2\2\u00e9\u00ea\5#\22\2\u00ea\u00eb\7y\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7e\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7f\2\2"+
		"\u00f3 \3\2\2\2\u00f4\u00f5\5\t\5\2\u00f5\u00f6\5;\36\2\u00f6\"\3\2\2"+
		"\2\u00f7\u00f8\7^\2\2\u00f8$\3\2\2\2\u00f9\u00fa\7~\2\2\u00fa&\3\2\2\2"+
		"\u00fb\u00fc\7#\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7$\2\2\u00fe*\3\2\2\2\u00ff"+
		"\u0100\7%\2\2\u0100,\3\2\2\2\u0101\u0102\7\61\2\2\u0102.\3\2\2\2\u0103"+
		"\u0104\7*\2\2\u0104\60\3\2\2\2\u0105\u0106\7+\2\2\u0106\62\3\2\2\2\u0107"+
		"\u0108\7]\2\2\u0108\64\3\2\2\2\u0109\u010a\7_\2\2\u010a\66\3\2\2\2\u010b"+
		"\u010c\7}\2\2\u010c8\3\2\2\2\u010d\u010e\7\177\2\2\u010e:\3\2\2\2\u010f"+
		"\u0110\7\60\2\2\u0110<\3\2\2\2\u0111\u0112\7<\2\2\u0112>\3\2\2\2\u0113"+
		"\u0114\7.\2\2\u0114@\3\2\2\2\u0115\u0116\7=\2\2\u0116B\3\2\2\2\u0117\u0118"+
		"\7a\2\2\u0118D\3\2\2\2\u0119\u011a\7-\2\2\u011aF\3\2\2\2\u011b\u011c\7"+
		"/\2\2\u011cH\3\2\2\2\u011d\u011e\7,\2\2\u011eJ\3\2\2\2\u011f\u0120\7\u0080"+
		"\2\2\u0120L\3\2\2\2\u0121\u0122\7b\2\2\u0122N\3\2\2\2\u0123\u0124\7@\2"+
		"\2\u0124P\3\2\2\2\u0125\u0126\7?\2\2\u0126R\3\2\2\2\u0127\u0128\7A\2\2"+
		"\u0128T\3\2\2\2\u0129\u012b\7\17\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\f\2\2\u012dV\3\2\2\2\u012e\u0130"+
		"\t\4\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b,\2\2\u0134X\3\2\2\2\32"+
		"\2_bejmqt\u0080\u0090\u0094\u009b\u009d\u00a6\u00a8\u00b1\u00b3\u00be"+
		"\u00c3\u00c9\u00cb\u00e5\u012a\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}