// Generated from /Users/dmbrasil/Desktop/other/Trabalhos/expresso-lang/expresso/parser/expresso.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class expressoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		INPUT=32, ID=33, INT=34, FLOAT=35, STRING=36, BOOLEAN=37, WS=38;
	public static final int
		RULE_start = 0, RULE_func_def = 1, RULE_func_call = 2, RULE_class_def = 3, 
		RULE_class_stmt = 4, RULE_class_stmts = 5, RULE_class_inst = 6, RULE_stmt = 7, 
		RULE_stmts = 8, RULE_ass = 9, RULE_exp = 10, RULE_if_stmt = 11, RULE_while_stmt = 12, 
		RULE_for_stmt = 13, RULE_for_condition = 14, RULE_for_iteration = 15, 
		RULE_switch_stmt = 16, RULE_case_stmt = 17, RULE_case_stmts = 18, RULE_break_stmt = 19, 
		RULE_atm = 20, RULE_args = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "func_def", "func_call", "class_def", "class_stmt", "class_stmts", 
			"class_inst", "stmt", "stmts", "ass", "exp", "if_stmt", "while_stmt", 
			"for_stmt", "for_condition", "for_iteration", "switch_stmt", "case_stmt", 
			"case_stmts", "break_stmt", "atm", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "')'", "'.'", "'class'", "';'", "'{'", "'}'", "'new'", 
			"'return'", "'='", "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'<'", "'<='", 
			"'>='", "'=='", "'if'", "'else'", "'while'", "'for'", "'switch'", "'default'", 
			"':'", "'case'", "'break'", "','", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INPUT", "ID", "INT", 
			"FLOAT", "STRING", "BOOLEAN", "WS"
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
	public String getGrammarFileName() { return "expresso.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public expressoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__4) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(44);
					func_def();
					}
					break;
				case T__4:
					{
					setState(45);
					class_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expressoParser.ID, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(ID);
			setState(53);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(54);
				args();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__2);
			setState(61);
			stmts();
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

	public static class Func_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(expressoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(expressoParser.ID, i);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_call);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ID);
				setState(64);
				match(T__3);
				setState(65);
				match(ID);
				setState(66);
				match(T__1);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
					{
					{
					setState(67);
					args();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__1);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
					{
					{
					setState(76);
					args();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(T__2);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expressoParser.ID, 0); }
		public Class_stmtsContext class_stmts() {
			return getRuleContext(Class_stmtsContext.class,0);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__4);
			setState(86);
			match(ID);
			setState(87);
			match(T__1);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(88);
				args();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__2);
			setState(95);
			class_stmts();
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

	public static class Class_stmtContext extends ParserRuleContext {
		public AssContext ass() {
			return getRuleContext(AssContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Class_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_stmt; }
	}

	public final Class_stmtContext class_stmt() throws RecognitionException {
		Class_stmtContext _localctx = new Class_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_stmt);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				ass();
				setState(98);
				match(T__5);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				func_def();
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

	public static class Class_stmtsContext extends ParserRuleContext {
		public List<Class_stmtContext> class_stmt() {
			return getRuleContexts(Class_stmtContext.class);
		}
		public Class_stmtContext class_stmt(int i) {
			return getRuleContext(Class_stmtContext.class,i);
		}
		public Class_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_stmts; }
	}

	public final Class_stmtsContext class_stmts() throws RecognitionException {
		Class_stmtsContext _localctx = new Class_stmtsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_stmts);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__6);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==ID) {
					{
					{
					setState(104);
					class_stmt();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__6);
				setState(112);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Class_instContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expressoParser.ID, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Class_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_inst; }
	}

	public final Class_instContext class_inst() throws RecognitionException {
		Class_instContext _localctx = new Class_instContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
			setState(117);
			match(ID);
			setState(118);
			match(T__1);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(119);
				args();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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

	public static class StmtContext extends ParserRuleContext {
		public AssContext ass() {
			return getRuleContext(AssContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				ass();
				setState(128);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				func_call();
				setState(131);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				switch_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				if_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				match(T__9);
				setState(138);
				exp(0);
				setState(139);
				match(T__5);
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmts);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__6);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID))) != 0)) {
					{
					{
					setState(144);
					stmt();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__6);
				setState(152);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AssContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expressoParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Class_instContext class_inst() {
			return getRuleContext(Class_instContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public AssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass; }
	}

	public final AssContext ass() throws RecognitionException {
		AssContext _localctx = new AssContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(T__10);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(158);
				exp(0);
				}
				break;
			case 2:
				{
				setState(159);
				class_inst();
				}
				break;
			case 3:
				{
				setState(160);
				func_call();
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

	public static class ExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AtmContext atm() {
			return getRuleContext(AtmContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(164);
				match(T__1);
				setState(165);
				exp(0);
				setState(166);
				match(T__2);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case STRING:
			case BOOLEAN:
				{
				setState(168);
				atm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(171);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(172);
						match(T__11);
						setState(173);
						exp(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(174);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(175);
						match(T__12);
						setState(176);
						exp(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(177);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(178);
						match(T__13);
						setState(179);
						exp(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(180);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(181);
						match(T__14);
						setState(182);
						exp(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(183);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(184);
						match(T__15);
						setState(185);
						exp(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(186);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(187);
						match(T__16);
						setState(188);
						exp(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(189);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(190);
						match(T__17);
						setState(191);
						exp(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(192);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(193);
						match(T__18);
						setState(194);
						exp(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						match(T__19);
						setState(197);
						exp(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						match(T__20);
						setState(200);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class If_stmtContext extends ParserRuleContext {
		public ExpContext cond;
		public StmtsContext then;
		public StmtsContext otherwise;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__21);
			setState(207);
			((If_stmtContext)_localctx).cond = exp(0);
			setState(208);
			((If_stmtContext)_localctx).then = stmts();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(209);
				match(T__22);
				setState(210);
				((If_stmtContext)_localctx).otherwise = stmts();
				}
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

	public static class While_stmtContext extends ParserRuleContext {
		public ExpContext cond;
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__23);
			setState(214);
			((While_stmtContext)_localctx).cond = exp(0);
			setState(215);
			stmts();
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

	public static class For_stmtContext extends ParserRuleContext {
		public AssContext ass() {
			return getRuleContext(AssContext.class,0);
		}
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
		public For_iterationContext for_iteration() {
			return getRuleContext(For_iterationContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__24);
			setState(218);
			match(T__1);
			setState(219);
			ass();
			setState(220);
			match(T__5);
			setState(221);
			for_condition(0);
			setState(222);
			match(T__5);
			setState(223);
			for_iteration(0);
			setState(224);
			match(T__2);
			setState(225);
			stmts();
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

	public static class For_conditionContext extends ParserRuleContext {
		public List<For_conditionContext> for_condition() {
			return getRuleContexts(For_conditionContext.class);
		}
		public For_conditionContext for_condition(int i) {
			return getRuleContext(For_conditionContext.class,i);
		}
		public AtmContext atm() {
			return getRuleContext(AtmContext.class,0);
		}
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		return for_condition(0);
	}

	private For_conditionContext for_condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_conditionContext _localctx = new For_conditionContext(_ctx, _parentState);
		For_conditionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_for_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(228);
				match(T__1);
				setState(229);
				for_condition(0);
				setState(230);
				match(T__2);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case STRING:
			case BOOLEAN:
				{
				setState(232);
				atm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new For_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_condition);
						setState(235);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(236);
						match(T__16);
						setState(237);
						for_condition(8);
						}
						break;
					case 2:
						{
						_localctx = new For_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_condition);
						setState(238);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(239);
						match(T__17);
						setState(240);
						for_condition(7);
						}
						break;
					case 3:
						{
						_localctx = new For_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_condition);
						setState(241);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(242);
						match(T__18);
						setState(243);
						for_condition(6);
						}
						break;
					case 4:
						{
						_localctx = new For_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_condition);
						setState(244);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(245);
						match(T__19);
						setState(246);
						for_condition(5);
						}
						break;
					case 5:
						{
						_localctx = new For_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_condition);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						match(T__20);
						setState(249);
						for_condition(4);
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class For_iterationContext extends ParserRuleContext {
		public List<For_iterationContext> for_iteration() {
			return getRuleContexts(For_iterationContext.class);
		}
		public For_iterationContext for_iteration(int i) {
			return getRuleContext(For_iterationContext.class,i);
		}
		public AtmContext atm() {
			return getRuleContext(AtmContext.class,0);
		}
		public For_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iteration; }
	}

	public final For_iterationContext for_iteration() throws RecognitionException {
		return for_iteration(0);
	}

	private For_iterationContext for_iteration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_iterationContext _localctx = new For_iterationContext(_ctx, _parentState);
		For_iterationContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_for_iteration, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(256);
				match(T__1);
				setState(257);
				for_iteration(0);
				setState(258);
				match(T__2);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case STRING:
			case BOOLEAN:
				{
				setState(260);
				atm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new For_iterationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_iteration);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(264);
						match(T__11);
						setState(265);
						for_iteration(8);
						}
						break;
					case 2:
						{
						_localctx = new For_iterationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_iteration);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(267);
						match(T__12);
						setState(268);
						for_iteration(7);
						}
						break;
					case 3:
						{
						_localctx = new For_iterationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_iteration);
						setState(269);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(270);
						match(T__13);
						setState(271);
						for_iteration(6);
						}
						break;
					case 4:
						{
						_localctx = new For_iterationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_iteration);
						setState(272);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(273);
						match(T__14);
						setState(274);
						for_iteration(5);
						}
						break;
					case 5:
						{
						_localctx = new For_iterationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_iteration);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						match(T__15);
						setState(277);
						for_iteration(4);
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__25);
			setState(284);
			match(T__1);
			setState(285);
			exp(0);
			setState(286);
			match(T__2);
			setState(287);
			match(T__6);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(288);
				case_stmt();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(294);
				match(T__26);
				setState(295);
				match(T__27);
				setState(296);
				stmts();
				}
			}

			setState(299);
			match(T__7);
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

	public static class Case_stmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Case_stmtsContext case_stmts() {
			return getRuleContext(Case_stmtsContext.class,0);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_case_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__28);
			setState(302);
			exp(0);
			setState(303);
			match(T__27);
			setState(304);
			case_stmts();
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

	public static class Case_stmtsContext extends ParserRuleContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Case_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmts; }
	}

	public final Case_stmtsContext case_stmts() throws RecognitionException {
		Case_stmtsContext _localctx = new Case_stmtsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_stmts);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(T__6);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID))) != 0)) {
					{
					{
					setState(307);
					stmt();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				break_stmt();
				setState(314);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				stmts();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_break_stmt);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(T__29);
				setState(320);
				match(T__5);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AtmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(expressoParser.ID, 0); }
		public TerminalNode INT() { return getToken(expressoParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(expressoParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(expressoParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(expressoParser.BOOLEAN, 0); }
		public AtmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atm; }
	}

	public final AtmContext atm() throws RecognitionException {
		AtmContext _localctx = new AtmContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			exp(0);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(327);
				match(T__30);
				setState(328);
				exp(0);
				}
				}
				setState(333);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 14:
			return for_condition_sempred((For_conditionContext)_localctx, predIndex);
		case 15:
			return for_iteration_sempred((For_iterationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean for_condition_sempred(For_conditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean for_iteration_sempred(For_iterationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 7);
		case 16:
			return precpred(_ctx, 6);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\3\4\3\4\7\4P\n\4"+
		"\f\4\16\4S\13\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7"+
		"\3\7\3\7\3\7\3\7\5\7u\n\7\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090"+
		"\n\t\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\n\3\n\5\n\u009d"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a4\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00ac\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cc"+
		"\n\f\f\f\16\f\u00cf\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00fd\n\20\f\20\16\20\u0100"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0119"+
		"\n\21\f\21\16\21\u011c\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0124"+
		"\n\22\f\22\16\22\u0127\13\22\3\22\3\22\3\22\5\22\u012c\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u0137\n\24\f\24\16\24\u013a\13"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0140\n\24\3\25\3\25\3\25\5\25\u0145\n\25"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u014c\n\27\f\27\16\27\u014f\13\27\3\27"+
		"\2\5\26\36 \30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2"+
		"#\'\2\u016f\2\62\3\2\2\2\4\65\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\ng\3\2\2\2"+
		"\ft\3\2\2\2\16v\3\2\2\2\20\u008f\3\2\2\2\22\u009c\3\2\2\2\24\u009e\3\2"+
		"\2\2\26\u00ab\3\2\2\2\30\u00d0\3\2\2\2\32\u00d7\3\2\2\2\34\u00db\3\2\2"+
		"\2\36\u00eb\3\2\2\2 \u0107\3\2\2\2\"\u011d\3\2\2\2$\u012f\3\2\2\2&\u013f"+
		"\3\2\2\2(\u0144\3\2\2\2*\u0146\3\2\2\2,\u0148\3\2\2\2.\61\5\4\3\2/\61"+
		"\5\b\5\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2"+
		"\2\2\63\3\3\2\2\2\64\62\3\2\2\2\65\66\7\3\2\2\66\67\7#\2\2\67;\7\4\2\2"+
		"8:\5,\27\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2"+
		">?\7\5\2\2?@\5\22\n\2@\5\3\2\2\2AB\7#\2\2BC\7\6\2\2CD\7#\2\2DH\7\4\2\2"+
		"EG\5,\27\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2"+
		"KV\7\5\2\2LM\7#\2\2MQ\7\4\2\2NP\5,\27\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TV\7\5\2\2UA\3\2\2\2UL\3\2\2\2V\7\3\2\2"+
		"\2WX\7\7\2\2XY\7#\2\2Y]\7\4\2\2Z\\\5,\27\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\5\2\2ab\5\f\7\2b\t\3\2\2\2cd\5"+
		"\24\13\2de\7\b\2\2eh\3\2\2\2fh\5\4\3\2gc\3\2\2\2gf\3\2\2\2h\13\3\2\2\2"+
		"im\7\t\2\2jl\5\n\6\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2"+
		"om\3\2\2\2pu\7\n\2\2qr\7\t\2\2ru\7\n\2\2su\3\2\2\2ti\3\2\2\2tq\3\2\2\2"+
		"ts\3\2\2\2u\r\3\2\2\2vw\7\13\2\2wx\7#\2\2x|\7\4\2\2y{\5,\27\2zy\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\5"+
		"\2\2\u0080\17\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\b\2\2\u0083"+
		"\u0090\3\2\2\2\u0084\u0085\5\6\4\2\u0085\u0086\7\b\2\2\u0086\u0090\3\2"+
		"\2\2\u0087\u0090\5\"\22\2\u0088\u0090\5\32\16\2\u0089\u0090\5\34\17\2"+
		"\u008a\u0090\5\30\r\2\u008b\u008c\7\f\2\2\u008c\u008d\5\26\f\2\u008d\u008e"+
		"\7\b\2\2\u008e\u0090\3\2\2\2\u008f\u0081\3\2\2\2\u008f\u0084\3\2\2\2\u008f"+
		"\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2"+
		"\2\2\u008f\u008b\3\2\2\2\u0090\21\3\2\2\2\u0091\u0095\7\t\2\2\u0092\u0094"+
		"\5\20\t\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009d"+
		"\7\n\2\2\u0099\u009a\7\t\2\2\u009a\u009d\7\n\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0091\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2"+
		"\2\u009e\u009f\7#\2\2\u009f\u00a3\7\r\2\2\u00a0\u00a4\5\26\f\2\u00a1\u00a4"+
		"\5\16\b\2\u00a2\u00a4\5\6\4\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\b\f\1\2\u00a6\u00a7"+
		"\7\4\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\5\2\2\u00a9\u00ac\3\2\2\2"+
		"\u00aa\u00ac\5*\26\2\u00ab\u00a5\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00cd"+
		"\3\2\2\2\u00ad\u00ae\f\16\2\2\u00ae\u00af\7\16\2\2\u00af\u00cc\5\26\f"+
		"\17\u00b0\u00b1\f\r\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00cc\5\26\f\16\u00b3"+
		"\u00b4\f\f\2\2\u00b4\u00b5\7\20\2\2\u00b5\u00cc\5\26\f\r\u00b6\u00b7\f"+
		"\13\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00cc\5\26\f\f\u00b9\u00ba\f\n\2\2"+
		"\u00ba\u00bb\7\22\2\2\u00bb\u00cc\5\26\f\13\u00bc\u00bd\f\t\2\2\u00bd"+
		"\u00be\7\23\2\2\u00be\u00cc\5\26\f\n\u00bf\u00c0\f\b\2\2\u00c0\u00c1\7"+
		"\24\2\2\u00c1\u00cc\5\26\f\t\u00c2\u00c3\f\7\2\2\u00c3\u00c4\7\25\2\2"+
		"\u00c4\u00cc\5\26\f\b\u00c5\u00c6\f\6\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00cc"+
		"\5\26\f\7\u00c8\u00c9\f\5\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cc\5\26\f"+
		"\6\u00cb\u00ad\3\2\2\2\u00cb\u00b0\3\2\2\2\u00cb\u00b3\3\2\2\2\u00cb\u00b6"+
		"\3\2\2\2\u00cb\u00b9\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb"+
		"\u00c2\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d5\5\22\n"+
		"\2\u00d3\u00d4\7\31\2\2\u00d4\u00d6\5\22\n\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00d9\5\26"+
		"\f\2\u00d9\u00da\5\22\n\2\u00da\33\3\2\2\2\u00db\u00dc\7\33\2\2\u00dc"+
		"\u00dd\7\4\2\2\u00dd\u00de\5\24\13\2\u00de\u00df\7\b\2\2\u00df\u00e0\5"+
		"\36\20\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\5\2\2\u00e3"+
		"\u00e4\5\22\n\2\u00e4\35\3\2\2\2\u00e5\u00e6\b\20\1\2\u00e6\u00e7\7\4"+
		"\2\2\u00e7\u00e8\5\36\20\2\u00e8\u00e9\7\5\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00ec\5*\26\2\u00eb\u00e5\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00fe\3\2"+
		"\2\2\u00ed\u00ee\f\t\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00fd\5\36\20\n\u00f0"+
		"\u00f1\f\b\2\2\u00f1\u00f2\7\24\2\2\u00f2\u00fd\5\36\20\t\u00f3\u00f4"+
		"\f\7\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00fd\5\36\20\b\u00f6\u00f7\f\6\2"+
		"\2\u00f7\u00f8\7\26\2\2\u00f8\u00fd\5\36\20\7\u00f9\u00fa\f\5\2\2\u00fa"+
		"\u00fb\7\27\2\2\u00fb\u00fd\5\36\20\6\u00fc\u00ed\3\2\2\2\u00fc\u00f0"+
		"\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\37\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0101\u0102\b\21\1\2\u0102\u0103\7\4\2\2\u0103"+
		"\u0104\5 \21\2\u0104\u0105\7\5\2\2\u0105\u0108\3\2\2\2\u0106\u0108\5*"+
		"\26\2\u0107\u0101\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u011a\3\2\2\2\u0109"+
		"\u010a\f\t\2\2\u010a\u010b\7\16\2\2\u010b\u0119\5 \21\n\u010c\u010d\f"+
		"\b\2\2\u010d\u010e\7\17\2\2\u010e\u0119\5 \21\t\u010f\u0110\f\7\2\2\u0110"+
		"\u0111\7\20\2\2\u0111\u0119\5 \21\b\u0112\u0113\f\6\2\2\u0113\u0114\7"+
		"\21\2\2\u0114\u0119\5 \21\7\u0115\u0116\f\5\2\2\u0116\u0117\7\22\2\2\u0117"+
		"\u0119\5 \21\6\u0118\u0109\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010f\3\2"+
		"\2\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b!\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011d\u011e\7\34\2\2\u011e\u011f\7\4\2\2\u011f\u0120\5\26\f\2\u0120\u0121"+
		"\7\5\2\2\u0121\u0125\7\t\2\2\u0122\u0124\5$\23\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012b\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\35\2\2\u0129\u012a\7\36\2\2\u012a"+
		"\u012c\5\22\n\2\u012b\u0128\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\u012e\7\n\2\2\u012e#\3\2\2\2\u012f\u0130\7\37\2\2\u0130\u0131"+
		"\5\26\f\2\u0131\u0132\7\36\2\2\u0132\u0133\5&\24\2\u0133%\3\2\2\2\u0134"+
		"\u0138\7\t\2\2\u0135\u0137\5\20\t\2\u0136\u0135\3\2\2\2\u0137\u013a\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\5(\25\2\u013c\u013d\7\n\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u0140\5\22\n\2\u013f\u0134\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\'\3\2\2\2\u0141\u0142\7 \2\2\u0142\u0145\7\b\2\2\u0143\u0145\3\2\2\2"+
		"\u0144\u0141\3\2\2\2\u0144\u0143\3\2\2\2\u0145)\3\2\2\2\u0146\u0147\t"+
		"\2\2\2\u0147+\3\2\2\2\u0148\u014d\5\26\f\2\u0149\u014a\7!\2\2\u014a\u014c"+
		"\5\26\f\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2"+
		"\u014d\u014e\3\2\2\2\u014e-\3\2\2\2\u014f\u014d\3\2\2\2!\60\62;HQU]gm"+
		"t|\u008f\u0095\u009c\u00a3\u00ab\u00cb\u00cd\u00d5\u00eb\u00fc\u00fe\u0107"+
		"\u0118\u011a\u0125\u012b\u0138\u013f\u0144\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}