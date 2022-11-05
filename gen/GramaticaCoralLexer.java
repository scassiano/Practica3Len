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
		ARRAY=1, STRING=2, FLOATNUM=3, INTNUM=4, SUMOP=5, MULOP=6, CIZQ=7, CDER=8, 
		PIZQ=9, PDER=10, ASSIGN=11, DOT=12, RSIZE=13, PUT=14, TO=15, OUTPUT=16, 
		GET=17, NEXT=18, INPUT=19, TYPE=20, IDENTIFIER=21, QUESTIONMARK=22, COMMENT=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARRAY", "STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", "CIZQ", "CDER", 
			"PIZQ", "PDER", "ASSIGN", "DOT", "RSIZE", "PUT", "TO", "OUTPUT", "GET", 
			"NEXT", "INPUT", "TYPE", "IDENTIFIER", "QUESTIONMARK", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'array'", null, null, null, null, null, "'['", "']'", "'('", "')'", 
			"'='", "'.'", "'size'", "'Put'", "'to'", "'output'", "'Get'", "'next'", 
			"'input'", null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARRAY", "STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", "CIZQ", 
			"CDER", "PIZQ", "PDER", "ASSIGN", "DOT", "RSIZE", "PUT", "TO", "OUTPUT", 
			"GET", "NEXT", "INPUT", "TYPE", "IDENTIFIER", "QUESTIONMARK", "COMMENT", 
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
		"\u0004\u0000\u0018\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002B\b\u0002\u000b\u0002"+
		"\f\u0002C\u0001\u0002\u0001\u0002\u0004\u0002H\b\u0002\u000b\u0002\f\u0002"+
		"I\u0001\u0003\u0004\u0003M\b\u0003\u000b\u0003\f\u0003N\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u008f\b\u0013\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0093\b\u0014\n\u0014\f\u0014\u0096\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u009e\b\u0016"+
		"\n\u0016\f\u0016\u00a1\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004"+
		"\u0017\u00a6\b\u0017\u000b\u0017\f\u0017\u00a7\u0001\u0017\u0001\u0017"+
		"\u0002;\u009f\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\t\u0001\u0000\"\"\u0001"+
		"\u000009\u0001\u0000..\u0002\u0000++--\u0003\u0000%%**//\u0002\u0000A"+
		"Zaz\u0004\u000009AZ__az\u0001\u0000\n\n\u0003\u0000\t\n\r\r  \u00b2\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00037\u0001\u0000"+
		"\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007L\u0001\u0000\u0000\u0000"+
		"\tP\u0001\u0000\u0000\u0000\u000bR\u0001\u0000\u0000\u0000\rT\u0001\u0000"+
		"\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000"+
		"\u0013Z\u0001\u0000\u0000\u0000\u0015\\\u0001\u0000\u0000\u0000\u0017"+
		"^\u0001\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001be\u0001"+
		"\u0000\u0000\u0000\u001di\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000"+
		"\u0000!s\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%|\u0001\u0000"+
		"\u0000\u0000\'\u008e\u0001\u0000\u0000\u0000)\u0090\u0001\u0000\u0000"+
		"\u0000+\u0097\u0001\u0000\u0000\u0000-\u0099\u0001\u0000\u0000\u0000/"+
		"\u00a5\u0001\u0000\u0000\u000012\u0005a\u0000\u000023\u0005r\u0000\u0000"+
		"34\u0005r\u0000\u000045\u0005a\u0000\u000056\u0005y\u0000\u00006\u0002"+
		"\u0001\u0000\u0000\u00007;\u0007\u0000\u0000\u00008:\t\u0000\u0000\u0000"+
		"98\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000>?\u0007\u0000\u0000\u0000?\u0004\u0001\u0000\u0000\u0000"+
		"@B\u0007\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0007\u0002\u0000\u0000FH\u0007\u0001\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000J\u0006\u0001\u0000\u0000\u0000KM\u0007\u0001"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\b\u0001\u0000\u0000\u0000"+
		"PQ\u0007\u0003\u0000\u0000Q\n\u0001\u0000\u0000\u0000RS\u0007\u0004\u0000"+
		"\u0000S\f\u0001\u0000\u0000\u0000TU\u0005[\u0000\u0000U\u000e\u0001\u0000"+
		"\u0000\u0000VW\u0005]\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005"+
		"(\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000Z[\u0005)\u0000\u0000[\u0014"+
		"\u0001\u0000\u0000\u0000\\]\u0005=\u0000\u0000]\u0016\u0001\u0000\u0000"+
		"\u0000^_\u0005.\u0000\u0000_\u0018\u0001\u0000\u0000\u0000`a\u0005s\u0000"+
		"\u0000ab\u0005i\u0000\u0000bc\u0005z\u0000\u0000cd\u0005e\u0000\u0000"+
		"d\u001a\u0001\u0000\u0000\u0000ef\u0005P\u0000\u0000fg\u0005u\u0000\u0000"+
		"gh\u0005t\u0000\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0005t\u0000\u0000"+
		"jk\u0005o\u0000\u0000k\u001e\u0001\u0000\u0000\u0000lm\u0005o\u0000\u0000"+
		"mn\u0005u\u0000\u0000no\u0005t\u0000\u0000op\u0005p\u0000\u0000pq\u0005"+
		"u\u0000\u0000qr\u0005t\u0000\u0000r \u0001\u0000\u0000\u0000st\u0005G"+
		"\u0000\u0000tu\u0005e\u0000\u0000uv\u0005t\u0000\u0000v\"\u0001\u0000"+
		"\u0000\u0000wx\u0005n\u0000\u0000xy\u0005e\u0000\u0000yz\u0005x\u0000"+
		"\u0000z{\u0005t\u0000\u0000{$\u0001\u0000\u0000\u0000|}\u0005i\u0000\u0000"+
		"}~\u0005n\u0000\u0000~\u007f\u0005p\u0000\u0000\u007f\u0080\u0005u\u0000"+
		"\u0000\u0080\u0081\u0005t\u0000\u0000\u0081&\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005i\u0000\u0000\u0083\u0084\u0005n\u0000\u0000\u0084\u0085\u0005"+
		"t\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086\u0087\u0005g\u0000"+
		"\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u008f\u0005r\u0000\u0000\u0089"+
		"\u008a\u0005f\u0000\u0000\u008a\u008b\u0005l\u0000\u0000\u008b\u008c\u0005"+
		"o\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u008f\u0005t\u0000"+
		"\u0000\u008e\u0082\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000"+
		"\u0000\u008f(\u0001\u0000\u0000\u0000\u0090\u0094\u0007\u0005\u0000\u0000"+
		"\u0091\u0093\u0007\u0006\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095*\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005?\u0000\u0000\u0098,\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005/\u0000\u0000\u009a\u009b\u0005/\u0000"+
		"\u0000\u009b\u009f\u0001\u0000\u0000\u0000\u009c\u009e\t\u0000\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0007\u0007\u0000\u0000\u00a3.\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0007\b\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0006\u0017\u0000\u0000\u00aa0\u0001\u0000\u0000\u0000\t\u0000;CIN\u008e"+
		"\u0094\u009f\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}