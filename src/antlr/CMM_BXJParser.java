package antlr;// Generated from D:/Source_File/For_InteliJ/CMMGrammar/G4\CMM_BXJ.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMM_BXJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_INT=1, T_DOUBLE=2, T_CHAR=3, T_BOOL=4, IF=5, ELSE=6, ELSEIF=7, WHILE=8, 
		BREAK=9, CONTINUE=10, READ=11, WRITE=12, BOOL=13, ID=14, NUM_OP=15, PLUS=16, 
		MINUS=17, COMPARE_OP=18, BOOL_OP=19, CHAR=20, DOUBLE=21, INT=22, LEFT_CURLY=23, 
		RIGHT_CURLY=24, LEFT_PAREN=25, RIGHT_PAREN=26, LEFT_BRACKET=27, RIGHT_BRACKET=28, 
		EQUAL=29, LOGIC_NOT=30, COMMA=31, SEMICOLON=32, PP=33, MM=34, QUOTE=35, 
		ESCAPED_QUOTE=36, MULTI_COMMENT=37, SINGL_COMMENT=38, WS=39, NO_ENTER=40;
	public static final int
		RULE_input = 0, RULE_stat_block = 1, RULE_stat = 2, RULE_declare_stat = 3, 
		RULE_assign_stat = 4, RULE_declare_assign_stat = 5, RULE_read_stat = 6, 
		RULE_write_stat = 7, RULE_if_stat = 8, RULE_while_stat = 9, RULE_break_stat = 10, 
		RULE_cont_stat = 11, RULE_other_stat = 12, RULE_expr = 13, RULE_array_expr = 14, 
		RULE_int_array_expr = 15, RULE_double_array_expr = 16, RULE_char_array_expr = 17, 
		RULE_bool_array_expr = 18, RULE_int_expr = 19, RULE_double_expr = 20, 
		RULE_bool_expr = 21, RULE_char_expr = 22, RULE_type = 23, RULE_array_id = 24, 
		RULE_array_tail = 25;
	public static final String[] ruleNames = {
		"input", "stat_block", "stat", "declare_stat", "assign_stat", "declare_assign_stat", 
		"read_stat", "write_stat", "if_stat", "while_stat", "break_stat", "cont_stat", 
		"other_stat", "expr", "array_expr", "int_array_expr", "double_array_expr", 
		"char_array_expr", "bool_array_expr", "int_expr", "double_expr", "bool_expr", 
		"char_expr", "type", "array_id", "array_tail"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'double'", "'char'", "'bool'", "'if'", "'else'", "'else if'", 
		"'while'", "'break'", "'continue'", "'read'", "'write'", null, null, null, 
		"'+'", "'-'", null, null, null, null, null, "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'='", "'!'", "','", "';'", "'++'", "'--'", "'\"'", "'\\\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_INT", "T_DOUBLE", "T_CHAR", "T_BOOL", "IF", "ELSE", "ELSEIF", 
		"WHILE", "BREAK", "CONTINUE", "READ", "WRITE", "BOOL", "ID", "NUM_OP", 
		"PLUS", "MINUS", "COMPARE_OP", "BOOL_OP", "CHAR", "DOUBLE", "INT", "LEFT_CURLY", 
		"RIGHT_CURLY", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"EQUAL", "LOGIC_NOT", "COMMA", "SEMICOLON", "PP", "MM", "QUOTE", "ESCAPED_QUOTE", 
		"MULTI_COMMENT", "SINGL_COMMENT", "WS", "NO_ENTER"
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
	public String getGrammarFileName() { return "CMM_BXJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMM_BXJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_CHAR) | (1L << T_BOOL) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(52);
				stat();
				}
				}
				setState(57);
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat_block);
		int _la;
		try {
			setState(67);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(LEFT_CURLY);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_CHAR) | (1L << T_BOOL) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
					{
					{
					setState(59);
					stat();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(RIGHT_CURLY);
				}
				break;
			case T_INT:
			case T_DOUBLE:
			case T_CHAR:
			case T_BOOL:
			case IF:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				stat();
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

	public static class StatContext extends ParserRuleContext {
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CMM_BXJParser.SEMICOLON, 0); }
		public Read_statContext read_stat() {
			return getRuleContext(Read_statContext.class,0);
		}
		public Write_statContext write_stat() {
			return getRuleContext(Write_statContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Declare_statContext declare_stat() {
			return getRuleContext(Declare_statContext.class,0);
		}
		public Declare_assign_statContext declare_assign_stat() {
			return getRuleContext(Declare_assign_statContext.class,0);
		}
		public Break_statContext break_stat() {
			return getRuleContext(Break_statContext.class,0);
		}
		public Cont_statContext cont_stat() {
			return getRuleContext(Cont_statContext.class,0);
		}
		public Other_statContext other_stat() {
			return getRuleContext(Other_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				assign_stat();
				setState(70);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				read_stat();
				setState(73);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				write_stat();
				setState(76);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				if_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				declare_stat();
				setState(81);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				declare_assign_stat();
				setState(84);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				break_stat();
				setState(87);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				cont_stat();
				setState(90);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				other_stat();
				setState(93);
				match(SEMICOLON);
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

	public static class Declare_statContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CMM_BXJParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMM_BXJParser.ID, i);
		}
		public List<Array_idContext> array_id() {
			return getRuleContexts(Array_idContext.class);
		}
		public Array_idContext array_id(int i) {
			return getRuleContext(Array_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Declare_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterDeclare_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitDeclare_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitDeclare_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_statContext declare_stat() throws RecognitionException {
		Declare_statContext _localctx = new Declare_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(98);
				match(ID);
				}
				break;
			case 2:
				{
				setState(99);
				array_id();
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(105);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(103);
					match(ID);
					}
					break;
				case 2:
					{
					setState(104);
					array_id();
					}
					break;
				}
				}
				}
				setState(111);
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

	public static class Assign_statContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(CMM_BXJParser.EQUAL, 0); }
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public Assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterAssign_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitAssign_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitAssign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statContext assign_stat() throws RecognitionException {
		Assign_statContext _localctx = new Assign_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(112);
				match(ID);
				}
				break;
			case 2:
				{
				setState(113);
				array_id();
				}
				break;
			}
			setState(116);
			match(EQUAL);
			setState(119);
			switch (_input.LA(1)) {
			case BOOL:
			case ID:
			case MINUS:
			case CHAR:
			case DOUBLE:
			case INT:
			case LEFT_PAREN:
			case LOGIC_NOT:
				{
				setState(117);
				expr();
				}
				break;
			case LEFT_CURLY:
			case QUOTE:
				{
				setState(118);
				array_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Declare_assign_statContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CMM_BXJParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMM_BXJParser.ID, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CMM_BXJParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CMM_BXJParser.EQUAL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public List<Array_idContext> array_id() {
			return getRuleContexts(Array_idContext.class);
		}
		public Array_idContext array_id(int i) {
			return getRuleContext(Array_idContext.class,i);
		}
		public List<Array_exprContext> array_expr() {
			return getRuleContexts(Array_exprContext.class);
		}
		public Array_exprContext array_expr(int i) {
			return getRuleContext(Array_exprContext.class,i);
		}
		public Declare_assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_assign_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterDeclare_assign_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitDeclare_assign_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitDeclare_assign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_assign_statContext declare_assign_stat() throws RecognitionException {
		Declare_assign_statContext _localctx = new Declare_assign_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare_assign_stat);
		int _la;
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				type();
				setState(122);
				match(ID);
				setState(125);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(123);
					match(EQUAL);
					setState(124);
					expr();
					}
				}

				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(127);
					match(COMMA);
					setState(128);
					match(ID);
					setState(131);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(129);
						match(EQUAL);
						setState(130);
						expr();
						}
					}

					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				type();
				setState(139);
				array_id();
				setState(142);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(140);
					match(EQUAL);
					setState(141);
					array_expr();
					}
				}

				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(144);
					match(COMMA);
					setState(145);
					array_id();
					setState(148);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(146);
						match(EQUAL);
						setState(147);
						array_expr();
						}
					}

					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Read_statContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMM_BXJParser.READ, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public Read_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterRead_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitRead_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitRead_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statContext read_stat() throws RecognitionException {
		Read_statContext _localctx = new Read_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_read_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(READ);
			setState(158);
			match(LEFT_PAREN);
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(159);
				match(ID);
				}
				break;
			case 2:
				{
				setState(160);
				array_id();
				}
				break;
			}
			setState(163);
			match(RIGHT_PAREN);
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

	public static class Write_statContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CMM_BXJParser.WRITE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Write_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterWrite_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitWrite_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitWrite_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_statContext write_stat() throws RecognitionException {
		Write_statContext _localctx = new Write_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_write_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(WRITE);
			setState(166);
			match(LEFT_PAREN);
			setState(167);
			expr();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168);
				match(COMMA);
				setState(169);
				expr();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(RIGHT_PAREN);
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CMM_BXJParser.IF, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(CMM_BXJParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(CMM_BXJParser.LEFT_PAREN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(CMM_BXJParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(CMM_BXJParser.RIGHT_PAREN, i);
		}
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(CMM_BXJParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(CMM_BXJParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(CMM_BXJParser.ELSE, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF);
			setState(178);
			match(LEFT_PAREN);
			setState(179);
			bool_expr(0);
			setState(180);
			match(RIGHT_PAREN);
			setState(181);
			stat_block();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					match(ELSEIF);
					setState(183);
					match(LEFT_PAREN);
					setState(184);
					bool_expr(0);
					setState(185);
					match(RIGHT_PAREN);
					setState(186);
					stat_block();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(193);
				match(ELSE);
				setState(194);
				stat_block();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CMM_BXJParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(WHILE);
			setState(198);
			match(LEFT_PAREN);
			setState(199);
			expr();
			setState(200);
			match(RIGHT_PAREN);
			setState(201);
			stat_block();
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

	public static class Break_statContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CMM_BXJParser.BREAK, 0); }
		public Break_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterBreak_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitBreak_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statContext break_stat() throws RecognitionException {
		Break_statContext _localctx = new Break_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_break_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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

	public static class Cont_statContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CMM_BXJParser.CONTINUE, 0); }
		public Cont_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterCont_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitCont_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitCont_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont_statContext cont_stat() throws RecognitionException {
		Cont_statContext _localctx = new Cont_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cont_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CONTINUE);
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

	public static class Other_statContext extends ParserRuleContext {
		public TerminalNode PP() { return getToken(CMM_BXJParser.PP, 0); }
		public TerminalNode MM() { return getToken(CMM_BXJParser.MM, 0); }
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public Other_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterOther_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitOther_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitOther_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_statContext other_stat() throws RecognitionException {
		Other_statContext _localctx = new Other_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_other_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(207);
				match(ID);
				}
				break;
			case 2:
				{
				setState(208);
				array_id();
				}
				break;
			}
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExprContext extends ParserRuleContext {
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public Double_exprContext double_expr() {
			return getRuleContext(Double_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Char_exprContext char_expr() {
			return getRuleContext(Char_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				int_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				double_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				bool_expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				char_expr();
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

	public static class Array_exprContext extends ParserRuleContext {
		public Int_array_exprContext int_array_expr() {
			return getRuleContext(Int_array_exprContext.class,0);
		}
		public Double_array_exprContext double_array_expr() {
			return getRuleContext(Double_array_exprContext.class,0);
		}
		public Char_array_exprContext char_array_expr() {
			return getRuleContext(Char_array_exprContext.class,0);
		}
		public Bool_array_exprContext bool_array_expr() {
			return getRuleContext(Bool_array_exprContext.class,0);
		}
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterArray_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitArray_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitArray_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_expr);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				int_array_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				double_array_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				char_array_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				bool_array_expr();
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

	public static class Int_array_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public List<TerminalNode> INT() { return getTokens(CMM_BXJParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CMM_BXJParser.INT, i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Int_array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterInt_array_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitInt_array_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitInt_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_array_exprContext int_array_expr() throws RecognitionException {
		Int_array_exprContext _localctx = new Int_array_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_int_array_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LEFT_CURLY);
			setState(226);
			match(INT);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				match(INT);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(RIGHT_CURLY);
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

	public static class Double_array_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> INT() { return getTokens(CMM_BXJParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CMM_BXJParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CMM_BXJParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CMM_BXJParser.DOUBLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Double_array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterDouble_array_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitDouble_array_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitDouble_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_array_exprContext double_array_expr() throws RecognitionException {
		Double_array_exprContext _localctx = new Double_array_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_double_array_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LEFT_CURLY);
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE || _la==INT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(RIGHT_CURLY);
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

	public static class Char_array_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(CMM_BXJParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(CMM_BXJParser.CHAR, i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(CMM_BXJParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(CMM_BXJParser.QUOTE, i);
		}
		public List<TerminalNode> ESCAPED_QUOTE() { return getTokens(CMM_BXJParser.ESCAPED_QUOTE); }
		public TerminalNode ESCAPED_QUOTE(int i) {
			return getToken(CMM_BXJParser.ESCAPED_QUOTE, i);
		}
		public List<TerminalNode> NO_ENTER() { return getTokens(CMM_BXJParser.NO_ENTER); }
		public TerminalNode NO_ENTER(int i) {
			return getToken(CMM_BXJParser.NO_ENTER, i);
		}
		public Char_array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterChar_array_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitChar_array_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitChar_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_array_exprContext char_array_expr() throws RecognitionException {
		Char_array_exprContext _localctx = new Char_array_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_char_array_expr);
		int _la;
		try {
			int _alt;
			setState(265);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(LEFT_CURLY);
				setState(248);
				match(CHAR);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(249);
					match(COMMA);
					setState(250);
					match(CHAR);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(RIGHT_CURLY);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(QUOTE);
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(258);
						_la = _input.LA(1);
						if ( !(_la==ESCAPED_QUOTE || _la==NO_ENTER) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(264);
				match(QUOTE);
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

	public static class Bool_array_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public List<TerminalNode> BOOL() { return getTokens(CMM_BXJParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(CMM_BXJParser.BOOL, i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Bool_array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterBool_array_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitBool_array_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitBool_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_array_exprContext bool_array_expr() throws RecognitionException {
		Bool_array_exprContext _localctx = new Bool_array_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool_array_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LEFT_CURLY);
			setState(268);
			match(BOOL);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(269);
				match(COMMA);
				setState(270);
				match(BOOL);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(RIGHT_CURLY);
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

	public static class Int_exprContext extends ParserRuleContext {
		public int value;
		public TerminalNode MINUS() { return getToken(CMM_BXJParser.MINUS, 0); }
		public List<Int_exprContext> int_expr() {
			return getRuleContexts(Int_exprContext.class);
		}
		public Int_exprContext int_expr(int i) {
			return getRuleContext(Int_exprContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public TerminalNode INT() { return getToken(CMM_BXJParser.INT, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public TerminalNode NUM_OP() { return getToken(CMM_BXJParser.NUM_OP, 0); }
		public TerminalNode PLUS() { return getToken(CMM_BXJParser.PLUS, 0); }
		public TerminalNode MM() { return getToken(CMM_BXJParser.MM, 0); }
		public Int_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterInt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitInt_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitInt_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_exprContext int_expr() throws RecognitionException {
		return int_expr(0);
	}

	private Int_exprContext int_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_exprContext _localctx = new Int_exprContext(_ctx, _parentState);
		Int_exprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_int_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(279);
				match(MINUS);
				setState(280);
				int_expr(7);
				}
				break;
			case 2:
				{
				setState(281);
				match(LEFT_PAREN);
				setState(282);
				int_expr(0);
				setState(283);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(285);
				match(INT);
				}
				break;
			case 4:
				{
				setState(286);
				array_id();
				}
				break;
			case 5:
				{
				setState(287);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Int_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
						setState(290);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(291);
						match(NUM_OP);
						setState(292);
						int_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Int_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
						setState(293);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(294);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(295);
						int_expr(6);
						}
						break;
					case 3:
						{
						_localctx = new Int_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_expr);
						setState(296);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(297);
						match(MM);
						setState(298);
						int_expr(5);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Double_exprContext extends ParserRuleContext {
		public double value;
		public TerminalNode MINUS() { return getToken(CMM_BXJParser.MINUS, 0); }
		public List<Double_exprContext> double_expr() {
			return getRuleContexts(Double_exprContext.class);
		}
		public Double_exprContext double_expr(int i) {
			return getRuleContext(Double_exprContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public List<Int_exprContext> int_expr() {
			return getRuleContexts(Int_exprContext.class);
		}
		public Int_exprContext int_expr(int i) {
			return getRuleContext(Int_exprContext.class,i);
		}
		public TerminalNode NUM_OP() { return getToken(CMM_BXJParser.NUM_OP, 0); }
		public TerminalNode PLUS() { return getToken(CMM_BXJParser.PLUS, 0); }
		public TerminalNode INT() { return getToken(CMM_BXJParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CMM_BXJParser.DOUBLE, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public TerminalNode MM() { return getToken(CMM_BXJParser.MM, 0); }
		public Double_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterDouble_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitDouble_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitDouble_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_exprContext double_expr() throws RecognitionException {
		return double_expr(0);
	}

	private Double_exprContext double_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Double_exprContext _localctx = new Double_exprContext(_ctx, _parentState);
		Double_exprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_double_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(305);
				match(MINUS);
				setState(306);
				double_expr(8);
				}
				break;
			case 2:
				{
				setState(307);
				match(LEFT_PAREN);
				setState(308);
				double_expr(0);
				setState(309);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(311);
				int_expr(0);
				setState(312);
				match(NUM_OP);
				setState(313);
				int_expr(0);
				}
				break;
			case 4:
				{
				setState(315);
				int_expr(0);
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(317);
				int_expr(0);
				}
				break;
			case 5:
				{
				setState(319);
				match(INT);
				}
				break;
			case 6:
				{
				setState(320);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				setState(321);
				array_id();
				}
				break;
			case 8:
				{
				setState(322);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Double_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_double_expr);
					setState(325);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(326);
					match(MM);
					setState(327);
					double_expr(6);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public boolean value;
		public TerminalNode LOGIC_NOT() { return getToken(CMM_BXJParser.LOGIC_NOT, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public List<Int_exprContext> int_expr() {
			return getRuleContexts(Int_exprContext.class);
		}
		public Int_exprContext int_expr(int i) {
			return getRuleContext(Int_exprContext.class,i);
		}
		public TerminalNode COMPARE_OP() { return getToken(CMM_BXJParser.COMPARE_OP, 0); }
		public List<Double_exprContext> double_expr() {
			return getRuleContexts(Double_exprContext.class);
		}
		public Double_exprContext double_expr(int i) {
			return getRuleContext(Double_exprContext.class,i);
		}
		public TerminalNode BOOL() { return getToken(CMM_BXJParser.BOOL, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public TerminalNode BOOL_OP() { return getToken(CMM_BXJParser.BOOL_OP, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(334);
				match(LOGIC_NOT);
				setState(335);
				bool_expr(9);
				}
				break;
			case 2:
				{
				setState(336);
				match(LEFT_PAREN);
				setState(337);
				bool_expr(0);
				setState(338);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(340);
				int_expr(0);
				setState(341);
				match(COMPARE_OP);
				setState(342);
				int_expr(0);
				}
				break;
			case 4:
				{
				setState(344);
				double_expr(0);
				setState(345);
				match(COMPARE_OP);
				setState(346);
				double_expr(0);
				}
				break;
			case 5:
				{
				setState(348);
				int_expr(0);
				setState(349);
				match(COMPARE_OP);
				setState(350);
				double_expr(0);
				}
				break;
			case 6:
				{
				setState(352);
				double_expr(0);
				setState(353);
				match(COMPARE_OP);
				setState(354);
				int_expr(0);
				}
				break;
			case 7:
				{
				setState(356);
				match(BOOL);
				}
				break;
			case 8:
				{
				setState(357);
				array_id();
				}
				break;
			case 9:
				{
				setState(358);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(361);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(362);
					match(BOOL_OP);
					setState(363);
					bool_expr(9);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Char_exprContext extends ParserRuleContext {
		public char value;
		public TerminalNode CHAR() { return getToken(CMM_BXJParser.CHAR, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public Char_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterChar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitChar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitChar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_exprContext char_expr() throws RecognitionException {
		Char_exprContext _localctx = new Char_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_char_expr);
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				array_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(CMM_BXJParser.T_INT, 0); }
		public TerminalNode T_DOUBLE() { return getToken(CMM_BXJParser.T_DOUBLE, 0); }
		public TerminalNode T_CHAR() { return getToken(CMM_BXJParser.T_CHAR, 0); }
		public TerminalNode T_BOOL() { return getToken(CMM_BXJParser.T_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_CHAR) | (1L << T_BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Array_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public Array_tailContext array_tail() {
			return getRuleContext(Array_tailContext.class,0);
		}
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitArray_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitArray_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
			setState(377);
			array_tail();
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

	public static class Array_tailContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(CMM_BXJParser.LEFT_BRACKET, 0); }
		public Int_exprContext int_expr() {
			return getRuleContext(Int_exprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CMM_BXJParser.RIGHT_BRACKET, 0); }
		public Array_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterArray_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitArray_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitArray_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_tailContext array_tail() throws RecognitionException {
		Array_tailContext _localctx = new Array_tailContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LEFT_BRACKET);
			setState(380);
			int_expr(0);
			setState(381);
			match(RIGHT_BRACKET);
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
		case 19:
			return int_expr_sempred((Int_exprContext)_localctx, predIndex);
		case 20:
			return double_expr_sempred((Double_exprContext)_localctx, predIndex);
		case 21:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean int_expr_sempred(Int_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean double_expr_sempred(Double_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0182\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n"+
		"\4\3\5\3\5\3\5\5\5g\n\5\3\5\3\5\3\5\5\5l\n\5\7\5n\n\5\f\5\16\5q\13\5\3"+
		"\6\3\6\5\6u\n\6\3\6\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\7"+
		"\3\7\3\7\3\7\5\7\u0086\n\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0091\n\7\3\7\3\7\3\7\3\7\5\7\u0097\n\7\7\7\u0099\n\7\f\7\16"+
		"\7\u009c\13\7\5\7\u009e\n\7\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n"+
		"\3\n\5\n\u00c6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\5\16\u00d4\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00e2\n\20\3\21\3\21\3\21\3\21\7\21\u00e8\n\21"+
		"\f\21\16\21\u00eb\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00f3\n\22"+
		"\f\22\16\22\u00f6\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00fe\n\23"+
		"\f\23\16\23\u0101\13\23\3\23\3\23\3\23\7\23\u0106\n\23\f\23\16\23\u0109"+
		"\13\23\3\23\5\23\u010c\n\23\3\24\3\24\3\24\3\24\7\24\u0112\n\24\f\24\16"+
		"\24\u0115\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0123\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u012e\n\25\f\25\16\25\u0131\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0146"+
		"\n\26\3\26\3\26\3\26\7\26\u014b\n\26\f\26\16\26\u014e\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u016a\n\27\3\27"+
		"\3\27\3\27\7\27\u016f\n\27\f\27\16\27\u0172\13\27\3\30\3\30\3\30\5\30"+
		"\u0177\n\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\u0107"+
		"\5(*,\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7"+
		"\3\2#$\3\2\27\30\4\2&&**\3\2\22\23\3\2\3\6\u01aa\29\3\2\2\2\4E\3\2\2\2"+
		"\6a\3\2\2\2\bc\3\2\2\2\nt\3\2\2\2\f\u009d\3\2\2\2\16\u009f\3\2\2\2\20"+
		"\u00a7\3\2\2\2\22\u00b3\3\2\2\2\24\u00c7\3\2\2\2\26\u00cd\3\2\2\2\30\u00cf"+
		"\3\2\2\2\32\u00d3\3\2\2\2\34\u00db\3\2\2\2\36\u00e1\3\2\2\2 \u00e3\3\2"+
		"\2\2\"\u00ee\3\2\2\2$\u010b\3\2\2\2&\u010d\3\2\2\2(\u0122\3\2\2\2*\u0145"+
		"\3\2\2\2,\u0169\3\2\2\2.\u0176\3\2\2\2\60\u0178\3\2\2\2\62\u017a\3\2\2"+
		"\2\64\u017d\3\2\2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<@\7\31\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CF\7\32\2\2DF\5\6\4\2E<\3\2\2"+
		"\2ED\3\2\2\2F\5\3\2\2\2GH\5\n\6\2HI\7\"\2\2Ib\3\2\2\2JK\5\16\b\2KL\7\""+
		"\2\2Lb\3\2\2\2MN\5\20\t\2NO\7\"\2\2Ob\3\2\2\2Pb\5\22\n\2Qb\5\24\13\2R"+
		"S\5\b\5\2ST\7\"\2\2Tb\3\2\2\2UV\5\f\7\2VW\7\"\2\2Wb\3\2\2\2XY\5\26\f\2"+
		"YZ\7\"\2\2Zb\3\2\2\2[\\\5\30\r\2\\]\7\"\2\2]b\3\2\2\2^_\5\32\16\2_`\7"+
		"\"\2\2`b\3\2\2\2aG\3\2\2\2aJ\3\2\2\2aM\3\2\2\2aP\3\2\2\2aQ\3\2\2\2aR\3"+
		"\2\2\2aU\3\2\2\2aX\3\2\2\2a[\3\2\2\2a^\3\2\2\2b\7\3\2\2\2cf\5\60\31\2"+
		"dg\7\20\2\2eg\5\62\32\2fd\3\2\2\2fe\3\2\2\2go\3\2\2\2hk\7!\2\2il\7\20"+
		"\2\2jl\5\62\32\2ki\3\2\2\2kj\3\2\2\2ln\3\2\2\2mh\3\2\2\2nq\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2p\t\3\2\2\2qo\3\2\2\2ru\7\20\2\2su\5\62\32\2tr\3\2\2\2"+
		"ts\3\2\2\2uv\3\2\2\2vy\7\37\2\2wz\5\34\17\2xz\5\36\20\2yw\3\2\2\2yx\3"+
		"\2\2\2z\13\3\2\2\2{|\5\60\31\2|\177\7\20\2\2}~\7\37\2\2~\u0080\5\34\17"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0089\3\2\2\2\u0081\u0082\7!\2"+
		"\2\u0082\u0085\7\20\2\2\u0083\u0084\7\37\2\2\u0084\u0086\5\34\17\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2"+
		"\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u009e\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5\60\31\2\u008d\u0090\5"+
		"\62\32\2\u008e\u008f\7\37\2\2\u008f\u0091\5\36\20\2\u0090\u008e\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u009a\3\2\2\2\u0092\u0093\7!\2\2\u0093\u0096"+
		"\5\62\32\2\u0094\u0095\7\37\2\2\u0095\u0097\5\36\20\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d{\3\2\2\2\u009d\u008c\3\2\2\2\u009e\r\3"+
		"\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a3\7\33\2\2\u00a1\u00a4\7\20\2\2\u00a2"+
		"\u00a4\5\62\32\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00a6\7\34\2\2\u00a6\17\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8"+
		"\u00a9\7\33\2\2\u00a9\u00ae\5\34\17\2\u00aa\u00ab\7!\2\2\u00ab\u00ad\5"+
		"\34\17\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\34"+
		"\2\2\u00b2\21\3\2\2\2\u00b3\u00b4\7\7\2\2\u00b4\u00b5\7\33\2\2\u00b5\u00b6"+
		"\5,\27\2\u00b6\u00b7\7\34\2\2\u00b7\u00c0\5\4\3\2\u00b8\u00b9\7\t\2\2"+
		"\u00b9\u00ba\7\33\2\2\u00ba\u00bb\5,\27\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd"+
		"\5\4\3\2\u00bd\u00bf\3\2\2\2\u00be\u00b8\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c4\7\b\2\2\u00c4\u00c6\5\4\3\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\7\33\2"+
		"\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\7\34\2\2\u00cb\u00cc\5\4\3\2\u00cc"+
		"\25\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\7\f\2\2"+
		"\u00d0\31\3\2\2\2\u00d1\u00d4\7\20\2\2\u00d2\u00d4\5\62\32\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\t\2\2\2\u00d6"+
		"\33\3\2\2\2\u00d7\u00dc\5(\25\2\u00d8\u00dc\5*\26\2\u00d9\u00dc\5,\27"+
		"\2\u00da\u00dc\5.\30\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\35\3\2\2\2\u00dd\u00e2\5 \21\2\u00de"+
		"\u00e2\5\"\22\2\u00df\u00e2\5$\23\2\u00e0\u00e2\5&\24\2\u00e1\u00dd\3"+
		"\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\37\3\2\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e9\7\30\2\2\u00e5\u00e6\7!\2"+
		"\2\u00e6\u00e8\7\30\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\7\32\2\2\u00ed!\3\2\2\2\u00ee\u00ef\7\31\2\2\u00ef\u00f4"+
		"\t\3\2\2\u00f0\u00f1\7!\2\2\u00f1\u00f3\t\3\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\32\2\2\u00f8#\3\2\2\2\u00f9\u00fa"+
		"\7\31\2\2\u00fa\u00ff\7\26\2\2\u00fb\u00fc\7!\2\2\u00fc\u00fe\7\26\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u010c\7\32\2\2"+
		"\u0103\u0107\7%\2\2\u0104\u0106\t\4\2\2\u0105\u0104\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010c\7%\2\2\u010b\u00f9\3\2\2\2\u010b\u0103\3\2"+
		"\2\2\u010c%\3\2\2\2\u010d\u010e\7\31\2\2\u010e\u0113\7\17\2\2\u010f\u0110"+
		"\7!\2\2\u0110\u0112\7\17\2\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\7\32\2\2\u0117\'\3\2\2\2\u0118\u0119\b\25\1\2\u0119\u011a"+
		"\7\23\2\2\u011a\u0123\5(\25\t\u011b\u011c\7\33\2\2\u011c\u011d\5(\25\2"+
		"\u011d\u011e\7\34\2\2\u011e\u0123\3\2\2\2\u011f\u0123\7\30\2\2\u0120\u0123"+
		"\5\62\32\2\u0121\u0123\7\20\2\2\u0122\u0118\3\2\2\2\u0122\u011b\3\2\2"+
		"\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u012f"+
		"\3\2\2\2\u0124\u0125\f\b\2\2\u0125\u0126\7\21\2\2\u0126\u012e\5(\25\t"+
		"\u0127\u0128\f\7\2\2\u0128\u0129\t\5\2\2\u0129\u012e\5(\25\b\u012a\u012b"+
		"\f\6\2\2\u012b\u012c\7$\2\2\u012c\u012e\5(\25\7\u012d\u0124\3\2\2\2\u012d"+
		"\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130)\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133"+
		"\b\26\1\2\u0133\u0134\7\23\2\2\u0134\u0146\5*\26\n\u0135\u0136\7\33\2"+
		"\2\u0136\u0137\5*\26\2\u0137\u0138\7\34\2\2\u0138\u0146\3\2\2\2\u0139"+
		"\u013a\5(\25\2\u013a\u013b\7\21\2\2\u013b\u013c\5(\25\2\u013c\u0146\3"+
		"\2\2\2\u013d\u013e\5(\25\2\u013e\u013f\t\5\2\2\u013f\u0140\5(\25\2\u0140"+
		"\u0146\3\2\2\2\u0141\u0146\7\30\2\2\u0142\u0146\7\27\2\2\u0143\u0146\5"+
		"\62\32\2\u0144\u0146\7\20\2\2\u0145\u0132\3\2\2\2\u0145\u0135\3\2\2\2"+
		"\u0145\u0139\3\2\2\2\u0145\u013d\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0142"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u014c\3\2\2\2\u0147"+
		"\u0148\f\7\2\2\u0148\u0149\7$\2\2\u0149\u014b\5*\26\b\u014a\u0147\3\2"+
		"\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"+\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\b\27\1\2\u0150\u0151\7 \2\2"+
		"\u0151\u016a\5,\27\13\u0152\u0153\7\33\2\2\u0153\u0154\5,\27\2\u0154\u0155"+
		"\7\34\2\2\u0155\u016a\3\2\2\2\u0156\u0157\5(\25\2\u0157\u0158\7\24\2\2"+
		"\u0158\u0159\5(\25\2\u0159\u016a\3\2\2\2\u015a\u015b\5*\26\2\u015b\u015c"+
		"\7\24\2\2\u015c\u015d\5*\26\2\u015d\u016a\3\2\2\2\u015e\u015f\5(\25\2"+
		"\u015f\u0160\7\24\2\2\u0160\u0161\5*\26\2\u0161\u016a\3\2\2\2\u0162\u0163"+
		"\5*\26\2\u0163\u0164\7\24\2\2\u0164\u0165\5(\25\2\u0165\u016a\3\2\2\2"+
		"\u0166\u016a\7\17\2\2\u0167\u016a\5\62\32\2\u0168\u016a\7\20\2\2\u0169"+
		"\u014f\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0156\3\2\2\2\u0169\u015a\3\2"+
		"\2\2\u0169\u015e\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0166\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u0170\3\2\2\2\u016b\u016c\f\n"+
		"\2\2\u016c\u016d\7\25\2\2\u016d\u016f\5,\27\13\u016e\u016b\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171-\3\2\2\2"+
		"\u0172\u0170\3\2\2\2\u0173\u0177\7\26\2\2\u0174\u0177\5\62\32\2\u0175"+
		"\u0177\7\20\2\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3"+
		"\2\2\2\u0177/\3\2\2\2\u0178\u0179\t\6\2\2\u0179\61\3\2\2\2\u017a\u017b"+
		"\7\20\2\2\u017b\u017c\5\64\33\2\u017c\63\3\2\2\2\u017d\u017e\7\35\2\2"+
		"\u017e\u017f\5(\25\2\u017f\u0180\7\36\2\2\u0180\65\3\2\2\2\'9@Eafkoty"+
		"\177\u0085\u0089\u0090\u0096\u009a\u009d\u00a3\u00ae\u00c0\u00c5\u00d3"+
		"\u00db\u00e1\u00e9\u00f4\u00ff\u0107\u010b\u0113\u0122\u012d\u012f\u0145"+
		"\u014c\u0169\u0170\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}