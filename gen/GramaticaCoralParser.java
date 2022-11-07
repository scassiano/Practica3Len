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
		IF=1, ELSEIF=2, ELSE=3, AND=4, OR=5, NOT=6, WITH=7, DECIMAL=8, PLACES=9, 
		SEEDRANDOMNUMBERS=10, SQUAREROOT=11, RAISETOPOWER=12, ABSOLUTEVALUE=13, 
		RANDOMNUMBER=14, COMA=15, ARRAY=16, STRING=17, FLOATNUM=18, INTNUM=19, 
		OPREL=20, SUMOP=21, MULOP=22, CIZQ=23, CDER=24, PIZQ=25, PDER=26, ASSIGN=27, 
		DOT=28, RSIZE=29, PUT=30, TO=31, OUTPUT=32, GET=33, NEXT=34, INPUT=35, 
		TYPE=36, IDENTIFIER=37, QUESTIONMARK=38, COMMENT=39, NEWLINESPACES=40, 
		NEWLINESPACESEOF=41, WS=42;
	public static final int
		RULE_init = 0, RULE_commands = 1, RULE_command = 2, RULE_if = 3, RULE_declaration = 4, 
		RULE_input = 5, RULE_set = 6, RULE_output = 7, RULE_comment = 8, RULE_condexpr = 9, 
		RULE_arithexpr = 10, RULE_callfunction = 11, RULE_variable = 12, RULE_arguments = 13, 
		RULE_argumentsprima = 14, RULE_seedrandomnumbers = 15, RULE_outvalue = 16, 
		RULE_size = 17, RULE_newlinespaces = 18, RULE_not = 19, RULE_or = 20, 
		RULE_and = 21, RULE_oprel = 22, RULE_with = 23, RULE_coma = 24, RULE_assign = 25, 
		RULE_sumop = 26, RULE_mulop = 27, RULE_cizq = 28, RULE_cder = 29, RULE_pizq = 30, 
		RULE_pder = 31, RULE_sign = 32, RULE_number = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "commands", "command", "if", "declaration", "input", "set", "output", 
			"comment", "condexpr", "arithexpr", "callfunction", "variable", "arguments", 
			"argumentsprima", "seedrandomnumbers", "outvalue", "size", "newlinespaces", 
			"not", "or", "and", "oprel", "with", "coma", "assign", "sumop", "mulop", 
			"cizq", "cder", "pizq", "pder", "sign", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elseif'", "'else'", "'and'", "'or'", "'not'", "'with'", 
			"'decimal'", "'places'", "'SeedRandomNumbers'", "'SquareRoot'", "'RaiseToPower'", 
			"'AbsoluteValue'", "'RandomNumber'", "','", "'array'", null, null, null, 
			null, null, null, "'['", "']'", "'('", "')'", "'='", "'.'", "'size'", 
			"'Put'", "'to'", "'output'", "'Get'", "'next'", "'input'", null, null, 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSEIF", "ELSE", "AND", "OR", "NOT", "WITH", "DECIMAL", 
			"PLACES", "SEEDRANDOMNUMBERS", "SQUAREROOT", "RAISETOPOWER", "ABSOLUTEVALUE", 
			"RANDOMNUMBER", "COMA", "ARRAY", "STRING", "FLOATNUM", "INTNUM", "OPREL", 
			"SUMOP", "MULOP", "CIZQ", "CDER", "PIZQ", "PDER", "ASSIGN", "DOT", "RSIZE", 
			"PUT", "TO", "OUTPUT", "GET", "NEXT", "INPUT", "TYPE", "IDENTIFIER", 
			"QUESTIONMARK", "COMMENT", "NEWLINESPACES", "NEWLINESPACESEOF", "WS"
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
			setState(68);
			commands();
			setState(69);
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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
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
				setState(71);
				command();
				setState(72);
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
			setState(77);
			newlinespaces();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(78);
				declaration();
				}
				break;
			case 2:
				{
				setState(79);
				input();
				}
				break;
			case 3:
				{
				setState(80);
				set();
				}
				break;
			case 4:
				{
				setState(81);
				output();
				}
				break;
			case 5:
				{
				setState(82);
				comment();
				}
				break;
			case 6:
				{
				setState(83);
				seedrandomnumbers();
				}
				break;
			case 7:
				{
				setState(84);
				callfunction();
				}
				break;
			case 8:
				{
				setState(85);
				if_();
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
			setState(88);
			match(IF);
			setState(89);
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
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(TYPE);
				setState(92);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(TYPE);
				setState(94);
				match(ARRAY);
				setState(95);
				match(PIZQ);
				setState(96);
				size();
				setState(97);
				match(PDER);
				setState(98);
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
		enterRule(_localctx, 10, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			variable();
			setState(103);
			assign();
			setState(104);
			match(GET);
			setState(105);
			match(NEXT);
			setState(106);
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
		enterRule(_localctx, 12, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			variable();
			setState(109);
			assign();
			setState(110);
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
		enterRule(_localctx, 14, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PUT);
			setState(113);
			outvalue();
			setState(114);
			match(TO);
			setState(115);
			match(OUTPUT);
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				{
				setState(116);
				with();
				setState(117);
				arithexpr(0);
				setState(118);
				match(DECIMAL);
				setState(119);
				match(PLACES);
				}
				break;
			case EOF:
			case IF:
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
		enterRule(_localctx, 16, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_condexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(127);
				not();
				setState(128);
				pizq();
				setState(129);
				condexpr(0);
				setState(130);
				pder();
				}
				break;
			case 2:
				{
				setState(132);
				pizq();
				setState(133);
				condexpr(0);
				setState(134);
				pder();
				}
				break;
			case 3:
				{
				setState(136);
				arithexpr(0);
				setState(137);
				oprel();
				setState(138);
				arithexpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new CondexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condexpr);
						setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(143);
						or();
						setState(144);
						condexpr(4);
						}
						break;
					case 2:
						{
						_localctx = new CondexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condexpr);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						and();
						setState(148);
						condexpr(3);
						}
						break;
					}
					} 
				}
				setState(154);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(156);
				sign();
				setState(157);
				arithexpr(5);
				}
				break;
			case 2:
				{
				setState(159);
				number();
				}
				break;
			case 3:
				{
				setState(160);
				pizq();
				setState(161);
				arithexpr(0);
				setState(162);
				pder();
				}
				break;
			case 4:
				{
				setState(164);
				variable();
				}
				break;
			case 5:
				{
				setState(165);
				callfunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ArithexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithexpr);
						setState(168);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(169);
						sumop();
						setState(170);
						arithexpr(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithexpr);
						setState(172);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(173);
						mulop();
						setState(174);
						arithexpr(7);
						}
						break;
					}
					} 
				}
				setState(180);
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
		enterRule(_localctx, 22, RULE_callfunction);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQUAREROOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(SQUAREROOT);
				setState(182);
				match(PIZQ);
				setState(183);
				arithexpr(0);
				setState(184);
				match(PDER);
				}
				break;
			case RAISETOPOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(RAISETOPOWER);
				setState(187);
				match(PIZQ);
				setState(188);
				arithexpr(0);
				setState(189);
				coma();
				setState(190);
				arithexpr(0);
				setState(191);
				match(PDER);
				}
				break;
			case ABSOLUTEVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(ABSOLUTEVALUE);
				setState(194);
				match(PIZQ);
				setState(195);
				arithexpr(0);
				setState(196);
				match(PDER);
				}
				break;
			case RANDOMNUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(RANDOMNUMBER);
				setState(199);
				match(PIZQ);
				setState(200);
				arithexpr(0);
				setState(201);
				coma();
				setState(202);
				arithexpr(0);
				setState(203);
				match(PDER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(IDENTIFIER);
				setState(206);
				match(PIZQ);
				setState(207);
				arguments();
				setState(208);
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
		enterRule(_localctx, 24, RULE_variable);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(IDENTIFIER);
				setState(214);
				cizq();
				setState(215);
				arithexpr(0);
				setState(216);
				cder();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(IDENTIFIER);
				setState(219);
				match(DOT);
				setState(220);
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
		enterRule(_localctx, 26, RULE_arguments);
		try {
			setState(227);
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
				setState(223);
				arithexpr(0);
				setState(224);
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
		enterRule(_localctx, 28, RULE_argumentsprima);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				coma();
				setState(230);
				arithexpr(0);
				setState(231);
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
		enterRule(_localctx, 30, RULE_seedrandomnumbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(SEEDRANDOMNUMBERS);
			setState(237);
			match(PIZQ);
			setState(238);
			arithexpr(0);
			setState(239);
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
		enterRule(_localctx, 32, RULE_outvalue);
		try {
			setState(243);
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
				setState(241);
				arithexpr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		enterRule(_localctx, 34, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 36, RULE_newlinespaces);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINESPACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(NEWLINESPACES);
				}
				break;
			case IF:
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
		enterRule(_localctx, 38, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 40, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 42, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 44, RULE_oprel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 46, RULE_with);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		enterRule(_localctx, 48, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 50, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 52, RULE_sumop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 54, RULE_mulop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 56, RULE_cizq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 58, RULE_cder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 60, RULE_pizq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 62, RULE_pder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 64, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 66, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		case 9:
			return condexpr_sempred((CondexprContext)_localctx, predIndex);
		case 10:
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
		"\u0004\u0001*\u011a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001L\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007{\b"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u008d\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0097\b\t\n\t\f\t\u009a\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a7"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00b1\b\n\n\n\f\n\u00b4\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00d3\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00de\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00e4\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00eb\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00fa\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0000\u0002\u0012\u0014\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0002"+
		"\u0002\u0000\u0013\u0013&&\u0001\u0000\u0012\u0013\u0115\u0000D\u0001"+
		"\u0000\u0000\u0000\u0002K\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000"+
		"\u0000\u0006X\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\nf\u0001"+
		"\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000"+
		"\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000"+
		"\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000"+
		"\u0018\u00dd\u0001\u0000\u0000\u0000\u001a\u00e3\u0001\u0000\u0000\u0000"+
		"\u001c\u00ea\u0001\u0000\u0000\u0000\u001e\u00ec\u0001\u0000\u0000\u0000"+
		" \u00f3\u0001\u0000\u0000\u0000\"\u00f5\u0001\u0000\u0000\u0000$\u00f9"+
		"\u0001\u0000\u0000\u0000&\u00fb\u0001\u0000\u0000\u0000(\u00fd\u0001\u0000"+
		"\u0000\u0000*\u00ff\u0001\u0000\u0000\u0000,\u0101\u0001\u0000\u0000\u0000"+
		".\u0103\u0001\u0000\u0000\u00000\u0105\u0001\u0000\u0000\u00002\u0107"+
		"\u0001\u0000\u0000\u00004\u0109\u0001\u0000\u0000\u00006\u010b\u0001\u0000"+
		"\u0000\u00008\u010d\u0001\u0000\u0000\u0000:\u010f\u0001\u0000\u0000\u0000"+
		"<\u0111\u0001\u0000\u0000\u0000>\u0113\u0001\u0000\u0000\u0000@\u0115"+
		"\u0001\u0000\u0000\u0000B\u0117\u0001\u0000\u0000\u0000DE\u0003\u0002"+
		"\u0001\u0000EF\u0005\u0000\u0000\u0001F\u0001\u0001\u0000\u0000\u0000"+
		"GH\u0003\u0004\u0002\u0000HI\u0003\u0002\u0001\u0000IL\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MV\u0003$\u0012\u0000NW\u0003"+
		"\b\u0004\u0000OW\u0003\n\u0005\u0000PW\u0003\f\u0006\u0000QW\u0003\u000e"+
		"\u0007\u0000RW\u0003\u0010\b\u0000SW\u0003\u001e\u000f\u0000TW\u0003\u0016"+
		"\u000b\u0000UW\u0003\u0006\u0003\u0000VN\u0001\u0000\u0000\u0000VO\u0001"+
		"\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000"+
		"VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0001\u0000\u0000YZ\u0003\u0012\t\u0000Z\u0007\u0001\u0000\u0000\u0000"+
		"[\\\u0005$\u0000\u0000\\e\u0005%\u0000\u0000]^\u0005$\u0000\u0000^_\u0005"+
		"\u0010\u0000\u0000_`\u0005\u0019\u0000\u0000`a\u0003\"\u0011\u0000ab\u0005"+
		"\u001a\u0000\u0000bc\u0005%\u0000\u0000ce\u0001\u0000\u0000\u0000d[\u0001"+
		"\u0000\u0000\u0000d]\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000"+
		"fg\u0003\u0018\f\u0000gh\u00032\u0019\u0000hi\u0005!\u0000\u0000ij\u0005"+
		"\"\u0000\u0000jk\u0005#\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lm\u0003"+
		"\u0018\f\u0000mn\u00032\u0019\u0000no\u0003\u0014\n\u0000o\r\u0001\u0000"+
		"\u0000\u0000pq\u0005\u001e\u0000\u0000qr\u0003 \u0010\u0000rs\u0005\u001f"+
		"\u0000\u0000sz\u0005 \u0000\u0000tu\u0003.\u0017\u0000uv\u0003\u0014\n"+
		"\u0000vw\u0005\b\u0000\u0000wx\u0005\t\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000y{\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0005\'\u0000\u0000}\u0011"+
		"\u0001\u0000\u0000\u0000~\u007f\u0006\t\uffff\uffff\u0000\u007f\u0080"+
		"\u0003&\u0013\u0000\u0080\u0081\u0003<\u001e\u0000\u0081\u0082\u0003\u0012"+
		"\t\u0000\u0082\u0083\u0003>\u001f\u0000\u0083\u008d\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0003<\u001e\u0000\u0085\u0086\u0003\u0012\t\u0000"+
		"\u0086\u0087\u0003>\u001f\u0000\u0087\u008d\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0003\u0014\n\u0000\u0089\u008a\u0003,\u0016\u0000\u008a\u008b"+
		"\u0003\u0014\n\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c~\u0001"+
		"\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u0088\u0001"+
		"\u0000\u0000\u0000\u008d\u0098\u0001\u0000\u0000\u0000\u008e\u008f\n\u0003"+
		"\u0000\u0000\u008f\u0090\u0003(\u0014\u0000\u0090\u0091\u0003\u0012\t"+
		"\u0004\u0091\u0097\u0001\u0000\u0000\u0000\u0092\u0093\n\u0002\u0000\u0000"+
		"\u0093\u0094\u0003*\u0015\u0000\u0094\u0095\u0003\u0012\t\u0003\u0095"+
		"\u0097\u0001\u0000\u0000\u0000\u0096\u008e\u0001\u0000\u0000\u0000\u0096"+
		"\u0092\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u0013\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0006\n\uffff\uffff\u0000\u009c\u009d\u0003@ \u0000\u009d\u009e"+
		"\u0003\u0014\n\u0005\u009e\u00a7\u0001\u0000\u0000\u0000\u009f\u00a7\u0003"+
		"B!\u0000\u00a0\u00a1\u0003<\u001e\u0000\u00a1\u00a2\u0003\u0014\n\u0000"+
		"\u00a2\u00a3\u0003>\u001f\u0000\u00a3\u00a7\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a7\u0003\u0018\f\u0000\u00a5\u00a7\u0003\u0016\u000b\u0000\u00a6\u009b"+
		"\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000\u0000\u0000\u00a6\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00b2\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\n\u0007\u0000\u0000\u00a9\u00aa\u00034\u001a\u0000\u00aa\u00ab\u0003"+
		"\u0014\n\b\u00ab\u00b1\u0001\u0000\u0000\u0000\u00ac\u00ad\n\u0006\u0000"+
		"\u0000\u00ad\u00ae\u00036\u001b\u0000\u00ae\u00af\u0003\u0014\n\u0007"+
		"\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u0015\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6\u00b7\u0005\u0019\u0000\u0000"+
		"\u00b7\u00b8\u0003\u0014\n\u0000\u00b8\u00b9\u0005\u001a\u0000\u0000\u00b9"+
		"\u00d3\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\f\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0019\u0000\u0000\u00bc\u00bd\u0003\u0014\n\u0000\u00bd\u00be\u0003"+
		"0\u0018\u0000\u00be\u00bf\u0003\u0014\n\u0000\u00bf\u00c0\u0005\u001a"+
		"\u0000\u0000\u00c0\u00d3\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\r\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0019\u0000\u0000\u00c3\u00c4\u0003\u0014\n\u0000"+
		"\u00c4\u00c5\u0005\u001a\u0000\u0000\u00c5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005\u000e\u0000\u0000\u00c7\u00c8\u0005\u0019\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0014\n\u0000\u00c9\u00ca\u00030\u0018\u0000\u00ca"+
		"\u00cb\u0003\u0014\n\u0000\u00cb\u00cc\u0005\u001a\u0000\u0000\u00cc\u00d3"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005%\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0019\u0000\u0000\u00cf\u00d0\u0003\u001a\r\u0000\u00d0\u00d1\u0005\u001a"+
		"\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00d2\u00ba\u0001\u0000\u0000\u0000\u00d2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00d2\u00c6\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d3\u0017\u0001\u0000\u0000\u0000\u00d4\u00de\u0005%\u0000"+
		"\u0000\u00d5\u00d6\u0005%\u0000\u0000\u00d6\u00d7\u00038\u001c\u0000\u00d7"+
		"\u00d8\u0003\u0014\n\u0000\u00d8\u00d9\u0003:\u001d\u0000\u00d9\u00de"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0005%\u0000\u0000\u00db\u00dc\u0005"+
		"\u001c\u0000\u0000\u00dc\u00de\u0005\u001d\u0000\u0000\u00dd\u00d4\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d5\u0001\u0000\u0000\u0000\u00dd\u00da\u0001"+
		"\u0000\u0000\u0000\u00de\u0019\u0001\u0000\u0000\u0000\u00df\u00e0\u0003"+
		"\u0014\n\u0000\u00e0\u00e1\u0003\u001c\u000e\u0000\u00e1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u001b\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u00030\u0018\u0000\u00e6\u00e7\u0003\u0014\n"+
		"\u0000\u00e7\u00e8\u0003\u001c\u000e\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u001d\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee\u0005\u0019\u0000\u0000"+
		"\u00ee\u00ef\u0003\u0014\n\u0000\u00ef\u00f0\u0005\u001a\u0000\u0000\u00f0"+
		"\u001f\u0001\u0000\u0000\u0000\u00f1\u00f4\u0003\u0014\n\u0000\u00f2\u00f4"+
		"\u0005\u0011\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4!\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007"+
		"\u0000\u0000\u0000\u00f6#\u0001\u0000\u0000\u0000\u00f7\u00fa\u0005(\u0000"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa%\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\u0006\u0000\u0000\u00fc\'\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\u0005\u0000\u0000\u00fe)\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\u0004\u0000\u0000\u0100+\u0001\u0000\u0000\u0000\u0101\u0102\u0005"+
		"\u0014\u0000\u0000\u0102-\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0007"+
		"\u0000\u0000\u0104/\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u000f\u0000"+
		"\u0000\u01061\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u001b\u0000\u0000"+
		"\u01083\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0015\u0000\u0000\u010a"+
		"5\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0016\u0000\u0000\u010c7\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u0017\u0000\u0000\u010e9\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0005\u0018\u0000\u0000\u0110;\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005\u0019\u0000\u0000\u0112=\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005\u001a\u0000\u0000\u0114?\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005\u0015\u0000\u0000\u0116A\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0007\u0001\u0000\u0000\u0118C\u0001\u0000\u0000\u0000\u0010KVdz\u008c"+
		"\u0096\u0098\u00a6\u00b0\u00b2\u00d2\u00dd\u00e3\u00ea\u00f3\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}