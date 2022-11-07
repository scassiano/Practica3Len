// Generated from C:/Users/scass/Desktop/trabajos santiago/Septimo Semestre Unal/Lenguajes de Programacion/Practica/Prueba/grammar\GramaticaCoral.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaCoralParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, SEMICOLON=2, WHILE=3, IF=4, ELSEIF=5, ELSE=6, AND=7, OR=8, NOT=9, 
		WITH=10, DECIMAL=11, PLACES=12, SEEDRANDOMNUMBERS=13, SQUAREROOT=14, RAISETOPOWER=15, 
		ABSOLUTEVALUE=16, RANDOMNUMBER=17, COMA=18, ARRAY=19, STRING=20, FLOATNUM=21, 
		INTNUM=22, OPREL=23, SUMOP=24, MULOP=25, CIZQ=26, CDER=27, PIZQ=28, PDER=29, 
		ASSIGN=30, DOT=31, RSIZE=32, PUT=33, TO=34, OUTPUT=35, GET=36, NEXT=37, 
		INPUT=38, TYPE=39, IDENTIFIER=40, QUESTIONMARK=41, COMMENT=42, NEWLINESPACES=43, 
		NEWLINESPACESEOF=44, WS=45;
	public static final int
		RULE_init = 0, RULE_commands = 1, RULE_command = 2, RULE_if = 3, RULE_elseif = 4, 
		RULE_else = 5, RULE_while = 6, RULE_forsentence = 7, RULE_declaration = 8, 
		RULE_input = 9, RULE_set = 10, RULE_setfor1 = 11, RULE_setfor2 = 12, RULE_output = 13, 
		RULE_comment = 14, RULE_condexpr = 15, RULE_arithexpr = 16, RULE_callfunction = 17, 
		RULE_variable = 18, RULE_arguments = 19, RULE_argumentsprima = 20, RULE_seedrandomnumbers = 21, 
		RULE_outvalue = 22, RULE_size = 23, RULE_newlinespaces = 24, RULE_semicolonfor1 = 25, 
		RULE_semicolonfor2 = 26, RULE_not = 27, RULE_or = 28, RULE_and = 29, RULE_oprel = 30, 
		RULE_with = 31, RULE_coma = 32, RULE_assign = 33, RULE_sumop = 34, RULE_mulop = 35, 
		RULE_cizq = 36, RULE_cder = 37, RULE_pizq = 38, RULE_pder = 39, RULE_sign = 40, 
		RULE_number = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "commands", "command", "if", "elseif", "else", "while", "forsentence", 
			"declaration", "input", "set", "setfor1", "setfor2", "output", "comment", 
			"condexpr", "arithexpr", "callfunction", "variable", "arguments", "argumentsprima", 
			"seedrandomnumbers", "outvalue", "size", "newlinespaces", "semicolonfor1", 
			"semicolonfor2", "not", "or", "and", "oprel", "with", "coma", "assign", 
			"sumop", "mulop", "cizq", "cder", "pizq", "pder", "sign", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "';'", "'while'", "'if'", "'elseif'", "'else'", "'and'", 
			"'or'", "'not'", "'with'", "'decimal'", "'places'", "'SeedRandomNumbers'", 
			"'SquareRoot'", "'RaiseToPower'", "'AbsoluteValue'", "'RandomNumber'", 
			"','", "'array'", null, null, null, null, null, null, "'['", "']'", "'('", 
			"')'", "'='", "'.'", "'size'", "'Put'", "'to'", "'output'", "'Get'", 
			"'next'", "'input'", null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "SEMICOLON", "WHILE", "IF", "ELSEIF", "ELSE", "AND", "OR", 
			"NOT", "WITH", "DECIMAL", "PLACES", "SEEDRANDOMNUMBERS", "SQUAREROOT", 
			"RAISETOPOWER", "ABSOLUTEVALUE", "RANDOMNUMBER", "COMA", "ARRAY", "STRING", 
			"FLOATNUM", "INTNUM", "OPREL", "SUMOP", "MULOP", "CIZQ", "CDER", "PIZQ", 
			"PDER", "ASSIGN", "DOT", "RSIZE", "PUT", "TO", "OUTPUT", "GET", "NEXT", 
			"INPUT", "TYPE", "IDENTIFIER", "QUESTIONMARK", "COMMENT", "NEWLINESPACES", 
			"NEWLINESPACESEOF", "WS"
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
	public String getGrammarFileName() { return "GramaticaCoral.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaCoralParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaCoralParser.EOF, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			commands();
			setState(85);
			match(EOF);
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

	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case WHILE:
			case IF:
			case ELSEIF:
			case ELSE:
			case SEEDRANDOMNUMBERS:
			case SQUAREROOT:
			case RAISETOPOWER:
			case ABSOLUTEVALUE:
			case RANDOMNUMBER:
			case PUT:
			case TYPE:
			case IDENTIFIER:
			case COMMENT:
			case NEWLINESPACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				command();
				setState(88);
				commands();
				}
				break;
			case EOF:
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

	public static class CommandContext extends ParserRuleContext {
		public NewlinespacesContext newlinespaces() {
			return getRuleContext(NewlinespacesContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SeedrandomnumbersContext seedrandomnumbers() {
			return getRuleContext(SeedrandomnumbersContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForsentenceContext forsentence() {
			return getRuleContext(ForsentenceContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			newlinespaces();
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(94);
				declaration();
				}
				break;
			case 2:
				{
				setState(95);
				input();
				}
				break;
			case 3:
				{
				setState(96);
				set();
				}
				break;
			case 4:
				{
				setState(97);
				output();
				}
				break;
			case 5:
				{
				setState(98);
				comment();
				}
				break;
			case 6:
				{
				setState(99);
				seedrandomnumbers();
				}
				break;
			case 7:
				{
				setState(100);
				callfunction();
				}
				break;
			case 8:
				{
				setState(101);
				if_();
				}
				break;
			case 9:
				{
				setState(102);
				elseif();
				}
				break;
			case 10:
				{
				setState(103);
				else_();
				}
				break;
			case 11:
				{
				setState(104);
				while_();
				}
				break;
			case 12:
				{
				setState(105);
				forsentence();
				}
				break;
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaCoralParser.IF, 0); }
		public CondexprContext condexpr() {
			return getRuleContext(CondexprContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IF);
			setState(109);
			condexpr(0);
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

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(GramaticaCoralParser.ELSEIF, 0); }
		public CondexprContext condexpr() {
			return getRuleContext(CondexprContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ELSEIF);
			setState(112);
			condexpr(0);
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

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramaticaCoralParser.ELSE, 0); }
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ELSE);
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

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaCoralParser.WHILE, 0); }
		public CondexprContext condexpr() {
			return getRuleContext(CondexprContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(WHILE);
			setState(117);
			condexpr(0);
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

	public static class ForsentenceContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaCoralParser.FOR, 0); }
		public Setfor1Context setfor1() {
			return getRuleContext(Setfor1Context.class,0);
		}
		public Semicolonfor1Context semicolonfor1() {
			return getRuleContext(Semicolonfor1Context.class,0);
		}
		public CondexprContext condexpr() {
			return getRuleContext(CondexprContext.class,0);
		}
		public Semicolonfor2Context semicolonfor2() {
			return getRuleContext(Semicolonfor2Context.class,0);
		}
		public Setfor2Context setfor2() {
			return getRuleContext(Setfor2Context.class,0);
		}
		public ForsentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forsentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterForsentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitForsentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitForsentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForsentenceContext forsentence() throws RecognitionException {
		ForsentenceContext _localctx = new ForsentenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forsentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FOR);
			setState(120);
			setfor1();
			setState(121);
			semicolonfor1();
			setState(122);
			condexpr(0);
			setState(123);
			semicolonfor2();
			setState(124);
			setfor2();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GramaticaCoralParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GramaticaCoralParser.IDENTIFIER, 0); }
		public TerminalNode ARRAY() { return getToken(GramaticaCoralParser.ARRAY, 0); }
		public TerminalNode PIZQ() { return getToken(GramaticaCoralParser.PIZQ, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode PDER() { return getToken(GramaticaCoralParser.PDER, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(TYPE);
				setState(127);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(TYPE);
				setState(129);
				match(ARRAY);
				setState(130);
				match(PIZQ);
				setState(131);
				size();
				setState(132);
				match(PDER);
				setState(133);
				match(IDENTIFIER);
				}
				break;
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

	public static class InputContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode GET() { return getToken(GramaticaCoralParser.GET, 0); }
		public TerminalNode NEXT() { return getToken(GramaticaCoralParser.NEXT, 0); }
		public TerminalNode INPUT() { return getToken(GramaticaCoralParser.INPUT, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			variable();
			setState(138);
			assign();
			setState(139);
			match(GET);
			setState(140);
			match(NEXT);
			setState(141);
			match(INPUT);
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

	public static class SetContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			variable();
			setState(144);
			assign();
			setState(145);
			arithexpr(0);
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

	public static class Setfor1Context extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public Setfor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setfor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSetfor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSetfor1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSetfor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setfor1Context setfor1() throws RecognitionException {
		Setfor1Context _localctx = new Setfor1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_setfor1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			set();
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

	public static class Setfor2Context extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public Setfor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setfor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSetfor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSetfor2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSetfor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setfor2Context setfor2() throws RecognitionException {
		Setfor2Context _localctx = new Setfor2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_setfor2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			set();
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(GramaticaCoralParser.PUT, 0); }
		public OutvalueContext outvalue() {
			return getRuleContext(OutvalueContext.class,0);
		}
		public TerminalNode TO() { return getToken(GramaticaCoralParser.TO, 0); }
		public TerminalNode OUTPUT() { return getToken(GramaticaCoralParser.OUTPUT, 0); }
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(GramaticaCoralParser.DECIMAL, 0); }
		public TerminalNode PLACES() { return getToken(GramaticaCoralParser.PLACES, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(PUT);
			setState(152);
			outvalue();
			setState(153);
			match(TO);
			setState(154);
			match(OUTPUT);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				{
				setState(155);
				with();
				setState(156);
				arithexpr(0);
				setState(157);
				match(DECIMAL);
				setState(158);
				match(PLACES);
				}
				break;
			case EOF:
			case FOR:
			case WHILE:
			case IF:
			case ELSEIF:
			case ELSE:
			case SEEDRANDOMNUMBERS:
			case SQUAREROOT:
			case RAISETOPOWER:
			case ABSOLUTEVALUE:
			case RANDOMNUMBER:
			case PUT:
			case TYPE:
			case IDENTIFIER:
			case COMMENT:
			case NEWLINESPACES:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(GramaticaCoralParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(COMMENT);
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

	public static class CondexprContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public PizqContext pizq() {
			return getRuleContext(PizqContext.class,0);
		}
		public List<CondexprContext> condexpr() {
			return getRuleContexts(CondexprContext.class);
		}
		public CondexprContext condexpr(int i) {
			return getRuleContext(CondexprContext.class,i);
		}
		public PderContext pder() {
			return getRuleContext(PderContext.class,0);
		}
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
		}
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public CondexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterCondexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitCondexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitCondexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondexprContext condexpr() throws RecognitionException {
		return condexpr(0);
	}

	private CondexprContext condexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondexprContext _localctx = new CondexprContext(_ctx, _parentState);
		CondexprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(166);
				not();
				setState(167);
				pizq();
				setState(168);
				condexpr(0);
				setState(169);
				pder();
				}
				break;
			case 2:
				{
				setState(171);
				pizq();
				setState(172);
				condexpr(0);
				setState(173);
				pder();
				}
				break;
			case 3:
				{
				setState(175);
				arithexpr(0);
				setState(176);
				oprel();
				setState(177);
				arithexpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new CondexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condexpr);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						or();
						setState(183);
						condexpr(4);
						}
						break;
					case 2:
						{
						_localctx = new CondexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condexpr);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						and();
						setState(187);
						condexpr(3);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithexprContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PizqContext pizq() {
			return getRuleContext(PizqContext.class,0);
		}
		public PderContext pder() {
			return getRuleContext(PderContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public SumopContext sumop() {
			return getRuleContext(SumopContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public ArithexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterArithexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitArithexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitArithexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithexprContext arithexpr() throws RecognitionException {
		return arithexpr(0);
	}

	private ArithexprContext arithexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithexprContext _localctx = new ArithexprContext(_ctx, _parentState);
		ArithexprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_arithexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(195);
				sign();
				setState(196);
				arithexpr(5);
				}
				break;
			case 2:
				{
				setState(198);
				number();
				}
				break;
			case 3:
				{
				setState(199);
				pizq();
				setState(200);
				arithexpr(0);
				setState(201);
				pder();
				}
				break;
			case 4:
				{
				setState(203);
				variable();
				}
				break;
			case 5:
				{
				setState(204);
				callfunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ArithexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithexpr);
						setState(207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(208);
						sumop();
						setState(209);
						arithexpr(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithexpr);
						setState(211);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(212);
						mulop();
						setState(213);
						arithexpr(7);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallfunctionContext extends ParserRuleContext {
		public TerminalNode SQUAREROOT() { return getToken(GramaticaCoralParser.SQUAREROOT, 0); }
		public TerminalNode PIZQ() { return getToken(GramaticaCoralParser.PIZQ, 0); }
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
		}
		public TerminalNode PDER() { return getToken(GramaticaCoralParser.PDER, 0); }
		public TerminalNode RAISETOPOWER() { return getToken(GramaticaCoralParser.RAISETOPOWER, 0); }
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public TerminalNode ABSOLUTEVALUE() { return getToken(GramaticaCoralParser.ABSOLUTEVALUE, 0); }
		public TerminalNode RANDOMNUMBER() { return getToken(GramaticaCoralParser.RANDOMNUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GramaticaCoralParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfunctionContext callfunction() throws RecognitionException {
		CallfunctionContext _localctx = new CallfunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_callfunction);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUAREROOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(SQUAREROOT);
				setState(221);
				match(PIZQ);
				setState(222);
				arithexpr(0);
				setState(223);
				match(PDER);
				}
				break;
			case RAISETOPOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(RAISETOPOWER);
				setState(226);
				match(PIZQ);
				setState(227);
				arithexpr(0);
				setState(228);
				coma();
				setState(229);
				arithexpr(0);
				setState(230);
				match(PDER);
				}
				break;
			case ABSOLUTEVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(ABSOLUTEVALUE);
				setState(233);
				match(PIZQ);
				setState(234);
				arithexpr(0);
				setState(235);
				match(PDER);
				}
				break;
			case RANDOMNUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(RANDOMNUMBER);
				setState(238);
				match(PIZQ);
				setState(239);
				arithexpr(0);
				setState(240);
				coma();
				setState(241);
				arithexpr(0);
				setState(242);
				match(PDER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(IDENTIFIER);
				setState(245);
				match(PIZQ);
				setState(246);
				arguments();
				setState(247);
				match(PDER);
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
		public TerminalNode IDENTIFIER() { return getToken(GramaticaCoralParser.IDENTIFIER, 0); }
		public CizqContext cizq() {
			return getRuleContext(CizqContext.class,0);
		}
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public CderContext cder() {
			return getRuleContext(CderContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GramaticaCoralParser.DOT, 0); }
		public TerminalNode RSIZE() { return getToken(GramaticaCoralParser.RSIZE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(IDENTIFIER);
				setState(253);
				cizq();
				setState(254);
				arithexpr(0);
				setState(255);
				cder();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(IDENTIFIER);
				setState(258);
				match(DOT);
				setState(259);
				match(RSIZE);
				}
				break;
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public ArgumentsprimaContext argumentsprima() {
			return getRuleContext(ArgumentsprimaContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arguments);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUAREROOT:
			case RAISETOPOWER:
			case ABSOLUTEVALUE:
			case RANDOMNUMBER:
			case FLOATNUM:
			case INTNUM:
			case SUMOP:
			case PIZQ:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				arithexpr(0);
				setState(263);
				argumentsprima();
				}
				break;
			case PDER:
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

	public static class ArgumentsprimaContext extends ParserRuleContext {
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public ArgumentsprimaContext argumentsprima() {
			return getRuleContext(ArgumentsprimaContext.class,0);
		}
		public ArgumentsprimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsprima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterArgumentsprima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitArgumentsprima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitArgumentsprima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsprimaContext argumentsprima() throws RecognitionException {
		ArgumentsprimaContext _localctx = new ArgumentsprimaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argumentsprima);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				coma();
				setState(269);
				arithexpr(0);
				setState(270);
				argumentsprima();
				}
				break;
			case PDER:
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

	public static class SeedrandomnumbersContext extends ParserRuleContext {
		public TerminalNode SEEDRANDOMNUMBERS() { return getToken(GramaticaCoralParser.SEEDRANDOMNUMBERS, 0); }
		public TerminalNode PIZQ() { return getToken(GramaticaCoralParser.PIZQ, 0); }
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(GramaticaCoralParser.PDER, 0); }
		public SeedrandomnumbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seedrandomnumbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSeedrandomnumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSeedrandomnumbers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSeedrandomnumbers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeedrandomnumbersContext seedrandomnumbers() throws RecognitionException {
		SeedrandomnumbersContext _localctx = new SeedrandomnumbersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_seedrandomnumbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(SEEDRANDOMNUMBERS);
			setState(276);
			match(PIZQ);
			setState(277);
			arithexpr(0);
			setState(278);
			match(PDER);
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

	public static class OutvalueContext extends ParserRuleContext {
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GramaticaCoralParser.STRING, 0); }
		public OutvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterOutvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitOutvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitOutvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutvalueContext outvalue() throws RecognitionException {
		OutvalueContext _localctx = new OutvalueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_outvalue);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUAREROOT:
			case RAISETOPOWER:
			case ABSOLUTEVALUE:
			case RANDOMNUMBER:
			case FLOATNUM:
			case INTNUM:
			case SUMOP:
			case PIZQ:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				arithexpr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(STRING);
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode QUESTIONMARK() { return getToken(GramaticaCoralParser.QUESTIONMARK, 0); }
		public TerminalNode INTNUM() { return getToken(GramaticaCoralParser.INTNUM, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==INTNUM || _la==QUESTIONMARK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NewlinespacesContext extends ParserRuleContext {
		public TerminalNode NEWLINESPACES() { return getToken(GramaticaCoralParser.NEWLINESPACES, 0); }
		public NewlinespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newlinespaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterNewlinespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitNewlinespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitNewlinespaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlinespacesContext newlinespaces() throws RecognitionException {
		NewlinespacesContext _localctx = new NewlinespacesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newlinespaces);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINESPACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(NEWLINESPACES);
				}
				break;
			case FOR:
			case WHILE:
			case IF:
			case ELSEIF:
			case ELSE:
			case SEEDRANDOMNUMBERS:
			case SQUAREROOT:
			case RAISETOPOWER:
			case ABSOLUTEVALUE:
			case RANDOMNUMBER:
			case PUT:
			case TYPE:
			case IDENTIFIER:
			case COMMENT:
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

	public static class Semicolonfor1Context extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GramaticaCoralParser.SEMICOLON, 0); }
		public Semicolonfor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolonfor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSemicolonfor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSemicolonfor1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSemicolonfor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolonfor1Context semicolonfor1() throws RecognitionException {
		Semicolonfor1Context _localctx = new Semicolonfor1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_semicolonfor1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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

	public static class Semicolonfor2Context extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GramaticaCoralParser.SEMICOLON, 0); }
		public Semicolonfor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolonfor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSemicolonfor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSemicolonfor2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSemicolonfor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolonfor2Context semicolonfor2() throws RecognitionException {
		Semicolonfor2Context _localctx = new Semicolonfor2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_semicolonfor2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GramaticaCoralParser.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(NOT);
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(GramaticaCoralParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(OR);
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GramaticaCoralParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(AND);
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

	public static class OprelContext extends ParserRuleContext {
		public TerminalNode OPREL() { return getToken(GramaticaCoralParser.OPREL, 0); }
		public OprelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterOprel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitOprel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitOprel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprelContext oprel() throws RecognitionException {
		OprelContext _localctx = new OprelContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oprel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(OPREL);
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(GramaticaCoralParser.WITH, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_with);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(WITH);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(GramaticaCoralParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitComa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(COMA);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(GramaticaCoralParser.ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ASSIGN);
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

	public static class SumopContext extends ParserRuleContext {
		public TerminalNode SUMOP() { return getToken(GramaticaCoralParser.SUMOP, 0); }
		public SumopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSumop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSumop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSumop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumopContext sumop() throws RecognitionException {
		SumopContext _localctx = new SumopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sumop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SUMOP);
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MULOP() { return getToken(GramaticaCoralParser.MULOP, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mulop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(MULOP);
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

	public static class CizqContext extends ParserRuleContext {
		public TerminalNode CIZQ() { return getToken(GramaticaCoralParser.CIZQ, 0); }
		public CizqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cizq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterCizq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitCizq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitCizq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CizqContext cizq() throws RecognitionException {
		CizqContext _localctx = new CizqContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cizq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(CIZQ);
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

	public static class CderContext extends ParserRuleContext {
		public TerminalNode CDER() { return getToken(GramaticaCoralParser.CDER, 0); }
		public CderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterCder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitCder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitCder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CderContext cder() throws RecognitionException {
		CderContext _localctx = new CderContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CDER);
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

	public static class PizqContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(GramaticaCoralParser.PIZQ, 0); }
		public PizqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pizq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterPizq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitPizq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitPizq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PizqContext pizq() throws RecognitionException {
		PizqContext _localctx = new PizqContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_pizq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(PIZQ);
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

	public static class PderContext extends ParserRuleContext {
		public TerminalNode PDER() { return getToken(GramaticaCoralParser.PDER, 0); }
		public PderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterPder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitPder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitPder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PderContext pder() throws RecognitionException {
		PderContext _localctx = new PderContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(PDER);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode SUMOP() { return getToken(GramaticaCoralParser.SUMOP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(SUMOP);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTNUM() { return getToken(GramaticaCoralParser.INTNUM, 0); }
		public TerminalNode FLOATNUM() { return getToken(GramaticaCoralParser.FLOATNUM, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCoralListener ) ((GramaticaCoralListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaCoralVisitor ) return ((GramaticaCoralVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==FLOATNUM || _la==INTNUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return condexpr_sempred((CondexprContext)_localctx, predIndex);
		case 16:
			return arithexpr_sempred((ArithexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condexpr_sempred(CondexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithexpr_sempred(ArithexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0145\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002k\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0088\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a2\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00b4\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00be\b\u000f\n\u000f\f\u000f\u00c1\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ce\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00d8\b\u0010\n\u0010\f\u0010\u00db\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00fa"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0105\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010b\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0112"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u011b\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0121\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0000\u0002\u001e *\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000"+
		"\u0002\u0002\u0000\u0016\u0016))\u0001\u0000\u0015\u0016\u013c\u0000T"+
		"\u0001\u0000\u0000\u0000\u0002[\u0001\u0000\u0000\u0000\u0004]\u0001\u0000"+
		"\u0000\u0000\u0006l\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000"+
		"\nr\u0001\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000\u000ew\u0001\u0000"+
		"\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u0089\u0001\u0000"+
		"\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000"+
		"\u0000\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000"+
		"\u0000\u0000\u001c\u00a3\u0001\u0000\u0000\u0000\u001e\u00b3\u0001\u0000"+
		"\u0000\u0000 \u00cd\u0001\u0000\u0000\u0000\"\u00f9\u0001\u0000\u0000"+
		"\u0000$\u0104\u0001\u0000\u0000\u0000&\u010a\u0001\u0000\u0000\u0000("+
		"\u0111\u0001\u0000\u0000\u0000*\u0113\u0001\u0000\u0000\u0000,\u011a\u0001"+
		"\u0000\u0000\u0000.\u011c\u0001\u0000\u0000\u00000\u0120\u0001\u0000\u0000"+
		"\u00002\u0122\u0001\u0000\u0000\u00004\u0124\u0001\u0000\u0000\u00006"+
		"\u0126\u0001\u0000\u0000\u00008\u0128\u0001\u0000\u0000\u0000:\u012a\u0001"+
		"\u0000\u0000\u0000<\u012c\u0001\u0000\u0000\u0000>\u012e\u0001\u0000\u0000"+
		"\u0000@\u0130\u0001\u0000\u0000\u0000B\u0132\u0001\u0000\u0000\u0000D"+
		"\u0134\u0001\u0000\u0000\u0000F\u0136\u0001\u0000\u0000\u0000H\u0138\u0001"+
		"\u0000\u0000\u0000J\u013a\u0001\u0000\u0000\u0000L\u013c\u0001\u0000\u0000"+
		"\u0000N\u013e\u0001\u0000\u0000\u0000P\u0140\u0001\u0000\u0000\u0000R"+
		"\u0142\u0001\u0000\u0000\u0000TU\u0003\u0002\u0001\u0000UV\u0005\u0000"+
		"\u0000\u0001V\u0001\u0001\u0000\u0000\u0000WX\u0003\u0004\u0002\u0000"+
		"XY\u0003\u0002\u0001\u0000Y\\\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[W\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u0003\u0001"+
		"\u0000\u0000\u0000]j\u00030\u0018\u0000^k\u0003\u0010\b\u0000_k\u0003"+
		"\u0012\t\u0000`k\u0003\u0014\n\u0000ak\u0003\u001a\r\u0000bk\u0003\u001c"+
		"\u000e\u0000ck\u0003*\u0015\u0000dk\u0003\"\u0011\u0000ek\u0003\u0006"+
		"\u0003\u0000fk\u0003\b\u0004\u0000gk\u0003\n\u0005\u0000hk\u0003\f\u0006"+
		"\u0000ik\u0003\u000e\u0007\u0000j^\u0001\u0000\u0000\u0000j_\u0001\u0000"+
		"\u0000\u0000j`\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000jb\u0001"+
		"\u0000\u0000\u0000jc\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000"+
		"je\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u0005\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0004\u0000\u0000mn\u0003\u001e\u000f\u0000"+
		"n\u0007\u0001\u0000\u0000\u0000op\u0005\u0005\u0000\u0000pq\u0003\u001e"+
		"\u000f\u0000q\t\u0001\u0000\u0000\u0000rs\u0005\u0006\u0000\u0000s\u000b"+
		"\u0001\u0000\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0003\u001e\u000f"+
		"\u0000v\r\u0001\u0000\u0000\u0000wx\u0005\u0001\u0000\u0000xy\u0003\u0016"+
		"\u000b\u0000yz\u00032\u0019\u0000z{\u0003\u001e\u000f\u0000{|\u00034\u001a"+
		"\u0000|}\u0003\u0018\f\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\'\u0000\u0000\u007f\u0088\u0005(\u0000\u0000\u0080\u0081\u0005\'\u0000"+
		"\u0000\u0081\u0082\u0005\u0013\u0000\u0000\u0082\u0083\u0005\u001c\u0000"+
		"\u0000\u0083\u0084\u0003.\u0017\u0000\u0084\u0085\u0005\u001d\u0000\u0000"+
		"\u0085\u0086\u0005(\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087"+
		"~\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000\u0088\u0011"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0003$\u0012\u0000\u008a\u008b\u0003"+
		"B!\u0000\u008b\u008c\u0005$\u0000\u0000\u008c\u008d\u0005%\u0000\u0000"+
		"\u008d\u008e\u0005&\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0003$\u0012\u0000\u0090\u0091\u0003B!\u0000\u0091\u0092\u0003"+
		" \u0010\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0094\u0003\u0014"+
		"\n\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0014\n"+
		"\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u0098\u0005!\u0000\u0000"+
		"\u0098\u0099\u0003,\u0016\u0000\u0099\u009a\u0005\"\u0000\u0000\u009a"+
		"\u00a1\u0005#\u0000\u0000\u009b\u009c\u0003>\u001f\u0000\u009c\u009d\u0003"+
		" \u0010\u0000\u009d\u009e\u0005\u000b\u0000\u0000\u009e\u009f\u0005\f"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u001b\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005*\u0000"+
		"\u0000\u00a4\u001d\u0001\u0000\u0000\u0000\u00a5\u00a6\u0006\u000f\uffff"+
		"\uffff\u0000\u00a6\u00a7\u00036\u001b\u0000\u00a7\u00a8\u0003L&\u0000"+
		"\u00a8\u00a9\u0003\u001e\u000f\u0000\u00a9\u00aa\u0003N\'\u0000\u00aa"+
		"\u00b4\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003L&\u0000\u00ac\u00ad\u0003"+
		"\u001e\u000f\u0000\u00ad\u00ae\u0003N\'\u0000\u00ae\u00b4\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0003 \u0010\u0000\u00b0\u00b1\u0003<\u001e\u0000"+
		"\u00b1\u00b2\u0003 \u0010\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3"+
		"\u00af\u0001\u0000\u0000\u0000\u00b4\u00bf\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\n\u0003\u0000\u0000\u00b6\u00b7\u00038\u001c\u0000\u00b7\u00b8"+
		"\u0003\u001e\u000f\u0004\u00b8\u00be\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\n\u0002\u0000\u0000\u00ba\u00bb\u0003:\u001d\u0000\u00bb\u00bc\u0003"+
		"\u001e\u000f\u0003\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001"+
		"\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00be\u00c1\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u001f\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0006\u0010\uffff\uffff\u0000\u00c3\u00c4"+
		"\u0003P(\u0000\u00c4\u00c5\u0003 \u0010\u0005\u00c5\u00ce\u0001\u0000"+
		"\u0000\u0000\u00c6\u00ce\u0003R)\u0000\u00c7\u00c8\u0003L&\u0000\u00c8"+
		"\u00c9\u0003 \u0010\u0000\u00c9\u00ca\u0003N\'\u0000\u00ca\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cb\u00ce\u0003$\u0012\u0000\u00cc\u00ce\u0003\""+
		"\u0011\u0000\u00cd\u00c2\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d9\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\n\u0007\u0000\u0000\u00d0\u00d1\u0003D\"\u0000"+
		"\u00d1\u00d2\u0003 \u0010\b\u00d2\u00d8\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\n\u0006\u0000\u0000\u00d4\u00d5\u0003F#\u0000\u00d5\u00d6\u0003"+
		" \u0010\u0007\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da!\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u000e\u0000\u0000\u00dd\u00de\u0005\u001c\u0000"+
		"\u0000\u00de\u00df\u0003 \u0010\u0000\u00df\u00e0\u0005\u001d\u0000\u0000"+
		"\u00e0\u00fa\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u000f\u0000\u0000"+
		"\u00e2\u00e3\u0005\u001c\u0000\u0000\u00e3\u00e4\u0003 \u0010\u0000\u00e4"+
		"\u00e5\u0003@ \u0000\u00e5\u00e6\u0003 \u0010\u0000\u00e6\u00e7\u0005"+
		"\u001d\u0000\u0000\u00e7\u00fa\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"\u0010\u0000\u0000\u00e9\u00ea\u0005\u001c\u0000\u0000\u00ea\u00eb\u0003"+
		" \u0010\u0000\u00eb\u00ec\u0005\u001d\u0000\u0000\u00ec\u00fa\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0005\u0011\u0000\u0000\u00ee\u00ef\u0005\u001c"+
		"\u0000\u0000\u00ef\u00f0\u0003 \u0010\u0000\u00f0\u00f1\u0003@ \u0000"+
		"\u00f1\u00f2\u0003 \u0010\u0000\u00f2\u00f3\u0005\u001d\u0000\u0000\u00f3"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005(\u0000\u0000\u00f5\u00f6"+
		"\u0005\u001c\u0000\u0000\u00f6\u00f7\u0003&\u0013\u0000\u00f7\u00f8\u0005"+
		"\u001d\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00f9\u00e1\u0001\u0000\u0000\u0000\u00f9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00f9\u00ed\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001"+
		"\u0000\u0000\u0000\u00fa#\u0001\u0000\u0000\u0000\u00fb\u0105\u0005(\u0000"+
		"\u0000\u00fc\u00fd\u0005(\u0000\u0000\u00fd\u00fe\u0003H$\u0000\u00fe"+
		"\u00ff\u0003 \u0010\u0000\u00ff\u0100\u0003J%\u0000\u0100\u0105\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005(\u0000\u0000\u0102\u0103\u0005\u001f"+
		"\u0000\u0000\u0103\u0105\u0005 \u0000\u0000\u0104\u00fb\u0001\u0000\u0000"+
		"\u0000\u0104\u00fc\u0001\u0000\u0000\u0000\u0104\u0101\u0001\u0000\u0000"+
		"\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0107\u0003 \u0010\u0000\u0107"+
		"\u0108\u0003(\u0014\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u010b"+
		"\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\'\u0001\u0000\u0000\u0000\u010c\u010d\u0003"+
		"@ \u0000\u010d\u010e\u0003 \u0010\u0000\u010e\u010f\u0003(\u0014\u0000"+
		"\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000"+
		"\u0111\u010c\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0112)\u0001\u0000\u0000\u0000\u0113\u0114\u0005\r\u0000\u0000\u0114"+
		"\u0115\u0005\u001c\u0000\u0000\u0115\u0116\u0003 \u0010\u0000\u0116\u0117"+
		"\u0005\u001d\u0000\u0000\u0117+\u0001\u0000\u0000\u0000\u0118\u011b\u0003"+
		" \u0010\u0000\u0119\u011b\u0005\u0014\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b-\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0007\u0000\u0000\u0000\u011d/\u0001\u0000\u0000\u0000"+
		"\u011e\u0121\u0005+\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
		"1\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0002\u0000\u0000\u01233\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0005\u0002\u0000\u0000\u01255\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005\t\u0000\u0000\u01277\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0005\b\u0000\u0000\u01299\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0005\u0007\u0000\u0000\u012b;\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005\u0017\u0000\u0000\u012d=\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0005\n\u0000\u0000\u012f?\u0001\u0000\u0000\u0000\u0130\u0131\u0005"+
		"\u0012\u0000\u0000\u0131A\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u001e"+
		"\u0000\u0000\u0133C\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0018\u0000"+
		"\u0000\u0135E\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0019\u0000\u0000"+
		"\u0137G\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u001a\u0000\u0000\u0139"+
		"I\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u001b\u0000\u0000\u013bK\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005\u001c\u0000\u0000\u013dM\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0005\u001d\u0000\u0000\u013fO\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0005\u0018\u0000\u0000\u0141Q\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0007\u0001\u0000\u0000\u0143S\u0001\u0000\u0000\u0000\u0010"+
		"[j\u0087\u00a1\u00b3\u00bd\u00bf\u00cd\u00d7\u00d9\u00f9\u0104\u010a\u0111"+
		"\u011a\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}