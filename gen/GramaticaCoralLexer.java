// Generated from C:/Users/scass/Desktop/trabajos santiago/Septimo Semestre Unal/Lenguajes de Programacion/Practica/Prueba/grammar\GramaticaCoral.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaCoralLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARRAY=1, SIZE=2, STRING=3, FLOATNUM=4, INTNUM=5, SUMOP=6, MULOP=7, PIZQ=8, 
		PDER=9, ASSIGN=10, PUT=11, TO=12, OUTPUT=13, GET=14, NEXT=15, INPUT=16, 
		TYPE=17, IDENTIFIER=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARRAY", "SIZE", "STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", "PIZQ", 
			"PDER", "ASSIGN", "PUT", "TO", "OUTPUT", "GET", "NEXT", "INPUT", "TYPE", 
			"IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'array'", null, null, null, null, null, null, "'('", "')'", "'='", 
			"'Put'", "'to'", "'output'", "'Get'", "'next'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARRAY", "SIZE", "STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", 
			"PIZQ", "PDER", "ASSIGN", "PUT", "TO", "OUTPUT", "GET", "NEXT", "INPUT", 
			"TYPE", "IDENTIFIER", "WS"
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


	public GramaticaCoralLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaCoral.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u00010\b\u0001"+
		"\u000b\u0001\f\u00011\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0004\u0003@\b\u0003\u000b\u0003\f\u0003A\u0001\u0003\u0001\u0003"+
		"\u0004\u0003F\b\u0003\u000b\u0003\f\u0003G\u0001\u0004\u0004\u0004K\b"+
		"\u0004\u000b\u0004\f\u0004L\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0082\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0086\b\u0011\n\u0011"+
		"\f\u0011\u0089\t\u0011\u0001\u0012\u0004\u0012\u008c\b\u0012\u000b\u0012"+
		"\f\u0012\u008d\u0001\u0012\u0001\u0012\u00019\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\b\u0001\u000009\u0001\u0000"+
		"\"\"\u0001\u0000..\u0002\u0000++--\u0003\u0000%%**//\u0002\u0000AZaz\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u0099\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000"+
		"\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000"+
		"\u0007?\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bN\u0001"+
		"\u0000\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000"+
		"\u0000\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015"+
		"X\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019_\u0001"+
		"\u0000\u0000\u0000\u001bf\u0001\u0000\u0000\u0000\u001dj\u0001\u0000\u0000"+
		"\u0000\u001fo\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#"+
		"\u0083\u0001\u0000\u0000\u0000%\u008b\u0001\u0000\u0000\u0000\'(\u0005"+
		"a\u0000\u0000()\u0005r\u0000\u0000)*\u0005r\u0000\u0000*+\u0005a\u0000"+
		"\u0000+,\u0005y\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-4\u0005?\u0000"+
		"\u0000.0\u0007\u0000\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001"+
		"\u0000\u0000\u00003-\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u0000"+
		"4\u0004\u0001\u0000\u0000\u000059\u0007\u0001\u0000\u000068\t\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000<=\u0007\u0001\u0000\u0000=\u0006\u0001\u0000\u0000"+
		"\u0000>@\u0007\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0007\u0002\u0000\u0000DF\u0007\u0000\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\b\u0001\u0000\u0000\u0000IK\u0007\u0000"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\n\u0001\u0000\u0000\u0000"+
		"NO\u0007\u0003\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0007\u0004\u0000"+
		"\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0005(\u0000\u0000S\u0010\u0001"+
		"\u0000\u0000\u0000TU\u0005)\u0000\u0000U\u0012\u0001\u0000\u0000\u0000"+
		"VW\u0005=\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XY\u0005P\u0000\u0000"+
		"YZ\u0005u\u0000\u0000Z[\u0005t\u0000\u0000[\u0016\u0001\u0000\u0000\u0000"+
		"\\]\u0005t\u0000\u0000]^\u0005o\u0000\u0000^\u0018\u0001\u0000\u0000\u0000"+
		"_`\u0005o\u0000\u0000`a\u0005u\u0000\u0000ab\u0005t\u0000\u0000bc\u0005"+
		"p\u0000\u0000cd\u0005u\u0000\u0000de\u0005t\u0000\u0000e\u001a\u0001\u0000"+
		"\u0000\u0000fg\u0005G\u0000\u0000gh\u0005e\u0000\u0000hi\u0005t\u0000"+
		"\u0000i\u001c\u0001\u0000\u0000\u0000jk\u0005n\u0000\u0000kl\u0005e\u0000"+
		"\u0000lm\u0005x\u0000\u0000mn\u0005t\u0000\u0000n\u001e\u0001\u0000\u0000"+
		"\u0000op\u0005i\u0000\u0000pq\u0005n\u0000\u0000qr\u0005p\u0000\u0000"+
		"rs\u0005u\u0000\u0000st\u0005t\u0000\u0000t \u0001\u0000\u0000\u0000u"+
		"v\u0005i\u0000\u0000vw\u0005n\u0000\u0000wx\u0005t\u0000\u0000xy\u0005"+
		"e\u0000\u0000yz\u0005g\u0000\u0000z{\u0005e\u0000\u0000{\u0082\u0005r"+
		"\u0000\u0000|}\u0005f\u0000\u0000}~\u0005l\u0000\u0000~\u007f\u0005o\u0000"+
		"\u0000\u007f\u0080\u0005a\u0000\u0000\u0080\u0082\u0005t\u0000\u0000\u0081"+
		"u\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0082\"\u0001"+
		"\u0000\u0000\u0000\u0083\u0087\u0007\u0005\u0000\u0000\u0084\u0086\u0007"+
		"\u0006\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088$\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0007\u0007\u0000\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0006\u0012\u0000\u0000\u0090&\u0001\u0000\u0000"+
		"\u0000\n\u0000139AGL\u0081\u0087\u008d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}