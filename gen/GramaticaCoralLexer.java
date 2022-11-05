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
		PIZQ=9, PDER=10, ASSIGN=11, PUT=12, TO=13, OUTPUT=14, GET=15, NEXT=16, 
		INPUT=17, TYPE=18, IDENTIFIER=19, QUESTIONMARK=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARRAY", "STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", "CIZQ", "CDER", 
			"PIZQ", "PDER", "ASSIGN", "PUT", "TO", "OUTPUT", "GET", "NEXT", "INPUT", 
			"TYPE", "IDENTIFIER", "QUESTIONMARK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'array'", null, null, null, null, null, "'['", "']'", "'('", "')'", 
			"'='", "'Put'", "'to'", "'output'", "'Get'", "'next'", "'input'", null, 
			null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARRAY", "STRING", "FLOATNUM", "INTNUM", "SUMOP", "MULOP", "CIZQ", 
			"CDER", "PIZQ", "PDER", "ASSIGN", "PUT", "TO", "OUTPUT", "GET", "NEXT", 
			"INPUT", "TYPE", "IDENTIFIER", "QUESTIONMARK", "WS"
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
		"\u0004\u0000\u0015\u0093\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002<\b\u0002\u000b\u0002"+
		"\f\u0002=\u0001\u0002\u0001\u0002\u0004\u0002B\b\u0002\u000b\u0002\f\u0002"+
		"C\u0001\u0003\u0004\u0003G\b\u0003\u000b\u0003\f\u0003H\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0082\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0086"+
		"\b\u0012\n\u0012\f\u0012\u0089\t\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0004\u0014\u008e\b\u0014\u000b\u0014\f\u0014\u008f\u0001\u0014\u0001"+
		"\u0014\u00015\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015\u0001\u0000\b\u0001\u0000\"\"\u0001\u000009\u0001\u0000"+
		"..\u0002\u0000++--\u0003\u0000%%**//\u0002\u0000AZaz\u0004\u000009AZ_"+
		"_az\u0003\u0000\t\n\r\r  \u0099\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u00031"+
		"\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007F\u0001\u0000"+
		"\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000"+
		"\rN\u0001\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011R\u0001"+
		"\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000"+
		"\u0000\u0017X\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000"+
		"\u001b_\u0001\u0000\u0000\u0000\u001df\u0001\u0000\u0000\u0000\u001fj"+
		"\u0001\u0000\u0000\u0000!o\u0001\u0000\u0000\u0000#\u0081\u0001\u0000"+
		"\u0000\u0000%\u0083\u0001\u0000\u0000\u0000\'\u008a\u0001\u0000\u0000"+
		"\u0000)\u008d\u0001\u0000\u0000\u0000+,\u0005a\u0000\u0000,-\u0005r\u0000"+
		"\u0000-.\u0005r\u0000\u0000./\u0005a\u0000\u0000/0\u0005y\u0000\u0000"+
		"0\u0002\u0001\u0000\u0000\u000015\u0007\u0000\u0000\u000024\t\u0000\u0000"+
		"\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000089\u0007\u0000\u0000\u00009\u0004\u0001\u0000\u0000"+
		"\u0000:<\u0007\u0001\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?A\u0007\u0002\u0000\u0000@B\u0007\u0001\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000D\u0006\u0001\u0000\u0000\u0000EG\u0007"+
		"\u0001\u0000\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\b\u0001\u0000\u0000"+
		"\u0000JK\u0007\u0003\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0007\u0004"+
		"\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005[\u0000\u0000O\u000e\u0001"+
		"\u0000\u0000\u0000PQ\u0005]\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000"+
		"RS\u0005(\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0005)\u0000\u0000"+
		"U\u0014\u0001\u0000\u0000\u0000VW\u0005=\u0000\u0000W\u0016\u0001\u0000"+
		"\u0000\u0000XY\u0005P\u0000\u0000YZ\u0005u\u0000\u0000Z[\u0005t\u0000"+
		"\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005o\u0000"+
		"\u0000^\u001a\u0001\u0000\u0000\u0000_`\u0005o\u0000\u0000`a\u0005u\u0000"+
		"\u0000ab\u0005t\u0000\u0000bc\u0005p\u0000\u0000cd\u0005u\u0000\u0000"+
		"de\u0005t\u0000\u0000e\u001c\u0001\u0000\u0000\u0000fg\u0005G\u0000\u0000"+
		"gh\u0005e\u0000\u0000hi\u0005t\u0000\u0000i\u001e\u0001\u0000\u0000\u0000"+
		"jk\u0005n\u0000\u0000kl\u0005e\u0000\u0000lm\u0005x\u0000\u0000mn\u0005"+
		"t\u0000\u0000n \u0001\u0000\u0000\u0000op\u0005i\u0000\u0000pq\u0005n"+
		"\u0000\u0000qr\u0005p\u0000\u0000rs\u0005u\u0000\u0000st\u0005t\u0000"+
		"\u0000t\"\u0001\u0000\u0000\u0000uv\u0005i\u0000\u0000vw\u0005n\u0000"+
		"\u0000wx\u0005t\u0000\u0000xy\u0005e\u0000\u0000yz\u0005g\u0000\u0000"+
		"z{\u0005e\u0000\u0000{\u0082\u0005r\u0000\u0000|}\u0005f\u0000\u0000}"+
		"~\u0005l\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f\u0080\u0005a\u0000"+
		"\u0000\u0080\u0082\u0005t\u0000\u0000\u0081u\u0001\u0000\u0000\u0000\u0081"+
		"|\u0001\u0000\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083\u0087\u0007"+
		"\u0005\u0000\u0000\u0084\u0086\u0007\u0006\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088&\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005?\u0000"+
		"\u0000\u008b(\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0007\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0014\u0000\u0000"+
		"\u0092*\u0001\u0000\u0000\u0000\b\u00005=CH\u0081\u0087\u008f\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}