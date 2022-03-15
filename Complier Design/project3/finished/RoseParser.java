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
		ID=1, CONST=2, BEGIN=3, DECLARE=4, ELSE=5, END=6, EXIT=7, FOR=8, IF=9, 
		IN=10, INTEGER=11, IS=12, LOOP=13, PROCEDURE=14, READ=15, THEN=16, WRITE=17, 
		COLON=18, DOT=19, SEMICOLON=20, ADD=21, SUBTRACT=22, MULTIPLE=23, DIVIDE=24, 
		PERCENT=25, EQUAL=26, MORETHAN=27, LESSTHAN=28, AND=29, OR=30, EXCLAM=31, 
		CAE=32, LP=33, RP=34, WHITESPACE=35, COMMENT=36;
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
			System.out.println("# variables\n\t.data");
			setState(59);
			variables();
			setState(60);
			match(BEGIN);
			System.out.println("# begin function\n\t.text\nmain:");
			setState(62);
			statements(0, 0);
			setState(63);
			match(END);
			setState(64);
			match(SEMICOLON);
			System.out.println("# end function");
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
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
			setState(71);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				variable();
				setState(68);
				variables();
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
		public Token ID;
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
			setState(73);
			((VariableContext)_localctx).ID = match(ID);
			setState(74);
			match(COLON);
			setState(75);
			match(INTEGER);
			setState(76);
			match(SEMICOLON);
			System.out.println((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null) + ":\t.word  0");
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
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public StatementsContext statements;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case ID:
			case EXIT:
			case FOR:
			case IF:
			case READ:
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((StatementsContext)_localctx).statement = statement(_localctx.reg, _localctx.label);
				setState(80);
				((StatementsContext)_localctx).statements = statements(((StatementsContext)_localctx).statement.nreg, ((StatementsContext)_localctx).statement.nlabel);
				((StatementsContext)_localctx).nreg =  _localctx.nreg;
				((StatementsContext)_localctx).nlabel =  _localctx.nlabel;
				}
				break;
			case ELSE:
			case END:
				enterOuterAlt(_localctx, 2);
				{
				((StatementsContext)_localctx).nreg =  _localctx.reg;
				((StatementsContext)_localctx).nlabel =  _localctx.label;
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
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public If_statementContext if_statement;
		public For_statementContext for_statement;
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
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				assignment_statement(_localctx.reg);
				((StatementContext)_localctx).nreg =  _localctx.reg;
				((StatementContext)_localctx).nlabel =  _localctx.label;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((StatementContext)_localctx).if_statement = if_statement(_localctx.reg, _localctx.label);
				((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).if_statement.nreg;
				((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).if_statement.nlabel;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((StatementContext)_localctx).for_statement = for_statement(_localctx.reg, _localctx.label);
				((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).for_statement.nreg;
				((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).for_statement.nlabel;
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				exit_statement();
				((StatementContext)_localctx).nreg =  _localctx.reg;
				((StatementContext)_localctx).nlabel =  _localctx.label;
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				read_statement(_localctx.reg);
				((StatementContext)_localctx).nreg =  _localctx.reg;
				((StatementContext)_localctx).nlabel =  _localctx.label;
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				write_statement(_localctx.reg);
				((StatementContext)_localctx).nreg =  _localctx.reg;
				((StatementContext)_localctx).nlabel =  _localctx.label;
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
		public int reg;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode CAE() { return getToken(RoseParser.CAE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Assignment_statementContext assignment_statement(int reg) throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((Assignment_statementContext)_localctx).ID = match(ID);
			setState(115);
			match(CAE);
			setState(116);
			((Assignment_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			System.out.println("\tla\t$t" + ((Assignment_statementContext)_localctx).arith_expression.nreg + ", " + (((Assignment_statementContext)_localctx).ID!=null?((Assignment_statementContext)_localctx).ID.getText():null));
			System.out.println("\tsw\t$t" + ((Assignment_statementContext)_localctx).arith_expression.place + ", 0($t" + ((Assignment_statementContext)_localctx).arith_expression.nreg + ")");
			setState(119);
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

	public static class If_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_expressionContext bool_expression;
		public StatementsContext statements;
		public If_statement_pramContext if_statement_pram;
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
		public If_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final If_statementContext if_statement(int reg,int label) throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IF);
			System.out.println("# if");
			setState(123);
			((If_statementContext)_localctx).bool_expression = bool_expression(_localctx.reg, _localctx.label, _localctx.label + 1, _localctx.label + 3);
			setState(124);
			match(THEN);
			System.out.println("L" + _localctx.label + ":\t# then");
			setState(126);
			((If_statementContext)_localctx).statements = statements(((If_statementContext)_localctx).bool_expression.nreg, ((If_statementContext)_localctx).bool_expression.nlabel);
			setState(127);
			((If_statementContext)_localctx).if_statement_pram = if_statement_pram(_localctx.label + 1, _localctx.label + 2, ((If_statementContext)_localctx).statements.nreg, ((If_statementContext)_localctx).statements.nlabel);
			setState(128);
			match(END);
			setState(129);
			match(IF);
			setState(130);
			match(SEMICOLON);
			((If_statementContext)_localctx).nreg =  ((If_statementContext)_localctx).if_statement_pram.nreg;
			((If_statementContext)_localctx).nlabel =  ((If_statementContext)_localctx).if_statement_pram.nlabel;
			System.out.println("L" + ((If_statementContext)_localctx).if_statement_pram.if_next + ":\t# end if");
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
		public int false_label;
		public int Lnext;
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public  if_next;
		public StatementsContext statements;
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_pramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statement_pramContext(ParserRuleContext parent, int invokingState, int false_label, int Lnext, int reg, int label) {
			super(parent, invokingState);
			this.false_label = false_label;
			this.Lnext = Lnext;
			this.reg = reg;
			this.label = label;
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

	public final If_statement_pramContext if_statement_pram(int false_label,int Lnext,int reg,int label) throws RecognitionException {
		If_statement_pramContext _localctx = new If_statement_pramContext(_ctx, getState(), false_label, Lnext, reg, label);
		enterRule(_localctx, 14, RULE_if_statement_pram);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ELSE);
				System.out.println("\tb\tL" + _localctx.Lnext);
				System.out.println("L" + _localctx.false_label + ":\t# else");
				setState(138);
				((If_statement_pramContext)_localctx).statements = statements(_localctx.reg, _localctx.label);
				((If_statement_pramContext)_localctx).nreg =  ((If_statement_pramContext)_localctx).statements.nreg;
				((If_statement_pramContext)_localctx).nlabel =  ((If_statement_pramContext)_localctx).statements.nlabel;
				((If_statement_pramContext)_localctx).if_next =  _localctx.Lnext;
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				((If_statement_pramContext)_localctx).nreg =  _localctx.reg;
				((If_statement_pramContext)_localctx).nlabel =  _localctx.label;
				_localctx.if_next = _localctx.false_label
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
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public Arith_expressionContext arith_a;
		public Arith_expressionContext arith_b;
		public StatementsContext statements;
		public TerminalNode FOR() { return getToken(RoseParser.FOR, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IN() { return getToken(RoseParser.IN, 0); }
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
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
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

	public final For_statementContext for_statement(int reg,int label) throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FOR);
			setState(149);
			((For_statementContext)_localctx).ID = match(ID);
			setState(150);
			match(IN);
			setState(151);
			((For_statementContext)_localctx).arith_a = arith_expression(_localctx.reg);
			System.out.println("\tla\t$t" + ((For_statementContext)_localctx).arith_a.nreg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tsw\t$t" + ((For_statementContext)_localctx).arith_a.place + ", 0($t" + ((For_statementContext)_localctx).arith_a.nreg + ")");
			System.out.println("L" + _localctx.label + ":\t# for");
			System.out.println("\tla\t$t" + _localctx.reg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tlw\t$t" + _localctx.reg + ", 0($t" + _localctx.reg + ")");
			setState(157);
			match(DOT);
			setState(158);
			((For_statementContext)_localctx).arith_b = arith_expression(_localctx.reg + 1);
			setState(159);
			match(LOOP);
			System.out.println("\tble\t$t" + _localctx.reg + ", $t" + ((For_statementContext)_localctx).arith_b.place + ", L" + (_localctx.label + 1));
			System.out.println("\tb\tL" + (_localctx.label + 2));
			System.out.println("L" + (_localctx.label + 1) + ":\t# for body");
			setState(163);
			((For_statementContext)_localctx).statements = statements(_localctx.reg, _localctx.label + 3);
			System.out.println("\tla\t$t" + ((For_statementContext)_localctx).statements.nreg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tlw\t$t" + ((For_statementContext)_localctx).statements.nreg + ", 0($t" + ((For_statementContext)_localctx).statements.nreg + ")");
			System.out.println("\tli\t$t" + (((For_statementContext)_localctx).statements.nreg + 1) + ", 1");
			System.out.println("\tadd\t$t" + ((For_statementContext)_localctx).statements.nreg + ", $t" + ((For_statementContext)_localctx).statements.nreg + ", $t" + (((For_statementContext)_localctx).statements.nreg + 1));
			System.out.println("\tla\t$t" + (((For_statementContext)_localctx).statements.nreg + 1) + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tsw\t$t" + ((For_statementContext)_localctx).statements.nreg + ", 0($t" + (((For_statementContext)_localctx).statements.nreg + 1) + ")");
			System.out.println("\tb\tL" + _localctx.label);
			setState(171);
			match(END);
			setState(172);
			match(LOOP);
			setState(173);
			match(SEMICOLON);
			System.out.println("L" + (_localctx.label + 2) + ":\t# end for");
			((For_statementContext)_localctx).nreg =  _localctx.reg;
			((For_statementContext)_localctx).nlabel =  ((For_statementContext)_localctx).statements.nlabel;
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
			setState(178);
			match(EXIT);
			setState(179);
			match(SEMICOLON);
			System.out.println("\tli\t$v0, 10\n\tsyscall");
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
		public int reg;
		public Token ID;
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Read_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Read_statementContext read_statement(int reg) throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 20, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(READ);
			setState(183);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(184);
			match(SEMICOLON);
			System.out.println("\tli\t$v0, 5\n\tsyscall\n\tla\t$t" + _localctx.reg + ", " + (((Read_statementContext)_localctx).ID!=null?((Read_statementContext)_localctx).ID.getText():null) + "\n\tsw\t$v0, 0($t" + _localctx.reg + ")");
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
		public int reg;
		public Arith_expressionContext arith_expression;
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Write_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Write_statementContext write_statement(int reg) throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 22, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WRITE);
			setState(188);
			((Write_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(189);
			match(SEMICOLON);
			System.out.println("\tmove\t$a0, $t" + ((Write_statementContext)_localctx).arith_expression.place + "\n\tli\t$v0, 1\n\tsyscall");
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
		public int reg;
		public int true_label;
		public int false_label;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expression_pramContext bool_expression_pram;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_pramContext bool_expression_pram() {
			return getRuleContext(Bool_expression_pramContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int reg, int true_label, int false_label, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.true_label = true_label;
			this.false_label = false_label;
			this.label = label;
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

	public final Bool_expressionContext bool_expression(int reg,int true_label,int false_label,int label) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), reg, true_label, false_label, label);
		enterRule(_localctx, 24, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("L" + _localctx.label + ":");
			setState(193);
			((Bool_expressionContext)_localctx).bool_term = bool_term(_localctx.reg, _localctx.true_label ,_localctx.false_label, _localctx.label + 1);
			setState(194);
			((Bool_expressionContext)_localctx).bool_expression_pram = bool_expression_pram(((Bool_expressionContext)_localctx).bool_term.nreg, _localctx.true_label, _localctx.false_label, _localctx.label + 1);
			((Bool_expressionContext)_localctx).nreg =  ((Bool_expressionContext)_localctx).bool_expression_pram.nreg;
			((Bool_expressionContext)_localctx).nlabel =  ((Bool_expressionContext)_localctx).bool_expression_pram.nlabel;
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
		public int reg;
		public int true_label;
		public int false_label;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expression_pramContext bool_expression_pram;
		public TerminalNode OR() { return getToken(RoseParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_pramContext bool_expression_pram() {
			return getRuleContext(Bool_expression_pramContext.class,0);
		}
		public Bool_expression_pramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expression_pramContext(ParserRuleContext parent, int invokingState, int reg, int true_label, int false_label, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.true_label = true_label;
			this.false_label = false_label;
			this.label = label;
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

	public final Bool_expression_pramContext bool_expression_pram(int reg,int true_label,int false_label,int label) throws RecognitionException {
		Bool_expression_pramContext _localctx = new Bool_expression_pramContext(_ctx, getState(), reg, true_label, false_label, label);
		enterRule(_localctx, 26, RULE_bool_expression_pram);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(OR);
				System.out.println("L" + _localctx.label + ":");
				setState(200);
				((Bool_expression_pramContext)_localctx).bool_term = bool_term(_localctx.reg, _localctx.true_label, _localctx.false_label, _localctx.label + 1);
				setState(201);
				((Bool_expression_pramContext)_localctx).bool_expression_pram = bool_expression_pram(((Bool_expression_pramContext)_localctx).bool_term.nreg, _localctx.true_label ,_localctx.false_label, _localctx.label + 1);
				((Bool_expression_pramContext)_localctx).nreg =  _localctx.nreg;
				((Bool_expression_pramContext)_localctx).nlabel =  _localctx.nlabel;
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("L" + _localctx.label + ":");
				System.out.println("\tb\tL" + _localctx.false_label);
				((Bool_expression_pramContext)_localctx).nreg =  _localctx.reg;
				((Bool_expression_pramContext)_localctx).nlabel =  _localctx.label + 1;
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
		public int reg;
		public int true_label;
		public int false_label;
		public int nlabel;
		public int nreg;
		public Bool_factorContext bool_factor;
		public Bool_term_pramContext bool_term_pram;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_pramContext bool_term_pram() {
			return getRuleContext(Bool_term_pramContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int reg, int true_label, int false_label, int nlabel) {
			super(parent, invokingState);
			this.reg = reg;
			this.true_label = true_label;
			this.false_label = false_label;
			this.nlabel = nlabel;
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

	public final Bool_termContext bool_term(int reg,int true_label,int false_label,int nlabel) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), reg, true_label, false_label, nlabel);
		enterRule(_localctx, 28, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((Bool_termContext)_localctx).bool_factor = bool_factor(_localctx.reg, _localctx.true_label, _localctx.false_label, _localctx.nlabel);
			setState(212);
			((Bool_termContext)_localctx).bool_term_pram = bool_term_pram(((Bool_termContext)_localctx).bool_factor.nreg, _localctx.true_label, _localctx.false_label, _localctx.nlabel);
			System.out.println("\tb\tL" + _localctx.true_label);
			((Bool_termContext)_localctx).nreg =  ((Bool_termContext)_localctx).bool_term_pram.nreg;
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
		public int reg;
		public int true_label;
		public int false_label;
		public int nlabel;
		public int nreg;
		public Bool_factorContext bool_factor;
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_pramContext bool_term_pram() {
			return getRuleContext(Bool_term_pramContext.class,0);
		}
		public Bool_term_pramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_term_pramContext(ParserRuleContext parent, int invokingState, int reg, int true_label, int false_label, int nlabel) {
			super(parent, invokingState);
			this.reg = reg;
			this.true_label = true_label;
			this.false_label = false_label;
			this.nlabel = nlabel;
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

	public final Bool_term_pramContext bool_term_pram(int reg,int true_label,int false_label,int nlabel) throws RecognitionException {
		Bool_term_pramContext _localctx = new Bool_term_pramContext(_ctx, getState(), reg, true_label, false_label, nlabel);
		enterRule(_localctx, 30, RULE_bool_term_pram);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(AND);
				setState(217);
				((Bool_term_pramContext)_localctx).bool_factor = bool_factor(_localctx.reg, _localctx.true_label, _localctx.false_label, _localctx.nlabel);
				setState(218);
				bool_term_pram(((Bool_term_pramContext)_localctx).bool_factor.nreg, _localctx.true_label, _localctx.false_label, _localctx.nlabel);
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
		public int reg;
		public int true_label;
		public int false_label;
		public int nlabel;
		public int nreg;
		public Bool_primaryContext bool_primary;
		public TerminalNode EXCLAM() { return getToken(RoseParser.EXCLAM, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int reg, int true_label, int false_label, int nlabel) {
			super(parent, invokingState);
			this.reg = reg;
			this.true_label = true_label;
			this.false_label = false_label;
			this.nlabel = nlabel;
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

	public final Bool_factorContext bool_factor(int reg,int true_label,int false_label,int nlabel) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), reg, true_label, false_label, nlabel);
		enterRule(_localctx, 32, RULE_bool_factor);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case EXCLAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(EXCLAM);
				setState(224);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg, _localctx.true_label, _localctx.false_label, _localctx.nlabel, 1);
				((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).bool_primary.nreg;
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg, _localctx.true_label, _localctx.false_label, _localctx.nlabel, 0);
				((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).bool_primary.nreg;
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
		public int reg;
		public int true_label;
		public int false_label;
		public int nlabel;
		public int flag;
		public int nreg;
		public Arith_expressionContext arEx;
		public Arith_expressionContext arith_expression;
		public Relation_opContext relation_op;
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState, int reg, int true_label, int false_label, int nlabel, int flag) {
			super(parent, invokingState);
			this.reg = reg;
			this.true_label = true_label;
			this.false_label = false_label;
			this.nlabel = nlabel;
			this.flag = flag;
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

	public final Bool_primaryContext bool_primary(int reg,int true_label,int false_label,int nlabel,int flag) throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState(), reg, true_label, false_label, nlabel, flag);
		enterRule(_localctx, 34, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((Bool_primaryContext)_localctx).arEx = ((Bool_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(233);
			((Bool_primaryContext)_localctx).relation_op = relation_op();
			setState(234);
			((Bool_primaryContext)_localctx).arith_expression = arith_expression(((Bool_primaryContext)_localctx).arEx.nreg);

						if(flag == 0){
							switch(((Bool_primaryContext)_localctx).relation_op.related_int){
								case 0:
									System.out.println("\tbne\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 1:
									System.out.println("\tbge\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 2:
									System.out.println("\tble\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 3:
									System.out.println("\tbeq\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 4:
									System.out.println("\tbgt\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 5:
									System.out.println("\tblt\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
							}
						}
						else{
							switch(((Bool_primaryContext)_localctx).relation_op.related_int){
								case 0:
									System.out.println("\tbeq\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 1:
									System.out.println("\tblt\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 2:
									System.out.println("\tbgt\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 3:
									System.out.println("\tbne\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 4:
									System.out.println("\tble\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
								case 5:
									System.out.println("\tbge\t$t" + ((Bool_primaryContext)_localctx).arEx.place + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.place + ", L" + _localctx.nlabel);	break;
							}
						}
					
			((Bool_primaryContext)_localctx).nreg =  _localctx.reg;
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
		public int related_int;
		public Relation_op_aContext relation_op_a;
		public Relation_op_bContext relation_op_b;
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
			setState(248);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(EQUAL);
				((Relation_opContext)_localctx).related_int =  0;
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(LESSTHAN);
				setState(241);
				((Relation_opContext)_localctx).relation_op_a = relation_op_a();
				((Relation_opContext)_localctx).related_int =  1 + ((Relation_opContext)_localctx).relation_op_a.related_int;
				}
				break;
			case MORETHAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(MORETHAN);
				setState(245);
				((Relation_opContext)_localctx).relation_op_b = relation_op_b();
				((Relation_opContext)_localctx).related_int =  2 + ((Relation_opContext)_localctx).relation_op_b.related_int;
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
		public int related_int;
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
			setState(255);
			switch (_input.LA(1)) {
			case MORETHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(MORETHAN);
				((Relation_op_aContext)_localctx).related_int =  2;
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(EQUAL);
				((Relation_op_aContext)_localctx).related_int =  3;
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				((Relation_op_aContext)_localctx).related_int =  0;
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
		public int related_int;
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
			setState(260);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(EQUAL);
				((Relation_op_bContext)_localctx).related_int =  3;
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				((Relation_op_bContext)_localctx).related_int =  0;
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_pramContext arith_expression_pram() {
			return getRuleContext(Arith_expression_pramContext.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_expressionContext arith_expression(int reg) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 42, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg);
			setState(263);
			arith_expression_pram(((Arith_expressionContext)_localctx).arith_term.nreg, ((Arith_expressionContext)_localctx).arith_term.place);
			((Arith_expressionContext)_localctx).nreg =  ((Arith_expressionContext)_localctx).arith_term.nreg;
			((Arith_expressionContext)_localctx).place =  ((Arith_expressionContext)_localctx).arith_term.place;
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
		public int reg;
		public int place;
		public int nreg;
		public Arith_termContext arith_term;
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_pramContext arith_expression_pram() {
			return getRuleContext(Arith_expression_pramContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(RoseParser.SUBTRACT, 0); }
		public Arith_expression_pramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expression_pramContext(ParserRuleContext parent, int invokingState, int reg, int place) {
			super(parent, invokingState);
			this.reg = reg;
			this.place = place;
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

	public final Arith_expression_pramContext arith_expression_pram(int reg,int place) throws RecognitionException {
		Arith_expression_pramContext _localctx = new Arith_expression_pramContext(_ctx, getState(), reg, place);
		enterRule(_localctx, 44, RULE_arith_expression_pram);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(ADD);
				setState(268);
				((Arith_expression_pramContext)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\tadd\t$t" + _localctx.place + ", $t" + _localctx.place + ", $t" + ((Arith_expression_pramContext)_localctx).arith_term.place);
				setState(270);
				arith_expression_pram(_localctx.reg, _localctx.place);
				((Arith_expression_pramContext)_localctx).nreg =  _localctx.reg;
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(SUBTRACT);
				setState(274);
				((Arith_expression_pramContext)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\tsub\t$t" + _localctx.place + ", $t" + _localctx.place + ", $t" + ((Arith_expression_pramContext)_localctx).arith_term.place);
				setState(276);
				arith_expression_pram(_localctx.reg, _localctx.place);
				((Arith_expression_pramContext)_localctx).nreg =  _localctx.reg;
				}
				break;
			case LOOP:
			case THEN:
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
				((Arith_expression_pramContext)_localctx).nreg =  _localctx.reg;
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_pramContext arith_term_pram() {
			return getRuleContext(Arith_term_pramContext.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_termContext arith_term(int reg) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg);
		enterRule(_localctx, 46, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg);
			setState(283);
			arith_term_pram(((Arith_termContext)_localctx).arith_factor.nreg, ((Arith_termContext)_localctx).arith_factor.place);
			((Arith_termContext)_localctx).nreg =  ((Arith_termContext)_localctx).arith_factor.nreg;
			((Arith_termContext)_localctx).place =  ((Arith_termContext)_localctx).arith_factor.place;
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
		public int reg;
		public int place;
		public int nreg;
		public Arith_factorContext arith_factor;
		public TerminalNode MULTIPLE() { return getToken(RoseParser.MULTIPLE, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_pramContext arith_term_pram() {
			return getRuleContext(Arith_term_pramContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(RoseParser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(RoseParser.PERCENT, 0); }
		public Arith_term_pramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_term_pramContext(ParserRuleContext parent, int invokingState, int reg, int place) {
			super(parent, invokingState);
			this.reg = reg;
			this.place = place;
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

	public final Arith_term_pramContext arith_term_pram(int reg,int place) throws RecognitionException {
		Arith_term_pramContext _localctx = new Arith_term_pramContext(_ctx, getState(), reg, place);
		enterRule(_localctx, 48, RULE_arith_term_pram);
		try {
			setState(306);
			switch (_input.LA(1)) {
			case MULTIPLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(MULTIPLE);
				setState(288);
				((Arith_term_pramContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\tmul\t$t" + _localctx.place + ", $t" + _localctx.place + ", $t" + ((Arith_term_pramContext)_localctx).arith_factor.place);
				setState(290);
				arith_term_pram(_localctx.reg, _localctx.place);
				((Arith_term_pramContext)_localctx).nreg =  _localctx.reg;
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(DIVIDE);
				setState(294);
				((Arith_term_pramContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\tdiv\t$t" + _localctx.place + ", $t" + _localctx.place + ", $t" + ((Arith_term_pramContext)_localctx).arith_factor.place);
				setState(296);
				arith_term_pram(_localctx.reg, _localctx.place);
				((Arith_term_pramContext)_localctx).nreg =  _localctx.reg;
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(PERCENT);
				setState(300);
				((Arith_term_pramContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\trem\t$t" + _localctx.place + ", $t" + _localctx.place + ", $t" + ((Arith_term_pramContext)_localctx).arith_factor.place);
				setState(302);
				arith_term_pram(_localctx.reg, _localctx.place);
				((Arith_term_pramContext)_localctx).nreg =  _localctx.reg;
				}
				break;
			case LOOP:
			case THEN:
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
				((Arith_term_pramContext)_localctx).nreg =  _localctx.reg;
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
		public int reg;
		public int nreg;
		public int place;
		public Arith_primaryContext arith_primary;
		public TerminalNode SUBTRACT() { return getToken(RoseParser.SUBTRACT, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_factorContext arith_factor(int reg) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 50, RULE_arith_factor);
		try {
			setState(318);
			switch (_input.LA(1)) {
			case SUBTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(SUBTRACT);
				setState(309);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				System.out.println("\tneg\t$t" + ((Arith_factorContext)_localctx).arith_primary.place + ", $t" + ((Arith_factorContext)_localctx).arith_primary.place);
				((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
				((Arith_factorContext)_localctx).place =  ((Arith_factorContext)_localctx).arith_primary.place;
				}
				break;
			case ID:
			case CONST:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
				((Arith_factorContext)_localctx).place =  ((Arith_factorContext)_localctx).arith_primary.place;
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
		public int reg;
		public int nreg;
		public int place;
		public Token CONST;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode CONST() { return getToken(RoseParser.CONST, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode LP() { return getToken(RoseParser.LP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(RoseParser.RP, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
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

	public final Arith_primaryContext arith_primary(int reg) throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState(), reg);
		enterRule(_localctx, 52, RULE_arith_primary);
		try {
			setState(334);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((Arith_primaryContext)_localctx).CONST = match(CONST);
				System.out.println("\tli\t$t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).CONST!=null?((Arith_primaryContext)_localctx).CONST.getText():null));
				((Arith_primaryContext)_localctx).nreg =  _localctx.reg + 1;
				((Arith_primaryContext)_localctx).place =  _localctx.reg;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				((Arith_primaryContext)_localctx).ID = match(ID);
				System.out.println("\tla\t$t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).ID!=null?((Arith_primaryContext)_localctx).ID.getText():null) +"\n\tlw\t$t" + _localctx.reg + ", 0($t" + _localctx.reg + ")");
				((Arith_primaryContext)_localctx).nreg =  _localctx.reg + 1;
				((Arith_primaryContext)_localctx).place =  _localctx.reg;
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(LP);
				setState(329);
				((Arith_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(330);
				match(RP);
				((Arith_primaryContext)_localctx).nreg =  ((Arith_primaryContext)_localctx).arith_expression.nreg;
				((Arith_primaryContext)_localctx).place =  ((Arith_primaryContext)_localctx).arith_expression.place;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d4\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00e0\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e9\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fb\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0102\n\25\3\26\3\26\3\26\5\26\u0107\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u011b\n\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0135\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0141\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0151\n\34\3\34\2\2\35\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2\u014f\28\3\2\2\2"+
		"\4I\3\2\2\2\6K\3\2\2\2\bX\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16{\3\2\2\2\20"+
		"\u0094\3\2\2\2\22\u0096\3\2\2\2\24\u00b4\3\2\2\2\26\u00b8\3\2\2\2\30\u00bd"+
		"\3\2\2\2\32\u00c2\3\2\2\2\34\u00d3\3\2\2\2\36\u00d5\3\2\2\2 \u00df\3\2"+
		"\2\2\"\u00e8\3\2\2\2$\u00ea\3\2\2\2&\u00fa\3\2\2\2(\u0101\3\2\2\2*\u0106"+
		"\3\2\2\2,\u0108\3\2\2\2.\u011a\3\2\2\2\60\u011c\3\2\2\2\62\u0134\3\2\2"+
		"\2\64\u0140\3\2\2\2\66\u0150\3\2\2\289\7\20\2\29:\7\3\2\2:;\7\16\2\2;"+
		"<\7\6\2\2<=\b\2\1\2=>\5\4\3\2>?\7\5\2\2?@\b\2\1\2@A\5\b\5\2AB\7\b\2\2"+
		"BC\7\26\2\2CD\b\2\1\2D\3\3\2\2\2EF\5\6\4\2FG\5\4\3\2GJ\3\2\2\2HJ\3\2\2"+
		"\2IE\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KL\7\3\2\2LM\7\24\2\2MN\7\r\2\2NO\7\26"+
		"\2\2OP\b\4\1\2P\7\3\2\2\2QR\5\n\6\2RS\5\b\5\2ST\b\5\1\2TU\b\5\1\2UY\3"+
		"\2\2\2VW\b\5\1\2WY\b\5\1\2XQ\3\2\2\2XV\3\2\2\2Y\t\3\2\2\2Z[\5\f\7\2[\\"+
		"\b\6\1\2\\]\b\6\1\2]s\3\2\2\2^_\5\16\b\2_`\b\6\1\2`a\b\6\1\2as\3\2\2\2"+
		"bc\5\22\n\2cd\b\6\1\2de\b\6\1\2es\3\2\2\2fg\5\24\13\2gh\b\6\1\2hi\b\6"+
		"\1\2is\3\2\2\2jk\5\26\f\2kl\b\6\1\2lm\b\6\1\2ms\3\2\2\2no\5\30\r\2op\b"+
		"\6\1\2pq\b\6\1\2qs\3\2\2\2rZ\3\2\2\2r^\3\2\2\2rb\3\2\2\2rf\3\2\2\2rj\3"+
		"\2\2\2rn\3\2\2\2s\13\3\2\2\2tu\7\3\2\2uv\7\"\2\2vw\5,\27\2wx\b\7\1\2x"+
		"y\b\7\1\2yz\7\26\2\2z\r\3\2\2\2{|\7\13\2\2|}\b\b\1\2}~\5\32\16\2~\177"+
		"\7\22\2\2\177\u0080\b\b\1\2\u0080\u0081\5\b\5\2\u0081\u0082\5\20\t\2\u0082"+
		"\u0083\7\b\2\2\u0083\u0084\7\13\2\2\u0084\u0085\7\26\2\2\u0085\u0086\b"+
		"\b\1\2\u0086\u0087\b\b\1\2\u0087\u0088\b\b\1\2\u0088\17\3\2\2\2\u0089"+
		"\u008a\7\7\2\2\u008a\u008b\b\t\1\2\u008b\u008c\b\t\1\2\u008c\u008d\5\b"+
		"\5\2\u008d\u008e\b\t\1\2\u008e\u008f\b\t\1\2\u008f\u0090\b\t\1\2\u0090"+
		"\u0095\3\2\2\2\u0091\u0092\b\t\1\2\u0092\u0093\b\t\1\2\u0093\u0095\b\t"+
		"\1\2\u0094\u0089\3\2\2\2\u0094\u0091\3\2\2\2\u0095\21\3\2\2\2\u0096\u0097"+
		"\7\n\2\2\u0097\u0098\7\3\2\2\u0098\u0099\7\f\2\2\u0099\u009a\5,\27\2\u009a"+
		"\u009b\b\n\1\2\u009b\u009c\b\n\1\2\u009c\u009d\b\n\1\2\u009d\u009e\b\n"+
		"\1\2\u009e\u009f\b\n\1\2\u009f\u00a0\7\25\2\2\u00a0\u00a1\5,\27\2\u00a1"+
		"\u00a2\7\17\2\2\u00a2\u00a3\b\n\1\2\u00a3\u00a4\b\n\1\2\u00a4\u00a5\b"+
		"\n\1\2\u00a5\u00a6\5\b\5\2\u00a6\u00a7\b\n\1\2\u00a7\u00a8\b\n\1\2\u00a8"+
		"\u00a9\b\n\1\2\u00a9\u00aa\b\n\1\2\u00aa\u00ab\b\n\1\2\u00ab\u00ac\b\n"+
		"\1\2\u00ac\u00ad\b\n\1\2\u00ad\u00ae\7\b\2\2\u00ae\u00af\7\17\2\2\u00af"+
		"\u00b0\7\26\2\2\u00b0\u00b1\b\n\1\2\u00b1\u00b2\b\n\1\2\u00b2\u00b3\b"+
		"\n\1\2\u00b3\23\3\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\7\26\2\2\u00b6"+
		"\u00b7\b\13\1\2\u00b7\25\3\2\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00ba\7\3"+
		"\2\2\u00ba\u00bb\7\26\2\2\u00bb\u00bc\b\f\1\2\u00bc\27\3\2\2\2\u00bd\u00be"+
		"\7\23\2\2\u00be\u00bf\5,\27\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\b\r\1\2"+
		"\u00c1\31\3\2\2\2\u00c2\u00c3\b\16\1\2\u00c3\u00c4\5\36\20\2\u00c4\u00c5"+
		"\5\34\17\2\u00c5\u00c6\b\16\1\2\u00c6\u00c7\b\16\1\2\u00c7\33\3\2\2\2"+
		"\u00c8\u00c9\7 \2\2\u00c9\u00ca\b\17\1\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc"+
		"\5\34\17\2\u00cc\u00cd\b\17\1\2\u00cd\u00ce\b\17\1\2\u00ce\u00d4\3\2\2"+
		"\2\u00cf\u00d0\b\17\1\2\u00d0\u00d1\b\17\1\2\u00d1\u00d2\b\17\1\2\u00d2"+
		"\u00d4\b\17\1\2\u00d3\u00c8\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\35\3\2\2"+
		"\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\b\20\1\2\u00d8"+
		"\u00d9\b\20\1\2\u00d9\37\3\2\2\2\u00da\u00db\7\37\2\2\u00db\u00dc\5\""+
		"\22\2\u00dc\u00dd\5 \21\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00df\u00de\3\2\2\2\u00e0!\3\2\2\2\u00e1\u00e2\7!\2\2\u00e2"+
		"\u00e3\5$\23\2\u00e3\u00e4\b\22\1\2\u00e4\u00e9\3\2\2\2\u00e5\u00e6\5"+
		"$\23\2\u00e6\u00e7\b\22\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8"+
		"\u00e5\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00eb\5,\27\2\u00eb\u00ec\5&\24\2"+
		"\u00ec\u00ed\5,\27\2\u00ed\u00ee\b\23\1\2\u00ee\u00ef\b\23\1\2\u00ef%"+
		"\3\2\2\2\u00f0\u00f1\7\34\2\2\u00f1\u00fb\b\24\1\2\u00f2\u00f3\7\36\2"+
		"\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\b\24\1\2\u00f5\u00fb\3\2\2\2\u00f6"+
		"\u00f7\7\35\2\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\b\24\1\2\u00f9\u00fb\3"+
		"\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb"+
		"\'\3\2\2\2\u00fc\u00fd\7\35\2\2\u00fd\u0102\b\25\1\2\u00fe\u00ff\7\34"+
		"\2\2\u00ff\u0102\b\25\1\2\u0100\u0102\b\25\1\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u00fe\3\2\2\2\u0101\u0100\3\2\2\2\u0102)\3\2\2\2\u0103\u0104\7\34\2\2"+
		"\u0104\u0107\b\26\1\2\u0105\u0107\b\26\1\2\u0106\u0103\3\2\2\2\u0106\u0105"+
		"\3\2\2\2\u0107+\3\2\2\2\u0108\u0109\5\60\31\2\u0109\u010a\5.\30\2\u010a"+
		"\u010b\b\27\1\2\u010b\u010c\b\27\1\2\u010c-\3\2\2\2\u010d\u010e\7\27\2"+
		"\2\u010e\u010f\5\60\31\2\u010f\u0110\b\30\1\2\u0110\u0111\5.\30\2\u0111"+
		"\u0112\b\30\1\2\u0112\u011b\3\2\2\2\u0113\u0114\7\30\2\2\u0114\u0115\5"+
		"\60\31\2\u0115\u0116\b\30\1\2\u0116\u0117\5.\30\2\u0117\u0118\b\30\1\2"+
		"\u0118\u011b\3\2\2\2\u0119\u011b\b\30\1\2\u011a\u010d\3\2\2\2\u011a\u0113"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b/\3\2\2\2\u011c\u011d\5\64\33\2\u011d"+
		"\u011e\5\62\32\2\u011e\u011f\b\31\1\2\u011f\u0120\b\31\1\2\u0120\61\3"+
		"\2\2\2\u0121\u0122\7\31\2\2\u0122\u0123\5\64\33\2\u0123\u0124\b\32\1\2"+
		"\u0124\u0125\5\62\32\2\u0125\u0126\b\32\1\2\u0126\u0135\3\2\2\2\u0127"+
		"\u0128\7\32\2\2\u0128\u0129\5\64\33\2\u0129\u012a\b\32\1\2\u012a\u012b"+
		"\5\62\32\2\u012b\u012c\b\32\1\2\u012c\u0135\3\2\2\2\u012d\u012e\7\33\2"+
		"\2\u012e\u012f\5\64\33\2\u012f\u0130\b\32\1\2\u0130\u0131\5\62\32\2\u0131"+
		"\u0132\b\32\1\2\u0132\u0135\3\2\2\2\u0133\u0135\b\32\1\2\u0134\u0121\3"+
		"\2\2\2\u0134\u0127\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\63\3\2\2\2\u0136\u0137\7\30\2\2\u0137\u0138\5\66\34\2\u0138\u0139\b\33"+
		"\1\2\u0139\u013a\b\33\1\2\u013a\u013b\b\33\1\2\u013b\u0141\3\2\2\2\u013c"+
		"\u013d\5\66\34\2\u013d\u013e\b\33\1\2\u013e\u013f\b\33\1\2\u013f\u0141"+
		"\3\2\2\2\u0140\u0136\3\2\2\2\u0140\u013c\3\2\2\2\u0141\65\3\2\2\2\u0142"+
		"\u0143\7\4\2\2\u0143\u0144\b\34\1\2\u0144\u0145\b\34\1\2\u0145\u0151\b"+
		"\34\1\2\u0146\u0147\7\3\2\2\u0147\u0148\b\34\1\2\u0148\u0149\b\34\1\2"+
		"\u0149\u0151\b\34\1\2\u014a\u014b\7#\2\2\u014b\u014c\5,\27\2\u014c\u014d"+
		"\7$\2\2\u014d\u014e\b\34\1\2\u014e\u014f\b\34\1\2\u014f\u0151\3\2\2\2"+
		"\u0150\u0142\3\2\2\2\u0150\u0146\3\2\2\2\u0150\u014a\3\2\2\2\u0151\67"+
		"\3\2\2\2\20IXr\u0094\u00d3\u00df\u00e8\u00fa\u0101\u0106\u011a\u0134\u0140"+
		"\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}