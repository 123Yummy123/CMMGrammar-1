// Generated from D:/Source_File/For_InteliJ/CMMGrammar/G4\CMM_BXJ.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMM_BXJLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T_INT", "T_DOUBLE", "T_CHAR", "T_BOOL", "IF", "ELSE", "ELSEIF", "WHILE", 
		"BREAK", "CONTINUE", "READ", "WRITE", "BOOL", "ID", "NUM_OP", "PLUS", 
		"MINUS", "COMPARE_OP", "BOOL_OP", "CHAR", "DOUBLE", "INT", "LEFT_CURLY", 
		"RIGHT_CURLY", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"EQUAL", "LOGIC_NOT", "COMMA", "SEMICOLON", "PP", "MM", "QUOTE", "ESCAPED_QUOTE", 
		"LETTER", "DECIMAL", "HEXADECIMAL", "MULTI_COMMENT", "SINGL_COMMENT", 
		"WS", "NO_ENTER"
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


	public CMM_BXJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMM_BXJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u014c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a8\n\16"+
		"\3\17\3\17\3\17\7\17\u00ad\n\17\f\17\16\17\u00b0\13\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00b6\n\17\f\17\16\17\u00b9\13\17\3\17\3\17\5\17\u00bd\n\17"+
		"\5\17\u00bf\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00d0\n\23\3\24\3\24\3\24\3\24\5\24\u00d6\n"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00df\n\26\f\26\16\26\u00e2"+
		"\13\26\3\27\3\27\5\27\u00e6\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\7\'\u010c\n\'\f\'\16\'\u010f"+
		"\13\'\5\'\u0111\n\'\3(\3(\3(\3(\6(\u0117\n(\r(\16(\u0118\3(\3(\3(\3(\6"+
		"(\u011f\n(\r(\16(\u0120\5(\u0123\n(\3)\3)\3)\3)\7)\u0129\n)\f)\16)\u012c"+
		"\13)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u0137\n*\f*\16*\u013a\13*\3*\5*\u013d"+
		"\n*\3*\5*\u0140\n*\3*\3*\3+\6+\u0145\n+\r+\16+\u0146\3+\3+\3,\3,\3\u012a"+
		"\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\2M\2O\2Q\'S(U)W*\3\2\r\3\2\62;\6\2\'\',,\61\61^^"+
		"\4\2>>@@\4\2\f\f\17\17\4\2C\\c|\3\2\63;\4\2\62;ch\4\2\62;CH\3\2\17\17"+
		"\3\3\f\f\5\2\13\f\17\17\"\"\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5]\3\2\2\2\7d\3\2\2\2\ti\3\2\2\2\13n\3"+
		"\2\2\2\rq\3\2\2\2\17v\3\2\2\2\21~\3\2\2\2\23\u0084\3\2\2\2\25\u008a\3"+
		"\2\2\2\27\u0093\3\2\2\2\31\u0098\3\2\2\2\33\u00a7\3\2\2\2\35\u00be\3\2"+
		"\2\2\37\u00c0\3\2\2\2!\u00c2\3\2\2\2#\u00c4\3\2\2\2%\u00cf\3\2\2\2\'\u00d5"+
		"\3\2\2\2)\u00d7\3\2\2\2+\u00db\3\2\2\2-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61"+
		"\u00e9\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C"+
		"\u00fb\3\2\2\2E\u00fe\3\2\2\2G\u0101\3\2\2\2I\u0103\3\2\2\2K\u0106\3\2"+
		"\2\2M\u0110\3\2\2\2O\u0122\3\2\2\2Q\u0124\3\2\2\2S\u0132\3\2\2\2U\u0144"+
		"\3\2\2\2W\u014a\3\2\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\\4\3\2\2\2]^\7f\2"+
		"\2^_\7q\2\2_`\7w\2\2`a\7d\2\2ab\7n\2\2bc\7g\2\2c\6\3\2\2\2de\7e\2\2ef"+
		"\7j\2\2fg\7c\2\2gh\7t\2\2h\b\3\2\2\2ij\7d\2\2jk\7q\2\2kl\7q\2\2lm\7n\2"+
		"\2m\n\3\2\2\2no\7k\2\2op\7h\2\2p\f\3\2\2\2qr\7g\2\2rs\7n\2\2st\7u\2\2"+
		"tu\7g\2\2u\16\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z{\7\"\2\2{|"+
		"\7k\2\2|}\7h\2\2}\20\3\2\2\2~\177\7y\2\2\177\u0080\7j\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\22\3\2\2\2\u0084\u0085"+
		"\7d\2\2\u0085\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7m\2\2\u0089\24\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2"+
		"\u0090\u0091\7w\2\2\u0091\u0092\7g\2\2\u0092\26\3\2\2\2\u0093\u0094\7"+
		"t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097\7f\2\2\u0097\30"+
		"\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d\32\3\2\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a8\7g\2\2\u00a2\u00a3\7h\2\2"+
		"\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a8"+
		"\7g\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\34\3\2\2\2\u00a9"+
		"\u00ae\5K&\2\u00aa\u00ad\5K&\2\u00ab\u00ad\t\2\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00bf\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b7\5K&\2\u00b2"+
		"\u00b6\7a\2\2\u00b3\u00b6\5K&\2\u00b4\u00b6\t\2\2\2\u00b5\u00b2\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bd\5K&\2\u00bb\u00bd\t\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2"+
		"\2\u00bd\u00bf\3\2\2\2\u00be\u00a9\3\2\2\2\u00be\u00b1\3\2\2\2\u00bf\36"+
		"\3\2\2\2\u00c0\u00c1\t\3\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7-\2\2\u00c3\""+
		"\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5$\3\2\2\2\u00c6\u00d0\t\4\2\2\u00c7\u00c8"+
		"\7>\2\2\u00c8\u00d0\7?\2\2\u00c9\u00ca\7@\2\2\u00ca\u00d0\7?\2\2\u00cb"+
		"\u00cc\7#\2\2\u00cc\u00d0\7?\2\2\u00cd\u00ce\7?\2\2\u00ce\u00d0\7?\2\2"+
		"\u00cf\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0&\3\2\2\2\u00d1\u00d2\7(\2\2\u00d2\u00d6"+
		"\7(\2\2\u00d3\u00d4\7~\2\2\u00d4\u00d6\7~\2\2\u00d5\u00d1\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7)\2\2\u00d8\u00d9\n\5\2\2\u00d9"+
		"\u00da\7)\2\2\u00da*\3\2\2\2\u00db\u00dc\5M\'\2\u00dc\u00e0\7\60\2\2\u00dd"+
		"\u00df\t\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1,\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6"+
		"\5M\'\2\u00e4\u00e6\5O(\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		".\3\2\2\2\u00e7\u00e8\7}\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7\177\2\2\u00ea"+
		"\62\3\2\2\2\u00eb\u00ec\7*\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee"+
		"\66\3\2\2\2\u00ef\u00f0\7]\2\2\u00f08\3\2\2\2\u00f1\u00f2\7_\2\2\u00f2"+
		":\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6>"+
		"\3\2\2\2\u00f7\u00f8\7.\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7=\2\2\u00faB\3"+
		"\2\2\2\u00fb\u00fc\7-\2\2\u00fc\u00fd\7-\2\2\u00fdD\3\2\2\2\u00fe\u00ff"+
		"\7/\2\2\u00ff\u0100\7/\2\2\u0100F\3\2\2\2\u0101\u0102\7$\2\2\u0102H\3"+
		"\2\2\2\u0103\u0104\7^\2\2\u0104\u0105\7$\2\2\u0105J\3\2\2\2\u0106\u0107"+
		"\t\6\2\2\u0107L\3\2\2\2\u0108\u0111\7\62\2\2\u0109\u010d\t\7\2\2\u010a"+
		"\u010c\t\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0108\3\2\2\2\u0110\u0109\3\2\2\2\u0111N\3\2\2\2\u0112\u0113\7\62\2\2"+
		"\u0113\u0114\7z\2\2\u0114\u0116\3\2\2\2\u0115\u0117\t\b\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u0123\3\2\2\2\u011a\u011b\7\62\2\2\u011b\u011c\7Z\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u011f\t\t\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0112\3\2"+
		"\2\2\u0122\u011a\3\2\2\2\u0123P\3\2\2\2\u0124\u0125\7\61\2\2\u0125\u0126"+
		"\7,\2\2\u0126\u012a\3\2\2\2\u0127\u0129\13\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7,\2\2\u012e\u012f\7\61\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\b)\2\2\u0131R\3\2\2\2\u0132\u0133\7\61\2\2"+
		"\u0133\u0134\7\61\2\2\u0134\u0138\3\2\2\2\u0135\u0137\n\5\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\t\n\2\2\u013c\u013b\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140\t\13\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b*\2\2\u0142T\3\2\2\2\u0143"+
		"\u0145\t\f\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b+\2\2\u0149"+
		"V\3\2\2\2\u014a\u014b\n\5\2\2\u014bX\3\2\2\2\32\2\u00a7\u00ac\u00ae\u00b5"+
		"\u00b7\u00bc\u00be\u00cf\u00d5\u00e0\u00e5\u010d\u0110\u0116\u0118\u011e"+
		"\u0120\u0122\u012a\u0138\u013c\u013f\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}