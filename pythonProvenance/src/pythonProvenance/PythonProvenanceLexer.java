// $ANTLR 3.4 D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g 2012-11-19 16:42:34

  package pythonProvenance;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PythonProvenanceLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__147=147;
    public static final int ALT_NOTEQUAL=4;
    public static final int AMPER=5;
    public static final int AMPEREQUAL=6;
    public static final int AND=7;
    public static final int ARGUMENTS=8;
    public static final int AS=9;
    public static final int ASSIGN=10;
    public static final int ASSIGN_CMD=11;
    public static final int AT=12;
    public static final int BACKQUOTE=13;
    public static final int CIRCUMFLEX=14;
    public static final int CIRCUMFLEXEQUAL=15;
    public static final int CLASSVARIABLE_CMD=16;
    public static final int CLASS_CMD=17;
    public static final int COLON=18;
    public static final int COMMA=19;
    public static final int COMMENT=20;
    public static final int COMPLEX=21;
    public static final int CONTINUED_LINE=22;
    public static final int DEDENT=23;
    public static final int DICTIONARY_CMD=24;
    public static final int DICTMAKER_CMD=25;
    public static final int DICT_ARGS=26;
    public static final int DIGITS=27;
    public static final int DOT=28;
    public static final int DOTTED_NAME=29;
    public static final int DOUBLESLASH=30;
    public static final int DOUBLESLASHEQUAL=31;
    public static final int DOUBLESTAR=32;
    public static final int DOUBLESTAREQUAL=33;
    public static final int DOUBLE_TYPE=34;
    public static final int ELIF_CLAUSES=35;
    public static final int ELIF_CMD=36;
    public static final int ELSE_CMD=37;
    public static final int EQUAL=38;
    public static final int ESC=39;
    public static final int EXCEPT_CMD=40;
    public static final int EXPRESSION=41;
    public static final int Exponent=42;
    public static final int FINALLY_CMD=43;
    public static final int FLOAT=44;
    public static final int FORLOOP_CMD=45;
    public static final int GREATER=46;
    public static final int GREATEREQUAL=47;
    public static final int IF=48;
    public static final int IFBLOCK=49;
    public static final int IF_CMD=50;
    public static final int IMPORT_ARGS=51;
    public static final int IMPORT_CMD=52;
    public static final int IMPORT_EQUIV=53;
    public static final int IN=54;
    public static final int INDENT=55;
    public static final int INNER_BRANCH=56;
    public static final int INT=57;
    public static final int INT_TYPE=58;
    public static final int IS=59;
    public static final int ISNOT=60;
    public static final int LBRACK=61;
    public static final int LCURLY=62;
    public static final int LEADING_WS=63;
    public static final int LEFTSHIFT=64;
    public static final int LEFTSHIFTEQUAL=65;
    public static final int LESS=66;
    public static final int LESSEQUAL=67;
    public static final int LISTCOMPREHENSION_CMD=68;
    public static final int LISTCONDITION_CMD=69;
    public static final int LISTLOOPCONTROL_CMD=70;
    public static final int LISTMAKER_CMD=71;
    public static final int LIST_ARGS=72;
    public static final int LONGINT=73;
    public static final int LONG_TYPE=74;
    public static final int LPAREN=75;
    public static final int MINUS=76;
    public static final int MINUSEQUAL=77;
    public static final int NAME=78;
    public static final int NEWLINE=79;
    public static final int NOT=80;
    public static final int NOTEQUAL=81;
    public static final int NOTIN=82;
    public static final int NO_ARGS=83;
    public static final int OR=84;
    public static final int OUTER_FUNCTION_ARGS=85;
    public static final int OUTER_FUNCTION_CMD=86;
    public static final int PERCENT=87;
    public static final int PERCENTEQUAL=88;
    public static final int PLUS=89;
    public static final int PLUSEQUAL=90;
    public static final int PRINT=91;
    public static final int PRINT_ARGS=92;
    public static final int PRINT_CMD=93;
    public static final int RBRACK=94;
    public static final int RCURLY=95;
    public static final int RETURN_CMD=96;
    public static final int RIGHTSHIFT=97;
    public static final int RIGHTSHIFTEQUAL=98;
    public static final int RPAREN=99;
    public static final int SEMI=100;
    public static final int SLASH=101;
    public static final int SLASHEQUAL=102;
    public static final int STAR=103;
    public static final int STAREQUAL=104;
    public static final int STRING=105;
    public static final int STRING_TYPE=106;
    public static final int SUBSCRIPTLIST=107;
    public static final int SUBSCRIPTLISTS=108;
    public static final int SUBSCRIPTS=109;
    public static final int TILDE=110;
    public static final int TRAILER=111;
    public static final int TRIAPOS=112;
    public static final int TRIQUOTE=113;
    public static final int TRYBLOCK=114;
    public static final int TRY_CMD=115;
    public static final int UNARY_EXPRESSION=116;
    public static final int VALUETYPE=117;
    public static final int VARIABLE_CMD=118;
    public static final int VBAR=119;
    public static final int VBAREQUAL=120;
    public static final int WHILEBLOCK=121;
    public static final int WHILE_CMD=122;
    public static final int WITH_ARGS=123;
    public static final int WITH_CMD=124;
    public static final int WITH_EQUIV=125;
    public static final int WS=126;

    /** Handles context-sensitive lexing of implicit line joining such as
     *  the case where newline is ignored in cases like this:
     *  a = [3,
     *       4]
     */
    int implicitLineJoiningLevel = 0;
    int startPos=-1;
    int[] IndentStack = new int[100];
    int sp = 0;
    int count = 0;

    /**  Emitting multiple tokens ***/
    // Queue to hold additional tokens
    public java.util.Queue<Token> tokenQueue = new java.util.LinkedList<Token>();

    // Include queue in reset().
    public void reset() {
    	super.reset();
            tokenQueue.clear();
    	}

    // Queued tokens are returned before matching a new token.
    public Token nextToken() {
            if (tokenQueue.peek() != null)
                return tokenQueue.poll();
            return super.nextToken();
            }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PythonProvenanceLexer() {} 
    public PythonProvenanceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PythonProvenanceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g"; }

    // $ANTLR start "DEDENT"
    public final void mDEDENT() throws RecognitionException {
        try {
            int _type = DEDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:35:8: ( '<<<' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:35:10: '<<<'
            {
            match("<<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEDENT"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:36:8: ( '>>>' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:36:10: '>>>'
            {
            match(">>>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDENT"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:37:8: ( 'assert' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:37:10: 'assert'
            {
            match("assert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:38:8: ( 'break' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:38:10: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:39:8: ( 'class' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:39:10: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:40:8: ( 'continue' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:40:10: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:41:8: ( 'def' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:41:10: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:42:8: ( 'del' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:42:10: 'del'
            {
            match("del"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:43:8: ( 'elif' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:43:10: 'elif'
            {
            match("elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:44:8: ( 'else' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:44:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:45:8: ( 'except' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:45:10: 'except'
            {
            match("except"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:46:8: ( 'exec' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:46:10: 'exec'
            {
            match("exec"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:47:8: ( 'finally' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:47:10: 'finally'
            {
            match("finally"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:48:8: ( 'for' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:48:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:49:8: ( 'from' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:49:10: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:50:8: ( 'global' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:50:10: 'global'
            {
            match("global"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:51:8: ( 'import' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:51:10: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:52:8: ( 'pass' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:52:10: 'pass'
            {
            match("pass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:53:8: ( 'raise' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:53:10: 'raise'
            {
            match("raise"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:54:8: ( 'return' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:54:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:55:8: ( 'try' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:55:10: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:56:8: ( 'while' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:56:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:57:8: ( 'with' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:57:10: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:530:11: ( '(' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:530:13: '('
            {
            match('('); 

            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:532:11: ( ')' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:532:13: ')'
            {
            match(')'); 

            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:534:11: ( '[' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:534:13: '['
            {
            match('['); 

            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:536:11: ( ']' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:536:13: ']'
            {
            match(']'); 

            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:538:11: ( ':' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:538:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:540:10: ( ',' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:540:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:542:9: ( ';' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:542:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:544:5: ( '.' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:544:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:546:9: ( '+' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:546:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:548:10: ( '-' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:548:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:550:9: ( '*' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:550:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:552:10: ( '/' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:552:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "VBAR"
    public final void mVBAR() throws RecognitionException {
        try {
            int _type = VBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:554:9: ( '|' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:554:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VBAR"

    // $ANTLR start "AMPER"
    public final void mAMPER() throws RecognitionException {
        try {
            int _type = AMPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:556:10: ( '&' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:556:12: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:558:9: ( '<' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:558:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:560:12: ( '>' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:560:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:562:11: ( '=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:562:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:564:12: ( '%' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:564:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "BACKQUOTE"
    public final void mBACKQUOTE() throws RecognitionException {
        try {
            int _type = BACKQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:566:14: ( '`' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:566:16: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACKQUOTE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:568:11: ( '{' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:568:13: '{'
            {
            match('{'); 

            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:570:11: ( '}' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:570:13: '}'
            {
            match('}'); 

            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "CIRCUMFLEX"
    public final void mCIRCUMFLEX() throws RecognitionException {
        try {
            int _type = CIRCUMFLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:572:15: ( '^' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:572:17: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCUMFLEX"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:574:10: ( '~' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:574:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:576:10: ( '==' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:576:12: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:578:13: ( '!=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:578:15: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "ALT_NOTEQUAL"
    public final void mALT_NOTEQUAL() throws RecognitionException {
        try {
            int _type = ALT_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:580:13: ( '<>' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:580:15: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALT_NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:582:14: ( '<=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:582:16: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "LEFTSHIFT"
    public final void mLEFTSHIFT() throws RecognitionException {
        try {
            int _type = LEFTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:584:14: ( '<<' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:584:16: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTSHIFT"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:586:17: ( '>=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:586:19: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "RIGHTSHIFT"
    public final void mRIGHTSHIFT() throws RecognitionException {
        try {
            int _type = RIGHTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:588:15: ( '>>' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:588:17: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTSHIFT"

    // $ANTLR start "PLUSEQUAL"
    public final void mPLUSEQUAL() throws RecognitionException {
        try {
            int _type = PLUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:590:14: ( '+=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:590:16: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSEQUAL"

    // $ANTLR start "MINUSEQUAL"
    public final void mMINUSEQUAL() throws RecognitionException {
        try {
            int _type = MINUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:592:15: ( '-=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:592:17: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUSEQUAL"

    // $ANTLR start "DOUBLESTAR"
    public final void mDOUBLESTAR() throws RecognitionException {
        try {
            int _type = DOUBLESTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:594:15: ( '**' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:594:17: '**'
            {
            match("**"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLESTAR"

    // $ANTLR start "STAREQUAL"
    public final void mSTAREQUAL() throws RecognitionException {
        try {
            int _type = STAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:596:14: ( '*=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:596:16: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAREQUAL"

    // $ANTLR start "DOUBLESLASH"
    public final void mDOUBLESLASH() throws RecognitionException {
        try {
            int _type = DOUBLESLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:598:16: ( '//' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:598:18: '//'
            {
            match("//"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLESLASH"

    // $ANTLR start "SLASHEQUAL"
    public final void mSLASHEQUAL() throws RecognitionException {
        try {
            int _type = SLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:600:15: ( '/=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:600:17: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASHEQUAL"

    // $ANTLR start "VBAREQUAL"
    public final void mVBAREQUAL() throws RecognitionException {
        try {
            int _type = VBAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:602:14: ( '|=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:602:16: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VBAREQUAL"

    // $ANTLR start "PERCENTEQUAL"
    public final void mPERCENTEQUAL() throws RecognitionException {
        try {
            int _type = PERCENTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:604:17: ( '%=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:604:19: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENTEQUAL"

    // $ANTLR start "AMPEREQUAL"
    public final void mAMPEREQUAL() throws RecognitionException {
        try {
            int _type = AMPEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:606:15: ( '&=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:606:17: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPEREQUAL"

    // $ANTLR start "CIRCUMFLEXEQUAL"
    public final void mCIRCUMFLEXEQUAL() throws RecognitionException {
        try {
            int _type = CIRCUMFLEXEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:608:20: ( '^=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:608:22: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCUMFLEXEQUAL"

    // $ANTLR start "LEFTSHIFTEQUAL"
    public final void mLEFTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = LEFTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:610:19: ( '<<=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:610:21: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTSHIFTEQUAL"

    // $ANTLR start "RIGHTSHIFTEQUAL"
    public final void mRIGHTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = RIGHTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:612:20: ( '>>=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:612:22: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTSHIFTEQUAL"

    // $ANTLR start "DOUBLESTAREQUAL"
    public final void mDOUBLESTAREQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESTAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:614:20: ( '**=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:614:22: '**='
            {
            match("**="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLESTAREQUAL"

    // $ANTLR start "DOUBLESLASHEQUAL"
    public final void mDOUBLESLASHEQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:616:21: ( '//=' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:616:23: '//='
            {
            match("//="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLESLASHEQUAL"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:618:4: ( '@' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:618:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:620:5: ( 'and' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:620:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:622:4: ( 'or' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:622:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:624:5: ( 'not' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:624:7: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:626:5: ( 'in' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:626:7: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "NOTIN"
    public final void mNOTIN() throws RecognitionException {
        try {
            int _type = NOTIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:628:7: ( 'not in' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:628:9: 'not in'
            {
            match("not in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTIN"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:630:5: ( 'is' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:630:7: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "ISNOT"
    public final void mISNOT() throws RecognitionException {
        try {
            int _type = ISNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:632:7: ( 'is not' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:632:9: 'is not'
            {
            match("is not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISNOT"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:634:8: ( 'print' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:634:10: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:636:5: ( 'as' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:636:8: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:638:4: ( 'if' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:638:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:641:5: ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:641:9: '.' DIGITS ( Exponent )?
                    {
                    match('.'); 

                    mDIGITS(); 


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:641:20: ( Exponent )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='E'||LA1_0=='e') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:641:21: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:642:9: DIGITS '.' Exponent
                    {
                    mDIGITS(); 


                    match('.'); 

                    mExponent(); 


                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:9: DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    {
                    mDIGITS(); 


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:16: ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    else if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:17: '.' ( DIGITS ( Exponent )? )?
                            {
                            match('.'); 

                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:21: ( DIGITS ( Exponent )? )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:22: DIGITS ( Exponent )?
                                    {
                                    mDIGITS(); 


                                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:29: ( Exponent )?
                                    int alt2=2;
                                    int LA2_0 = input.LA(1);

                                    if ( (LA2_0=='E'||LA2_0=='e') ) {
                                        alt2=1;
                                    }
                                    switch (alt2) {
                                        case 1 :
                                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:30: Exponent
                                            {
                                            mExponent(); 


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:643:45: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "LONGINT"
    public final void mLONGINT() throws RecognitionException {
        try {
            int _type = LONGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:647:5: ( INT ( 'l' | 'L' ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:647:9: INT ( 'l' | 'L' )
            {
            mINT(); 


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONGINT"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:653:5: ( ( 'e' | 'E' ) ( '+' | '-' )? DIGITS )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:653:10: ( 'e' | 'E' ) ( '+' | '-' )? DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:653:22: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mDIGITS(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:655:5: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ | '0' ( DIGITS )* | '1' .. '9' ( DIGITS )* )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='X'||LA10_1=='x') ) {
                    alt10=1;
                }
                else {
                    alt10=2;
                }
            }
            else if ( ((LA10_0 >= '1' && LA10_0 <= '9')) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:656:10: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('0'); 

                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:656:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'F')||(LA7_0 >= 'a' && LA7_0 <= 'f')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:658:10: '0' ( DIGITS )*
                    {
                    match('0'); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:658:14: ( DIGITS )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:658:14: DIGITS
                    	    {
                    	    mDIGITS(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:659:10: '1' .. '9' ( DIGITS )*
                    {
                    matchRange('1','9'); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:659:19: ( DIGITS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:659:19: DIGITS
                    	    {
                    	    mDIGITS(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMPLEX"
    public final void mCOMPLEX() throws RecognitionException {
        try {
            int _type = COMPLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:663:5: ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:663:9: INT ( 'j' | 'J' )
                    {
                    mINT(); 


                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:664:9: FLOAT ( 'j' | 'J' )
                    {
                    mFLOAT(); 


                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPLEX"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:669:8: ( ( '0' .. '9' )+ )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:669:10: ( '0' .. '9' )+
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:669:10: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "DOTTED_NAME"
    public final void mDOTTED_NAME() throws RecognitionException {
        try {
            int _type = DOTTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:672:2: ( NAME ( DOT NAME )+ | STRING DOT NAME )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 'r':
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='.'||(LA14_1 >= '0' && LA14_1 <= '9')||(LA14_1 >= 'A' && LA14_1 <= 'Z')||LA14_1=='_'||(LA14_1 >= 'a' && LA14_1 <= 'z')) ) {
                    alt14=1;
                }
                else if ( (LA14_1=='\"'||LA14_1=='\'') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'u':
                {
                switch ( input.LA(2) ) {
                case 'r':
                    {
                    int LA14_5 = input.LA(3);

                    if ( (LA14_5=='\"'||LA14_5=='\'') ) {
                        alt14=2;
                    }
                    else if ( (LA14_5=='.'||(LA14_5 >= '0' && LA14_5 <= '9')||(LA14_5 >= 'A' && LA14_5 <= 'Z')||LA14_5=='_'||(LA14_5 >= 'a' && LA14_5 <= 'z')) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case '.':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt14=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt14=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }

                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt14=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:672:5: NAME ( DOT NAME )+
                    {
                    mNAME(); 


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:672:10: ( DOT NAME )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='.') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:672:11: DOT NAME
                    	    {
                    	    mDOT(); 


                    	    mNAME(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:673:5: STRING DOT NAME
                    {
                    mSTRING(); 


                    mDOT(); 


                    mNAME(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTTED_NAME"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:677:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:677:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:678:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'Z')||LA15_0=='_'||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:688:5: ( ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC |~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:688:9: ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC |~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:688:9: ( 'r' | 'u' | 'ur' )?
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='r') ) {
                alt16=1;
            }
            else if ( (LA16_0=='u') ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2=='r') ) {
                    alt16=3;
                }
                else if ( (LA16_2=='\"'||LA16_2=='\'') ) {
                    alt16=2;
                }
            }
            switch (alt16) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:688:10: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:688:14: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:688:18: 'ur'
                    {
                    match("ur"); 



                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:691:9: ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC |~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\'') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='\'') ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3=='\'') ) {
                        alt21=1;
                    }
                    else {
                        alt21=4;
                    }
                }
                else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '\t')||(LA21_1 >= '\u000B' && LA21_1 <= '&')||(LA21_1 >= '(' && LA21_1 <= '\uFFFF')) ) {
                    alt21=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA21_0=='\"') ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2=='\"') ) {
                    int LA21_5 = input.LA(3);

                    if ( (LA21_5=='\"') ) {
                        alt21=2;
                    }
                    else {
                        alt21=3;
                    }
                }
                else if ( ((LA21_2 >= '\u0000' && LA21_2 <= '\t')||(LA21_2 >= '\u000B' && LA21_2 <= '!')||(LA21_2 >= '#' && LA21_2 <= '\uFFFF')) ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:691:11: '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\''
                    {
                    match("'''"); 



                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:691:20: ( options {greedy=false; } : TRIAPOS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\'') ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1=='\'') ) {
                                int LA17_3 = input.LA(3);

                                if ( (LA17_3=='\'') ) {
                                    alt17=2;
                                }
                                else if ( ((LA17_3 >= '\u0000' && LA17_3 <= '&')||(LA17_3 >= '(' && LA17_3 <= '\uFFFF')) ) {
                                    alt17=1;
                                }


                            }
                            else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '&')||(LA17_1 >= '(' && LA17_1 <= '\uFFFF')) ) {
                                alt17=1;
                            }


                        }
                        else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:691:45: TRIAPOS
                    	    {
                    	    mTRIAPOS(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    match("'''"); 



                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:692:7: '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"'
                    {
                    match("\"\"\""); 



                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:692:13: ( options {greedy=false; } : TRIQUOTE )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\"') ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1=='\"') ) {
                                int LA18_3 = input.LA(3);

                                if ( (LA18_3=='\"') ) {
                                    alt18=2;
                                }
                                else if ( ((LA18_3 >= '\u0000' && LA18_3 <= '!')||(LA18_3 >= '#' && LA18_3 <= '\uFFFF')) ) {
                                    alt18=1;
                                }


                            }
                            else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '!')||(LA18_1 >= '#' && LA18_1 <= '\uFFFF')) ) {
                                alt18=1;
                            }


                        }
                        else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '\uFFFF')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:692:38: TRIQUOTE
                    	    {
                    	    mTRIQUOTE(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    match("\"\"\""); 



                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:693:9: '\"' ( ESC |~ ( '\\\\' | '\\n' | '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:693:13: ( ESC |~ ( '\\\\' | '\\n' | '\"' ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '!')||(LA19_0 >= '#' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:693:14: ESC
                    	    {
                    	    mESC(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:693:18: ~ ( '\\\\' | '\\n' | '\"' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:694:14: '\\'' ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:694:19: ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '&')||(LA20_0 >= '(' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:694:20: ESC
                    	    {
                    	    mESC(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:694:24: ~ ( '\\\\' | '\\n' | '\\'' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "TRIQUOTE"
    public final void mTRIQUOTE() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:5: ( ( '\"' )? ( '\"' )? ( ESC |~ ( '\\\\' | '\"' ) )+ )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:7: ( '\"' )? ( '\"' )? ( ESC |~ ( '\\\\' | '\"' ) )+
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:7: ( '\"' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\"') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:7: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:12: ( '\"' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\"') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:12: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:17: ( ESC |~ ( '\\\\' | '\"' ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    alt24=1;
                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '!')||(LA24_0 >= '#' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:18: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:700:22: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRIQUOTE"

    // $ANTLR start "TRIAPOS"
    public final void mTRIAPOS() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:5: ( ( '\\'' )? ( '\\'' )? ( ESC |~ ( '\\\\' | '\\'' ) )+ )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:7: ( '\\'' )? ( '\\'' )? ( ESC |~ ( '\\\\' | '\\'' ) )+
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:7: ( '\\'' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\'') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:7: '\\''
                    {
                    match('\''); 

                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:13: ( '\\'' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\'') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:13: '\\''
                    {
                    match('\''); 

                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:19: ( ESC |~ ( '\\\\' | '\\'' ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\\') ) {
                    alt27=1;
                }
                else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '&')||(LA27_0 >= '(' && LA27_0 <= '[')||(LA27_0 >= ']' && LA27_0 <= '\uFFFF')) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:20: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:706:24: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRIAPOS"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:710:5: ( '\\\\' . )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:710:10: '\\\\' .
            {
            match('\\'); 

            matchAny(); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "CONTINUED_LINE"
    public final void mCONTINUED_LINE() throws RecognitionException {
        try {
            int _type = CONTINUED_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken nl=null;

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:721:5: ( '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl= NEWLINE |) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:721:10: '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl= NEWLINE |)
            {
            match('\\'); 

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:721:15: ( '\\r' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:721:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:721:28: ( ' ' | '\\t' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='\t') ) {
                    alt29=1;
                }
                else if ( (LA29_0==' ') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


             _channel=HIDDEN; 

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:722:10: (nl= NEWLINE |)
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0 >= '\t' && LA30_0 <= '\n')||(LA30_0 >= '\f' && LA30_0 <= '\r')||LA30_0==' ') ) {
                alt30=1;
            }
            else {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:722:12: nl= NEWLINE
                    {
                    int nlStart1468 = getCharIndex();
                    int nlStartLine1468 = getLine();
                    int nlStartCharPos1468 = getCharPositionInLine();
                    mNEWLINE(); 
                    nl = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nlStart1468, getCharIndex()-1);
                    nl.setLine(nlStartLine1468);
                    nl.setCharPositionInLine(nlStartCharPos1468);


                    emit(new ClassicToken(NEWLINE,nl.getText()));

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:724:10: 
                    {
                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUED_LINE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int leading_space;


                int spaces = 0;
                count = 0;
                //int leading_space = 0;

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:5: ( ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) (leading_space= ( ' ' | '\\t' ) )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:9: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) (leading_space= ( ' ' | '\\t' ) )*
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:9: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )*
            loop33:
            do {
                int alt33=4;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:10: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
            	    {
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:10: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:11: ( '\\u000C' )? ( '\\r' )? '\\n'
            	    {
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:11: ( '\\u000C' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0=='\f') ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:12: '\\u000C'
            	            {
            	            match('\f'); 

            	            }
            	            break;

            	    }


            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:22: ( '\\r' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0=='\r') ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:23: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:39: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:46: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:53: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:54: ( '\\u000C' )? ( '\\r' )? '\\n'
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:54: ( '\\u000C' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\f') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:55: '\\u000C'
                    {
                    match('\f'); 

                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:65: ( '\\r' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\r') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:759:66: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:760:19: (leading_space= ( ' ' | '\\t' ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0=='\t'||LA37_0==' ') ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:760:19: leading_space= ( ' ' | '\\t' )
            	    {
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:760:21: ( ' ' | '\\t' )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==' ') ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0=='\t') ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:760:22: ' '
            	            {
            	            match(' '); 

            	             spaces++; 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:760:43: '\\t'
            	            {
            	            match('\t'); 

            	             spaces += 8; spaces -= (spaces % 8); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);



                  if ( startPos==0 || implicitLineJoiningLevel>0 )
                    _channel=HIDDEN;
                    

                  else if (implicitLineJoiningLevel==0)
                  {
                    if ( spaces > IndentStack[sp] ) {
                      //System.out.println("Indent: " + spaces + " "+ sp);
                      sp = sp+1;
                      IndentStack[sp] = spaces;
                      //System.out.println("Indent Insert: " + spaces + " "+ sp);
                      emit(new ClassicToken(INDENT,">>>"));

                    }
                    else
                    {
                      while (spaces < IndentStack[sp]) {
                        count++;
                        //System.out.println("Dedent: " + spaces + " " + sp);
                        sp = sp - 1;
                        //System.out.println("Dedent Insert: " + spaces + " "+ sp);
                        tokenQueue.add(new ClassicToken(DEDENT,"<<<"));
                        //emit(new ClassicToken(DEDENT,"<<<"));
                      }
                      //System.out.println("Count: " + count);
                    }

                  }

                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:779:5: ({...}? => ( ' ' | '\\t' | '\\u000C' )+ )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:779:10: {...}? => ( ' ' | '\\t' | '\\u000C' )+
            {
            if ( !((startPos>0)) ) {
                throw new FailedPredicateException(input, "WS", "startPos>0");
            }

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:779:26: ( ' ' | '\\t' | '\\u000C' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0=='\t'||LA38_0=='\f'||LA38_0==' ') ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LEADING_WS"
    public final void mLEADING_WS() throws RecognitionException {
        try {
            int _type = LEADING_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                int spaces = 0;

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:798:5: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:798:9: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ )
            {
            if ( !((startPos==0)) ) {
                throw new FailedPredicateException(input, "LEADING_WS", "startPos==0");
            }

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:799:9: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==' ') ) {
                int LA41_1 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA41_0=='\t') ) {
                int LA41_2 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:799:13: {...}? ( ' ' | '\\t' )+
                    {
                    if ( !((implicitLineJoiningLevel>0)) ) {
                        throw new FailedPredicateException(input, "LEADING_WS", "implicitLineJoiningLevel>0");
                    }

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:799:43: ( ' ' | '\\t' )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='\t'||LA39_0==' ') ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:800:17: ( ' ' | '\\t' )+
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:800:17: ( ' ' | '\\t' )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==' ') ) {
                            alt40=1;
                        }
                        else if ( (LA40_0=='\t') ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:800:23: ' '
                    	    {
                    	    match(' '); 

                    	     spaces++; 

                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:801:18: '\\t'
                    	    {
                    	    match('\t'); 

                    	     spaces += 8; spaces -= (spaces % 8); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);



                                // make a string of n spaces where n is column number - 1
                                char[] indentation = new char[spaces];
                                for (int i=0; i<spaces; i++) {
                                    indentation[i] = ' ';
                                }
                                String s = new String(indentation);
                                emit(new ClassicToken(LEADING_WS,new String(indentation)));
                                

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEADING_WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                _channel=HIDDEN;

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:850:5: ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ |{...}? => '#' (~ '\\n' )* )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:850:10: {...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+
                    {
                    if ( !((startPos==-1)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "startPos==-1");
                    }

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:850:28: ( ' ' | '\\t' )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0=='\t'||LA42_0==' ') ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    match('#'); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:850:44: (~ '\\n' )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0 >= '\u0000' && LA43_0 <= '\t')||(LA43_0 >= '\u000B' && LA43_0 <= '\uFFFF')) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:850:53: ( '\\n' )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0=='\n') ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:850:53: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:851:10: {...}? => '#' (~ '\\n' )*
                    {
                    if ( !((startPos>-1)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "startPos>-1");
                    }

                    match('#'); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:851:31: (~ '\\n' )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0 >= '\u0000' && LA45_0 <= '\t')||(LA45_0 >= '\u000B' && LA45_0 <= '\uFFFF')) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:8: ( DEDENT | INDENT | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | DOT | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | AT | AND | OR | NOT | IN | NOTIN | IS | ISNOT | PRINT | AS | IF | FLOAT | LONGINT | INT | COMPLEX | DOTTED_NAME | NAME | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT )
        int alt47=90;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:10: DEDENT
                {
                mDEDENT(); 


                }
                break;
            case 2 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:17: INDENT
                {
                mINDENT(); 


                }
                break;
            case 3 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:24: T__127
                {
                mT__127(); 


                }
                break;
            case 4 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:31: T__128
                {
                mT__128(); 


                }
                break;
            case 5 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:38: T__129
                {
                mT__129(); 


                }
                break;
            case 6 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:45: T__130
                {
                mT__130(); 


                }
                break;
            case 7 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:52: T__131
                {
                mT__131(); 


                }
                break;
            case 8 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:59: T__132
                {
                mT__132(); 


                }
                break;
            case 9 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:66: T__133
                {
                mT__133(); 


                }
                break;
            case 10 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:73: T__134
                {
                mT__134(); 


                }
                break;
            case 11 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:80: T__135
                {
                mT__135(); 


                }
                break;
            case 12 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:87: T__136
                {
                mT__136(); 


                }
                break;
            case 13 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:94: T__137
                {
                mT__137(); 


                }
                break;
            case 14 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:101: T__138
                {
                mT__138(); 


                }
                break;
            case 15 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:108: T__139
                {
                mT__139(); 


                }
                break;
            case 16 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:115: T__140
                {
                mT__140(); 


                }
                break;
            case 17 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:122: T__141
                {
                mT__141(); 


                }
                break;
            case 18 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:129: T__142
                {
                mT__142(); 


                }
                break;
            case 19 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:136: T__143
                {
                mT__143(); 


                }
                break;
            case 20 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:143: T__144
                {
                mT__144(); 


                }
                break;
            case 21 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:150: T__145
                {
                mT__145(); 


                }
                break;
            case 22 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:157: T__146
                {
                mT__146(); 


                }
                break;
            case 23 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:164: T__147
                {
                mT__147(); 


                }
                break;
            case 24 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:171: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 25 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:178: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 26 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:185: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 27 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:192: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 28 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:199: COLON
                {
                mCOLON(); 


                }
                break;
            case 29 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:205: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 30 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:211: SEMI
                {
                mSEMI(); 


                }
                break;
            case 31 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:216: DOT
                {
                mDOT(); 


                }
                break;
            case 32 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:220: PLUS
                {
                mPLUS(); 


                }
                break;
            case 33 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:225: MINUS
                {
                mMINUS(); 


                }
                break;
            case 34 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:231: STAR
                {
                mSTAR(); 


                }
                break;
            case 35 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:236: SLASH
                {
                mSLASH(); 


                }
                break;
            case 36 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:242: VBAR
                {
                mVBAR(); 


                }
                break;
            case 37 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:247: AMPER
                {
                mAMPER(); 


                }
                break;
            case 38 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:253: LESS
                {
                mLESS(); 


                }
                break;
            case 39 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:258: GREATER
                {
                mGREATER(); 


                }
                break;
            case 40 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:266: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 41 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:273: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 42 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:281: BACKQUOTE
                {
                mBACKQUOTE(); 


                }
                break;
            case 43 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:291: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 44 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:298: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 45 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:305: CIRCUMFLEX
                {
                mCIRCUMFLEX(); 


                }
                break;
            case 46 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:316: TILDE
                {
                mTILDE(); 


                }
                break;
            case 47 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:322: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 48 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:328: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 49 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:337: ALT_NOTEQUAL
                {
                mALT_NOTEQUAL(); 


                }
                break;
            case 50 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:350: LESSEQUAL
                {
                mLESSEQUAL(); 


                }
                break;
            case 51 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:360: LEFTSHIFT
                {
                mLEFTSHIFT(); 


                }
                break;
            case 52 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:370: GREATEREQUAL
                {
                mGREATEREQUAL(); 


                }
                break;
            case 53 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:383: RIGHTSHIFT
                {
                mRIGHTSHIFT(); 


                }
                break;
            case 54 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:394: PLUSEQUAL
                {
                mPLUSEQUAL(); 


                }
                break;
            case 55 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:404: MINUSEQUAL
                {
                mMINUSEQUAL(); 


                }
                break;
            case 56 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:415: DOUBLESTAR
                {
                mDOUBLESTAR(); 


                }
                break;
            case 57 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:426: STAREQUAL
                {
                mSTAREQUAL(); 


                }
                break;
            case 58 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:436: DOUBLESLASH
                {
                mDOUBLESLASH(); 


                }
                break;
            case 59 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:448: SLASHEQUAL
                {
                mSLASHEQUAL(); 


                }
                break;
            case 60 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:459: VBAREQUAL
                {
                mVBAREQUAL(); 


                }
                break;
            case 61 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:469: PERCENTEQUAL
                {
                mPERCENTEQUAL(); 


                }
                break;
            case 62 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:482: AMPEREQUAL
                {
                mAMPEREQUAL(); 


                }
                break;
            case 63 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:493: CIRCUMFLEXEQUAL
                {
                mCIRCUMFLEXEQUAL(); 


                }
                break;
            case 64 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:509: LEFTSHIFTEQUAL
                {
                mLEFTSHIFTEQUAL(); 


                }
                break;
            case 65 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:524: RIGHTSHIFTEQUAL
                {
                mRIGHTSHIFTEQUAL(); 


                }
                break;
            case 66 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:540: DOUBLESTAREQUAL
                {
                mDOUBLESTAREQUAL(); 


                }
                break;
            case 67 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:556: DOUBLESLASHEQUAL
                {
                mDOUBLESLASHEQUAL(); 


                }
                break;
            case 68 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:573: AT
                {
                mAT(); 


                }
                break;
            case 69 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:576: AND
                {
                mAND(); 


                }
                break;
            case 70 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:580: OR
                {
                mOR(); 


                }
                break;
            case 71 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:583: NOT
                {
                mNOT(); 


                }
                break;
            case 72 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:587: IN
                {
                mIN(); 


                }
                break;
            case 73 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:590: NOTIN
                {
                mNOTIN(); 


                }
                break;
            case 74 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:596: IS
                {
                mIS(); 


                }
                break;
            case 75 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:599: ISNOT
                {
                mISNOT(); 


                }
                break;
            case 76 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:605: PRINT
                {
                mPRINT(); 


                }
                break;
            case 77 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:611: AS
                {
                mAS(); 


                }
                break;
            case 78 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:614: IF
                {
                mIF(); 


                }
                break;
            case 79 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:617: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 80 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:623: LONGINT
                {
                mLONGINT(); 


                }
                break;
            case 81 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:631: INT
                {
                mINT(); 


                }
                break;
            case 82 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:635: COMPLEX
                {
                mCOMPLEX(); 


                }
                break;
            case 83 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:643: DOTTED_NAME
                {
                mDOTTED_NAME(); 


                }
                break;
            case 84 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:655: NAME
                {
                mNAME(); 


                }
                break;
            case 85 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:660: STRING
                {
                mSTRING(); 


                }
                break;
            case 86 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:667: CONTINUED_LINE
                {
                mCONTINUED_LINE(); 


                }
                break;
            case 87 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:682: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 88 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:690: WS
                {
                mWS(); 


                }
                break;
            case 89 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:693: LEADING_WS
                {
                mLEADING_WS(); 


                }
                break;
            case 90 :
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:1:704: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA5_eotS =
        "\3\uffff\1\4\2\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\56\1\uffff\1\56\1\105\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\uffff\2\145\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\uffff\12\2",
            "",
            "\1\3\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "\1\5\37\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "640:1: FLOAT : ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) );";
        }
    }
    static final String DFA11_eotS =
        "\7\uffff";
    static final String DFA11_eofS =
        "\7\uffff";
    static final String DFA11_minS =
        "\3\56\2\uffff\2\56";
    static final String DFA11_maxS =
        "\1\71\1\170\1\152\2\uffff\2\152";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA11_specialS =
        "\7\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\15\uffff\1\4\14"+
            "\uffff\1\3\4\uffff\1\4\15\uffff\1\4",
            "\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4",
            "\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "662:1: COMPLEX : ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) );";
        }
    }
    static final String DFA33_eotS =
        "\3\uffff\1\10\2\uffff\2\10\2\uffff";
    static final String DFA33_eofS =
        "\12\uffff";
    static final String DFA33_minS =
        "\1\11\2\12\1\11\2\uffff\2\11\2\uffff";
    static final String DFA33_maxS =
        "\1\40\1\15\1\12\1\40\2\uffff\2\40\2\uffff";
    static final String DFA33_acceptS =
        "\4\uffff\1\2\1\3\2\uffff\1\4\1\1";
    static final String DFA33_specialS =
        "\12\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\4\1\3\1\uffff\1\1\1\2\22\uffff\1\5",
            "\1\3\2\uffff\1\2",
            "\1\3",
            "\1\7\1\11\1\uffff\2\11\22\uffff\1\6",
            "",
            "",
            "\1\7\1\11\1\uffff\2\11\22\uffff\1\6",
            "\1\7\1\11\1\uffff\2\11\22\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 759:9: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )*";
        }
    }
    static final String DFA46_eotS =
        "\2\uffff\2\4\1\uffff";
    static final String DFA46_eofS =
        "\5\uffff";
    static final String DFA46_minS =
        "\1\11\1\uffff\2\0\1\uffff";
    static final String DFA46_maxS =
        "\1\43\1\uffff\2\uffff\1\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\2\uffff\1\2";
    static final String DFA46_specialS =
        "\1\0\1\uffff\1\2\1\1\1\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\26\uffff\1\1\2\uffff\1\2",
            "",
            "\12\3\1\1\ufff5\3",
            "\12\3\1\1\ufff5\3",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "846:1: COMMENT : ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ |{...}? => '#' (~ '\\n' )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_0 = input.LA(1);

                         
                        int index46_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA46_0=='\t'||LA46_0==' ') && ((startPos==-1))) {s = 1;}

                        else if ( (LA46_0=='#') && (((startPos==-1)||(startPos>-1)))) {s = 2;}

                         
                        input.seek(index46_0);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA46_3 = input.LA(1);

                         
                        int index46_3 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA46_3=='\n') && ((startPos==-1))) {s = 1;}

                        else if ( ((LA46_3 >= '\u0000' && LA46_3 <= '\t')||(LA46_3 >= '\u000B' && LA46_3 <= '\uFFFF')) && (((startPos==-1)||(startPos>-1)))) {s = 3;}

                        else s = 4;

                         
                        input.seek(index46_3);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA46_2 >= '\u0000' && LA46_2 <= '\t')||(LA46_2 >= '\u000B' && LA46_2 <= '\uFFFF')) && (((startPos==-1)||(startPos>-1)))) {s = 3;}

                        else if ( (LA46_2=='\n') && ((startPos==-1))) {s = 1;}

                        else s = 4;

                         
                        input.seek(index46_2);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA47_eotS =
        "\1\uffff\1\67\1\72\14\76\7\uffff\1\125\1\130\1\132\1\135\1\140\1"+
        "\142\1\144\1\146\1\150\3\uffff\1\152\3\uffff\2\76\2\156\2\76\3\uffff"+
        "\1\174\1\uffff\2\175\1\uffff\1\u0081\3\uffff\1\u0084\2\uffff\1\u0086"+
        "\2\76\2\uffff\13\76\1\u0096\1\u0098\1\u0099\7\76\1\uffff\1\u00a1"+
        "\4\uffff\1\u00a4\2\uffff\1\u00a6\14\uffff\1\u00a7\1\76\2\uffff\1"+
        "\u00a1\1\156\3\uffff\1\156\1\76\1\u00af\2\uffff\1\u00af\13\uffff"+
        "\1\76\1\uffff\1\u00b7\3\76\1\u00bb\1\u00bc\5\76\1\u00c2\3\76\4\uffff"+
        "\4\76\1\u00ca\2\76\7\uffff\1\u00d0\1\156\1\uffff\1\u00a1\1\uffff"+
        "\1\u00a1\3\uffff\1\u00af\2\uffff\1\u00af\1\uffff\1\76\1\uffff\3"+
        "\76\2\uffff\1\u00de\1\u00df\1\76\1\u00e1\1\76\1\uffff\1\u00e3\2"+
        "\76\1\u00e6\3\76\1\uffff\1\76\1\u00eb\1\uffff\1\u00a1\3\uffff\1"+
        "\u00a1\7\uffff\1\76\1\u00f3\1\u00f4\1\76\2\uffff\1\76\1\uffff\1"+
        "\76\1\uffff\2\76\1\uffff\1\u00fa\1\u00fb\1\76\1\u00fd\2\uffff\1"+
        "\u00a1\4\uffff\1\u0100\2\uffff\1\76\1\u0102\1\76\1\u0104\1\u0105"+
        "\2\uffff\1\u0106\1\uffff\2\u00af\1\uffff\1\76\1\uffff\1\u0108\3"+
        "\uffff\1\u0109\2\uffff";
    static final String DFA47_eofS =
        "\u010a\uffff";
    static final String DFA47_minS =
        "\1\11\1\74\1\75\11\56\1\42\2\56\7\uffff\1\60\2\75\1\52\1\57\4\75"+
        "\3\uffff\1\75\3\uffff\4\56\1\42\1\56\2\0\1\uffff\1\12\1\uffff\2"+
        "\11\1\uffff\1\74\3\uffff\1\75\2\uffff\3\56\2\uffff\14\56\1\40\10"+
        "\56\1\uffff\1\60\4\uffff\1\75\2\uffff\1\75\14\uffff\2\56\1\60\1"+
        "\uffff\1\60\1\56\1\53\2\uffff\1\56\1\42\1\47\2\0\1\42\2\0\1\uffff"+
        "\1\0\7\uffff\1\56\1\uffff\17\56\4\uffff\7\56\1\uffff\1\53\5\uffff"+
        "\1\40\1\60\1\53\3\60\1\0\1\uffff\1\0\1\56\2\0\1\56\1\uffff\1\56"+
        "\1\uffff\3\56\2\uffff\5\56\1\uffff\7\56\1\uffff\2\56\2\60\2\uffff"+
        "\2\60\1\53\6\0\4\56\2\uffff\1\56\1\uffff\1\56\1\uffff\2\56\1\uffff"+
        "\4\56\1\uffff\2\60\4\0\1\56\2\uffff\5\56\2\uffff\1\56\1\uffff\2"+
        "\56\1\uffff\1\56\1\uffff\1\56\3\uffff\1\56\2\uffff";
    static final String DFA47_maxS =
        "\1\176\2\76\14\172\7\uffff\1\71\10\75\3\uffff\1\75\3\uffff\2\172"+
        "\1\170\1\154\2\172\2\uffff\1\uffff\1\15\1\uffff\2\43\1\uffff\1\75"+
        "\3\uffff\1\76\2\uffff\3\172\2\uffff\25\172\1\uffff\1\152\4\uffff"+
        "\1\75\2\uffff\1\75\14\uffff\2\172\1\146\1\uffff\1\152\1\154\1\71"+
        "\2\uffff\1\154\1\172\1\56\2\uffff\1\56\2\uffff\1\uffff\1\0\7\uffff"+
        "\1\172\1\uffff\17\172\4\uffff\7\172\1\uffff\1\71\5\uffff\1\172\1"+
        "\154\1\71\1\152\1\71\1\152\1\uffff\1\uffff\1\uffff\1\56\2\uffff"+
        "\1\56\1\uffff\1\172\1\uffff\3\172\2\uffff\5\172\1\uffff\7\172\1"+
        "\uffff\2\172\1\71\1\152\2\uffff\1\71\1\152\1\71\6\uffff\4\172\2"+
        "\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\4\172\1\uffff\1"+
        "\71\1\152\4\uffff\1\172\2\uffff\5\172\2\uffff\1\172\1\uffff\2\56"+
        "\1\uffff\1\172\1\uffff\1\172\3\uffff\1\172\2\uffff";
    static final String DFA47_acceptS =
        "\17\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\36\11\uffff\1\52\1\53"+
        "\1\54\1\uffff\1\56\1\60\1\104\10\uffff\1\126\1\uffff\1\127\2\uffff"+
        "\1\132\1\uffff\1\61\1\62\1\46\1\uffff\1\64\1\47\3\uffff\1\124\1"+
        "\123\25\uffff\1\37\1\uffff\1\66\1\40\1\67\1\41\1\uffff\1\71\1\42"+
        "\1\uffff\1\73\1\43\1\74\1\44\1\76\1\45\1\57\1\50\1\75\1\51\1\77"+
        "\1\55\3\uffff\1\121\3\uffff\1\120\1\122\10\uffff\1\130\1\uffff\1"+
        "\132\1\1\1\100\1\63\1\2\1\101\1\65\1\uffff\1\115\17\uffff\1\110"+
        "\1\113\1\112\1\116\7\uffff\1\117\1\uffff\1\102\1\70\1\103\1\72\1"+
        "\106\7\uffff\1\125\5\uffff\1\131\1\uffff\1\105\3\uffff\1\7\1\10"+
        "\5\uffff\1\16\7\uffff\1\25\4\uffff\1\111\1\107\15\uffff\1\11\1\12"+
        "\1\uffff\1\14\1\uffff\1\17\2\uffff\1\22\4\uffff\1\27\7\uffff\1\4"+
        "\1\5\5\uffff\1\114\1\23\1\uffff\1\26\2\uffff\1\3\1\uffff\1\13\1"+
        "\uffff\1\20\1\21\1\24\1\uffff\1\15\1\6";
    static final String DFA47_specialS =
        "\1\5\53\uffff\1\15\1\0\1\uffff\1\3\1\uffff\1\26\1\23\104\uffff\1"+
        "\20\1\25\1\uffff\1\21\1\14\1\uffff\1\30\60\uffff\1\27\1\uffff\1"+
        "\22\1\uffff\1\7\1\4\40\uffff\1\1\1\17\1\6\1\24\1\16\1\11\24\uffff"+
        "\1\12\1\10\1\13\1\2\30\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\61\1\60\1\uffff\1\57\1\60\22\uffff\1\62\1\44\1\55\1\63\1"+
            "\uffff\1\36\1\34\1\54\1\17\1\20\1\31\1\27\1\24\1\30\1\26\1\32"+
            "\1\50\11\51\1\23\1\25\1\1\1\35\1\2\1\uffff\1\45\32\53\1\21\1"+
            "\56\1\22\1\42\1\53\1\37\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\53\1"+
            "\12\4\53\1\47\1\46\1\13\1\53\1\14\1\53\1\15\1\52\1\53\1\16\3"+
            "\53\1\40\1\33\1\41\1\43",
            "\1\64\1\66\1\65",
            "\1\71\1\70",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\15\75"+
            "\1\74\4\75\1\73\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\21\75"+
            "\1\100\10\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75"+
            "\1\101\2\75\1\102\13\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\103\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75"+
            "\1\104\13\75\1\105\2\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\10\75"+
            "\1\106\5\75\1\107\2\75\1\110\10\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75"+
            "\1\111\16\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\5\75"+
            "\1\115\6\75\1\112\1\113\4\75\1\114\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\1\116"+
            "\20\75\1\117\10\75",
            "\1\55\4\uffff\1\54\6\uffff\1\77\1\uffff\12\75\7\uffff\32\75"+
            "\4\uffff\1\75\1\uffff\1\120\3\75\1\121\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\21\75"+
            "\1\122\10\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\7\75"+
            "\1\123\1\124\21\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\126",
            "\1\127",
            "\1\131",
            "\1\133\22\uffff\1\134",
            "\1\136\15\uffff\1\137",
            "\1\141",
            "\1\143",
            "\1\145",
            "\1\147",
            "",
            "",
            "",
            "\1\151",
            "",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\21\75"+
            "\1\153\10\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\16\75"+
            "\1\154\13\75",
            "\1\157\1\uffff\12\160\13\uffff\1\161\4\uffff\1\163\1\uffff"+
            "\1\162\13\uffff\1\155\14\uffff\1\161\4\uffff\1\163\1\uffff\1"+
            "\162\13\uffff\1\155",
            "\1\157\1\uffff\12\164\13\uffff\1\161\4\uffff\1\163\1\uffff"+
            "\1\162\30\uffff\1\161\4\uffff\1\163\1\uffff\1\162",
            "\1\55\4\uffff\1\54\6\uffff\1\77\1\uffff\12\75\7\uffff\32\75"+
            "\4\uffff\1\75\1\uffff\21\75\1\165\10\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\170\1\uffff\34\170\1\166\64\170\1\167\uffa3\170",
            "\12\173\1\uffff\27\173\1\171\71\173\1\172\uffa3\173",
            "",
            "\1\60\2\uffff\1\60",
            "",
            "\1\61\1\60\1\uffff\1\57\1\60\22\uffff\1\62\2\uffff\1\176",
            "\1\61\1\60\1\uffff\1\57\1\60\22\uffff\1\62\2\uffff\1\176",
            "",
            "\1\177\1\u0080",
            "",
            "",
            "",
            "\1\u0083\1\u0082",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\22\75"+
            "\1\u0085\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\3\75"+
            "\1\u0087\26\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\u0088\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\1\u0089"+
            "\31\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\15\75"+
            "\1\u008a\14\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\5\75"+
            "\1\u008b\5\75\1\u008c\16\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\10\75"+
            "\1\u008d\11\75\1\u008e\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\2\75"+
            "\1\u008f\1\75\1\u0090\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\15\75"+
            "\1\u0091\14\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\21\75"+
            "\1\u0092\10\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\16\75"+
            "\1\u0093\13\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\16\75"+
            "\1\u0094\13\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\17\75"+
            "\1\u0095\12\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0097\15\uffff\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff"+
            "\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\22\75"+
            "\1\u009a\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\10\75"+
            "\1\u009b\21\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\10\75"+
            "\1\u009c\21\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u009d\6\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\30\75"+
            "\1\u009e\1\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\10\75"+
            "\1\u009f\21\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u00a0\6\75",
            "",
            "\12\126\13\uffff\1\u00a2\4\uffff\1\163\32\uffff\1\u00a2\4\uffff"+
            "\1\163",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "",
            "",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u00a8\6\75",
            "\12\u00a9\7\uffff\6\u00a9\32\uffff\6\u00a9",
            "",
            "\12\u00ab\13\uffff\1\u00aa\4\uffff\1\163\32\uffff\1\u00aa\4"+
            "\uffff\1\163",
            "\1\157\1\uffff\12\160\13\uffff\1\161\4\uffff\1\163\1\uffff"+
            "\1\162\30\uffff\1\161\4\uffff\1\163\1\uffff\1\162",
            "\1\u00ac\1\uffff\1\u00ac\2\uffff\12\u00ad",
            "",
            "",
            "\1\157\1\uffff\12\164\13\uffff\1\161\4\uffff\1\163\1\uffff"+
            "\1\162\30\uffff\1\161\4\uffff\1\163\1\uffff\1\162",
            "\1\55\4\uffff\1\54\6\uffff\1\77\1\uffff\12\75\7\uffff\32\75"+
            "\4\uffff\1\75\1\uffff\32\75",
            "\1\u00ae\6\uffff\1\77",
            "\0\u00b0",
            "\12\170\1\uffff\34\170\1\u00b1\64\170\1\167\uffa3\170",
            "\1\u00b2\13\uffff\1\77",
            "\0\u00b3",
            "\12\173\1\uffff\27\173\1\u00b4\71\173\1\172\uffa3\173",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\u00b6\25\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\1\u00b8"+
            "\31\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\22\75"+
            "\1\u00b9\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u00ba\6\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\5\75"+
            "\1\u00bd\24\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\u00be\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\u00bf\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\2\75"+
            "\1\u00c0\27\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\1\u00c1"+
            "\31\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\14\75"+
            "\1\u00c3\15\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\1\75"+
            "\1\u00c4\30\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\16\75"+
            "\1\u00c5\13\75",
            "",
            "",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\22\75"+
            "\1\u00c6\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\15\75"+
            "\1\u00c7\14\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\22\75"+
            "\1\u00c8\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\24\75"+
            "\1\u00c9\5\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75"+
            "\1\u00cb\16\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\7\75"+
            "\1\u00cc\22\75",
            "",
            "\1\u00cd\1\uffff\1\u00cd\2\uffff\12\u00ce",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cf\15\uffff\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff"+
            "\1\75\1\uffff\32\75",
            "\12\u00a9\7\uffff\6\u00a9\3\uffff\1\163\1\uffff\1\162\24\uffff"+
            "\6\u00a9\3\uffff\1\163\1\uffff\1\162",
            "\1\u00d1\1\uffff\1\u00d1\2\uffff\12\u00d2",
            "\12\u00ab\13\uffff\1\u00d3\4\uffff\1\163\32\uffff\1\u00d3\4"+
            "\uffff\1\163",
            "\12\u00ad",
            "\12\u00ad\20\uffff\1\163\37\uffff\1\163",
            "\47\u00d6\1\u00d4\64\u00d6\1\u00d5\uffa3\u00d6",
            "",
            "\12\170\1\uffff\34\170\1\u00b1\64\170\1\167\uffa3\170",
            "\1\77",
            "\42\u00d9\1\u00d7\71\u00d9\1\u00d8\uffa3\u00d9",
            "\12\173\1\uffff\27\173\1\u00b4\71\173\1\172\uffa3\173",
            "\1\77",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\21\75"+
            "\1\u00da\10\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\12\75"+
            "\1\u00db\17\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\22\75"+
            "\1\u00dc\7\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\10\75"+
            "\1\u00dd\21\75",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\17\75"+
            "\1\u00e0\12\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75"+
            "\1\u00e2\16\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\1\u00e4"+
            "\31\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\21\75"+
            "\1\u00e5\10\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u00e7\6\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\u00e8\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\21\75"+
            "\1\u00e9\10\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\u00ea\25\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\u00ce",
            "\12\u00ce\20\uffff\1\163\37\uffff\1\163",
            "",
            "",
            "\12\u00d2",
            "\12\u00d2\20\uffff\1\163\37\uffff\1\163",
            "\1\u00ec\1\uffff\1\u00ec\2\uffff\12\u00ed",
            "\47\u00d6\1\u00ee\64\u00d6\1\u00d5\uffa3\u00d6",
            "\0\u00ef",
            "\47\u00d6\1\u00d4\64\u00d6\1\u00d5\uffa3\u00d6",
            "\42\u00d9\1\u00f0\71\u00d9\1\u00d8\uffa3\u00d9",
            "\0\u00f1",
            "\42\u00d9\1\u00d7\71\u00d9\1\u00d8\uffa3\u00d9",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u00f2\6\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\15\75"+
            "\1\u00f5\14\75",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u00f6\6\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75"+
            "\1\u00f7\16\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\13\75"+
            "\1\u00f8\16\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\23\75"+
            "\1\u00f9\6\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\15\75"+
            "\1\u00fc\14\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\12\u00ed",
            "\12\u00ed\20\uffff\1\163\37\uffff\1\163",
            "\47\u00d6\1\u00fe\64\u00d6\1\u00d5\uffa3\u00d6",
            "\47\u00d6\1\u00d4\64\u00d6\1\u00d5\uffa3\u00d6",
            "\42\u00d9\1\u00ff\71\u00d9\1\u00d8\uffa3\u00d9",
            "\42\u00d9\1\u00d7\71\u00d9\1\u00d8\uffa3\u00d9",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\24\75"+
            "\1\u0101\5\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\30\75"+
            "\1\u0103\1\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\77",
            "\1\77",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\4\75"+
            "\1\u0107\25\75",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "",
            "",
            "\1\77\1\uffff\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DEDENT | INDENT | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | DOT | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | AT | AND | OR | NOT | IN | NOTIN | IS | ISNOT | PRINT | AS | IF | FLOAT | LONGINT | INT | COMPLEX | DOTTED_NAME | NAME | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_45 = input.LA(1);

                        s = -1;
                        if ( (LA47_45=='\"') ) {s = 121;}

                        else if ( (LA47_45=='\\') ) {s = 122;}

                        else if ( ((LA47_45 >= '\u0000' && LA47_45 <= '\t')||(LA47_45 >= '\u000B' && LA47_45 <= '!')||(LA47_45 >= '#' && LA47_45 <= '[')||(LA47_45 >= ']' && LA47_45 <= '\uFFFF')) ) {s = 123;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA47_212 = input.LA(1);

                        s = -1;
                        if ( (LA47_212=='\'') ) {s = 238;}

                        else if ( (LA47_212=='\\') ) {s = 213;}

                        else if ( ((LA47_212 >= '\u0000' && LA47_212 <= '&')||(LA47_212 >= '(' && LA47_212 <= '[')||(LA47_212 >= ']' && LA47_212 <= '\uFFFF')) ) {s = 214;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA47_241 = input.LA(1);

                        s = -1;
                        if ( (LA47_241=='\"') ) {s = 215;}

                        else if ( (LA47_241=='\\') ) {s = 216;}

                        else if ( ((LA47_241 >= '\u0000' && LA47_241 <= '!')||(LA47_241 >= '#' && LA47_241 <= '[')||(LA47_241 >= ']' && LA47_241 <= '\uFFFF')) ) {s = 217;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA47_47 = input.LA(1);

                         
                        int index47_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA47_47=='\n'||LA47_47=='\r') ) {s = 48;}

                        else s = 124;

                         
                        input.seek(index47_47);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA47_179 = input.LA(1);

                        s = -1;
                        if ( (LA47_179=='\"') ) {s = 180;}

                        else if ( (LA47_179=='\\') ) {s = 122;}

                        else if ( ((LA47_179 >= '\u0000' && LA47_179 <= '\t')||(LA47_179 >= '\u000B' && LA47_179 <= '!')||(LA47_179 >= '#' && LA47_179 <= '[')||(LA47_179 >= ']' && LA47_179 <= '\uFFFF')) ) {s = 123;}

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA47_0 = input.LA(1);

                         
                        int index47_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA47_0=='<') ) {s = 1;}

                        else if ( (LA47_0=='>') ) {s = 2;}

                        else if ( (LA47_0=='a') ) {s = 3;}

                        else if ( (LA47_0=='b') ) {s = 4;}

                        else if ( (LA47_0=='c') ) {s = 5;}

                        else if ( (LA47_0=='d') ) {s = 6;}

                        else if ( (LA47_0=='e') ) {s = 7;}

                        else if ( (LA47_0=='f') ) {s = 8;}

                        else if ( (LA47_0=='g') ) {s = 9;}

                        else if ( (LA47_0=='i') ) {s = 10;}

                        else if ( (LA47_0=='p') ) {s = 11;}

                        else if ( (LA47_0=='r') ) {s = 12;}

                        else if ( (LA47_0=='t') ) {s = 13;}

                        else if ( (LA47_0=='w') ) {s = 14;}

                        else if ( (LA47_0=='(') ) {s = 15;}

                        else if ( (LA47_0==')') ) {s = 16;}

                        else if ( (LA47_0=='[') ) {s = 17;}

                        else if ( (LA47_0==']') ) {s = 18;}

                        else if ( (LA47_0==':') ) {s = 19;}

                        else if ( (LA47_0==',') ) {s = 20;}

                        else if ( (LA47_0==';') ) {s = 21;}

                        else if ( (LA47_0=='.') ) {s = 22;}

                        else if ( (LA47_0=='+') ) {s = 23;}

                        else if ( (LA47_0=='-') ) {s = 24;}

                        else if ( (LA47_0=='*') ) {s = 25;}

                        else if ( (LA47_0=='/') ) {s = 26;}

                        else if ( (LA47_0=='|') ) {s = 27;}

                        else if ( (LA47_0=='&') ) {s = 28;}

                        else if ( (LA47_0=='=') ) {s = 29;}

                        else if ( (LA47_0=='%') ) {s = 30;}

                        else if ( (LA47_0=='`') ) {s = 31;}

                        else if ( (LA47_0=='{') ) {s = 32;}

                        else if ( (LA47_0=='}') ) {s = 33;}

                        else if ( (LA47_0=='^') ) {s = 34;}

                        else if ( (LA47_0=='~') ) {s = 35;}

                        else if ( (LA47_0=='!') ) {s = 36;}

                        else if ( (LA47_0=='@') ) {s = 37;}

                        else if ( (LA47_0=='o') ) {s = 38;}

                        else if ( (LA47_0=='n') ) {s = 39;}

                        else if ( (LA47_0=='0') ) {s = 40;}

                        else if ( ((LA47_0 >= '1' && LA47_0 <= '9')) ) {s = 41;}

                        else if ( (LA47_0=='u') ) {s = 42;}

                        else if ( ((LA47_0 >= 'A' && LA47_0 <= 'Z')||LA47_0=='_'||LA47_0=='h'||(LA47_0 >= 'j' && LA47_0 <= 'm')||LA47_0=='q'||LA47_0=='s'||LA47_0=='v'||(LA47_0 >= 'x' && LA47_0 <= 'z')) ) {s = 43;}

                        else if ( (LA47_0=='\'') ) {s = 44;}

                        else if ( (LA47_0=='\"') ) {s = 45;}

                        else if ( (LA47_0=='\\') ) {s = 46;}

                        else if ( (LA47_0=='\f') ) {s = 47;}

                        else if ( (LA47_0=='\n'||LA47_0=='\r') ) {s = 48;}

                        else if ( (LA47_0=='\t') ) {s = 49;}

                        else if ( (LA47_0==' ') ) {s = 50;}

                        else if ( (LA47_0=='#') && (((startPos==-1)||(startPos>-1)))) {s = 51;}

                         
                        input.seek(index47_0);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA47_214 = input.LA(1);

                        s = -1;
                        if ( (LA47_214=='\'') ) {s = 212;}

                        else if ( (LA47_214=='\\') ) {s = 213;}

                        else if ( ((LA47_214 >= '\u0000' && LA47_214 <= '&')||(LA47_214 >= '(' && LA47_214 <= '[')||(LA47_214 >= ']' && LA47_214 <= '\uFFFF')) ) {s = 214;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA47_178 = input.LA(1);

                        s = -1;
                        if ( (LA47_178=='\"') ) {s = 215;}

                        else if ( (LA47_178=='\\') ) {s = 216;}

                        else if ( ((LA47_178 >= '\u0000' && LA47_178 <= '!')||(LA47_178 >= '#' && LA47_178 <= '[')||(LA47_178 >= ']' && LA47_178 <= '\uFFFF')) ) {s = 217;}

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA47_239 = input.LA(1);

                        s = -1;
                        if ( (LA47_239=='\'') ) {s = 212;}

                        else if ( (LA47_239=='\\') ) {s = 213;}

                        else if ( ((LA47_239 >= '\u0000' && LA47_239 <= '&')||(LA47_239 >= '(' && LA47_239 <= '[')||(LA47_239 >= ']' && LA47_239 <= '\uFFFF')) ) {s = 214;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA47_217 = input.LA(1);

                        s = -1;
                        if ( (LA47_217=='\"') ) {s = 215;}

                        else if ( (LA47_217=='\\') ) {s = 216;}

                        else if ( ((LA47_217 >= '\u0000' && LA47_217 <= '!')||(LA47_217 >= '#' && LA47_217 <= '[')||(LA47_217 >= ']' && LA47_217 <= '\uFFFF')) ) {s = 217;}

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA47_238 = input.LA(1);

                        s = -1;
                        if ( (LA47_238=='\'') ) {s = 254;}

                        else if ( (LA47_238=='\\') ) {s = 213;}

                        else if ( ((LA47_238 >= '\u0000' && LA47_238 <= '&')||(LA47_238 >= '(' && LA47_238 <= '[')||(LA47_238 >= ']' && LA47_238 <= '\uFFFF')) ) {s = 214;}

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA47_240 = input.LA(1);

                        s = -1;
                        if ( (LA47_240=='\"') ) {s = 255;}

                        else if ( (LA47_240=='\\') ) {s = 216;}

                        else if ( ((LA47_240 >= '\u0000' && LA47_240 <= '!')||(LA47_240 >= '#' && LA47_240 <= '[')||(LA47_240 >= ']' && LA47_240 <= '\uFFFF')) ) {s = 217;}

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA47_123 = input.LA(1);

                        s = -1;
                        if ( (LA47_123=='\"') ) {s = 180;}

                        else if ( (LA47_123=='\\') ) {s = 122;}

                        else if ( ((LA47_123 >= '\u0000' && LA47_123 <= '\t')||(LA47_123 >= '\u000B' && LA47_123 <= '!')||(LA47_123 >= '#' && LA47_123 <= '[')||(LA47_123 >= ']' && LA47_123 <= '\uFFFF')) ) {s = 123;}

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA47_44 = input.LA(1);

                        s = -1;
                        if ( (LA47_44=='\'') ) {s = 118;}

                        else if ( (LA47_44=='\\') ) {s = 119;}

                        else if ( ((LA47_44 >= '\u0000' && LA47_44 <= '\t')||(LA47_44 >= '\u000B' && LA47_44 <= '&')||(LA47_44 >= '(' && LA47_44 <= '[')||(LA47_44 >= ']' && LA47_44 <= '\uFFFF')) ) {s = 120;}

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA47_216 = input.LA(1);

                        s = -1;
                        if ( ((LA47_216 >= '\u0000' && LA47_216 <= '\uFFFF')) ) {s = 241;}

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA47_213 = input.LA(1);

                        s = -1;
                        if ( ((LA47_213 >= '\u0000' && LA47_213 <= '\uFFFF')) ) {s = 239;}

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA47_119 = input.LA(1);

                        s = -1;
                        if ( ((LA47_119 >= '\u0000' && LA47_119 <= '\uFFFF')) ) {s = 176;}

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA47_122 = input.LA(1);

                        s = -1;
                        if ( ((LA47_122 >= '\u0000' && LA47_122 <= '\uFFFF')) ) {s = 179;}

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA47_176 = input.LA(1);

                        s = -1;
                        if ( (LA47_176=='\'') ) {s = 177;}

                        else if ( (LA47_176=='\\') ) {s = 119;}

                        else if ( ((LA47_176 >= '\u0000' && LA47_176 <= '\t')||(LA47_176 >= '\u000B' && LA47_176 <= '&')||(LA47_176 >= '(' && LA47_176 <= '[')||(LA47_176 >= ']' && LA47_176 <= '\uFFFF')) ) {s = 120;}

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA47_50 = input.LA(1);

                         
                        int index47_50 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA47_50=='\f') ) {s = 47;}

                        else if ( (LA47_50=='\n'||LA47_50=='\r') ) {s = 48;}

                        else if ( (LA47_50=='\t') ) {s = 49;}

                        else if ( (LA47_50==' ') ) {s = 50;}

                        else if ( (LA47_50=='#') && ((startPos==-1))) {s = 126;}

                        else s = 125;

                         
                        input.seek(index47_50);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA47_215 = input.LA(1);

                        s = -1;
                        if ( (LA47_215=='\"') ) {s = 240;}

                        else if ( (LA47_215=='\\') ) {s = 216;}

                        else if ( ((LA47_215 >= '\u0000' && LA47_215 <= '!')||(LA47_215 >= '#' && LA47_215 <= '[')||(LA47_215 >= ']' && LA47_215 <= '\uFFFF')) ) {s = 217;}

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA47_120 = input.LA(1);

                        s = -1;
                        if ( (LA47_120=='\'') ) {s = 177;}

                        else if ( (LA47_120=='\\') ) {s = 119;}

                        else if ( ((LA47_120 >= '\u0000' && LA47_120 <= '\t')||(LA47_120 >= '\u000B' && LA47_120 <= '&')||(LA47_120 >= '(' && LA47_120 <= '[')||(LA47_120 >= ']' && LA47_120 <= '\uFFFF')) ) {s = 120;}

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA47_49 = input.LA(1);

                         
                        int index47_49 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA47_49=='\f') ) {s = 47;}

                        else if ( (LA47_49=='\n'||LA47_49=='\r') ) {s = 48;}

                        else if ( (LA47_49=='\t') ) {s = 49;}

                        else if ( (LA47_49==' ') ) {s = 50;}

                        else if ( (LA47_49=='#') && ((startPos==-1))) {s = 126;}

                        else s = 125;

                         
                        input.seek(index47_49);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA47_174 = input.LA(1);

                        s = -1;
                        if ( (LA47_174=='\'') ) {s = 212;}

                        else if ( (LA47_174=='\\') ) {s = 213;}

                        else if ( ((LA47_174 >= '\u0000' && LA47_174 <= '&')||(LA47_174 >= '(' && LA47_174 <= '[')||(LA47_174 >= ']' && LA47_174 <= '\uFFFF')) ) {s = 214;}

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA47_125 = input.LA(1);

                         
                        int index47_125 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((startPos>0)) ) {s = 124;}

                        else if ( ((startPos==0)) ) {s = 181;}

                         
                        input.seek(index47_125);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}