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
		POSITION=1, LETTER=2, COLON=3, MINUS=4, TABLE=5, TABLESEPARATOR=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"POSITION", "LETTER", "COLON", "MINUS", "TABLE", "TABLESEPARATOR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t:\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\6\3$\n\3\r\3\16\3%\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\b\65\n\b\r\b\16\b"+
		"\66\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"=\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3 \3\2\2\2\5#\3\2\2\2\7\'\3\2\2\2\t)\3\2"+
		"\2\2\13+\3\2\2\2\r\61\3\2\2\2\17\64\3\2\2\2\21\22\7t\2\2\22\23\7k\2\2"+
		"\23\24\7i\2\2\24\25\7j\2\2\25!\7v\2\2\26\27\7n\2\2\27\30\7g\2\2\30\31"+
		"\7h\2\2\31!\7v\2\2\32\33\7e\2\2\33\34\7g\2\2\34\35\7p\2\2\35\36\7v\2\2"+
		"\36\37\7g\2\2\37!\7t\2\2 \21\3\2\2\2 \26\3\2\2\2 \32\3\2\2\2!\4\3\2\2"+
		"\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\6\3\2\2\2\'(\7"+
		"<\2\2(\b\3\2\2\2)*\7/\2\2*\n\3\2\2\2+,\7v\2\2,-\7c\2\2-.\7d\2\2./\7n\2"+
		"\2/\60\7g\2\2\60\f\3\2\2\2\61\62\7~\2\2\62\16\3\2\2\2\63\65\t\3\2\2\64"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\b"+
		"\b\2\29\20\3\2\2\2\6\2 %\66\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}