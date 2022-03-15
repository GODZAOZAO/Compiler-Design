// Generated from Rose.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, BEGIN=2, DECLARE=3, ELSE=4, END=5, EXIT=6, FOR=7, IF=8, IN=9, INTEGER=10, 
		IS=11, LOOP=12, PROCEDURE=13, READ=14, THEN=15, WRITE=16, CONST=17, COLON=18, 
		DOT=19, SEMICOLON=20, ADD=21, SUBTRACT=22, MULTIPLE=23, DIVIDE=24, PERCENT=25, 
		EQUAL=26, MIDPAR=27, MORETHAN=28, MOE=29, LESSTHAN=30, LOE=31, AND=32, 
		OR=33, EXCLAM=34, CAE=35, LP=36, RP=37, WHITESPACE=38, COMMENT=39;
	public static final int
		RULE_token = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"token"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'begin'", "'declare'", "'else'", "'end'", "'exit'", "'for'", 
			"'if'", "'in'", "'integer'", "'is'", "'loop'", "'procedure'", "'read'", 
			"'then'", "'write'", null, "':'", "'..'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'!'", "':='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "BEGIN", "DECLARE", "ELSE", "END", "EXIT", "FOR", "IF", "IN", 
			"INTEGER", "IS", "LOOP", "PROCEDURE", "READ", "THEN", "WRITE", "CONST", 
			"COLON", "DOT", "SEMICOLON", "ADD", "SUBTRACT", "MULTIPLE", "DIVIDE", 
			"PERCENT", "EQUAL", "MIDPAR", "MORETHAN", "MOE", "LESSTHAN", "LOE", "AND", 
			"OR", "EXCLAM", "CAE", "LP", "RP", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "Rose.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TokenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RoseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RoseParser.ID, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(RoseParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(RoseParser.BEGIN, i);
		}
		public List<TerminalNode> DECLARE() { return getTokens(RoseParser.DECLARE); }
		public TerminalNode DECLARE(int i) {
			return getToken(RoseParser.DECLARE, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(RoseParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(RoseParser.ELSE, i);
		}
		public List<TerminalNode> END() { return getTokens(RoseParser.END); }
		public TerminalNode END(int i) {
			return getToken(RoseParser.END, i);
		}
		public List<TerminalNode> EXIT() { return getTokens(RoseParser.EXIT); }
		public TerminalNode EXIT(int i) {
			return getToken(RoseParser.EXIT, i);
		}
		public List<TerminalNode> FOR() { return getTokens(RoseParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(RoseParser.FOR, i);
		}
		public List<TerminalNode> IF() { return getTokens(RoseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RoseParser.IF, i);
		}
		public List<TerminalNode> IN() { return getTokens(RoseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(RoseParser.IN, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(RoseParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(RoseParser.INTEGER, i);
		}
		public List<TerminalNode> IS() { return getTokens(RoseParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(RoseParser.IS, i);
		}
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public List<TerminalNode> PROCEDURE() { return getTokens(RoseParser.PROCEDURE); }
		public TerminalNode PROCEDURE(int i) {
			return getToken(RoseParser.PROCEDURE, i);
		}
		public List<TerminalNode> READ() { return getTokens(RoseParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(RoseParser.READ, i);
		}
		public List<TerminalNode> THEN() { return getTokens(RoseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(RoseParser.THEN, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(RoseParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(RoseParser.WRITE, i);
		}
		public List<TerminalNode> CONST() { return getTokens(RoseParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(RoseParser.CONST, i);
		}
		public List<TerminalNode> COLON() { return getTokens(RoseParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RoseParser.COLON, i);
		}
		public List<TerminalNode> DOT() { return getTokens(RoseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RoseParser.DOT, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RoseParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RoseParser.SEMICOLON, i);
		}
		public List<TerminalNode> ADD() { return getTokens(RoseParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(RoseParser.ADD, i);
		}
		public List<TerminalNode> SUBTRACT() { return getTokens(RoseParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(RoseParser.SUBTRACT, i);
		}
		public List<TerminalNode> MULTIPLE() { return getTokens(RoseParser.MULTIPLE); }
		public TerminalNode MULTIPLE(int i) {
			return getToken(RoseParser.MULTIPLE, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(RoseParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(RoseParser.DIVIDE, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(RoseParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(RoseParser.PERCENT, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(RoseParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(RoseParser.EQUAL, i);
		}
		public List<TerminalNode> MIDPAR() { return getTokens(RoseParser.MIDPAR); }
		public TerminalNode MIDPAR(int i) {
			return getToken(RoseParser.MIDPAR, i);
		}
		public List<TerminalNode> MORETHAN() { return getTokens(RoseParser.MORETHAN); }
		public TerminalNode MORETHAN(int i) {
			return getToken(RoseParser.MORETHAN, i);
		}
		public List<TerminalNode> MOE() { return getTokens(RoseParser.MOE); }
		public TerminalNode MOE(int i) {
			return getToken(RoseParser.MOE, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(RoseParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(RoseParser.LESSTHAN, i);
		}
		public List<TerminalNode> LOE() { return getTokens(RoseParser.LOE); }
		public TerminalNode LOE(int i) {
			return getToken(RoseParser.LOE, i);
		}
		public List<TerminalNode> AND() { return getTokens(RoseParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RoseParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(RoseParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RoseParser.OR, i);
		}
		public List<TerminalNode> EXCLAM() { return getTokens(RoseParser.EXCLAM); }
		public TerminalNode EXCLAM(int i) {
			return getToken(RoseParser.EXCLAM, i);
		}
		public List<TerminalNode> CAE() { return getTokens(RoseParser.CAE); }
		public TerminalNode CAE(int i) {
			return getToken(RoseParser.CAE, i);
		}
		public List<TerminalNode> LP() { return getTokens(RoseParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(RoseParser.LP, i);
		}
		public List<TerminalNode> RP() { return getTokens(RoseParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(RoseParser.RP, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(RoseParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(RoseParser.WHITESPACE, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << CONST) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLE) | (1L << DIVIDE) | (1L << PERCENT) | (1L << EQUAL) | (1L << MIDPAR) | (1L << MORETHAN) | (1L << MOE) | (1L << LESSTHAN) | (1L << LOE) | (1L << AND) | (1L << OR) | (1L << EXCLAM) | (1L << CAE) | (1L << LP) | (1L << RP) | (1L << WHITESPACE))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << CONST) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLE) | (1L << DIVIDE) | (1L << PERCENT) | (1L << EQUAL) | (1L << MIDPAR) | (1L << MORETHAN) | (1L << MOE) | (1L << LESSTHAN) | (1L << LOE) | (1L << AND) | (1L << OR) | (1L << EXCLAM) | (1L << CAE) | (1L << LP) | (1L << RP) | (1L << WHITESPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\3(\2\n\2\7\3\2\2\2\4\6\t"+
		"\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7"+
		"\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}