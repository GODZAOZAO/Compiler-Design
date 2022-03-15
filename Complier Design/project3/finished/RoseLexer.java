// Generated from Rose.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, CONST=2, BEGIN=3, DECLARE=4, ELSE=5, END=6, EXIT=7, FOR=8, IF=9, 
		IN=10, INTEGER=11, IS=12, LOOP=13, PROCEDURE=14, READ=15, THEN=16, WRITE=17, 
		COLON=18, DOT=19, SEMICOLON=20, ADD=21, SUBTRACT=22, MULTIPLE=23, DIVIDE=24, 
		PERCENT=25, EQUAL=26, MORETHAN=27, LESSTHAN=28, AND=29, OR=30, EXCLAM=31, 
		CAE=32, LP=33, RP=34, WHITESPACE=35, COMMENT=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "CONST", "BEGIN", "DECLARE", "ELSE", "END", "EXIT", "FOR", "IF", 
		"IN", "INTEGER", "IS", "LOOP", "PROCEDURE", "READ", "THEN", "WRITE", "COLON", 
		"DOT", "SEMICOLON", "ADD", "SUBTRACT", "MULTIPLE", "DIVIDE", "PERCENT", 
		"EQUAL", "MORETHAN", "LESSTHAN", "AND", "OR", "EXCLAM", "CAE", "LP", "RP", 
		"WHITESPACE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'begin'", "'declare'", "'else'", "'end'", "'exit'", 
		"'for'", "'if'", "'in'", "'integer'", "'is'", "'loop'", "'procedure'", 
		"'read'", "'then'", "'write'", "':'", "'..'", "';'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'='", "'>'", "'<'", "'&&'", "'||'", "'!'", "':='", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "CONST", "BEGIN", "DECLARE", "ELSE", "END", "EXIT", "FOR", 
		"IF", "IN", "INTEGER", "IS", "LOOP", "PROCEDURE", "READ", "THEN", "WRITE", 
		"COLON", "DOT", "SEMICOLON", "ADD", "SUBTRACT", "MULTIPLE", "DIVIDE", 
		"PERCENT", "EQUAL", "MORETHAN", "LESSTHAN", "AND", "OR", "EXCLAM", "CAE", 
		"LP", "RP", "WHITESPACE", "COMMENT"
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


	public RoseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rose.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\6\3"+
		"T\n\3\r\3\16\3U\3\3\5\3Y\n\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\5\3b\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\6$\u00db\n$\r$\16$\u00dc\3"+
		"$\5$\u00e0\n$\3$\5$\u00e3\n$\3$\3$\3%\3%\3%\3%\7%\u00eb\n%\f%\16%\u00ee"+
		"\13%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\b\4\2C\\aa\5\2\62;C\\aa\3\2\63;\3"+
		"\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\u00f9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5a\3"+
		"\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13q\3\2\2\2\rv\3\2\2\2\17z\3\2\2\2\21\177"+
		"\3\2\2\2\23\u0083\3\2\2\2\25\u0086\3\2\2\2\27\u0089\3\2\2\2\31\u0091\3"+
		"\2\2\2\33\u0094\3\2\2\2\35\u0099\3\2\2\2\37\u00a3\3\2\2\2!\u00a8\3\2\2"+
		"\2#\u00ad\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b8\3\2\2\2+\u00ba"+
		"\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2"+
		"\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00ca\3\2\2\2=\u00cd"+
		"\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C\u00d5\3\2\2\2E\u00d7\3\2\2\2G"+
		"\u00e2\3\2\2\2I\u00e6\3\2\2\2KO\t\2\2\2LN\t\3\2\2ML\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2P\4\3\2\2\2QO\3\2\2\2RT\7\62\2\2SR\3\2\2\2TU\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2Vb\3\2\2\2WY\7/\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2"+
		"\2Z^\t\4\2\2[]\t\5\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2aS\3\2\2\2aX\3\2\2\2b\6\3\2\2\2cd\7d\2\2de\7g\2\2ef\7i\2"+
		"\2fg\7k\2\2gh\7p\2\2h\b\3\2\2\2ij\7f\2\2jk\7g\2\2kl\7e\2\2lm\7n\2\2mn"+
		"\7c\2\2no\7t\2\2op\7g\2\2p\n\3\2\2\2qr\7g\2\2rs\7n\2\2st\7u\2\2tu\7g\2"+
		"\2u\f\3\2\2\2vw\7g\2\2wx\7p\2\2xy\7f\2\2y\16\3\2\2\2z{\7g\2\2{|\7z\2\2"+
		"|}\7k\2\2}~\7v\2\2~\20\3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7t\2\2\u0082\22\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085"+
		"\24\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\26\3\2\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7i\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090\30\3\2"+
		"\2\2\u0091\u0092\7k\2\2\u0092\u0093\7u\2\2\u0093\32\3\2\2\2\u0094\u0095"+
		"\7n\2\2\u0095\u0096\7q\2\2\u0096\u0097\7q\2\2\u0097\u0098\7r\2\2\u0098"+
		"\34\3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b\7t\2\2\u009b\u009c\7q\2\2\u009c"+
		"\u009d\7e\2\2\u009d\u009e\7g\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7w\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7"+
		"t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2\u00a7 "+
		"\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7t\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2$\3\2\2\2\u00b3"+
		"\u00b4\7<\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6\u00b7\7\60\2\2"+
		"\u00b7(\3\2\2\2\u00b8\u00b9\7=\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb"+
		",\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd.\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\60"+
		"\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3"+
		"\64\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7"+
		"8\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc"+
		"\7(\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7~\2\2\u00ce\u00cf\7~\2\2\u00cf>\3"+
		"\2\2\2\u00d0\u00d1\7#\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4B\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7"+
		"+\2\2\u00d8F\3\2\2\2\u00d9\u00db\t\6\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e3\3\2\2\2\u00de"+
		"\u00e0\7\17\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e3\7\f\2\2\u00e2\u00da\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\b$\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7\61\2\2"+
		"\u00e7\u00e8\7\61\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\n\7\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\b%\2\2\u00f0J\3\2\2\2\r"+
		"\2MOUX^a\u00dc\u00df\u00e2\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}