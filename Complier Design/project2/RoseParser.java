// Generated from Rose.g4 by ANTLR 4.5.2
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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

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
		RULE_program = 0, RULE_variables = 1, RULE_variable = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_assignment_statement = 5, RULE_if_statement = 6, 
		RULE_if_statement_pram = 7, RULE_for_statement = 8, RULE_exit_statement = 9, 
		RULE_read_statement = 10, RULE_write_statement = 11, RULE_bool_expression = 12, 
		RULE_bool_expression_pram = 13, RULE_bool_term = 14, RULE_bool_term_pram = 15, 
		RULE_bool_factor = 16, RULE_bool_primary = 17, RULE_relation_op = 18, 
		RULE_relation_op_a = 19, RULE_relation_op_b = 20, RULE_arith_expression = 21, 
		RULE_arith_expression_pram = 22, RULE_arith_term = 23, RULE_arith_term_pram = 24, 
		RULE_arith_factor = 25, RULE_arith_primary = 26;
	public static final String[] ruleNames = {
		"program", "variables", "variable", "statements", "statement", "assignment_statement", 
		"if_statement", "if_statement_pram", "for_statement", "exit_statement", 
		"read_statement", "write_statement", "bool_expression", "bool_expression_pram", 
		"bool_term", "bool_term_pram", "bool_factor", "bool_primary", "relation_op", 
		"relation_op_a", "relation_op_b", "arith_expression", "arith_expression_pram", 
		"arith_term", "arith_term_pram", "arith_factor", "arith_primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'begin'", "'declare'", "'else'", "'end'", "'exit'", "'for'", 
		"'if'", "'in'", "'integer'", "'is'", "'loop'", "'procedure'", "'read'", 
		"'then'", "'write'", null, "':'", "'..'", "';'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
		"'!'", "':='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "BEGIN", "DECLARE", "ELSE", "END", "EXIT", "FOR", "IF", "IN", 
		"INTEGER", "IS", "LOOP", "PROCEDURE", "READ", "THEN", "WRITE", "CONST", 
		"COLON", "DOT", "SEMICOLON", "ADD", "SUBTRACT", "MULTIPLE", "DIVIDE", 
		"PERCENT", "EQUAL", "MIDPAR", "MORETHAN", "MOE", "LESSTHAN", "LOE", "AND", 
		"OR", "EXCLAM", "CAE", "LP", "RP", "WHITESPACE", "COMMENT"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(RoseParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IS() { return getToken(RoseParser.IS, 0); }
		public TerminalNode DECLARE() { return getToken(RoseParser.DECLARE, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(RoseParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PROCEDURE);
			setState(55);
			match(ID);
			setState(56);
			match(IS);
			setState(57);
			match(DECLARE);
			setState(58);
			variables();
			setState(59);
			match(BEGIN);
			setState(60);
			statements();
			setState(61);
			match(END);
			setState(62);
			match(SEMICOLON);
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

	public static class VariablesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				variable();
				setState(65);
				variable();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode COLON() { return getToken(RoseParser.COLON, 0); }
		public TerminalNode INTEGER() { return getToken(RoseParser.INTEGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			match(COLON);
			setState(72);
			match(INTEGER);
			setState(73);
			match(SEMICOLON);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case ID:
			case EXIT:
			case FOR:
			case IF:
			case READ:
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				statement();
				setState(76);
				statements();
				}
				break;
			case ELSE:
			case END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				assignment_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				if_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				for_statement();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				exit_statement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				read_statement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				write_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode CAE() { return getToken(RoseParser.CAE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(CAE);
			setState(91);
			arith_expression();
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(RoseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RoseParser.IF, i);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RoseParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_pramContext if_statement_pram() {
			return getRuleContext(If_statement_pramContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			bool_expression();
			setState(95);
			match(THEN);
			setState(96);
			statements();
			setState(97);
			if_statement_pram();
			setState(98);
			match(END);
			setState(99);
			match(IF);
			setState(100);
			match(SEMICOLON);
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

	public static class If_statement_pramContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_pramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement_pram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement_pram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement_pram(this);
		}
	}

	public final If_statement_pramContext if_statement_pram() throws RecognitionException {
		If_statement_pramContext _localctx = new If_statement_pramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement_pram);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ELSE);
				setState(103);
				statements();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RoseParser.FOR, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IN() { return getToken(RoseParser.IN, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(RoseParser.DOT, 0); }
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FOR);
			setState(108);
			match(ID);
			setState(109);
			match(IN);
			setState(110);
			arith_expression();
			setState(111);
			match(DOT);
			setState(112);
			arith_expression();
			setState(113);
			match(LOOP);
			setState(114);
			statements();
			setState(115);
			match(END);
			setState(116);
			match(LOOP);
			setState(117);
			match(SEMICOLON);
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

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(RoseParser.EXIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitExit_statement(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(EXIT);
			setState(120);
			match(SEMICOLON);
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

	public static class Read_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(READ);
			setState(123);
			match(ID);
			setState(124);
			match(SEMICOLON);
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

	public static class Write_statementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(WRITE);
			setState(127);
			arith_expression();
			setState(128);
			match(SEMICOLON);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_pramContext bool_expression_pram() {
			return getRuleContext(Bool_expression_pramContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			bool_term();
			setState(131);
			bool_expression_pram();
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

	public static class Bool_expression_pramContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(RoseParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_pramContext bool_expression_pram() {
			return getRuleContext(Bool_expression_pramContext.class,0);
		}
		public Bool_expression_pramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression_pram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression_pram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression_pram(this);
		}
	}

	public final Bool_expression_pramContext bool_expression_pram() throws RecognitionException {
		Bool_expression_pramContext _localctx = new Bool_expression_pramContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_expression_pram);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(OR);
				setState(134);
				bool_term();
				setState(135);
				bool_expression_pram();
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_pramContext bool_term_pram() {
			return getRuleContext(Bool_term_pramContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			bool_factor();
			setState(141);
			bool_term_pram();
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

	public static class Bool_term_pramContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_pramContext bool_term_pram() {
			return getRuleContext(Bool_term_pramContext.class,0);
		}
		public Bool_term_pramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term_pram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term_pram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term_pram(this);
		}
	}

	public final Bool_term_pramContext bool_term_pram() throws RecognitionException {
		Bool_term_pramContext _localctx = new Bool_term_pramContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_term_pram);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(AND);
				setState(144);
				bool_factor();
				setState(145);
				bool_term_pram();
				}
				break;
			case THEN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode EXCLAM() { return getToken(RoseParser.EXCLAM, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_factor);
		try {
			setState(153);
			switch (_input.LA(1)) {
			case EXCLAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(EXCLAM);
				setState(151);
				bool_primary();
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				bool_primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bool_primaryContext extends ParserRuleContext {
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_primary(this);
		}
	}

	public final Bool_primaryContext bool_primary() throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			arith_expression();
			setState(156);
			relation_op();
			setState(157);
			arith_expression();
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

	public static class Relation_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(RoseParser.LESSTHAN, 0); }
		public Relation_op_aContext relation_op_a() {
			return getRuleContext(Relation_op_aContext.class,0);
		}
		public TerminalNode MORETHAN() { return getToken(RoseParser.MORETHAN, 0); }
		public Relation_op_bContext relation_op_b() {
			return getRuleContext(Relation_op_bContext.class,0);
		}
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relation_op);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(EQUAL);
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(LESSTHAN);
				setState(161);
				relation_op_a();
				}
				break;
			case MORETHAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(MORETHAN);
				setState(163);
				relation_op_b();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Relation_op_aContext extends ParserRuleContext {
		public TerminalNode MORETHAN() { return getToken(RoseParser.MORETHAN, 0); }
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public Relation_op_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op_a(this);
		}
	}

	public final Relation_op_aContext relation_op_a() throws RecognitionException {
		Relation_op_aContext _localctx = new Relation_op_aContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relation_op_a);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case MORETHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(MORETHAN);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(EQUAL);
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Relation_op_bContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public Relation_op_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op_b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op_b(this);
		}
	}

	public final Relation_op_bContext relation_op_b() throws RecognitionException {
		Relation_op_bContext _localctx = new Relation_op_bContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relation_op_b);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(EQUAL);
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_pramContext arith_expression_pram() {
			return getRuleContext(Arith_expression_pramContext.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			arith_term();
			setState(176);
			arith_expression_pram();
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

	public static class Arith_expression_pramContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_pramContext arith_expression_pram() {
			return getRuleContext(Arith_expression_pramContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(RoseParser.SUBTRACT, 0); }
		public Arith_expression_pramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression_pram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression_pram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression_pram(this);
		}
	}

	public final Arith_expression_pramContext arith_expression_pram() throws RecognitionException {
		Arith_expression_pramContext _localctx = new Arith_expression_pramContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arith_expression_pram);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ADD);
				setState(179);
				arith_term();
				setState(180);
				arith_expression_pram();
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(SUBTRACT);
				setState(183);
				arith_term();
				setState(184);
				arith_expression_pram();
				}
				break;
			case ID:
			case ELSE:
			case END:
			case EXIT:
			case FOR:
			case IF:
			case LOOP:
			case READ:
			case THEN:
			case WRITE:
			case DOT:
			case SEMICOLON:
			case EQUAL:
			case MORETHAN:
			case LESSTHAN:
			case AND:
			case OR:
			case RP:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arith_termContext extends ParserRuleContext {
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_pramContext arith_term_pram() {
			return getRuleContext(Arith_term_pramContext.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term() throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			arith_factor();
			setState(190);
			arith_term_pram();
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

	public static class Arith_term_pramContext extends ParserRuleContext {
		public TerminalNode MULTIPLE() { return getToken(RoseParser.MULTIPLE, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_pramContext arith_term_pram() {
			return getRuleContext(Arith_term_pramContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(RoseParser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(RoseParser.PERCENT, 0); }
		public Arith_term_pramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_term_pram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term_pram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term_pram(this);
		}
	}

	public final Arith_term_pramContext arith_term_pram() throws RecognitionException {
		Arith_term_pramContext _localctx = new Arith_term_pramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arith_term_pram);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case MULTIPLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(MULTIPLE);
				setState(193);
				arith_factor();
				setState(194);
				arith_term_pram();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(DIVIDE);
				setState(197);
				arith_factor();
				setState(198);
				arith_term_pram();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(PERCENT);
				setState(201);
				arith_factor();
				setState(202);
				arith_term_pram();
				}
				break;
			case ID:
			case ELSE:
			case END:
			case EXIT:
			case FOR:
			case IF:
			case LOOP:
			case READ:
			case THEN:
			case WRITE:
			case DOT:
			case SEMICOLON:
			case ADD:
			case SUBTRACT:
			case EQUAL:
			case MORETHAN:
			case LESSTHAN:
			case AND:
			case OR:
			case RP:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arith_factorContext extends ParserRuleContext {
		public TerminalNode SUBTRACT() { return getToken(RoseParser.SUBTRACT, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor() throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arith_factor);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case SUBTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(SUBTRACT);
				setState(208);
				arith_primary();
				}
				break;
			case ID:
			case CONST:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				arith_primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arith_primaryContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(RoseParser.CONST, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode LP() { return getToken(RoseParser.LP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(RoseParser.RP, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_primary(this);
		}
	}

	public final Arith_primaryContext arith_primary() throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arith_primary);
		try {
			setState(218);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(CONST);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(ID);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(LP);
				setState(215);
				arith_expression();
				setState(216);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5R\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u008d\n\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0097\n\21\3\22\3\22\3\22\5\22\u009c\n\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00a7\n\24\3\25\3\25"+
		"\3\25\5\25\u00ac\n\25\3\26\3\26\5\26\u00b0\n\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00be\n\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00d0\n\32\3\33\3\33\3\33\5\33\u00d5\n\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u00dd\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\2\u00db\28\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bQ\3"+
		"\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2\20k\3\2\2\2\22m\3\2\2\2\24y\3"+
		"\2\2\2\26|\3\2\2\2\30\u0080\3\2\2\2\32\u0084\3\2\2\2\34\u008c\3\2\2\2"+
		"\36\u008e\3\2\2\2 \u0096\3\2\2\2\"\u009b\3\2\2\2$\u009d\3\2\2\2&\u00a6"+
		"\3\2\2\2(\u00ab\3\2\2\2*\u00af\3\2\2\2,\u00b1\3\2\2\2.\u00bd\3\2\2\2\60"+
		"\u00bf\3\2\2\2\62\u00cf\3\2\2\2\64\u00d4\3\2\2\2\66\u00dc\3\2\2\289\7"+
		"\17\2\29:\7\3\2\2:;\7\r\2\2;<\7\5\2\2<=\5\4\3\2=>\7\4\2\2>?\5\b\5\2?@"+
		"\7\7\2\2@A\7\26\2\2A\3\3\2\2\2BC\5\6\4\2CD\5\6\4\2DG\3\2\2\2EG\3\2\2\2"+
		"FB\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\7\3\2\2IJ\7\24\2\2JK\7\f\2\2KL\7\26"+
		"\2\2L\7\3\2\2\2MN\5\n\6\2NO\5\b\5\2OR\3\2\2\2PR\3\2\2\2QM\3\2\2\2QP\3"+
		"\2\2\2R\t\3\2\2\2SZ\5\f\7\2TZ\5\16\b\2UZ\5\22\n\2VZ\5\24\13\2WZ\5\26\f"+
		"\2XZ\5\30\r\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2"+
		"\2\2Z\13\3\2\2\2[\\\7\3\2\2\\]\7%\2\2]^\5,\27\2^\r\3\2\2\2_`\7\n\2\2`"+
		"a\5\32\16\2ab\7\21\2\2bc\5\b\5\2cd\5\20\t\2de\7\7\2\2ef\7\n\2\2fg\7\26"+
		"\2\2g\17\3\2\2\2hi\7\6\2\2il\5\b\5\2jl\3\2\2\2kh\3\2\2\2kj\3\2\2\2l\21"+
		"\3\2\2\2mn\7\t\2\2no\7\3\2\2op\7\13\2\2pq\5,\27\2qr\7\25\2\2rs\5,\27\2"+
		"st\7\16\2\2tu\5\b\5\2uv\7\7\2\2vw\7\16\2\2wx\7\26\2\2x\23\3\2\2\2yz\7"+
		"\b\2\2z{\7\26\2\2{\25\3\2\2\2|}\7\20\2\2}~\7\3\2\2~\177\7\26\2\2\177\27"+
		"\3\2\2\2\u0080\u0081\7\22\2\2\u0081\u0082\5,\27\2\u0082\u0083\7\26\2\2"+
		"\u0083\31\3\2\2\2\u0084\u0085\5\36\20\2\u0085\u0086\5\34\17\2\u0086\33"+
		"\3\2\2\2\u0087\u0088\7#\2\2\u0088\u0089\5\36\20\2\u0089\u008a\5\34\17"+
		"\2\u008a\u008d\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\35\3\2\2\2\u008e\u008f\5\"\22\2\u008f\u0090\5 \21\2\u0090"+
		"\37\3\2\2\2\u0091\u0092\7\"\2\2\u0092\u0093\5\"\22\2\u0093\u0094\5 \21"+
		"\2\u0094\u0097\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097!\3\2\2\2\u0098\u0099\7$\2\2\u0099\u009c\5$\23\2\u009a\u009c"+
		"\5$\23\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2\u009c#\3\2\2\2\u009d"+
		"\u009e\5,\27\2\u009e\u009f\5&\24\2\u009f\u00a0\5,\27\2\u00a0%\3\2\2\2"+
		"\u00a1\u00a7\7\34\2\2\u00a2\u00a3\7 \2\2\u00a3\u00a7\5(\25\2\u00a4\u00a5"+
		"\7\36\2\2\u00a5\u00a7\5*\26\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\'\3\2\2\2\u00a8\u00ac\7\36\2\2\u00a9\u00ac"+
		"\7\34\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac)\3\2\2\2\u00ad\u00b0\7\34\2\2\u00ae\u00b0\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0+\3\2\2\2\u00b1\u00b2"+
		"\5\60\31\2\u00b2\u00b3\5.\30\2\u00b3-\3\2\2\2\u00b4\u00b5\7\27\2\2\u00b5"+
		"\u00b6\5\60\31\2\u00b6\u00b7\5.\30\2\u00b7\u00be\3\2\2\2\u00b8\u00b9\7"+
		"\30\2\2\u00b9\u00ba\5\60\31\2\u00ba\u00bb\5.\30\2\u00bb\u00be\3\2\2\2"+
		"\u00bc\u00be\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be/\3\2\2\2\u00bf\u00c0\5\64\33\2\u00c0\u00c1\5\62\32\2\u00c1"+
		"\61\3\2\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\5\64\33\2\u00c4\u00c5\5\62"+
		"\32\2\u00c5\u00d0\3\2\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00c8\5\64\33\2\u00c8"+
		"\u00c9\5\62\32\2\u00c9\u00d0\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cc"+
		"\5\64\33\2\u00cc\u00cd\5\62\32\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\3\2\2"+
		"\2\u00cf\u00c2\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\63\3\2\2\2\u00d1\u00d2\7\30\2\2\u00d2\u00d5\5\66\34\2\u00d3"+
		"\u00d5\5\66\34\2\u00d4\u00d1\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\65\3\2"+
		"\2\2\u00d6\u00dd\7\23\2\2\u00d7\u00dd\7\3\2\2\u00d8\u00d9\7&\2\2\u00d9"+
		"\u00da\5,\27\2\u00da\u00db\7\'\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d6\3\2"+
		"\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\67\3\2\2\2\20FQYk\u008c"+
		"\u0096\u009b\u00a6\u00ab\u00af\u00bd\u00cf\u00d4\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}