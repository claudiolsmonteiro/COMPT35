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
		STRIKETHROUGH=8, HORIZONTALRULE=9, HEADER=10, STAR=11, EMPTYSTARS=12, 
		FILLEDSTARS=13, WORDCLOUD=14, LISTSTART=15, BACKSLASH=16, TABLESEPARATOR=17, 
		EXCLAMATIONMARK=18, QUOTE=19, HASH=20, SLASH=21, LPAREN=22, RPAREN=23, 
		LBRACKET=24, RBRACKET=25, LBRACE=26, RBRACE=27, DOT=28, COLON=29, COMMA=30, 
		SEMICOLON=31, UNDERSCORE=32, PLUS=33, MINUS=34, ASTERISK=35, TILDE=36, 
		BACKTICK=37, GREATERTHAN=38, EQUAL=39, QUESTIONMARK=40, NEWLINE=41, WS=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TEXT", "STARTLIST", "REAL", "DIGIT", "ESCAPEDCHARS", "BOLD", "ITALICS", 
		"STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "STAR", "EMPTYSTARS", "FILLEDSTARS", 
		"WORDCLOUD", "LISTSTART", "BACKSLASH", "TABLESEPARATOR", "EXCLAMATIONMARK", 
		"QUOTE", "HASH", "SLASH", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LBRACE", "RBRACE", "DOT", "COLON", "COMMA", "SEMICOLON", "UNDERSCORE", 
		"PLUS", "MINUS", "ASTERISK", "TILDE", "BACKTICK", "GREATERTHAN", "EQUAL", 
		"QUESTIONMARK", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'\\'", "'|'", "'!'", "'\"'", "'#'", "'/'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'.'", "':'", "','", "';'", "'_'", 
		"'+'", "'-'", "'*'", "'~'", "'`'", "'>'", "'='", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXT", "STARTLIST", "REAL", "DIGIT", "ESCAPEDCHARS", "BOLD", "ITALICS", 
		"STRIKETHROUGH", "HORIZONTALRULE", "HEADER", "STAR", "EMPTYSTARS", "FILLEDSTARS", 
		"WORDCLOUD", "LISTSTART", "BACKSLASH", "TABLESEPARATOR", "EXCLAMATIONMARK", 
		"QUOTE", "HASH", "SLASH", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LBRACE", "RBRACE", "DOT", "COLON", "COMMA", "SEMICOLON", "UNDERSCORE", 
		"PLUS", "MINUS", "ASTERISK", "TILDE", "BACKTICK", "GREATERTHAN", "EQUAL", 
		"QUESTIONMARK", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0128\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\6\2\\\n\2\r\2\16\2]\3\2\5\2a\n\2\3\2\6\2d\n\2\r\2\16\2"+
		"e\3\2\5\2i\n\2\7\2k\n\2\f\2\16\2n\13\2\5\2p\n\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\6\5z\n\5\r\5\16\5{\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u008c\n\6\6\6\u008e\n\6\r\6\16\6\u008f\3\7\3\7\3"+
		"\7\3\7\3\7\6\7\u0097\n\7\r\7\16\7\u0098\3\7\3\7\3\7\3\b\3\b\3\b\3\b\6"+
		"\b\u00a2\n\b\r\b\16\b\u00a3\3\b\3\b\3\t\3\t\3\t\3\t\3\t\6\t\u00ad\n\t"+
		"\r\t\16\t\u00ae\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\n\u00b8\n\n\r\n\16\n\u00b9"+
		"\3\13\6\13\u00bd\n\13\r\13\16\13\u00be\3\13\3\13\3\13\3\13\6\13\u00c5"+
		"\n\13\r\13\16\13\u00c6\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00d9\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\5*\u011e\n*\3*\3"+
		"*\3+\6+\u0123\n+\r+\16+\u0124\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3"+
		"\2\5\5\2\62;C\\c|\3\2\62;\5\2\13\13\"\"))\u014f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3o\3\2\2\2\5"+
		"q\3\2\2\2\7t\3\2\2\2\ty\3\2\2\2\13\u008d\3\2\2\2\r\u0091\3\2\2\2\17\u009d"+
		"\3\2\2\2\21\u00a7\3\2\2\2\23\u00b3\3\2\2\2\25\u00bc\3\2\2\2\27\u00c8\3"+
		"\2\2\2\31\u00cf\3\2\2\2\33\u00d3\3\2\2\2\35\u00dc\3\2\2\2\37\u00e7\3\2"+
		"\2\2!\u00ea\3\2\2\2#\u00ec\3\2\2\2%\u00ee\3\2\2\2\'\u00f0\3\2\2\2)\u00f2"+
		"\3\2\2\2+\u00f4\3\2\2\2-\u00f6\3\2\2\2/\u00f8\3\2\2\2\61\u00fa\3\2\2\2"+
		"\63\u00fc\3\2\2\2\65\u00fe\3\2\2\2\67\u0100\3\2\2\29\u0102\3\2\2\2;\u0104"+
		"\3\2\2\2=\u0106\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C\u010c\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2\2\2M\u0116\3\2"+
		"\2\2O\u0118\3\2\2\2Q\u011a\3\2\2\2S\u011d\3\2\2\2U\u0122\3\2\2\2Wp\5\17"+
		"\b\2Xp\5\r\7\2Yp\5\21\t\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^"+
		"\3\2\2\2^l\3\2\2\2_a\7\"\2\2`_\3\2\2\2`a\3\2\2\2ah\3\2\2\2bd\t\2\2\2c"+
		"b\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2gi\5\13\6\2hc\3\2\2\2"+
		"hg\3\2\2\2ik\3\2\2\2j`\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2"+
		"nl\3\2\2\2oW\3\2\2\2oX\3\2\2\2oY\3\2\2\2o[\3\2\2\2p\4\3\2\2\2qr\5\t\5"+
		"\2rs\59\35\2s\6\3\2\2\2tu\5\t\5\2uv\59\35\2vw\5\t\5\2w\b\3\2\2\2xz\t\3"+
		"\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\n\3\2\2\2}\u008b\5!\21\2"+
		"~\u008c\5!\21\2\177\u008c\5K&\2\u0080\u008c\5G$\2\u0081\u008c\5A!\2\u0082"+
		"\u008c\5\61\31\2\u0083\u008c\5\63\32\2\u0084\u008c\5-\27\2\u0085\u008c"+
		"\5/\30\2\u0086\u008c\5)\25\2\u0087\u008c\5C\"\2\u0088\u008c\5E#\2\u0089"+
		"\u008c\59\35\2\u008a\u008c\5%\23\2\u008b~\3\2\2\2\u008b\177\3\2\2\2\u008b"+
		"\u0080\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2"+
		"\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d}\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\f\3\2\2\2\u0091\u0092\5G$\2\u0092\u0096"+
		"\5G$\2\u0093\u0097\5\3\2\2\u0094\u0097\5\17\b\2\u0095\u0097\5\21\t\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\5G$\2\u009b\u009c\5G$\2\u009c\16\3\2\2\2\u009d\u00a1\5A!\2\u009e"+
		"\u00a2\5\3\2\2\u009f\u00a2\5\r\7\2\u00a0\u00a2\5\21\t\2\u00a1\u009e\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5A"+
		"!\2\u00a6\20\3\2\2\2\u00a7\u00a8\5I%\2\u00a8\u00ac\5I%\2\u00a9\u00ad\5"+
		"\3\2\2\u00aa\u00ad\5\17\b\2\u00ab\u00ad\5\r\7\2\u00ac\u00a9\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5I%\2\u00b1\u00b2"+
		"\5I%\2\u00b2\22\3\2\2\2\u00b3\u00b4\5S*\2\u00b4\u00b5\5O(\2\u00b5\u00b7"+
		"\5O(\2\u00b6\u00b8\5O(\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\24\3\2\2\2\u00bb\u00bd\5)\25"+
		"\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c5\5\3\2\2\u00c1\u00c5\5\17\b\2"+
		"\u00c2\u00c5\5\r\7\2\u00c3\u00c5\5\21\t\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\5!\21"+
		"\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\u00ce\7u\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\5\61\31\2\u00d0"+
		"\u00d1\5\t\5\2\u00d1\u00d2\5\63\32\2\u00d2\32\3\2\2\2\u00d3\u00d4\5\65"+
		"\33\2\u00d4\u00d8\5\t\5\2\u00d5\u00d6\59\35\2\u00d6\u00d7\7\67\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\5\67\34\2\u00db\34\3\2\2\2\u00dc\u00dd\5!\21\2\u00dd"+
		"\u00de\7y\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7f\2\2"+
		"\u00e1\u00e2\7e\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5"+
		"\7w\2\2\u00e5\u00e6\7f\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\5\t\5\2\u00e8"+
		"\u00e9\59\35\2\u00e9 \3\2\2\2\u00ea\u00eb\7^\2\2\u00eb\"\3\2\2\2\u00ec"+
		"\u00ed\7~\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef&\3\2\2\2\u00f0\u00f1"+
		"\7$\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3*\3\2\2\2\u00f4\u00f5\7"+
		"\61\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7"+
		"+\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7]\2\2\u00fb\62\3\2\2\2\u00fc\u00fd"+
		"\7_\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7}\2\2\u00ff\66\3\2\2\2\u0100\u0101"+
		"\7\177\2\2\u01018\3\2\2\2\u0102\u0103\7\60\2\2\u0103:\3\2\2\2\u0104\u0105"+
		"\7<\2\2\u0105<\3\2\2\2\u0106\u0107\7.\2\2\u0107>\3\2\2\2\u0108\u0109\7"+
		"=\2\2\u0109@\3\2\2\2\u010a\u010b\7a\2\2\u010bB\3\2\2\2\u010c\u010d\7-"+
		"\2\2\u010dD\3\2\2\2\u010e\u010f\7/\2\2\u010fF\3\2\2\2\u0110\u0111\7,\2"+
		"\2\u0111H\3\2\2\2\u0112\u0113\7\u0080\2\2\u0113J\3\2\2\2\u0114\u0115\7"+
		"b\2\2\u0115L\3\2\2\2\u0116\u0117\7@\2\2\u0117N\3\2\2\2\u0118\u0119\7?"+
		"\2\2\u0119P\3\2\2\2\u011a\u011b\7A\2\2\u011bR\3\2\2\2\u011c\u011e\7\17"+
		"\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\7\f\2\2\u0120T\3\2\2\2\u0121\u0123\t\4\2\2\u0122\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\b+\2\2\u0127V\3\2\2\2\31\2]`ehlo{\u008b\u008f\u0096"+
		"\u0098\u00a1\u00a3\u00ac\u00ae\u00b9\u00be\u00c4\u00c6\u00d8\u011d\u0124"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}