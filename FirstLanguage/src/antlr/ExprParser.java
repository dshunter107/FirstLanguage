// Generated from Expr.g4 by ANTLR 4.13.1

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TYPE=17, 
		NAME=18, ID=19, VALUE=20, COMENT=21, WS=22;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_list = 2, RULE_grp = 3, RULE_obj = 4, 
		RULE_assn = 5, RULE_programaction = 6, RULE_useraction = 7, RULE_rel = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "list", "grp", "obj", "assn", "programaction", "useraction", 
			"rel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "','", "'ASSIGN'", "'('", "'AS'", "')'", "'EXPONENT'", 
			"'MULTIPLY'", "'DIVIDE'", "'ADD'", "'SUBTRACT'", "'AND'", "'OR'", "':'", 
			null, null, null, null, "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TYPE", "NAME", "ID", "VALUE", "COMENT", 
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<GrpContext> grp() {
			return getRuleContexts(GrpContext.class);
		}
		public GrpContext grp(int i) {
			return getRuleContext(GrpContext.class,i);
		}
		public List<AssnContext> assn() {
			return getRuleContexts(AssnContext.class);
		}
		public AssnContext assn(int i) {
			return getRuleContext(AssnContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public List<UseractionContext> useraction() {
			return getRuleContexts(UseractionContext.class);
		}
		public UseractionContext useraction(int i) {
			return getRuleContext(UseractionContext.class,i);
		}
		public List<RelContext> rel() {
			return getRuleContexts(RelContext.class);
		}
		public RelContext rel(int i) {
			return getRuleContext(RelContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(18);
					decl();
					}
					break;
				case 2:
					{
					setState(19);
					grp(0);
					}
					break;
				case 3:
					{
					setState(20);
					assn();
					}
					break;
				case 4:
					{
					setState(21);
					list();
					}
					break;
				case 5:
					{
					setState(22);
					obj();
					}
					break;
				case 6:
					{
					setState(23);
					programaction();
					}
					break;
				case 7:
					{
					setState(24);
					useraction();
					}
					break;
				case 8:
					{
					setState(25);
					rel(0);
					}
					break;
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2031140L) != 0) );
			setState(30);
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
	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends DeclContext {
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public GrpContext grp() {
			return getRuleContext(GrpContext.class,0);
		}
		public DeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			_localctx = new DeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(TYPE);
			setState(33);
			grp(0);
			setState(34);
			match(T__0);
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
		public GrpContext grp() {
			return getRuleContext(GrpContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__1);
			setState(37);
			grp(0);
			setState(38);
			match(T__2);
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
	public static class GrpContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public List<GrpContext> grp() {
			return getRuleContexts(GrpContext.class);
		}
		public GrpContext grp(int i) {
			return getRuleContext(GrpContext.class,i);
		}
		public GrpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGrp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGrp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrpContext grp() throws RecognitionException {
		return grp(0);
	}

	private GrpContext grp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GrpContext _localctx = new GrpContext(_ctx, _parentState);
		GrpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_grp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41);
			obj();
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_grp);
					setState(43);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(44);
					match(T__3);
					setState(45);
					grp(3);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode VALUE() { return getToken(ExprParser.VALUE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_obj);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(ID);
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(VALUE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				list();
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
	public static class AssnContext extends ParserRuleContext {
		public AssnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assn; }
	 
		public AssnContext() { }
		public void copyFrom(AssnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends AssnContext {
		public GrpContext grp() {
			return getRuleContext(GrpContext.class,0);
		}
		public ProgramactionContext programaction() {
			return getRuleContext(ProgramactionContext.class,0);
		}
		public AssignContext(AssnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssnContext assn() throws RecognitionException {
		AssnContext _localctx = new AssnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assn);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__4);
			setState(57);
			match(T__5);
			setState(58);
			grp(0);
			setState(59);
			match(T__6);
			setState(60);
			programaction();
			setState(61);
			match(T__7);
			setState(62);
			match(T__0);
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
	public static class ProgramactionContext extends ParserRuleContext {
		public ProgramactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programaction; }
	 
		public ProgramactionContext() { }
		public void copyFrom(ProgramactionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ProgramactionContext {
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public AddContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideContext extends ProgramactionContext {
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public DivideContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ProgramactionContext {
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public OrContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentContext extends ProgramactionContext {
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public ExponentContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ProgramactionContext {
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public AndContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyContext extends ProgramactionContext {
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public MultiplyContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractContext extends ProgramactionContext {
		public List<ProgramactionContext> programaction() {
			return getRuleContexts(ProgramactionContext.class);
		}
		public ProgramactionContext programaction(int i) {
			return getRuleContext(ProgramactionContext.class,i);
		}
		public SubtractContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ProgramactionContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ObjectContext(ProgramactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramactionContext programaction() throws RecognitionException {
		ProgramactionContext _localctx = new ProgramactionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_programaction);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ExponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__8);
				setState(65);
				match(T__5);
				setState(66);
				programaction();
				setState(67);
				match(T__3);
				setState(68);
				programaction();
				setState(69);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new MultiplyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__9);
				setState(72);
				match(T__5);
				setState(73);
				programaction();
				setState(74);
				match(T__3);
				setState(75);
				programaction();
				setState(76);
				match(T__7);
				}
				break;
			case T__10:
				_localctx = new DivideContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(T__10);
				setState(79);
				match(T__5);
				setState(80);
				programaction();
				setState(81);
				match(T__3);
				setState(82);
				programaction();
				setState(83);
				match(T__7);
				}
				break;
			case T__11:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__11);
				setState(86);
				match(T__5);
				setState(87);
				programaction();
				setState(88);
				match(T__3);
				setState(89);
				programaction();
				setState(90);
				match(T__7);
				}
				break;
			case T__12:
				_localctx = new SubtractContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(T__12);
				setState(93);
				match(T__5);
				setState(94);
				programaction();
				setState(95);
				match(T__3);
				setState(96);
				programaction();
				setState(97);
				match(T__7);
				}
				break;
			case T__13:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(T__13);
				setState(100);
				match(T__5);
				setState(101);
				programaction();
				setState(102);
				match(T__3);
				setState(103);
				programaction();
				setState(104);
				match(T__7);
				}
				break;
			case T__14:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(T__14);
				setState(107);
				match(T__5);
				setState(108);
				programaction();
				setState(109);
				match(T__3);
				setState(110);
				programaction();
				setState(111);
				match(T__7);
				}
				break;
			case T__1:
			case ID:
			case VALUE:
				_localctx = new ObjectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				obj();
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
	public static class UseractionContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public UseractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUseraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUseraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitUseraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseractionContext useraction() throws RecognitionException {
		UseractionContext _localctx = new UseractionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_useraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			rel(0);
			setState(117);
			match(T__5);
			setState(118);
			obj();
			setState(119);
			match(T__3);
			setState(120);
			obj();
			setState(121);
			match(T__7);
			setState(122);
			match(T__0);
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
	public static class RelContext extends ParserRuleContext {
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
	 
		public RelContext() { }
		public void copyFrom(RelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionNameContext extends RelContext {
		public TerminalNode NAME() { return getToken(ExprParser.NAME, 0); }
		public ActionNameContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterActionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitActionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitActionName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionPathContext extends RelContext {
		public List<RelContext> rel() {
			return getRuleContexts(RelContext.class);
		}
		public RelContext rel(int i) {
			return getRuleContext(RelContext.class,i);
		}
		public ActionPathContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterActionPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitActionPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitActionPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		return rel(0);
	}

	private RelContext rel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelContext _localctx = new RelContext(_ctx, _parentState);
		RelContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_rel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ActionNameContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(125);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionPathContext(new RelContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_rel);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(T__15);
					setState(129);
					rel(3);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return grp_sempred((GrpContext)_localctx, predIndex);
		case 8:
			return rel_sempred((RelContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean grp_sempred(GrpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rel_sempred(RelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b"+
		"\u0000\f\u0000\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u00047\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006s\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0083\b\b\n\b\f\b\u0086\t\b\u0001"+
		"\b\u0000\u0002\u0006\u0010\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0000\u0091\u0000\u001a\u0001\u0000\u0000\u0000\u0002 \u0001\u0000"+
		"\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000"+
		"\b6\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\fr\u0001\u0000"+
		"\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000"+
		"\u0012\u001b\u0003\u0002\u0001\u0000\u0013\u001b\u0003\u0006\u0003\u0000"+
		"\u0014\u001b\u0003\n\u0005\u0000\u0015\u001b\u0003\u0004\u0002\u0000\u0016"+
		"\u001b\u0003\b\u0004\u0000\u0017\u001b\u0003\f\u0006\u0000\u0018\u001b"+
		"\u0003\u000e\u0007\u0000\u0019\u001b\u0003\u0010\b\u0000\u001a\u0012\u0001"+
		"\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0014\u0001"+
		"\u0000\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001"+
		"\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\u0011\u0000"+
		"\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005\u0001\u0000\u0000#\u0003\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0002\u0000\u0000%&\u0003\u0006\u0003\u0000"+
		"&\'\u0005\u0003\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000()\u0006\u0003"+
		"\uffff\uffff\u0000)*\u0003\b\u0004\u0000*0\u0001\u0000\u0000\u0000+,\n"+
		"\u0002\u0000\u0000,-\u0005\u0004\u0000\u0000-/\u0003\u0006\u0003\u0003"+
		".+\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0007\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000037\u0005\u0013\u0000\u000047\u0005\u0014\u0000\u0000"+
		"57\u0003\u0004\u0002\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000065\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u000089\u0005\u0005"+
		"\u0000\u00009:\u0005\u0006\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0005"+
		"\u0007\u0000\u0000<=\u0003\f\u0006\u0000=>\u0005\b\u0000\u0000>?\u0005"+
		"\u0001\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\t\u0000\u0000"+
		"AB\u0005\u0006\u0000\u0000BC\u0003\f\u0006\u0000CD\u0005\u0004\u0000\u0000"+
		"DE\u0003\f\u0006\u0000EF\u0005\b\u0000\u0000Fs\u0001\u0000\u0000\u0000"+
		"GH\u0005\n\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0003\f\u0006\u0000"+
		"JK\u0005\u0004\u0000\u0000KL\u0003\f\u0006\u0000LM\u0005\b\u0000\u0000"+
		"Ms\u0001\u0000\u0000\u0000NO\u0005\u000b\u0000\u0000OP\u0005\u0006\u0000"+
		"\u0000PQ\u0003\f\u0006\u0000QR\u0005\u0004\u0000\u0000RS\u0003\f\u0006"+
		"\u0000ST\u0005\b\u0000\u0000Ts\u0001\u0000\u0000\u0000UV\u0005\f\u0000"+
		"\u0000VW\u0005\u0006\u0000\u0000WX\u0003\f\u0006\u0000XY\u0005\u0004\u0000"+
		"\u0000YZ\u0003\f\u0006\u0000Z[\u0005\b\u0000\u0000[s\u0001\u0000\u0000"+
		"\u0000\\]\u0005\r\u0000\u0000]^\u0005\u0006\u0000\u0000^_\u0003\f\u0006"+
		"\u0000_`\u0005\u0004\u0000\u0000`a\u0003\f\u0006\u0000ab\u0005\b\u0000"+
		"\u0000bs\u0001\u0000\u0000\u0000cd\u0005\u000e\u0000\u0000de\u0005\u0006"+
		"\u0000\u0000ef\u0003\f\u0006\u0000fg\u0005\u0004\u0000\u0000gh\u0003\f"+
		"\u0006\u0000hi\u0005\b\u0000\u0000is\u0001\u0000\u0000\u0000jk\u0005\u000f"+
		"\u0000\u0000kl\u0005\u0006\u0000\u0000lm\u0003\f\u0006\u0000mn\u0005\u0004"+
		"\u0000\u0000no\u0003\f\u0006\u0000op\u0005\b\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qs\u0003\b\u0004\u0000r@\u0001\u0000\u0000\u0000rG\u0001\u0000"+
		"\u0000\u0000rN\u0001\u0000\u0000\u0000rU\u0001\u0000\u0000\u0000r\\\u0001"+
		"\u0000\u0000\u0000rc\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000tu\u0003\u0010\b"+
		"\u0000uv\u0005\u0006\u0000\u0000vw\u0003\b\u0004\u0000wx\u0005\u0004\u0000"+
		"\u0000xy\u0003\b\u0004\u0000yz\u0005\b\u0000\u0000z{\u0005\u0001\u0000"+
		"\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0006\b\uffff\uffff\u0000}~\u0005"+
		"\u0012\u0000\u0000~\u0084\u0001\u0000\u0000\u0000\u007f\u0080\n\u0002"+
		"\u0000\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0083\u0003\u0010"+
		"\b\u0003\u0082\u007f\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0006\u001a\u001c06r\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}