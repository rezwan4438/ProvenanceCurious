// $ANTLR 3.4 D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g 2012-11-19 16:42:34

  package pythonProvenance;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PythonProvenanceParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT_NOTEQUAL", "AMPER", "AMPEREQUAL", "AND", "ARGUMENTS", "AS", "ASSIGN", "ASSIGN_CMD", "AT", "BACKQUOTE", "CIRCUMFLEX", "CIRCUMFLEXEQUAL", "CLASSVARIABLE_CMD", "CLASS_CMD", "COLON", "COMMA", "COMMENT", "COMPLEX", "CONTINUED_LINE", "DEDENT", "DICTIONARY_CMD", "DICTMAKER_CMD", "DICT_ARGS", "DIGITS", "DOT", "DOTTED_NAME", "DOUBLESLASH", "DOUBLESLASHEQUAL", "DOUBLESTAR", "DOUBLESTAREQUAL", "DOUBLE_TYPE", "ELIF_CLAUSES", "ELIF_CMD", "ELSE_CMD", "EQUAL", "ESC", "EXCEPT_CMD", "EXPRESSION", "Exponent", "FINALLY_CMD", "FLOAT", "FORLOOP_CMD", "GREATER", "GREATEREQUAL", "IF", "IFBLOCK", "IF_CMD", "IMPORT_ARGS", "IMPORT_CMD", "IMPORT_EQUIV", "IN", "INDENT", "INNER_BRANCH", "INT", "INT_TYPE", "IS", "ISNOT", "LBRACK", "LCURLY", "LEADING_WS", "LEFTSHIFT", "LEFTSHIFTEQUAL", "LESS", "LESSEQUAL", "LISTCOMPREHENSION_CMD", "LISTCONDITION_CMD", "LISTLOOPCONTROL_CMD", "LISTMAKER_CMD", "LIST_ARGS", "LONGINT", "LONG_TYPE", "LPAREN", "MINUS", "MINUSEQUAL", "NAME", "NEWLINE", "NOT", "NOTEQUAL", "NOTIN", "NO_ARGS", "OR", "OUTER_FUNCTION_ARGS", "OUTER_FUNCTION_CMD", "PERCENT", "PERCENTEQUAL", "PLUS", "PLUSEQUAL", "PRINT", "PRINT_ARGS", "PRINT_CMD", "RBRACK", "RCURLY", "RETURN_CMD", "RIGHTSHIFT", "RIGHTSHIFTEQUAL", "RPAREN", "SEMI", "SLASH", "SLASHEQUAL", "STAR", "STAREQUAL", "STRING", "STRING_TYPE", "SUBSCRIPTLIST", "SUBSCRIPTLISTS", "SUBSCRIPTS", "TILDE", "TRAILER", "TRIAPOS", "TRIQUOTE", "TRYBLOCK", "TRY_CMD", "UNARY_EXPRESSION", "VALUETYPE", "VARIABLE_CMD", "VBAR", "VBAREQUAL", "WHILEBLOCK", "WHILE_CMD", "WITH_ARGS", "WITH_CMD", "WITH_EQUIV", "WS", "'assert'", "'break'", "'class'", "'continue'", "'def'", "'del'", "'elif'", "'else'", "'except'", "'exec'", "'finally'", "'for'", "'from'", "'global'", "'import'", "'pass'", "'raise'", "'return'", "'try'", "'while'", "'with'"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PythonProvenanceParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PythonProvenanceParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PythonProvenanceParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g"; }


    public static class single_input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_input"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:99:1: single_input : ( NEWLINE !| simple_stmt | compound_stmt NEWLINE !);
    public final PythonProvenanceParser.single_input_return single_input() throws RecognitionException {
        PythonProvenanceParser.single_input_return retval = new PythonProvenanceParser.single_input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE1=null;
        Token NEWLINE4=null;
        PythonProvenanceParser.simple_stmt_return simple_stmt2 =null;

        PythonProvenanceParser.compound_stmt_return compound_stmt3 =null;


        Object NEWLINE1_tree=null;
        Object NEWLINE4_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:99:14: ( NEWLINE !| simple_stmt | compound_stmt NEWLINE !)
            int alt1=3;
            switch ( input.LA(1) ) {
            case NEWLINE:
                {
                alt1=1;
                }
                break;
            case BACKQUOTE:
            case DOTTED_NAME:
            case FLOAT:
            case INT:
            case LBRACK:
            case LCURLY:
            case LONGINT:
            case LPAREN:
            case MINUS:
            case NAME:
            case NOT:
            case PLUS:
            case PRINT:
            case STRING:
            case TILDE:
            case 127:
            case 128:
            case 130:
            case 132:
            case 136:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                {
                alt1=2;
                }
                break;
            case AT:
            case IF:
            case 129:
            case 131:
            case 138:
            case 145:
            case 146:
            case 147:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:99:16: NEWLINE !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_single_input425); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:100:16: simple_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simple_stmt_in_single_input443);
                    simple_stmt2=simple_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_stmt2.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:101:16: compound_stmt NEWLINE !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_stmt_in_single_input460);
                    compound_stmt3=compound_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, compound_stmt3.getTree());

                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_single_input462); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_input"


    public static class file_input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file_input"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:104:1: file_input : ( NEWLINE !| stmt )* ;
    public final PythonProvenanceParser.file_input_return file_input() throws RecognitionException {
        PythonProvenanceParser.file_input_return retval = new PythonProvenanceParser.file_input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE5=null;
        PythonProvenanceParser.stmt_return stmt6 =null;


        Object NEWLINE5_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:104:12: ( ( NEWLINE !| stmt )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:104:14: ( NEWLINE !| stmt )*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:104:14: ( NEWLINE !| stmt )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= AT && LA2_0 <= BACKQUOTE)||LA2_0==DOTTED_NAME||LA2_0==FLOAT||LA2_0==IF||LA2_0==INT||(LA2_0 >= LBRACK && LA2_0 <= LCURLY)||LA2_0==LONGINT||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NAME||LA2_0==NOT||LA2_0==PLUS||LA2_0==PRINT||LA2_0==STRING||LA2_0==TILDE||(LA2_0 >= 127 && LA2_0 <= 132)||LA2_0==136||(LA2_0 >= 138 && LA2_0 <= 147)) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:104:15: NEWLINE !
            	    {
            	    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_file_input486); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:104:26: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_file_input491);
            	    stmt6=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "file_input"


    public static class eval_input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eval_input"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:108:1: eval_input : ( NEWLINE !)* testlist ( NEWLINE !)* ;
    public final PythonProvenanceParser.eval_input_return eval_input() throws RecognitionException {
        PythonProvenanceParser.eval_input_return retval = new PythonProvenanceParser.eval_input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE7=null;
        Token NEWLINE9=null;
        PythonProvenanceParser.testlist_return testlist8 =null;


        Object NEWLINE7_tree=null;
        Object NEWLINE9_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:108:12: ( ( NEWLINE !)* testlist ( NEWLINE !)* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:108:14: ( NEWLINE !)* testlist ( NEWLINE !)*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:108:14: ( NEWLINE !)*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:108:15: NEWLINE !
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_eval_input516); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            pushFollow(FOLLOW_testlist_in_eval_input521);
            testlist8=testlist();

            state._fsp--;

            adaptor.addChild(root_0, testlist8.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:108:35: ( NEWLINE !)*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:108:36: NEWLINE !
            	    {
            	    NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_eval_input524); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "eval_input"


    public static class decorators_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decorators"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:111:1: decorators : ( decorator )+ ;
    public final PythonProvenanceParser.decorators_return decorators() throws RecognitionException {
        PythonProvenanceParser.decorators_return retval = new PythonProvenanceParser.decorators_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.decorator_return decorator10 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:111:11: ( ( decorator )+ )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:111:13: ( decorator )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:111:13: ( decorator )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:111:13: decorator
            	    {
            	    pushFollow(FOLLOW_decorator_in_decorators546);
            	    decorator10=decorator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, decorator10.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decorators"


    public static class decorator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decorator"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:114:1: decorator : AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE ;
    public final PythonProvenanceParser.decorator_return decorator() throws RecognitionException {
        PythonProvenanceParser.decorator_return retval = new PythonProvenanceParser.decorator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AT11=null;
        Token LPAREN13=null;
        Token RPAREN15=null;
        Token NEWLINE16=null;
        PythonProvenanceParser.dotted_attr_return dotted_attr12 =null;

        PythonProvenanceParser.arglist_return arglist14 =null;


        Object AT11_tree=null;
        Object LPAREN13_tree=null;
        Object RPAREN15_tree=null;
        Object NEWLINE16_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:114:10: ( AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:114:12: AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE
            {
            root_0 = (Object)adaptor.nil();


            AT11=(Token)match(input,AT,FOLLOW_AT_in_decorator565); 
            AT11_tree = 
            (Object)adaptor.create(AT11)
            ;
            adaptor.addChild(root_0, AT11_tree);


            pushFollow(FOLLOW_dotted_attr_in_decorator567);
            dotted_attr12=dotted_attr();

            state._fsp--;

            adaptor.addChild(root_0, dotted_attr12.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:114:27: ( LPAREN ( arglist )? RPAREN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:114:28: LPAREN ( arglist )? RPAREN
                    {
                    LPAREN13=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_decorator570); 
                    LPAREN13_tree = 
                    (Object)adaptor.create(LPAREN13)
                    ;
                    adaptor.addChild(root_0, LPAREN13_tree);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:114:35: ( arglist )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BACKQUOTE||LA6_0==DOTTED_NAME||LA6_0==DOUBLESTAR||LA6_0==FLOAT||LA6_0==INT||(LA6_0 >= LBRACK && LA6_0 <= LCURLY)||LA6_0==LONGINT||(LA6_0 >= LPAREN && LA6_0 <= MINUS)||LA6_0==NAME||LA6_0==NOT||LA6_0==PLUS||LA6_0==STAR||LA6_0==STRING||LA6_0==TILDE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:114:35: arglist
                            {
                            pushFollow(FOLLOW_arglist_in_decorator572);
                            arglist14=arglist();

                            state._fsp--;

                            adaptor.addChild(root_0, arglist14.getTree());

                            }
                            break;

                    }


                    RPAREN15=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_decorator575); 
                    RPAREN15_tree = 
                    (Object)adaptor.create(RPAREN15)
                    ;
                    adaptor.addChild(root_0, RPAREN15_tree);


                    }
                    break;

            }


            NEWLINE16=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decorator579); 
            NEWLINE16_tree = 
            (Object)adaptor.create(NEWLINE16)
            ;
            adaptor.addChild(root_0, NEWLINE16_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decorator"


    public static class dotted_attr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotted_attr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:117:1: dotted_attr : NAME ( DOT NAME )* ;
    public final PythonProvenanceParser.dotted_attr_return dotted_attr() throws RecognitionException {
        PythonProvenanceParser.dotted_attr_return retval = new PythonProvenanceParser.dotted_attr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NAME17=null;
        Token DOT18=null;
        Token NAME19=null;

        Object NAME17_tree=null;
        Object DOT18_tree=null;
        Object NAME19_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:118:5: ( NAME ( DOT NAME )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:118:7: NAME ( DOT NAME )*
            {
            root_0 = (Object)adaptor.nil();


            NAME17=(Token)match(input,NAME,FOLLOW_NAME_in_dotted_attr601); 
            NAME17_tree = 
            (Object)adaptor.create(NAME17)
            ;
            adaptor.addChild(root_0, NAME17_tree);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:118:12: ( DOT NAME )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:118:13: DOT NAME
            	    {
            	    DOT18=(Token)match(input,DOT,FOLLOW_DOT_in_dotted_attr604); 
            	    DOT18_tree = 
            	    (Object)adaptor.create(DOT18)
            	    ;
            	    adaptor.addChild(root_0, DOT18_tree);


            	    NAME19=(Token)match(input,NAME,FOLLOW_NAME_in_dotted_attr606); 
            	    NAME19_tree = 
            	    (Object)adaptor.create(NAME19)
            	    ;
            	    adaptor.addChild(root_0, NAME19_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dotted_attr"


    public static class funcdef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcdef"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:121:1: funcdef : ( decorators )? ref= 'def' id1= NAME parameters COLON suite -> ^( OUTER_FUNCTION_CMD[$ref] $id1 ( parameters )? suite ) ;
    public final PythonProvenanceParser.funcdef_return funcdef() throws RecognitionException {
        PythonProvenanceParser.funcdef_return retval = new PythonProvenanceParser.funcdef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token id1=null;
        Token COLON22=null;
        PythonProvenanceParser.decorators_return decorators20 =null;

        PythonProvenanceParser.parameters_return parameters21 =null;

        PythonProvenanceParser.suite_return suite23 =null;


        Object ref_tree=null;
        Object id1_tree=null;
        Object COLON22_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_decorators=new RewriteRuleSubtreeStream(adaptor,"rule decorators");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:121:9: ( ( decorators )? ref= 'def' id1= NAME parameters COLON suite -> ^( OUTER_FUNCTION_CMD[$ref] $id1 ( parameters )? suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:121:11: ( decorators )? ref= 'def' id1= NAME parameters COLON suite
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:121:11: ( decorators )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==AT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:121:11: decorators
                    {
                    pushFollow(FOLLOW_decorators_in_funcdef622);
                    decorators20=decorators();

                    state._fsp--;

                    stream_decorators.add(decorators20.getTree());

                    }
                    break;

            }


            ref=(Token)match(input,131,FOLLOW_131_in_funcdef627);  
            stream_131.add(ref);


            id1=(Token)match(input,NAME,FOLLOW_NAME_in_funcdef631);  
            stream_NAME.add(id1);


            pushFollow(FOLLOW_parameters_in_funcdef633);
            parameters21=parameters();

            state._fsp--;

            stream_parameters.add(parameters21.getTree());

            COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_funcdef635);  
            stream_COLON.add(COLON22);


            pushFollow(FOLLOW_suite_in_funcdef637);
            suite23=suite();

            state._fsp--;

            stream_suite.add(suite23.getTree());

            // AST REWRITE
            // elements: id1, suite, parameters
            // token labels: id1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 121:65: -> ^( OUTER_FUNCTION_CMD[$ref] $id1 ( parameters )? suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:121:68: ^( OUTER_FUNCTION_CMD[$ref] $id1 ( parameters )? suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OUTER_FUNCTION_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_id1.nextNode());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:121:100: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcdef"


    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:124:1: parameters : LPAREN ! ( varargslist )? RPAREN !;
    public final PythonProvenanceParser.parameters_return parameters() throws RecognitionException {
        PythonProvenanceParser.parameters_return retval = new PythonProvenanceParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN24=null;
        Token RPAREN26=null;
        PythonProvenanceParser.varargslist_return varargslist25 =null;


        Object LPAREN24_tree=null;
        Object RPAREN26_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:124:12: ( LPAREN ! ( varargslist )? RPAREN !)
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:124:14: LPAREN ! ( varargslist )? RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameters669); 

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:124:22: ( varargslist )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BACKQUOTE||LA10_0==DOTTED_NAME||LA10_0==DOUBLESTAR||LA10_0==FLOAT||LA10_0==INT||(LA10_0 >= LBRACK && LA10_0 <= LCURLY)||LA10_0==LONGINT||(LA10_0 >= LPAREN && LA10_0 <= MINUS)||LA10_0==NAME||LA10_0==NOT||LA10_0==PLUS||LA10_0==STAR||LA10_0==STRING||LA10_0==TILDE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:124:23: varargslist
                    {
                    pushFollow(FOLLOW_varargslist_in_parameters673);
                    varargslist25=varargslist();

                    state._fsp--;

                    adaptor.addChild(root_0, varargslist25.getTree());

                    }
                    break;

            }


            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameters677); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class varargslist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varargslist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:127:1: varargslist : ( defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )? -> ^( OUTER_FUNCTION_ARGS ( defparameter )+ ) | STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME );
    public final PythonProvenanceParser.varargslist_return varargslist() throws RecognitionException {
        PythonProvenanceParser.varargslist_return retval = new PythonProvenanceParser.varargslist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA28=null;
        Token COMMA30=null;
        Token STAR31=null;
        Token NAME32=null;
        Token COMMA33=null;
        Token DOUBLESTAR34=null;
        Token NAME35=null;
        Token DOUBLESTAR36=null;
        Token NAME37=null;
        Token STAR38=null;
        Token NAME39=null;
        Token COMMA40=null;
        Token DOUBLESTAR41=null;
        Token NAME42=null;
        Token DOUBLESTAR43=null;
        Token NAME44=null;
        PythonProvenanceParser.defparameter_return defparameter27 =null;

        PythonProvenanceParser.defparameter_return defparameter29 =null;


        Object COMMA28_tree=null;
        Object COMMA30_tree=null;
        Object STAR31_tree=null;
        Object NAME32_tree=null;
        Object COMMA33_tree=null;
        Object DOUBLESTAR34_tree=null;
        Object NAME35_tree=null;
        Object DOUBLESTAR36_tree=null;
        Object NAME37_tree=null;
        Object STAR38_tree=null;
        Object NAME39_tree=null;
        Object COMMA40_tree=null;
        Object DOUBLESTAR41_tree=null;
        Object NAME42_tree=null;
        Object DOUBLESTAR43_tree=null;
        Object NAME44_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DOUBLESTAR=new RewriteRuleTokenStream(adaptor,"token DOUBLESTAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_defparameter=new RewriteRuleSubtreeStream(adaptor,"rule defparameter");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:127:13: ( defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )? -> ^( OUTER_FUNCTION_ARGS ( defparameter )+ ) | STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )
            int alt16=3;
            switch ( input.LA(1) ) {
            case BACKQUOTE:
            case DOTTED_NAME:
            case FLOAT:
            case INT:
            case LBRACK:
            case LCURLY:
            case LONGINT:
            case LPAREN:
            case MINUS:
            case NAME:
            case NOT:
            case PLUS:
            case STRING:
            case TILDE:
                {
                alt16=1;
                }
                break;
            case STAR:
                {
                alt16=2;
                }
                break;
            case DOUBLESTAR:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:127:15: defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )?
                    {
                    pushFollow(FOLLOW_defparameter_in_varargslist699);
                    defparameter27=defparameter();

                    state._fsp--;

                    stream_defparameter.add(defparameter27.getTree());

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:127:28: ( options {greedy=true; } : COMMA defparameter )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==BACKQUOTE||LA11_1==DOTTED_NAME||LA11_1==FLOAT||LA11_1==INT||(LA11_1 >= LBRACK && LA11_1 <= LCURLY)||LA11_1==LONGINT||(LA11_1 >= LPAREN && LA11_1 <= MINUS)||LA11_1==NAME||LA11_1==NOT||LA11_1==PLUS||LA11_1==STRING||LA11_1==TILDE) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:127:52: COMMA defparameter
                    	    {
                    	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_varargslist709);  
                    	    stream_COMMA.add(COMMA28);


                    	    pushFollow(FOLLOW_defparameter_in_varargslist711);
                    	    defparameter29=defparameter();

                    	    state._fsp--;

                    	    stream_defparameter.add(defparameter29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:128:15: ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==COMMA) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:128:16: COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )?
                            {
                            COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_varargslist730);  
                            stream_COMMA.add(COMMA30);


                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:129:19: ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )?
                            int alt13=3;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==STAR) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==DOUBLESTAR) ) {
                                alt13=2;
                            }
                            switch (alt13) {
                                case 1 :
                                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:129:21: STAR NAME ( COMMA DOUBLESTAR NAME )?
                                    {
                                    STAR31=(Token)match(input,STAR,FOLLOW_STAR_in_varargslist752);  
                                    stream_STAR.add(STAR31);


                                    NAME32=(Token)match(input,NAME,FOLLOW_NAME_in_varargslist754);  
                                    stream_NAME.add(NAME32);


                                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:129:31: ( COMMA DOUBLESTAR NAME )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( (LA12_0==COMMA) ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:129:32: COMMA DOUBLESTAR NAME
                                            {
                                            COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_varargslist757);  
                                            stream_COMMA.add(COMMA33);


                                            DOUBLESTAR34=(Token)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist759);  
                                            stream_DOUBLESTAR.add(DOUBLESTAR34);


                                            NAME35=(Token)match(input,NAME,FOLLOW_NAME_in_varargslist761);  
                                            stream_NAME.add(NAME35);


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:130:21: DOUBLESTAR NAME
                                    {
                                    DOUBLESTAR36=(Token)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist785);  
                                    stream_DOUBLESTAR.add(DOUBLESTAR36);


                                    NAME37=(Token)match(input,NAME,FOLLOW_NAME_in_varargslist787);  
                                    stream_NAME.add(NAME37);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: defparameter
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:18: -> ^( OUTER_FUNCTION_ARGS ( defparameter )+ )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:132:21: ^( OUTER_FUNCTION_ARGS ( defparameter )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(OUTER_FUNCTION_ARGS, "OUTER_FUNCTION_ARGS")
                        , root_1);

                        if ( !(stream_defparameter.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_defparameter.hasNext() ) {
                            adaptor.addChild(root_1, stream_defparameter.nextTree());

                        }
                        stream_defparameter.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:133:15: STAR NAME ( COMMA DOUBLESTAR NAME )?
                    {
                    root_0 = (Object)adaptor.nil();


                    STAR38=(Token)match(input,STAR,FOLLOW_STAR_in_varargslist850); 
                    STAR38_tree = 
                    (Object)adaptor.create(STAR38)
                    ;
                    adaptor.addChild(root_0, STAR38_tree);


                    NAME39=(Token)match(input,NAME,FOLLOW_NAME_in_varargslist852); 
                    NAME39_tree = 
                    (Object)adaptor.create(NAME39)
                    ;
                    adaptor.addChild(root_0, NAME39_tree);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:133:25: ( COMMA DOUBLESTAR NAME )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==COMMA) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:133:26: COMMA DOUBLESTAR NAME
                            {
                            COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_varargslist855); 
                            COMMA40_tree = 
                            (Object)adaptor.create(COMMA40)
                            ;
                            adaptor.addChild(root_0, COMMA40_tree);


                            DOUBLESTAR41=(Token)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist857); 
                            DOUBLESTAR41_tree = 
                            (Object)adaptor.create(DOUBLESTAR41)
                            ;
                            adaptor.addChild(root_0, DOUBLESTAR41_tree);


                            NAME42=(Token)match(input,NAME,FOLLOW_NAME_in_varargslist859); 
                            NAME42_tree = 
                            (Object)adaptor.create(NAME42)
                            ;
                            adaptor.addChild(root_0, NAME42_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:134:15: DOUBLESTAR NAME
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLESTAR43=(Token)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist878); 
                    DOUBLESTAR43_tree = 
                    (Object)adaptor.create(DOUBLESTAR43)
                    ;
                    adaptor.addChild(root_0, DOUBLESTAR43_tree);


                    NAME44=(Token)match(input,NAME,FOLLOW_NAME_in_varargslist880); 
                    NAME44_tree = 
                    (Object)adaptor.create(NAME44)
                    ;
                    adaptor.addChild(root_0, NAME44_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varargslist"


    public static class defparameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defparameter"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:137:1: defparameter : test ( ASSIGN test )? ;
    public final PythonProvenanceParser.defparameter_return defparameter() throws RecognitionException {
        PythonProvenanceParser.defparameter_return retval = new PythonProvenanceParser.defparameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN46=null;
        PythonProvenanceParser.test_return test45 =null;

        PythonProvenanceParser.test_return test47 =null;


        Object ASSIGN46_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:137:14: ( test ( ASSIGN test )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:137:16: test ( ASSIGN test )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_test_in_defparameter902);
            test45=test();

            state._fsp--;

            adaptor.addChild(root_0, test45.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:137:21: ( ASSIGN test )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ASSIGN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:137:22: ASSIGN test
                    {
                    ASSIGN46=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_defparameter905); 
                    ASSIGN46_tree = 
                    (Object)adaptor.create(ASSIGN46)
                    ;
                    adaptor.addChild(root_0, ASSIGN46_tree);


                    pushFollow(FOLLOW_test_in_defparameter907);
                    test47=test();

                    state._fsp--;

                    adaptor.addChild(root_0, test47.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "defparameter"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:140:1: stmt : ( simple_stmt | compound_stmt );
    public final PythonProvenanceParser.stmt_return stmt() throws RecognitionException {
        PythonProvenanceParser.stmt_return retval = new PythonProvenanceParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.simple_stmt_return simple_stmt48 =null;

        PythonProvenanceParser.compound_stmt_return compound_stmt49 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:140:6: ( simple_stmt | compound_stmt )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BACKQUOTE||LA18_0==DOTTED_NAME||LA18_0==FLOAT||LA18_0==INT||(LA18_0 >= LBRACK && LA18_0 <= LCURLY)||LA18_0==LONGINT||(LA18_0 >= LPAREN && LA18_0 <= MINUS)||LA18_0==NAME||LA18_0==NOT||LA18_0==PLUS||LA18_0==PRINT||LA18_0==STRING||LA18_0==TILDE||(LA18_0 >= 127 && LA18_0 <= 128)||LA18_0==130||LA18_0==132||LA18_0==136||(LA18_0 >= 139 && LA18_0 <= 144)) ) {
                alt18=1;
            }
            else if ( (LA18_0==AT||LA18_0==IF||LA18_0==129||LA18_0==131||LA18_0==138||(LA18_0 >= 145 && LA18_0 <= 147)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:140:8: simple_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simple_stmt_in_stmt933);
                    simple_stmt48=simple_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_stmt48.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:141:8: compound_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_stmt_in_stmt943);
                    compound_stmt49=compound_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, compound_stmt49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class stmt_inside_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_inside_block"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:144:1: stmt_inside_block : ( simple_stmt | compound_stmt );
    public final PythonProvenanceParser.stmt_inside_block_return stmt_inside_block() throws RecognitionException {
        PythonProvenanceParser.stmt_inside_block_return retval = new PythonProvenanceParser.stmt_inside_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.simple_stmt_return simple_stmt50 =null;

        PythonProvenanceParser.compound_stmt_return compound_stmt51 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:145:3: ( simple_stmt | compound_stmt )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==BACKQUOTE||LA19_0==DOTTED_NAME||LA19_0==FLOAT||LA19_0==INT||(LA19_0 >= LBRACK && LA19_0 <= LCURLY)||LA19_0==LONGINT||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==NAME||LA19_0==NOT||LA19_0==PLUS||LA19_0==PRINT||LA19_0==STRING||LA19_0==TILDE||(LA19_0 >= 127 && LA19_0 <= 128)||LA19_0==130||LA19_0==132||LA19_0==136||(LA19_0 >= 139 && LA19_0 <= 144)) ) {
                alt19=1;
            }
            else if ( (LA19_0==AT||LA19_0==IF||LA19_0==129||LA19_0==131||LA19_0==138||(LA19_0 >= 145 && LA19_0 <= 147)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:145:5: simple_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simple_stmt_in_stmt_inside_block965);
                    simple_stmt50=simple_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_stmt50.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:146:9: compound_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compound_stmt_in_stmt_inside_block976);
                    compound_stmt51=compound_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, compound_stmt51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt_inside_block"


    public static class simple_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:149:1: simple_stmt : small_stmt ( NEWLINE !) ;
    public final PythonProvenanceParser.simple_stmt_return simple_stmt() throws RecognitionException {
        PythonProvenanceParser.simple_stmt_return retval = new PythonProvenanceParser.simple_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE53=null;
        PythonProvenanceParser.small_stmt_return small_stmt52 =null;


        Object NEWLINE53_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:150:3: ( small_stmt ( NEWLINE !) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:150:5: small_stmt ( NEWLINE !)
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_small_stmt_in_simple_stmt993);
            small_stmt52=small_stmt();

            state._fsp--;

            adaptor.addChild(root_0, small_stmt52.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:150:16: ( NEWLINE !)
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:150:17: NEWLINE !
            {
            NEWLINE53=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_simple_stmt996); 

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_stmt"


    public static class small_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "small_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:153:1: small_stmt : ( expr_stmt | print_stmt | del_stmt ->| pass_stmt ->| flow_stmt | import_stmt | global_stmt ->| exec_stmt ->| assert_stmt ->);
    public final PythonProvenanceParser.small_stmt_return small_stmt() throws RecognitionException {
        PythonProvenanceParser.small_stmt_return retval = new PythonProvenanceParser.small_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.expr_stmt_return expr_stmt54 =null;

        PythonProvenanceParser.print_stmt_return print_stmt55 =null;

        PythonProvenanceParser.del_stmt_return del_stmt56 =null;

        PythonProvenanceParser.pass_stmt_return pass_stmt57 =null;

        PythonProvenanceParser.flow_stmt_return flow_stmt58 =null;

        PythonProvenanceParser.import_stmt_return import_stmt59 =null;

        PythonProvenanceParser.global_stmt_return global_stmt60 =null;

        PythonProvenanceParser.exec_stmt_return exec_stmt61 =null;

        PythonProvenanceParser.assert_stmt_return assert_stmt62 =null;


        RewriteRuleSubtreeStream stream_global_stmt=new RewriteRuleSubtreeStream(adaptor,"rule global_stmt");
        RewriteRuleSubtreeStream stream_pass_stmt=new RewriteRuleSubtreeStream(adaptor,"rule pass_stmt");
        RewriteRuleSubtreeStream stream_del_stmt=new RewriteRuleSubtreeStream(adaptor,"rule del_stmt");
        RewriteRuleSubtreeStream stream_assert_stmt=new RewriteRuleSubtreeStream(adaptor,"rule assert_stmt");
        RewriteRuleSubtreeStream stream_exec_stmt=new RewriteRuleSubtreeStream(adaptor,"rule exec_stmt");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:153:12: ( expr_stmt | print_stmt | del_stmt ->| pass_stmt ->| flow_stmt | import_stmt | global_stmt ->| exec_stmt ->| assert_stmt ->)
            int alt20=9;
            switch ( input.LA(1) ) {
            case BACKQUOTE:
            case DOTTED_NAME:
            case FLOAT:
            case INT:
            case LBRACK:
            case LCURLY:
            case LONGINT:
            case LPAREN:
            case MINUS:
            case NAME:
            case NOT:
            case PLUS:
            case STRING:
            case TILDE:
                {
                alt20=1;
                }
                break;
            case PRINT:
                {
                alt20=2;
                }
                break;
            case 132:
                {
                alt20=3;
                }
                break;
            case 142:
                {
                alt20=4;
                }
                break;
            case 128:
            case 130:
            case 143:
            case 144:
                {
                alt20=5;
                }
                break;
            case 139:
            case 141:
                {
                alt20=6;
                }
                break;
            case 140:
                {
                alt20=7;
                }
                break;
            case 136:
                {
                alt20=8;
                }
                break;
            case 127:
                {
                alt20=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:153:14: expr_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_stmt_in_small_stmt1009);
                    expr_stmt54=expr_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_stmt54.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:154:14: print_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_print_stmt_in_small_stmt1024);
                    print_stmt55=print_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, print_stmt55.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:155:14: del_stmt
                    {
                    pushFollow(FOLLOW_del_stmt_in_small_stmt1040);
                    del_stmt56=del_stmt();

                    state._fsp--;

                    stream_del_stmt.add(del_stmt56.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:23: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:156:14: pass_stmt
                    {
                    pushFollow(FOLLOW_pass_stmt_in_small_stmt1058);
                    pass_stmt57=pass_stmt();

                    state._fsp--;

                    stream_pass_stmt.add(pass_stmt57.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:24: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:157:14: flow_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_flow_stmt_in_small_stmt1075);
                    flow_stmt58=flow_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, flow_stmt58.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:158:14: import_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_stmt_in_small_stmt1091);
                    import_stmt59=import_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, import_stmt59.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:159:14: global_stmt
                    {
                    pushFollow(FOLLOW_global_stmt_in_small_stmt1106);
                    global_stmt60=global_stmt();

                    state._fsp--;

                    stream_global_stmt.add(global_stmt60.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:26: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:160:14: exec_stmt
                    {
                    pushFollow(FOLLOW_exec_stmt_in_small_stmt1123);
                    exec_stmt61=exec_stmt();

                    state._fsp--;

                    stream_exec_stmt.add(exec_stmt61.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:24: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:161:14: assert_stmt
                    {
                    pushFollow(FOLLOW_assert_stmt_in_small_stmt1140);
                    assert_stmt62=assert_stmt();

                    state._fsp--;

                    stream_assert_stmt.add(assert_stmt62.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:26: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "small_stmt"


    public static class expr_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:164:1: expr_stmt : testlist ( ( ASSIGN ^| PLUSEQUAL ^| MINUSEQUAL ^| STAREQUAL ^| SLASHEQUAL ^| PERCENTEQUAL ^| AMPEREQUAL ^| VBAREQUAL ^| CIRCUMFLEXEQUAL ^| LEFTSHIFTEQUAL ^| RIGHTSHIFTEQUAL ^| DOUBLESTAREQUAL ^| DOUBLESLASHEQUAL ^) testlist )? ;
    public final PythonProvenanceParser.expr_stmt_return expr_stmt() throws RecognitionException {
        PythonProvenanceParser.expr_stmt_return retval = new PythonProvenanceParser.expr_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN64=null;
        Token PLUSEQUAL65=null;
        Token MINUSEQUAL66=null;
        Token STAREQUAL67=null;
        Token SLASHEQUAL68=null;
        Token PERCENTEQUAL69=null;
        Token AMPEREQUAL70=null;
        Token VBAREQUAL71=null;
        Token CIRCUMFLEXEQUAL72=null;
        Token LEFTSHIFTEQUAL73=null;
        Token RIGHTSHIFTEQUAL74=null;
        Token DOUBLESTAREQUAL75=null;
        Token DOUBLESLASHEQUAL76=null;
        PythonProvenanceParser.testlist_return testlist63 =null;

        PythonProvenanceParser.testlist_return testlist77 =null;


        Object ASSIGN64_tree=null;
        Object PLUSEQUAL65_tree=null;
        Object MINUSEQUAL66_tree=null;
        Object STAREQUAL67_tree=null;
        Object SLASHEQUAL68_tree=null;
        Object PERCENTEQUAL69_tree=null;
        Object AMPEREQUAL70_tree=null;
        Object VBAREQUAL71_tree=null;
        Object CIRCUMFLEXEQUAL72_tree=null;
        Object LEFTSHIFTEQUAL73_tree=null;
        Object RIGHTSHIFTEQUAL74_tree=null;
        Object DOUBLESTAREQUAL75_tree=null;
        Object DOUBLESLASHEQUAL76_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:164:11: ( testlist ( ( ASSIGN ^| PLUSEQUAL ^| MINUSEQUAL ^| STAREQUAL ^| SLASHEQUAL ^| PERCENTEQUAL ^| AMPEREQUAL ^| VBAREQUAL ^| CIRCUMFLEXEQUAL ^| LEFTSHIFTEQUAL ^| RIGHTSHIFTEQUAL ^| DOUBLESTAREQUAL ^| DOUBLESLASHEQUAL ^) testlist )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:164:13: testlist ( ( ASSIGN ^| PLUSEQUAL ^| MINUSEQUAL ^| STAREQUAL ^| SLASHEQUAL ^| PERCENTEQUAL ^| AMPEREQUAL ^| VBAREQUAL ^| CIRCUMFLEXEQUAL ^| LEFTSHIFTEQUAL ^| RIGHTSHIFTEQUAL ^| DOUBLESTAREQUAL ^| DOUBLESLASHEQUAL ^) testlist )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_testlist_in_expr_stmt1155);
            testlist63=testlist();

            state._fsp--;

            adaptor.addChild(root_0, testlist63.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:164:22: ( ( ASSIGN ^| PLUSEQUAL ^| MINUSEQUAL ^| STAREQUAL ^| SLASHEQUAL ^| PERCENTEQUAL ^| AMPEREQUAL ^| VBAREQUAL ^| CIRCUMFLEXEQUAL ^| LEFTSHIFTEQUAL ^| RIGHTSHIFTEQUAL ^| DOUBLESTAREQUAL ^| DOUBLESLASHEQUAL ^) testlist )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AMPEREQUAL||LA22_0==ASSIGN||LA22_0==CIRCUMFLEXEQUAL||LA22_0==DOUBLESLASHEQUAL||LA22_0==DOUBLESTAREQUAL||LA22_0==LEFTSHIFTEQUAL||LA22_0==MINUSEQUAL||LA22_0==PERCENTEQUAL||LA22_0==PLUSEQUAL||LA22_0==RIGHTSHIFTEQUAL||LA22_0==SLASHEQUAL||LA22_0==STAREQUAL||LA22_0==VBAREQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:165:5: ( ASSIGN ^| PLUSEQUAL ^| MINUSEQUAL ^| STAREQUAL ^| SLASHEQUAL ^| PERCENTEQUAL ^| AMPEREQUAL ^| VBAREQUAL ^| CIRCUMFLEXEQUAL ^| LEFTSHIFTEQUAL ^| RIGHTSHIFTEQUAL ^| DOUBLESTAREQUAL ^| DOUBLESLASHEQUAL ^) testlist
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:165:5: ( ASSIGN ^| PLUSEQUAL ^| MINUSEQUAL ^| STAREQUAL ^| SLASHEQUAL ^| PERCENTEQUAL ^| AMPEREQUAL ^| VBAREQUAL ^| CIRCUMFLEXEQUAL ^| LEFTSHIFTEQUAL ^| RIGHTSHIFTEQUAL ^| DOUBLESTAREQUAL ^| DOUBLESLASHEQUAL ^)
                    int alt21=13;
                    switch ( input.LA(1) ) {
                    case ASSIGN:
                        {
                        alt21=1;
                        }
                        break;
                    case PLUSEQUAL:
                        {
                        alt21=2;
                        }
                        break;
                    case MINUSEQUAL:
                        {
                        alt21=3;
                        }
                        break;
                    case STAREQUAL:
                        {
                        alt21=4;
                        }
                        break;
                    case SLASHEQUAL:
                        {
                        alt21=5;
                        }
                        break;
                    case PERCENTEQUAL:
                        {
                        alt21=6;
                        }
                        break;
                    case AMPEREQUAL:
                        {
                        alt21=7;
                        }
                        break;
                    case VBAREQUAL:
                        {
                        alt21=8;
                        }
                        break;
                    case CIRCUMFLEXEQUAL:
                        {
                        alt21=9;
                        }
                        break;
                    case LEFTSHIFTEQUAL:
                        {
                        alt21=10;
                        }
                        break;
                    case RIGHTSHIFTEQUAL:
                        {
                        alt21=11;
                        }
                        break;
                    case DOUBLESTAREQUAL:
                        {
                        alt21=12;
                        }
                        break;
                    case DOUBLESLASHEQUAL:
                        {
                        alt21=13;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:165:7: ASSIGN ^
                            {
                            ASSIGN64=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_stmt1166); 
                            ASSIGN64_tree = 
                            (Object)adaptor.create(ASSIGN64)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(ASSIGN64_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:166:7: PLUSEQUAL ^
                            {
                            PLUSEQUAL65=(Token)match(input,PLUSEQUAL,FOLLOW_PLUSEQUAL_in_expr_stmt1175); 
                            PLUSEQUAL65_tree = 
                            (Object)adaptor.create(PLUSEQUAL65)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSEQUAL65_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:167:7: MINUSEQUAL ^
                            {
                            MINUSEQUAL66=(Token)match(input,MINUSEQUAL,FOLLOW_MINUSEQUAL_in_expr_stmt1184); 
                            MINUSEQUAL66_tree = 
                            (Object)adaptor.create(MINUSEQUAL66)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(MINUSEQUAL66_tree, root_0);


                            }
                            break;
                        case 4 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:168:7: STAREQUAL ^
                            {
                            STAREQUAL67=(Token)match(input,STAREQUAL,FOLLOW_STAREQUAL_in_expr_stmt1193); 
                            STAREQUAL67_tree = 
                            (Object)adaptor.create(STAREQUAL67)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(STAREQUAL67_tree, root_0);


                            }
                            break;
                        case 5 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:169:7: SLASHEQUAL ^
                            {
                            SLASHEQUAL68=(Token)match(input,SLASHEQUAL,FOLLOW_SLASHEQUAL_in_expr_stmt1202); 
                            SLASHEQUAL68_tree = 
                            (Object)adaptor.create(SLASHEQUAL68)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SLASHEQUAL68_tree, root_0);


                            }
                            break;
                        case 6 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:170:7: PERCENTEQUAL ^
                            {
                            PERCENTEQUAL69=(Token)match(input,PERCENTEQUAL,FOLLOW_PERCENTEQUAL_in_expr_stmt1211); 
                            PERCENTEQUAL69_tree = 
                            (Object)adaptor.create(PERCENTEQUAL69)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PERCENTEQUAL69_tree, root_0);


                            }
                            break;
                        case 7 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:171:7: AMPEREQUAL ^
                            {
                            AMPEREQUAL70=(Token)match(input,AMPEREQUAL,FOLLOW_AMPEREQUAL_in_expr_stmt1220); 
                            AMPEREQUAL70_tree = 
                            (Object)adaptor.create(AMPEREQUAL70)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(AMPEREQUAL70_tree, root_0);


                            }
                            break;
                        case 8 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:172:7: VBAREQUAL ^
                            {
                            VBAREQUAL71=(Token)match(input,VBAREQUAL,FOLLOW_VBAREQUAL_in_expr_stmt1229); 
                            VBAREQUAL71_tree = 
                            (Object)adaptor.create(VBAREQUAL71)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(VBAREQUAL71_tree, root_0);


                            }
                            break;
                        case 9 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:173:7: CIRCUMFLEXEQUAL ^
                            {
                            CIRCUMFLEXEQUAL72=(Token)match(input,CIRCUMFLEXEQUAL,FOLLOW_CIRCUMFLEXEQUAL_in_expr_stmt1238); 
                            CIRCUMFLEXEQUAL72_tree = 
                            (Object)adaptor.create(CIRCUMFLEXEQUAL72)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(CIRCUMFLEXEQUAL72_tree, root_0);


                            }
                            break;
                        case 10 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:174:7: LEFTSHIFTEQUAL ^
                            {
                            LEFTSHIFTEQUAL73=(Token)match(input,LEFTSHIFTEQUAL,FOLLOW_LEFTSHIFTEQUAL_in_expr_stmt1247); 
                            LEFTSHIFTEQUAL73_tree = 
                            (Object)adaptor.create(LEFTSHIFTEQUAL73)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(LEFTSHIFTEQUAL73_tree, root_0);


                            }
                            break;
                        case 11 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:175:7: RIGHTSHIFTEQUAL ^
                            {
                            RIGHTSHIFTEQUAL74=(Token)match(input,RIGHTSHIFTEQUAL,FOLLOW_RIGHTSHIFTEQUAL_in_expr_stmt1256); 
                            RIGHTSHIFTEQUAL74_tree = 
                            (Object)adaptor.create(RIGHTSHIFTEQUAL74)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(RIGHTSHIFTEQUAL74_tree, root_0);


                            }
                            break;
                        case 12 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:176:7: DOUBLESTAREQUAL ^
                            {
                            DOUBLESTAREQUAL75=(Token)match(input,DOUBLESTAREQUAL,FOLLOW_DOUBLESTAREQUAL_in_expr_stmt1265); 
                            DOUBLESTAREQUAL75_tree = 
                            (Object)adaptor.create(DOUBLESTAREQUAL75)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(DOUBLESTAREQUAL75_tree, root_0);


                            }
                            break;
                        case 13 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:177:7: DOUBLESLASHEQUAL ^
                            {
                            DOUBLESLASHEQUAL76=(Token)match(input,DOUBLESLASHEQUAL,FOLLOW_DOUBLESLASHEQUAL_in_expr_stmt1274); 
                            DOUBLESLASHEQUAL76_tree = 
                            (Object)adaptor.create(DOUBLESLASHEQUAL76)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(DOUBLESLASHEQUAL76_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_testlist_in_expr_stmt1288);
                    testlist77=testlist();

                    state._fsp--;

                    adaptor.addChild(root_0, testlist77.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_stmt"


    public static class print_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:182:1: print_stmt : ref= PRINT ( printlist | RIGHTSHIFT printlist )? -> ^( PRINT_CMD[$ref] printlist ) ;
    public final PythonProvenanceParser.print_stmt_return print_stmt() throws RecognitionException {
        PythonProvenanceParser.print_stmt_return retval = new PythonProvenanceParser.print_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token RIGHTSHIFT79=null;
        PythonProvenanceParser.printlist_return printlist78 =null;

        PythonProvenanceParser.printlist_return printlist80 =null;


        Object ref_tree=null;
        Object RIGHTSHIFT79_tree=null;
        RewriteRuleTokenStream stream_RIGHTSHIFT=new RewriteRuleTokenStream(adaptor,"token RIGHTSHIFT");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_printlist=new RewriteRuleSubtreeStream(adaptor,"rule printlist");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:182:12: (ref= PRINT ( printlist | RIGHTSHIFT printlist )? -> ^( PRINT_CMD[$ref] printlist ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:182:14: ref= PRINT ( printlist | RIGHTSHIFT printlist )?
            {
            ref=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stmt1306);  
            stream_PRINT.add(ref);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:182:24: ( printlist | RIGHTSHIFT printlist )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BACKQUOTE||LA23_0==DOTTED_NAME||LA23_0==FLOAT||LA23_0==INT||(LA23_0 >= LBRACK && LA23_0 <= LCURLY)||LA23_0==LONGINT||(LA23_0 >= LPAREN && LA23_0 <= MINUS)||LA23_0==NAME||LA23_0==NOT||LA23_0==PLUS||LA23_0==STRING||LA23_0==TILDE) ) {
                alt23=1;
            }
            else if ( (LA23_0==RIGHTSHIFT) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:182:25: printlist
                    {
                    pushFollow(FOLLOW_printlist_in_print_stmt1309);
                    printlist78=printlist();

                    state._fsp--;

                    stream_printlist.add(printlist78.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:182:37: RIGHTSHIFT printlist
                    {
                    RIGHTSHIFT79=(Token)match(input,RIGHTSHIFT,FOLLOW_RIGHTSHIFT_in_print_stmt1313);  
                    stream_RIGHTSHIFT.add(RIGHTSHIFT79);


                    pushFollow(FOLLOW_printlist_in_print_stmt1315);
                    printlist80=printlist();

                    state._fsp--;

                    stream_printlist.add(printlist80.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: printlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 182:60: -> ^( PRINT_CMD[$ref] printlist )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:182:63: ^( PRINT_CMD[$ref] printlist )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PRINT_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_printlist.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print_stmt"


    public static class printlist_return extends ParserRuleReturnScope {
        public boolean newline;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:185:1: printlist returns [boolean newline] : print_argument ( options {k=2; } : COMMA print_argument )* ( COMMA )? -> ^( PRINT_ARGS ( print_argument )+ ) ;
    public final PythonProvenanceParser.printlist_return printlist() throws RecognitionException {
        PythonProvenanceParser.printlist_return retval = new PythonProvenanceParser.printlist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA82=null;
        Token COMMA84=null;
        PythonProvenanceParser.print_argument_return print_argument81 =null;

        PythonProvenanceParser.print_argument_return print_argument83 =null;


        Object COMMA82_tree=null;
        Object COMMA84_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_print_argument=new RewriteRuleSubtreeStream(adaptor,"rule print_argument");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:186:5: ( print_argument ( options {k=2; } : COMMA print_argument )* ( COMMA )? -> ^( PRINT_ARGS ( print_argument )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:186:7: print_argument ( options {k=2; } : COMMA print_argument )* ( COMMA )?
            {
            pushFollow(FOLLOW_print_argument_in_printlist1354);
            print_argument81=print_argument();

            state._fsp--;

            stream_print_argument.add(print_argument81.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:186:22: ( options {k=2; } : COMMA print_argument )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==BACKQUOTE||LA24_1==DOTTED_NAME||LA24_1==FLOAT||LA24_1==INT||(LA24_1 >= LBRACK && LA24_1 <= LCURLY)||LA24_1==LONGINT||(LA24_1 >= LPAREN && LA24_1 <= MINUS)||LA24_1==NAME||LA24_1==NOT||LA24_1==PLUS||LA24_1==STRING||LA24_1==TILDE) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:186:39: COMMA print_argument
            	    {
            	    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_printlist1365);  
            	    stream_COMMA.add(COMMA82);


            	    pushFollow(FOLLOW_print_argument_in_printlist1367);
            	    print_argument83=print_argument();

            	    state._fsp--;

            	    stream_print_argument.add(print_argument83.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:186:62: ( COMMA )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==COMMA) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:186:63: COMMA
                    {
                    COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_printlist1372);  
                    stream_COMMA.add(COMMA84);


                    }
                    break;

            }


            // AST REWRITE
            // elements: print_argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 186:71: -> ^( PRINT_ARGS ( print_argument )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:186:74: ^( PRINT_ARGS ( print_argument )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PRINT_ARGS, "PRINT_ARGS")
                , root_1);

                if ( !(stream_print_argument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_print_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_print_argument.nextTree());

                }
                stream_print_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printlist"


    public static class del_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "del_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:190:1: del_stmt : 'del' exprlist ;
    public final PythonProvenanceParser.del_stmt_return del_stmt() throws RecognitionException {
        PythonProvenanceParser.del_stmt_return retval = new PythonProvenanceParser.del_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal85=null;
        PythonProvenanceParser.exprlist_return exprlist86 =null;


        Object string_literal85_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:190:10: ( 'del' exprlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:190:12: 'del' exprlist
            {
            root_0 = (Object)adaptor.nil();


            string_literal85=(Token)match(input,132,FOLLOW_132_in_del_stmt1397); 
            string_literal85_tree = 
            (Object)adaptor.create(string_literal85)
            ;
            adaptor.addChild(root_0, string_literal85_tree);


            pushFollow(FOLLOW_exprlist_in_del_stmt1399);
            exprlist86=exprlist();

            state._fsp--;

            adaptor.addChild(root_0, exprlist86.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "del_stmt"


    public static class pass_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pass_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:193:1: pass_stmt : 'pass' ;
    public final PythonProvenanceParser.pass_stmt_return pass_stmt() throws RecognitionException {
        PythonProvenanceParser.pass_stmt_return retval = new PythonProvenanceParser.pass_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal87=null;

        Object string_literal87_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:193:11: ( 'pass' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:193:13: 'pass'
            {
            root_0 = (Object)adaptor.nil();


            string_literal87=(Token)match(input,142,FOLLOW_142_in_pass_stmt1417); 
            string_literal87_tree = 
            (Object)adaptor.create(string_literal87)
            ;
            adaptor.addChild(root_0, string_literal87_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pass_stmt"


    public static class flow_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:196:1: flow_stmt : ( break_stmt ->| continue_stmt ->| return_stmt | raise_stmt ->);
    public final PythonProvenanceParser.flow_stmt_return flow_stmt() throws RecognitionException {
        PythonProvenanceParser.flow_stmt_return retval = new PythonProvenanceParser.flow_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.break_stmt_return break_stmt88 =null;

        PythonProvenanceParser.continue_stmt_return continue_stmt89 =null;

        PythonProvenanceParser.return_stmt_return return_stmt90 =null;

        PythonProvenanceParser.raise_stmt_return raise_stmt91 =null;


        RewriteRuleSubtreeStream stream_raise_stmt=new RewriteRuleSubtreeStream(adaptor,"rule raise_stmt");
        RewriteRuleSubtreeStream stream_break_stmt=new RewriteRuleSubtreeStream(adaptor,"rule break_stmt");
        RewriteRuleSubtreeStream stream_continue_stmt=new RewriteRuleSubtreeStream(adaptor,"rule continue_stmt");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:196:11: ( break_stmt ->| continue_stmt ->| return_stmt | raise_stmt ->)
            int alt26=4;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt26=1;
                }
                break;
            case 130:
                {
                alt26=2;
                }
                break;
            case 144:
                {
                alt26=3;
                }
                break;
            case 143:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:196:13: break_stmt
                    {
                    pushFollow(FOLLOW_break_stmt_in_flow_stmt1436);
                    break_stmt88=break_stmt();

                    state._fsp--;

                    stream_break_stmt.add(break_stmt88.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:24: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:197:13: continue_stmt
                    {
                    pushFollow(FOLLOW_continue_stmt_in_flow_stmt1452);
                    continue_stmt89=continue_stmt();

                    state._fsp--;

                    stream_continue_stmt.add(continue_stmt89.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:27: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:198:13: return_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_flow_stmt1468);
                    return_stmt90=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt90.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:199:13: raise_stmt
                    {
                    pushFollow(FOLLOW_raise_stmt_in_flow_stmt1482);
                    raise_stmt91=raise_stmt();

                    state._fsp--;

                    stream_raise_stmt.add(raise_stmt91.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:24: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flow_stmt"


    public static class break_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "break_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:202:1: break_stmt : 'break' ;
    public final PythonProvenanceParser.break_stmt_return break_stmt() throws RecognitionException {
        PythonProvenanceParser.break_stmt_return retval = new PythonProvenanceParser.break_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal92=null;

        Object string_literal92_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:202:12: ( 'break' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:202:14: 'break'
            {
            root_0 = (Object)adaptor.nil();


            string_literal92=(Token)match(input,128,FOLLOW_128_in_break_stmt1503); 
            string_literal92_tree = 
            (Object)adaptor.create(string_literal92)
            ;
            adaptor.addChild(root_0, string_literal92_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "break_stmt"


    public static class continue_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "continue_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:205:1: continue_stmt : 'continue' ;
    public final PythonProvenanceParser.continue_stmt_return continue_stmt() throws RecognitionException {
        PythonProvenanceParser.continue_stmt_return retval = new PythonProvenanceParser.continue_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal93=null;

        Object string_literal93_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:205:15: ( 'continue' )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:205:17: 'continue'
            {
            root_0 = (Object)adaptor.nil();


            string_literal93=(Token)match(input,130,FOLLOW_130_in_continue_stmt1523); 
            string_literal93_tree = 
            (Object)adaptor.create(string_literal93)
            ;
            adaptor.addChild(root_0, string_literal93_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "continue_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:208:1: return_stmt : ref= 'return' ( arglist )? -> ^( RETURN_CMD[$ref] ( arglist )? ) ;
    public final PythonProvenanceParser.return_stmt_return return_stmt() throws RecognitionException {
        PythonProvenanceParser.return_stmt_return retval = new PythonProvenanceParser.return_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        PythonProvenanceParser.arglist_return arglist94 =null;


        Object ref_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:208:13: (ref= 'return' ( arglist )? -> ^( RETURN_CMD[$ref] ( arglist )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:208:15: ref= 'return' ( arglist )?
            {
            ref=(Token)match(input,144,FOLLOW_144_in_return_stmt1548);  
            stream_144.add(ref);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:208:28: ( arglist )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==BACKQUOTE||LA27_0==DOTTED_NAME||LA27_0==DOUBLESTAR||LA27_0==FLOAT||LA27_0==INT||(LA27_0 >= LBRACK && LA27_0 <= LCURLY)||LA27_0==LONGINT||(LA27_0 >= LPAREN && LA27_0 <= MINUS)||LA27_0==NAME||LA27_0==NOT||LA27_0==PLUS||LA27_0==STAR||LA27_0==STRING||LA27_0==TILDE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:208:29: arglist
                    {
                    pushFollow(FOLLOW_arglist_in_return_stmt1551);
                    arglist94=arglist();

                    state._fsp--;

                    stream_arglist.add(arglist94.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: arglist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 208:39: -> ^( RETURN_CMD[$ref] ( arglist )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:208:42: ^( RETURN_CMD[$ref] ( arglist )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETURN_CMD, ref)
                , root_1);

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:208:61: ( arglist )?
                if ( stream_arglist.hasNext() ) {
                    adaptor.addChild(root_1, stream_arglist.nextTree());

                }
                stream_arglist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class raise_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "raise_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:1: raise_stmt : 'raise' ( test ( COMMA test ( COMMA test )? )? )? ;
    public final PythonProvenanceParser.raise_stmt_return raise_stmt() throws RecognitionException {
        PythonProvenanceParser.raise_stmt_return retval = new PythonProvenanceParser.raise_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal95=null;
        Token COMMA97=null;
        Token COMMA99=null;
        PythonProvenanceParser.test_return test96 =null;

        PythonProvenanceParser.test_return test98 =null;

        PythonProvenanceParser.test_return test100 =null;


        Object string_literal95_tree=null;
        Object COMMA97_tree=null;
        Object COMMA99_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:11: ( 'raise' ( test ( COMMA test ( COMMA test )? )? )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:13: 'raise' ( test ( COMMA test ( COMMA test )? )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal95=(Token)match(input,143,FOLLOW_143_in_raise_stmt1583); 
            string_literal95_tree = 
            (Object)adaptor.create(string_literal95)
            ;
            adaptor.addChild(root_0, string_literal95_tree);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:21: ( test ( COMMA test ( COMMA test )? )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BACKQUOTE||LA30_0==DOTTED_NAME||LA30_0==FLOAT||LA30_0==INT||(LA30_0 >= LBRACK && LA30_0 <= LCURLY)||LA30_0==LONGINT||(LA30_0 >= LPAREN && LA30_0 <= MINUS)||LA30_0==NAME||LA30_0==NOT||LA30_0==PLUS||LA30_0==STRING||LA30_0==TILDE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:22: test ( COMMA test ( COMMA test )? )?
                    {
                    pushFollow(FOLLOW_test_in_raise_stmt1586);
                    test96=test();

                    state._fsp--;

                    adaptor.addChild(root_0, test96.getTree());

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:27: ( COMMA test ( COMMA test )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==COMMA) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:28: COMMA test ( COMMA test )?
                            {
                            COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_stmt1589); 
                            COMMA97_tree = 
                            (Object)adaptor.create(COMMA97)
                            ;
                            adaptor.addChild(root_0, COMMA97_tree);


                            pushFollow(FOLLOW_test_in_raise_stmt1591);
                            test98=test();

                            state._fsp--;

                            adaptor.addChild(root_0, test98.getTree());

                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:39: ( COMMA test )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==COMMA) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:211:40: COMMA test
                                    {
                                    COMMA99=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_stmt1594); 
                                    COMMA99_tree = 
                                    (Object)adaptor.create(COMMA99)
                                    ;
                                    adaptor.addChild(root_0, COMMA99_tree);


                                    pushFollow(FOLLOW_test_in_raise_stmt1596);
                                    test100=test();

                                    state._fsp--;

                                    adaptor.addChild(root_0, test100.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "raise_stmt"


    public static class import_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:214:1: import_stmt : ( import_name | import_from );
    public final PythonProvenanceParser.import_stmt_return import_stmt() throws RecognitionException {
        PythonProvenanceParser.import_stmt_return retval = new PythonProvenanceParser.import_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.import_name_return import_name101 =null;

        PythonProvenanceParser.import_from_return import_from102 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:214:13: ( import_name | import_from )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==141) ) {
                alt31=1;
            }
            else if ( (LA31_0==139) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:214:15: import_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_name_in_import_stmt1621);
                    import_name101=import_name();

                    state._fsp--;

                    adaptor.addChild(root_0, import_name101.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:215:15: import_from
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_from_in_import_stmt1637);
                    import_from102=import_from();

                    state._fsp--;

                    adaptor.addChild(root_0, import_from102.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_stmt"


    public static class import_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:218:1: import_name : ref= 'import' dotted_as_names -> ^( IMPORT_CMD[$ref] dotted_as_names ) ;
    public final PythonProvenanceParser.import_name_return import_name() throws RecognitionException {
        PythonProvenanceParser.import_name_return retval = new PythonProvenanceParser.import_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        PythonProvenanceParser.dotted_as_names_return dotted_as_names103 =null;


        Object ref_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_dotted_as_names=new RewriteRuleSubtreeStream(adaptor,"rule dotted_as_names");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:218:13: (ref= 'import' dotted_as_names -> ^( IMPORT_CMD[$ref] dotted_as_names ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:218:15: ref= 'import' dotted_as_names
            {
            ref=(Token)match(input,141,FOLLOW_141_in_import_name1660);  
            stream_141.add(ref);


            pushFollow(FOLLOW_dotted_as_names_in_import_name1662);
            dotted_as_names103=dotted_as_names();

            state._fsp--;

            stream_dotted_as_names.add(dotted_as_names103.getTree());

            // AST REWRITE
            // elements: dotted_as_names
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:44: -> ^( IMPORT_CMD[$ref] dotted_as_names )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:218:47: ^( IMPORT_CMD[$ref] dotted_as_names )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORT_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_dotted_as_names.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_name"


    public static class import_from_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_from"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:221:1: import_from : ( import_from_name | import_from_dotted_name );
    public final PythonProvenanceParser.import_from_return import_from() throws RecognitionException {
        PythonProvenanceParser.import_from_return retval = new PythonProvenanceParser.import_from_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.import_from_name_return import_from_name104 =null;

        PythonProvenanceParser.import_from_dotted_name_return import_from_dotted_name105 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:222:2: ( import_from_name | import_from_dotted_name )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==139) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==NAME) ) {
                    alt32=1;
                }
                else if ( (LA32_1==DOTTED_NAME) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:222:4: import_from_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_from_name_in_import_from1694);
                    import_from_name104=import_from_name();

                    state._fsp--;

                    adaptor.addChild(root_0, import_from_name104.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:223:4: import_from_dotted_name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_from_dotted_name_in_import_from1700);
                    import_from_dotted_name105=import_from_dotted_name();

                    state._fsp--;

                    adaptor.addChild(root_0, import_from_dotted_name105.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_from"


    public static class import_from_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_from_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:226:1: import_from_name : ref= 'from' id1= NAME 'import' ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) ) ;
    public final PythonProvenanceParser.import_from_name_return import_from_name() throws RecognitionException {
        PythonProvenanceParser.import_from_name_return retval = new PythonProvenanceParser.import_from_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token id1=null;
        Token string_literal106=null;
        Token STAR107=null;
        Token LPAREN109=null;
        Token RPAREN111=null;
        PythonProvenanceParser.import_as_names_return import_as_names108 =null;

        PythonProvenanceParser.import_as_names_return import_as_names110 =null;


        Object ref_tree=null;
        Object id1_tree=null;
        Object string_literal106_tree=null;
        Object STAR107_tree=null;
        Object LPAREN109_tree=null;
        Object RPAREN111_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_import_as_names=new RewriteRuleSubtreeStream(adaptor,"rule import_as_names");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:226:17: (ref= 'from' id1= NAME 'import' ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:226:19: ref= 'from' id1= NAME 'import' ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) )
            {
            ref=(Token)match(input,139,FOLLOW_139_in_import_from_name1711);  
            stream_139.add(ref);


            id1=(Token)match(input,NAME,FOLLOW_NAME_in_import_from_name1715);  
            stream_NAME.add(id1);


            string_literal106=(Token)match(input,141,FOLLOW_141_in_import_from_name1717);  
            stream_141.add(string_literal106);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:227:15: ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt33=1;
                }
                break;
            case DOTTED_NAME:
            case NAME:
                {
                alt33=2;
                }
                break;
            case LPAREN:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:227:16: STAR
                    {
                    STAR107=(Token)match(input,STAR,FOLLOW_STAR_in_import_from_name1734);  
                    stream_STAR.add(STAR107);


                    // AST REWRITE
                    // elements: STAR, id1
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:21: -> ^( IMPORT_CMD[$ref] $id1 STAR )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:227:24: ^( IMPORT_CMD[$ref] $id1 STAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_CMD, ref)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        adaptor.addChild(root_1, 
                        stream_STAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:228:17: import_as_names
                    {
                    pushFollow(FOLLOW_import_as_names_in_import_from_name1764);
                    import_as_names108=import_as_names();

                    state._fsp--;

                    stream_import_as_names.add(import_as_names108.getTree());

                    // AST REWRITE
                    // elements: id1, import_as_names
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:33: -> ^( IMPORT_CMD[$ref] $id1 import_as_names )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:228:36: ^( IMPORT_CMD[$ref] $id1 import_as_names )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_CMD, ref)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        adaptor.addChild(root_1, stream_import_as_names.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:229:17: LPAREN import_as_names RPAREN
                    {
                    LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_import_from_name1794);  
                    stream_LPAREN.add(LPAREN109);


                    pushFollow(FOLLOW_import_as_names_in_import_from_name1796);
                    import_as_names110=import_as_names();

                    state._fsp--;

                    stream_import_as_names.add(import_as_names110.getTree());

                    RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_import_from_name1798);  
                    stream_RPAREN.add(RPAREN111);


                    // AST REWRITE
                    // elements: id1, import_as_names
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:47: -> ^( IMPORT_CMD[$ref] $id1 import_as_names )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:229:50: ^( IMPORT_CMD[$ref] $id1 import_as_names )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_CMD, ref)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        adaptor.addChild(root_1, stream_import_as_names.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_from_name"


    public static class import_from_dotted_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_from_dotted_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:233:1: import_from_dotted_name : ref= 'from' id1= DOTTED_NAME 'import' ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) ) ;
    public final PythonProvenanceParser.import_from_dotted_name_return import_from_dotted_name() throws RecognitionException {
        PythonProvenanceParser.import_from_dotted_name_return retval = new PythonProvenanceParser.import_from_dotted_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token id1=null;
        Token string_literal112=null;
        Token STAR113=null;
        Token LPAREN115=null;
        Token RPAREN117=null;
        PythonProvenanceParser.import_as_names_return import_as_names114 =null;

        PythonProvenanceParser.import_as_names_return import_as_names116 =null;


        Object ref_tree=null;
        Object id1_tree=null;
        Object string_literal112_tree=null;
        Object STAR113_tree=null;
        Object LPAREN115_tree=null;
        Object RPAREN117_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_DOTTED_NAME=new RewriteRuleTokenStream(adaptor,"token DOTTED_NAME");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_import_as_names=new RewriteRuleSubtreeStream(adaptor,"rule import_as_names");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:233:24: (ref= 'from' id1= DOTTED_NAME 'import' ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:233:26: ref= 'from' id1= DOTTED_NAME 'import' ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) )
            {
            ref=(Token)match(input,139,FOLLOW_139_in_import_from_dotted_name1858);  
            stream_139.add(ref);


            id1=(Token)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_import_from_dotted_name1862);  
            stream_DOTTED_NAME.add(id1);


            string_literal112=(Token)match(input,141,FOLLOW_141_in_import_from_dotted_name1864);  
            stream_141.add(string_literal112);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:234:15: ( STAR -> ^( IMPORT_CMD[$ref] $id1 STAR ) | import_as_names -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) | LPAREN import_as_names RPAREN -> ^( IMPORT_CMD[$ref] $id1 import_as_names ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt34=1;
                }
                break;
            case DOTTED_NAME:
            case NAME:
                {
                alt34=2;
                }
                break;
            case LPAREN:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:234:16: STAR
                    {
                    STAR113=(Token)match(input,STAR,FOLLOW_STAR_in_import_from_dotted_name1881);  
                    stream_STAR.add(STAR113);


                    // AST REWRITE
                    // elements: id1, STAR
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:21: -> ^( IMPORT_CMD[$ref] $id1 STAR )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:234:24: ^( IMPORT_CMD[$ref] $id1 STAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_CMD, ref)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        adaptor.addChild(root_1, 
                        stream_STAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:235:17: import_as_names
                    {
                    pushFollow(FOLLOW_import_as_names_in_import_from_dotted_name1911);
                    import_as_names114=import_as_names();

                    state._fsp--;

                    stream_import_as_names.add(import_as_names114.getTree());

                    // AST REWRITE
                    // elements: import_as_names, id1
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:33: -> ^( IMPORT_CMD[$ref] $id1 import_as_names )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:235:36: ^( IMPORT_CMD[$ref] $id1 import_as_names )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_CMD, ref)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        adaptor.addChild(root_1, stream_import_as_names.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:236:17: LPAREN import_as_names RPAREN
                    {
                    LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_import_from_dotted_name1941);  
                    stream_LPAREN.add(LPAREN115);


                    pushFollow(FOLLOW_import_as_names_in_import_from_dotted_name1943);
                    import_as_names116=import_as_names();

                    state._fsp--;

                    stream_import_as_names.add(import_as_names116.getTree());

                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_import_from_dotted_name1945);  
                    stream_RPAREN.add(RPAREN117);


                    // AST REWRITE
                    // elements: id1, import_as_names
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:47: -> ^( IMPORT_CMD[$ref] $id1 import_as_names )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:236:50: ^( IMPORT_CMD[$ref] $id1 import_as_names )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_CMD, ref)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        adaptor.addChild(root_1, stream_import_as_names.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_from_dotted_name"


    public static class import_as_names_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_as_names"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:1: import_as_names : import_as_name ( COMMA import_as_name )* ( COMMA )? -> ^( IMPORT_ARGS ( import_as_name )+ ) ;
    public final PythonProvenanceParser.import_as_names_return import_as_names() throws RecognitionException {
        PythonProvenanceParser.import_as_names_return retval = new PythonProvenanceParser.import_as_names_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA119=null;
        Token COMMA121=null;
        PythonProvenanceParser.import_as_name_return import_as_name118 =null;

        PythonProvenanceParser.import_as_name_return import_as_name120 =null;


        Object COMMA119_tree=null;
        Object COMMA121_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_import_as_name=new RewriteRuleSubtreeStream(adaptor,"rule import_as_name");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:17: ( import_as_name ( COMMA import_as_name )* ( COMMA )? -> ^( IMPORT_ARGS ( import_as_name )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:19: import_as_name ( COMMA import_as_name )* ( COMMA )?
            {
            pushFollow(FOLLOW_import_as_name_in_import_as_names1993);
            import_as_name118=import_as_name();

            state._fsp--;

            stream_import_as_name.add(import_as_name118.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:34: ( COMMA import_as_name )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==DOTTED_NAME||LA35_1==NAME) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:35: COMMA import_as_name
            	    {
            	    COMMA119=(Token)match(input,COMMA,FOLLOW_COMMA_in_import_as_names1996);  
            	    stream_COMMA.add(COMMA119);


            	    pushFollow(FOLLOW_import_as_name_in_import_as_names1998);
            	    import_as_name120=import_as_name();

            	    state._fsp--;

            	    stream_import_as_name.add(import_as_name120.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:58: ( COMMA )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==COMMA) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:59: COMMA
                    {
                    COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_import_as_names2003);  
                    stream_COMMA.add(COMMA121);


                    }
                    break;

            }


            // AST REWRITE
            // elements: import_as_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:67: -> ^( IMPORT_ARGS ( import_as_name )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:240:70: ^( IMPORT_ARGS ( import_as_name )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORT_ARGS, "IMPORT_ARGS")
                , root_1);

                if ( !(stream_import_as_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_import_as_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_import_as_name.nextTree());

                }
                stream_import_as_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_as_names"


    public static class import_as_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_as_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:243:1: import_as_name : (id1= NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) |id1= DOTTED_NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) );
    public final PythonProvenanceParser.import_as_name_return import_as_name() throws RecognitionException {
        PythonProvenanceParser.import_as_name_return retval = new PythonProvenanceParser.import_as_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id1=null;
        Token id2=null;
        Token AS122=null;
        Token AS123=null;

        Object id1_tree=null;
        Object id2_tree=null;
        Object AS122_tree=null;
        Object AS123_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_DOTTED_NAME=new RewriteRuleTokenStream(adaptor,"token DOTTED_NAME");

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:244:2: (id1= NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) |id1= DOTTED_NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==NAME) ) {
                alt39=1;
            }
            else if ( (LA39_0==DOTTED_NAME) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:244:4: id1= NAME ( AS id2= NAME )?
                    {
                    id1=(Token)match(input,NAME,FOLLOW_NAME_in_import_as_name2042);  
                    stream_NAME.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:244:13: ( AS id2= NAME )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==AS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:244:14: AS id2= NAME
                            {
                            AS122=(Token)match(input,AS,FOLLOW_AS_in_import_as_name2045);  
                            stream_AS.add(AS122);


                            id2=(Token)match(input,NAME,FOLLOW_NAME_in_import_as_name2049);  
                            stream_NAME.add(id2);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id2, id1
                    // token labels: id2, id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:28: -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:244:31: ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_EQUIV, id1)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:244:58: ( $id2)?
                        if ( stream_id2.hasNext() ) {
                            adaptor.addChild(root_1, stream_id2.nextNode());

                        }
                        stream_id2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:245:4: id1= DOTTED_NAME ( AS id2= NAME )?
                    {
                    id1=(Token)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_import_as_name2073);  
                    stream_DOTTED_NAME.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:245:20: ( AS id2= NAME )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==AS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:245:21: AS id2= NAME
                            {
                            AS123=(Token)match(input,AS,FOLLOW_AS_in_import_as_name2076);  
                            stream_AS.add(AS123);


                            id2=(Token)match(input,NAME,FOLLOW_NAME_in_import_as_name2080);  
                            stream_NAME.add(id2);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id1, id2
                    // token labels: id2, id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:35: -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:245:38: ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_EQUIV, id1)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:245:65: ( $id2)?
                        if ( stream_id2.hasNext() ) {
                            adaptor.addChild(root_1, stream_id2.nextNode());

                        }
                        stream_id2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_as_name"


    public static class dotted_as_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotted_as_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:248:1: dotted_as_name : (id1= NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) |id1= DOTTED_NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) );
    public final PythonProvenanceParser.dotted_as_name_return dotted_as_name() throws RecognitionException {
        PythonProvenanceParser.dotted_as_name_return retval = new PythonProvenanceParser.dotted_as_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id1=null;
        Token id2=null;
        Token AS124=null;
        Token AS125=null;

        Object id1_tree=null;
        Object id2_tree=null;
        Object AS124_tree=null;
        Object AS125_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_DOTTED_NAME=new RewriteRuleTokenStream(adaptor,"token DOTTED_NAME");

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:249:2: (id1= NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) |id1= DOTTED_NAME ( AS id2= NAME )? -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==NAME) ) {
                alt42=1;
            }
            else if ( (LA42_0==DOTTED_NAME) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:249:4: id1= NAME ( AS id2= NAME )?
                    {
                    id1=(Token)match(input,NAME,FOLLOW_NAME_in_dotted_as_name2110);  
                    stream_NAME.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:249:13: ( AS id2= NAME )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==AS) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:249:14: AS id2= NAME
                            {
                            AS124=(Token)match(input,AS,FOLLOW_AS_in_dotted_as_name2113);  
                            stream_AS.add(AS124);


                            id2=(Token)match(input,NAME,FOLLOW_NAME_in_dotted_as_name2117);  
                            stream_NAME.add(id2);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id2, id1
                    // token labels: id2, id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:28: -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:249:31: ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_EQUIV, id1)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:249:58: ( $id2)?
                        if ( stream_id2.hasNext() ) {
                            adaptor.addChild(root_1, stream_id2.nextNode());

                        }
                        stream_id2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:250:5: id1= DOTTED_NAME ( AS id2= NAME )?
                    {
                    id1=(Token)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_dotted_as_name2142);  
                    stream_DOTTED_NAME.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:250:21: ( AS id2= NAME )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==AS) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:250:22: AS id2= NAME
                            {
                            AS125=(Token)match(input,AS,FOLLOW_AS_in_dotted_as_name2145);  
                            stream_AS.add(AS125);


                            id2=(Token)match(input,NAME,FOLLOW_NAME_in_dotted_as_name2149);  
                            stream_NAME.add(id2);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id2, id1
                    // token labels: id2, id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:36: -> ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:250:39: ^( IMPORT_EQUIV[$id1] $id1 ( $id2)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IMPORT_EQUIV, id1)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:250:66: ( $id2)?
                        if ( stream_id2.hasNext() ) {
                            adaptor.addChild(root_1, stream_id2.nextNode());

                        }
                        stream_id2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dotted_as_name"


    public static class dotted_as_names_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotted_as_names"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:253:1: dotted_as_names : dotted_as_name ( COMMA dotted_as_name )* -> ^( IMPORT_ARGS ( dotted_as_name )+ ) ;
    public final PythonProvenanceParser.dotted_as_names_return dotted_as_names() throws RecognitionException {
        PythonProvenanceParser.dotted_as_names_return retval = new PythonProvenanceParser.dotted_as_names_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA127=null;
        PythonProvenanceParser.dotted_as_name_return dotted_as_name126 =null;

        PythonProvenanceParser.dotted_as_name_return dotted_as_name128 =null;


        Object COMMA127_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_dotted_as_name=new RewriteRuleSubtreeStream(adaptor,"rule dotted_as_name");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:253:17: ( dotted_as_name ( COMMA dotted_as_name )* -> ^( IMPORT_ARGS ( dotted_as_name )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:253:19: dotted_as_name ( COMMA dotted_as_name )*
            {
            pushFollow(FOLLOW_dotted_as_name_in_dotted_as_names2177);
            dotted_as_name126=dotted_as_name();

            state._fsp--;

            stream_dotted_as_name.add(dotted_as_name126.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:253:34: ( COMMA dotted_as_name )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:253:35: COMMA dotted_as_name
            	    {
            	    COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_dotted_as_names2180);  
            	    stream_COMMA.add(COMMA127);


            	    pushFollow(FOLLOW_dotted_as_name_in_dotted_as_names2182);
            	    dotted_as_name128=dotted_as_name();

            	    state._fsp--;

            	    stream_dotted_as_name.add(dotted_as_name128.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            // AST REWRITE
            // elements: dotted_as_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 253:58: -> ^( IMPORT_ARGS ( dotted_as_name )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:253:61: ^( IMPORT_ARGS ( dotted_as_name )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORT_ARGS, "IMPORT_ARGS")
                , root_1);

                if ( !(stream_dotted_as_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_dotted_as_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_dotted_as_name.nextTree());

                }
                stream_dotted_as_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dotted_as_names"


    public static class global_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "global_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:256:1: global_stmt : 'global' NAME ( COMMA NAME )* ;
    public final PythonProvenanceParser.global_stmt_return global_stmt() throws RecognitionException {
        PythonProvenanceParser.global_stmt_return retval = new PythonProvenanceParser.global_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal129=null;
        Token NAME130=null;
        Token COMMA131=null;
        Token NAME132=null;

        Object string_literal129_tree=null;
        Object NAME130_tree=null;
        Object COMMA131_tree=null;
        Object NAME132_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:256:13: ( 'global' NAME ( COMMA NAME )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:256:15: 'global' NAME ( COMMA NAME )*
            {
            root_0 = (Object)adaptor.nil();


            string_literal129=(Token)match(input,140,FOLLOW_140_in_global_stmt2218); 
            string_literal129_tree = 
            (Object)adaptor.create(string_literal129)
            ;
            adaptor.addChild(root_0, string_literal129_tree);


            NAME130=(Token)match(input,NAME,FOLLOW_NAME_in_global_stmt2220); 
            NAME130_tree = 
            (Object)adaptor.create(NAME130)
            ;
            adaptor.addChild(root_0, NAME130_tree);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:256:29: ( COMMA NAME )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:256:30: COMMA NAME
            	    {
            	    COMMA131=(Token)match(input,COMMA,FOLLOW_COMMA_in_global_stmt2223); 
            	    COMMA131_tree = 
            	    (Object)adaptor.create(COMMA131)
            	    ;
            	    adaptor.addChild(root_0, COMMA131_tree);


            	    NAME132=(Token)match(input,NAME,FOLLOW_NAME_in_global_stmt2225); 
            	    NAME132_tree = 
            	    (Object)adaptor.create(NAME132)
            	    ;
            	    adaptor.addChild(root_0, NAME132_tree);


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "global_stmt"


    public static class exec_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exec_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:259:1: exec_stmt : 'exec' expr ( 'in' test ( COMMA test )? )? ;
    public final PythonProvenanceParser.exec_stmt_return exec_stmt() throws RecognitionException {
        PythonProvenanceParser.exec_stmt_return retval = new PythonProvenanceParser.exec_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal133=null;
        Token string_literal135=null;
        Token COMMA137=null;
        PythonProvenanceParser.expr_return expr134 =null;

        PythonProvenanceParser.test_return test136 =null;

        PythonProvenanceParser.test_return test138 =null;


        Object string_literal133_tree=null;
        Object string_literal135_tree=null;
        Object COMMA137_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:259:11: ( 'exec' expr ( 'in' test ( COMMA test )? )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:259:13: 'exec' expr ( 'in' test ( COMMA test )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal133=(Token)match(input,136,FOLLOW_136_in_exec_stmt2248); 
            string_literal133_tree = 
            (Object)adaptor.create(string_literal133)
            ;
            adaptor.addChild(root_0, string_literal133_tree);


            pushFollow(FOLLOW_expr_in_exec_stmt2250);
            expr134=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr134.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:259:25: ( 'in' test ( COMMA test )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IN) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:259:26: 'in' test ( COMMA test )?
                    {
                    string_literal135=(Token)match(input,IN,FOLLOW_IN_in_exec_stmt2253); 
                    string_literal135_tree = 
                    (Object)adaptor.create(string_literal135)
                    ;
                    adaptor.addChild(root_0, string_literal135_tree);


                    pushFollow(FOLLOW_test_in_exec_stmt2255);
                    test136=test();

                    state._fsp--;

                    adaptor.addChild(root_0, test136.getTree());

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:259:36: ( COMMA test )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:259:37: COMMA test
                            {
                            COMMA137=(Token)match(input,COMMA,FOLLOW_COMMA_in_exec_stmt2258); 
                            COMMA137_tree = 
                            (Object)adaptor.create(COMMA137)
                            ;
                            adaptor.addChild(root_0, COMMA137_tree);


                            pushFollow(FOLLOW_test_in_exec_stmt2260);
                            test138=test();

                            state._fsp--;

                            adaptor.addChild(root_0, test138.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exec_stmt"


    public static class assert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assert_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:262:1: assert_stmt : 'assert' test ( COMMA test )? ;
    public final PythonProvenanceParser.assert_stmt_return assert_stmt() throws RecognitionException {
        PythonProvenanceParser.assert_stmt_return retval = new PythonProvenanceParser.assert_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal139=null;
        Token COMMA141=null;
        PythonProvenanceParser.test_return test140 =null;

        PythonProvenanceParser.test_return test142 =null;


        Object string_literal139_tree=null;
        Object COMMA141_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:262:13: ( 'assert' test ( COMMA test )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:262:15: 'assert' test ( COMMA test )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal139=(Token)match(input,127,FOLLOW_127_in_assert_stmt2283); 
            string_literal139_tree = 
            (Object)adaptor.create(string_literal139)
            ;
            adaptor.addChild(root_0, string_literal139_tree);


            pushFollow(FOLLOW_test_in_assert_stmt2285);
            test140=test();

            state._fsp--;

            adaptor.addChild(root_0, test140.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:262:29: ( COMMA test )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==COMMA) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:262:30: COMMA test
                    {
                    COMMA141=(Token)match(input,COMMA,FOLLOW_COMMA_in_assert_stmt2288); 
                    COMMA141_tree = 
                    (Object)adaptor.create(COMMA141)
                    ;
                    adaptor.addChild(root_0, COMMA141_tree);


                    pushFollow(FOLLOW_test_in_assert_stmt2290);
                    test142=test();

                    state._fsp--;

                    adaptor.addChild(root_0, test142.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assert_stmt"


    public static class compound_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:265:1: compound_stmt : ( if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef );
    public final PythonProvenanceParser.compound_stmt_return compound_stmt() throws RecognitionException {
        PythonProvenanceParser.compound_stmt_return retval = new PythonProvenanceParser.compound_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.if_stmt_return if_stmt143 =null;

        PythonProvenanceParser.while_stmt_return while_stmt144 =null;

        PythonProvenanceParser.for_stmt_return for_stmt145 =null;

        PythonProvenanceParser.try_stmt_return try_stmt146 =null;

        PythonProvenanceParser.with_stmt_return with_stmt147 =null;

        PythonProvenanceParser.funcdef_return funcdef148 =null;

        PythonProvenanceParser.classdef_return classdef149 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:265:15: ( if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef )
            int alt48=7;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt48=1;
                }
                break;
            case 146:
                {
                alt48=2;
                }
                break;
            case 138:
                {
                alt48=3;
                }
                break;
            case 145:
                {
                alt48=4;
                }
                break;
            case 147:
                {
                alt48=5;
                }
                break;
            case AT:
            case 131:
                {
                alt48=6;
                }
                break;
            case 129:
                {
                alt48=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:265:17: if_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_compound_stmt2313);
                    if_stmt143=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt143.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:266:17: while_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_compound_stmt2331);
                    while_stmt144=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt144.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:267:17: for_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_compound_stmt2349);
                    for_stmt145=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt145.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:268:17: try_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_try_stmt_in_compound_stmt2367);
                    try_stmt146=try_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, try_stmt146.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:269:17: with_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_with_stmt_in_compound_stmt2385);
                    with_stmt147=with_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, with_stmt147.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:270:17: funcdef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcdef_in_compound_stmt2403);
                    funcdef148=funcdef();

                    state._fsp--;

                    adaptor.addChild(root_0, funcdef148.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:271:17: classdef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classdef_in_compound_stmt2421);
                    classdef149=classdef();

                    state._fsp--;

                    adaptor.addChild(root_0, classdef149.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_stmt"


    public static class if_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:1: if_stmt : if_clause ( elif_clauses )? ( else_clause )? -> ^( IFBLOCK if_clause ( elif_clauses )? ( else_clause )? ) ;
    public final PythonProvenanceParser.if_stmt_return if_stmt() throws RecognitionException {
        PythonProvenanceParser.if_stmt_return retval = new PythonProvenanceParser.if_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.if_clause_return if_clause150 =null;

        PythonProvenanceParser.elif_clauses_return elif_clauses151 =null;

        PythonProvenanceParser.else_clause_return else_clause152 =null;


        RewriteRuleSubtreeStream stream_else_clause=new RewriteRuleSubtreeStream(adaptor,"rule else_clause");
        RewriteRuleSubtreeStream stream_elif_clauses=new RewriteRuleSubtreeStream(adaptor,"rule elif_clauses");
        RewriteRuleSubtreeStream stream_if_clause=new RewriteRuleSubtreeStream(adaptor,"rule if_clause");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:9: ( if_clause ( elif_clauses )? ( else_clause )? -> ^( IFBLOCK if_clause ( elif_clauses )? ( else_clause )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:11: if_clause ( elif_clauses )? ( else_clause )?
            {
            pushFollow(FOLLOW_if_clause_in_if_stmt2444);
            if_clause150=if_clause();

            state._fsp--;

            stream_if_clause.add(if_clause150.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:21: ( elif_clauses )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==133) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:22: elif_clauses
                    {
                    pushFollow(FOLLOW_elif_clauses_in_if_stmt2447);
                    elif_clauses151=elif_clauses();

                    state._fsp--;

                    stream_elif_clauses.add(elif_clauses151.getTree());

                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:37: ( else_clause )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==134) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:38: else_clause
                    {
                    pushFollow(FOLLOW_else_clause_in_if_stmt2452);
                    else_clause152=else_clause();

                    state._fsp--;

                    stream_else_clause.add(else_clause152.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: elif_clauses, if_clause, else_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:52: -> ^( IFBLOCK if_clause ( elif_clauses )? ( else_clause )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:55: ^( IFBLOCK if_clause ( elif_clauses )? ( else_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IFBLOCK, "IFBLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_if_clause.nextTree());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:75: ( elif_clauses )?
                if ( stream_elif_clauses.hasNext() ) {
                    adaptor.addChild(root_1, stream_elif_clauses.nextTree());

                }
                stream_elif_clauses.reset();

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:274:89: ( else_clause )?
                if ( stream_else_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_clause.nextTree());

                }
                stream_else_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class if_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:278:1: if_clause : ref= IF test COLON suite -> ^( IF_CMD[$ref] test suite ) ;
    public final PythonProvenanceParser.if_clause_return if_clause() throws RecognitionException {
        PythonProvenanceParser.if_clause_return retval = new PythonProvenanceParser.if_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON154=null;
        PythonProvenanceParser.test_return test153 =null;

        PythonProvenanceParser.suite_return suite155 =null;


        Object ref_tree=null;
        Object COLON154_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:278:10: (ref= IF test COLON suite -> ^( IF_CMD[$ref] test suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:278:12: ref= IF test COLON suite
            {
            ref=(Token)match(input,IF,FOLLOW_IF_in_if_clause2482);  
            stream_IF.add(ref);


            pushFollow(FOLLOW_test_in_if_clause2484);
            test153=test();

            state._fsp--;

            stream_test.add(test153.getTree());

            COLON154=(Token)match(input,COLON,FOLLOW_COLON_in_if_clause2486);  
            stream_COLON.add(COLON154);


            pushFollow(FOLLOW_suite_in_if_clause2488);
            suite155=suite();

            state._fsp--;

            stream_suite.add(suite155.getTree());

            // AST REWRITE
            // elements: test, suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:36: -> ^( IF_CMD[$ref] test suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:278:39: ^( IF_CMD[$ref] test suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_test.nextTree());

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_clause"


    public static class elif_clauses_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elif_clauses"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:281:1: elif_clauses : ( elif_clause )+ -> ^( ELIF_CLAUSES ( elif_clause )+ ) ;
    public final PythonProvenanceParser.elif_clauses_return elif_clauses() throws RecognitionException {
        PythonProvenanceParser.elif_clauses_return retval = new PythonProvenanceParser.elif_clauses_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.elif_clause_return elif_clause156 =null;


        RewriteRuleSubtreeStream stream_elif_clause=new RewriteRuleSubtreeStream(adaptor,"rule elif_clause");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:282:2: ( ( elif_clause )+ -> ^( ELIF_CLAUSES ( elif_clause )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:282:4: ( elif_clause )+
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:282:4: ( elif_clause )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==133) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:282:5: elif_clause
            	    {
            	    pushFollow(FOLLOW_elif_clause_in_elif_clauses2512);
            	    elif_clause156=elif_clause();

            	    state._fsp--;

            	    stream_elif_clause.add(elif_clause156.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            // AST REWRITE
            // elements: elif_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:19: -> ^( ELIF_CLAUSES ( elif_clause )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:282:22: ^( ELIF_CLAUSES ( elif_clause )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ELIF_CLAUSES, "ELIF_CLAUSES")
                , root_1);

                if ( !(stream_elif_clause.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_elif_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_elif_clause.nextTree());

                }
                stream_elif_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elif_clauses"


    public static class elif_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elif_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:285:1: elif_clause : ref= 'elif' test COLON suite -> ^( ELIF_CMD[$ref] test suite ) ;
    public final PythonProvenanceParser.elif_clause_return elif_clause() throws RecognitionException {
        PythonProvenanceParser.elif_clause_return retval = new PythonProvenanceParser.elif_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON158=null;
        PythonProvenanceParser.test_return test157 =null;

        PythonProvenanceParser.suite_return suite159 =null;


        Object ref_tree=null;
        Object COLON158_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:286:2: (ref= 'elif' test COLON suite -> ^( ELIF_CMD[$ref] test suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:286:4: ref= 'elif' test COLON suite
            {
            ref=(Token)match(input,133,FOLLOW_133_in_elif_clause2537);  
            stream_133.add(ref);


            pushFollow(FOLLOW_test_in_elif_clause2539);
            test157=test();

            state._fsp--;

            stream_test.add(test157.getTree());

            COLON158=(Token)match(input,COLON,FOLLOW_COLON_in_elif_clause2541);  
            stream_COLON.add(COLON158);


            pushFollow(FOLLOW_suite_in_elif_clause2543);
            suite159=suite();

            state._fsp--;

            stream_suite.add(suite159.getTree());

            // AST REWRITE
            // elements: test, suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:32: -> ^( ELIF_CMD[$ref] test suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:286:35: ^( ELIF_CMD[$ref] test suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ELIF_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_test.nextTree());

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elif_clause"


    public static class else_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:289:1: else_clause : ref= 'else' COLON suite -> ^( ELSE_CMD[$ref] suite ) ;
    public final PythonProvenanceParser.else_clause_return else_clause() throws RecognitionException {
        PythonProvenanceParser.else_clause_return retval = new PythonProvenanceParser.else_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON160=null;
        PythonProvenanceParser.suite_return suite161 =null;


        Object ref_tree=null;
        Object COLON160_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:290:2: (ref= 'else' COLON suite -> ^( ELSE_CMD[$ref] suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:290:4: ref= 'else' COLON suite
            {
            ref=(Token)match(input,134,FOLLOW_134_in_else_clause2568);  
            stream_134.add(ref);


            COLON160=(Token)match(input,COLON,FOLLOW_COLON_in_else_clause2570);  
            stream_COLON.add(COLON160);


            pushFollow(FOLLOW_suite_in_else_clause2572);
            suite161=suite();

            state._fsp--;

            stream_suite.add(suite161.getTree());

            // AST REWRITE
            // elements: suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 290:27: -> ^( ELSE_CMD[$ref] suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:290:30: ^( ELSE_CMD[$ref] suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ELSE_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_clause"


    public static class while_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:293:1: while_stmt : while_clause ( else_clause )? -> ^( WHILEBLOCK while_clause ( else_clause )? ) ;
    public final PythonProvenanceParser.while_stmt_return while_stmt() throws RecognitionException {
        PythonProvenanceParser.while_stmt_return retval = new PythonProvenanceParser.while_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.while_clause_return while_clause162 =null;

        PythonProvenanceParser.else_clause_return else_clause163 =null;


        RewriteRuleSubtreeStream stream_else_clause=new RewriteRuleSubtreeStream(adaptor,"rule else_clause");
        RewriteRuleSubtreeStream stream_while_clause=new RewriteRuleSubtreeStream(adaptor,"rule while_clause");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:293:12: ( while_clause ( else_clause )? -> ^( WHILEBLOCK while_clause ( else_clause )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:293:14: while_clause ( else_clause )?
            {
            pushFollow(FOLLOW_while_clause_in_while_stmt2591);
            while_clause162=while_clause();

            state._fsp--;

            stream_while_clause.add(while_clause162.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:293:27: ( else_clause )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==134) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:293:28: else_clause
                    {
                    pushFollow(FOLLOW_else_clause_in_while_stmt2594);
                    else_clause163=else_clause();

                    state._fsp--;

                    stream_else_clause.add(else_clause163.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: while_clause, else_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 293:42: -> ^( WHILEBLOCK while_clause ( else_clause )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:293:45: ^( WHILEBLOCK while_clause ( else_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WHILEBLOCK, "WHILEBLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_while_clause.nextTree());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:293:71: ( else_clause )?
                if ( stream_else_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_clause.nextTree());

                }
                stream_else_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class while_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:296:1: while_clause : ref= 'while' test COLON suite -> ^( WHILE_CMD[$ref] test suite ) ;
    public final PythonProvenanceParser.while_clause_return while_clause() throws RecognitionException {
        PythonProvenanceParser.while_clause_return retval = new PythonProvenanceParser.while_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON165=null;
        PythonProvenanceParser.test_return test164 =null;

        PythonProvenanceParser.suite_return suite166 =null;


        Object ref_tree=null;
        Object COLON165_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:296:13: (ref= 'while' test COLON suite -> ^( WHILE_CMD[$ref] test suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:296:15: ref= 'while' test COLON suite
            {
            ref=(Token)match(input,146,FOLLOW_146_in_while_clause2628);  
            stream_146.add(ref);


            pushFollow(FOLLOW_test_in_while_clause2630);
            test164=test();

            state._fsp--;

            stream_test.add(test164.getTree());

            COLON165=(Token)match(input,COLON,FOLLOW_COLON_in_while_clause2632);  
            stream_COLON.add(COLON165);


            pushFollow(FOLLOW_suite_in_while_clause2634);
            suite166=suite();

            state._fsp--;

            stream_suite.add(suite166.getTree());

            // AST REWRITE
            // elements: test, suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 296:44: -> ^( WHILE_CMD[$ref] test suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:296:47: ^( WHILE_CMD[$ref] test suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WHILE_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_test.nextTree());

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_clause"


    public static class for_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:299:1: for_stmt : ref= 'for' exprlist 'in' testlist COLON suite -> ^( FORLOOP_CMD[$ref] exprlist testlist suite ) ;
    public final PythonProvenanceParser.for_stmt_return for_stmt() throws RecognitionException {
        PythonProvenanceParser.for_stmt_return retval = new PythonProvenanceParser.for_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token string_literal168=null;
        Token COLON170=null;
        PythonProvenanceParser.exprlist_return exprlist167 =null;

        PythonProvenanceParser.testlist_return testlist169 =null;

        PythonProvenanceParser.suite_return suite171 =null;


        Object ref_tree=null;
        Object string_literal168_tree=null;
        Object COLON170_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        RewriteRuleSubtreeStream stream_exprlist=new RewriteRuleSubtreeStream(adaptor,"rule exprlist");
        RewriteRuleSubtreeStream stream_testlist=new RewriteRuleSubtreeStream(adaptor,"rule testlist");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:299:10: (ref= 'for' exprlist 'in' testlist COLON suite -> ^( FORLOOP_CMD[$ref] exprlist testlist suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:299:12: ref= 'for' exprlist 'in' testlist COLON suite
            {
            ref=(Token)match(input,138,FOLLOW_138_in_for_stmt2680);  
            stream_138.add(ref);


            pushFollow(FOLLOW_exprlist_in_for_stmt2682);
            exprlist167=exprlist();

            state._fsp--;

            stream_exprlist.add(exprlist167.getTree());

            string_literal168=(Token)match(input,IN,FOLLOW_IN_in_for_stmt2684);  
            stream_IN.add(string_literal168);


            pushFollow(FOLLOW_testlist_in_for_stmt2686);
            testlist169=testlist();

            state._fsp--;

            stream_testlist.add(testlist169.getTree());

            COLON170=(Token)match(input,COLON,FOLLOW_COLON_in_for_stmt2688);  
            stream_COLON.add(COLON170);


            pushFollow(FOLLOW_suite_in_for_stmt2690);
            suite171=suite();

            state._fsp--;

            stream_suite.add(suite171.getTree());

            // AST REWRITE
            // elements: suite, testlist, exprlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:58: -> ^( FORLOOP_CMD[$ref] exprlist testlist suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:299:61: ^( FORLOOP_CMD[$ref] exprlist testlist suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FORLOOP_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_exprlist.nextTree());

                adaptor.addChild(root_1, stream_testlist.nextTree());

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class try_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "try_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:302:1: try_stmt : try_clause except_clause ( finally_clause )? -> ^( TRYBLOCK try_clause except_clause ( finally_clause )? ) ;
    public final PythonProvenanceParser.try_stmt_return try_stmt() throws RecognitionException {
        PythonProvenanceParser.try_stmt_return retval = new PythonProvenanceParser.try_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.try_clause_return try_clause172 =null;

        PythonProvenanceParser.except_clause_return except_clause173 =null;

        PythonProvenanceParser.finally_clause_return finally_clause174 =null;


        RewriteRuleSubtreeStream stream_except_clause=new RewriteRuleSubtreeStream(adaptor,"rule except_clause");
        RewriteRuleSubtreeStream stream_try_clause=new RewriteRuleSubtreeStream(adaptor,"rule try_clause");
        RewriteRuleSubtreeStream stream_finally_clause=new RewriteRuleSubtreeStream(adaptor,"rule finally_clause");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:302:9: ( try_clause except_clause ( finally_clause )? -> ^( TRYBLOCK try_clause except_clause ( finally_clause )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:302:11: try_clause except_clause ( finally_clause )?
            {
            pushFollow(FOLLOW_try_clause_in_try_stmt2721);
            try_clause172=try_clause();

            state._fsp--;

            stream_try_clause.add(try_clause172.getTree());

            pushFollow(FOLLOW_except_clause_in_try_stmt2723);
            except_clause173=except_clause();

            state._fsp--;

            stream_except_clause.add(except_clause173.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:302:36: ( finally_clause )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==137) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:302:37: finally_clause
                    {
                    pushFollow(FOLLOW_finally_clause_in_try_stmt2726);
                    finally_clause174=finally_clause();

                    state._fsp--;

                    stream_finally_clause.add(finally_clause174.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: except_clause, finally_clause, try_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 302:54: -> ^( TRYBLOCK try_clause except_clause ( finally_clause )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:302:57: ^( TRYBLOCK try_clause except_clause ( finally_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TRYBLOCK, "TRYBLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_try_clause.nextTree());

                adaptor.addChild(root_1, stream_except_clause.nextTree());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:302:93: ( finally_clause )?
                if ( stream_finally_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_finally_clause.nextTree());

                }
                stream_finally_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "try_stmt"


    public static class try_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "try_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:305:1: try_clause : ref= 'try' COLON suite -> ^( TRY_CMD[$ref] suite ) ;
    public final PythonProvenanceParser.try_clause_return try_clause() throws RecognitionException {
        PythonProvenanceParser.try_clause_return retval = new PythonProvenanceParser.try_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON175=null;
        PythonProvenanceParser.suite_return suite176 =null;


        Object ref_tree=null;
        Object COLON175_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:306:2: (ref= 'try' COLON suite -> ^( TRY_CMD[$ref] suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:306:4: ref= 'try' COLON suite
            {
            ref=(Token)match(input,145,FOLLOW_145_in_try_clause2755);  
            stream_145.add(ref);


            COLON175=(Token)match(input,COLON,FOLLOW_COLON_in_try_clause2757);  
            stream_COLON.add(COLON175);


            pushFollow(FOLLOW_suite_in_try_clause2759);
            suite176=suite();

            state._fsp--;

            stream_suite.add(suite176.getTree());

            // AST REWRITE
            // elements: suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 306:26: -> ^( TRY_CMD[$ref] suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:306:29: ^( TRY_CMD[$ref] suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TRY_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "try_clause"


    public static class except_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "except_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:309:1: except_clause : ref= 'except' ( trailer )? COLON suite -> ^( EXCEPT_CMD[$ref] ( trailer )? suite ) ;
    public final PythonProvenanceParser.except_clause_return except_clause() throws RecognitionException {
        PythonProvenanceParser.except_clause_return retval = new PythonProvenanceParser.except_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON178=null;
        PythonProvenanceParser.trailer_return trailer177 =null;

        PythonProvenanceParser.suite_return suite179 =null;


        Object ref_tree=null;
        Object COLON178_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleSubtreeStream stream_trailer=new RewriteRuleSubtreeStream(adaptor,"rule trailer");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:310:2: (ref= 'except' ( trailer )? COLON suite -> ^( EXCEPT_CMD[$ref] ( trailer )? suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:310:4: ref= 'except' ( trailer )? COLON suite
            {
            ref=(Token)match(input,135,FOLLOW_135_in_except_clause2782);  
            stream_135.add(ref);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:310:17: ( trailer )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LBRACK||LA54_0==LPAREN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:310:17: trailer
                    {
                    pushFollow(FOLLOW_trailer_in_except_clause2784);
                    trailer177=trailer();

                    state._fsp--;

                    stream_trailer.add(trailer177.getTree());

                    }
                    break;

            }


            COLON178=(Token)match(input,COLON,FOLLOW_COLON_in_except_clause2787);  
            stream_COLON.add(COLON178);


            pushFollow(FOLLOW_suite_in_except_clause2789);
            suite179=suite();

            state._fsp--;

            stream_suite.add(suite179.getTree());

            // AST REWRITE
            // elements: suite, trailer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:38: -> ^( EXCEPT_CMD[$ref] ( trailer )? suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:310:41: ^( EXCEPT_CMD[$ref] ( trailer )? suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXCEPT_CMD, ref)
                , root_1);

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:310:60: ( trailer )?
                if ( stream_trailer.hasNext() ) {
                    adaptor.addChild(root_1, stream_trailer.nextTree());

                }
                stream_trailer.reset();

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "except_clause"


    public static class finally_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "finally_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:313:1: finally_clause : ref= 'finally' COLON suite -> ^( FINALLY_CMD[$ref] suite ) ;
    public final PythonProvenanceParser.finally_clause_return finally_clause() throws RecognitionException {
        PythonProvenanceParser.finally_clause_return retval = new PythonProvenanceParser.finally_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON180=null;
        PythonProvenanceParser.suite_return suite181 =null;


        Object ref_tree=null;
        Object COLON180_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:314:2: (ref= 'finally' COLON suite -> ^( FINALLY_CMD[$ref] suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:314:4: ref= 'finally' COLON suite
            {
            ref=(Token)match(input,137,FOLLOW_137_in_finally_clause2815);  
            stream_137.add(ref);


            COLON180=(Token)match(input,COLON,FOLLOW_COLON_in_finally_clause2817);  
            stream_COLON.add(COLON180);


            pushFollow(FOLLOW_suite_in_finally_clause2819);
            suite181=suite();

            state._fsp--;

            stream_suite.add(suite181.getTree());

            // AST REWRITE
            // elements: suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:30: -> ^( FINALLY_CMD[$ref] suite )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:314:33: ^( FINALLY_CMD[$ref] suite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FINALLY_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_suite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "finally_clause"


    public static class with_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "with_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:317:1: with_stmt : ref= 'with' id1= with_clause COLON id2= suite -> ^( WITH_CMD[$ref] $id1 $id2) ;
    public final PythonProvenanceParser.with_stmt_return with_stmt() throws RecognitionException {
        PythonProvenanceParser.with_stmt_return retval = new PythonProvenanceParser.with_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token COLON182=null;
        PythonProvenanceParser.with_clause_return id1 =null;

        PythonProvenanceParser.suite_return id2 =null;


        Object ref_tree=null;
        Object COLON182_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleSubtreeStream stream_with_clause=new RewriteRuleSubtreeStream(adaptor,"rule with_clause");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:317:10: (ref= 'with' id1= with_clause COLON id2= suite -> ^( WITH_CMD[$ref] $id1 $id2) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:317:12: ref= 'with' id1= with_clause COLON id2= suite
            {
            ref=(Token)match(input,147,FOLLOW_147_in_with_stmt2840);  
            stream_147.add(ref);


            pushFollow(FOLLOW_with_clause_in_with_stmt2845);
            id1=with_clause();

            state._fsp--;

            stream_with_clause.add(id1.getTree());

            COLON182=(Token)match(input,COLON,FOLLOW_COLON_in_with_stmt2847);  
            stream_COLON.add(COLON182);


            pushFollow(FOLLOW_suite_in_with_stmt2851);
            id2=suite();

            state._fsp--;

            stream_suite.add(id2.getTree());

            // AST REWRITE
            // elements: id1, id2
            // token labels: 
            // rule labels: retval, id2, id1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);
            RewriteRuleSubtreeStream stream_id1=new RewriteRuleSubtreeStream(adaptor,"rule id1",id1!=null?id1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 317:56: -> ^( WITH_CMD[$ref] $id1 $id2)
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:317:59: ^( WITH_CMD[$ref] $id1 $id2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WITH_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_id1.nextTree());

                adaptor.addChild(root_1, stream_id2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "with_stmt"


    public static class with_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "with_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:320:1: with_clause : with_item ( COMMA with_item )* -> ^( WITH_ARGS ( with_item )+ ) ;
    public final PythonProvenanceParser.with_clause_return with_clause() throws RecognitionException {
        PythonProvenanceParser.with_clause_return retval = new PythonProvenanceParser.with_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA184=null;
        PythonProvenanceParser.with_item_return with_item183 =null;

        PythonProvenanceParser.with_item_return with_item185 =null;


        Object COMMA184_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_with_item=new RewriteRuleSubtreeStream(adaptor,"rule with_item");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:321:2: ( with_item ( COMMA with_item )* -> ^( WITH_ARGS ( with_item )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:321:4: with_item ( COMMA with_item )*
            {
            pushFollow(FOLLOW_with_item_in_with_clause2892);
            with_item183=with_item();

            state._fsp--;

            stream_with_item.add(with_item183.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:321:14: ( COMMA with_item )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:321:15: COMMA with_item
            	    {
            	    COMMA184=(Token)match(input,COMMA,FOLLOW_COMMA_in_with_clause2895);  
            	    stream_COMMA.add(COMMA184);


            	    pushFollow(FOLLOW_with_item_in_with_clause2897);
            	    with_item185=with_item();

            	    state._fsp--;

            	    stream_with_item.add(with_item185.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            // AST REWRITE
            // elements: with_item
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 321:33: -> ^( WITH_ARGS ( with_item )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:321:36: ^( WITH_ARGS ( with_item )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WITH_ARGS, "WITH_ARGS")
                , root_1);

                if ( !(stream_with_item.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_with_item.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_item.nextTree());

                }
                stream_with_item.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "with_clause"


    public static class with_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "with_item"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:324:1: with_item : id1= test ref= 'as' id2= test -> ^( WITH_EQUIV[$ref] $id1 $id2) ;
    public final PythonProvenanceParser.with_item_return with_item() throws RecognitionException {
        PythonProvenanceParser.with_item_return retval = new PythonProvenanceParser.with_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        PythonProvenanceParser.test_return id1 =null;

        PythonProvenanceParser.test_return id2 =null;


        Object ref_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:325:2: (id1= test ref= 'as' id2= test -> ^( WITH_EQUIV[$ref] $id1 $id2) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:325:4: id1= test ref= 'as' id2= test
            {
            pushFollow(FOLLOW_test_in_with_item2922);
            id1=test();

            state._fsp--;

            stream_test.add(id1.getTree());

            ref=(Token)match(input,AS,FOLLOW_AS_in_with_item2926);  
            stream_AS.add(ref);


            pushFollow(FOLLOW_test_in_with_item2930);
            id2=test();

            state._fsp--;

            stream_test.add(id2.getTree());

            // AST REWRITE
            // elements: id1, id2
            // token labels: 
            // rule labels: retval, id2, id1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);
            RewriteRuleSubtreeStream stream_id1=new RewriteRuleSubtreeStream(adaptor,"rule id1",id1!=null?id1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 325:31: -> ^( WITH_EQUIV[$ref] $id1 $id2)
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:325:34: ^( WITH_EQUIV[$ref] $id1 $id2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WITH_EQUIV, ref)
                , root_1);

                adaptor.addChild(root_1, stream_id1.nextTree());

                adaptor.addChild(root_1, stream_id2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "with_item"


    public static class suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "suite"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:328:1: suite : ( NEWLINE INDENT ( stmt_inside_block )+ DEDENT -> ^( INDENT ( stmt_inside_block )+ ) | INDENT ( stmt_inside_block )+ DEDENT -> ^( INDENT ( stmt_inside_block )+ ) );
    public final PythonProvenanceParser.suite_return suite() throws RecognitionException {
        PythonProvenanceParser.suite_return retval = new PythonProvenanceParser.suite_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE186=null;
        Token INDENT187=null;
        Token DEDENT189=null;
        Token INDENT190=null;
        Token DEDENT192=null;
        PythonProvenanceParser.stmt_inside_block_return stmt_inside_block188 =null;

        PythonProvenanceParser.stmt_inside_block_return stmt_inside_block191 =null;


        Object NEWLINE186_tree=null;
        Object INDENT187_tree=null;
        Object DEDENT189_tree=null;
        Object INDENT190_tree=null;
        Object DEDENT192_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_stmt_inside_block=new RewriteRuleSubtreeStream(adaptor,"rule stmt_inside_block");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:328:7: ( NEWLINE INDENT ( stmt_inside_block )+ DEDENT -> ^( INDENT ( stmt_inside_block )+ ) | INDENT ( stmt_inside_block )+ DEDENT -> ^( INDENT ( stmt_inside_block )+ ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NEWLINE) ) {
                alt58=1;
            }
            else if ( (LA58_0==INDENT) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:328:9: NEWLINE INDENT ( stmt_inside_block )+ DEDENT
                    {
                    NEWLINE186=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_suite2955);  
                    stream_NEWLINE.add(NEWLINE186);


                    INDENT187=(Token)match(input,INDENT,FOLLOW_INDENT_in_suite2957);  
                    stream_INDENT.add(INDENT187);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:328:24: ( stmt_inside_block )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( ((LA56_0 >= AT && LA56_0 <= BACKQUOTE)||LA56_0==DOTTED_NAME||LA56_0==FLOAT||LA56_0==IF||LA56_0==INT||(LA56_0 >= LBRACK && LA56_0 <= LCURLY)||LA56_0==LONGINT||(LA56_0 >= LPAREN && LA56_0 <= MINUS)||LA56_0==NAME||LA56_0==NOT||LA56_0==PLUS||LA56_0==PRINT||LA56_0==STRING||LA56_0==TILDE||(LA56_0 >= 127 && LA56_0 <= 132)||LA56_0==136||(LA56_0 >= 138 && LA56_0 <= 147)) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:328:25: stmt_inside_block
                    	    {
                    	    pushFollow(FOLLOW_stmt_inside_block_in_suite2960);
                    	    stmt_inside_block188=stmt_inside_block();

                    	    state._fsp--;

                    	    stream_stmt_inside_block.add(stmt_inside_block188.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);


                    DEDENT189=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_suite2964);  
                    stream_DEDENT.add(DEDENT189);


                    // AST REWRITE
                    // elements: INDENT, stmt_inside_block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:52: -> ^( INDENT ( stmt_inside_block )+ )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:328:55: ^( INDENT ( stmt_inside_block )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_INDENT.nextNode()
                        , root_1);

                        if ( !(stream_stmt_inside_block.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_stmt_inside_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_stmt_inside_block.nextTree());

                        }
                        stream_stmt_inside_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:329:9: INDENT ( stmt_inside_block )+ DEDENT
                    {
                    INDENT190=(Token)match(input,INDENT,FOLLOW_INDENT_in_suite2983);  
                    stream_INDENT.add(INDENT190);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:329:16: ( stmt_inside_block )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0 >= AT && LA57_0 <= BACKQUOTE)||LA57_0==DOTTED_NAME||LA57_0==FLOAT||LA57_0==IF||LA57_0==INT||(LA57_0 >= LBRACK && LA57_0 <= LCURLY)||LA57_0==LONGINT||(LA57_0 >= LPAREN && LA57_0 <= MINUS)||LA57_0==NAME||LA57_0==NOT||LA57_0==PLUS||LA57_0==PRINT||LA57_0==STRING||LA57_0==TILDE||(LA57_0 >= 127 && LA57_0 <= 132)||LA57_0==136||(LA57_0 >= 138 && LA57_0 <= 147)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:329:17: stmt_inside_block
                    	    {
                    	    pushFollow(FOLLOW_stmt_inside_block_in_suite2986);
                    	    stmt_inside_block191=stmt_inside_block();

                    	    state._fsp--;

                    	    stream_stmt_inside_block.add(stmt_inside_block191.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);


                    DEDENT192=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_suite2990);  
                    stream_DEDENT.add(DEDENT192);


                    // AST REWRITE
                    // elements: stmt_inside_block, INDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:44: -> ^( INDENT ( stmt_inside_block )+ )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:329:47: ^( INDENT ( stmt_inside_block )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_INDENT.nextNode()
                        , root_1);

                        if ( !(stream_stmt_inside_block.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_stmt_inside_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_stmt_inside_block.nextTree());

                        }
                        stream_stmt_inside_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "suite"


    public static class test_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:333:1: test : or_test ;
    public final PythonProvenanceParser.test_return test() throws RecognitionException {
        PythonProvenanceParser.test_return retval = new PythonProvenanceParser.test_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.or_test_return or_test193 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:333:5: ( or_test )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:333:7: or_test
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_test_in_test3014);
            or_test193=or_test();

            state._fsp--;

            adaptor.addChild(root_0, or_test193.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "test"


    public static class or_test_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:336:1: or_test : and_test ( OR ^ and_test )* ;
    public final PythonProvenanceParser.or_test_return or_test() throws RecognitionException {
        PythonProvenanceParser.or_test_return retval = new PythonProvenanceParser.or_test_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR195=null;
        PythonProvenanceParser.and_test_return and_test194 =null;

        PythonProvenanceParser.and_test_return and_test196 =null;


        Object OR195_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:336:9: ( and_test ( OR ^ and_test )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:336:11: and_test ( OR ^ and_test )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_test_in_or_test3027);
            and_test194=and_test();

            state._fsp--;

            adaptor.addChild(root_0, and_test194.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:336:20: ( OR ^ and_test )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==OR) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:336:21: OR ^ and_test
            	    {
            	    OR195=(Token)match(input,OR,FOLLOW_OR_in_or_test3030); 
            	    OR195_tree = 
            	    (Object)adaptor.create(OR195)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR195_tree, root_0);


            	    pushFollow(FOLLOW_and_test_in_or_test3033);
            	    and_test196=and_test();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_test196.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or_test"


    public static class and_test_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:339:1: and_test : not_test ( AND ^ not_test )* ;
    public final PythonProvenanceParser.and_test_return and_test() throws RecognitionException {
        PythonProvenanceParser.and_test_return retval = new PythonProvenanceParser.and_test_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND198=null;
        PythonProvenanceParser.not_test_return not_test197 =null;

        PythonProvenanceParser.not_test_return not_test199 =null;


        Object AND198_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:339:10: ( not_test ( AND ^ not_test )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:339:12: not_test ( AND ^ not_test )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_not_test_in_and_test3052);
            not_test197=not_test();

            state._fsp--;

            adaptor.addChild(root_0, not_test197.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:339:21: ( AND ^ not_test )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==AND) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:339:22: AND ^ not_test
            	    {
            	    AND198=(Token)match(input,AND,FOLLOW_AND_in_and_test3055); 
            	    AND198_tree = 
            	    (Object)adaptor.create(AND198)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND198_tree, root_0);


            	    pushFollow(FOLLOW_not_test_in_and_test3058);
            	    not_test199=not_test();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not_test199.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_test"


    public static class not_test_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "not_test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:342:1: not_test : ( NOT ^ not_test | comparison );
    public final PythonProvenanceParser.not_test_return not_test() throws RecognitionException {
        PythonProvenanceParser.not_test_return retval = new PythonProvenanceParser.not_test_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT200=null;
        PythonProvenanceParser.not_test_return not_test201 =null;

        PythonProvenanceParser.comparison_return comparison202 =null;


        Object NOT200_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:342:10: ( NOT ^ not_test | comparison )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==NOT) ) {
                alt61=1;
            }
            else if ( (LA61_0==BACKQUOTE||LA61_0==DOTTED_NAME||LA61_0==FLOAT||LA61_0==INT||(LA61_0 >= LBRACK && LA61_0 <= LCURLY)||LA61_0==LONGINT||(LA61_0 >= LPAREN && LA61_0 <= MINUS)||LA61_0==NAME||LA61_0==PLUS||LA61_0==STRING||LA61_0==TILDE) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:342:12: NOT ^ not_test
                    {
                    root_0 = (Object)adaptor.nil();


                    NOT200=(Token)match(input,NOT,FOLLOW_NOT_in_not_test3087); 
                    NOT200_tree = 
                    (Object)adaptor.create(NOT200)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT200_tree, root_0);


                    pushFollow(FOLLOW_not_test_in_not_test3090);
                    not_test201=not_test();

                    state._fsp--;

                    adaptor.addChild(root_0, not_test201.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:343:4: comparison
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_comparison_in_not_test3095);
                    comparison202=comparison();

                    state._fsp--;

                    adaptor.addChild(root_0, comparison202.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "not_test"


    public static class comparison_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparison"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:1: comparison : expr ( ( LESS ^| GREATER ^| EQUAL ^| GREATEREQUAL ^| LESSEQUAL ^| ALT_NOTEQUAL ^| NOTEQUAL ^| IN ^| NOTIN ^| IS ^| ISNOT ^) expr )* ;
    public final PythonProvenanceParser.comparison_return comparison() throws RecognitionException {
        PythonProvenanceParser.comparison_return retval = new PythonProvenanceParser.comparison_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESS204=null;
        Token GREATER205=null;
        Token EQUAL206=null;
        Token GREATEREQUAL207=null;
        Token LESSEQUAL208=null;
        Token ALT_NOTEQUAL209=null;
        Token NOTEQUAL210=null;
        Token IN211=null;
        Token NOTIN212=null;
        Token IS213=null;
        Token ISNOT214=null;
        PythonProvenanceParser.expr_return expr203 =null;

        PythonProvenanceParser.expr_return expr215 =null;


        Object LESS204_tree=null;
        Object GREATER205_tree=null;
        Object EQUAL206_tree=null;
        Object GREATEREQUAL207_tree=null;
        Object LESSEQUAL208_tree=null;
        Object ALT_NOTEQUAL209_tree=null;
        Object NOTEQUAL210_tree=null;
        Object IN211_tree=null;
        Object NOTIN212_tree=null;
        Object IS213_tree=null;
        Object ISNOT214_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:11: ( expr ( ( LESS ^| GREATER ^| EQUAL ^| GREATEREQUAL ^| LESSEQUAL ^| ALT_NOTEQUAL ^| NOTEQUAL ^| IN ^| NOTIN ^| IS ^| ISNOT ^) expr )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:13: expr ( ( LESS ^| GREATER ^| EQUAL ^| GREATEREQUAL ^| LESSEQUAL ^| ALT_NOTEQUAL ^| NOTEQUAL ^| IN ^| NOTIN ^| IS ^| ISNOT ^) expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_comparison3112);
            expr203=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr203.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:18: ( ( LESS ^| GREATER ^| EQUAL ^| GREATEREQUAL ^| LESSEQUAL ^| ALT_NOTEQUAL ^| NOTEQUAL ^| IN ^| NOTIN ^| IS ^| ISNOT ^) expr )*
            loop63:
            do {
                int alt63=2;
                switch ( input.LA(1) ) {
                case IN:
                    {
                    alt63=1;
                    }
                    break;
                case LESS:
                    {
                    alt63=1;
                    }
                    break;
                case GREATER:
                    {
                    alt63=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt63=1;
                    }
                    break;
                case GREATEREQUAL:
                    {
                    alt63=1;
                    }
                    break;
                case LESSEQUAL:
                    {
                    alt63=1;
                    }
                    break;
                case ALT_NOTEQUAL:
                    {
                    alt63=1;
                    }
                    break;
                case NOTEQUAL:
                    {
                    alt63=1;
                    }
                    break;
                case NOTIN:
                    {
                    alt63=1;
                    }
                    break;
                case IS:
                    {
                    alt63=1;
                    }
                    break;
                case ISNOT:
                    {
                    alt63=1;
                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:20: ( LESS ^| GREATER ^| EQUAL ^| GREATEREQUAL ^| LESSEQUAL ^| ALT_NOTEQUAL ^| NOTEQUAL ^| IN ^| NOTIN ^| IS ^| ISNOT ^) expr
            	    {
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:20: ( LESS ^| GREATER ^| EQUAL ^| GREATEREQUAL ^| LESSEQUAL ^| ALT_NOTEQUAL ^| NOTEQUAL ^| IN ^| NOTIN ^| IS ^| ISNOT ^)
            	    int alt62=11;
            	    switch ( input.LA(1) ) {
            	    case LESS:
            	        {
            	        alt62=1;
            	        }
            	        break;
            	    case GREATER:
            	        {
            	        alt62=2;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt62=3;
            	        }
            	        break;
            	    case GREATEREQUAL:
            	        {
            	        alt62=4;
            	        }
            	        break;
            	    case LESSEQUAL:
            	        {
            	        alt62=5;
            	        }
            	        break;
            	    case ALT_NOTEQUAL:
            	        {
            	        alt62=6;
            	        }
            	        break;
            	    case NOTEQUAL:
            	        {
            	        alt62=7;
            	        }
            	        break;
            	    case IN:
            	        {
            	        alt62=8;
            	        }
            	        break;
            	    case NOTIN:
            	        {
            	        alt62=9;
            	        }
            	        break;
            	    case IS:
            	        {
            	        alt62=10;
            	        }
            	        break;
            	    case ISNOT:
            	        {
            	        alt62=11;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt62) {
            	        case 1 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:21: LESS ^
            	            {
            	            LESS204=(Token)match(input,LESS,FOLLOW_LESS_in_comparison3117); 
            	            LESS204_tree = 
            	            (Object)adaptor.create(LESS204)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LESS204_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:27: GREATER ^
            	            {
            	            GREATER205=(Token)match(input,GREATER,FOLLOW_GREATER_in_comparison3120); 
            	            GREATER205_tree = 
            	            (Object)adaptor.create(GREATER205)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GREATER205_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:36: EQUAL ^
            	            {
            	            EQUAL206=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_comparison3123); 
            	            EQUAL206_tree = 
            	            (Object)adaptor.create(EQUAL206)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL206_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:43: GREATEREQUAL ^
            	            {
            	            GREATEREQUAL207=(Token)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_comparison3126); 
            	            GREATEREQUAL207_tree = 
            	            (Object)adaptor.create(GREATEREQUAL207)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GREATEREQUAL207_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:57: LESSEQUAL ^
            	            {
            	            LESSEQUAL208=(Token)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_comparison3129); 
            	            LESSEQUAL208_tree = 
            	            (Object)adaptor.create(LESSEQUAL208)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LESSEQUAL208_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:68: ALT_NOTEQUAL ^
            	            {
            	            ALT_NOTEQUAL209=(Token)match(input,ALT_NOTEQUAL,FOLLOW_ALT_NOTEQUAL_in_comparison3132); 
            	            ALT_NOTEQUAL209_tree = 
            	            (Object)adaptor.create(ALT_NOTEQUAL209)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(ALT_NOTEQUAL209_tree, root_0);


            	            }
            	            break;
            	        case 7 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:82: NOTEQUAL ^
            	            {
            	            NOTEQUAL210=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_comparison3135); 
            	            NOTEQUAL210_tree = 
            	            (Object)adaptor.create(NOTEQUAL210)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(NOTEQUAL210_tree, root_0);


            	            }
            	            break;
            	        case 8 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:92: IN ^
            	            {
            	            IN211=(Token)match(input,IN,FOLLOW_IN_in_comparison3138); 
            	            IN211_tree = 
            	            (Object)adaptor.create(IN211)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(IN211_tree, root_0);


            	            }
            	            break;
            	        case 9 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:96: NOTIN ^
            	            {
            	            NOTIN212=(Token)match(input,NOTIN,FOLLOW_NOTIN_in_comparison3141); 
            	            NOTIN212_tree = 
            	            (Object)adaptor.create(NOTIN212)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(NOTIN212_tree, root_0);


            	            }
            	            break;
            	        case 10 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:103: IS ^
            	            {
            	            IS213=(Token)match(input,IS,FOLLOW_IS_in_comparison3144); 
            	            IS213_tree = 
            	            (Object)adaptor.create(IS213)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(IS213_tree, root_0);


            	            }
            	            break;
            	        case 11 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:346:107: ISNOT ^
            	            {
            	            ISNOT214=(Token)match(input,ISNOT,FOLLOW_ISNOT_in_comparison3147); 
            	            ISNOT214_tree = 
            	            (Object)adaptor.create(ISNOT214)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(ISNOT214_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_in_comparison3151);
            	    expr215=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr215.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comparison"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:349:1: expr : xor_expr ( VBAR ^ xor_expr )* ;
    public final PythonProvenanceParser.expr_return expr() throws RecognitionException {
        PythonProvenanceParser.expr_return retval = new PythonProvenanceParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VBAR217=null;
        PythonProvenanceParser.xor_expr_return xor_expr216 =null;

        PythonProvenanceParser.xor_expr_return xor_expr218 =null;


        Object VBAR217_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:349:6: ( xor_expr ( VBAR ^ xor_expr )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:349:8: xor_expr ( VBAR ^ xor_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_xor_expr_in_expr3172);
            xor_expr216=xor_expr();

            state._fsp--;

            adaptor.addChild(root_0, xor_expr216.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:349:17: ( VBAR ^ xor_expr )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==VBAR) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:349:18: VBAR ^ xor_expr
            	    {
            	    VBAR217=(Token)match(input,VBAR,FOLLOW_VBAR_in_expr3175); 
            	    VBAR217_tree = 
            	    (Object)adaptor.create(VBAR217)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(VBAR217_tree, root_0);


            	    pushFollow(FOLLOW_xor_expr_in_expr3178);
            	    xor_expr218=xor_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xor_expr218.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class xor_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:352:1: xor_expr : and_expr ( CIRCUMFLEX ^ and_expr )* ;
    public final PythonProvenanceParser.xor_expr_return xor_expr() throws RecognitionException {
        PythonProvenanceParser.xor_expr_return retval = new PythonProvenanceParser.xor_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CIRCUMFLEX220=null;
        PythonProvenanceParser.and_expr_return and_expr219 =null;

        PythonProvenanceParser.and_expr_return and_expr221 =null;


        Object CIRCUMFLEX220_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:352:10: ( and_expr ( CIRCUMFLEX ^ and_expr )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:352:12: and_expr ( CIRCUMFLEX ^ and_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expr_in_xor_expr3194);
            and_expr219=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr219.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:352:21: ( CIRCUMFLEX ^ and_expr )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==CIRCUMFLEX) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:352:22: CIRCUMFLEX ^ and_expr
            	    {
            	    CIRCUMFLEX220=(Token)match(input,CIRCUMFLEX,FOLLOW_CIRCUMFLEX_in_xor_expr3197); 
            	    CIRCUMFLEX220_tree = 
            	    (Object)adaptor.create(CIRCUMFLEX220)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(CIRCUMFLEX220_tree, root_0);


            	    pushFollow(FOLLOW_and_expr_in_xor_expr3200);
            	    and_expr221=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr221.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xor_expr"


    public static class and_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:355:1: and_expr : shift_expr ( AMPER ^ shift_expr )* ;
    public final PythonProvenanceParser.and_expr_return and_expr() throws RecognitionException {
        PythonProvenanceParser.and_expr_return retval = new PythonProvenanceParser.and_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AMPER223=null;
        PythonProvenanceParser.shift_expr_return shift_expr222 =null;

        PythonProvenanceParser.shift_expr_return shift_expr224 =null;


        Object AMPER223_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:355:10: ( shift_expr ( AMPER ^ shift_expr )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:355:12: shift_expr ( AMPER ^ shift_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expr_in_and_expr3220);
            shift_expr222=shift_expr();

            state._fsp--;

            adaptor.addChild(root_0, shift_expr222.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:355:23: ( AMPER ^ shift_expr )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==AMPER) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:355:24: AMPER ^ shift_expr
            	    {
            	    AMPER223=(Token)match(input,AMPER,FOLLOW_AMPER_in_and_expr3223); 
            	    AMPER223_tree = 
            	    (Object)adaptor.create(AMPER223)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPER223_tree, root_0);


            	    pushFollow(FOLLOW_shift_expr_in_and_expr3226);
            	    shift_expr224=shift_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expr224.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_expr"


    public static class shift_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:1: shift_expr : arith_expr ( ( LEFTSHIFT ^| RIGHTSHIFT ^) arith_expr )* ;
    public final PythonProvenanceParser.shift_expr_return shift_expr() throws RecognitionException {
        PythonProvenanceParser.shift_expr_return retval = new PythonProvenanceParser.shift_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFTSHIFT226=null;
        Token RIGHTSHIFT227=null;
        PythonProvenanceParser.arith_expr_return arith_expr225 =null;

        PythonProvenanceParser.arith_expr_return arith_expr228 =null;


        Object LEFTSHIFT226_tree=null;
        Object RIGHTSHIFT227_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:12: ( arith_expr ( ( LEFTSHIFT ^| RIGHTSHIFT ^) arith_expr )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:14: arith_expr ( ( LEFTSHIFT ^| RIGHTSHIFT ^) arith_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arith_expr_in_shift_expr3246);
            arith_expr225=arith_expr();

            state._fsp--;

            adaptor.addChild(root_0, arith_expr225.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:25: ( ( LEFTSHIFT ^| RIGHTSHIFT ^) arith_expr )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==LEFTSHIFT) ) {
                    alt68=1;
                }
                else if ( (LA68_0==RIGHTSHIFT) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:26: ( LEFTSHIFT ^| RIGHTSHIFT ^) arith_expr
            	    {
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:26: ( LEFTSHIFT ^| RIGHTSHIFT ^)
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==LEFTSHIFT) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==RIGHTSHIFT) ) {
            	        alt67=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:27: LEFTSHIFT ^
            	            {
            	            LEFTSHIFT226=(Token)match(input,LEFTSHIFT,FOLLOW_LEFTSHIFT_in_shift_expr3250); 
            	            LEFTSHIFT226_tree = 
            	            (Object)adaptor.create(LEFTSHIFT226)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LEFTSHIFT226_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:358:38: RIGHTSHIFT ^
            	            {
            	            RIGHTSHIFT227=(Token)match(input,RIGHTSHIFT,FOLLOW_RIGHTSHIFT_in_shift_expr3253); 
            	            RIGHTSHIFT227_tree = 
            	            (Object)adaptor.create(RIGHTSHIFT227)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(RIGHTSHIFT227_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_arith_expr_in_shift_expr3257);
            	    arith_expr228=arith_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arith_expr228.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shift_expr"


    public static class arith_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:1: arith_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final PythonProvenanceParser.arith_expr_return arith_expr() throws RecognitionException {
        PythonProvenanceParser.arith_expr_return retval = new PythonProvenanceParser.arith_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS230=null;
        Token MINUS231=null;
        PythonProvenanceParser.term_return term229 =null;

        PythonProvenanceParser.term_return term232 =null;


        Object PLUS230_tree=null;
        Object MINUS231_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:11: ( term ( ( PLUS ^| MINUS ^) term )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arith_expr3278);
            term229=term();

            state._fsp--;

            adaptor.addChild(root_0, term229.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:18: ( ( PLUS ^| MINUS ^) term )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==PLUS) ) {
                    alt70=1;
                }
                else if ( (LA70_0==MINUS) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:19: ( PLUS ^| MINUS ^) term
            	    {
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:19: ( PLUS ^| MINUS ^)
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==PLUS) ) {
            	        alt69=1;
            	    }
            	    else if ( (LA69_0==MINUS) ) {
            	        alt69=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 69, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:20: PLUS ^
            	            {
            	            PLUS230=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_expr3282); 
            	            PLUS230_tree = 
            	            (Object)adaptor.create(PLUS230)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS230_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:361:26: MINUS ^
            	            {
            	            MINUS231=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_expr3285); 
            	            MINUS231_tree = 
            	            (Object)adaptor.create(MINUS231)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MINUS231_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_arith_expr3289);
            	    term232=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term232.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arith_expr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:1: term : factor ( ( STAR ^| SLASH ^| DOUBLESLASH ^| DOUBLESTAR ^) factor )* ;
    public final PythonProvenanceParser.term_return term() throws RecognitionException {
        PythonProvenanceParser.term_return retval = new PythonProvenanceParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR234=null;
        Token SLASH235=null;
        Token DOUBLESLASH236=null;
        Token DOUBLESTAR237=null;
        PythonProvenanceParser.factor_return factor233 =null;

        PythonProvenanceParser.factor_return factor238 =null;


        Object STAR234_tree=null;
        Object SLASH235_tree=null;
        Object DOUBLESLASH236_tree=null;
        Object DOUBLESTAR237_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:6: ( factor ( ( STAR ^| SLASH ^| DOUBLESLASH ^| DOUBLESTAR ^) factor )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:8: factor ( ( STAR ^| SLASH ^| DOUBLESLASH ^| DOUBLESTAR ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3310);
            factor233=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor233.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:15: ( ( STAR ^| SLASH ^| DOUBLESLASH ^| DOUBLESTAR ^) factor )*
            loop72:
            do {
                int alt72=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt72=1;
                    }
                    break;
                case SLASH:
                    {
                    alt72=1;
                    }
                    break;
                case DOUBLESLASH:
                    {
                    alt72=1;
                    }
                    break;
                case DOUBLESTAR:
                    {
                    alt72=1;
                    }
                    break;

                }

                switch (alt72) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:16: ( STAR ^| SLASH ^| DOUBLESLASH ^| DOUBLESTAR ^) factor
            	    {
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:16: ( STAR ^| SLASH ^| DOUBLESLASH ^| DOUBLESTAR ^)
            	    int alt71=4;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt71=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt71=2;
            	        }
            	        break;
            	    case DOUBLESLASH:
            	        {
            	        alt71=3;
            	        }
            	        break;
            	    case DOUBLESTAR:
            	        {
            	        alt71=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt71) {
            	        case 1 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:17: STAR ^
            	            {
            	            STAR234=(Token)match(input,STAR,FOLLOW_STAR_in_term3314); 
            	            STAR234_tree = 
            	            (Object)adaptor.create(STAR234)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR234_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:25: SLASH ^
            	            {
            	            SLASH235=(Token)match(input,SLASH,FOLLOW_SLASH_in_term3319); 
            	            SLASH235_tree = 
            	            (Object)adaptor.create(SLASH235)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH235_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:34: DOUBLESLASH ^
            	            {
            	            DOUBLESLASH236=(Token)match(input,DOUBLESLASH,FOLLOW_DOUBLESLASH_in_term3324); 
            	            DOUBLESLASH236_tree = 
            	            (Object)adaptor.create(DOUBLESLASH236)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DOUBLESLASH236_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:364:49: DOUBLESTAR ^
            	            {
            	            DOUBLESTAR237=(Token)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_term3329); 
            	            DOUBLESTAR237_tree = 
            	            (Object)adaptor.create(DOUBLESTAR237)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DOUBLESTAR237_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3334);
            	    factor238=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor238.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:368:1: factor : (op= PLUS power -> ^( UNARY_EXPRESSION $op power ) |op= MINUS power -> ^( UNARY_EXPRESSION $op power ) |op= TILDE power -> ^( UNARY_EXPRESSION $op power ) | power );
    public final PythonProvenanceParser.factor_return factor() throws RecognitionException {
        PythonProvenanceParser.factor_return retval = new PythonProvenanceParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token op=null;
        PythonProvenanceParser.power_return power239 =null;

        PythonProvenanceParser.power_return power240 =null;

        PythonProvenanceParser.power_return power241 =null;

        PythonProvenanceParser.power_return power242 =null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
        RewriteRuleSubtreeStream stream_power=new RewriteRuleSubtreeStream(adaptor,"rule power");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:368:8: (op= PLUS power -> ^( UNARY_EXPRESSION $op power ) |op= MINUS power -> ^( UNARY_EXPRESSION $op power ) |op= TILDE power -> ^( UNARY_EXPRESSION $op power ) | power )
            int alt73=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt73=1;
                }
                break;
            case MINUS:
                {
                alt73=2;
                }
                break;
            case TILDE:
                {
                alt73=3;
                }
                break;
            case BACKQUOTE:
            case DOTTED_NAME:
            case FLOAT:
            case INT:
            case LBRACK:
            case LCURLY:
            case LONGINT:
            case LPAREN:
            case NAME:
            case STRING:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:368:10: op= PLUS power
                    {
                    op=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3353);  
                    stream_PLUS.add(op);


                    pushFollow(FOLLOW_power_in_factor3355);
                    power239=power();

                    state._fsp--;

                    stream_power.add(power239.getTree());

                    // AST REWRITE
                    // elements: power, op
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 368:24: -> ^( UNARY_EXPRESSION $op power )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:368:27: ^( UNARY_EXPRESSION $op power )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());

                        adaptor.addChild(root_1, stream_power.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:369:4: op= MINUS power
                    {
                    op=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3376);  
                    stream_MINUS.add(op);


                    pushFollow(FOLLOW_power_in_factor3378);
                    power240=power();

                    state._fsp--;

                    stream_power.add(power240.getTree());

                    // AST REWRITE
                    // elements: power, op
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 369:21: -> ^( UNARY_EXPRESSION $op power )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:369:24: ^( UNARY_EXPRESSION $op power )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());

                        adaptor.addChild(root_1, stream_power.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:370:4: op= TILDE power
                    {
                    op=(Token)match(input,TILDE,FOLLOW_TILDE_in_factor3398);  
                    stream_TILDE.add(op);


                    pushFollow(FOLLOW_power_in_factor3400);
                    power241=power();

                    state._fsp--;

                    stream_power.add(power241.getTree());

                    // AST REWRITE
                    // elements: power, op
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 370:21: -> ^( UNARY_EXPRESSION $op power )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:370:24: ^( UNARY_EXPRESSION $op power )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());

                        adaptor.addChild(root_1, stream_power.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:372:4: power
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_power_in_factor3418);
                    power242=power();

                    state._fsp--;

                    adaptor.addChild(root_0, power242.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class power_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "power"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:1: power : atom ( trailer )? ( DOT power )? -> ^( EXPRESSION atom ( trailer )? ( power )? ) ;
    public final PythonProvenanceParser.power_return power() throws RecognitionException {
        PythonProvenanceParser.power_return retval = new PythonProvenanceParser.power_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT245=null;
        PythonProvenanceParser.atom_return atom243 =null;

        PythonProvenanceParser.trailer_return trailer244 =null;

        PythonProvenanceParser.power_return power246 =null;


        Object DOT245_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_trailer=new RewriteRuleSubtreeStream(adaptor,"rule trailer");
        RewriteRuleSubtreeStream stream_power=new RewriteRuleSubtreeStream(adaptor,"rule power");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:7: ( atom ( trailer )? ( DOT power )? -> ^( EXPRESSION atom ( trailer )? ( power )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:9: atom ( trailer )? ( DOT power )?
            {
            pushFollow(FOLLOW_atom_in_power3434);
            atom243=atom();

            state._fsp--;

            stream_atom.add(atom243.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:14: ( trailer )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LPAREN) ) {
                alt74=1;
            }
            else if ( (LA74_0==LBRACK) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:15: trailer
                    {
                    pushFollow(FOLLOW_trailer_in_power3437);
                    trailer244=trailer();

                    state._fsp--;

                    stream_trailer.add(trailer244.getTree());

                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:25: ( DOT power )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==DOT) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:26: DOT power
                    {
                    DOT245=(Token)match(input,DOT,FOLLOW_DOT_in_power3442);  
                    stream_DOT.add(DOT245);


                    pushFollow(FOLLOW_power_in_power3444);
                    power246=power();

                    state._fsp--;

                    stream_power.add(power246.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: power, atom, trailer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 375:38: -> ^( EXPRESSION atom ( trailer )? ( power )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:41: ^( EXPRESSION atom ( trailer )? ( power )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_atom.nextTree());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:59: ( trailer )?
                if ( stream_trailer.hasNext() ) {
                    adaptor.addChild(root_1, stream_trailer.nextTree());

                }
                stream_trailer.reset();

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:375:68: ( power )?
                if ( stream_power.hasNext() ) {
                    adaptor.addChild(root_1, stream_power.nextTree());

                }
                stream_power.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "power"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:378:1: atom : (ref= LPAREN ( testlist_gexp )? RPAREN -> ^( INNER_BRANCH[$ref] testlist_gexp ) |ref= LBRACK ( listmaker ) -> ^( LISTMAKER_CMD[$ref] ( listmaker )? ) |ref= LCURLY ( dictmaker ) -> ^( DICTMAKER_CMD[$ref] ( dictmaker )? ) | BACKQUOTE ! testlist BACKQUOTE !|id1= NAME ( PERCENT test )? -> ^( VARIABLE_CMD[$id1] $id1 ( test )? ) |id1= DOTTED_NAME ( PERCENT test )? -> ^( CLASSVARIABLE_CMD[$id1] $id1 ( test )? ) |id1= INT ( PERCENT test )? -> ^( VALUETYPE[$id1] INT_TYPE $id1 ( test )? ) |id1= LONGINT ( PERCENT test )? -> ^( VALUETYPE[$id1] LONG_TYPE $id1 ( test )? ) |id1= FLOAT ( PERCENT test )? -> ^( VALUETYPE[$id1] DOUBLE_TYPE $id1 ( test )? ) |id1= STRING ( PERCENT string_argument )? -> ^( VALUETYPE[$id1] STRING_TYPE $id1 ( string_argument )? ) );
    public final PythonProvenanceParser.atom_return atom() throws RecognitionException {
        PythonProvenanceParser.atom_return retval = new PythonProvenanceParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token id1=null;
        Token RPAREN248=null;
        Token BACKQUOTE251=null;
        Token BACKQUOTE253=null;
        Token PERCENT254=null;
        Token PERCENT256=null;
        Token PERCENT258=null;
        Token PERCENT260=null;
        Token PERCENT262=null;
        Token PERCENT264=null;
        PythonProvenanceParser.testlist_gexp_return testlist_gexp247 =null;

        PythonProvenanceParser.listmaker_return listmaker249 =null;

        PythonProvenanceParser.dictmaker_return dictmaker250 =null;

        PythonProvenanceParser.testlist_return testlist252 =null;

        PythonProvenanceParser.test_return test255 =null;

        PythonProvenanceParser.test_return test257 =null;

        PythonProvenanceParser.test_return test259 =null;

        PythonProvenanceParser.test_return test261 =null;

        PythonProvenanceParser.test_return test263 =null;

        PythonProvenanceParser.string_argument_return string_argument265 =null;


        Object ref_tree=null;
        Object id1_tree=null;
        Object RPAREN248_tree=null;
        Object BACKQUOTE251_tree=null;
        Object BACKQUOTE253_tree=null;
        Object PERCENT254_tree=null;
        Object PERCENT256_tree=null;
        Object PERCENT258_tree=null;
        Object PERCENT260_tree=null;
        Object PERCENT262_tree=null;
        Object PERCENT264_tree=null;
        RewriteRuleTokenStream stream_LONGINT=new RewriteRuleTokenStream(adaptor,"token LONGINT");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
        RewriteRuleTokenStream stream_DOTTED_NAME=new RewriteRuleTokenStream(adaptor,"token DOTTED_NAME");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_string_argument=new RewriteRuleSubtreeStream(adaptor,"rule string_argument");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_testlist_gexp=new RewriteRuleSubtreeStream(adaptor,"rule testlist_gexp");
        RewriteRuleSubtreeStream stream_dictmaker=new RewriteRuleSubtreeStream(adaptor,"rule dictmaker");
        RewriteRuleSubtreeStream stream_listmaker=new RewriteRuleSubtreeStream(adaptor,"rule listmaker");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:378:6: (ref= LPAREN ( testlist_gexp )? RPAREN -> ^( INNER_BRANCH[$ref] testlist_gexp ) |ref= LBRACK ( listmaker ) -> ^( LISTMAKER_CMD[$ref] ( listmaker )? ) |ref= LCURLY ( dictmaker ) -> ^( DICTMAKER_CMD[$ref] ( dictmaker )? ) | BACKQUOTE ! testlist BACKQUOTE !|id1= NAME ( PERCENT test )? -> ^( VARIABLE_CMD[$id1] $id1 ( test )? ) |id1= DOTTED_NAME ( PERCENT test )? -> ^( CLASSVARIABLE_CMD[$id1] $id1 ( test )? ) |id1= INT ( PERCENT test )? -> ^( VALUETYPE[$id1] INT_TYPE $id1 ( test )? ) |id1= LONGINT ( PERCENT test )? -> ^( VALUETYPE[$id1] LONG_TYPE $id1 ( test )? ) |id1= FLOAT ( PERCENT test )? -> ^( VALUETYPE[$id1] DOUBLE_TYPE $id1 ( test )? ) |id1= STRING ( PERCENT string_argument )? -> ^( VALUETYPE[$id1] STRING_TYPE $id1 ( string_argument )? ) )
            int alt83=10;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt83=1;
                }
                break;
            case LBRACK:
                {
                alt83=2;
                }
                break;
            case LCURLY:
                {
                alt83=3;
                }
                break;
            case BACKQUOTE:
                {
                alt83=4;
                }
                break;
            case NAME:
                {
                alt83=5;
                }
                break;
            case DOTTED_NAME:
                {
                alt83=6;
                }
                break;
            case INT:
                {
                alt83=7;
                }
                break;
            case LONGINT:
                {
                alt83=8;
                }
                break;
            case FLOAT:
                {
                alt83=9;
                }
                break;
            case STRING:
                {
                alt83=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }

            switch (alt83) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:378:8: ref= LPAREN ( testlist_gexp )? RPAREN
                    {
                    ref=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom3473);  
                    stream_LPAREN.add(ref);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:379:8: ( testlist_gexp )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BACKQUOTE||LA76_0==DOTTED_NAME||LA76_0==FLOAT||LA76_0==INT||(LA76_0 >= LBRACK && LA76_0 <= LCURLY)||LA76_0==LONGINT||(LA76_0 >= LPAREN && LA76_0 <= MINUS)||LA76_0==NAME||LA76_0==NOT||LA76_0==PLUS||LA76_0==STRING||LA76_0==TILDE) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:380:8: testlist_gexp
                            {
                            pushFollow(FOLLOW_testlist_gexp_in_atom3492);
                            testlist_gexp247=testlist_gexp();

                            state._fsp--;

                            stream_testlist_gexp.add(testlist_gexp247.getTree());

                            }
                            break;

                    }


                    RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom3512);  
                    stream_RPAREN.add(RPAREN248);


                    // AST REWRITE
                    // elements: testlist_gexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:15: -> ^( INNER_BRANCH[$ref] testlist_gexp )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:382:18: ^( INNER_BRANCH[$ref] testlist_gexp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INNER_BRANCH, ref)
                        , root_1);

                        adaptor.addChild(root_1, stream_testlist_gexp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:383:8: ref= LBRACK ( listmaker )
                    {
                    ref=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_atom3532);  
                    stream_LBRACK.add(ref);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:383:19: ( listmaker )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:383:20: listmaker
                    {
                    pushFollow(FOLLOW_listmaker_in_atom3535);
                    listmaker249=listmaker();

                    state._fsp--;

                    stream_listmaker.add(listmaker249.getTree());

                    }


                    // AST REWRITE
                    // elements: listmaker
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 383:32: -> ^( LISTMAKER_CMD[$ref] ( listmaker )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:383:35: ^( LISTMAKER_CMD[$ref] ( listmaker )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LISTMAKER_CMD, ref)
                        , root_1);

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:383:57: ( listmaker )?
                        if ( stream_listmaker.hasNext() ) {
                            adaptor.addChild(root_1, stream_listmaker.nextTree());

                        }
                        stream_listmaker.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:384:8: ref= LCURLY ( dictmaker )
                    {
                    ref=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_atom3558);  
                    stream_LCURLY.add(ref);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:384:19: ( dictmaker )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:384:20: dictmaker
                    {
                    pushFollow(FOLLOW_dictmaker_in_atom3561);
                    dictmaker250=dictmaker();

                    state._fsp--;

                    stream_dictmaker.add(dictmaker250.getTree());

                    }


                    // AST REWRITE
                    // elements: dictmaker
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:31: -> ^( DICTMAKER_CMD[$ref] ( dictmaker )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:384:34: ^( DICTMAKER_CMD[$ref] ( dictmaker )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DICTMAKER_CMD, ref)
                        , root_1);

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:384:56: ( dictmaker )?
                        if ( stream_dictmaker.hasNext() ) {
                            adaptor.addChild(root_1, stream_dictmaker.nextTree());

                        }
                        stream_dictmaker.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:385:8: BACKQUOTE ! testlist BACKQUOTE !
                    {
                    root_0 = (Object)adaptor.nil();


                    BACKQUOTE251=(Token)match(input,BACKQUOTE,FOLLOW_BACKQUOTE_in_atom3581); 

                    pushFollow(FOLLOW_testlist_in_atom3584);
                    testlist252=testlist();

                    state._fsp--;

                    adaptor.addChild(root_0, testlist252.getTree());

                    BACKQUOTE253=(Token)match(input,BACKQUOTE,FOLLOW_BACKQUOTE_in_atom3586); 

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:386:8: id1= NAME ( PERCENT test )?
                    {
                    id1=(Token)match(input,NAME,FOLLOW_NAME_in_atom3598);  
                    stream_NAME.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:386:17: ( PERCENT test )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==PERCENT) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==BACKQUOTE||LA77_1==DOTTED_NAME||LA77_1==FLOAT||LA77_1==INT||(LA77_1 >= LBRACK && LA77_1 <= LCURLY)||LA77_1==LONGINT||(LA77_1 >= LPAREN && LA77_1 <= MINUS)||LA77_1==NAME||LA77_1==NOT||LA77_1==PLUS||LA77_1==STRING||LA77_1==TILDE) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:386:18: PERCENT test
                            {
                            PERCENT254=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3601);  
                            stream_PERCENT.add(PERCENT254);


                            pushFollow(FOLLOW_test_in_atom3603);
                            test255=test();

                            state._fsp--;

                            stream_test.add(test255.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id1, test
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 386:33: -> ^( VARIABLE_CMD[$id1] $id1 ( test )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:386:36: ^( VARIABLE_CMD[$id1] $id1 ( test )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VARIABLE_CMD, id1)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:386:62: ( test )?
                        if ( stream_test.hasNext() ) {
                            adaptor.addChild(root_1, stream_test.nextTree());

                        }
                        stream_test.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:387:8: id1= DOTTED_NAME ( PERCENT test )?
                    {
                    id1=(Token)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_atom3629);  
                    stream_DOTTED_NAME.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:387:24: ( PERCENT test )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==PERCENT) ) {
                        int LA78_1 = input.LA(2);

                        if ( (LA78_1==BACKQUOTE||LA78_1==DOTTED_NAME||LA78_1==FLOAT||LA78_1==INT||(LA78_1 >= LBRACK && LA78_1 <= LCURLY)||LA78_1==LONGINT||(LA78_1 >= LPAREN && LA78_1 <= MINUS)||LA78_1==NAME||LA78_1==NOT||LA78_1==PLUS||LA78_1==STRING||LA78_1==TILDE) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:387:25: PERCENT test
                            {
                            PERCENT256=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3632);  
                            stream_PERCENT.add(PERCENT256);


                            pushFollow(FOLLOW_test_in_atom3634);
                            test257=test();

                            state._fsp--;

                            stream_test.add(test257.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: test, id1
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 387:40: -> ^( CLASSVARIABLE_CMD[$id1] $id1 ( test )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:387:43: ^( CLASSVARIABLE_CMD[$id1] $id1 ( test )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CLASSVARIABLE_CMD, id1)
                        , root_1);

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:387:74: ( test )?
                        if ( stream_test.hasNext() ) {
                            adaptor.addChild(root_1, stream_test.nextTree());

                        }
                        stream_test.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:388:8: id1= INT ( PERCENT test )?
                    {
                    id1=(Token)match(input,INT,FOLLOW_INT_in_atom3660);  
                    stream_INT.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:388:16: ( PERCENT test )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==PERCENT) ) {
                        int LA79_1 = input.LA(2);

                        if ( (LA79_1==BACKQUOTE||LA79_1==DOTTED_NAME||LA79_1==FLOAT||LA79_1==INT||(LA79_1 >= LBRACK && LA79_1 <= LCURLY)||LA79_1==LONGINT||(LA79_1 >= LPAREN && LA79_1 <= MINUS)||LA79_1==NAME||LA79_1==NOT||LA79_1==PLUS||LA79_1==STRING||LA79_1==TILDE) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:388:17: PERCENT test
                            {
                            PERCENT258=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3663);  
                            stream_PERCENT.add(PERCENT258);


                            pushFollow(FOLLOW_test_in_atom3665);
                            test259=test();

                            state._fsp--;

                            stream_test.add(test259.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id1, test
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 388:32: -> ^( VALUETYPE[$id1] INT_TYPE $id1 ( test )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:388:35: ^( VALUETYPE[$id1] INT_TYPE $id1 ( test )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VALUETYPE, id1)
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(INT_TYPE, "INT_TYPE")
                        );

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:388:67: ( test )?
                        if ( stream_test.hasNext() ) {
                            adaptor.addChild(root_1, stream_test.nextTree());

                        }
                        stream_test.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:389:8: id1= LONGINT ( PERCENT test )?
                    {
                    id1=(Token)match(input,LONGINT,FOLLOW_LONGINT_in_atom3693);  
                    stream_LONGINT.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:389:20: ( PERCENT test )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==PERCENT) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==BACKQUOTE||LA80_1==DOTTED_NAME||LA80_1==FLOAT||LA80_1==INT||(LA80_1 >= LBRACK && LA80_1 <= LCURLY)||LA80_1==LONGINT||(LA80_1 >= LPAREN && LA80_1 <= MINUS)||LA80_1==NAME||LA80_1==NOT||LA80_1==PLUS||LA80_1==STRING||LA80_1==TILDE) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:389:21: PERCENT test
                            {
                            PERCENT260=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3696);  
                            stream_PERCENT.add(PERCENT260);


                            pushFollow(FOLLOW_test_in_atom3698);
                            test261=test();

                            state._fsp--;

                            stream_test.add(test261.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id1, test
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 389:36: -> ^( VALUETYPE[$id1] LONG_TYPE $id1 ( test )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:389:39: ^( VALUETYPE[$id1] LONG_TYPE $id1 ( test )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VALUETYPE, id1)
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(LONG_TYPE, "LONG_TYPE")
                        );

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:389:72: ( test )?
                        if ( stream_test.hasNext() ) {
                            adaptor.addChild(root_1, stream_test.nextTree());

                        }
                        stream_test.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:390:8: id1= FLOAT ( PERCENT test )?
                    {
                    id1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom3726);  
                    stream_FLOAT.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:390:18: ( PERCENT test )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==PERCENT) ) {
                        int LA81_1 = input.LA(2);

                        if ( (LA81_1==BACKQUOTE||LA81_1==DOTTED_NAME||LA81_1==FLOAT||LA81_1==INT||(LA81_1 >= LBRACK && LA81_1 <= LCURLY)||LA81_1==LONGINT||(LA81_1 >= LPAREN && LA81_1 <= MINUS)||LA81_1==NAME||LA81_1==NOT||LA81_1==PLUS||LA81_1==STRING||LA81_1==TILDE) ) {
                            alt81=1;
                        }
                    }
                    switch (alt81) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:390:19: PERCENT test
                            {
                            PERCENT262=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3729);  
                            stream_PERCENT.add(PERCENT262);


                            pushFollow(FOLLOW_test_in_atom3731);
                            test263=test();

                            state._fsp--;

                            stream_test.add(test263.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: test, id1
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 390:34: -> ^( VALUETYPE[$id1] DOUBLE_TYPE $id1 ( test )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:390:37: ^( VALUETYPE[$id1] DOUBLE_TYPE $id1 ( test )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VALUETYPE, id1)
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(DOUBLE_TYPE, "DOUBLE_TYPE")
                        );

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:390:72: ( test )?
                        if ( stream_test.hasNext() ) {
                            adaptor.addChild(root_1, stream_test.nextTree());

                        }
                        stream_test.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:392:8: id1= STRING ( PERCENT string_argument )?
                    {
                    id1=(Token)match(input,STRING,FOLLOW_STRING_in_atom3765);  
                    stream_STRING.add(id1);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:392:19: ( PERCENT string_argument )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==PERCENT) ) {
                        int LA82_1 = input.LA(2);

                        if ( (LA82_1==LPAREN) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:392:20: PERCENT string_argument
                            {
                            PERCENT264=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_atom3768);  
                            stream_PERCENT.add(PERCENT264);


                            pushFollow(FOLLOW_string_argument_in_atom3770);
                            string_argument265=string_argument();

                            state._fsp--;

                            stream_string_argument.add(string_argument265.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id1, string_argument
                    // token labels: id1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 392:47: -> ^( VALUETYPE[$id1] STRING_TYPE $id1 ( string_argument )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:392:50: ^( VALUETYPE[$id1] STRING_TYPE $id1 ( string_argument )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VALUETYPE, id1)
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(STRING_TYPE, "STRING_TYPE")
                        );

                        adaptor.addChild(root_1, stream_id1.nextNode());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:392:85: ( string_argument )?
                        if ( stream_string_argument.hasNext() ) {
                            adaptor.addChild(root_1, stream_string_argument.nextTree());

                        }
                        stream_string_argument.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class string_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:395:1: string_argument : ( LPAREN !) ( arglist ) ( RPAREN !) ;
    public final PythonProvenanceParser.string_argument_return string_argument() throws RecognitionException {
        PythonProvenanceParser.string_argument_return retval = new PythonProvenanceParser.string_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN266=null;
        Token RPAREN268=null;
        PythonProvenanceParser.arglist_return arglist267 =null;


        Object LPAREN266_tree=null;
        Object RPAREN268_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:3: ( ( LPAREN !) ( arglist ) ( RPAREN !) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:5: ( LPAREN !) ( arglist ) ( RPAREN !)
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:5: ( LPAREN !)
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:6: LPAREN !
            {
            LPAREN266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_string_argument3805); 

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:15: ( arglist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:16: arglist
            {
            pushFollow(FOLLOW_arglist_in_string_argument3810);
            arglist267=arglist();

            state._fsp--;

            adaptor.addChild(root_0, arglist267.getTree());

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:25: ( RPAREN !)
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:396:26: RPAREN !
            {
            RPAREN268=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_string_argument3814); 

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_argument"


    public static class listmaker_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listmaker"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:399:1: listmaker : ( list_arguments ( list_for )? RBRACK -> ^( LISTCOMPREHENSION_CMD list_arguments ( list_for )? ) | RBRACK !);
    public final PythonProvenanceParser.listmaker_return listmaker() throws RecognitionException {
        PythonProvenanceParser.listmaker_return retval = new PythonProvenanceParser.listmaker_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RBRACK271=null;
        Token RBRACK272=null;
        PythonProvenanceParser.list_arguments_return list_arguments269 =null;

        PythonProvenanceParser.list_for_return list_for270 =null;


        Object RBRACK271_tree=null;
        Object RBRACK272_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleSubtreeStream stream_list_for=new RewriteRuleSubtreeStream(adaptor,"rule list_for");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:399:11: ( list_arguments ( list_for )? RBRACK -> ^( LISTCOMPREHENSION_CMD list_arguments ( list_for )? ) | RBRACK !)
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==BACKQUOTE||LA85_0==DOTTED_NAME||LA85_0==FLOAT||LA85_0==INT||(LA85_0 >= LBRACK && LA85_0 <= LCURLY)||LA85_0==LONGINT||(LA85_0 >= LPAREN && LA85_0 <= MINUS)||LA85_0==NAME||LA85_0==NOT||LA85_0==PLUS||LA85_0==STRING||LA85_0==TILDE) ) {
                alt85=1;
            }
            else if ( (LA85_0==RBRACK) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }
            switch (alt85) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:399:14: list_arguments ( list_for )? RBRACK
                    {
                    pushFollow(FOLLOW_list_arguments_in_listmaker3830);
                    list_arguments269=list_arguments();

                    state._fsp--;

                    stream_list_arguments.add(list_arguments269.getTree());

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:399:29: ( list_for )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==138) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:399:29: list_for
                            {
                            pushFollow(FOLLOW_list_for_in_listmaker3832);
                            list_for270=list_for();

                            state._fsp--;

                            stream_list_for.add(list_for270.getTree());

                            }
                            break;

                    }


                    RBRACK271=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_listmaker3835);  
                    stream_RBRACK.add(RBRACK271);


                    // AST REWRITE
                    // elements: list_for, list_arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 399:46: -> ^( LISTCOMPREHENSION_CMD list_arguments ( list_for )? )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:399:49: ^( LISTCOMPREHENSION_CMD list_arguments ( list_for )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LISTCOMPREHENSION_CMD, "LISTCOMPREHENSION_CMD")
                        , root_1);

                        adaptor.addChild(root_1, stream_list_arguments.nextTree());

                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:399:88: ( list_for )?
                        if ( stream_list_for.hasNext() ) {
                            adaptor.addChild(root_1, stream_list_for.nextTree());

                        }
                        stream_list_for.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:400:6: RBRACK !
                    {
                    root_0 = (Object)adaptor.nil();


                    RBRACK272=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_listmaker3853); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listmaker"


    public static class list_arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_arguments"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:403:1: list_arguments : list_argument ( COMMA list_argument )* -> ^( LIST_ARGS ( list_argument )+ ) ;
    public final PythonProvenanceParser.list_arguments_return list_arguments() throws RecognitionException {
        PythonProvenanceParser.list_arguments_return retval = new PythonProvenanceParser.list_arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA274=null;
        PythonProvenanceParser.list_argument_return list_argument273 =null;

        PythonProvenanceParser.list_argument_return list_argument275 =null;


        Object COMMA274_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_list_argument=new RewriteRuleSubtreeStream(adaptor,"rule list_argument");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:403:15: ( list_argument ( COMMA list_argument )* -> ^( LIST_ARGS ( list_argument )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:403:17: list_argument ( COMMA list_argument )*
            {
            pushFollow(FOLLOW_list_argument_in_list_arguments3870);
            list_argument273=list_argument();

            state._fsp--;

            stream_list_argument.add(list_argument273.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:403:31: ( COMMA list_argument )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:403:32: COMMA list_argument
            	    {
            	    COMMA274=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_arguments3873);  
            	    stream_COMMA.add(COMMA274);


            	    pushFollow(FOLLOW_list_argument_in_list_arguments3875);
            	    list_argument275=list_argument();

            	    state._fsp--;

            	    stream_list_argument.add(list_argument275.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            // AST REWRITE
            // elements: list_argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 403:54: -> ^( LIST_ARGS ( list_argument )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:403:57: ^( LIST_ARGS ( list_argument )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST_ARGS, "LIST_ARGS")
                , root_1);

                if ( !(stream_list_argument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_list_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_list_argument.nextTree());

                }
                stream_list_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_arguments"


    public static class list_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:406:1: list_argument : testlist ;
    public final PythonProvenanceParser.list_argument_return list_argument() throws RecognitionException {
        PythonProvenanceParser.list_argument_return retval = new PythonProvenanceParser.list_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.testlist_return testlist276 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:407:2: ( testlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:407:4: testlist
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_testlist_in_list_argument3900);
            testlist276=testlist();

            state._fsp--;

            adaptor.addChild(root_0, testlist276.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_argument"


    public static class dictmaker_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dictmaker"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:410:1: dictmaker : ( dict_arguments RCURLY -> ^( DICTIONARY_CMD dict_arguments ) | RCURLY !);
    public final PythonProvenanceParser.dictmaker_return dictmaker() throws RecognitionException {
        PythonProvenanceParser.dictmaker_return retval = new PythonProvenanceParser.dictmaker_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RCURLY278=null;
        Token RCURLY279=null;
        PythonProvenanceParser.dict_arguments_return dict_arguments277 =null;


        Object RCURLY278_tree=null;
        Object RCURLY279_tree=null;
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_dict_arguments=new RewriteRuleSubtreeStream(adaptor,"rule dict_arguments");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:410:11: ( dict_arguments RCURLY -> ^( DICTIONARY_CMD dict_arguments ) | RCURLY !)
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==BACKQUOTE||LA87_0==DOTTED_NAME||LA87_0==FLOAT||LA87_0==INT||(LA87_0 >= LBRACK && LA87_0 <= LCURLY)||LA87_0==LONGINT||(LA87_0 >= LPAREN && LA87_0 <= MINUS)||LA87_0==NAME||LA87_0==NOT||LA87_0==PLUS||LA87_0==STRING||LA87_0==TILDE) ) {
                alt87=1;
            }
            else if ( (LA87_0==RCURLY) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:410:13: dict_arguments RCURLY
                    {
                    pushFollow(FOLLOW_dict_arguments_in_dictmaker3911);
                    dict_arguments277=dict_arguments();

                    state._fsp--;

                    stream_dict_arguments.add(dict_arguments277.getTree());

                    RCURLY278=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_dictmaker3914);  
                    stream_RCURLY.add(RCURLY278);


                    // AST REWRITE
                    // elements: dict_arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 410:36: -> ^( DICTIONARY_CMD dict_arguments )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:410:39: ^( DICTIONARY_CMD dict_arguments )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DICTIONARY_CMD, "DICTIONARY_CMD")
                        , root_1);

                        adaptor.addChild(root_1, stream_dict_arguments.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:411:5: RCURLY !
                    {
                    root_0 = (Object)adaptor.nil();


                    RCURLY279=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_dictmaker3928); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dictmaker"


    public static class dict_arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dict_arguments"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:1: dict_arguments : dict_argument COLON dict_argument ( options {k=2; } : COMMA dict_argument COLON dict_argument )* ( COMMA )? -> ^( DICT_ARGS ( dict_argument )+ ) ;
    public final PythonProvenanceParser.dict_arguments_return dict_arguments() throws RecognitionException {
        PythonProvenanceParser.dict_arguments_return retval = new PythonProvenanceParser.dict_arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON281=null;
        Token COMMA283=null;
        Token COLON285=null;
        Token COMMA287=null;
        PythonProvenanceParser.dict_argument_return dict_argument280 =null;

        PythonProvenanceParser.dict_argument_return dict_argument282 =null;

        PythonProvenanceParser.dict_argument_return dict_argument284 =null;

        PythonProvenanceParser.dict_argument_return dict_argument286 =null;


        Object COLON281_tree=null;
        Object COMMA283_tree=null;
        Object COLON285_tree=null;
        Object COMMA287_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_dict_argument=new RewriteRuleSubtreeStream(adaptor,"rule dict_argument");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:15: ( dict_argument COLON dict_argument ( options {k=2; } : COMMA dict_argument COLON dict_argument )* ( COMMA )? -> ^( DICT_ARGS ( dict_argument )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:17: dict_argument COLON dict_argument ( options {k=2; } : COMMA dict_argument COLON dict_argument )* ( COMMA )?
            {
            pushFollow(FOLLOW_dict_argument_in_dict_arguments3957);
            dict_argument280=dict_argument();

            state._fsp--;

            stream_dict_argument.add(dict_argument280.getTree());

            COLON281=(Token)match(input,COLON,FOLLOW_COLON_in_dict_arguments3959);  
            stream_COLON.add(COLON281);


            pushFollow(FOLLOW_dict_argument_in_dict_arguments3961);
            dict_argument282=dict_argument();

            state._fsp--;

            stream_dict_argument.add(dict_argument282.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:51: ( options {k=2; } : COMMA dict_argument COLON dict_argument )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    int LA88_1 = input.LA(2);

                    if ( (LA88_1==BACKQUOTE||LA88_1==DOTTED_NAME||LA88_1==FLOAT||LA88_1==INT||(LA88_1 >= LBRACK && LA88_1 <= LCURLY)||LA88_1==LONGINT||(LA88_1 >= LPAREN && LA88_1 <= MINUS)||LA88_1==NAME||LA88_1==NOT||LA88_1==PLUS||LA88_1==STRING||LA88_1==TILDE) ) {
                        alt88=1;
                    }


                }


                switch (alt88) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:67: COMMA dict_argument COLON dict_argument
            	    {
            	    COMMA283=(Token)match(input,COMMA,FOLLOW_COMMA_in_dict_arguments3971);  
            	    stream_COMMA.add(COMMA283);


            	    pushFollow(FOLLOW_dict_argument_in_dict_arguments3973);
            	    dict_argument284=dict_argument();

            	    state._fsp--;

            	    stream_dict_argument.add(dict_argument284.getTree());

            	    COLON285=(Token)match(input,COLON,FOLLOW_COLON_in_dict_arguments3975);  
            	    stream_COLON.add(COLON285);


            	    pushFollow(FOLLOW_dict_argument_in_dict_arguments3977);
            	    dict_argument286=dict_argument();

            	    state._fsp--;

            	    stream_dict_argument.add(dict_argument286.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:109: ( COMMA )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==COMMA) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:110: COMMA
                    {
                    COMMA287=(Token)match(input,COMMA,FOLLOW_COMMA_in_dict_arguments3982);  
                    stream_COMMA.add(COMMA287);


                    }
                    break;

            }


            // AST REWRITE
            // elements: dict_argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 414:118: -> ^( DICT_ARGS ( dict_argument )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:414:121: ^( DICT_ARGS ( dict_argument )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DICT_ARGS, "DICT_ARGS")
                , root_1);

                if ( !(stream_dict_argument.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_dict_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_dict_argument.nextTree());

                }
                stream_dict_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dict_arguments"


    public static class dict_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dict_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:417:1: dict_argument : testlist ;
    public final PythonProvenanceParser.dict_argument_return dict_argument() throws RecognitionException {
        PythonProvenanceParser.dict_argument_return retval = new PythonProvenanceParser.dict_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.testlist_return testlist288 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:418:2: ( testlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:418:4: testlist
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_testlist_in_dict_argument4023);
            testlist288=testlist();

            state._fsp--;

            adaptor.addChild(root_0, testlist288.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dict_argument"


    public static class testlist_gexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "testlist_gexp"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:421:1: testlist_gexp : test ( PERCENT )? ( ( options {k=2; } : COMMA ! test )* ( COMMA !)? | gen_for ) ;
    public final PythonProvenanceParser.testlist_gexp_return testlist_gexp() throws RecognitionException {
        PythonProvenanceParser.testlist_gexp_return retval = new PythonProvenanceParser.testlist_gexp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERCENT290=null;
        Token COMMA291=null;
        Token COMMA293=null;
        PythonProvenanceParser.test_return test289 =null;

        PythonProvenanceParser.test_return test292 =null;

        PythonProvenanceParser.gen_for_return gen_for294 =null;


        Object PERCENT290_tree=null;
        Object COMMA291_tree=null;
        Object COMMA293_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:5: ( test ( PERCENT )? ( ( options {k=2; } : COMMA ! test )* ( COMMA !)? | gen_for ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:7: test ( PERCENT )? ( ( options {k=2; } : COMMA ! test )* ( COMMA !)? | gen_for )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_test_in_testlist_gexp4037);
            test289=test();

            state._fsp--;

            adaptor.addChild(root_0, test289.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:12: ( PERCENT )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==PERCENT) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:13: PERCENT
                    {
                    PERCENT290=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_testlist_gexp4040); 
                    PERCENT290_tree = 
                    (Object)adaptor.create(PERCENT290)
                    ;
                    adaptor.addChild(root_0, PERCENT290_tree);


                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:23: ( ( options {k=2; } : COMMA ! test )* ( COMMA !)? | gen_for )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==COMMA||LA93_0==RPAREN) ) {
                alt93=1;
            }
            else if ( (LA93_0==138) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }
            switch (alt93) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:25: ( options {k=2; } : COMMA ! test )* ( COMMA !)?
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:25: ( options {k=2; } : COMMA ! test )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==COMMA) ) {
                            int LA91_1 = input.LA(2);

                            if ( (LA91_1==BACKQUOTE||LA91_1==DOTTED_NAME||LA91_1==FLOAT||LA91_1==INT||(LA91_1 >= LBRACK && LA91_1 <= LCURLY)||LA91_1==LONGINT||(LA91_1 >= LPAREN && LA91_1 <= MINUS)||LA91_1==NAME||LA91_1==NOT||LA91_1==PLUS||LA91_1==STRING||LA91_1==TILDE) ) {
                                alt91=1;
                            }


                        }


                        switch (alt91) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:42: COMMA ! test
                    	    {
                    	    COMMA291=(Token)match(input,COMMA,FOLLOW_COMMA_in_testlist_gexp4055); 

                    	    pushFollow(FOLLOW_test_in_testlist_gexp4058);
                    	    test292=test();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, test292.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:56: ( COMMA !)?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==COMMA) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:422:57: COMMA !
                            {
                            COMMA293=(Token)match(input,COMMA,FOLLOW_COMMA_in_testlist_gexp4063); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:423:14: gen_for
                    {
                    pushFollow(FOLLOW_gen_for_in_testlist_gexp4082);
                    gen_for294=gen_for();

                    state._fsp--;

                    adaptor.addChild(root_0, gen_for294.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "testlist_gexp"


    public static class trailer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "trailer"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:439:1: trailer : ( LPAREN ! inner_trailer | inner_subscript );
    public final PythonProvenanceParser.trailer_return trailer() throws RecognitionException {
        PythonProvenanceParser.trailer_return retval = new PythonProvenanceParser.trailer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN295=null;
        PythonProvenanceParser.inner_trailer_return inner_trailer296 =null;

        PythonProvenanceParser.inner_subscript_return inner_subscript297 =null;


        Object LPAREN295_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:439:9: ( LPAREN ! inner_trailer | inner_subscript )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==LPAREN) ) {
                alt94=1;
            }
            else if ( (LA94_0==LBRACK) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }
            switch (alt94) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:439:11: LPAREN ! inner_trailer
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN295=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_trailer4122); 

                    pushFollow(FOLLOW_inner_trailer_in_trailer4125);
                    inner_trailer296=inner_trailer();

                    state._fsp--;

                    adaptor.addChild(root_0, inner_trailer296.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:440:4: inner_subscript
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_inner_subscript_in_trailer4130);
                    inner_subscript297=inner_subscript();

                    state._fsp--;

                    adaptor.addChild(root_0, inner_subscript297.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "trailer"


    public static class inner_trailer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inner_trailer"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:444:1: inner_trailer : ( arglist RPAREN -> ^( TRAILER arglist ) | RPAREN -> ^( TRAILER NO_ARGS ) );
    public final PythonProvenanceParser.inner_trailer_return inner_trailer() throws RecognitionException {
        PythonProvenanceParser.inner_trailer_return retval = new PythonProvenanceParser.inner_trailer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RPAREN299=null;
        Token RPAREN300=null;
        PythonProvenanceParser.arglist_return arglist298 =null;


        Object RPAREN299_tree=null;
        Object RPAREN300_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:445:2: ( arglist RPAREN -> ^( TRAILER arglist ) | RPAREN -> ^( TRAILER NO_ARGS ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==BACKQUOTE||LA95_0==DOTTED_NAME||LA95_0==DOUBLESTAR||LA95_0==FLOAT||LA95_0==INT||(LA95_0 >= LBRACK && LA95_0 <= LCURLY)||LA95_0==LONGINT||(LA95_0 >= LPAREN && LA95_0 <= MINUS)||LA95_0==NAME||LA95_0==NOT||LA95_0==PLUS||LA95_0==STAR||LA95_0==STRING||LA95_0==TILDE) ) {
                alt95=1;
            }
            else if ( (LA95_0==RPAREN) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }
            switch (alt95) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:445:4: arglist RPAREN
                    {
                    pushFollow(FOLLOW_arglist_in_inner_trailer4144);
                    arglist298=arglist();

                    state._fsp--;

                    stream_arglist.add(arglist298.getTree());

                    RPAREN299=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_inner_trailer4146);  
                    stream_RPAREN.add(RPAREN299);


                    // AST REWRITE
                    // elements: arglist
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 445:19: -> ^( TRAILER arglist )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:445:22: ^( TRAILER arglist )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRAILER, "TRAILER")
                        , root_1);

                        adaptor.addChild(root_1, stream_arglist.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:446:4: RPAREN
                    {
                    RPAREN300=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_inner_trailer4160);  
                    stream_RPAREN.add(RPAREN300);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 446:11: -> ^( TRAILER NO_ARGS )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:446:14: ^( TRAILER NO_ARGS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRAILER, "TRAILER")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(NO_ARGS, "NO_ARGS")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inner_trailer"


    public static class inner_subscript_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inner_subscript"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:455:1: inner_subscript : ( subscriptlist_outer )+ -> ^( SUBSCRIPTLISTS ( subscriptlist_outer )+ ) ;
    public final PythonProvenanceParser.inner_subscript_return inner_subscript() throws RecognitionException {
        PythonProvenanceParser.inner_subscript_return retval = new PythonProvenanceParser.inner_subscript_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.subscriptlist_outer_return subscriptlist_outer301 =null;


        RewriteRuleSubtreeStream stream_subscriptlist_outer=new RewriteRuleSubtreeStream(adaptor,"rule subscriptlist_outer");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:456:2: ( ( subscriptlist_outer )+ -> ^( SUBSCRIPTLISTS ( subscriptlist_outer )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:456:4: ( subscriptlist_outer )+
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:456:4: ( subscriptlist_outer )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==LBRACK) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:456:5: subscriptlist_outer
            	    {
            	    pushFollow(FOLLOW_subscriptlist_outer_in_inner_subscript4191);
            	    subscriptlist_outer301=subscriptlist_outer();

            	    state._fsp--;

            	    stream_subscriptlist_outer.add(subscriptlist_outer301.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);


            // AST REWRITE
            // elements: subscriptlist_outer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 456:27: -> ^( SUBSCRIPTLISTS ( subscriptlist_outer )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:456:30: ^( SUBSCRIPTLISTS ( subscriptlist_outer )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUBSCRIPTLISTS, "SUBSCRIPTLISTS")
                , root_1);

                if ( !(stream_subscriptlist_outer.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_subscriptlist_outer.hasNext() ) {
                    adaptor.addChild(root_1, stream_subscriptlist_outer.nextTree());

                }
                stream_subscriptlist_outer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inner_subscript"


    public static class subscriptlist_outer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subscriptlist_outer"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:459:1: subscriptlist_outer : LBRACK subscriptlist RBRACK -> ^( SUBSCRIPTLIST subscriptlist ) ;
    public final PythonProvenanceParser.subscriptlist_outer_return subscriptlist_outer() throws RecognitionException {
        PythonProvenanceParser.subscriptlist_outer_return retval = new PythonProvenanceParser.subscriptlist_outer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACK302=null;
        Token RBRACK304=null;
        PythonProvenanceParser.subscriptlist_return subscriptlist303 =null;


        Object LBRACK302_tree=null;
        Object RBRACK304_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_subscriptlist=new RewriteRuleSubtreeStream(adaptor,"rule subscriptlist");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:460:2: ( LBRACK subscriptlist RBRACK -> ^( SUBSCRIPTLIST subscriptlist ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:460:4: LBRACK subscriptlist RBRACK
            {
            LBRACK302=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_subscriptlist_outer4214);  
            stream_LBRACK.add(LBRACK302);


            pushFollow(FOLLOW_subscriptlist_in_subscriptlist_outer4216);
            subscriptlist303=subscriptlist();

            state._fsp--;

            stream_subscriptlist.add(subscriptlist303.getTree());

            RBRACK304=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_subscriptlist_outer4218);  
            stream_RBRACK.add(RBRACK304);


            // AST REWRITE
            // elements: subscriptlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 460:32: -> ^( SUBSCRIPTLIST subscriptlist )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:460:35: ^( SUBSCRIPTLIST subscriptlist )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUBSCRIPTLIST, "SUBSCRIPTLIST")
                , root_1);

                adaptor.addChild(root_1, stream_subscriptlist.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subscriptlist_outer"


    public static class subscriptlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subscriptlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:1: subscriptlist : subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )? -> ^( SUBSCRIPTS ( subscript )+ ) ;
    public final PythonProvenanceParser.subscriptlist_return subscriptlist() throws RecognitionException {
        PythonProvenanceParser.subscriptlist_return retval = new PythonProvenanceParser.subscriptlist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA306=null;
        Token COMMA308=null;
        PythonProvenanceParser.subscript_return subscript305 =null;

        PythonProvenanceParser.subscript_return subscript307 =null;


        Object COMMA306_tree=null;
        Object COMMA308_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_subscript=new RewriteRuleSubtreeStream(adaptor,"rule subscript");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:15: ( subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )? -> ^( SUBSCRIPTS ( subscript )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:17: subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )?
            {
            pushFollow(FOLLOW_subscript_in_subscriptlist4237);
            subscript305=subscript();

            state._fsp--;

            stream_subscript.add(subscript305.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:27: ( options {greedy=true; } : COMMA subscript )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==COMMA) ) {
                    int LA97_1 = input.LA(2);

                    if ( (LA97_1==BACKQUOTE||LA97_1==DOTTED_NAME||LA97_1==FLOAT||LA97_1==INT||(LA97_1 >= LBRACK && LA97_1 <= LCURLY)||LA97_1==LONGINT||(LA97_1 >= LPAREN && LA97_1 <= MINUS)||LA97_1==NAME||LA97_1==NOT||LA97_1==PLUS||LA97_1==STRING||LA97_1==TILDE) ) {
                        alt97=1;
                    }


                }


                switch (alt97) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:51: COMMA subscript
            	    {
            	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_subscriptlist4247);  
            	    stream_COMMA.add(COMMA306);


            	    pushFollow(FOLLOW_subscript_in_subscriptlist4249);
            	    subscript307=subscript();

            	    state._fsp--;

            	    stream_subscript.add(subscript307.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:69: ( COMMA )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==COMMA) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:70: COMMA
                    {
                    COMMA308=(Token)match(input,COMMA,FOLLOW_COMMA_in_subscriptlist4254);  
                    stream_COMMA.add(COMMA308);


                    }
                    break;

            }


            // AST REWRITE
            // elements: subscript
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 463:78: -> ^( SUBSCRIPTS ( subscript )+ )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:463:81: ^( SUBSCRIPTS ( subscript )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUBSCRIPTS, "SUBSCRIPTS")
                , root_1);

                if ( !(stream_subscript.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_subscript.hasNext() ) {
                    adaptor.addChild(root_1, stream_subscript.nextTree());

                }
                stream_subscript.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subscriptlist"


    public static class subscript_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subscript"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:466:1: subscript : test ;
    public final PythonProvenanceParser.subscript_return subscript() throws RecognitionException {
        PythonProvenanceParser.subscript_return retval = new PythonProvenanceParser.subscript_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.test_return test309 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:466:11: ( test )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:467:11: test
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_test_in_subscript4313);
            test309=test();

            state._fsp--;

            adaptor.addChild(root_0, test309.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subscript"


    public static class exprlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:470:1: exprlist : expr ( options {k=2; } : COMMA ! expr )* ( COMMA !)? ;
    public final PythonProvenanceParser.exprlist_return exprlist() throws RecognitionException {
        PythonProvenanceParser.exprlist_return retval = new PythonProvenanceParser.exprlist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA311=null;
        Token COMMA313=null;
        PythonProvenanceParser.expr_return expr310 =null;

        PythonProvenanceParser.expr_return expr312 =null;


        Object COMMA311_tree=null;
        Object COMMA313_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:470:10: ( expr ( options {k=2; } : COMMA ! expr )* ( COMMA !)? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:470:12: expr ( options {k=2; } : COMMA ! expr )* ( COMMA !)?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprlist4332);
            expr310=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr310.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:470:17: ( options {k=2; } : COMMA ! expr )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==COMMA) ) {
                    int LA99_1 = input.LA(2);

                    if ( (LA99_1==BACKQUOTE||LA99_1==DOTTED_NAME||LA99_1==FLOAT||LA99_1==INT||(LA99_1 >= LBRACK && LA99_1 <= LCURLY)||LA99_1==LONGINT||(LA99_1 >= LPAREN && LA99_1 <= MINUS)||LA99_1==NAME||LA99_1==PLUS||LA99_1==STRING||LA99_1==TILDE) ) {
                        alt99=1;
                    }


                }


                switch (alt99) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:470:34: COMMA ! expr
            	    {
            	    COMMA311=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist4343); 

            	    pushFollow(FOLLOW_expr_in_exprlist4346);
            	    expr312=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr312.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:470:48: ( COMMA !)?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==COMMA) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:470:49: COMMA !
                    {
                    COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist4351); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprlist"


    public static class testlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "testlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:473:1: testlist : test ;
    public final PythonProvenanceParser.testlist_return testlist() throws RecognitionException {
        PythonProvenanceParser.testlist_return retval = new PythonProvenanceParser.testlist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.test_return test314 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:474:5: ( test )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:474:7: test
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_test_in_testlist4376);
            test314=test();

            state._fsp--;

            adaptor.addChild(root_0, test314.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "testlist"


    public static class classdef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classdef"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:1: classdef : ref= 'class' id1= NAME ( LPAREN ( testlist )? RPAREN )? COLON suite -> ^( CLASS_CMD[$ref] $id1 suite ( testlist )? ) ;
    public final PythonProvenanceParser.classdef_return classdef() throws RecognitionException {
        PythonProvenanceParser.classdef_return retval = new PythonProvenanceParser.classdef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ref=null;
        Token id1=null;
        Token LPAREN315=null;
        Token RPAREN317=null;
        Token COLON318=null;
        PythonProvenanceParser.testlist_return testlist316 =null;

        PythonProvenanceParser.suite_return suite319 =null;


        Object ref_tree=null;
        Object id1_tree=null;
        Object LPAREN315_tree=null;
        Object RPAREN317_tree=null;
        Object COLON318_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        RewriteRuleSubtreeStream stream_testlist=new RewriteRuleSubtreeStream(adaptor,"rule testlist");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:9: (ref= 'class' id1= NAME ( LPAREN ( testlist )? RPAREN )? COLON suite -> ^( CLASS_CMD[$ref] $id1 suite ( testlist )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:11: ref= 'class' id1= NAME ( LPAREN ( testlist )? RPAREN )? COLON suite
            {
            ref=(Token)match(input,129,FOLLOW_129_in_classdef4391);  
            stream_129.add(ref);


            id1=(Token)match(input,NAME,FOLLOW_NAME_in_classdef4395);  
            stream_NAME.add(id1);


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:32: ( LPAREN ( testlist )? RPAREN )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LPAREN) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:33: LPAREN ( testlist )? RPAREN
                    {
                    LPAREN315=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_classdef4398);  
                    stream_LPAREN.add(LPAREN315);


                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:40: ( testlist )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==BACKQUOTE||LA101_0==DOTTED_NAME||LA101_0==FLOAT||LA101_0==INT||(LA101_0 >= LBRACK && LA101_0 <= LCURLY)||LA101_0==LONGINT||(LA101_0 >= LPAREN && LA101_0 <= MINUS)||LA101_0==NAME||LA101_0==NOT||LA101_0==PLUS||LA101_0==STRING||LA101_0==TILDE) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:40: testlist
                            {
                            pushFollow(FOLLOW_testlist_in_classdef4400);
                            testlist316=testlist();

                            state._fsp--;

                            stream_testlist.add(testlist316.getTree());

                            }
                            break;

                    }


                    RPAREN317=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_classdef4403);  
                    stream_RPAREN.add(RPAREN317);


                    }
                    break;

            }


            COLON318=(Token)match(input,COLON,FOLLOW_COLON_in_classdef4407);  
            stream_COLON.add(COLON318);


            pushFollow(FOLLOW_suite_in_classdef4409);
            suite319=suite();

            state._fsp--;

            stream_suite.add(suite319.getTree());

            // AST REWRITE
            // elements: suite, testlist, id1
            // token labels: id1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 477:71: -> ^( CLASS_CMD[$ref] $id1 suite ( testlist )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:74: ^( CLASS_CMD[$ref] $id1 suite ( testlist )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASS_CMD, ref)
                , root_1);

                adaptor.addChild(root_1, stream_id1.nextNode());

                adaptor.addChild(root_1, stream_suite.nextTree());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:477:103: ( testlist )?
                if ( stream_testlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_testlist.nextTree());

                }
                stream_testlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classdef"


    public static class arglist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arglist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:1: arglist : ( argument ( COMMA ( argument )? )* -> ^( ARGUMENTS ( argument )+ ) | STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test );
    public final PythonProvenanceParser.arglist_return arglist() throws RecognitionException {
        PythonProvenanceParser.arglist_return retval = new PythonProvenanceParser.arglist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA321=null;
        Token STAR323=null;
        Token COMMA325=null;
        Token DOUBLESTAR326=null;
        Token DOUBLESTAR328=null;
        PythonProvenanceParser.argument_return argument320 =null;

        PythonProvenanceParser.argument_return argument322 =null;

        PythonProvenanceParser.test_return test324 =null;

        PythonProvenanceParser.test_return test327 =null;

        PythonProvenanceParser.test_return test329 =null;


        Object COMMA321_tree=null;
        Object STAR323_tree=null;
        Object COMMA325_tree=null;
        Object DOUBLESTAR326_tree=null;
        Object DOUBLESTAR328_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:9: ( argument ( COMMA ( argument )? )* -> ^( ARGUMENTS ( argument )+ ) | STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )
            int alt106=3;
            switch ( input.LA(1) ) {
            case BACKQUOTE:
            case DOTTED_NAME:
            case FLOAT:
            case INT:
            case LBRACK:
            case LCURLY:
            case LONGINT:
            case LPAREN:
            case MINUS:
            case NAME:
            case NOT:
            case PLUS:
            case STRING:
            case TILDE:
                {
                alt106=1;
                }
                break;
            case STAR:
                {
                alt106=2;
                }
                break;
            case DOUBLESTAR:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:11: argument ( COMMA ( argument )? )*
                    {
                    pushFollow(FOLLOW_argument_in_arglist4444);
                    argument320=argument();

                    state._fsp--;

                    stream_argument.add(argument320.getTree());

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:21: ( COMMA ( argument )? )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==COMMA) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:22: COMMA ( argument )?
                    	    {
                    	    COMMA321=(Token)match(input,COMMA,FOLLOW_COMMA_in_arglist4448);  
                    	    stream_COMMA.add(COMMA321);


                    	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:28: ( argument )?
                    	    int alt103=2;
                    	    int LA103_0 = input.LA(1);

                    	    if ( (LA103_0==BACKQUOTE||LA103_0==DOTTED_NAME||LA103_0==FLOAT||LA103_0==INT||(LA103_0 >= LBRACK && LA103_0 <= LCURLY)||LA103_0==LONGINT||(LA103_0 >= LPAREN && LA103_0 <= MINUS)||LA103_0==NAME||LA103_0==NOT||LA103_0==PLUS||LA103_0==STRING||LA103_0==TILDE) ) {
                    	        alt103=1;
                    	    }
                    	    switch (alt103) {
                    	        case 1 :
                    	            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:28: argument
                    	            {
                    	            pushFollow(FOLLOW_argument_in_arglist4450);
                    	            argument322=argument();

                    	            state._fsp--;

                    	            stream_argument.add(argument322.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: argument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 487:40: -> ^( ARGUMENTS ( argument )+ )
                    {
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:487:43: ^( ARGUMENTS ( argument )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARGUMENTS, "ARGUMENTS")
                        , root_1);

                        if ( !(stream_argument.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_argument.hasNext() ) {
                            adaptor.addChild(root_1, stream_argument.nextTree());

                        }
                        stream_argument.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:488:13: STAR test ( COMMA DOUBLESTAR test )?
                    {
                    root_0 = (Object)adaptor.nil();


                    STAR323=(Token)match(input,STAR,FOLLOW_STAR_in_arglist4476); 
                    STAR323_tree = 
                    (Object)adaptor.create(STAR323)
                    ;
                    adaptor.addChild(root_0, STAR323_tree);


                    pushFollow(FOLLOW_test_in_arglist4478);
                    test324=test();

                    state._fsp--;

                    adaptor.addChild(root_0, test324.getTree());

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:488:23: ( COMMA DOUBLESTAR test )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==COMMA) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:488:24: COMMA DOUBLESTAR test
                            {
                            COMMA325=(Token)match(input,COMMA,FOLLOW_COMMA_in_arglist4481); 
                            COMMA325_tree = 
                            (Object)adaptor.create(COMMA325)
                            ;
                            adaptor.addChild(root_0, COMMA325_tree);


                            DOUBLESTAR326=(Token)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist4483); 
                            DOUBLESTAR326_tree = 
                            (Object)adaptor.create(DOUBLESTAR326)
                            ;
                            adaptor.addChild(root_0, DOUBLESTAR326_tree);


                            pushFollow(FOLLOW_test_in_arglist4485);
                            test327=test();

                            state._fsp--;

                            adaptor.addChild(root_0, test327.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:489:13: DOUBLESTAR test
                    {
                    root_0 = (Object)adaptor.nil();


                    DOUBLESTAR328=(Token)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist4501); 
                    DOUBLESTAR328_tree = 
                    (Object)adaptor.create(DOUBLESTAR328)
                    ;
                    adaptor.addChild(root_0, DOUBLESTAR328_tree);


                    pushFollow(FOLLOW_test_in_arglist4503);
                    test329=test();

                    state._fsp--;

                    adaptor.addChild(root_0, test329.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arglist"


    public static class print_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:492:1: print_argument : testlist ;
    public final PythonProvenanceParser.print_argument_return print_argument() throws RecognitionException {
        PythonProvenanceParser.print_argument_return retval = new PythonProvenanceParser.print_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.testlist_return testlist330 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:493:2: ( testlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:493:4: testlist
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_testlist_in_print_argument4527);
            testlist330=testlist();

            state._fsp--;

            adaptor.addChild(root_0, testlist330.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print_argument"


    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:501:1: argument : expr_stmt ;
    public final PythonProvenanceParser.argument_return argument() throws RecognitionException {
        PythonProvenanceParser.argument_return retval = new PythonProvenanceParser.argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.expr_stmt_return expr_stmt331 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:502:10: ( expr_stmt )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:502:12: expr_stmt
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_stmt_in_argument4558);
            expr_stmt331=expr_stmt();

            state._fsp--;

            adaptor.addChild(root_0, expr_stmt331.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class list_iter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_iter"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:509:1: list_iter : ( list_for | list_if );
    public final PythonProvenanceParser.list_iter_return list_iter() throws RecognitionException {
        PythonProvenanceParser.list_iter_return retval = new PythonProvenanceParser.list_iter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.list_for_return list_for332 =null;

        PythonProvenanceParser.list_if_return list_if333 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:509:11: ( list_for | list_if )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==138) ) {
                alt107=1;
            }
            else if ( (LA107_0==IF) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }
            switch (alt107) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:509:13: list_for
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_list_for_in_list_iter4577);
                    list_for332=list_for();

                    state._fsp--;

                    adaptor.addChild(root_0, list_for332.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:510:13: list_if
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_list_if_in_list_iter4591);
                    list_if333=list_if();

                    state._fsp--;

                    adaptor.addChild(root_0, list_if333.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_iter"


    public static class list_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_for"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:513:1: list_for : 'for' exprlist 'in' testlist ( list_iter )? -> ^( LISTLOOPCONTROL_CMD exprlist testlist ( list_iter )? ) ;
    public final PythonProvenanceParser.list_for_return list_for() throws RecognitionException {
        PythonProvenanceParser.list_for_return retval = new PythonProvenanceParser.list_for_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal334=null;
        Token string_literal336=null;
        PythonProvenanceParser.exprlist_return exprlist335 =null;

        PythonProvenanceParser.testlist_return testlist337 =null;

        PythonProvenanceParser.list_iter_return list_iter338 =null;


        Object string_literal334_tree=null;
        Object string_literal336_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleSubtreeStream stream_list_iter=new RewriteRuleSubtreeStream(adaptor,"rule list_iter");
        RewriteRuleSubtreeStream stream_exprlist=new RewriteRuleSubtreeStream(adaptor,"rule exprlist");
        RewriteRuleSubtreeStream stream_testlist=new RewriteRuleSubtreeStream(adaptor,"rule testlist");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:513:10: ( 'for' exprlist 'in' testlist ( list_iter )? -> ^( LISTLOOPCONTROL_CMD exprlist testlist ( list_iter )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:513:12: 'for' exprlist 'in' testlist ( list_iter )?
            {
            string_literal334=(Token)match(input,138,FOLLOW_138_in_list_for4610);  
            stream_138.add(string_literal334);


            pushFollow(FOLLOW_exprlist_in_list_for4612);
            exprlist335=exprlist();

            state._fsp--;

            stream_exprlist.add(exprlist335.getTree());

            string_literal336=(Token)match(input,IN,FOLLOW_IN_in_list_for4614);  
            stream_IN.add(string_literal336);


            pushFollow(FOLLOW_testlist_in_list_for4616);
            testlist337=testlist();

            state._fsp--;

            stream_testlist.add(testlist337.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:513:41: ( list_iter )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==IF||LA108_0==138) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:513:42: list_iter
                    {
                    pushFollow(FOLLOW_list_iter_in_list_for4619);
                    list_iter338=list_iter();

                    state._fsp--;

                    stream_list_iter.add(list_iter338.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: exprlist, testlist, list_iter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 513:54: -> ^( LISTLOOPCONTROL_CMD exprlist testlist ( list_iter )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:513:57: ^( LISTLOOPCONTROL_CMD exprlist testlist ( list_iter )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LISTLOOPCONTROL_CMD, "LISTLOOPCONTROL_CMD")
                , root_1);

                adaptor.addChild(root_1, stream_exprlist.nextTree());

                adaptor.addChild(root_1, stream_testlist.nextTree());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:513:97: ( list_iter )?
                if ( stream_list_iter.hasNext() ) {
                    adaptor.addChild(root_1, stream_list_iter.nextTree());

                }
                stream_list_iter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_for"


    public static class list_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_if"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:516:1: list_if : 'if' test ( list_iter )? -> ^( LISTCONDITION_CMD test ( list_iter )? ) ;
    public final PythonProvenanceParser.list_if_return list_if() throws RecognitionException {
        PythonProvenanceParser.list_if_return retval = new PythonProvenanceParser.list_if_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal339=null;
        PythonProvenanceParser.test_return test340 =null;

        PythonProvenanceParser.list_iter_return list_iter341 =null;


        Object string_literal339_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_list_iter=new RewriteRuleSubtreeStream(adaptor,"rule list_iter");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:516:9: ( 'if' test ( list_iter )? -> ^( LISTCONDITION_CMD test ( list_iter )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:516:11: 'if' test ( list_iter )?
            {
            string_literal339=(Token)match(input,IF,FOLLOW_IF_in_list_if4652);  
            stream_IF.add(string_literal339);


            pushFollow(FOLLOW_test_in_list_if4654);
            test340=test();

            state._fsp--;

            stream_test.add(test340.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:516:21: ( list_iter )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==IF||LA109_0==138) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:516:22: list_iter
                    {
                    pushFollow(FOLLOW_list_iter_in_list_if4657);
                    list_iter341=list_iter();

                    state._fsp--;

                    stream_list_iter.add(list_iter341.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: list_iter, test
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 516:34: -> ^( LISTCONDITION_CMD test ( list_iter )? )
            {
                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:516:37: ^( LISTCONDITION_CMD test ( list_iter )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LISTCONDITION_CMD, "LISTCONDITION_CMD")
                , root_1);

                adaptor.addChild(root_1, stream_test.nextTree());

                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:516:62: ( list_iter )?
                if ( stream_list_iter.hasNext() ) {
                    adaptor.addChild(root_1, stream_list_iter.nextTree());

                }
                stream_list_iter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_if"


    public static class gen_iter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gen_iter"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:519:1: gen_iter : ( gen_for | gen_if );
    public final PythonProvenanceParser.gen_iter_return gen_iter() throws RecognitionException {
        PythonProvenanceParser.gen_iter_return retval = new PythonProvenanceParser.gen_iter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PythonProvenanceParser.gen_for_return gen_for342 =null;

        PythonProvenanceParser.gen_if_return gen_if343 =null;



        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:519:9: ( gen_for | gen_if )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==138) ) {
                alt110=1;
            }
            else if ( (LA110_0==IF) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }
            switch (alt110) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:519:11: gen_for
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_gen_for_in_gen_iter4686);
                    gen_for342=gen_for();

                    state._fsp--;

                    adaptor.addChild(root_0, gen_for342.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:520:11: gen_if
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_gen_if_in_gen_iter4698);
                    gen_if343=gen_if();

                    state._fsp--;

                    adaptor.addChild(root_0, gen_if343.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gen_iter"


    public static class gen_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gen_for"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:523:1: gen_for : 'for' exprlist 'in' or_test ( gen_iter )? ;
    public final PythonProvenanceParser.gen_for_return gen_for() throws RecognitionException {
        PythonProvenanceParser.gen_for_return retval = new PythonProvenanceParser.gen_for_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal344=null;
        Token string_literal346=null;
        PythonProvenanceParser.exprlist_return exprlist345 =null;

        PythonProvenanceParser.or_test_return or_test347 =null;

        PythonProvenanceParser.gen_iter_return gen_iter348 =null;


        Object string_literal344_tree=null;
        Object string_literal346_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:523:8: ( 'for' exprlist 'in' or_test ( gen_iter )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:523:10: 'for' exprlist 'in' or_test ( gen_iter )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal344=(Token)match(input,138,FOLLOW_138_in_gen_for4714); 
            string_literal344_tree = 
            (Object)adaptor.create(string_literal344)
            ;
            adaptor.addChild(root_0, string_literal344_tree);


            pushFollow(FOLLOW_exprlist_in_gen_for4716);
            exprlist345=exprlist();

            state._fsp--;

            adaptor.addChild(root_0, exprlist345.getTree());

            string_literal346=(Token)match(input,IN,FOLLOW_IN_in_gen_for4718); 
            string_literal346_tree = 
            (Object)adaptor.create(string_literal346)
            ;
            adaptor.addChild(root_0, string_literal346_tree);


            pushFollow(FOLLOW_or_test_in_gen_for4720);
            or_test347=or_test();

            state._fsp--;

            adaptor.addChild(root_0, or_test347.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:523:38: ( gen_iter )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==IF||LA111_0==138) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:523:38: gen_iter
                    {
                    pushFollow(FOLLOW_gen_iter_in_gen_for4722);
                    gen_iter348=gen_iter();

                    state._fsp--;

                    adaptor.addChild(root_0, gen_iter348.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gen_for"


    public static class gen_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gen_if"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:526:1: gen_if : 'if' test ( gen_iter )? ;
    public final PythonProvenanceParser.gen_if_return gen_if() throws RecognitionException {
        PythonProvenanceParser.gen_if_return retval = new PythonProvenanceParser.gen_if_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal349=null;
        PythonProvenanceParser.test_return test350 =null;

        PythonProvenanceParser.gen_iter_return gen_iter351 =null;


        Object string_literal349_tree=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:526:7: ( 'if' test ( gen_iter )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:526:9: 'if' test ( gen_iter )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal349=(Token)match(input,IF,FOLLOW_IF_in_gen_if4738); 
            string_literal349_tree = 
            (Object)adaptor.create(string_literal349)
            ;
            adaptor.addChild(root_0, string_literal349_tree);


            pushFollow(FOLLOW_test_in_gen_if4740);
            test350=test();

            state._fsp--;

            adaptor.addChild(root_0, test350.getTree());

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:526:19: ( gen_iter )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==IF||LA112_0==138) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenance.g:526:19: gen_iter
                    {
                    pushFollow(FOLLOW_gen_iter_in_gen_if4742);
                    gen_iter351=gen_iter();

                    state._fsp--;

                    adaptor.addChild(root_0, gen_iter351.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gen_if"

    // Delegated rules


 

    public static final BitSet FOLLOW_NEWLINE_in_single_input425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_single_input443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_single_input460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_single_input462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_file_input486 = new BitSet(new long[]{0x6201100020003002L,0x800042000A01DA00L,0x00000000000FFD1FL});
    public static final BitSet FOLLOW_stmt_in_file_input491 = new BitSet(new long[]{0x6201100020003002L,0x800042000A01DA00L,0x00000000000FFD1FL});
    public static final BitSet FOLLOW_NEWLINE_in_eval_input516 = new BitSet(new long[]{0x6200100020002000L,0x000042000201DA00L});
    public static final BitSet FOLLOW_testlist_in_eval_input521 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_eval_input524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_decorator_in_decorators546 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_AT_in_decorator565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_dotted_attr_in_decorator567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_LPAREN_in_decorator570 = new BitSet(new long[]{0x6200100120002000L,0x0000428802015A00L});
    public static final BitSet FOLLOW_arglist_in_decorator572 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_decorator575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_decorator579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dotted_attr601 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_DOT_in_dotted_attr604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_dotted_attr606 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_decorators_in_funcdef622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_funcdef627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_funcdef631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_parameters_in_funcdef633 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_funcdef635 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_funcdef637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameters669 = new BitSet(new long[]{0x6200100120002000L,0x0000428802015A00L});
    public static final BitSet FOLLOW_varargslist_in_parameters673 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_parameters677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defparameter_in_varargslist699 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist709 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_defparameter_in_varargslist711 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist730 = new BitSet(new long[]{0x0000000100000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_STAR_in_varargslist752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_varargslist754 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist757 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_varargslist761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_varargslist787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_varargslist850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_varargslist852 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_varargslist855 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_varargslist859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_varargslist880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_defparameter902 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ASSIGN_in_defparameter905 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_defparameter907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_stmt933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_stmt_inside_block965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt_inside_block976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_small_stmt_in_simple_stmt993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_simple_stmt996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_stmt_in_small_stmt1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_small_stmt1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_del_stmt_in_small_stmt1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pass_stmt_in_small_stmt1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_stmt_in_small_stmt1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_small_stmt1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_stmt_in_small_stmt1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exec_stmt_in_small_stmt1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assert_stmt_in_small_stmt1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1155 = new BitSet(new long[]{0x0000000280008442L,0x0100014405002002L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_stmt1166 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_PLUSEQUAL_in_expr_stmt1175 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_MINUSEQUAL_in_expr_stmt1184 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_STAREQUAL_in_expr_stmt1193 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_SLASHEQUAL_in_expr_stmt1202 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_PERCENTEQUAL_in_expr_stmt1211 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_AMPEREQUAL_in_expr_stmt1220 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_VBAREQUAL_in_expr_stmt1229 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_CIRCUMFLEXEQUAL_in_expr_stmt1238 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_LEFTSHIFTEQUAL_in_expr_stmt1247 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_RIGHTSHIFTEQUAL_in_expr_stmt1256 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_DOUBLESTAREQUAL_in_expr_stmt1265 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_DOUBLESLASHEQUAL_in_expr_stmt1274 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt1306 = new BitSet(new long[]{0x6200100020002002L,0x0000420202015A00L});
    public static final BitSet FOLLOW_printlist_in_print_stmt1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHTSHIFT_in_print_stmt1313 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_printlist_in_print_stmt1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_argument_in_printlist1354 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_printlist1365 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_print_argument_in_printlist1367 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_printlist1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_del_stmt1397 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_exprlist_in_del_stmt1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_pass_stmt1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_flow_stmt1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_stmt_in_flow_stmt1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_flow_stmt1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_stmt_in_flow_stmt1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_break_stmt1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_continue_stmt1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_return_stmt1548 = new BitSet(new long[]{0x6200100120002002L,0x0000428002015A00L});
    public static final BitSet FOLLOW_arglist_in_return_stmt1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_raise_stmt1583 = new BitSet(new long[]{0x6200100020002002L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_raise_stmt1586 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_raise_stmt1589 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_raise_stmt1591 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_raise_stmt1594 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_raise_stmt1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_name_in_import_stmt1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_from_in_import_stmt1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_import_name1660 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_dotted_as_names_in_import_name1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_from_name_in_import_from1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_from_dotted_name_in_import_from1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_import_from_name1711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_import_from_name1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_import_from_name1717 = new BitSet(new long[]{0x0000000020000000L,0x0000008000004800L});
    public static final BitSet FOLLOW_STAR_in_import_from_name1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_as_names_in_import_from_name1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_import_from_name1794 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_import_as_names_in_import_from_name1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_import_from_name1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_import_from_dotted_name1858 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_import_from_dotted_name1862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_import_from_dotted_name1864 = new BitSet(new long[]{0x0000000020000000L,0x0000008000004800L});
    public static final BitSet FOLLOW_STAR_in_import_from_dotted_name1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_as_names_in_import_from_dotted_name1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_import_from_dotted_name1941 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_import_as_names_in_import_from_dotted_name1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_import_from_dotted_name1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_as_name_in_import_as_names1993 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_import_as_names1996 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_import_as_name_in_import_as_names1998 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_import_as_names2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_import_as_name2042 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AS_in_import_as_name2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_import_as_name2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_import_as_name2073 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AS_in_import_as_name2076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_import_as_name2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dotted_as_name2110 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AS_in_dotted_as_name2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_dotted_as_name2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_dotted_as_name2142 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AS_in_dotted_as_name2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_dotted_as_name2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotted_as_name_in_dotted_as_names2177 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_dotted_as_names2180 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_dotted_as_name_in_dotted_as_names2182 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_140_in_global_stmt2218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_global_stmt2220 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_global_stmt2223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_global_stmt2225 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_136_in_exec_stmt2248 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_expr_in_exec_stmt2250 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_IN_in_exec_stmt2253 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_exec_stmt2255 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_exec_stmt2258 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_exec_stmt2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_assert_stmt2283 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_assert_stmt2285 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_assert_stmt2288 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_assert_stmt2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_compound_stmt2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_compound_stmt2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_compound_stmt2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_stmt_in_compound_stmt2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_stmt_in_compound_stmt2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcdef_in_compound_stmt2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classdef_in_compound_stmt2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_clause_in_if_stmt2444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_elif_clauses_in_if_stmt2447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_else_clause_in_if_stmt2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_clause2482 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_if_clause2484 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_if_clause2486 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_if_clause2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elif_clause_in_elif_clauses2512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_elif_clause2537 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_elif_clause2539 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_elif_clause2541 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_elif_clause2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_else_clause2568 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_else_clause2570 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_else_clause2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_clause_in_while_stmt2591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_else_clause_in_while_stmt2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_while_clause2628 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_while_clause2630 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_while_clause2632 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_while_clause2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_for_stmt2680 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_exprlist_in_for_stmt2682 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IN_in_for_stmt2684 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_testlist_in_for_stmt2686 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_for_stmt2688 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_for_stmt2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_clause_in_try_stmt2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_except_clause_in_try_stmt2723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_finally_clause_in_try_stmt2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_try_clause2755 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_try_clause2757 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_try_clause2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_except_clause2782 = new BitSet(new long[]{0x2000000000040000L,0x0000000000000800L});
    public static final BitSet FOLLOW_trailer_in_except_clause2784 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_except_clause2787 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_except_clause2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_finally_clause2815 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_finally_clause2817 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_finally_clause2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_with_stmt2840 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_with_clause_in_with_stmt2845 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_with_stmt2847 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_with_stmt2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_item_in_with_clause2892 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_with_clause2895 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_with_item_in_with_clause2897 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_test_in_with_item2922 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_with_item2926 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_with_item2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_suite2955 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INDENT_in_suite2957 = new BitSet(new long[]{0x6201100020003000L,0x800042000A015A00L,0x00000000000FFD1FL});
    public static final BitSet FOLLOW_stmt_inside_block_in_suite2960 = new BitSet(new long[]{0x6201100020803000L,0x800042000A015A00L,0x00000000000FFD1FL});
    public static final BitSet FOLLOW_DEDENT_in_suite2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_suite2983 = new BitSet(new long[]{0x6201100020003000L,0x800042000A015A00L,0x00000000000FFD1FL});
    public static final BitSet FOLLOW_stmt_inside_block_in_suite2986 = new BitSet(new long[]{0x6201100020803000L,0x800042000A015A00L,0x00000000000FFD1FL});
    public static final BitSet FOLLOW_DEDENT_in_suite2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_test_in_test3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_test_in_or_test3027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_OR_in_or_test3030 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_and_test_in_or_test3033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_not_test_in_and_test3052 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_and_test3055 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_not_test_in_and_test3058 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NOT_in_not_test3087 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_not_test_in_not_test3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_in_not_test3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_comparison3112 = new BitSet(new long[]{0x1840C04000000012L,0x000000000006000CL});
    public static final BitSet FOLLOW_LESS_in_comparison3117 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_GREATER_in_comparison3120 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_EQUAL_in_comparison3123 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_comparison3126 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_LESSEQUAL_in_comparison3129 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_ALT_NOTEQUAL_in_comparison3132 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_NOTEQUAL_in_comparison3135 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_IN_in_comparison3138 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_NOTIN_in_comparison3141 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_IS_in_comparison3144 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_ISNOT_in_comparison3147 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_expr_in_comparison3151 = new BitSet(new long[]{0x1840C04000000012L,0x000000000006000CL});
    public static final BitSet FOLLOW_xor_expr_in_expr3172 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_VBAR_in_expr3175 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_xor_expr_in_expr3178 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_and_expr_in_xor_expr3194 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_CIRCUMFLEX_in_xor_expr3197 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_and_expr_in_xor_expr3200 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_shift_expr_in_and_expr3220 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMPER_in_and_expr3223 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_shift_expr_in_and_expr3226 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_arith_expr_in_shift_expr3246 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000001L});
    public static final BitSet FOLLOW_LEFTSHIFT_in_shift_expr3250 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_RIGHTSHIFT_in_shift_expr3253 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_arith_expr_in_shift_expr3257 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000001L});
    public static final BitSet FOLLOW_term_in_arith_expr3278 = new BitSet(new long[]{0x0000000000000002L,0x0000000002001000L});
    public static final BitSet FOLLOW_PLUS_in_arith_expr3282 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_MINUS_in_arith_expr3285 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_term_in_arith_expr3289 = new BitSet(new long[]{0x0000000000000002L,0x0000000002001000L});
    public static final BitSet FOLLOW_factor_in_term3310 = new BitSet(new long[]{0x0000000140000002L,0x000000A000000000L});
    public static final BitSet FOLLOW_STAR_in_term3314 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_SLASH_in_term3319 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_DOUBLESLASH_in_term3324 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_term3329 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_factor_in_term3334 = new BitSet(new long[]{0x0000000140000002L,0x000000A000000000L});
    public static final BitSet FOLLOW_PLUS_in_factor3353 = new BitSet(new long[]{0x6200100020002000L,0x0000020000004A00L});
    public static final BitSet FOLLOW_power_in_factor3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor3376 = new BitSet(new long[]{0x6200100020002000L,0x0000020000004A00L});
    public static final BitSet FOLLOW_power_in_factor3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor3398 = new BitSet(new long[]{0x6200100020002000L,0x0000020000004A00L});
    public static final BitSet FOLLOW_power_in_factor3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_power_in_factor3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_power3434 = new BitSet(new long[]{0x2000000010000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_trailer_in_power3437 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_DOT_in_power3442 = new BitSet(new long[]{0x6200100020002000L,0x0000020000004A00L});
    public static final BitSet FOLLOW_power_in_power3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom3473 = new BitSet(new long[]{0x6200100020002000L,0x0000420802015A00L});
    public static final BitSet FOLLOW_testlist_gexp_in_atom3492 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_atom3532 = new BitSet(new long[]{0x6200100020002000L,0x0000420042015A00L});
    public static final BitSet FOLLOW_listmaker_in_atom3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_atom3558 = new BitSet(new long[]{0x6200100020002000L,0x0000420082015A00L});
    public static final BitSet FOLLOW_dictmaker_in_atom3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKQUOTE_in_atom3581 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_testlist_in_atom3584 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BACKQUOTE_in_atom3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_atom3598 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3601 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_atom3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_atom3629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3632 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_atom3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom3660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3663 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_atom3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGINT_in_atom3693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3696 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_atom3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom3726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3729 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_atom3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_PERCENT_in_atom3768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_string_argument_in_atom3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_string_argument3805 = new BitSet(new long[]{0x6200100120002000L,0x0000428002015A00L});
    public static final BitSet FOLLOW_arglist_in_string_argument3810 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_string_argument3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_arguments_in_listmaker3830 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_list_for_in_listmaker3832 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RBRACK_in_listmaker3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACK_in_listmaker3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_argument_in_list_arguments3870 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_list_arguments3873 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_list_argument_in_list_arguments3875 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_testlist_in_list_argument3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dict_arguments_in_dictmaker3911 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RCURLY_in_dictmaker3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RCURLY_in_dictmaker3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dict_argument_in_dict_arguments3957 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_dict_arguments3959 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_dict_argument_in_dict_arguments3961 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_dict_arguments3971 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_dict_argument_in_dict_arguments3973 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_dict_arguments3975 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_dict_argument_in_dict_arguments3977 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_dict_arguments3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testlist_in_dict_argument4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_testlist_gexp4037 = new BitSet(new long[]{0x0000000000080002L,0x0000000000800000L,0x0000000000000400L});
    public static final BitSet FOLLOW_PERCENT_in_testlist_gexp4040 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_testlist_gexp4055 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_testlist_gexp4058 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_testlist_gexp4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gen_for_in_testlist_gexp4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_trailer4122 = new BitSet(new long[]{0x6200100120002000L,0x0000428802015A00L});
    public static final BitSet FOLLOW_inner_trailer_in_trailer4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_subscript_in_trailer4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arglist_in_inner_trailer4144 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_inner_trailer4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_inner_trailer4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscriptlist_outer_in_inner_subscript4191 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_subscriptlist_outer4214 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_subscriptlist_in_subscriptlist_outer4216 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_RBRACK_in_subscriptlist_outer4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscript_in_subscriptlist4237 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_subscriptlist4247 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_subscript_in_subscriptlist4249 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_subscriptlist4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_subscript4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist4332 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_exprlist4343 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_expr_in_exprlist4346 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_exprlist4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_testlist4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_classdef4391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_classdef4395 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_classdef4398 = new BitSet(new long[]{0x6200100020002000L,0x0000420802015A00L});
    public static final BitSet FOLLOW_testlist_in_classdef4400 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_classdef4403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_classdef4407 = new BitSet(new long[]{0x0080000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_suite_in_classdef4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arglist4444 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_arglist4448 = new BitSet(new long[]{0x6200100020082002L,0x0000420002015A00L});
    public static final BitSet FOLLOW_argument_in_arglist4450 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_STAR_in_arglist4476 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_arglist4478 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_arglist4481 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_arglist4483 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_arglist4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_arglist4501 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_arglist4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testlist_in_print_argument4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_stmt_in_argument4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_for_in_list_iter4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_if_in_list_iter4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_list_for4610 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_exprlist_in_list_for4612 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IN_in_list_for4614 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_testlist_in_list_for4616 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_list_iter_in_list_for4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_list_if4652 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_list_if4654 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_list_iter_in_list_if4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gen_for_in_gen_iter4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gen_if_in_gen_iter4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_gen_for4714 = new BitSet(new long[]{0x6200100020002000L,0x0000420002005A00L});
    public static final BitSet FOLLOW_exprlist_in_gen_for4716 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IN_in_gen_for4718 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_or_test_in_gen_for4720 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_gen_iter_in_gen_for4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_gen_if4738 = new BitSet(new long[]{0x6200100020002000L,0x0000420002015A00L});
    public static final BitSet FOLLOW_test_in_gen_if4740 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_gen_iter_in_gen_if4742 = new BitSet(new long[]{0x0000000000000002L});

}