// Generated from UserAgent.g4 by ANTLR 4.5

	package com.drogon.core;
	import java.util.List;
	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserAgentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, SP=3, WS=4, COMMENT=5;
	public static final int
		RULE_useragent = 0, RULE_body = 1, RULE_bunit = 2, RULE_product = 3, RULE_version = 4;
	public static final String[] ruleNames = {
		"useragent", "body", "bunit", "product", "version"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "SP", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "UserAgent.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		List<String>list;
		/**
		* Custom constructor to pass reference to a list to 
		* which product names are to be added
		*/
		public UserAgentParser(TokenStream input, List list){
			this(input);
			this.list = list;
		}

	public UserAgentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UseragentContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public UseragentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useragent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).enterUseragent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).exitUseragent(this);
		}
	}

	public final UseragentContext useragent() throws RecognitionException {
		UseragentContext _localctx = new UseragentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_useragent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			body(0);
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

	public static class BodyContext extends ParserRuleContext {
		public BunitContext bunit() {
			return getRuleContext(BunitContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SP() { return getToken(UserAgentParser.SP, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		return body(0);
	}

	private BodyContext body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BodyContext _localctx = new BodyContext(_ctx, _parentState);
		BodyContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13);
			bunit();
			}
			_ctx.stop = _input.LT(-1);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(20);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new BodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_body);
						setState(15);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(16);
						match(SP);
						setState(17);
						bunit();
						}
						break;
					case 2:
						{
						_localctx = new BodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_body);
						setState(18);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(19);
						bunit();
						}
						break;
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class BunitContext extends ParserRuleContext {
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(UserAgentParser.COMMENT, 0); }
		public BunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).enterBunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).exitBunit(this);
		}
	}

	public final BunitContext bunit() throws RecognitionException {
		BunitContext _localctx = new BunitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bunit);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				product();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(COMMENT);
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

	public static class ProductContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(UserAgentParser.ID, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_product);
		try {
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((ProductContext)_localctx).ID = match(ID);
				setState(30);
				match(T__0);
				setState(31);
				version();

													list.add((((ProductContext)_localctx).ID!=null?((ProductContext)_localctx).ID.getText():null));
												
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((ProductContext)_localctx).ID = match(ID);

					   								list.add((((ProductContext)_localctx).ID!=null?((ProductContext)_localctx).ID.getText():null));
					   							
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UserAgentParser.ID, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserAgentListener ) ((UserAgentListener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ID);
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
		case 1:
			return body_sempred((BodyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean body_sempred(BodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\27\n\3\f\3\16\3\32\13\3\3\4\3\4\5\4\36\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\'\n\5\3\6\3\6\3\6\2\3\4\7\2\4\6\b\n\2\2)\2\f\3\2\2\2\4\16\3\2\2"+
		"\2\6\35\3\2\2\2\b&\3\2\2\2\n(\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\b"+
		"\3\1\2\17\20\5\6\4\2\20\30\3\2\2\2\21\22\f\4\2\2\22\23\7\5\2\2\23\27\5"+
		"\6\4\2\24\25\f\3\2\2\25\27\5\6\4\2\26\21\3\2\2\2\26\24\3\2\2\2\27\32\3"+
		"\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\30\3\2\2\2\33\36\5"+
		"\b\5\2\34\36\7\7\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\7\3\2\2\2\37 \7\4"+
		"\2\2 !\7\3\2\2!\"\5\n\6\2\"#\b\5\1\2#\'\3\2\2\2$%\7\4\2\2%\'\b\5\1\2&"+
		"\37\3\2\2\2&$\3\2\2\2\'\t\3\2\2\2()\7\4\2\2)\13\3\2\2\2\6\26\30\35&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}