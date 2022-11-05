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
		STRING=1, FLOATNUM=2, INTNUM=3, SUMOP=4, MULOP=5, PIZQ=6, PDER=7, ASSIGN=8, 
		PUT=9, TO=10, OUTPUT=11, GET=12, NEXT=13, INPUT=14, TYPE=15, IDENTIFIER=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", "PIZQ", "PDER", "ASSIGN", 
			"PUT", "TO", "OUTPUT", "GET", "NEXT", "INPUT", "TYPE", "IDENTIFIER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", "'='", "'Put'", "'to'", 
			"'output'", "'Get'", "'next'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", "PIZQ", "PDER", 
			"ASSIGN", "PUT", "TO", "OUTPUT", "GET", "NEXT", "INPUT", "TYPE", "IDENTIFIER", 
			"WS"
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
		"\u0004\u0000\u0011\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0005\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001.\b\u0001\u000b\u0001\f\u0001/\u0001\u0001\u0001"+
		"\u0001\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0001\u0002\u0004\u0002"+
		"9\b\u0002\u000b\u0002\f\u0002:\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ep\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000ft\b\u000f\n\u000f\f\u000fw\t\u000f\u0001"+
		"\u0010\u0004\u0010z\b\u0010\u000b\u0010\f\u0010{\u0001\u0010\u0001\u0010"+
		"\u0001\'\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\b\u0001"+
		"\u0000\"\"\u0001\u000009\u0001\u0000..\u0002\u0000++--\u0003\u0000%%*"+
		"*//\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0085\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u00058\u0001\u0000\u0000\u0000\u0007<\u0001\u0000\u0000\u0000\t"+
		">\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rB\u0001\u0000"+
		"\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000"+
		"\u0013J\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017T"+
		"\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001b]\u0001\u0000"+
		"\u0000\u0000\u001do\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000"+
		"!y\u0001\u0000\u0000\u0000#\'\u0007\u0000\u0000\u0000$&\t\u0000\u0000"+
		"\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000*+\u0007\u0000\u0000\u0000+\u0002\u0001\u0000\u0000"+
		"\u0000,.\u0007\u0001\u0000\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000013\u0007\u0002\u0000\u000024\u0007\u0001\u0000\u0000"+
		"32\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006\u0004\u0001\u0000\u0000\u000079\u0007"+
		"\u0001\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0006\u0001\u0000"+
		"\u0000\u0000<=\u0007\u0003\u0000\u0000=\b\u0001\u0000\u0000\u0000>?\u0007"+
		"\u0004\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005(\u0000\u0000A\f"+
		"\u0001\u0000\u0000\u0000BC\u0005)\u0000\u0000C\u000e\u0001\u0000\u0000"+
		"\u0000DE\u0005=\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005P\u0000"+
		"\u0000GH\u0005u\u0000\u0000HI\u0005t\u0000\u0000I\u0012\u0001\u0000\u0000"+
		"\u0000JK\u0005t\u0000\u0000KL\u0005o\u0000\u0000L\u0014\u0001\u0000\u0000"+
		"\u0000MN\u0005o\u0000\u0000NO\u0005u\u0000\u0000OP\u0005t\u0000\u0000"+
		"PQ\u0005p\u0000\u0000QR\u0005u\u0000\u0000RS\u0005t\u0000\u0000S\u0016"+
		"\u0001\u0000\u0000\u0000TU\u0005G\u0000\u0000UV\u0005e\u0000\u0000VW\u0005"+
		"t\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005"+
		"e\u0000\u0000Z[\u0005x\u0000\u0000[\\\u0005t\u0000\u0000\\\u001a\u0001"+
		"\u0000\u0000\u0000]^\u0005i\u0000\u0000^_\u0005n\u0000\u0000_`\u0005p"+
		"\u0000\u0000`a\u0005u\u0000\u0000ab\u0005t\u0000\u0000b\u001c\u0001\u0000"+
		"\u0000\u0000cd\u0005i\u0000\u0000de\u0005n\u0000\u0000ef\u0005t\u0000"+
		"\u0000fg\u0005e\u0000\u0000gh\u0005g\u0000\u0000hi\u0005e\u0000\u0000"+
		"ip\u0005r\u0000\u0000jk\u0005f\u0000\u0000kl\u0005l\u0000\u0000lm\u0005"+
		"o\u0000\u0000mn\u0005a\u0000\u0000np\u0005t\u0000\u0000oc\u0001\u0000"+
		"\u0000\u0000oj\u0001\u0000\u0000\u0000p\u001e\u0001\u0000\u0000\u0000"+
		"qu\u0007\u0005\u0000\u0000rt\u0007\u0006\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v \u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0007"+
		"\u0007\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0006\u0010\u0000\u0000~\"\u0001\u0000\u0000\u0000\b\u0000\'"+
		"/5:ou{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}