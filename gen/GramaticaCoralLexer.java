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
		ASSIGN=1, GET=2, NEXT=3, INPUT=4, TYPE=5, IDENTIFIER=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "GET", "NEXT", "INPUT", "TYPE", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'Get'", "'next'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "GET", "NEXT", "INPUT", "TYPE", "IDENTIFIER", "WS"
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
		"\u0004\u0000\u0007<\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004-\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u00051\b\u0005\n\u0005\f\u00054\t\u0005"+
		"\u0001\u0006\u0004\u00067\b\u0006\u000b\u0006\f\u00068\u0001\u0006\u0001"+
		"\u0006\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0003\u0002\u0000AZaz\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  >\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001"+
		"\u0000\u0000\u0000\u0003\u0011\u0001\u0000\u0000\u0000\u0005\u0015\u0001"+
		"\u0000\u0000\u0000\u0007\u001a\u0001\u0000\u0000\u0000\t,\u0001\u0000"+
		"\u0000\u0000\u000b.\u0001\u0000\u0000\u0000\r6\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005=\u0000\u0000\u0010\u0002\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005G\u0000\u0000\u0012\u0013\u0005e\u0000\u0000\u0013\u0014\u0005"+
		"t\u0000\u0000\u0014\u0004\u0001\u0000\u0000\u0000\u0015\u0016\u0005n\u0000"+
		"\u0000\u0016\u0017\u0005e\u0000\u0000\u0017\u0018\u0005x\u0000\u0000\u0018"+
		"\u0019\u0005t\u0000\u0000\u0019\u0006\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005i\u0000\u0000\u001b\u001c\u0005n\u0000\u0000\u001c\u001d\u0005p"+
		"\u0000\u0000\u001d\u001e\u0005u\u0000\u0000\u001e\u001f\u0005t\u0000\u0000"+
		"\u001f\b\u0001\u0000\u0000\u0000 !\u0005i\u0000\u0000!\"\u0005n\u0000"+
		"\u0000\"#\u0005t\u0000\u0000#$\u0005e\u0000\u0000$%\u0005g\u0000\u0000"+
		"%&\u0005e\u0000\u0000&-\u0005r\u0000\u0000\'(\u0005f\u0000\u0000()\u0005"+
		"l\u0000\u0000)*\u0005o\u0000\u0000*+\u0005a\u0000\u0000+-\u0005t\u0000"+
		"\u0000, \u0001\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000-\n\u0001\u0000"+
		"\u0000\u0000.2\u0007\u0000\u0000\u0000/1\u0007\u0001\u0000\u00000/\u0001"+
		"\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u00003\f\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000057\u0007\u0002\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:;\u0006\u0006\u0000\u0000;\u000e\u0001\u0000\u0000"+
		"\u0000\u0004\u0000,28\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}