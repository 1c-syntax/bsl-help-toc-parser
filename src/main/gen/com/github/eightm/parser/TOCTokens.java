// Generated from TOCTokens.g4 by ANTLR 4.9.3
package com.github.eightm.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TOCTokens extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, WHTITESPACE=2, QUOTE=3, COMMA=4, STRING=5, LBRACE=6, RBRACE=7, 
		NUMBER=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "WHTITESPACE", "QUOTE", "COMMA", "STRING", "LBRACE", "RBRACE", 
			"NUMBER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\"'", "','", null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "WHTITESPACE", "QUOTE", "COMMA", "STRING", "LBRACE", "RBRACE", 
			"NUMBER"
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


	public TOCTokens(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TOCTokens.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n>\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2"+
		"\27\n\2\3\2\3\2\3\2\3\2\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\6\t9\n\t\r\t\16\t:\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\2\3\2\5\4\2\13\13\"\"\5\2\f\f\17\17$$\3\2\62;\2A\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\3\26\3\2\2\2\5\35\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13"+
		"\'\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\218\3\2\2\2\23<\3\2\2\2\25\27\7"+
		"\17\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\f\2\2\31\32"+
		"\3\2\2\2\32\33\b\2\2\2\33\4\3\2\2\2\34\36\t\2\2\2\35\34\3\2\2\2\36\37"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b\3\3\2\"\6\3\2\2\2#$"+
		"\7$\2\2$\b\3\2\2\2%&\7.\2\2&\n\3\2\2\2\'.\5\7\4\2(-\n\3\2\2)*\5\7\4\2"+
		"*+\5\7\4\2+-\3\2\2\2,(\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/\61\3\2\2\2\60.\3\2\2\2\61\62\5\7\4\2\62\f\3\2\2\2\63\64\7}\2\2\64"+
		"\16\3\2\2\2\65\66\7\177\2\2\66\20\3\2\2\2\679\5\23\n\28\67\3\2\2\29:\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;\22\3\2\2\2<=\t\4\2\2=\24\3\2\2\2\b\2\26\37"+
		",.:\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}