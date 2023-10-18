// Generated from FLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Identifier=2, Integer=3, Real=4, Boolean=5, LPAREN=6, RPAREN=7, 
		QUOTE=8, SETQ=9, FUNC=10, LAMBDA=11, PROG=12, COND=13, WHILE=14, RETURN=15, 
		BREAK=16, HEAD=17, TAIL=18, CONS=19, EQUAL=20, NONEQUAL=21, LESS=22, LESSEQ=23, 
		GREATER=24, GREATEREQ=25, ISINT=26, ISREAL=27, ISBOOL=28, ISNULL=29, ISATOM=30, 
		ISLIST=31, AND=32, OR=33, XOR=34, NOT=35, EVAL=36, COMMA=37, PLUS=38, 
		MINUS=39, MULT=40, DIV=41, MOD=42, NULL=43;
	public static final int
		RULE_program = 0, RULE_element = 1, RULE_atom = 2, RULE_literal = 3, RULE_list = 4, 
		RULE_specialForm = 5, RULE_quote = 6, RULE_setq = 7, RULE_func = 8, RULE_lambda = 9, 
		RULE_prog = 10, RULE_cond = 11, RULE_whileForm = 12, RULE_returnForm = 13, 
		RULE_breakForm = 14, RULE_funcCall = 15, RULE_identifierList = 16, RULE_identifier = 17, 
		RULE_expression = 18, RULE_logicalExpression = 19, RULE_relationalExpression = 20, 
		RULE_additiveExpression = 21, RULE_multiplicativeExpression = 22, RULE_primary = 23, 
		RULE_evalCall = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "element", "atom", "literal", "list", "specialForm", "quote", 
			"setq", "func", "lambda", "prog", "cond", "whileForm", "returnForm", 
			"breakForm", "funcCall", "identifierList", "identifier", "expression", 
			"logicalExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"primary", "evalCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", "'''", "'setq'", "'func'", 
			"'lambda'", "'prog'", "'cond'", "'while'", "'return'", "'break'", "'head'", 
			"'tail'", "'cons'", "'equal'", "'nonequal'", "'less'", "'lesseq'", "'greater'", 
			"'greatereq'", "'isint'", "'isreal'", "'isbool'", "'isnull'", "'isatom'", 
			"'islist'", "'and'", "'or'", "'xor'", "'not'", "'eval'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "Identifier", "Integer", "Real", "Boolean", "LPAREN", "RPAREN", 
			"QUOTE", "SETQ", "FUNC", "LAMBDA", "PROG", "COND", "WHILE", "RETURN", 
			"BREAK", "HEAD", "TAIL", "CONS", "EQUAL", "NONEQUAL", "LESS", "LESSEQ", 
			"GREATER", "GREATEREQ", "ISINT", "ISREAL", "ISBOOL", "ISNULL", "ISATOM", 
			"ISLIST", "AND", "OR", "XOR", "NOT", "EVAL", "COMMA", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "NULL"
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
	public String getGrammarFileName() { return "FLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FLanguageParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				element();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8864812629884L) != 0) );
			setState(55);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SpecialFormContext specialForm() {
			return getRuleContext(SpecialFormContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				specialForm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				funcCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FLanguageParser.Identifier, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(FLanguageParser.Integer, 0); }
		public TerminalNode Real() { return getToken(FLanguageParser.Real, 0); }
		public TerminalNode Boolean() { return getToken(FLanguageParser.Boolean, 0); }
		public TerminalNode NULL() { return getToken(FLanguageParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093022264L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FLanguageParser.RPAREN, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LPAREN);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				element();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8864812629884L) != 0) );
			setState(75);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialFormContext extends ParserRuleContext {
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public SetqContext setq() {
			return getRuleContext(SetqContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhileFormContext whileForm() {
			return getRuleContext(WhileFormContext.class,0);
		}
		public ReturnFormContext returnForm() {
			return getRuleContext(ReturnFormContext.class,0);
		}
		public BreakFormContext breakForm() {
			return getRuleContext(BreakFormContext.class,0);
		}
		public SpecialFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterSpecialForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitSpecialForm(this);
		}
	}

	public final SpecialFormContext specialForm() throws RecognitionException {
		SpecialFormContext _localctx = new SpecialFormContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specialForm);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				quote();
				}
				break;
			case SETQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				setq();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				func();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				lambda();
				}
				break;
			case PROG:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				prog();
				}
				break;
			case COND:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				cond();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				whileForm();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				returnForm();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				breakForm();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(FLanguageParser.QUOTE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(QUOTE);
			setState(89);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetqContext extends ParserRuleContext {
		public TerminalNode SETQ() { return getToken(FLanguageParser.SETQ, 0); }
		public TerminalNode Identifier() { return getToken(FLanguageParser.Identifier, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SetqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterSetq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitSetq(this);
		}
	}

	public final SetqContext setq() throws RecognitionException {
		SetqContext _localctx = new SetqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SETQ);
			setState(92);
			match(Identifier);
			setState(93);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(FLanguageParser.FUNC, 0); }
		public TerminalNode Identifier() { return getToken(FLanguageParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(FLanguageParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FLanguageParser.RPAREN, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(FUNC);
			setState(96);
			match(Identifier);
			setState(97);
			match(LPAREN);
			setState(98);
			identifierList();
			setState(99);
			match(RPAREN);
			setState(100);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(FLanguageParser.LAMBDA, 0); }
		public TerminalNode LPAREN() { return getToken(FLanguageParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FLanguageParser.RPAREN, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitLambda(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LAMBDA);
			setState(103);
			match(LPAREN);
			setState(104);
			identifierList();
			setState(105);
			match(RPAREN);
			setState(106);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROG() { return getToken(FLanguageParser.PROG, 0); }
		public TerminalNode LPAREN() { return getToken(FLanguageParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(FLanguageParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(FLanguageParser.RPAREN, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PROG);
			setState(109);
			match(LPAREN);
			setState(110);
			identifierList();
			setState(111);
			match(RPAREN);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				element();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8864812629884L) != 0) );
			setState(117);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(FLanguageParser.COND, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(COND);
			setState(120);
			element();
			setState(121);
			element();
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(122);
				element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileFormContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FLanguageParser.WHILE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public WhileFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterWhileForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitWhileForm(this);
		}
	}

	public final WhileFormContext whileForm() throws RecognitionException {
		WhileFormContext _localctx = new WhileFormContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileForm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WHILE);
			setState(126);
			element();
			setState(127);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnFormContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FLanguageParser.RETURN, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ReturnFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterReturnForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitReturnForm(this);
		}
	}

	public final ReturnFormContext returnForm() throws RecognitionException {
		ReturnFormContext _localctx = new ReturnFormContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnForm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(RETURN);
			setState(130);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakFormContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FLanguageParser.BREAK, 0); }
		public BreakFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterBreakForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitBreakForm(this);
		}
	}

	public final BreakFormContext breakForm() throws RecognitionException {
		BreakFormContext _localctx = new BreakFormContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakForm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(BREAK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FLanguageParser.LPAREN, 0); }
		public TerminalNode Identifier() { return getToken(FLanguageParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(FLanguageParser.RPAREN, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LPAREN);
			setState(135);
			match(Identifier);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8864812629884L) != 0)) {
				{
				{
				setState(136);
				element();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(FLanguageParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FLanguageParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FLanguageParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Identifier);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				match(Identifier);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FLanguageParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			logicalExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FLanguageParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(FLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FLanguageParser.OR, i);
		}
		public List<TerminalNode> XOR() { return getTokens(FLanguageParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(FLanguageParser.XOR, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			relationalExpression();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(158);
					relationalExpression();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(FLanguageParser.EQUAL, 0); }
		public TerminalNode NONEQUAL() { return getToken(FLanguageParser.NONEQUAL, 0); }
		public TerminalNode LESS() { return getToken(FLanguageParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(FLanguageParser.LESSEQ, 0); }
		public TerminalNode GREATER() { return getToken(FLanguageParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(FLanguageParser.GREATEREQ, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			additiveExpression();
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(165);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				additiveExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(FLanguageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FLanguageParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(FLanguageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(FLanguageParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			multiplicativeExpression();
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(171);
					multiplicativeExpression();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(FLanguageParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(FLanguageParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(FLanguageParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(FLanguageParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(FLanguageParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(FLanguageParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			primary();
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(179);
					primary();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(FLanguageParser.QUOTE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public EvalCallContext evalCall() {
			return getRuleContext(EvalCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FLanguageParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FLanguageParser.RPAREN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(QUOTE);
				setState(186);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				evalCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(LPAREN);
				setState(191);
				expression();
				setState(192);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EvalCallContext extends ParserRuleContext {
		public TerminalNode EVAL() { return getToken(FLanguageParser.EVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterEvalCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitEvalCall(this);
		}
	}

	public final EvalCallContext evalCall() throws RecognitionException {
		EvalCallContext _localctx = new EvalCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_evalCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(EVAL);
			setState(197);
			expression();
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

	public static final String _serializedATN =
		"\u0004\u0001+\u00c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004\f\u0004"+
		"I\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"W\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0004\nr\b\n\u000b\n\f\ns\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b|\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u008a\b\u000f\n\u000f"+
		"\f\u000f\u008d\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0094\b\u0010\n\u0010\f\u0010\u0097\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00a0\b\u0013\n\u0013\f\u0013\u00a3\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00a8\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00ad\b\u0015\n\u0015\f\u0015\u00b0\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00b5\b\u0016\n\u0016\f\u0016"+
		"\u00b8\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00c3\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.0\u0000\u0005\u0002\u0000\u0003\u0005++\u0001\u0000 \""+
		"\u0001\u0000\u0014\u0019\u0001\u0000&\'\u0001\u0000(*\u00c9\u00003\u0001"+
		"\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000"+
		"\u0000\u0006C\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nV\u0001"+
		"\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000"+
		"\u0000\u0010_\u0001\u0000\u0000\u0000\u0012f\u0001\u0000\u0000\u0000\u0014"+
		"l\u0001\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018}\u0001"+
		"\u0000\u0000\u0000\u001a\u0081\u0001\u0000\u0000\u0000\u001c\u0084\u0001"+
		"\u0000\u0000\u0000\u001e\u0086\u0001\u0000\u0000\u0000 \u0090\u0001\u0000"+
		"\u0000\u0000\"\u0098\u0001\u0000\u0000\u0000$\u009a\u0001\u0000\u0000"+
		"\u0000&\u009c\u0001\u0000\u0000\u0000(\u00a4\u0001\u0000\u0000\u0000*"+
		"\u00a9\u0001\u0000\u0000\u0000,\u00b1\u0001\u0000\u0000\u0000.\u00c2\u0001"+
		"\u0000\u0000\u00000\u00c4\u0001\u0000\u0000\u000024\u0003\u0002\u0001"+
		"\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005"+
		"\u0000\u0000\u00018\u0001\u0001\u0000\u0000\u00009@\u0003\u0004\u0002"+
		"\u0000:@\u0003\u0006\u0003\u0000;@\u0003\b\u0004\u0000<@\u0003\n\u0005"+
		"\u0000=@\u0003\u001e\u000f\u0000>@\u0003$\u0012\u0000?9\u0001\u0000\u0000"+
		"\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0003"+
		"\u0001\u0000\u0000\u0000AB\u0005\u0002\u0000\u0000B\u0005\u0001\u0000"+
		"\u0000\u0000CD\u0007\u0000\u0000\u0000D\u0007\u0001\u0000\u0000\u0000"+
		"EG\u0005\u0006\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0007\u0000\u0000L\t\u0001"+
		"\u0000\u0000\u0000MW\u0003\f\u0006\u0000NW\u0003\u000e\u0007\u0000OW\u0003"+
		"\u0010\b\u0000PW\u0003\u0012\t\u0000QW\u0003\u0014\n\u0000RW\u0003\u0016"+
		"\u000b\u0000SW\u0003\u0018\f\u0000TW\u0003\u001a\r\u0000UW\u0003\u001c"+
		"\u000e\u0000VM\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VO\u0001"+
		"\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000"+
		"VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005"+
		"\b\u0000\u0000YZ\u0003\u0002\u0001\u0000Z\r\u0001\u0000\u0000\u0000[\\"+
		"\u0005\t\u0000\u0000\\]\u0005\u0002\u0000\u0000]^\u0003\u0002\u0001\u0000"+
		"^\u000f\u0001\u0000\u0000\u0000_`\u0005\n\u0000\u0000`a\u0005\u0002\u0000"+
		"\u0000ab\u0005\u0006\u0000\u0000bc\u0003 \u0010\u0000cd\u0005\u0007\u0000"+
		"\u0000de\u0003\u0002\u0001\u0000e\u0011\u0001\u0000\u0000\u0000fg\u0005"+
		"\u000b\u0000\u0000gh\u0005\u0006\u0000\u0000hi\u0003 \u0010\u0000ij\u0005"+
		"\u0007\u0000\u0000jk\u0003\u0002\u0001\u0000k\u0013\u0001\u0000\u0000"+
		"\u0000lm\u0005\f\u0000\u0000mn\u0005\u0006\u0000\u0000no\u0003 \u0010"+
		"\u0000oq\u0005\u0007\u0000\u0000pr\u0003\u0002\u0001\u0000qp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0007\u0000\u0000"+
		"v\u0015\u0001\u0000\u0000\u0000wx\u0005\r\u0000\u0000xy\u0003\u0002\u0001"+
		"\u0000y{\u0003\u0002\u0001\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0017\u0001\u0000\u0000\u0000"+
		"}~\u0005\u000e\u0000\u0000~\u007f\u0003\u0002\u0001\u0000\u007f\u0080"+
		"\u0003\u0002\u0001\u0000\u0080\u0019\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u000f\u0000\u0000\u0082\u0083\u0003\u0002\u0001\u0000\u0083\u001b"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0010\u0000\u0000\u0085\u001d"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u008b"+
		"\u0005\u0002\u0000\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\u0007\u0000\u0000\u008f\u001f\u0001\u0000\u0000\u0000\u0090\u0095"+
		"\u0005\u0002\u0000\u0000\u0091\u0092\u0005%\u0000\u0000\u0092\u0094\u0005"+
		"\u0002\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096!\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099#\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003&\u0013\u0000\u009b%\u0001\u0000\u0000\u0000\u009c"+
		"\u00a1\u0003(\u0014\u0000\u009d\u009e\u0007\u0001\u0000\u0000\u009e\u00a0"+
		"\u0003(\u0014\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\'\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0003*\u0015\u0000\u00a5\u00a6\u0007\u0002\u0000"+
		"\u0000\u00a6\u00a8\u0003*\u0015\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8)\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ae\u0003,\u0016\u0000\u00aa\u00ab\u0007\u0003\u0000\u0000\u00ab\u00ad"+
		"\u0003,\u0016\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af+\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b6\u0003.\u0017\u0000\u00b2\u00b3\u0007\u0004\u0000"+
		"\u0000\u00b3\u00b5\u0003.\u0017\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7-\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\b\u0000\u0000\u00ba\u00c3"+
		"\u0003\u0002\u0001\u0000\u00bb\u00c3\u0003\u0004\u0002\u0000\u00bc\u00c3"+
		"\u0003\u001e\u000f\u0000\u00bd\u00c3\u00030\u0018\u0000\u00be\u00bf\u0005"+
		"\u0006\u0000\u0000\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00c1\u0005\u0007"+
		"\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000"+
		"\u0000\u0000\u00c3/\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005$\u0000\u0000"+
		"\u00c5\u00c6\u0003$\u0012\u0000\u00c61\u0001\u0000\u0000\u0000\r5?IVs"+
		"{\u008b\u0095\u00a1\u00a7\u00ae\u00b6\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}