// ============================================================================
// Generated from TOC.g4 by ANTLR 1c-syntax fork 4.x
// ============================================================================
package com.github.eightm.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class TOC extends Parser {
	public static final int
		EOL=1, WHTITESPACE=2, QUOTE=3, COMMA=4, STRING=5, LBRACE=6, RBRACE=7, 
		NUMBER=8;

	public static final int
		RULE_tableOfContent = 0, RULE_chunk = 1, RULE_propertiesContainer = 2, 
		RULE_nameContainer = 3, RULE_nameObject = 4, RULE_chunkCount = 5, RULE_chunkId = 6, 
		RULE_chunkParentId = 7, RULE_childCount = 8, RULE_childId = 9, RULE_htmlPath = 10, 
		RULE_languageCode = 11, RULE_name = 12;

	public static final String[] ruleNames = makeRuleNames();

	public static final Vocabulary VOCABULARY = new VocabularyImpl(makeLiteralNames(), makeSymbolicNames());

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\"'", "','", null, "'{'", "'}'"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "WHTITESPACE", "QUOTE", "COMMA", "STRING", "LBRACE", "RBRACE", 
			"NUMBER"
		};
	}

	@Override
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	private static String[] makeRuleNames() {
		return new String[] {
			"tableOfContent", "chunk", "propertiesContainer", "nameContainer", "nameObject", 
			"chunkCount", "chunkId", "chunkParentId", "childCount", "childId", "htmlPath", 
			"languageCode", "name"
		};
	}

	@Override
	public String getGrammarFileName() { return "TOC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return serializedATN; }

	private FailedPredicateException createFailedPredicateException() {
		return createFailedPredicateException(null);
	}

	@NotNull
	private FailedPredicateException createFailedPredicateException(@Nullable String predicate) {
		return createFailedPredicateException(predicate, null);
	}

	protected FailedPredicateException createFailedPredicateException(@Nullable String predicate, @Nullable String message) {
		return new FailedPredicateException(this, predicate, message);
	}

	public TOC(TokenStream input) {
		super(input);
		setInterpreter(new ParserATNSimulator(this, _ATN));
	}


	@NullMarked
	public static class TableOfContentContext extends ParserRuleContext {
		public @Nullable TerminalNode LBRACE() { return getToken(TOC.LBRACE, 0); }
		public @Nullable ChunkCountContext chunkCount() {
			return getRuleContext(ChunkCountContext.class,0);
		}
		public List<? extends TerminalNode> COMMA() { return getTokens(TOC.COMMA); }
		public @Nullable TerminalNode COMMA(int i) {
			return getToken(TOC.COMMA, i);
		}
		public List<? extends ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public @Nullable ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public @Nullable TerminalNode RBRACE() { return getToken(TOC.RBRACE, 0); }
		public @Nullable TerminalNode EOF() { return getToken(TOC.EOF, 0); }
		public TableOfContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_tableOfContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterTableOfContent(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitTableOfContent(this); }
		}
	}

	@RuleVersion(0)
	public final TableOfContentContext tableOfContent() throws RecognitionException {
		var _localctx = new TableOfContentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tableOfContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LBRACE);
			setState(27);
			chunkCount();
			setState(28);
			match(COMMA);
			setState(29);
			chunk();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(30);
				match(COMMA);
				setState(31);
				chunk();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(RBRACE);
			setState(38);
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

	@NullMarked
	public static class ChunkContext extends ParserRuleContext {
		public @Nullable TerminalNode LBRACE() { return getToken(TOC.LBRACE, 0); }
		public @Nullable ChunkIdContext chunkId() {
			return getRuleContext(ChunkIdContext.class,0);
		}
		public List<? extends TerminalNode> COMMA() { return getTokens(TOC.COMMA); }
		public @Nullable TerminalNode COMMA(int i) {
			return getToken(TOC.COMMA, i);
		}
		public @Nullable ChunkParentIdContext chunkParentId() {
			return getRuleContext(ChunkParentIdContext.class,0);
		}
		public @Nullable ChildCountContext childCount() {
			return getRuleContext(ChildCountContext.class,0);
		}
		public @Nullable PropertiesContainerContext propertiesContainer() {
			return getRuleContext(PropertiesContainerContext.class,0);
		}
		public @Nullable TerminalNode RBRACE() { return getToken(TOC.RBRACE, 0); }
		public List<? extends ChildIdContext> childId() {
			return getRuleContexts(ChildIdContext.class);
		}
		public @Nullable ChildIdContext childId(int i) {
			return getRuleContext(ChildIdContext.class,i);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterChunk(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitChunk(this); }
		}
	}

	@RuleVersion(0)
	public final ChunkContext chunk() throws RecognitionException {
		var _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_chunk);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LBRACE);
			setState(41);
			chunkId();
			setState(42);
			match(COMMA);
			setState(43);
			chunkParentId();
			setState(44);
			match(COMMA);
			setState(45);
			childCount();
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(COMMA);
					setState(47);
					childId();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(53);
			match(COMMA);
			setState(54);
			propertiesContainer();
			setState(55);
			match(RBRACE);
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

	@NullMarked
	public static class PropertiesContainerContext extends ParserRuleContext {
		public @Nullable TerminalNode LBRACE() { return getToken(TOC.LBRACE, 0); }
		public List<? extends TerminalNode> NUMBER() { return getTokens(TOC.NUMBER); }
		public @Nullable TerminalNode NUMBER(int i) {
			return getToken(TOC.NUMBER, i);
		}
		public List<? extends TerminalNode> COMMA() { return getTokens(TOC.COMMA); }
		public @Nullable TerminalNode COMMA(int i) {
			return getToken(TOC.COMMA, i);
		}
		public @Nullable NameContainerContext nameContainer() {
			return getRuleContext(NameContainerContext.class,0);
		}
		public @Nullable HtmlPathContext htmlPath() {
			return getRuleContext(HtmlPathContext.class,0);
		}
		public @Nullable TerminalNode RBRACE() { return getToken(TOC.RBRACE, 0); }
		public PropertiesContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_propertiesContainer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterPropertiesContainer(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitPropertiesContainer(this); }
		}
	}

	@RuleVersion(0)
	public final PropertiesContainerContext propertiesContainer() throws RecognitionException {
		var _localctx = new PropertiesContainerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_propertiesContainer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LBRACE);
			setState(58);
			match(NUMBER);
			setState(59);
			match(COMMA);
			setState(60);
			match(NUMBER);
			setState(61);
			match(COMMA);
			setState(62);
			nameContainer();
			setState(63);
			match(COMMA);
			setState(64);
			htmlPath();
			setState(65);
			match(RBRACE);
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

	@NullMarked
	public static class NameContainerContext extends ParserRuleContext {
		public @Nullable TerminalNode LBRACE() { return getToken(TOC.LBRACE, 0); }
		public List<? extends TerminalNode> NUMBER() { return getTokens(TOC.NUMBER); }
		public @Nullable TerminalNode NUMBER(int i) {
			return getToken(TOC.NUMBER, i);
		}
		public List<? extends TerminalNode> COMMA() { return getTokens(TOC.COMMA); }
		public @Nullable TerminalNode COMMA(int i) {
			return getToken(TOC.COMMA, i);
		}
		public @Nullable TerminalNode RBRACE() { return getToken(TOC.RBRACE, 0); }
		public List<? extends NameObjectContext> nameObject() {
			return getRuleContexts(NameObjectContext.class);
		}
		public @Nullable NameObjectContext nameObject(int i) {
			return getRuleContext(NameObjectContext.class,i);
		}
		public NameContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_nameContainer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterNameContainer(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitNameContainer(this); }
		}
	}

	@RuleVersion(0)
	public final NameContainerContext nameContainer() throws RecognitionException {
		var _localctx = new NameContainerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nameContainer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LBRACE);
			setState(68);
			match(NUMBER);
			setState(69);
			match(COMMA);
			setState(70);
			match(NUMBER);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(71);
				match(COMMA);
				setState(72);
				nameObject();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(73);
					match(COMMA);
					setState(74);
					nameObject();
					}
				}

				}
			}

			setState(79);
			match(RBRACE);
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

	@NullMarked
	public static class NameObjectContext extends ParserRuleContext {
		public @Nullable TerminalNode LBRACE() { return getToken(TOC.LBRACE, 0); }
		public @Nullable LanguageCodeContext languageCode() {
			return getRuleContext(LanguageCodeContext.class,0);
		}
		public @Nullable TerminalNode COMMA() { return getToken(TOC.COMMA, 0); }
		public @Nullable NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public @Nullable TerminalNode RBRACE() { return getToken(TOC.RBRACE, 0); }
		public NameObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_nameObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterNameObject(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitNameObject(this); }
		}
	}

	@RuleVersion(0)
	public final NameObjectContext nameObject() throws RecognitionException {
		var _localctx = new NameObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nameObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LBRACE);
			setState(82);
			languageCode();
			setState(83);
			match(COMMA);
			setState(84);
			name();
			setState(85);
			match(RBRACE);
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

	@NullMarked
	public static class ChunkCountContext extends ParserRuleContext {
		public @Nullable TerminalNode NUMBER() { return getToken(TOC.NUMBER, 0); }
		public ChunkCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_chunkCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterChunkCount(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitChunkCount(this); }
		}
	}

	@RuleVersion(0)
	public final ChunkCountContext chunkCount() throws RecognitionException {
		var _localctx = new ChunkCountContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chunkCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(NUMBER);
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

	@NullMarked
	public static class ChunkIdContext extends ParserRuleContext {
		public @Nullable TerminalNode NUMBER() { return getToken(TOC.NUMBER, 0); }
		public ChunkIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_chunkId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterChunkId(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitChunkId(this); }
		}
	}

	@RuleVersion(0)
	public final ChunkIdContext chunkId() throws RecognitionException {
		var _localctx = new ChunkIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chunkId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(NUMBER);
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

	@NullMarked
	public static class ChunkParentIdContext extends ParserRuleContext {
		public @Nullable TerminalNode NUMBER() { return getToken(TOC.NUMBER, 0); }
		public ChunkParentIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_chunkParentId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterChunkParentId(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitChunkParentId(this); }
		}
	}

	@RuleVersion(0)
	public final ChunkParentIdContext chunkParentId() throws RecognitionException {
		var _localctx = new ChunkParentIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chunkParentId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(NUMBER);
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

	@NullMarked
	public static class ChildCountContext extends ParserRuleContext {
		public @Nullable TerminalNode NUMBER() { return getToken(TOC.NUMBER, 0); }
		public ChildCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_childCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterChildCount(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitChildCount(this); }
		}
	}

	@RuleVersion(0)
	public final ChildCountContext childCount() throws RecognitionException {
		var _localctx = new ChildCountContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_childCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(NUMBER);
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

	@NullMarked
	public static class ChildIdContext extends ParserRuleContext {
		public @Nullable TerminalNode NUMBER() { return getToken(TOC.NUMBER, 0); }
		public ChildIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_childId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterChildId(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitChildId(this); }
		}
	}

	@RuleVersion(0)
	public final ChildIdContext childId() throws RecognitionException {
		var _localctx = new ChildIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_childId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(NUMBER);
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

	@NullMarked
	public static class HtmlPathContext extends ParserRuleContext {
		public @Nullable TerminalNode STRING() { return getToken(TOC.STRING, 0); }
		public HtmlPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_htmlPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterHtmlPath(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitHtmlPath(this); }
		}
	}

	@RuleVersion(0)
	public final HtmlPathContext htmlPath() throws RecognitionException {
		var _localctx = new HtmlPathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(STRING);
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

	@NullMarked
	public static class LanguageCodeContext extends ParserRuleContext {
		public @Nullable TerminalNode STRING() { return getToken(TOC.STRING, 0); }
		public LanguageCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_languageCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterLanguageCode(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitLanguageCode(this); }
		}
	}

	@RuleVersion(0)
	public final LanguageCodeContext languageCode() throws RecognitionException {
		var _localctx = new LanguageCodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_languageCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(STRING);
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

	@NullMarked
	public static class NameContext extends ParserRuleContext {
		public @Nullable TerminalNode STRING() { return getToken(TOC.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.enterName(this); }
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof TOCListener currentListener) { currentListener.exitName(this); }
		}
	}

	@RuleVersion(0)
	public final NameContext name() throws RecognitionException {
		var _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(STRING);
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

	private static final String serializedATN =
		"\3\uc91d\ucaba\u058d\uafba\u4f53\u0607\uea8b\uc241\3\nj\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16\2&\13"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n\3\f\3\16\3\66"+
		"\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\5\5P\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\2\2\2\17\2\2\4\2\6\2\b\2\n\2\f\2\16\2\20\2\22\2\24\2\26\2\30"+
		"\2\32\2\2\2\2`\2\34\3\2\2\2\4*\3\2\2\2\6;\3\2\2\2\bE\3\2\2\2\nS\3\2\2"+
		"\2\fY\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22_\3\2\2\2\24a\3\2\2\2\26c\3\2"+
		"\2\2\30e\3\2\2\2\32g\3\2\2\2\34\35\7\b\2\2\35\36\5\f\7\2\36\37\7\6\2\2"+
		"\37$\5\4\3\2 !\7\6\2\2!#\5\4\3\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2"+
		"\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\t\2\2()\7\2\2\3)\3\3\2\2\2*+\7\b\2\2+,"+
		"\5\16\b\2,-\7\6\2\2-.\5\20\t\2./\7\6\2\2/\64\5\22\n\2\60\61\7\6\2\2\61"+
		"\63\5\24\13\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\67\3\2\2\2\66\64\3\2\2\2\678\7\6\2\289\5\6\4\29:\7\t\2\2:\5\3\2\2"+
		"\2;<\7\b\2\2<=\7\n\2\2=>\7\6\2\2>?\7\n\2\2?@\7\6\2\2@A\5\b\5\2AB\7\6\2"+
		"\2BC\5\26\f\2CD\7\t\2\2D\7\3\2\2\2EF\7\b\2\2FG\7\n\2\2GH\7\6\2\2HO\7\n"+
		"\2\2IJ\7\6\2\2JM\5\n\6\2KL\7\6\2\2LN\5\n\6\2MK\3\2\2\2MN\3\2\2\2NP\3\2"+
		"\2\2OI\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\t\2\2R\t\3\2\2\2ST\7\b\2\2TU\5"+
		"\30\r\2UV\7\6\2\2VW\5\32\16\2WX\7\t\2\2X\13\3\2\2\2YZ\7\n\2\2Z\r\3\2\2"+
		"\2[\\\7\n\2\2\\\17\3\2\2\2]^\7\n\2\2^\21\3\2\2\2_`\7\n\2\2`\23\3\2\2\2"+
		"ab\7\n\2\2b\25\3\2\2\2cd\7\7\2\2d\27\3\2\2\2ef\7\7\2\2f\31\3\2\2\2gh\7"+
		"\7\2\2h\33\3\2\2\2\6$\64MO";

	private static final ATN _ATN = new ATNDeserializer().deserialize(serializedATN.toCharArray());
}