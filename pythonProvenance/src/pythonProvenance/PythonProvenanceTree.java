// $ANTLR 3.4 D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g 2012-11-19 16:43:22

  package pythonProvenance;
  import pythonProvenance.commands.*;
  import java.util.*;
  import org.antlr.runtime.BitSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PythonProvenanceTree extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public PythonProvenanceTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public PythonProvenanceTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return PythonProvenanceTree.tokenNames; }
    public String getGrammarFileName() { return "D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g"; }


    	// for commands
    	private ArrayList<Command> commandList = new ArrayList<Command>();
    	public List<Command> getCommandList(){
    		return commandList;
    	}
    	
    	private ArrayList<ImportEquivalent> importPairsList = new ArrayList<ImportEquivalent>();
    	public List<ImportEquivalent> getImportPairsList(){
    		return importPairsList;
    	}
    	
    	private ArrayList<WithEquivalent> withPairsList = new ArrayList<WithEquivalent>();
    	public List<WithEquivalent> getWithPairsList(){
    		return withPairsList;
    	}
    	
    	private ArrayList<Command> classList = new ArrayList<Command>();
    	public List<Command> getClassList(){
    		return classList;
    	}
    	
    	public VariableCommand a;
    	public DatatypeCommand b;
    	public String str;
    	public ImportEquivalent c;
    	public ElifClauseCommand d;
    	public WithEquivalent w;
    	public int line;




    // $ANTLR start "single_input"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:48:1: single_input : ( simple_stmt | compound_stmt );
    public final void single_input() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:48:14: ( simple_stmt | compound_stmt )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0 >= ALT_NOTEQUAL && LA1_0 <= AND)||LA1_0==ASSIGN||(LA1_0 >= CIRCUMFLEX && LA1_0 <= CIRCUMFLEXEQUAL)||(LA1_0 >= DOUBLESLASH && LA1_0 <= DOUBLESTAREQUAL)||LA1_0==EQUAL||LA1_0==EXPRESSION||(LA1_0 >= GREATER && LA1_0 <= GREATEREQUAL)||LA1_0==IMPORT_CMD||LA1_0==IN||(LA1_0 >= IS && LA1_0 <= ISNOT)||(LA1_0 >= LEFTSHIFT && LA1_0 <= LESSEQUAL)||(LA1_0 >= MINUS && LA1_0 <= MINUSEQUAL)||(LA1_0 >= NOT && LA1_0 <= NOTIN)||LA1_0==OR||(LA1_0 >= PERCENTEQUAL && LA1_0 <= PLUSEQUAL)||LA1_0==PRINT_CMD||(LA1_0 >= RETURN_CMD && LA1_0 <= RIGHTSHIFTEQUAL)||(LA1_0 >= SLASH && LA1_0 <= STAREQUAL)||LA1_0==UNARY_EXPRESSION||(LA1_0 >= VBAR && LA1_0 <= VBAREQUAL)) ) {
                alt1=1;
            }
            else if ( (LA1_0==CLASS_CMD||LA1_0==FORLOOP_CMD||LA1_0==IFBLOCK||LA1_0==OUTER_FUNCTION_CMD||LA1_0==TRYBLOCK||LA1_0==WHILEBLOCK||LA1_0==WITH_CMD) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:48:17: simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_single_input48);
                    simple_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:49:17: compound_stmt
                    {
                    pushFollow(FOLLOW_compound_stmt_in_single_input66);
                    compound_stmt();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "single_input"



    // $ANTLR start "file_input"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:52:1: file_input : ( stmt )* ;
    public final void file_input() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:52:12: ( ( stmt )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:52:14: ( stmt )*
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:52:14: ( stmt )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= ALT_NOTEQUAL && LA2_0 <= AND)||LA2_0==ASSIGN||(LA2_0 >= CIRCUMFLEX && LA2_0 <= CIRCUMFLEXEQUAL)||LA2_0==CLASS_CMD||(LA2_0 >= DOUBLESLASH && LA2_0 <= DOUBLESTAREQUAL)||LA2_0==EQUAL||LA2_0==EXPRESSION||(LA2_0 >= FORLOOP_CMD && LA2_0 <= GREATEREQUAL)||LA2_0==IFBLOCK||LA2_0==IMPORT_CMD||LA2_0==IN||(LA2_0 >= IS && LA2_0 <= ISNOT)||(LA2_0 >= LEFTSHIFT && LA2_0 <= LESSEQUAL)||(LA2_0 >= MINUS && LA2_0 <= MINUSEQUAL)||(LA2_0 >= NOT && LA2_0 <= NOTIN)||LA2_0==OR||LA2_0==OUTER_FUNCTION_CMD||(LA2_0 >= PERCENTEQUAL && LA2_0 <= PLUSEQUAL)||LA2_0==PRINT_CMD||(LA2_0 >= RETURN_CMD && LA2_0 <= RIGHTSHIFTEQUAL)||(LA2_0 >= SLASH && LA2_0 <= STAREQUAL)||LA2_0==TRYBLOCK||LA2_0==UNARY_EXPRESSION||(LA2_0 >= VBAR && LA2_0 <= WHILEBLOCK)||LA2_0==WITH_CMD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:52:15: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_file_input90);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "file_input"



    // $ANTLR start "eval_input"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:55:1: eval_input : testlist ;
    public final void eval_input() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:55:11: ( testlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:56:8: testlist
            {
            pushFollow(FOLLOW_testlist_in_eval_input118);
            testlist();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "eval_input"



    // $ANTLR start "decorators"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:59:1: decorators : ( decorator )+ ;
    public final void decorators() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:59:11: ( ( decorator )+ )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:59:13: ( decorator )+
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:59:13: ( decorator )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:59:13: decorator
            	    {
            	    pushFollow(FOLLOW_decorator_in_decorators140);
            	    decorator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "decorators"



    // $ANTLR start "decorator"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:62:1: decorator : AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE ;
    public final void decorator() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:62:10: ( AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:62:12: AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE
            {
            match(input,AT,FOLLOW_AT_in_decorator159); 

            pushFollow(FOLLOW_dotted_attr_in_decorator161);
            dotted_attr();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:62:27: ( LPAREN ( arglist )? RPAREN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LPAREN) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:62:28: LPAREN ( arglist )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_decorator164); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:62:35: ( arglist )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ARGUMENTS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:62:35: arglist
                            {
                            pushFollow(FOLLOW_arglist_in_decorator166);
                            arglist();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_decorator169); 

                    }
                    break;

            }


            match(input,NEWLINE,FOLLOW_NEWLINE_in_decorator173); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "decorator"



    // $ANTLR start "dotted_attr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:65:1: dotted_attr : NAME ( DOT NAME )* ;
    public final void dotted_attr() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:66:5: ( NAME ( DOT NAME )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:66:7: NAME ( DOT NAME )*
            {
            match(input,NAME,FOLLOW_NAME_in_dotted_attr195); 

            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:66:12: ( DOT NAME )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DOT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:66:13: DOT NAME
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_dotted_attr198); 

            	    match(input,NAME,FOLLOW_NAME_in_dotted_attr200); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dotted_attr"



    // $ANTLR start "funcdef"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:69:1: funcdef returns [Command result] : ^( OUTER_FUNCTION_CMD id1= NAME id2= parameters id3= suite ) ;
    public final Command funcdef() throws RecognitionException {
        Command result = null;


        CommonTree id1=null;
        Command id2 =null;

        List id3 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:70:2: ( ^( OUTER_FUNCTION_CMD id1= NAME id2= parameters id3= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:70:4: ^( OUTER_FUNCTION_CMD id1= NAME id2= parameters id3= suite )
            {
            match(input,OUTER_FUNCTION_CMD,FOLLOW_OUTER_FUNCTION_CMD_in_funcdef221); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,NAME,FOLLOW_NAME_in_funcdef225); 

            pushFollow(FOLLOW_parameters_in_funcdef229);
            id2=parameters();

            state._fsp--;


            pushFollow(FOLLOW_suite_in_funcdef233);
            id3=suite();

            state._fsp--;


            match(input, Token.UP, null); 



            		if(id2!=null){
            			result = new FunctionDefinitionCommand((id1!=null?id1.getText():null), id2, id3, line);	
            			
            			int start = ((FunctionDefinitionCommand)(result)).findStartLine();
                    		((FunctionDefinitionCommand)(result)).setStartLine(start);
            			
            			System.out.println("***FunctionDefinition -> " + (id1!=null?id1.getText():null) + " Parameters: "+id2 + " Suite: "+id3 +" Start: " + ((FunctionDefinitionCommand)(result)).getStartLine() + " End: " + ((FunctionDefinitionCommand)(result)).getEndLine() + " " + result );
                			commandList.add(result);
                		}
                		else{
                			result = new FunctionDefinitionCommand((id1!=null?id1.getText():null), id3, line);	
                			
                			int start = ((FunctionDefinitionCommand)(result)).findStartLine();
                    		((FunctionDefinitionCommand)(result)).setStartLine(start);
                			
            			System.out.println("***FunctionDefinition -> " + (id1!=null?id1.getText():null) + " Suite: "+id3 +" Start: " + ((FunctionDefinitionCommand)(result)).getStartLine() + " End: " + ((FunctionDefinitionCommand)(result)).getEndLine() + " " + result );
                			commandList.add(result);
                		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "funcdef"



    // $ANTLR start "parameters"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:92:1: parameters returns [Command result] : (cmd= varargslist )? ;
    public final Command parameters() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:93:2: ( (cmd= varargslist )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:93:4: (cmd= varargslist )?
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:93:4: (cmd= varargslist )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==OUTER_FUNCTION_ARGS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:93:5: cmd= varargslist
                    {
                    pushFollow(FOLLOW_varargslist_in_parameters261);
                    cmd=varargslist();

                    state._fsp--;


                    }
                    break;

            }



            		if(cmd!=null){
            			result = new ArgumentsCommand(cmd, line);
                    	 	System.out.println("Arguments:"+cmd+" "+" Line: " + line + " " +result);
                    	 	commandList.add(result);
                    	 }
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "parameters"


    protected static class varargslist_scope {
        List current;
    }
    protected Stack varargslist_stack = new Stack();



    // $ANTLR start "varargslist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:102:1: varargslist returns [List result] : ^( OUTER_FUNCTION_ARGS ( defparameter )+ ) ;
    public final List varargslist() throws RecognitionException {
        varargslist_stack.push(new varargslist_scope());
        List result = null;


        ((varargslist_scope)varargslist_stack.peek()).current = new ArrayList<Command>();
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:105:2: ( ^( OUTER_FUNCTION_ARGS ( defparameter )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:105:4: ^( OUTER_FUNCTION_ARGS ( defparameter )+ )
            {
            match(input,OUTER_FUNCTION_ARGS,FOLLOW_OUTER_FUNCTION_ARGS_in_varargslist295); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:105:26: ( defparameter )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= ALT_NOTEQUAL && LA8_0 <= AMPER)||LA8_0==AND||LA8_0==CIRCUMFLEX||LA8_0==DOUBLESLASH||LA8_0==DOUBLESTAR||LA8_0==EQUAL||LA8_0==EXPRESSION||(LA8_0 >= GREATER && LA8_0 <= GREATEREQUAL)||LA8_0==IN||(LA8_0 >= IS && LA8_0 <= ISNOT)||LA8_0==LEFTSHIFT||(LA8_0 >= LESS && LA8_0 <= LESSEQUAL)||LA8_0==MINUS||(LA8_0 >= NOT && LA8_0 <= NOTIN)||LA8_0==OR||LA8_0==PLUS||LA8_0==RIGHTSHIFT||LA8_0==SLASH||LA8_0==STAR||LA8_0==UNARY_EXPRESSION||LA8_0==VBAR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:105:26: defparameter
            	    {
            	    pushFollow(FOLLOW_defparameter_in_varargslist297);
            	    defparameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input, Token.UP, null); 



            		result = ((varargslist_scope)varargslist_stack.peek()).current;
            		System.out.println("List:"+result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            varargslist_stack.pop();
        }
        return result;
    }
    // $ANTLR end "varargslist"



    // $ANTLR start "defparameter"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:111:1: defparameter : id1= test ( ASSIGN test )? ;
    public final void defparameter() throws RecognitionException {
        Command id1 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:112:2: (id1= test ( ASSIGN test )? )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:112:4: id1= test ( ASSIGN test )?
            {
            pushFollow(FOLLOW_test_in_defparameter321);
            id1=test();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:112:13: ( ASSIGN test )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ASSIGN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:112:14: ASSIGN test
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_defparameter324); 

                    pushFollow(FOLLOW_test_in_defparameter326);
                    test();

                    state._fsp--;


                    }
                    break;

            }



            		((varargslist_scope)varargslist_stack.peek()).current.add(id1);
            		System.out.println("Current List:"+((varargslist_scope)varargslist_stack.peek()).current);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "defparameter"



    // $ANTLR start "stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:118:1: stmt : ( simple_stmt | compound_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:118:7: ( simple_stmt | compound_stmt )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0 >= ALT_NOTEQUAL && LA10_0 <= AND)||LA10_0==ASSIGN||(LA10_0 >= CIRCUMFLEX && LA10_0 <= CIRCUMFLEXEQUAL)||(LA10_0 >= DOUBLESLASH && LA10_0 <= DOUBLESTAREQUAL)||LA10_0==EQUAL||LA10_0==EXPRESSION||(LA10_0 >= GREATER && LA10_0 <= GREATEREQUAL)||LA10_0==IMPORT_CMD||LA10_0==IN||(LA10_0 >= IS && LA10_0 <= ISNOT)||(LA10_0 >= LEFTSHIFT && LA10_0 <= LESSEQUAL)||(LA10_0 >= MINUS && LA10_0 <= MINUSEQUAL)||(LA10_0 >= NOT && LA10_0 <= NOTIN)||LA10_0==OR||(LA10_0 >= PERCENTEQUAL && LA10_0 <= PLUSEQUAL)||LA10_0==PRINT_CMD||(LA10_0 >= RETURN_CMD && LA10_0 <= RIGHTSHIFTEQUAL)||(LA10_0 >= SLASH && LA10_0 <= STAREQUAL)||LA10_0==UNARY_EXPRESSION||(LA10_0 >= VBAR && LA10_0 <= VBAREQUAL)) ) {
                alt10=1;
            }
            else if ( (LA10_0==CLASS_CMD||LA10_0==FORLOOP_CMD||LA10_0==IFBLOCK||LA10_0==OUTER_FUNCTION_CMD||LA10_0==TRYBLOCK||LA10_0==WHILEBLOCK||LA10_0==WITH_CMD) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:118:10: simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_stmt348);
                    simple_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:119:4: compound_stmt
                    {
                    pushFollow(FOLLOW_compound_stmt_in_stmt353);
                    compound_stmt();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "simple_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:122:1: simple_stmt returns [Command result] : cmd= small_stmt ;
    public final Command simple_stmt() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:123:2: (cmd= small_stmt )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:123:4: cmd= small_stmt
            {
            pushFollow(FOLLOW_small_stmt_in_simple_stmt378);
            cmd=small_stmt();

            state._fsp--;



            		//result = new Statements(cmd);
            		result = cmd;
            		//System.out.println("***Statements: " + cmd + " " + result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "simple_stmt"



    // $ANTLR start "small_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:130:1: small_stmt returns [Command result] : (cmd= expr_stmt |cmd= print_stmt |cmd= import_stmt |cmd= flow_stmt );
    public final Command small_stmt() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:131:2: (cmd= expr_stmt |cmd= print_stmt |cmd= import_stmt |cmd= flow_stmt )
            int alt11=4;
            switch ( input.LA(1) ) {
            case ALT_NOTEQUAL:
            case AMPER:
            case AMPEREQUAL:
            case AND:
            case ASSIGN:
            case CIRCUMFLEX:
            case CIRCUMFLEXEQUAL:
            case DOUBLESLASH:
            case DOUBLESLASHEQUAL:
            case DOUBLESTAR:
            case DOUBLESTAREQUAL:
            case EQUAL:
            case EXPRESSION:
            case GREATER:
            case GREATEREQUAL:
            case IN:
            case IS:
            case ISNOT:
            case LEFTSHIFT:
            case LEFTSHIFTEQUAL:
            case LESS:
            case LESSEQUAL:
            case MINUS:
            case MINUSEQUAL:
            case NOT:
            case NOTEQUAL:
            case NOTIN:
            case OR:
            case PERCENTEQUAL:
            case PLUS:
            case PLUSEQUAL:
            case RIGHTSHIFT:
            case RIGHTSHIFTEQUAL:
            case SLASH:
            case SLASHEQUAL:
            case STAR:
            case STAREQUAL:
            case UNARY_EXPRESSION:
            case VBAR:
            case VBAREQUAL:
                {
                alt11=1;
                }
                break;
            case PRINT_CMD:
                {
                alt11=2;
                }
                break;
            case IMPORT_CMD:
                {
                alt11=3;
                }
                break;
            case RETURN_CMD:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:131:4: cmd= expr_stmt
                    {
                    pushFollow(FOLLOW_expr_stmt_in_small_stmt405);
                    cmd=expr_stmt();

                    state._fsp--;



                    	   result = cmd; 
                    	   

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:134:9: cmd= print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_small_stmt419);
                    cmd=print_stmt();

                    state._fsp--;



                         		result = cmd;
                         		

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:137:9: cmd= import_stmt
                    {
                    pushFollow(FOLLOW_import_stmt_in_small_stmt433);
                    cmd=import_stmt();

                    state._fsp--;



                         		result = cmd;
                         		

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:140:9: cmd= flow_stmt
                    {
                    pushFollow(FOLLOW_flow_stmt_in_small_stmt446);
                    cmd=flow_stmt();

                    state._fsp--;



                         		result = cmd;
                         		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "small_stmt"



    // $ANTLR start "print_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:145:1: print_stmt returns [Command result] : ^( PRINT_CMD cmd= printlist ) ;
    public final Command print_stmt() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:146:2: ( ^( PRINT_CMD cmd= printlist ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:146:4: ^( PRINT_CMD cmd= printlist )
            {
            match(input,PRINT_CMD,FOLLOW_PRINT_CMD_in_print_stmt472); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_printlist_in_print_stmt476);
            cmd=printlist();

            state._fsp--;


            match(input, Token.UP, null); 



            		result = new PrintCommand(cmd, line);
            		System.out.println("***PrintCommand -> Arguments: " + cmd +" Line: " + line + " " + result);
            		commandList.add(result);
            		Iterator<Command> cit = cmd.iterator();
            		while(cit.hasNext()){
            			commandList.remove(cit.next());
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "print_stmt"


    protected static class printlist_scope {
        List current;
    }
    protected Stack printlist_stack = new Stack();



    // $ANTLR start "printlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:157:1: printlist returns [List result] : ^( PRINT_ARGS ( print_argument )+ ) ;
    public final List printlist() throws RecognitionException {
        printlist_stack.push(new printlist_scope());
        List result = null;


        ((printlist_scope)printlist_stack.peek()).current = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:160:2: ( ^( PRINT_ARGS ( print_argument )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:160:5: ^( PRINT_ARGS ( print_argument )+ )
            {
            match(input,PRINT_ARGS,FOLLOW_PRINT_ARGS_in_printlist518); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:160:18: ( print_argument )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= ALT_NOTEQUAL && LA12_0 <= AMPER)||LA12_0==AND||LA12_0==CIRCUMFLEX||LA12_0==DOUBLESLASH||LA12_0==DOUBLESTAR||LA12_0==EQUAL||LA12_0==EXPRESSION||(LA12_0 >= GREATER && LA12_0 <= GREATEREQUAL)||LA12_0==IN||(LA12_0 >= IS && LA12_0 <= ISNOT)||LA12_0==LEFTSHIFT||(LA12_0 >= LESS && LA12_0 <= LESSEQUAL)||LA12_0==MINUS||(LA12_0 >= NOT && LA12_0 <= NOTIN)||LA12_0==OR||LA12_0==PLUS||LA12_0==RIGHTSHIFT||LA12_0==SLASH||LA12_0==STAR||LA12_0==UNARY_EXPRESSION||LA12_0==VBAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:160:18: print_argument
            	    {
            	    pushFollow(FOLLOW_print_argument_in_printlist520);
            	    print_argument();

            	    state._fsp--;


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


            match(input, Token.UP, null); 


             
            		result = ((printlist_scope)printlist_stack.peek()).current; 
            		System.out.println("List:"+result);
            		
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            printlist_stack.pop();
        }
        return result;
    }
    // $ANTLR end "printlist"



    // $ANTLR start "print_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:167:1: print_argument : cmd= testlist ;
    public final void print_argument() throws RecognitionException {
        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:167:16: (cmd= testlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:167:18: cmd= testlist
            {
            pushFollow(FOLLOW_testlist_in_print_argument537);
            cmd=testlist();

            state._fsp--;



            		((printlist_scope)printlist_stack.peek()).current.add(cmd);
            		System.out.println("Current List:"+((printlist_scope)printlist_stack.peek()).current);
            		commandList.remove(cmd);
            		if(cmd instanceof BinaryCommand){
            			commandList.remove(((BinaryCommand)cmd).getOperand1());
            			commandList.remove(((BinaryCommand)cmd).getOperand2());
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "print_argument"



    // $ANTLR start "import_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:178:1: import_stmt returns [Command result] : (cmd= import_name |cmd= import_from );
    public final Command import_stmt() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:179:2: (cmd= import_name |cmd= import_from )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IMPORT_CMD) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOWN) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==DOTTED_NAME||LA13_2==NAME) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==IMPORT_ARGS) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:179:4: cmd= import_name
                    {
                    pushFollow(FOLLOW_import_name_in_import_stmt559);
                    cmd=import_name();

                    state._fsp--;


                     result = cmd ; 

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:180:4: cmd= import_from
                    {
                    pushFollow(FOLLOW_import_from_in_import_stmt569);
                    cmd=import_from();

                    state._fsp--;


                     result = cmd ; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "import_stmt"



    // $ANTLR start "import_from"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:183:1: import_from returns [Command result] : (cmd= import_from_name |cmd= import_from_dotted_name );
    public final Command import_from() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:184:2: (cmd= import_from_name |cmd= import_from_dotted_name )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IMPORT_CMD) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==DOWN) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==NAME) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==DOTTED_NAME) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:184:4: cmd= import_from_name
                    {
                    pushFollow(FOLLOW_import_from_name_in_import_from589);
                    cmd=import_from_name();

                    state._fsp--;


                     result = cmd;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:185:4: cmd= import_from_dotted_name
                    {
                    pushFollow(FOLLOW_import_from_dotted_name_in_import_from598);
                    cmd=import_from_dotted_name();

                    state._fsp--;


                     result = cmd;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "import_from"



    // $ANTLR start "import_from_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:188:1: import_from_name returns [Command result] : ( ^( IMPORT_CMD id1= NAME cmd= import_as_names ) | ^( IMPORT_CMD id1= NAME id2= STAR ) );
    public final Command import_from_name() throws RecognitionException {
        Command result = null;


        CommonTree id1=null;
        CommonTree id2=null;
        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:189:2: ( ^( IMPORT_CMD id1= NAME cmd= import_as_names ) | ^( IMPORT_CMD id1= NAME id2= STAR ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IMPORT_CMD) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==DOWN) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==NAME) ) {
                        int LA15_3 = input.LA(4);

                        if ( (LA15_3==STAR) ) {
                            alt15=2;
                        }
                        else if ( (LA15_3==IMPORT_ARGS) ) {
                            alt15=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:189:4: ^( IMPORT_CMD id1= NAME cmd= import_as_names )
                    {
                    match(input,IMPORT_CMD,FOLLOW_IMPORT_CMD_in_import_from_name617); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,NAME,FOLLOW_NAME_in_import_from_name621); 

                    pushFollow(FOLLOW_import_as_names_in_import_from_name625);
                    cmd=import_as_names();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		result = new ImportCommand((id1!=null?id1.getText():null), cmd, line);
                    		System.out.println("***ImportCommand " + (id1!=null?id1.getText():null) + " " + cmd + " Line: "+ line + " " +result);
                    		commandList.add(result);
                    		
                    		Iterator<ImportEquivalent> it = cmd.iterator();
                    		while(it.hasNext()){
                    			ImportEquivalent temp = it.next();
                    			String str = (id1!=null?id1.getText():null) + "." + temp.getOp1();
                    			temp.setOp1(str);
                    		}
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:201:4: ^( IMPORT_CMD id1= NAME id2= STAR )
                    {
                    match(input,IMPORT_CMD,FOLLOW_IMPORT_CMD_in_import_from_name633); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,NAME,FOLLOW_NAME_in_import_from_name637); 

                    id2=(CommonTree)match(input,STAR,FOLLOW_STAR_in_import_from_name641); 

                    match(input, Token.UP, null); 



                    		c = new ImportEquivalent((id1!=null?id1.getText():null), (id1!=null?id1.getText():null), line);
                    		//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id1!=null?id1.getText():null) + " Line: "+ line + " " + c);
                    		importPairsList.add(c);
                    		
                    		String id3 = (id1!=null?id1.getText():null);
                    		result = new ImportCommand(id3, line);
                    		System.out.println("***ImportCommand " + id3 + " Line: "+ line + " " + result);
                    		commandList.add(result);
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "import_from_name"



    // $ANTLR start "import_from_dotted_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:213:1: import_from_dotted_name returns [Command result] : ( ^( IMPORT_CMD id1= DOTTED_NAME cmd= import_as_names ) | ^( IMPORT_CMD id1= DOTTED_NAME id2= STAR ) );
    public final Command import_from_dotted_name() throws RecognitionException {
        Command result = null;


        CommonTree id1=null;
        CommonTree id2=null;
        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:214:2: ( ^( IMPORT_CMD id1= DOTTED_NAME cmd= import_as_names ) | ^( IMPORT_CMD id1= DOTTED_NAME id2= STAR ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IMPORT_CMD) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==DOWN) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==DOTTED_NAME) ) {
                        int LA16_3 = input.LA(4);

                        if ( (LA16_3==STAR) ) {
                            alt16=2;
                        }
                        else if ( (LA16_3==IMPORT_ARGS) ) {
                            alt16=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:214:4: ^( IMPORT_CMD id1= DOTTED_NAME cmd= import_as_names )
                    {
                    match(input,IMPORT_CMD,FOLLOW_IMPORT_CMD_in_import_from_dotted_name660); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_import_from_dotted_name664); 

                    pushFollow(FOLLOW_import_as_names_in_import_from_dotted_name668);
                    cmd=import_as_names();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		result = new ImportCommand((id1!=null?id1.getText():null), cmd, line);
                    		System.out.println("***ImportCommand " + (id1!=null?id1.getText():null) + " " + cmd + " Line: "+ line + " " +result);
                    		commandList.add(result);
                    		
                    		Iterator<ImportEquivalent> it = cmd.iterator();
                    		while(it.hasNext()){
                    			ImportEquivalent temp = it.next();
                    			String str = (id1!=null?id1.getText():null) + "." + temp.getOp1();
                    			temp.setOp1(str);
                    		}
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:226:4: ^( IMPORT_CMD id1= DOTTED_NAME id2= STAR )
                    {
                    match(input,IMPORT_CMD,FOLLOW_IMPORT_CMD_in_import_from_dotted_name676); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_import_from_dotted_name680); 

                    id2=(CommonTree)match(input,STAR,FOLLOW_STAR_in_import_from_dotted_name684); 

                    match(input, Token.UP, null); 



                    		
                    		c = new ImportEquivalent((id1!=null?id1.getText():null), (id1!=null?id1.getText():null), line);
                    		//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id1!=null?id1.getText():null) + " Line: "+ line + " " + c);
                    		importPairsList.add(c);
                    		
                    		String id3 = (id1!=null?id1.getText():null);
                    		result = new ImportCommand(id3, line);
                    		System.out.println("***ImportCommand " + id3 + " Line: "+ line + " " + result);
                    		commandList.add(result);
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "import_from_dotted_name"


    protected static class import_as_names_scope {
        List current;
    }
    protected Stack import_as_names_stack = new Stack();



    // $ANTLR start "import_as_names"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:241:1: import_as_names returns [List result] : ^( IMPORT_ARGS ( import_as_name )+ ) ;
    public final List import_as_names() throws RecognitionException {
        import_as_names_stack.push(new import_as_names_scope());
        List result = null;


        ((import_as_names_scope)import_as_names_stack.peek()).current = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:244:2: ( ^( IMPORT_ARGS ( import_as_name )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:244:5: ^( IMPORT_ARGS ( import_as_name )+ )
            {
            match(input,IMPORT_ARGS,FOLLOW_IMPORT_ARGS_in_import_as_names717); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:244:19: ( import_as_name )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IMPORT_EQUIV) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:244:19: import_as_name
            	    {
            	    pushFollow(FOLLOW_import_as_name_in_import_as_names719);
            	    import_as_name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match(input, Token.UP, null); 


             
            		result = ((import_as_names_scope)import_as_names_stack.peek()).current; 
            		System.out.println("List:"+result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            import_as_names_stack.pop();
        }
        return result;
    }
    // $ANTLR end "import_as_names"



    // $ANTLR start "import_as_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:251:1: import_as_name : ( ^( IMPORT_EQUIV id1= DOTTED_NAME (id2= NAME )? ) | ^( IMPORT_EQUIV id1= NAME (id2= NAME )? ) );
    public final void import_as_name() throws RecognitionException {
        CommonTree id1=null;
        CommonTree id2=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:252:2: ( ^( IMPORT_EQUIV id1= DOTTED_NAME (id2= NAME )? ) | ^( IMPORT_EQUIV id1= NAME (id2= NAME )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IMPORT_EQUIV) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DOWN) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==DOTTED_NAME) ) {
                        alt20=1;
                    }
                    else if ( (LA20_2==NAME) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:252:4: ^( IMPORT_EQUIV id1= DOTTED_NAME (id2= NAME )? )
                    {
                    match(input,IMPORT_EQUIV,FOLLOW_IMPORT_EQUIV_in_import_as_name742); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_import_as_name746); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:252:38: (id2= NAME )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NAME) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:252:38: id2= NAME
                            {
                            id2=(CommonTree)match(input,NAME,FOLLOW_NAME_in_import_as_name750); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    		if((id2!=null?id2.getText():null)!=null){
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id2!=null?id2.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id2!=null?id2.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		else{
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id1!=null?id1.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id1!=null?id1.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		
                    		importPairsList.add(c);
                    		((dotted_as_names_scope)dotted_as_names_stack.peek()).current.add(c);
                    		System.out.println("Current List:"+((dotted_as_names_scope)dotted_as_names_stack.peek()).current);
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:266:4: ^( IMPORT_EQUIV id1= NAME (id2= NAME )? )
                    {
                    match(input,IMPORT_EQUIV,FOLLOW_IMPORT_EQUIV_in_import_as_name760); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,NAME,FOLLOW_NAME_in_import_as_name764); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:266:31: (id2= NAME )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NAME) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:266:31: id2= NAME
                            {
                            id2=(CommonTree)match(input,NAME,FOLLOW_NAME_in_import_as_name768); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    		if((id2!=null?id2.getText():null)!=null){
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id2!=null?id2.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id2!=null?id2.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		else{
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id1!=null?id1.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id1!=null?id1.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		importPairsList.add(c);
                    		((import_as_names_scope)import_as_names_stack.peek()).current.add(c);
                    		System.out.println("Current List:"+((import_as_names_scope)import_as_names_stack.peek()).current);
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "import_as_name"


    protected static class dotted_as_names_scope {
        List current;
    }
    protected Stack dotted_as_names_stack = new Stack();



    // $ANTLR start "dotted_as_names"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:282:1: dotted_as_names returns [List result] : ^( IMPORT_ARGS ( dotted_as_name )+ ) ;
    public final List dotted_as_names() throws RecognitionException {
        dotted_as_names_stack.push(new dotted_as_names_scope());
        List result = null;


        ((dotted_as_names_scope)dotted_as_names_stack.peek()).current = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:285:2: ( ^( IMPORT_ARGS ( dotted_as_name )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:285:5: ^( IMPORT_ARGS ( dotted_as_name )+ )
            {
            match(input,IMPORT_ARGS,FOLLOW_IMPORT_ARGS_in_dotted_as_names802); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:285:19: ( dotted_as_name )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IMPORT_EQUIV) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:285:19: dotted_as_name
            	    {
            	    pushFollow(FOLLOW_dotted_as_name_in_dotted_as_names804);
            	    dotted_as_name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            match(input, Token.UP, null); 


             
            		result = ((dotted_as_names_scope)dotted_as_names_stack.peek()).current; 
            		System.out.println("List:"+result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            dotted_as_names_stack.pop();
        }
        return result;
    }
    // $ANTLR end "dotted_as_names"



    // $ANTLR start "dotted_as_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:291:1: dotted_as_name : ( ^( IMPORT_EQUIV id1= DOTTED_NAME (id2= NAME )? ) | ^( IMPORT_EQUIV id1= NAME (id2= NAME )? ) );
    public final void dotted_as_name() throws RecognitionException {
        CommonTree id1=null;
        CommonTree id2=null;

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:292:2: ( ^( IMPORT_EQUIV id1= DOTTED_NAME (id2= NAME )? ) | ^( IMPORT_EQUIV id1= NAME (id2= NAME )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IMPORT_EQUIV) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==DOTTED_NAME) ) {
                        alt24=1;
                    }
                    else if ( (LA24_2==NAME) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:292:4: ^( IMPORT_EQUIV id1= DOTTED_NAME (id2= NAME )? )
                    {
                    match(input,IMPORT_EQUIV,FOLLOW_IMPORT_EQUIV_in_dotted_as_name822); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_dotted_as_name826); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:292:38: (id2= NAME )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NAME) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:292:38: id2= NAME
                            {
                            id2=(CommonTree)match(input,NAME,FOLLOW_NAME_in_dotted_as_name830); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    		if((id2!=null?id2.getText():null)!=null){
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id2!=null?id2.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id2!=null?id2.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		else{
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id1!=null?id1.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id1!=null?id1.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		
                    		importPairsList.add(c);
                    		((dotted_as_names_scope)dotted_as_names_stack.peek()).current.add(c);
                    		System.out.println("Current List:"+((dotted_as_names_scope)dotted_as_names_stack.peek()).current);
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:306:4: ^( IMPORT_EQUIV id1= NAME (id2= NAME )? )
                    {
                    match(input,IMPORT_EQUIV,FOLLOW_IMPORT_EQUIV_in_dotted_as_name840); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,NAME,FOLLOW_NAME_in_dotted_as_name844); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:306:31: (id2= NAME )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NAME) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:306:31: id2= NAME
                            {
                            id2=(CommonTree)match(input,NAME,FOLLOW_NAME_in_dotted_as_name848); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    		if((id2!=null?id2.getText():null)!=null){
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id2!=null?id2.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id2!=null?id2.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		else{
                    			c = new ImportEquivalent ((id1!=null?id1.getText():null), (id1!=null?id1.getText():null), line);
                    			//System.out.println("***Import Equivalency " + (id1!=null?id1.getText():null) + " as " + (id1!=null?id1.getText():null) + " Line: "+ line + " " + c);
                    		}
                    		
                    		importPairsList.add(c);
                    		((dotted_as_names_scope)dotted_as_names_stack.peek()).current.add(c);
                    		System.out.println("Current List:"+((dotted_as_names_scope)dotted_as_names_stack.peek()).current);
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dotted_as_name"



    // $ANTLR start "import_name"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:322:1: import_name returns [Command result] : ^( IMPORT_CMD cmd= dotted_as_names ) ;
    public final Command import_name() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:323:2: ( ^( IMPORT_CMD cmd= dotted_as_names ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:323:4: ^( IMPORT_CMD cmd= dotted_as_names )
            {
            match(input,IMPORT_CMD,FOLLOW_IMPORT_CMD_in_import_name869); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dotted_as_names_in_import_name873);
            cmd=dotted_as_names();

            state._fsp--;


            match(input, Token.UP, null); 



            		result = new ImportCommand(cmd, line);
            		System.out.println("***ImportCommand " + cmd + " Line: "+ line + " " + result);
            		commandList.add(result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "import_name"



    // $ANTLR start "expr_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:330:1: expr_stmt returns [Command result] : ( ^(op= ASSIGN id1= testlist id2= testlist ) | ^(op= PLUSEQUAL id1= testlist id2= testlist ) | ^(op= MINUSEQUAL id1= testlist id2= testlist ) | ^(op= STAREQUAL id1= testlist id2= testlist ) | ^(op= SLASHEQUAL id1= testlist id2= testlist ) | ^(op= PERCENTEQUAL id1= testlist id2= testlist ) | ^(op= AMPEREQUAL id1= testlist id2= testlist ) | ^(op= VBAREQUAL id1= testlist id2= testlist ) | ^(op= CIRCUMFLEXEQUAL id1= testlist id2= testlist ) | ^(op= LEFTSHIFTEQUAL id1= testlist id2= testlist ) | ^(op= RIGHTSHIFTEQUAL id1= testlist id2= testlist ) | ^(op= DOUBLESTAREQUAL id1= testlist id2= testlist ) | ^(op= DOUBLESLASHEQUAL id1= testlist id2= testlist ) |cmd= testlist );
    public final Command expr_stmt() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:331:3: ( ^(op= ASSIGN id1= testlist id2= testlist ) | ^(op= PLUSEQUAL id1= testlist id2= testlist ) | ^(op= MINUSEQUAL id1= testlist id2= testlist ) | ^(op= STAREQUAL id1= testlist id2= testlist ) | ^(op= SLASHEQUAL id1= testlist id2= testlist ) | ^(op= PERCENTEQUAL id1= testlist id2= testlist ) | ^(op= AMPEREQUAL id1= testlist id2= testlist ) | ^(op= VBAREQUAL id1= testlist id2= testlist ) | ^(op= CIRCUMFLEXEQUAL id1= testlist id2= testlist ) | ^(op= LEFTSHIFTEQUAL id1= testlist id2= testlist ) | ^(op= RIGHTSHIFTEQUAL id1= testlist id2= testlist ) | ^(op= DOUBLESTAREQUAL id1= testlist id2= testlist ) | ^(op= DOUBLESLASHEQUAL id1= testlist id2= testlist ) |cmd= testlist )
            int alt25=14;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt25=1;
                }
                break;
            case PLUSEQUAL:
                {
                alt25=2;
                }
                break;
            case MINUSEQUAL:
                {
                alt25=3;
                }
                break;
            case STAREQUAL:
                {
                alt25=4;
                }
                break;
            case SLASHEQUAL:
                {
                alt25=5;
                }
                break;
            case PERCENTEQUAL:
                {
                alt25=6;
                }
                break;
            case AMPEREQUAL:
                {
                alt25=7;
                }
                break;
            case VBAREQUAL:
                {
                alt25=8;
                }
                break;
            case CIRCUMFLEXEQUAL:
                {
                alt25=9;
                }
                break;
            case LEFTSHIFTEQUAL:
                {
                alt25=10;
                }
                break;
            case RIGHTSHIFTEQUAL:
                {
                alt25=11;
                }
                break;
            case DOUBLESTAREQUAL:
                {
                alt25=12;
                }
                break;
            case DOUBLESLASHEQUAL:
                {
                alt25=13;
                }
                break;
            case ALT_NOTEQUAL:
            case AMPER:
            case AND:
            case CIRCUMFLEX:
            case DOUBLESLASH:
            case DOUBLESTAR:
            case EQUAL:
            case EXPRESSION:
            case GREATER:
            case GREATEREQUAL:
            case IN:
            case IS:
            case ISNOT:
            case LEFTSHIFT:
            case LESS:
            case LESSEQUAL:
            case MINUS:
            case NOT:
            case NOTEQUAL:
            case NOTIN:
            case OR:
            case PLUS:
            case RIGHTSHIFT:
            case SLASH:
            case STAR:
            case UNARY_EXPRESSION:
            case VBAR:
                {
                alt25=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:331:5: ^(op= ASSIGN id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_stmt899); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt903);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt907);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:336:5: ^(op= PLUSEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,PLUSEQUAL,FOLLOW_PLUSEQUAL_in_expr_stmt918); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt922);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt926);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:341:5: ^(op= MINUSEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,MINUSEQUAL,FOLLOW_MINUSEQUAL_in_expr_stmt937); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt941);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt945);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:346:5: ^(op= STAREQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,STAREQUAL,FOLLOW_STAREQUAL_in_expr_stmt956); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt960);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt964);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:351:5: ^(op= SLASHEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,SLASHEQUAL,FOLLOW_SLASHEQUAL_in_expr_stmt975); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt979);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt983);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 6 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:356:5: ^(op= PERCENTEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,PERCENTEQUAL,FOLLOW_PERCENTEQUAL_in_expr_stmt994); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt998);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1002);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 7 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:361:5: ^(op= AMPEREQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,AMPEREQUAL,FOLLOW_AMPEREQUAL_in_expr_stmt1013); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt1017);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1021);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 8 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:366:5: ^(op= VBAREQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,VBAREQUAL,FOLLOW_VBAREQUAL_in_expr_stmt1032); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt1036);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1040);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 9 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:371:5: ^(op= CIRCUMFLEXEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,CIRCUMFLEXEQUAL,FOLLOW_CIRCUMFLEXEQUAL_in_expr_stmt1051); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt1055);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1059);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 10 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:376:5: ^(op= LEFTSHIFTEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,LEFTSHIFTEQUAL,FOLLOW_LEFTSHIFTEQUAL_in_expr_stmt1070); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt1074);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1078);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 11 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:381:5: ^(op= RIGHTSHIFTEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,RIGHTSHIFTEQUAL,FOLLOW_RIGHTSHIFTEQUAL_in_expr_stmt1089); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt1093);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1097);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 12 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:386:5: ^(op= DOUBLESTAREQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,DOUBLESTAREQUAL,FOLLOW_DOUBLESTAREQUAL_in_expr_stmt1108); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt1112);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1116);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 13 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:391:5: ^(op= DOUBLESLASHEQUAL id1= testlist id2= testlist )
                    {
                    op=(CommonTree)match(input,DOUBLESLASHEQUAL,FOLLOW_DOUBLESLASHEQUAL_in_expr_stmt1127); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_in_expr_stmt1131);
                    id1=testlist();

                    state._fsp--;


                    pushFollow(FOLLOW_testlist_in_expr_stmt1135);
                    id2=testlist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new AssignCommand((op!=null?op.getText():null),id1, id2, line);
                        System.out.println("***AssignCommand -> Op1:"+id1+"  Op2:"+id2+"  "+" Line: " + line + " " + result);
                        commandList.add(result); 
                        

                    }
                    break;
                case 14 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:396:5: cmd= testlist
                    {
                    pushFollow(FOLLOW_testlist_in_expr_stmt1145);
                    cmd=testlist();

                    state._fsp--;



                        result =cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "expr_stmt"



    // $ANTLR start "flow_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:401:1: flow_stmt returns [Command result] : cmd= return_stmt ;
    public final Command flow_stmt() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:402:2: (cmd= return_stmt )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:402:4: cmd= return_stmt
            {
            pushFollow(FOLLOW_return_stmt_in_flow_stmt1164);
            cmd=return_stmt();

            state._fsp--;



            		result = cmd;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "flow_stmt"



    // $ANTLR start "return_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:407:1: return_stmt returns [Command result] : ^( RETURN_CMD cmd= arglist ) ;
    public final Command return_stmt() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:408:2: ( ^( RETURN_CMD cmd= arglist ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:408:4: ^( RETURN_CMD cmd= arglist )
            {
            match(input,RETURN_CMD,FOLLOW_RETURN_CMD_in_return_stmt1182); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_arglist_in_return_stmt1186);
            cmd=arglist();

            state._fsp--;


            match(input, Token.UP, null); 



            		if(cmd!=null){
            			result = new ReturnCommand(cmd, line);
            			System.out.println("***ReturnCommand "+cmd + " " +"Line: " + line + " " +result);
            			commandList.add(result);
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "return_stmt"



    // $ANTLR start "compound_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:417:1: compound_stmt returns [Command result] : (cmd= if_stmt |cmd= while_stmt |cmd= for_stmt |cmd= try_stmt |cmd= funcdef |cmd= classdef |cmd= with_stmt );
    public final Command compound_stmt() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:418:8: (cmd= if_stmt |cmd= while_stmt |cmd= for_stmt |cmd= try_stmt |cmd= funcdef |cmd= classdef |cmd= with_stmt )
            int alt26=7;
            switch ( input.LA(1) ) {
            case IFBLOCK:
                {
                alt26=1;
                }
                break;
            case WHILEBLOCK:
                {
                alt26=2;
                }
                break;
            case FORLOOP_CMD:
                {
                alt26=3;
                }
                break;
            case TRYBLOCK:
                {
                alt26=4;
                }
                break;
            case OUTER_FUNCTION_CMD:
                {
                alt26=5;
                }
                break;
            case CLASS_CMD:
                {
                alt26=6;
                }
                break;
            case WITH_CMD:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:418:10: cmd= if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_compound_stmt1211);
                    cmd=if_stmt();

                    state._fsp--;


                     result = cmd; 

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:419:10: cmd= while_stmt
                    {
                    pushFollow(FOLLOW_while_stmt_in_compound_stmt1227);
                    cmd=while_stmt();

                    state._fsp--;


                     result = cmd; 

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:420:17: cmd= for_stmt
                    {
                    pushFollow(FOLLOW_for_stmt_in_compound_stmt1249);
                    cmd=for_stmt();

                    state._fsp--;


                     result = cmd; 

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:421:17: cmd= try_stmt
                    {
                    pushFollow(FOLLOW_try_stmt_in_compound_stmt1271);
                    cmd=try_stmt();

                    state._fsp--;


                     result = cmd; 

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:422:17: cmd= funcdef
                    {
                    pushFollow(FOLLOW_funcdef_in_compound_stmt1294);
                    cmd=funcdef();

                    state._fsp--;


                     result = cmd; 

                    }
                    break;
                case 6 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:423:17: cmd= classdef
                    {
                    pushFollow(FOLLOW_classdef_in_compound_stmt1316);
                    cmd=classdef();

                    state._fsp--;


                     result = cmd; 

                    }
                    break;
                case 7 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:424:17: cmd= with_stmt
                    {
                    pushFollow(FOLLOW_with_stmt_in_compound_stmt1339);
                    cmd=with_stmt();

                    state._fsp--;


                    result = cmd;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "compound_stmt"



    // $ANTLR start "if_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:427:1: if_stmt returns [Command result] : ^( IFBLOCK id1= if_clause (id2= elif_clauses )? (id3= else_clause )? ) ;
    public final Command if_stmt() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        List id2 =null;

        Command id3 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:428:2: ( ^( IFBLOCK id1= if_clause (id2= elif_clauses )? (id3= else_clause )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:428:4: ^( IFBLOCK id1= if_clause (id2= elif_clauses )? (id3= else_clause )? )
            {
            match(input,IFBLOCK,FOLLOW_IFBLOCK_in_if_stmt1383); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_if_clause_in_if_stmt1387);
            id1=if_clause();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:428:31: (id2= elif_clauses )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ELIF_CLAUSES) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:428:31: id2= elif_clauses
                    {
                    pushFollow(FOLLOW_elif_clauses_in_if_stmt1391);
                    id2=elif_clauses();

                    state._fsp--;


                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:428:49: (id3= else_clause )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ELSE_CMD) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:428:49: id3= else_clause
                    {
                    pushFollow(FOLLOW_else_clause_in_if_stmt1396);
                    id3=else_clause();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



            		if(id1!=null && id2!=null && id3!=null){
            			result = new IfBlockCommand(id1, id2, id3, line);
            			
            			int start = ((IfBlockCommand)(result)).findStartLine();
                    		((IfBlockCommand)(result)).setStartLine(start);
                    		
            			System.out.println("***IfBlockCommand -> "+ id1+ " "+ id2 +" "+ id3+" Start: " + ((IfBlockCommand)(result)).getStartLine() + " End: " + ((IfBlockCommand)(result)).getEndLine() + " " + result );
            			commandList.add(result);
            		}
            		else if(id1!=null && id2==null && id3!=null){
                  			result = new IfBlockCommand(id1, id3, line);
                  			
                  			int start = ((IfBlockCommand)(result)).findStartLine();
                    		((IfBlockCommand)(result)).setStartLine(start);
                    		
                  			
                  			System.out.println("***IfBlockCommand -> "+ id1+ " "+ id3+" Start: " + ((IfBlockCommand)(result)).getStartLine() + " End: " + ((IfBlockCommand)(result)).getEndLine() + " " + result );
                  			commandList.add(result);
                		}
                		else if(id1!=null && id2==null && id3==null){
                  			result = new IfBlockCommand(id1, line);
                  
                  			int start = ((IfBlockCommand)(result)).findStartLine();
                    		((IfBlockCommand)(result)).setStartLine(start);
                    	
                  			System.out.println("***IfBlockCommand -> "+ id1+" Start: " + ((IfBlockCommand)(result)).getStartLine() + " End: " + ((IfBlockCommand)(result)).getEndLine() + " " + result );
                  			commandList.add(result);
                		}
                		else if(id1!=null && id2!=null && id3==null){
                  			result = new IfBlockCommand(id1, id2, line);
                  
                  			int start = ((IfBlockCommand)(result)).findStartLine();
                    		((IfBlockCommand)(result)).setStartLine(start);
                    		
                  			System.out.println("***IfBlockCommand -> "+ id1+ " " +id2+ " Start: " + ((IfBlockCommand)(result)).getStartLine() + " End: " + ((IfBlockCommand)(result)).getEndLine() + " " + result );
                  			commandList.add(result);
                		}
                		else{
                
                		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "if_stmt"



    // $ANTLR start "if_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:472:1: if_clause returns [Command result] : ^( IF_CMD id1= test id2= suite ) ;
    public final Command if_clause() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        List id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:473:2: ( ^( IF_CMD id1= test id2= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:473:4: ^( IF_CMD id1= test id2= suite )
            {
            match(input,IF_CMD,FOLLOW_IF_CMD_in_if_clause1430); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_test_in_if_clause1434);
            id1=test();

            state._fsp--;


            pushFollow(FOLLOW_suite_in_if_clause1438);
            id2=suite();

            state._fsp--;


            match(input, Token.UP, null); 



            		result = new IfClauseCommand(id1, id2, line);
            		
            		int start = ((IfClauseCommand)(result)).findStartLine();
                    	((IfClauseCommand)(result)).setStartLine(start);
            		
            		System.out.println("***IfClauseCommand -> " + id1 + " "+ id2 + " Start: " + ((IfClauseCommand)(result)).getStartLine() + " End: " + ((IfClauseCommand)(result)).getEndLine() + " " + result );
            		commandList.add(result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "if_clause"


    protected static class elif_clauses_scope {
        List current;
    }
    protected Stack elif_clauses_stack = new Stack();



    // $ANTLR start "elif_clauses"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:484:1: elif_clauses returns [List result] : ^( ELIF_CLAUSES ( elif_clause )+ ) ;
    public final List elif_clauses() throws RecognitionException {
        elif_clauses_stack.push(new elif_clauses_scope());
        List result = null;


        ((elif_clauses_scope)elif_clauses_stack.peek()).current = new ArrayList<Command>();
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:487:2: ( ^( ELIF_CLAUSES ( elif_clause )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:487:4: ^( ELIF_CLAUSES ( elif_clause )+ )
            {
            match(input,ELIF_CLAUSES,FOLLOW_ELIF_CLAUSES_in_elif_clauses1464); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:487:19: ( elif_clause )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ELIF_CMD) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:487:19: elif_clause
            	    {
            	    pushFollow(FOLLOW_elif_clause_in_elif_clauses1466);
            	    elif_clause();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            match(input, Token.UP, null); 



            		result = ((elif_clauses_scope)elif_clauses_stack.peek()).current;
            		System.out.println("List:"+result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            elif_clauses_stack.pop();
        }
        return result;
    }
    // $ANTLR end "elif_clauses"



    // $ANTLR start "elif_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:493:1: elif_clause : ^( ELIF_CMD id1= test id2= suite ) ;
    public final void elif_clause() throws RecognitionException {
        Command id1 =null;

        List id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:494:2: ( ^( ELIF_CMD id1= test id2= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:494:4: ^( ELIF_CMD id1= test id2= suite )
            {
            match(input,ELIF_CMD,FOLLOW_ELIF_CMD_in_elif_clause1483); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_test_in_elif_clause1487);
            id1=test();

            state._fsp--;


            pushFollow(FOLLOW_suite_in_elif_clause1491);
            id2=suite();

            state._fsp--;


            match(input, Token.UP, null); 



            		d = new ElifClauseCommand(id1, id2, line);
            		
            		int start = ((ElifClauseCommand)(d)).findStartLine();
                    	((ElifClauseCommand)(d)).setStartLine(start);
                    	
            		System.out.println("***ElifClauseCommand -> "+ id1 + " " + id2 + " Start: " + ((ElifClauseCommand)(d)).getStartLine() + " End: " + ((ElifClauseCommand)(d)).getEndLine() + " " + d );
            		commandList.add(d);
            		
            		((elif_clauses_scope)elif_clauses_stack.peek()).current.add(d);
            		System.out.println("Current List:"+((elif_clauses_scope)elif_clauses_stack.peek()).current);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "elif_clause"



    // $ANTLR start "else_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:508:1: else_clause returns [Command result] : ^( ELSE_CMD cmd= suite ) ;
    public final Command else_clause() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:509:3: ( ^( ELSE_CMD cmd= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:509:5: ^( ELSE_CMD cmd= suite )
            {
            match(input,ELSE_CMD,FOLLOW_ELSE_CMD_in_else_clause1518); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_suite_in_else_clause1522);
            cmd=suite();

            state._fsp--;


            match(input, Token.UP, null); 



                  result = new ElseClauseCommand(cmd, line);
                  
                  int start = ((ElseClauseCommand)(result)).findStartLine();
                  ((ElseClauseCommand)(result)).setStartLine(start);
                    	
                  System.out.println("***ElseClauseCommand -> " + cmd + " Start: " + ((ElseClauseCommand)(result)).getStartLine() + " End: " + ((ElseClauseCommand)(result)).getEndLine() + " " + result );
                  commandList.add(result);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "else_clause"



    // $ANTLR start "while_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:520:1: while_stmt returns [Command result] : ^( WHILEBLOCK id1= while_clause (id2= else_clause )? ) ;
    public final Command while_stmt() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        Command id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:521:3: ( ^( WHILEBLOCK id1= while_clause (id2= else_clause )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:521:5: ^( WHILEBLOCK id1= while_clause (id2= else_clause )? )
            {
            match(input,WHILEBLOCK,FOLLOW_WHILEBLOCK_in_while_stmt1542); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_while_clause_in_while_stmt1546);
            id1=while_clause();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:521:38: (id2= else_clause )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ELSE_CMD) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:521:38: id2= else_clause
                    {
                    pushFollow(FOLLOW_else_clause_in_while_stmt1550);
                    id2=else_clause();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



                  if(id1!=null && id2!=null){
                    result = new WhileBlockCommand(id1,id2, line);
                    
                    int start = ((WhileBlockCommand)(result)).findStartLine();
                  ((WhileBlockCommand)(result)).setStartLine(start);
                  
                    System.out.println("***WhileBlockCommand -> " + id1 + " " + id2 + " Start: " + ((WhileBlockCommand)(result)).getStartLine() + " End: " +((WhileBlockCommand)(result)).getEndLine() + " " + result);
                    commandList.add(result);
                  }
                  else if (id1!=null && id2==null){
                    result = new WhileBlockCommand(id1, line);
                    
                    int start = ((WhileBlockCommand)(result)).findStartLine();
                  ((WhileBlockCommand)(result)).setStartLine(start);
                  
                    System.out.println("***WhileBlockCommand -> " + id1 + " Start: " + ((WhileBlockCommand)(result)).getStartLine() + " End: " +((WhileBlockCommand)(result)).getEndLine() + " " + result);
                    commandList.add(result);
                  }
                  else{
                  }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "while_stmt"



    // $ANTLR start "while_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:545:1: while_clause returns [Command result] : ^( WHILE_CMD id1= test id2= suite ) ;
    public final Command while_clause() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        List id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:546:3: ( ^( WHILE_CMD id1= test id2= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:546:5: ^( WHILE_CMD id1= test id2= suite )
            {
            match(input,WHILE_CMD,FOLLOW_WHILE_CMD_in_while_clause1573); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_test_in_while_clause1577);
            id1=test();

            state._fsp--;


            pushFollow(FOLLOW_suite_in_while_clause1581);
            id2=suite();

            state._fsp--;


            match(input, Token.UP, null); 



                  result = new WhileClauseCommand(id1, id2, line);
                  
                  int start = ((WhileClauseCommand)(result)).findStartLine();
                  ((WhileClauseCommand)(result)).setStartLine(start);
                  
                  System.out.println("***WhileClauseCommand -> " + id1 + " "+ id2 +" Start: " + ((WhileClauseCommand)(result)).getStartLine() + " End: " +((WhileClauseCommand)(result)).getEndLine() + " " + result);
                  commandList.add(result);
                  if(id1 instanceof MethodCommand)
                  	commandList.remove(id1);
                  
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "while_clause"



    // $ANTLR start "for_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:560:1: for_stmt returns [Command result] : ^( FORLOOP_CMD id1= exprlist id2= testlist id3= suite ) ;
    public final Command for_stmt() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        Command id2 =null;

        List id3 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:561:3: ( ^( FORLOOP_CMD id1= exprlist id2= testlist id3= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:561:5: ^( FORLOOP_CMD id1= exprlist id2= testlist id3= suite )
            {
            match(input,FORLOOP_CMD,FOLLOW_FORLOOP_CMD_in_for_stmt1601); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_exprlist_in_for_stmt1605);
            id1=exprlist();

            state._fsp--;


            pushFollow(FOLLOW_testlist_in_for_stmt1609);
            id2=testlist();

            state._fsp--;


            pushFollow(FOLLOW_suite_in_for_stmt1613);
            id3=suite();

            state._fsp--;


            match(input, Token.UP, null); 



              	// start line number
                	result = new ForLoopCommand(id1, id2, id3, line);
                	
                	int start = ((ForLoopCommand)(result)).findStartLine();
                  	((ForLoopCommand)(result)).setStartLine(start);
                  
                	System.out.println("***ForLoopCommand -> " + id1 + " "+id2 + " "+id3+" Start: " + ((ForLoopCommand)(result)).getStartLine() + " End: " +((ForLoopCommand)(result)).getEndLine() + " " + result);
                	commandList.add(result);
                	
                	//commandList.remove(id1);
                	
                	if(id2 instanceof MethodCommand)
                  		commandList.remove(id2);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "for_stmt"



    // $ANTLR start "try_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:578:1: try_stmt returns [Command result] : ^( TRYBLOCK id1= try_clause id2= except_clause (id3= finally_clause )? ) ;
    public final Command try_stmt() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        Command id2 =null;

        Command id3 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:579:3: ( ^( TRYBLOCK id1= try_clause id2= except_clause (id3= finally_clause )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:579:5: ^( TRYBLOCK id1= try_clause id2= except_clause (id3= finally_clause )? )
            {
            match(input,TRYBLOCK,FOLLOW_TRYBLOCK_in_try_stmt1636); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_try_clause_in_try_stmt1640);
            id1=try_clause();

            state._fsp--;


            pushFollow(FOLLOW_except_clause_in_try_stmt1644);
            id2=except_clause();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:579:52: (id3= finally_clause )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FINALLY_CMD) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:579:52: id3= finally_clause
                    {
                    pushFollow(FOLLOW_finally_clause_in_try_stmt1648);
                    id3=finally_clause();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



                  if(id1!=null && id2!=null && id3!=null){
                    result = new TryBlockCommand(id1, id2, id3, line);
                    
                    int start = ((TryBlockCommand)(result)).findStartLine();
                    ((TryBlockCommand)(result)).setStartLine(start);
                  
                    System.out.println("***TryBlockCommand -> " + id1 + " " + id2 + " " + id3 + " Start: " + ((TryBlockCommand)(result)).getStartLine() + " End: " + ((TryBlockCommand)(result)).getEndLine() + " " + result);
                    commandList.add(result);
                  }
                  else if(id1!=null && id2!=null && id3==null){
                    result = new TryBlockCommand(id1, id2, id3, line);
                    
                    int start = ((TryBlockCommand)(result)).findStartLine();
                    ((TryBlockCommand)(result)).setStartLine(start);
                  
                    System.out.println("***TryBlockCommand -> " + id1 + " " + id2 + " Start: " + ((TryBlockCommand)(result)).getStartLine() + " End: " + ((TryBlockCommand)(result)).getEndLine() + " " + result);
                    commandList.add(result);
                  }      
                  else{
                  }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "try_stmt"



    // $ANTLR start "try_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:603:1: try_clause returns [Command result] : ^( TRY_CMD cmd= suite ) ;
    public final Command try_clause() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:604:3: ( ^( TRY_CMD cmd= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:604:5: ^( TRY_CMD cmd= suite )
            {
            match(input,TRY_CMD,FOLLOW_TRY_CMD_in_try_clause1671); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_suite_in_try_clause1675);
            cmd=suite();

            state._fsp--;


            match(input, Token.UP, null); 



                  result = new TryClauseCommand(cmd, line);
                  
                  int start = ((TryClauseCommand)(result)).findStartLine();
                  ((TryClauseCommand)(result)).setStartLine(start);
                  
                  System.out.println("***TryClauseCommand -> " + cmd + " Start: " + ((TryClauseCommand)(result)).getStartLine() + " End: " + ((TryClauseCommand)(result)).getEndLine() + " " + result);
                  commandList.add(result);
                  
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "try_clause"



    // $ANTLR start "except_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:616:1: except_clause returns [Command result] : ^( EXCEPT_CMD (id1= trailer )? id2= suite ) ;
    public final Command except_clause() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        List id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:617:3: ( ^( EXCEPT_CMD (id1= trailer )? id2= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:617:5: ^( EXCEPT_CMD (id1= trailer )? id2= suite )
            {
            match(input,EXCEPT_CMD,FOLLOW_EXCEPT_CMD_in_except_clause1697); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:617:21: (id1= trailer )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SUBSCRIPTLISTS||LA32_0==TRAILER) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:617:21: id1= trailer
                    {
                    pushFollow(FOLLOW_trailer_in_except_clause1701);
                    id1=trailer();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_suite_in_except_clause1706);
            id2=suite();

            state._fsp--;


            match(input, Token.UP, null); 



                  if(id1!=null && id2!=null){
                    result = new ExceptClauseCommand(id1, id2, line);
                    
                    int start = ((ExceptClauseCommand)(result)).findStartLine();
                  	((ExceptClauseCommand)(result)).setStartLine(start);
                    
                    System.out.println("***ExceptClauseCommand -> " + id1 + " " + id2 + " Start: " +((ExceptClauseCommand)(result)).getStartLine() + " End: " + ((ExceptClauseCommand)(result)).getEndLine() + " " + result);
                    commandList.add(result);
                  }
                  
                  else if(id1==null && id2!=null){
                     result = new ExceptClauseCommand(id1, id2, line);
                    
                    int start = ((ExceptClauseCommand)(result)).findStartLine();
                  	((ExceptClauseCommand)(result)).setStartLine(start);
                    
                    System.out.println("***ExceptClauseCommand -> " + id2 + " Start: " +((ExceptClauseCommand)(result)).getStartLine() + " End: " + ((ExceptClauseCommand)(result)).getEndLine() + " " + result);
                    commandList.add(result);
                  } 
                  
                  else{
                  }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "except_clause"



    // $ANTLR start "finally_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:643:1: finally_clause returns [Command result] : ^( FINALLY_CMD cmd= suite ) ;
    public final Command finally_clause() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:644:3: ( ^( FINALLY_CMD cmd= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:644:5: ^( FINALLY_CMD cmd= suite )
            {
            match(input,FINALLY_CMD,FOLLOW_FINALLY_CMD_in_finally_clause1727); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_suite_in_finally_clause1731);
            cmd=suite();

            state._fsp--;


            match(input, Token.UP, null); 



                  result = new FinallyClauseCommand(cmd, line);
                  
                  int start = ((FinallyClauseCommand)(result)).findStartLine();
                  ((FinallyClauseCommand)(result)).setStartLine(start);
                  	
                  System.out.println("***FinallyClauseCommand -> " + cmd + " Start: " +((FinallyClauseCommand)(result)).getStartLine() + " End: " + ((FinallyClauseCommand)(result)).getEndLine() + " " + result);
                  commandList.add(result);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "finally_clause"



    // $ANTLR start "with_stmt"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:656:1: with_stmt returns [Command result] : ^( WITH_CMD id1= with_clause id2= suite ) ;
    public final Command with_stmt() throws RecognitionException {
        Command result = null;


        List id1 =null;

        List id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:656:35: ( ^( WITH_CMD id1= with_clause id2= suite ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:656:37: ^( WITH_CMD id1= with_clause id2= suite )
            {
            match(input,WITH_CMD,FOLLOW_WITH_CMD_in_with_stmt1749); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_with_clause_in_with_stmt1753);
            id1=with_clause();

            state._fsp--;


            pushFollow(FOLLOW_suite_in_with_stmt1757);
            id2=suite();

            state._fsp--;


            match(input, Token.UP, null); 



            	result = new WithCommand(id1, id2, line);
            	
            	((WithCommand)(result)).setStartLine();
            	
            	System.out.println("***WithBlockCommand -> " + id2 + " Start: " +((WithCommand)(result)).getStartLine() + " End: " + ((WithCommand)(result)).getEndLine() + " " + result);
                  	commandList.add(result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "with_stmt"


    protected static class with_clause_scope {
        List current;
    }
    protected Stack with_clause_stack = new Stack();



    // $ANTLR start "with_clause"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:666:1: with_clause returns [List result] : ^( WITH_ARGS ( with_item )+ ) ;
    public final List with_clause() throws RecognitionException {
        with_clause_stack.push(new with_clause_scope());
        List result = null;


        ((with_clause_scope)with_clause_stack.peek()).current = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:669:2: ( ^( WITH_ARGS ( with_item )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:669:5: ^( WITH_ARGS ( with_item )+ )
            {
            match(input,WITH_ARGS,FOLLOW_WITH_ARGS_in_with_clause1797); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:669:17: ( with_item )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==WITH_EQUIV) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:669:17: with_item
            	    {
            	    pushFollow(FOLLOW_with_item_in_with_clause1799);
            	    with_item();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            match(input, Token.UP, null); 


             
            		result = ((with_clause_scope)with_clause_stack.peek()).current; 
            		System.out.println("List:"+result);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            with_clause_stack.pop();
        }
        return result;
    }
    // $ANTLR end "with_clause"



    // $ANTLR start "with_item"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:675:1: with_item : ^( WITH_EQUIV id1= test (id2= test )? ) ;
    public final void with_item() throws RecognitionException {
        Command id1 =null;

        Command id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:676:2: ( ^( WITH_EQUIV id1= test (id2= test )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:676:4: ^( WITH_EQUIV id1= test (id2= test )? )
            {
            match(input,WITH_EQUIV,FOLLOW_WITH_EQUIV_in_with_item1822); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_test_in_with_item1826);
            id1=test();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:676:29: (id2= test )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0 >= ALT_NOTEQUAL && LA34_0 <= AMPER)||LA34_0==AND||LA34_0==CIRCUMFLEX||LA34_0==DOUBLESLASH||LA34_0==DOUBLESTAR||LA34_0==EQUAL||LA34_0==EXPRESSION||(LA34_0 >= GREATER && LA34_0 <= GREATEREQUAL)||LA34_0==IN||(LA34_0 >= IS && LA34_0 <= ISNOT)||LA34_0==LEFTSHIFT||(LA34_0 >= LESS && LA34_0 <= LESSEQUAL)||LA34_0==MINUS||(LA34_0 >= NOT && LA34_0 <= NOTIN)||LA34_0==OR||LA34_0==PLUS||LA34_0==RIGHTSHIFT||LA34_0==SLASH||LA34_0==STAR||LA34_0==UNARY_EXPRESSION||LA34_0==VBAR) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:676:29: id2= test
                    {
                    pushFollow(FOLLOW_test_in_with_item1830);
                    id2=test();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



            	
            		if(id2!=null){
            			w = new WithEquivalent (id1, id2, line);
            			System.out.println("***With Equivalency " + id1 + " as " + id2 + " Line: "+ line + " " + c);
            		}
            		else{
            			w = new WithEquivalent (id1, id1, line);
            			System.out.println("***With Equivalency " + id1 + " as " + id2 + " Line: "+ line + " " + c);
            		}
            		withPairsList.add(w);
            		((with_clause_scope)with_clause_stack.peek()).current.add(w);
            		System.out.println("Current List:"+((with_clause_scope)with_clause_stack.peek()).current);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "with_item"


    protected static class suite_scope {
        List currentStmt;
    }
    protected Stack suite_stack = new Stack();



    // $ANTLR start "suite"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:693:1: suite returns [List result] : ^( INDENT ( stmt_inside_block )+ ) ;
    public final List suite() throws RecognitionException {
        suite_stack.push(new suite_scope());
        List result = null;


        ((suite_scope)suite_stack.peek()).currentStmt = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:696:2: ( ^( INDENT ( stmt_inside_block )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:696:3: ^( INDENT ( stmt_inside_block )+ )
            {
            match(input,INDENT,FOLLOW_INDENT_in_suite1860); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:696:12: ( stmt_inside_block )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0 >= ALT_NOTEQUAL && LA35_0 <= AND)||LA35_0==ASSIGN||(LA35_0 >= CIRCUMFLEX && LA35_0 <= CIRCUMFLEXEQUAL)||LA35_0==CLASS_CMD||(LA35_0 >= DOUBLESLASH && LA35_0 <= DOUBLESTAREQUAL)||LA35_0==EQUAL||LA35_0==EXPRESSION||(LA35_0 >= FORLOOP_CMD && LA35_0 <= GREATEREQUAL)||LA35_0==IFBLOCK||LA35_0==IMPORT_CMD||LA35_0==IN||(LA35_0 >= IS && LA35_0 <= ISNOT)||(LA35_0 >= LEFTSHIFT && LA35_0 <= LESSEQUAL)||(LA35_0 >= MINUS && LA35_0 <= MINUSEQUAL)||(LA35_0 >= NOT && LA35_0 <= NOTIN)||LA35_0==OR||LA35_0==OUTER_FUNCTION_CMD||(LA35_0 >= PERCENTEQUAL && LA35_0 <= PLUSEQUAL)||LA35_0==PRINT_CMD||(LA35_0 >= RETURN_CMD && LA35_0 <= RIGHTSHIFTEQUAL)||(LA35_0 >= SLASH && LA35_0 <= STAREQUAL)||LA35_0==TRYBLOCK||LA35_0==UNARY_EXPRESSION||(LA35_0 >= VBAR && LA35_0 <= WHILEBLOCK)||LA35_0==WITH_CMD) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:696:12: stmt_inside_block
            	    {
            	    pushFollow(FOLLOW_stmt_inside_block_in_suite1862);
            	    stmt_inside_block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            match(input, Token.UP, null); 



                  		result = ((suite_scope)suite_stack.peek()).currentStmt;
                  		System.out.println("List of Statements inside block: " + result);
                  		
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            suite_stack.pop();
        }
        return result;
    }
    // $ANTLR end "suite"



    // $ANTLR start "stmt_inside_block"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:703:1: stmt_inside_block : (id1= simple_stmt |id2= compound_stmt );
    public final void stmt_inside_block() throws RecognitionException {
        Command id1 =null;

        Command id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:704:2: (id1= simple_stmt |id2= compound_stmt )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0 >= ALT_NOTEQUAL && LA36_0 <= AND)||LA36_0==ASSIGN||(LA36_0 >= CIRCUMFLEX && LA36_0 <= CIRCUMFLEXEQUAL)||(LA36_0 >= DOUBLESLASH && LA36_0 <= DOUBLESTAREQUAL)||LA36_0==EQUAL||LA36_0==EXPRESSION||(LA36_0 >= GREATER && LA36_0 <= GREATEREQUAL)||LA36_0==IMPORT_CMD||LA36_0==IN||(LA36_0 >= IS && LA36_0 <= ISNOT)||(LA36_0 >= LEFTSHIFT && LA36_0 <= LESSEQUAL)||(LA36_0 >= MINUS && LA36_0 <= MINUSEQUAL)||(LA36_0 >= NOT && LA36_0 <= NOTIN)||LA36_0==OR||(LA36_0 >= PERCENTEQUAL && LA36_0 <= PLUSEQUAL)||LA36_0==PRINT_CMD||(LA36_0 >= RETURN_CMD && LA36_0 <= RIGHTSHIFTEQUAL)||(LA36_0 >= SLASH && LA36_0 <= STAREQUAL)||LA36_0==UNARY_EXPRESSION||(LA36_0 >= VBAR && LA36_0 <= VBAREQUAL)) ) {
                alt36=1;
            }
            else if ( (LA36_0==CLASS_CMD||LA36_0==FORLOOP_CMD||LA36_0==IFBLOCK||LA36_0==OUTER_FUNCTION_CMD||LA36_0==TRYBLOCK||LA36_0==WHILEBLOCK||LA36_0==WITH_CMD) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:704:4: id1= simple_stmt
                    {
                    pushFollow(FOLLOW_simple_stmt_in_stmt_inside_block1885);
                    id1=simple_stmt();

                    state._fsp--;


                    ((suite_scope)suite_stack.peek()).currentStmt.add(id1); 

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:705:6: id2= compound_stmt
                    {
                    pushFollow(FOLLOW_compound_stmt_in_stmt_inside_block1896);
                    id2=compound_stmt();

                    state._fsp--;


                    ((suite_scope)suite_stack.peek()).currentStmt.add(id2);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt_inside_block"



    // $ANTLR start "test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:708:1: test returns [Command result] : cmd= or_test ;
    public final Command test() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:709:3: (cmd= or_test )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:709:5: cmd= or_test
            {
            pushFollow(FOLLOW_or_test_in_test1918);
            cmd=or_test();

            state._fsp--;



                  result = cmd;
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "test"



    // $ANTLR start "or_test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:714:1: or_test returns [Command result] : ( ^(op= OR id1= or_test id2= or_test ) | (cmd= and_test ) );
    public final Command or_test() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:715:3: ( ^(op= OR id1= or_test id2= or_test ) | (cmd= and_test ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==OR) ) {
                alt37=1;
            }
            else if ( ((LA37_0 >= ALT_NOTEQUAL && LA37_0 <= AMPER)||LA37_0==AND||LA37_0==CIRCUMFLEX||LA37_0==DOUBLESLASH||LA37_0==DOUBLESTAR||LA37_0==EQUAL||LA37_0==EXPRESSION||(LA37_0 >= GREATER && LA37_0 <= GREATEREQUAL)||LA37_0==IN||(LA37_0 >= IS && LA37_0 <= ISNOT)||LA37_0==LEFTSHIFT||(LA37_0 >= LESS && LA37_0 <= LESSEQUAL)||LA37_0==MINUS||(LA37_0 >= NOT && LA37_0 <= NOTIN)||LA37_0==PLUS||LA37_0==RIGHTSHIFT||LA37_0==SLASH||LA37_0==STAR||LA37_0==UNARY_EXPRESSION||LA37_0==VBAR) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:715:5: ^(op= OR id1= or_test id2= or_test )
                    {
                    op=(CommonTree)match(input,OR,FOLLOW_OR_in_or_test1942); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_or_test_in_or_test1946);
                    id1=or_test();

                    state._fsp--;


                    pushFollow(FOLLOW_or_test_in_or_test1950);
                    id2=or_test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+ " Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:720:5: (cmd= and_test )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:720:5: (cmd= and_test )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:720:6: cmd= and_test
                    {
                    pushFollow(FOLLOW_and_test_in_or_test1961);
                    cmd=and_test();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "or_test"



    // $ANTLR start "and_test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:725:1: and_test returns [Command result] : ( ^(op= AND id1= and_test id2= and_test ) | (cmd= not_test ) );
    public final Command and_test() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:726:3: ( ^(op= AND id1= and_test id2= and_test ) | (cmd= not_test ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==AND) ) {
                alt38=1;
            }
            else if ( ((LA38_0 >= ALT_NOTEQUAL && LA38_0 <= AMPER)||LA38_0==CIRCUMFLEX||LA38_0==DOUBLESLASH||LA38_0==DOUBLESTAR||LA38_0==EQUAL||LA38_0==EXPRESSION||(LA38_0 >= GREATER && LA38_0 <= GREATEREQUAL)||LA38_0==IN||(LA38_0 >= IS && LA38_0 <= ISNOT)||LA38_0==LEFTSHIFT||(LA38_0 >= LESS && LA38_0 <= LESSEQUAL)||LA38_0==MINUS||(LA38_0 >= NOT && LA38_0 <= NOTIN)||LA38_0==PLUS||LA38_0==RIGHTSHIFT||LA38_0==SLASH||LA38_0==STAR||LA38_0==UNARY_EXPRESSION||LA38_0==VBAR) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:726:5: ^(op= AND id1= and_test id2= and_test )
                    {
                    op=(CommonTree)match(input,AND,FOLLOW_AND_in_and_test1985); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_and_test_in_and_test1989);
                    id1=and_test();

                    state._fsp--;


                    pushFollow(FOLLOW_and_test_in_and_test1993);
                    id2=and_test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:731:5: (cmd= not_test )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:731:5: (cmd= not_test )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:731:6: cmd= not_test
                    {
                    pushFollow(FOLLOW_not_test_in_and_test2004);
                    cmd=not_test();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "and_test"



    // $ANTLR start "not_test"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:736:1: not_test returns [Command result] : ( ^(op= NOT cmd= not_test ) |cmd= comparison );
    public final Command not_test() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:737:3: ( ^(op= NOT cmd= not_test ) |cmd= comparison )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==NOT) ) {
                alt39=1;
            }
            else if ( ((LA39_0 >= ALT_NOTEQUAL && LA39_0 <= AMPER)||LA39_0==CIRCUMFLEX||LA39_0==DOUBLESLASH||LA39_0==DOUBLESTAR||LA39_0==EQUAL||LA39_0==EXPRESSION||(LA39_0 >= GREATER && LA39_0 <= GREATEREQUAL)||LA39_0==IN||(LA39_0 >= IS && LA39_0 <= ISNOT)||LA39_0==LEFTSHIFT||(LA39_0 >= LESS && LA39_0 <= LESSEQUAL)||LA39_0==MINUS||(LA39_0 >= NOTEQUAL && LA39_0 <= NOTIN)||LA39_0==PLUS||LA39_0==RIGHTSHIFT||LA39_0==SLASH||LA39_0==STAR||LA39_0==UNARY_EXPRESSION||LA39_0==VBAR) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:737:5: ^(op= NOT cmd= not_test )
                    {
                    op=(CommonTree)match(input,NOT,FOLLOW_NOT_in_not_test2027); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_not_test_in_not_test2031);
                    cmd=not_test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new UnaryCommand((op!=null?op.getText():null), cmd, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+cmd+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:742:5: cmd= comparison
                    {
                    pushFollow(FOLLOW_comparison_in_not_test2041);
                    cmd=comparison();

                    state._fsp--;



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "not_test"



    // $ANTLR start "comparison"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:747:1: comparison returns [Command result] : ( ^(op= LESS id1= comparison id2= comparison ) | ^(op= GREATER id1= comparison id2= comparison ) | ^(op= EQUAL id1= comparison id2= comparison ) | ^(op= GREATEREQUAL id1= comparison id2= comparison ) | ^(op= LESSEQUAL id1= comparison id2= comparison ) | ^(op= ALT_NOTEQUAL id1= comparison id2= comparison ) | ^(op= NOTEQUAL id1= comparison id2= comparison ) | ^(op= IN id1= comparison id2= comparison ) | ^(op= NOTIN id1= comparison id2= comparison ) | ^(op= IS id1= comparison id2= comparison ) | ^(op= ISNOT id1= comparison id2= comparison ) | (cmd= expr ) );
    public final Command comparison() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:748:3: ( ^(op= LESS id1= comparison id2= comparison ) | ^(op= GREATER id1= comparison id2= comparison ) | ^(op= EQUAL id1= comparison id2= comparison ) | ^(op= GREATEREQUAL id1= comparison id2= comparison ) | ^(op= LESSEQUAL id1= comparison id2= comparison ) | ^(op= ALT_NOTEQUAL id1= comparison id2= comparison ) | ^(op= NOTEQUAL id1= comparison id2= comparison ) | ^(op= IN id1= comparison id2= comparison ) | ^(op= NOTIN id1= comparison id2= comparison ) | ^(op= IS id1= comparison id2= comparison ) | ^(op= ISNOT id1= comparison id2= comparison ) | (cmd= expr ) )
            int alt40=12;
            switch ( input.LA(1) ) {
            case LESS:
                {
                alt40=1;
                }
                break;
            case GREATER:
                {
                alt40=2;
                }
                break;
            case EQUAL:
                {
                alt40=3;
                }
                break;
            case GREATEREQUAL:
                {
                alt40=4;
                }
                break;
            case LESSEQUAL:
                {
                alt40=5;
                }
                break;
            case ALT_NOTEQUAL:
                {
                alt40=6;
                }
                break;
            case NOTEQUAL:
                {
                alt40=7;
                }
                break;
            case IN:
                {
                alt40=8;
                }
                break;
            case NOTIN:
                {
                alt40=9;
                }
                break;
            case IS:
                {
                alt40=10;
                }
                break;
            case ISNOT:
                {
                alt40=11;
                }
                break;
            case AMPER:
            case CIRCUMFLEX:
            case DOUBLESLASH:
            case DOUBLESTAR:
            case EXPRESSION:
            case LEFTSHIFT:
            case MINUS:
            case PLUS:
            case RIGHTSHIFT:
            case SLASH:
            case STAR:
            case UNARY_EXPRESSION:
            case VBAR:
                {
                alt40=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:748:5: ^(op= LESS id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,LESS,FOLLOW_LESS_in_comparison2062); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2066);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2070);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:753:5: ^(op= GREATER id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,GREATER,FOLLOW_GREATER_in_comparison2082); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2086);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2090);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:758:5: ^(op= EQUAL id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_comparison2102); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2106);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2110);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:763:5: ^(op= GREATEREQUAL id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_comparison2122); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2126);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2130);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:768:5: ^(op= LESSEQUAL id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_comparison2142); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2146);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2150);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 6 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:773:5: ^(op= ALT_NOTEQUAL id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,ALT_NOTEQUAL,FOLLOW_ALT_NOTEQUAL_in_comparison2162); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2166);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2170);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 7 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:778:5: ^(op= NOTEQUAL id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_comparison2182); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2186);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2190);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 8 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:783:5: ^(op= IN id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,IN,FOLLOW_IN_in_comparison2202); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2206);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2210);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 9 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:788:5: ^(op= NOTIN id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,NOTIN,FOLLOW_NOTIN_in_comparison2222); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2226);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2230);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 10 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:793:5: ^(op= IS id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,IS,FOLLOW_IS_in_comparison2242); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2246);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2250);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 11 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:798:5: ^(op= ISNOT id1= comparison id2= comparison )
                    {
                    op=(CommonTree)match(input,ISNOT,FOLLOW_ISNOT_in_comparison2262); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_comparison_in_comparison2266);
                    id1=comparison();

                    state._fsp--;


                    pushFollow(FOLLOW_comparison_in_comparison2270);
                    id2=comparison();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 12 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:803:5: (cmd= expr )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:803:5: (cmd= expr )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:803:6: cmd= expr
                    {
                    pushFollow(FOLLOW_expr_in_comparison2282);
                    cmd=expr();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "comparison"



    // $ANTLR start "expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:808:1: expr returns [Command result] : ( ^(op= VBAR id1= expr id2= expr ) | (cmd= xor_expr ) );
    public final Command expr() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:809:3: ( ^(op= VBAR id1= expr id2= expr ) | (cmd= xor_expr ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==VBAR) ) {
                alt41=1;
            }
            else if ( (LA41_0==AMPER||LA41_0==CIRCUMFLEX||LA41_0==DOUBLESLASH||LA41_0==DOUBLESTAR||LA41_0==EXPRESSION||LA41_0==LEFTSHIFT||LA41_0==MINUS||LA41_0==PLUS||LA41_0==RIGHTSHIFT||LA41_0==SLASH||LA41_0==STAR||LA41_0==UNARY_EXPRESSION) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:809:5: ^(op= VBAR id1= expr id2= expr )
                    {
                    op=(CommonTree)match(input,VBAR,FOLLOW_VBAR_in_expr2304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr2308);
                    id1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr2312);
                    id2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:814:5: (cmd= xor_expr )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:814:5: (cmd= xor_expr )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:814:6: cmd= xor_expr
                    {
                    pushFollow(FOLLOW_xor_expr_in_expr2323);
                    cmd=xor_expr();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "expr"



    // $ANTLR start "xor_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:819:1: xor_expr returns [Command result] : ( ^(op= CIRCUMFLEX id1= xor_expr id2= xor_expr ) | (cmd= and_expr ) );
    public final Command xor_expr() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:820:3: ( ^(op= CIRCUMFLEX id1= xor_expr id2= xor_expr ) | (cmd= and_expr ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==CIRCUMFLEX) ) {
                alt42=1;
            }
            else if ( (LA42_0==AMPER||LA42_0==DOUBLESLASH||LA42_0==DOUBLESTAR||LA42_0==EXPRESSION||LA42_0==LEFTSHIFT||LA42_0==MINUS||LA42_0==PLUS||LA42_0==RIGHTSHIFT||LA42_0==SLASH||LA42_0==STAR||LA42_0==UNARY_EXPRESSION) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:820:5: ^(op= CIRCUMFLEX id1= xor_expr id2= xor_expr )
                    {
                    op=(CommonTree)match(input,CIRCUMFLEX,FOLLOW_CIRCUMFLEX_in_xor_expr2346); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_xor_expr_in_xor_expr2350);
                    id1=xor_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_xor_expr_in_xor_expr2354);
                    id2=xor_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:825:5: (cmd= and_expr )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:825:5: (cmd= and_expr )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:825:6: cmd= and_expr
                    {
                    pushFollow(FOLLOW_and_expr_in_xor_expr2365);
                    cmd=and_expr();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "xor_expr"



    // $ANTLR start "and_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:830:1: and_expr returns [Command result] : ( ^(op= AMPER id1= and_expr id2= and_expr ) | (cmd= shift_expr ) );
    public final Command and_expr() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:831:3: ( ^(op= AMPER id1= and_expr id2= and_expr ) | (cmd= shift_expr ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AMPER) ) {
                alt43=1;
            }
            else if ( (LA43_0==DOUBLESLASH||LA43_0==DOUBLESTAR||LA43_0==EXPRESSION||LA43_0==LEFTSHIFT||LA43_0==MINUS||LA43_0==PLUS||LA43_0==RIGHTSHIFT||LA43_0==SLASH||LA43_0==STAR||LA43_0==UNARY_EXPRESSION) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:831:5: ^(op= AMPER id1= and_expr id2= and_expr )
                    {
                    op=(CommonTree)match(input,AMPER,FOLLOW_AMPER_in_and_expr2388); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_and_expr_in_and_expr2392);
                    id1=and_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_and_expr_in_and_expr2396);
                    id2=and_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:836:5: (cmd= shift_expr )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:836:5: (cmd= shift_expr )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:836:6: cmd= shift_expr
                    {
                    pushFollow(FOLLOW_shift_expr_in_and_expr2407);
                    cmd=shift_expr();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "and_expr"



    // $ANTLR start "shift_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:841:1: shift_expr returns [Command result] : ( ^(op= LEFTSHIFT id1= shift_expr id2= shift_expr ) | ^(op= RIGHTSHIFT id1= shift_expr id2= shift_expr ) | (cmd= arith_expr ) );
    public final Command shift_expr() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:842:3: ( ^(op= LEFTSHIFT id1= shift_expr id2= shift_expr ) | ^(op= RIGHTSHIFT id1= shift_expr id2= shift_expr ) | (cmd= arith_expr ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case LEFTSHIFT:
                {
                alt44=1;
                }
                break;
            case RIGHTSHIFT:
                {
                alt44=2;
                }
                break;
            case DOUBLESLASH:
            case DOUBLESTAR:
            case EXPRESSION:
            case MINUS:
            case PLUS:
            case SLASH:
            case STAR:
            case UNARY_EXPRESSION:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:842:5: ^(op= LEFTSHIFT id1= shift_expr id2= shift_expr )
                    {
                    op=(CommonTree)match(input,LEFTSHIFT,FOLLOW_LEFTSHIFT_in_shift_expr2429); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_shift_expr_in_shift_expr2433);
                    id1=shift_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_shift_expr_in_shift_expr2437);
                    id2=shift_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                        

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:847:5: ^(op= RIGHTSHIFT id1= shift_expr id2= shift_expr )
                    {
                    op=(CommonTree)match(input,RIGHTSHIFT,FOLLOW_RIGHTSHIFT_in_shift_expr2448); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_shift_expr_in_shift_expr2452);
                    id1=shift_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_shift_expr_in_shift_expr2456);
                    id2=shift_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:852:5: (cmd= arith_expr )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:852:5: (cmd= arith_expr )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:852:6: cmd= arith_expr
                    {
                    pushFollow(FOLLOW_arith_expr_in_shift_expr2467);
                    cmd=arith_expr();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "shift_expr"



    // $ANTLR start "arith_expr"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:857:1: arith_expr returns [Command result] : ( ^(op= PLUS id1= arith_expr id2= arith_expr ) | ^(op= MINUS id1= arith_expr id2= arith_expr ) | (cmd= term ) );
    public final Command arith_expr() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:858:3: ( ^(op= PLUS id1= arith_expr id2= arith_expr ) | ^(op= MINUS id1= arith_expr id2= arith_expr ) | (cmd= term ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt45=1;
                }
                break;
            case MINUS:
                {
                alt45=2;
                }
                break;
            case DOUBLESLASH:
            case DOUBLESTAR:
            case EXPRESSION:
            case SLASH:
            case STAR:
            case UNARY_EXPRESSION:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:858:5: ^(op= PLUS id1= arith_expr id2= arith_expr )
                    {
                    op=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_arith_expr2489); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arith_expr_in_arith_expr2493);
                    id1=arith_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_arith_expr_in_arith_expr2497);
                    id2=arith_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                        

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:863:5: ^(op= MINUS id1= arith_expr id2= arith_expr )
                    {
                    op=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_arith_expr2508); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arith_expr_in_arith_expr2512);
                    id1=arith_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_arith_expr_in_arith_expr2516);
                    id2=arith_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:868:5: (cmd= term )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:868:5: (cmd= term )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:868:6: cmd= term
                    {
                    pushFollow(FOLLOW_term_in_arith_expr2527);
                    cmd=term();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "arith_expr"



    // $ANTLR start "term"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:873:1: term returns [Command result] : ( ^(op= STAR id1= term id2= term ) | ^(op= SLASH id1= term id2= term ) | ^(op= DOUBLESLASH id1= term id2= term ) | ^(op= DOUBLESTAR id1= term id2= term ) | (cmd= factor ) );
    public final Command term() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command id1 =null;

        Command id2 =null;

        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:874:2: ( ^(op= STAR id1= term id2= term ) | ^(op= SLASH id1= term id2= term ) | ^(op= DOUBLESLASH id1= term id2= term ) | ^(op= DOUBLESTAR id1= term id2= term ) | (cmd= factor ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt46=1;
                }
                break;
            case SLASH:
                {
                alt46=2;
                }
                break;
            case DOUBLESLASH:
                {
                alt46=3;
                }
                break;
            case DOUBLESTAR:
                {
                alt46=4;
                }
                break;
            case EXPRESSION:
            case UNARY_EXPRESSION:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:874:4: ^(op= STAR id1= term id2= term )
                    {
                    op=(CommonTree)match(input,STAR,FOLLOW_STAR_in_term2550); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_term_in_term2554);
                    id1=term();

                    state._fsp--;


                    pushFollow(FOLLOW_term_in_term2558);
                    id2=term();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     
                    		result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                    		System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                    		commandList.add(result);
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:879:4: ^(op= SLASH id1= term id2= term )
                    {
                    op=(CommonTree)match(input,SLASH,FOLLOW_SLASH_in_term2568); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_term_in_term2572);
                    id1=term();

                    state._fsp--;


                    pushFollow(FOLLOW_term_in_term2576);
                    id2=term();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    	  result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                    	  System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                    	  commandList.add(result);
                    	

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:884:4: ^(op= DOUBLESLASH id1= term id2= term )
                    {
                    op=(CommonTree)match(input,DOUBLESLASH,FOLLOW_DOUBLESLASH_in_term2586); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_term_in_term2590);
                    id1=term();

                    state._fsp--;


                    pushFollow(FOLLOW_term_in_term2594);
                    id2=term();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:889:5: ^(op= DOUBLESTAR id1= term id2= term )
                    {
                    op=(CommonTree)match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_term2605); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_term_in_term2609);
                    id1=term();

                    state._fsp--;


                    pushFollow(FOLLOW_term_in_term2613);
                    id2=term();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        result = new BinaryCommand((op!=null?op.getText():null), id1, id2, line);
                        System.out.println("Operator:"+(op!=null?op.getText():null)+" "+id1+" "+id2+" "+" Line: " + line + " " +result);
                        commandList.add(result);
                      

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:894:5: (cmd= factor )
                    {
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:894:5: (cmd= factor )
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:894:6: cmd= factor
                    {
                    pushFollow(FOLLOW_factor_in_term2624);
                    cmd=factor();

                    state._fsp--;


                    }



                        result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:900:1: factor returns [Command result] : ( ^( UNARY_EXPRESSION op= PLUS cmd= power ) | ^( UNARY_EXPRESSION op= MINUS cmd= power ) | ^( UNARY_EXPRESSION op= TILDE cmd= power ) |cmd= power );
    public final Command factor() throws RecognitionException {
        Command result = null;


        CommonTree op=null;
        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:901:2: ( ^( UNARY_EXPRESSION op= PLUS cmd= power ) | ^( UNARY_EXPRESSION op= MINUS cmd= power ) | ^( UNARY_EXPRESSION op= TILDE cmd= power ) |cmd= power )
            int alt47=4;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==UNARY_EXPRESSION) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case PLUS:
                        {
                        alt47=1;
                        }
                        break;
                    case MINUS:
                        {
                        alt47=2;
                        }
                        break;
                    case TILDE:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 3, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA47_0==EXPRESSION) ) {
                alt47=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:901:4: ^( UNARY_EXPRESSION op= PLUS cmd= power )
                    {
                    match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_factor2648); 

                    match(input, Token.DOWN, null); 
                    op=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_factor2652); 

                    pushFollow(FOLLOW_power_in_factor2656);
                    cmd=power();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     
                    		result = new UnaryCommand((op!=null?op.getText():null), cmd, line);
                    		 System.out.println("Operator:"+(op!=null?op.getText():null)+" "+cmd+" "+" Line: " + line + " " +result);
                    		 commandList.add(result);
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:906:4: ^( UNARY_EXPRESSION op= MINUS cmd= power )
                    {
                    match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_factor2665); 

                    match(input, Token.DOWN, null); 
                    op=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_factor2669); 

                    pushFollow(FOLLOW_power_in_factor2673);
                    cmd=power();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     
                    		result = new UnaryCommand((op!=null?op.getText():null), cmd, line);
                    		 System.out.println("Operator:"+(op!=null?op.getText():null)+" "+cmd+" "+" Line: " + line + " " +result);
                    		 commandList.add(result);
                    	

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:911:4: ^( UNARY_EXPRESSION op= TILDE cmd= power )
                    {
                    match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_factor2681); 

                    match(input, Token.DOWN, null); 
                    op=(CommonTree)match(input,TILDE,FOLLOW_TILDE_in_factor2685); 

                    pushFollow(FOLLOW_power_in_factor2689);
                    cmd=power();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     
                    		result = new UnaryCommand((op!=null?op.getText():null), cmd, line);
                    		 System.out.println("Operator:"+(op!=null?op.getText():null)+" "+cmd+" "+" Line: " + line + " " +result);
                    		 commandList.add(result);
                    	

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:916:4: cmd= power
                    {
                    pushFollow(FOLLOW_power_in_factor2698);
                    cmd=power();

                    state._fsp--;


                     result = cmd; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "factor"



    // $ANTLR start "power"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:919:1: power returns [Command result] : ^( EXPRESSION id1= atom (id2= trailer )? (id3= power )? ) ;
    public final Command power() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        Command id2 =null;

        Command id3 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:920:2: ( ^( EXPRESSION id1= atom (id2= trailer )? (id3= power )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:920:4: ^( EXPRESSION id1= atom (id2= trailer )? (id3= power )? )
            {
            match(input,EXPRESSION,FOLLOW_EXPRESSION_in_power2722); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_atom_in_power2726);
            id1=atom();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:920:29: (id2= trailer )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==SUBSCRIPTLISTS||LA48_0==TRAILER) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:920:29: id2= trailer
                    {
                    pushFollow(FOLLOW_trailer_in_power2730);
                    id2=trailer();

                    state._fsp--;


                    }
                    break;

            }


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:920:42: (id3= power )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==EXPRESSION) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:920:42: id3= power
                    {
                    pushFollow(FOLLOW_power_in_power2735);
                    id3=power();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



            	  
            	  if(id3==null){
            	  	if(id1!=null && id2!=null){  		
            	     		// retrieve name	
            	   		if(id1.toString().matches("(.*)ClassVariableCommand(.*)")){
            	   			str = ((ClassVariableCommand)(id1)).getName();
            	   			//System.out.println("Debug-ClassVariable: " + str);
            	   		}
            	  		else if(id1.toString().matches("(.*)VariableCommand(.*)")){
            	   			str = ((VariableCommand)(id1)).getName();
            	   			//System.out.println("Debug-Variable: " + str);
            	   		}
            	  		else{
            	   			str = "";
            	  		}
            	  
            	  		//check name
            		  	if(str.equals("int"))
            		   		str = "int_casting";
            		  	else if (str.equals("long"))
            		   		str = "longInt_casting";
            		  	else if (str.equals("float"))
            		   		str = "float_casting";
            		  	else{
            		   		str = str;
            		  	}
            	  
            	  		// main part
            		  	if(id2.toString().matches("(.*)ArgumentsCommand(.*)")){
            			   	result = new MethodCommand(str, id2, line);
            			   	//System.out.println("*********Before Adding Method*******"+ getCommandList());
            			   	System.out.println("***MethodCommand -> Name: " + str + " Args: " + id2 + " " +" Line: " + line + " " + result);
            			   	commandList.remove(id1);
            			   	commandList.add(result);
            			   	//System.out.println("*********After Adding Method*******"+ getCommandList());
            		   	}
            		   	else {
            			   	result = new SubscriptedVariableCommand(str, id2, line);
            			   	System.out.println("***SubscriptedVariableCommand -> Name: " + str + " Args: " + id2 + " " +" Line: " + line + " " + result);
            			   	commandList.remove(id1);
            			   	commandList.add(result);
            		   	}
            	  	}
            	  	else if (id1!=null && id2==null){   		
            		 	result = id1;
            	  	}
            	  	else if (id1 == null && id2!=null){
            	   		result = id2;
            	  	}
            	  	else{
            	   		result = null;
            	  	}
            	  }
            	  else{
            	  	if(id1!=null && id2!=null){  		
            	     		// retrieve name	
            	   		if(id1.toString().matches("(.*)ClassVariableCommand(.*)")){
            	   			str = ((ClassVariableCommand)(id1)).getName();
            	   			//System.out.println("Debug-ClassVariable: " + str);
            	   		}
            	  		else if(id1.toString().matches("(.*)VariableCommand(.*)")){
            	   			str = ((VariableCommand)(id1)).getName();
            	   			//System.out.println("Debug-Variable: " + str);
            	   		}
            	  		else{
            	   			str = "";
            	  		}
            	  
            	  		//check name
            		  	if(str.equals("int"))
            		   		str = "int_casting";
            		  	else if (str.equals("long"))
            		   		str = "longInt_casting";
            		  	else if (str.equals("float"))
            		   		str = "float_casting";
            		  	else{
            		   		str = str;
            		  	}
            	  
            	  		// main part
            		  	if(id2 instanceof ArgumentsCommand){
            			   	result = new MethodCommand(str, id2, line);
            			   	((MethodCommand)(result)).setJoinArg(id3);
            			   	//System.out.println("*********Before Adding Method*******"+ getCommandList());
            			   	System.out.println("***MethodCommand -> Name: " + str + " Args: " + id2 + " Others: " + id3 +" Line: " + line + " " + result);
            			   	commandList.remove(id1);
            			   	commandList.add(result);
            			   	//System.out.println("*********After Adding Method*******"+ getCommandList());
            		   	}
            		   	else {
            			   	result = new SubscriptedVariableCommand(str, id2, line);
            			   	System.out.println("***SubscriptedVariableCommand -> Name: " + str + " Args: " + id2 + " " +" Line: " + line + " " + result);
            			   	commandList.remove(id1);
            			   	commandList.add(result);
            		   	}
            	  	}
            	  	else if (id1!=null && id2==null){   		
            		 	result = id1;
            	  	}
            	  	else if (id1 == null && id2!=null){
            	   		result = id2;
            	  	}
            	  	else{
            	   		result = null;
            	  	}

            	  }
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "power"



    // $ANTLR start "atom"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1032:1: atom returns [Command result] : ( ^( VARIABLE_CMD id1= NAME id3= test ) | ^( CLASSVARIABLE_CMD id1= DOTTED_NAME id3= test ) | ^( VALUETYPE type= INT_TYPE id1= INT id3= test ) | ^( VALUETYPE type= LONG_TYPE id1= LONGINT id3= test ) | ^( VALUETYPE type= DOUBLE_TYPE id1= FLOAT id3= test ) | ^( VALUETYPE type= STRING_TYPE id1= STRING (id2= string_argument )? ) | ^( INNER_BRANCH cmd= testlist_gexp ) | ^( LISTMAKER_CMD (cmd= listmaker )? ) | ^( DICTMAKER_CMD (cmd= dictmaker )? ) );
    public final Command atom() throws RecognitionException {
        Command result = null;


        CommonTree id1=null;
        CommonTree type=null;
        Command id3 =null;

        List id2 =null;

        Command cmd =null;



          CommonTree ahead = (CommonTree)input.LT(1);
          line = ahead.getToken().getLine();
          System.out.println("line = " + line);
          

        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1039:2: ( ^( VARIABLE_CMD id1= NAME id3= test ) | ^( CLASSVARIABLE_CMD id1= DOTTED_NAME id3= test ) | ^( VALUETYPE type= INT_TYPE id1= INT id3= test ) | ^( VALUETYPE type= LONG_TYPE id1= LONGINT id3= test ) | ^( VALUETYPE type= DOUBLE_TYPE id1= FLOAT id3= test ) | ^( VALUETYPE type= STRING_TYPE id1= STRING (id2= string_argument )? ) | ^( INNER_BRANCH cmd= testlist_gexp ) | ^( LISTMAKER_CMD (cmd= listmaker )? ) | ^( DICTMAKER_CMD (cmd= dictmaker )? ) )
            int alt53=9;
            switch ( input.LA(1) ) {
            case VARIABLE_CMD:
                {
                alt53=1;
                }
                break;
            case CLASSVARIABLE_CMD:
                {
                alt53=2;
                }
                break;
            case VALUETYPE:
                {
                int LA53_3 = input.LA(2);

                if ( (LA53_3==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case INT_TYPE:
                        {
                        alt53=3;
                        }
                        break;
                    case LONG_TYPE:
                        {
                        alt53=4;
                        }
                        break;
                    case DOUBLE_TYPE:
                        {
                        alt53=5;
                        }
                        break;
                    case STRING_TYPE:
                        {
                        alt53=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 7, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 3, input);

                    throw nvae;

                }
                }
                break;
            case INNER_BRANCH:
                {
                alt53=7;
                }
                break;
            case LISTMAKER_CMD:
                {
                alt53=8;
                }
                break;
            case DICTMAKER_CMD:
                {
                alt53=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1039:4: ^( VARIABLE_CMD id1= NAME id3= test )
                    {
                    match(input,VARIABLE_CMD,FOLLOW_VARIABLE_CMD_in_atom2763); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,NAME,FOLLOW_NAME_in_atom2767); 

                    pushFollow(FOLLOW_test_in_atom2771);
                    id3=test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    	  if((id1!=null?id1.getText():null).equals("range"))
                    	     result = null;
                    	  else{
                    	  	if(id3 == null){
                    		  result = new VariableCommand((id1!=null?id1.getText():null),line);
                    		  System.out.println("***Variable:"+(id1!=null?id1.getText():null)+" Line: "+ line + " " + result);
                    		  commandList.add(result);
                    		  //System.out.println("****** After Adding Variable *******" + getCommandList());
                    		  
                    		}
                    		else{
                    		  VariableCommand temp = new VariableCommand((id1!=null?id1.getText():null),line);
                    		  System.out.println("***Variable:"+(id1!=null?id1.getText():null)+" Line: "+ line + " " + temp);
                    		  commandList.add(temp);
                    		  
                    		  String op = "%";
                    		  result = new BinaryCommand(op, temp, id3, line);
                       		  System.out.println("Operator:"+op+" "+temp+" "+id3+" "+" Line: " + line + " " +result);
                       		  commandList.add(result);
                    		  
                    		}
                    	     }
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1063:4: ^( CLASSVARIABLE_CMD id1= DOTTED_NAME id3= test )
                    {
                    match(input,CLASSVARIABLE_CMD,FOLLOW_CLASSVARIABLE_CMD_in_atom2780); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,DOTTED_NAME,FOLLOW_DOTTED_NAME_in_atom2784); 

                    pushFollow(FOLLOW_test_in_atom2788);
                    id3=test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		if(id3 == null){
                    	     		result = new ClassVariableCommand((id1!=null?id1.getText():null), line);
                    	     		System.out.println("***ClassVariable:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                           	     		commandList.add(result);
                           	     	}
                           	     	else{
                           	     		ClassVariableCommand temp = new ClassVariableCommand((id1!=null?id1.getText():null),line);
                    		  	System.out.println("***ClassVariable:"+(id1!=null?id1.getText():null)+" Line: "+ line + " " + temp);
                    		  	commandList.add(temp);
                           	     		
                           	     		String op = "%";
                    		 	result = new BinaryCommand(op, temp, id3, line);
                       		  	System.out.println("Operator:"+op+" "+temp+" "+id3+" "+" Line: " + line + " " +result);
                       		  	commandList.add(result);
                           	     	
                           	     	
                           	     	}
                    	

                    }
                    break;
                case 3 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1082:4: ^( VALUETYPE type= INT_TYPE id1= INT id3= test )
                    {
                    match(input,VALUETYPE,FOLLOW_VALUETYPE_in_atom2797); 

                    match(input, Token.DOWN, null); 
                    type=(CommonTree)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_atom2801); 

                    id1=(CommonTree)match(input,INT,FOLLOW_INT_in_atom2805); 

                    pushFollow(FOLLOW_test_in_atom2809);
                    id3=test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		if(id3 == null){
                    			result = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), line);
                    			System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                    			commandList.add(result);
                    		}
                    		else{
                    			DatatypeCommand temp = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), line);
                    			System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                    			commandList.add(temp);
                    			
                    			String op = "%";
                    		 	result = new BinaryCommand(op, temp, id3, line);
                       		  	System.out.println("Operator:"+op+" "+temp+" "+id3+" "+" Line: " + line + " " +result);
                       		  	commandList.add(result);
                    			
                    		}
                    		//System.out.println("****** After Adding Integer Value *******" + getCommandList());
                    	

                    }
                    break;
                case 4 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1101:4: ^( VALUETYPE type= LONG_TYPE id1= LONGINT id3= test )
                    {
                    match(input,VALUETYPE,FOLLOW_VALUETYPE_in_atom2817); 

                    match(input, Token.DOWN, null); 
                    type=(CommonTree)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_atom2821); 

                    id1=(CommonTree)match(input,LONGINT,FOLLOW_LONGINT_in_atom2825); 

                    pushFollow(FOLLOW_test_in_atom2829);
                    id3=test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		if(id3 == null){
                    			result = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), line);
                    			System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                    			commandList.add(result);
                    		}
                    		else{
                    			DatatypeCommand temp = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), line);
                    			System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                    			commandList.add(temp);
                    			
                    			String op = "%";
                    		 	result = new BinaryCommand(op, temp, id3, line);
                       		  	System.out.println("Operator:"+op+" "+temp+" "+id3+" "+" Line: " + line + " " +result);
                       		  	commandList.add(result);
                    			
                    		}
                    	

                    }
                    break;
                case 5 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1119:4: ^( VALUETYPE type= DOUBLE_TYPE id1= FLOAT id3= test )
                    {
                    match(input,VALUETYPE,FOLLOW_VALUETYPE_in_atom2837); 

                    match(input, Token.DOWN, null); 
                    type=(CommonTree)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_atom2841); 

                    id1=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_atom2845); 

                    pushFollow(FOLLOW_test_in_atom2849);
                    id3=test();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		if(id3 == null){
                    			result = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), line);
                    			System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                    			commandList.add(result);
                    		}
                    		else{
                    			DatatypeCommand temp = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), line);
                    			System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                    			commandList.add(temp);
                    			
                    			String op = "%";
                    		 	result = new BinaryCommand(op, temp, id3, line);
                       		  	System.out.println("Operator:"+op+" "+temp+" "+id3+" "+" Line: " + line + " " +result);
                       		  	commandList.add(result);
                    			
                    		}
                    	

                    }
                    break;
                case 6 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1137:4: ^( VALUETYPE type= STRING_TYPE id1= STRING (id2= string_argument )? )
                    {
                    match(input,VALUETYPE,FOLLOW_VALUETYPE_in_atom2857); 

                    match(input, Token.DOWN, null); 
                    type=(CommonTree)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_atom2861); 

                    id1=(CommonTree)match(input,STRING,FOLLOW_STRING_in_atom2865); 

                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1137:47: (id2= string_argument )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ARGUMENTS) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1137:47: id2= string_argument
                            {
                            pushFollow(FOLLOW_string_argument_in_atom2869);
                            id2=string_argument();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                    	  	if(id2 == null){
                    		  result = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), line);
                    		  System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+" Line: "+ line + " " +result);
                    		  commandList.add(result);
                    		  }
                    		else{
                    		  result = new DatatypeCommand((type!=null?type.getText():null),(id1!=null?id1.getText():null), id2, line);
                          		  System.out.println("***Value:"+(id1!=null?id1.getText():null)+" "+id2 + " " +" Line: "+ line + " " + result);
                          		  commandList.add(result);
                          		  System.out.println(commandList.toString());
                          		  //remove arguments as commands
                          		  /*
                          		  Iterator<Command> cit = id2.iterator();
                          		  while(cit.hasNext())
                      			commandList.remove(cit.next());
                      		  */
                      		  }  		  
                          		  
                    	

                    }
                    break;
                case 7 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1157:4: ^( INNER_BRANCH cmd= testlist_gexp )
                    {
                    match(input,INNER_BRANCH,FOLLOW_INNER_BRANCH_in_atom2878); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_testlist_gexp_in_atom2882);
                    cmd=testlist_gexp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    result = cmd;

                    }
                    break;
                case 8 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1158:4: ^( LISTMAKER_CMD (cmd= listmaker )? )
                    {
                    match(input,LISTMAKER_CMD,FOLLOW_LISTMAKER_CMD_in_atom2891); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1158:23: (cmd= listmaker )?
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==LISTCOMPREHENSION_CMD) ) {
                            alt51=1;
                        }
                        switch (alt51) {
                            case 1 :
                                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1158:23: cmd= listmaker
                                {
                                pushFollow(FOLLOW_listmaker_in_atom2895);
                                cmd=listmaker();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }



                            
                              result = cmd;
                      

                    }
                    break;
                case 9 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1162:5: ^( DICTMAKER_CMD (cmd= dictmaker )? )
                    {
                    match(input,DICTMAKER_CMD,FOLLOW_DICTMAKER_CMD_in_atom2906); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1162:24: (cmd= dictmaker )?
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==DICTIONARY_CMD) ) {
                            alt52=1;
                        }
                        switch (alt52) {
                            case 1 :
                                // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1162:24: cmd= dictmaker
                                {
                                pushFollow(FOLLOW_dictmaker_in_atom2910);
                                cmd=dictmaker();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }



                            if(cmd == null)
                              result = null;
                            else
                              result = cmd;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "atom"



    // $ANTLR start "string_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1170:1: string_argument returns [List result] : cmd= arglist ;
    public final List string_argument() throws RecognitionException {
        List result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1171:2: (cmd= arglist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1171:4: cmd= arglist
            {
            pushFollow(FOLLOW_arglist_in_string_argument2931);
            cmd=arglist();

            state._fsp--;


             result = cmd;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "string_argument"



    // $ANTLR start "listmaker"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1174:1: listmaker returns [Command result] : ^( LISTCOMPREHENSION_CMD id1= list_arguments (id2= list_for )? ) ;
    public final Command listmaker() throws RecognitionException {
        Command result = null;


        List id1 =null;

        Command id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1175:11: ( ^( LISTCOMPREHENSION_CMD id1= list_arguments (id2= list_for )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1175:13: ^( LISTCOMPREHENSION_CMD id1= list_arguments (id2= list_for )? )
            {
            match(input,LISTCOMPREHENSION_CMD,FOLLOW_LISTCOMPREHENSION_CMD_in_listmaker2959); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_list_arguments_in_listmaker2963);
            id1=list_arguments();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1175:59: (id2= list_for )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LISTLOOPCONTROL_CMD) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1175:59: id2= list_for
                    {
                    pushFollow(FOLLOW_list_for_in_listmaker2967);
                    id2=list_for();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



                      	if(id2!=null){
                         		result = new ListComprehensionCommand(id1, id2, line);
                         		System.out.println("***ListComprehension -> Arguments: " + id1 + " " + id2 + " " + "Line: " + line + " " +result);
                         		commandList.add(result);
                         	}
                         	else{
                         		result = new ListComprehensionCommand(id1, line);
                         		System.out.println("***ListComprehension -> Arguments: " + id1 + " " + "Line: " + line + " " +result);
                         		commandList.add(result);
                         	}
                      

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "listmaker"


    protected static class list_arguments_scope {
        List current;
    }
    protected Stack list_arguments_stack = new Stack();



    // $ANTLR start "list_arguments"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1189:1: list_arguments returns [List result] : ^( LIST_ARGS ( list_argument )+ ) ;
    public final List list_arguments() throws RecognitionException {
        list_arguments_stack.push(new list_arguments_scope());
        List result = null;


        ((list_arguments_scope)list_arguments_stack.peek()).current = new ArrayList<Command>();
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1192:3: ( ^( LIST_ARGS ( list_argument )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1192:5: ^( LIST_ARGS ( list_argument )+ )
            {
            match(input,LIST_ARGS,FOLLOW_LIST_ARGS_in_list_arguments3003); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1192:17: ( list_argument )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0 >= ALT_NOTEQUAL && LA55_0 <= AMPER)||LA55_0==AND||LA55_0==CIRCUMFLEX||LA55_0==DOUBLESLASH||LA55_0==DOUBLESTAR||LA55_0==EQUAL||LA55_0==EXPRESSION||(LA55_0 >= GREATER && LA55_0 <= GREATEREQUAL)||LA55_0==IN||(LA55_0 >= IS && LA55_0 <= ISNOT)||LA55_0==LEFTSHIFT||(LA55_0 >= LESS && LA55_0 <= LESSEQUAL)||LA55_0==MINUS||(LA55_0 >= NOT && LA55_0 <= NOTIN)||LA55_0==OR||LA55_0==PLUS||LA55_0==RIGHTSHIFT||LA55_0==SLASH||LA55_0==STAR||LA55_0==UNARY_EXPRESSION||LA55_0==VBAR) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1192:17: list_argument
            	    {
            	    pushFollow(FOLLOW_list_argument_in_list_arguments3005);
            	    list_argument();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            match(input, Token.UP, null); 



                  result = ((list_arguments_scope)list_arguments_stack.peek()).current;
                  System.out.println("List:"+result);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            list_arguments_stack.pop();
        }
        return result;
    }
    // $ANTLR end "list_arguments"



    // $ANTLR start "list_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1198:1: list_argument : cmd= testlist ;
    public final void list_argument() throws RecognitionException {
        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1199:5: (cmd= testlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1199:7: cmd= testlist
            {
            pushFollow(FOLLOW_testlist_in_list_argument3027);
            cmd=testlist();

            state._fsp--;


            ((list_arguments_scope)list_arguments_stack.peek()).current.add(cmd); commandList.remove(cmd);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "list_argument"



    // $ANTLR start "dictmaker"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1202:1: dictmaker returns [Command result] : ^( DICTIONARY_CMD cmd= dict_arguments ) ;
    public final Command dictmaker() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1203:5: ( ^( DICTIONARY_CMD cmd= dict_arguments ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1203:7: ^( DICTIONARY_CMD cmd= dict_arguments )
            {
            match(input,DICTIONARY_CMD,FOLLOW_DICTIONARY_CMD_in_dictmaker3050); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dict_arguments_in_dictmaker3054);
            cmd=dict_arguments();

            state._fsp--;


            match(input, Token.UP, null); 



                    result = new DictComprehensionCommand(cmd, line);
                    System.out.println("***DictComprehension -> Arguments: " + cmd + " " + "Line: " + line + " " +result);
                    commandList.add(result);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "dictmaker"


    protected static class dict_arguments_scope {
        List current;
    }
    protected Stack dict_arguments_stack = new Stack();



    // $ANTLR start "dict_arguments"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1210:1: dict_arguments returns [List result] : ^( DICT_ARGS ( dict_argument )+ ) ;
    public final List dict_arguments() throws RecognitionException {
        dict_arguments_stack.push(new dict_arguments_scope());
        List result = null;


        ((dict_arguments_scope)dict_arguments_stack.peek()).current = new ArrayList<Command>();
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1213:3: ( ^( DICT_ARGS ( dict_argument )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1213:5: ^( DICT_ARGS ( dict_argument )+ )
            {
            match(input,DICT_ARGS,FOLLOW_DICT_ARGS_in_dict_arguments3095); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1213:17: ( dict_argument )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0 >= ALT_NOTEQUAL && LA56_0 <= AMPER)||LA56_0==AND||LA56_0==CIRCUMFLEX||LA56_0==DOUBLESLASH||LA56_0==DOUBLESTAR||LA56_0==EQUAL||LA56_0==EXPRESSION||(LA56_0 >= GREATER && LA56_0 <= GREATEREQUAL)||LA56_0==IN||(LA56_0 >= IS && LA56_0 <= ISNOT)||LA56_0==LEFTSHIFT||(LA56_0 >= LESS && LA56_0 <= LESSEQUAL)||LA56_0==MINUS||(LA56_0 >= NOT && LA56_0 <= NOTIN)||LA56_0==OR||LA56_0==PLUS||LA56_0==RIGHTSHIFT||LA56_0==SLASH||LA56_0==STAR||LA56_0==UNARY_EXPRESSION||LA56_0==VBAR) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1213:17: dict_argument
            	    {
            	    pushFollow(FOLLOW_dict_argument_in_dict_arguments3097);
            	    dict_argument();

            	    state._fsp--;


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


            match(input, Token.UP, null); 



                  result = ((dict_arguments_scope)dict_arguments_stack.peek()).current;
                  System.out.println("Dictionary List:"+result);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            dict_arguments_stack.pop();
        }
        return result;
    }
    // $ANTLR end "dict_arguments"



    // $ANTLR start "dict_argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1219:1: dict_argument : cmd= testlist ;
    public final void dict_argument() throws RecognitionException {
        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1220:5: (cmd= testlist )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1220:7: cmd= testlist
            {
            pushFollow(FOLLOW_testlist_in_dict_argument3119);
            cmd=testlist();

            state._fsp--;


            ((dict_arguments_scope)dict_arguments_stack.peek()).current.add(cmd); commandList.remove(cmd);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dict_argument"



    // $ANTLR start "testlist_gexp"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1223:1: testlist_gexp returns [Command result] : cmd= test ( ( options {k=2; } : test )* ) ;
    public final Command testlist_gexp() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1224:5: (cmd= test ( ( options {k=2; } : test )* ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1224:7: cmd= test ( ( options {k=2; } : test )* )
            {
            pushFollow(FOLLOW_test_in_testlist_gexp3143);
            cmd=test();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1224:16: ( ( options {k=2; } : test )* )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1224:18: ( options {k=2; } : test )*
            {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1224:18: ( options {k=2; } : test )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0 >= ALT_NOTEQUAL && LA57_0 <= AMPER)||LA57_0==AND||LA57_0==CIRCUMFLEX||LA57_0==DOUBLESLASH||LA57_0==DOUBLESTAR||LA57_0==EQUAL||LA57_0==EXPRESSION||(LA57_0 >= GREATER && LA57_0 <= GREATEREQUAL)||LA57_0==IN||(LA57_0 >= IS && LA57_0 <= ISNOT)||LA57_0==LEFTSHIFT||(LA57_0 >= LESS && LA57_0 <= LESSEQUAL)||LA57_0==MINUS||(LA57_0 >= NOT && LA57_0 <= NOTIN)||LA57_0==OR||LA57_0==PLUS||LA57_0==RIGHTSHIFT||LA57_0==SLASH||LA57_0==STAR||LA57_0==UNARY_EXPRESSION||LA57_0==VBAR) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1224:35: test
            	    {
            	    pushFollow(FOLLOW_test_in_testlist_gexp3156);
            	    test();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }



                result = cmd;
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "testlist_gexp"



    // $ANTLR start "trailer"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1252:1: trailer returns [Command result] : (cmd1= inner_trailer |cmd2= inner_subscript );
    public final Command trailer() throws RecognitionException {
        Command result = null;


        Command cmd1 =null;

        List cmd2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1253:2: (cmd1= inner_trailer |cmd2= inner_subscript )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==TRAILER) ) {
                alt58=1;
            }
            else if ( (LA58_0==SUBSCRIPTLISTS) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1253:4: cmd1= inner_trailer
                    {
                    pushFollow(FOLLOW_inner_trailer_in_trailer3191);
                    cmd1=inner_trailer();

                    state._fsp--;



                    		result = cmd1;
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1256:4: cmd2= inner_subscript
                    {
                    pushFollow(FOLLOW_inner_subscript_in_trailer3199);
                    cmd2=inner_subscript();

                    state._fsp--;



                              	result = new SubscriptsCommand(cmd2, line);
                              	System.out.println("***SubscriptsCommand -> Arguments"+ cmd2 + " Line: "+line+ " " + result);     
                              	//result = cmd2;
                              

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "trailer"



    // $ANTLR start "inner_trailer"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1263:1: inner_trailer returns [Command result] : ( ^( TRAILER cmd= arglist ) | ^( TRAILER NO_ARGS ) );
    public final Command inner_trailer() throws RecognitionException {
        Command result = null;


        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1264:2: ( ^( TRAILER cmd= arglist ) | ^( TRAILER NO_ARGS ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==TRAILER) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==DOWN) ) {
                    int LA59_2 = input.LA(3);

                    if ( (LA59_2==NO_ARGS) ) {
                        alt59=2;
                    }
                    else if ( (LA59_2==ARGUMENTS) ) {
                        alt59=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1264:4: ^( TRAILER cmd= arglist )
                    {
                    match(input,TRAILER,FOLLOW_TRAILER_in_inner_trailer3232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arglist_in_inner_trailer3236);
                    cmd=arglist();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    		result = new ArgumentsCommand(cmd, line);
                            	 System.out.println("Arguments:"+cmd+" "+" Line: " + line + " " +result);
                            	 commandList.add(result);
                            	 //System.out.println("******* After Adding Arguments ******* " + getCommandList());
                    	

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1270:4: ^( TRAILER NO_ARGS )
                    {
                    match(input,TRAILER,FOLLOW_TRAILER_in_inner_trailer3244); 

                    match(input, Token.DOWN, null); 
                    match(input,NO_ARGS,FOLLOW_NO_ARGS_in_inner_trailer3246); 

                    match(input, Token.UP, null); 



                    		 result = new ArgumentsCommand(line);
                            	 System.out.println("Empty Arguments: ... "+" Line: " + line + " " +result);
                            	 commandList.add(result);
                            	 //System.out.println("******* After Adding Empty Arguments ******* " + getCommandList());
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "inner_trailer"


    protected static class inner_subscript_scope {
        List current;
    }
    protected Stack inner_subscript_stack = new Stack();



    // $ANTLR start "inner_subscript"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1278:1: inner_subscript returns [List result] : ^( SUBSCRIPTLISTS (cmd= subscriptlist_outer )+ ) ;
    public final List inner_subscript() throws RecognitionException {
        inner_subscript_stack.push(new inner_subscript_scope());
        List result = null;


        ((inner_subscript_scope)inner_subscript_stack.peek()).current = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1281:2: ( ^( SUBSCRIPTLISTS (cmd= subscriptlist_outer )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1281:4: ^( SUBSCRIPTLISTS (cmd= subscriptlist_outer )+ )
            {
            match(input,SUBSCRIPTLISTS,FOLLOW_SUBSCRIPTLISTS_in_inner_subscript3273); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1281:24: (cmd= subscriptlist_outer )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==SUBSCRIPTLIST) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1281:24: cmd= subscriptlist_outer
            	    {
            	    pushFollow(FOLLOW_subscriptlist_outer_in_inner_subscript3277);
            	    subscriptlist_outer();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);


            match(input, Token.UP, null); 



            		result = ((inner_subscript_scope)inner_subscript_stack.peek()).current ;
            		//System.out.println("***SubscriptsCommand -> Arguments"+ ((inner_subscript_scope)inner_subscript_stack.peek()).current + " Line: "+line+ " " + result);  
            		System.out.println("Current Inner Subscript List:"+((inner_subscript_scope)inner_subscript_stack.peek()).current);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            inner_subscript_stack.pop();
        }
        return result;
    }
    // $ANTLR end "inner_subscript"



    // $ANTLR start "subscriptlist_outer"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1289:1: subscriptlist_outer : ^( SUBSCRIPTLIST cmd= subscriptlist ) ;
    public final void subscriptlist_outer() throws RecognitionException {
        List cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1290:2: ( ^( SUBSCRIPTLIST cmd= subscriptlist ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1290:4: ^( SUBSCRIPTLIST cmd= subscriptlist )
            {
            match(input,SUBSCRIPTLIST,FOLLOW_SUBSCRIPTLIST_in_subscriptlist_outer3293); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subscriptlist_in_subscriptlist_outer3297);
            cmd=subscriptlist();

            state._fsp--;


            match(input, Token.UP, null); 



            		
            		SubscriptIndexCommand temp = new SubscriptIndexCommand(cmd,line);
            		System.out.println("Subscript Index:"+cmd+" "+" Line: " + line + " " +temp);
            		((inner_subscript_scope)inner_subscript_stack.peek()).current.add(temp);
            		
            		System.out.println("Inner Subscript List:"+((inner_subscript_scope)inner_subscript_stack.peek()).current);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "subscriptlist_outer"


    protected static class subscriptlist_scope {
        List current;
    }
    protected Stack subscriptlist_stack = new Stack();



    // $ANTLR start "subscriptlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1301:1: subscriptlist returns [List result] : ^( SUBSCRIPTS (cmd= subscript )+ ) ;
    public final List subscriptlist() throws RecognitionException {
        subscriptlist_stack.push(new subscriptlist_scope());
        List result = null;


        ((subscriptlist_scope)subscriptlist_stack.peek()).current = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1304:2: ( ^( SUBSCRIPTS (cmd= subscript )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1304:4: ^( SUBSCRIPTS (cmd= subscript )+ )
            {
            match(input,SUBSCRIPTS,FOLLOW_SUBSCRIPTS_in_subscriptlist3324); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1304:20: (cmd= subscript )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0 >= ALT_NOTEQUAL && LA61_0 <= AMPER)||LA61_0==AND||LA61_0==CIRCUMFLEX||LA61_0==DOUBLESLASH||LA61_0==DOUBLESTAR||LA61_0==EQUAL||LA61_0==EXPRESSION||(LA61_0 >= GREATER && LA61_0 <= GREATEREQUAL)||LA61_0==IN||(LA61_0 >= IS && LA61_0 <= ISNOT)||LA61_0==LEFTSHIFT||(LA61_0 >= LESS && LA61_0 <= LESSEQUAL)||LA61_0==MINUS||(LA61_0 >= NOT && LA61_0 <= NOTIN)||LA61_0==OR||LA61_0==PLUS||LA61_0==RIGHTSHIFT||LA61_0==SLASH||LA61_0==STAR||LA61_0==UNARY_EXPRESSION||LA61_0==VBAR) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1304:20: cmd= subscript
            	    {
            	    pushFollow(FOLLOW_subscript_in_subscriptlist3328);
            	    subscript();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);


            match(input, Token.UP, null); 



            		result = ((subscriptlist_scope)subscriptlist_stack.peek()).current;
            		System.out.println("Current Subscript List:"+((subscriptlist_scope)subscriptlist_stack.peek()).current);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            subscriptlist_stack.pop();
        }
        return result;
    }
    // $ANTLR end "subscriptlist"



    // $ANTLR start "subscript"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1310:1: subscript : cmd= test ;
    public final void subscript() throws RecognitionException {
        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1311:2: (cmd= test )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1312:2: cmd= test
            {
            pushFollow(FOLLOW_test_in_subscript3353);
            cmd=test();

            state._fsp--;



                    	((subscriptlist_scope)subscriptlist_stack.peek()).current.add(cmd);
                    	//commandList.remove(cmd);
            		System.out.println("Subscript List:"+((subscriptlist_scope)subscriptlist_stack.peek()).current);
            		
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "subscript"



    // $ANTLR start "exprlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1320:1: exprlist returns [Command result] : cmd= expr ;
    public final Command exprlist() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1321:3: (cmd= expr )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1321:5: cmd= expr
            {
            pushFollow(FOLLOW_expr_in_exprlist3380);
            cmd=expr();

            state._fsp--;



                result = cmd;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "exprlist"



    // $ANTLR start "testlist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1326:1: testlist returns [Command result] : cmd= test ;
    public final Command testlist() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1327:5: (cmd= test )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1327:7: cmd= test
            {
            pushFollow(FOLLOW_test_in_testlist3404);
            cmd=test();

            state._fsp--;



                  result = cmd;
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "testlist"



    // $ANTLR start "classdef"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1332:1: classdef returns [Command result] : ^( CLASS_CMD id1= NAME id2= suite (id3= testlist )? ) ;
    public final Command classdef() throws RecognitionException {
        Command result = null;


        CommonTree id1=null;
        List id2 =null;

        Command id3 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1333:5: ( ^( CLASS_CMD id1= NAME id2= suite (id3= testlist )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1333:7: ^( CLASS_CMD id1= NAME id2= suite (id3= testlist )? )
            {
            match(input,CLASS_CMD,FOLLOW_CLASS_CMD_in_classdef3429); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,NAME,FOLLOW_NAME_in_classdef3433); 

            pushFollow(FOLLOW_suite_in_classdef3437);
            id2=suite();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1333:41: (id3= testlist )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0 >= ALT_NOTEQUAL && LA62_0 <= AMPER)||LA62_0==AND||LA62_0==CIRCUMFLEX||LA62_0==DOUBLESLASH||LA62_0==DOUBLESTAR||LA62_0==EQUAL||LA62_0==EXPRESSION||(LA62_0 >= GREATER && LA62_0 <= GREATEREQUAL)||LA62_0==IN||(LA62_0 >= IS && LA62_0 <= ISNOT)||LA62_0==LEFTSHIFT||(LA62_0 >= LESS && LA62_0 <= LESSEQUAL)||LA62_0==MINUS||(LA62_0 >= NOT && LA62_0 <= NOTIN)||LA62_0==OR||LA62_0==PLUS||LA62_0==RIGHTSHIFT||LA62_0==SLASH||LA62_0==STAR||LA62_0==UNARY_EXPRESSION||LA62_0==VBAR) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1333:41: id3= testlist
                    {
                    pushFollow(FOLLOW_testlist_in_classdef3441);
                    id3=testlist();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



                    if(id3!=null){
                      result = new ClassDefinitionCommand((id1!=null?id1.getText():null), id2, id3, line);
                      
                      int start = ((ClassDefinitionCommand)(result)).findStartLine();
                      ((ClassDefinitionCommand)(result)).setStartLine(start);
                    		
                      System.out.println("***ClassDefinitionCommand -> " + (id1!=null?id1.getText():null) + " " + id2 + " " + id3 + " Start: " + ((ClassDefinitionCommand)(result)).getStartLine() + " End: " + ((ClassDefinitionCommand)(result)).getEndLine() + " " + result );
                      commandList.add(result);
                      classList.add(result);
                    }
                    else {
                      result = new ClassDefinitionCommand((id1!=null?id1.getText():null), id2, line);
                      
                      int start = ((ClassDefinitionCommand)(result)).findStartLine();
                      ((ClassDefinitionCommand)(result)).setStartLine(start);
                      
                      System.out.println("***ClassDefinitionCommand -> " + (id1!=null?id1.getText():null) + " " + id2 + " Start: " + ((ClassDefinitionCommand)(result)).getStartLine() + " End: " + ((ClassDefinitionCommand)(result)).getEndLine() + " " + result );
                      commandList.add(result);
                      classList.add(result);
                    }
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "classdef"


    protected static class arglist_scope {
        List current;
    }
    protected Stack arglist_stack = new Stack();



    // $ANTLR start "arglist"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1357:1: arglist returns [List result] : ^( ARGUMENTS ( argument )+ ) ;
    public final List arglist() throws RecognitionException {
        arglist_stack.push(new arglist_scope());
        List result = null;


        ((arglist_scope)arglist_stack.peek()).current = new ArrayList<Command>(); 
        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1360:2: ( ^( ARGUMENTS ( argument )+ ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1360:5: ^( ARGUMENTS ( argument )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_arglist3475); 

            match(input, Token.DOWN, null); 
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1360:17: ( argument )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0 >= ALT_NOTEQUAL && LA63_0 <= AND)||LA63_0==ASSIGN||(LA63_0 >= CIRCUMFLEX && LA63_0 <= CIRCUMFLEXEQUAL)||(LA63_0 >= DOUBLESLASH && LA63_0 <= DOUBLESTAREQUAL)||LA63_0==EQUAL||LA63_0==EXPRESSION||(LA63_0 >= GREATER && LA63_0 <= GREATEREQUAL)||LA63_0==IN||(LA63_0 >= IS && LA63_0 <= ISNOT)||(LA63_0 >= LEFTSHIFT && LA63_0 <= LESSEQUAL)||(LA63_0 >= MINUS && LA63_0 <= MINUSEQUAL)||(LA63_0 >= NOT && LA63_0 <= NOTIN)||LA63_0==OR||(LA63_0 >= PERCENTEQUAL && LA63_0 <= PLUSEQUAL)||(LA63_0 >= RIGHTSHIFT && LA63_0 <= RIGHTSHIFTEQUAL)||(LA63_0 >= SLASH && LA63_0 <= STAREQUAL)||LA63_0==UNARY_EXPRESSION||(LA63_0 >= VBAR && LA63_0 <= VBAREQUAL)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1360:17: argument
            	    {
            	    pushFollow(FOLLOW_argument_in_arglist3477);
            	    argument();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            match(input, Token.UP, null); 


             
            		result = ((arglist_scope)arglist_stack.peek()).current; 
            		System.out.println("List:"+result);
            		
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            arglist_stack.pop();
        }
        return result;
    }
    // $ANTLR end "arglist"



    // $ANTLR start "argument"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1367:1: argument : cmd= expr_stmt ;
    public final void argument() throws RecognitionException {
        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1367:10: (cmd= expr_stmt )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1367:12: cmd= expr_stmt
            {
            pushFollow(FOLLOW_expr_stmt_in_argument3494);
            cmd=expr_stmt();

            state._fsp--;



            		((arglist_scope)arglist_stack.peek()).current.add(cmd);
            		System.out.println("Current List:"+((arglist_scope)arglist_stack.peek()).current);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argument"



    // $ANTLR start "list_iter"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1373:1: list_iter returns [Command result] : (cmd= list_for |cmd= list_if );
    public final Command list_iter() throws RecognitionException {
        Command result = null;


        Command cmd =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1374:2: (cmd= list_for |cmd= list_if )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LISTLOOPCONTROL_CMD) ) {
                alt64=1;
            }
            else if ( (LA64_0==LISTCONDITION_CMD) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1374:4: cmd= list_for
                    {
                    pushFollow(FOLLOW_list_for_in_list_iter3514);
                    cmd=list_for();

                    state._fsp--;


                    result = cmd;

                    }
                    break;
                case 2 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1375:5: cmd= list_if
                    {
                    pushFollow(FOLLOW_list_if_in_list_iter3524);
                    cmd=list_if();

                    state._fsp--;


                    result = cmd;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "list_iter"



    // $ANTLR start "list_for"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1378:1: list_for returns [Command result] : ^( LISTLOOPCONTROL_CMD id1= exprlist id2= testlist (id3= list_iter )? ) ;
    public final Command list_for() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        Command id2 =null;

        Command id3 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1379:11: ( ^( LISTLOOPCONTROL_CMD id1= exprlist id2= testlist (id3= list_iter )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1379:13: ^( LISTLOOPCONTROL_CMD id1= exprlist id2= testlist (id3= list_iter )? )
            {
            match(input,LISTLOOPCONTROL_CMD,FOLLOW_LISTLOOPCONTROL_CMD_in_list_for3558); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_exprlist_in_list_for3562);
            id1=exprlist();

            state._fsp--;


            pushFollow(FOLLOW_testlist_in_list_for3566);
            id2=testlist();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1379:64: (id3= list_iter )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0 >= LISTCONDITION_CMD && LA65_0 <= LISTLOOPCONTROL_CMD)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1379:64: id3= list_iter
                    {
                    pushFollow(FOLLOW_list_iter_in_list_for3570);
                    id3=list_iter();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



                      	if(id3!=null){
                      		result = new ListLoopControlCommand(id1, id2, id3, line);
                      		System.out.println("***ListLoopControl -> Args: " + id1 +" "+id2+" "+id3 + " "+"Line: " + line + " " +result);
                      		commandList.add(result);
                      	}
                      	else
                      		{
                      		result = new ListLoopControlCommand(id1, id2, line);
                      		System.out.println("***ListLoopControl -> Args: " + id1 +" "+id2+ " "+"Line: " + line + " " +result);
                      		commandList.add(result);
                      	}
                      

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "list_for"



    // $ANTLR start "list_if"
    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1394:1: list_if returns [Command result] : ^( LISTCONDITION_CMD id1= test (id2= list_iter )? ) ;
    public final Command list_if() throws RecognitionException {
        Command result = null;


        Command id1 =null;

        Command id2 =null;


        try {
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1395:2: ( ^( LISTCONDITION_CMD id1= test (id2= list_iter )? ) )
            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1395:4: ^( LISTCONDITION_CMD id1= test (id2= list_iter )? )
            {
            match(input,LISTCONDITION_CMD,FOLLOW_LISTCONDITION_CMD_in_list_if3597); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_test_in_list_if3601);
            id1=test();

            state._fsp--;


            // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1395:36: (id2= list_iter )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0 >= LISTCONDITION_CMD && LA66_0 <= LISTLOOPCONTROL_CMD)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\PythonProvenanceTree.g:1395:36: id2= list_iter
                    {
                    pushFollow(FOLLOW_list_iter_in_list_if3605);
                    id2=list_iter();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



            		result = new ListConditionCommand (id1, id2, line);
                      	System.out.println("***ListCondition -> Args: " + id1 +" "+id2+" "+ " "+"Line: " + line + " " +result);
                      	commandList.add(result);
                      

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "list_if"

    // Delegated rules


 

    public static final BitSet FOLLOW_simple_stmt_in_single_input48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_single_input66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_file_input90 = new BitSet(new long[]{0x1852E243C002C4F2L,0x139401E72757300FL});
    public static final BitSet FOLLOW_testlist_in_eval_input118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decorator_in_decorators140 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_AT_in_decorator159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_dotted_attr_in_decorator161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_LPAREN_in_decorator164 = new BitSet(new long[]{0x0000000000000100L,0x0000000800000000L});
    public static final BitSet FOLLOW_arglist_in_decorator166 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_RPAREN_in_decorator169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_NEWLINE_in_decorator173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_dotted_attr195 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_DOT_in_dotted_attr198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_dotted_attr200 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_OUTER_FUNCTION_CMD_in_funcdef221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_funcdef225 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_parameters_in_funcdef229 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_funcdef233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varargslist_in_parameters261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUTER_FUNCTION_ARGS_in_varargslist295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_defparameter_in_varargslist297 = new BitSet(new long[]{0x1840C241400040B8L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_defparameter321 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ASSIGN_in_defparameter324 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_defparameter326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_stmt_in_stmt348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_small_stmt_in_simple_stmt378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_stmt_in_small_stmt405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_small_stmt419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_stmt_in_small_stmt433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_stmt_in_small_stmt446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_CMD_in_print_stmt472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_printlist_in_print_stmt476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_ARGS_in_printlist518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_print_argument_in_printlist520 = new BitSet(new long[]{0x1840C241400040B8L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_print_argument537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_name_in_import_stmt559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_from_in_import_stmt569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_from_name_in_import_from589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_from_dotted_name_in_import_from598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_CMD_in_import_from_name617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_import_from_name621 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_import_as_names_in_import_from_name625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_CMD_in_import_from_name633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_import_from_name637 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_STAR_in_import_from_name641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_CMD_in_import_from_dotted_name660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_import_from_dotted_name664 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_import_as_names_in_import_from_dotted_name668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_CMD_in_import_from_dotted_name676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_import_from_dotted_name680 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_STAR_in_import_from_dotted_name684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_ARGS_in_import_as_names717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_import_as_name_in_import_as_names719 = new BitSet(new long[]{0x0020000000000008L});
    public static final BitSet FOLLOW_IMPORT_EQUIV_in_import_as_name742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_import_as_name746 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_import_as_name750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_EQUIV_in_import_as_name760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_import_as_name764 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_import_as_name768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_ARGS_in_dotted_as_names802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dotted_as_name_in_dotted_as_names804 = new BitSet(new long[]{0x0020000000000008L});
    public static final BitSet FOLLOW_IMPORT_EQUIV_in_dotted_as_name822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_dotted_as_name826 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_dotted_as_name830 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_EQUIV_in_dotted_as_name840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_dotted_as_name844 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_dotted_as_name848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_CMD_in_import_name869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dotted_as_names_in_import_name873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_stmt899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt903 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUSEQUAL_in_expr_stmt918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt922 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUSEQUAL_in_expr_stmt937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt941 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAREQUAL_in_expr_stmt956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt960 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt964 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASHEQUAL_in_expr_stmt975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt979 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PERCENTEQUAL_in_expr_stmt994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt998 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AMPEREQUAL_in_expr_stmt1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1017 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VBAREQUAL_in_expr_stmt1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1036 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CIRCUMFLEXEQUAL_in_expr_stmt1051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1055 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFTSHIFTEQUAL_in_expr_stmt1070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1074 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1078 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHTSHIFTEQUAL_in_expr_stmt1089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1093 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLESTAREQUAL_in_expr_stmt1108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1112 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLESLASHEQUAL_in_expr_stmt1127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1131 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_testlist_in_expr_stmt1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_flow_stmt1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_CMD_in_return_stmt1182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arglist_in_return_stmt1186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_if_stmt_in_compound_stmt1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_compound_stmt1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_compound_stmt1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_stmt_in_compound_stmt1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcdef_in_compound_stmt1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classdef_in_compound_stmt1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_stmt_in_compound_stmt1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFBLOCK_in_if_stmt1383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_if_clause_in_if_stmt1387 = new BitSet(new long[]{0x0000002800000008L});
    public static final BitSet FOLLOW_elif_clauses_in_if_stmt1391 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_else_clause_in_if_stmt1396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_CMD_in_if_clause1430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_if_clause1434 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_if_clause1438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELIF_CLAUSES_in_elif_clauses1464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elif_clause_in_elif_clauses1466 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_ELIF_CMD_in_elif_clause1483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_elif_clause1487 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_elif_clause1491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_CMD_in_else_clause1518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_suite_in_else_clause1522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILEBLOCK_in_while_stmt1542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_while_clause_in_while_stmt1546 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_else_clause_in_while_stmt1550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_CMD_in_while_clause1573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_while_clause1577 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_while_clause1581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORLOOP_CMD_in_for_stmt1601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprlist_in_for_stmt1605 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_for_stmt1609 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_for_stmt1613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRYBLOCK_in_try_stmt1636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_try_clause_in_try_stmt1640 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_except_clause_in_try_stmt1644 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_finally_clause_in_try_stmt1648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_CMD_in_try_clause1671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_suite_in_try_clause1675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXCEPT_CMD_in_except_clause1697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_trailer_in_except_clause1701 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_except_clause1706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINALLY_CMD_in_finally_clause1727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_suite_in_finally_clause1731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WITH_CMD_in_with_stmt1749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_with_clause_in_with_stmt1753 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_with_stmt1757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WITH_ARGS_in_with_clause1797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_with_item_in_with_clause1799 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_WITH_EQUIV_in_with_item1822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_with_item1826 = new BitSet(new long[]{0x1840C241400040B8L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_with_item1830 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDENT_in_suite1860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_inside_block_in_suite1862 = new BitSet(new long[]{0x1852E243C002C4F8L,0x139401E72757300FL});
    public static final BitSet FOLLOW_simple_stmt_in_stmt_inside_block1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt_inside_block1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_test_in_test1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_or_test1942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_or_test_in_or_test1946 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_or_test_in_or_test1950 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_and_test_in_or_test1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_and_test1985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_and_test_in_and_test1989 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20207100DL});
    public static final BitSet FOLLOW_and_test_in_and_test1993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_not_test_in_and_test2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_not_test2027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_not_test_in_not_test2031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_comparison_in_not_test2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_comparison2062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2066 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_in_comparison2082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2086 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_comparison2102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2106 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_comparison2122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2126 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESSEQUAL_in_comparison2142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2146 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALT_NOTEQUAL_in_comparison2162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2166 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTEQUAL_in_comparison2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2186 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_comparison2202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2206 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTIN_in_comparison2222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2226 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_in_comparison2242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2246 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNOT_in_comparison2262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_comparison_in_comparison2266 = new BitSet(new long[]{0x1840C24140004030L,0x009000A20206100DL});
    public static final BitSet FOLLOW_comparison_in_comparison2270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_comparison2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VBAR_in_expr2304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2308 = new BitSet(new long[]{0x0000020140004020L,0x009000A202001001L});
    public static final BitSet FOLLOW_expr_in_expr2312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_xor_expr_in_expr2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCUMFLEX_in_xor_expr2346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_xor_expr_in_xor_expr2350 = new BitSet(new long[]{0x0000020140004020L,0x001000A202001001L});
    public static final BitSet FOLLOW_xor_expr_in_xor_expr2354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_and_expr_in_xor_expr2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPER_in_and_expr2388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_and_expr_in_and_expr2392 = new BitSet(new long[]{0x0000020140000020L,0x001000A202001001L});
    public static final BitSet FOLLOW_and_expr_in_and_expr2396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_shift_expr_in_and_expr2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTSHIFT_in_shift_expr2429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_shift_expr_in_shift_expr2433 = new BitSet(new long[]{0x0000020140000000L,0x001000A202001001L});
    public static final BitSet FOLLOW_shift_expr_in_shift_expr2437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHTSHIFT_in_shift_expr2448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_shift_expr_in_shift_expr2452 = new BitSet(new long[]{0x0000020140000000L,0x001000A202001001L});
    public static final BitSet FOLLOW_shift_expr_in_shift_expr2456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arith_expr_in_shift_expr2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_arith_expr2489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arith_expr_in_arith_expr2493 = new BitSet(new long[]{0x0000020140000000L,0x001000A002001000L});
    public static final BitSet FOLLOW_arith_expr_in_arith_expr2497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arith_expr2508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arith_expr_in_arith_expr2512 = new BitSet(new long[]{0x0000020140000000L,0x001000A002001000L});
    public static final BitSet FOLLOW_arith_expr_in_arith_expr2516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_arith_expr2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_term2550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_term2554 = new BitSet(new long[]{0x0000020140000000L,0x001000A000000000L});
    public static final BitSet FOLLOW_term_in_term2558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLASH_in_term2568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_term2572 = new BitSet(new long[]{0x0000020140000000L,0x001000A000000000L});
    public static final BitSet FOLLOW_term_in_term2576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLESLASH_in_term2586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_term2590 = new BitSet(new long[]{0x0000020140000000L,0x001000A000000000L});
    public static final BitSet FOLLOW_term_in_term2594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLESTAR_in_term2605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_term2609 = new BitSet(new long[]{0x0000020140000000L,0x001000A000000000L});
    public static final BitSet FOLLOW_term_in_term2613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_EXPRESSION_in_factor2648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_factor2652 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_power_in_factor2656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_EXPRESSION_in_factor2665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_factor2669 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_power_in_factor2673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_EXPRESSION_in_factor2681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TILDE_in_factor2685 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_power_in_factor2689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_power_in_factor2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_power2722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_power2726 = new BitSet(new long[]{0x0000020000000008L,0x0000900000000000L});
    public static final BitSet FOLLOW_trailer_in_power2730 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_power_in_power2735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_CMD_in_atom2763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_atom2767 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_atom2771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSVARIABLE_CMD_in_atom2780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOTTED_NAME_in_atom2784 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_atom2788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUETYPE_in_atom2797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_TYPE_in_atom2801 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_INT_in_atom2805 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_atom2809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUETYPE_in_atom2817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LONG_TYPE_in_atom2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LONGINT_in_atom2825 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_atom2829 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUETYPE_in_atom2837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_atom2841 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FLOAT_in_atom2845 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_atom2849 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUETYPE_in_atom2857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_TYPE_in_atom2861 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_atom2865 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_string_argument_in_atom2869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNER_BRANCH_in_atom2878 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testlist_gexp_in_atom2882 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LISTMAKER_CMD_in_atom2891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_listmaker_in_atom2895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DICTMAKER_CMD_in_atom2906 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dictmaker_in_atom2910 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arglist_in_string_argument2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTCOMPREHENSION_CMD_in_listmaker2959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_arguments_in_listmaker2963 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
    public static final BitSet FOLLOW_list_for_in_listmaker2967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_ARGS_in_list_arguments3003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_argument_in_list_arguments3005 = new BitSet(new long[]{0x1840C241400040B8L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_list_argument3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DICTIONARY_CMD_in_dictmaker3050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dict_arguments_in_dictmaker3054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DICT_ARGS_in_dict_arguments3095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dict_argument_in_dict_arguments3097 = new BitSet(new long[]{0x1840C241400040B8L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_dict_argument3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_testlist_gexp3143 = new BitSet(new long[]{0x1840C241400040B2L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_testlist_gexp3156 = new BitSet(new long[]{0x1840C241400040B2L,0x009000A20217100DL});
    public static final BitSet FOLLOW_inner_trailer_in_trailer3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_subscript_in_trailer3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAILER_in_inner_trailer3232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arglist_in_inner_trailer3236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRAILER_in_inner_trailer3244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NO_ARGS_in_inner_trailer3246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSCRIPTLISTS_in_inner_subscript3273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subscriptlist_outer_in_inner_subscript3277 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_SUBSCRIPTLIST_in_subscriptlist_outer3293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subscriptlist_in_subscriptlist_outer3297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSCRIPTS_in_subscriptlist3324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subscript_in_subscriptlist3328 = new BitSet(new long[]{0x1840C241400040B8L,0x009000A20217100DL});
    public static final BitSet FOLLOW_test_in_subscript3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprlist3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_testlist3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_CMD_in_classdef3429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_classdef3433 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_suite_in_classdef3437 = new BitSet(new long[]{0x1840C241400040B8L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_classdef3441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_arglist3475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_in_arglist3477 = new BitSet(new long[]{0x1840C243C000C4F8L,0x019001E60717300FL});
    public static final BitSet FOLLOW_expr_stmt_in_argument3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_for_in_list_iter3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_if_in_list_iter3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTLOOPCONTROL_CMD_in_list_for3558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprlist_in_list_for3562 = new BitSet(new long[]{0x1840C241400040B0L,0x009000A20217100DL});
    public static final BitSet FOLLOW_testlist_in_list_for3566 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000060L});
    public static final BitSet FOLLOW_list_iter_in_list_for3570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LISTCONDITION_CMD_in_list_if3597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_test_in_list_if3601 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000060L});
    public static final BitSet FOLLOW_list_iter_in_list_if3605 = new BitSet(new long[]{0x0000000000000008L});

}