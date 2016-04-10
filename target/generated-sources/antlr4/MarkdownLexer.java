// Generated from MarkdownLexer.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIMPLETEXT=1, BOLD=2, ITALICS=3, STRIKETHROUGH=4, HEADER=5, BACKSLASH=6, 
		TABLESEPARATOR=7, EXCLAMATIONMARK=8, QUOTE=9, HASH=10, SLASH=11, LPAREN=12, 
		RPAREN=13, LBRACKET=14, RBRACKET=15, DOT=16, COLON=17, COMMA=18, SEMICOLON=19, 
		UNDERSCORE=20, PLUS=21, MINUS=22, ASTERISK=23, TILDE=24, BACKTICK=25, 
		GREATERTHAN=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"SIMPLETEXT", "BOLD", "ITALICS", "STRIKETHROUGH", "HEADER", "BACKSLASH", 
		"TABLESEPARATOR", "EXCLAMATIONMARK", "QUOTE", "HASH", "SLASH", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "DOT", "COLON", "COMMA", "SEMICOLON", 
		"UNDERSCORE", "PLUS", "MINUS", "ASTERISK", "TILDE", "BACKTICK", "GREATERTHAN", 
		"WS"
	};


	public MarkdownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarkdownLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2;\n\2\r\2\16\2<\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2M\n\2\6\2O\n\2\r\2\16"+
		"\2P\6\2S\n\2\r\2\16\2T\3\3\3\3\3\3\3\3\3\3\5\3\\\n\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\5\4e\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3"+
		"\6\6\6t\n\6\r\6\16\6u\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00a9\n\34\r\34\16\34\u00aa"+
		"\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\35\3\2\4\b\2##%%*-/\60]_ab\5\2\13\f\17\17\"\"\u00c8\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3R\3\2\2\2\5V\3\2\2\2\7`\3\2"+
		"\2\2\th\3\2\2\2\13s\3\2\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2"+
		"\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u0087\3\2\2\2\31\u0089\3\2\2\2\33"+
		"\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0091\3\2\2\2#\u0093"+
		"\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2"+
		"-\u009d\3\2\2\2/\u009f\3\2\2\2\61\u00a1\3\2\2\2\63\u00a3\3\2\2\2\65\u00a5"+
		"\3\2\2\2\67\u00a8\3\2\2\29;\n\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=S\3\2\2\2>L\5\r\7\2?M\5\r\7\2@M\5\63\32\2AM\5/\30\2BM\5)\25\2C"+
		"M\5\35\17\2DM\5\37\20\2EM\5\31\r\2FM\5\33\16\2GM\5\25\13\2HM\5+\26\2I"+
		"M\5-\27\2JM\5!\21\2KM\5\21\t\2L?\3\2\2\2L@\3\2\2\2LA\3\2\2\2LB\3\2\2\2"+
		"LC\3\2\2\2LD\3\2\2\2LE\3\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2"+
		"LJ\3\2\2\2LK\3\2\2\2MO\3\2\2\2N>\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QS\3\2\2\2R:\3\2\2\2RN\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\4\3\2\2"+
		"\2VW\5/\30\2W[\5/\30\2X\\\5\3\2\2Y\\\5\7\4\2Z\\\5\t\5\2[X\3\2\2\2[Y\3"+
		"\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\5/\30\2^_\5/\30\2_\6\3\2\2\2`d\5)\25\2a"+
		"e\5\3\2\2be\5\5\3\2ce\5\t\5\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2"+
		"fg\5)\25\2g\b\3\2\2\2hi\5\61\31\2im\5\61\31\2jn\5\3\2\2kn\5\7\4\2ln\5"+
		"\5\3\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2op\5\61\31\2pq\5\61\31\2"+
		"q\n\3\2\2\2rt\5\25\13\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v{\3\2"+
		"\2\2w|\5\3\2\2x|\5\7\4\2y|\5\5\3\2z|\5\t\5\2{w\3\2\2\2{x\3\2\2\2{y\3\2"+
		"\2\2{z\3\2\2\2|\f\3\2\2\2}~\7^\2\2~\16\3\2\2\2\177\u0080\7~\2\2\u0080"+
		"\20\3\2\2\2\u0081\u0082\7#\2\2\u0082\22\3\2\2\2\u0083\u0084\7$\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0086\7%\2\2\u0086\26\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\30\3\2\2\2\u0089\u008a\7*\2\2\u008a\32\3\2\2\2\u008b\u008c\7+\2\2\u008c"+
		"\34\3\2\2\2\u008d\u008e\7]\2\2\u008e\36\3\2\2\2\u008f\u0090\7_\2\2\u0090"+
		" \3\2\2\2\u0091\u0092\7\60\2\2\u0092\"\3\2\2\2\u0093\u0094\7<\2\2\u0094"+
		"$\3\2\2\2\u0095\u0096\7.\2\2\u0096&\3\2\2\2\u0097\u0098\7=\2\2\u0098("+
		"\3\2\2\2\u0099\u009a\7a\2\2\u009a*\3\2\2\2\u009b\u009c\7-\2\2\u009c,\3"+
		"\2\2\2\u009d\u009e\7/\2\2\u009e.\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\60\3"+
		"\2\2\2\u00a1\u00a2\7\u0080\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7b\2\2\u00a4"+
		"\64\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6\66\3\2\2\2\u00a7\u00a9\t\3\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\34\2\2\u00ad8\3\2\2\2\16\2<LPR"+
		"T[dmu{\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}