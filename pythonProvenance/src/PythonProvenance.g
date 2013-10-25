grammar PythonProvenance;

options {
  output = AST;
  }
  
tokens {
    INDENT = '>>>';
    DEDENT = '<<<';
    ASSIGN_CMD;
    VALUETYPE;
    FORLOOP_CMD;
    VARIABLE_CMD;
    CLASSVARIABLE_CMD;
    INNER_BRANCH;
    INT_TYPE;
    DOUBLE_TYPE;
    LONG_TYPE;
    STRING_TYPE;
    ARGUMENTS;
    TRAILER;
    NO_ARGS;
    SUBSCRIPTLISTS;
    SUBSCRIPTLIST;
    SUBSCRIPTS;
    LISTMAKER_CMD;
    LISTCOMPREHENSION_CMD;
    LIST_ARGS;
    LISTLOOPCONTROL_CMD;
    LISTCONDITION_CMD;
    DICTIONARY_CMD;
    DICTMAKER_CMD;
    DICT_ARGS;
    PRINT_CMD;
    PRINT_ARGS;
    IMPORT_EQUIV;
    IMPORT_ARGS;
    IMPORT_CMD;
    OUTER_FUNCTION_CMD;
    OUTER_FUNCTION_ARGS;
    RETURN_CMD;
    TRYBLOCK;
    TRY_CMD;
    EXCEPT_CMD;
    FINALLY_CMD;
    IFBLOCK;
    IF_CMD;
    ELIF_CMD;
    ELSE_CMD;
    ELIF_CLAUSES;
    WHILEBLOCK;
    WHILE_CMD;
    CLASS_CMD;
    WITH_CMD;
    WITH_ARGS;
    WITH_EQUIV;
    EXPRESSION;
    UNARY_EXPRESSION;
}

@lexer::header	{
  package pythonProvenance;
}

@parser::header	{
  package pythonProvenance;
}

@lexer::members {
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
}

single_input : NEWLINE!
             | simple_stmt
             | compound_stmt NEWLINE!
             ;

file_input : (NEWLINE! | stmt)* 
           ;


eval_input : (NEWLINE!)* testlist (NEWLINE!)*
           ;

decorators: decorator+
          ;

decorator: AT dotted_attr (LPAREN arglist? RPAREN)? NEWLINE
         ;

dotted_attr
   	: NAME (DOT NAME)*
    	;

funcdef : decorators? ref='def' id1=NAME parameters COLON suite -> ^(OUTER_FUNCTION_CMD[$ref] $id1 parameters? suite)
        ;

parameters : LPAREN! (varargslist)? RPAREN! 
           ;

varargslist : defparameter (options {greedy=true;}:COMMA defparameter)*
              (COMMA
                  ( STAR NAME (COMMA DOUBLESTAR NAME)?
                  | DOUBLESTAR NAME
                  )?
              )? -> ^(OUTER_FUNCTION_ARGS defparameter+)
            | STAR NAME (COMMA DOUBLESTAR NAME)? 
            | DOUBLESTAR NAME 
            ;

defparameter : test (ASSIGN test)?
             ;  

stmt : simple_stmt 
     | compound_stmt
     ;
     
stmt_inside_block 
  : simple_stmt 
      | compound_stmt
      ;

simple_stmt
  : small_stmt (NEWLINE!)
  ;

small_stmt : expr_stmt
           | print_stmt 
           | del_stmt -> 
           | pass_stmt ->
           | flow_stmt 
           | import_stmt
           | global_stmt ->
           | exec_stmt ->
           | assert_stmt -> 
	;
  
expr_stmt : testlist ( 
    ( ASSIGN^
    | PLUSEQUAL^
    | MINUSEQUAL^
    | STAREQUAL^
    | SLASHEQUAL^
    | PERCENTEQUAL^
    | AMPEREQUAL^
    | VBAREQUAL^
    | CIRCUMFLEXEQUAL^
    | LEFTSHIFTEQUAL^
    | RIGHTSHIFTEQUAL^
    | DOUBLESTAREQUAL^
    | DOUBLESLASHEQUAL^ 
    )
    testlist )?
    ;

print_stmt : ref=PRINT (printlist | RIGHTSHIFT printlist)? -> ^(PRINT_CMD[$ref] printlist)
           ;

printlist returns [boolean newline]
    : print_argument (options {k=2;}: COMMA print_argument)* (COMMA)? -> ^(PRINT_ARGS print_argument+)
    ;


del_stmt : 'del' exprlist
         ;

pass_stmt : 'pass'
          ;

flow_stmt : break_stmt ->
          | continue_stmt ->
          | return_stmt
          | raise_stmt ->
          ;

break_stmt : 'break'
           ;

continue_stmt : 'continue'
              ;

return_stmt : ref='return' (arglist)? -> ^(RETURN_CMD[$ref] arglist?)
            ;

raise_stmt: 'raise' (test (COMMA test (COMMA test)?)?)?
          ;

import_stmt : import_name
            | import_from
            ;

import_name : ref='import' dotted_as_names -> ^(IMPORT_CMD[$ref] dotted_as_names)
            ;

import_from 
	:	import_from_name 
	|	import_from_dotted_name
	;

import_from_name: ref='from' id1=NAME 'import'
              (STAR -> ^(IMPORT_CMD[$ref] $id1 STAR)
              | import_as_names -> ^(IMPORT_CMD[$ref] $id1 import_as_names)
              | LPAREN import_as_names RPAREN -> ^(IMPORT_CMD[$ref] $id1 import_as_names)
              )
           ;
           
import_from_dotted_name: ref='from' id1=DOTTED_NAME 'import'
              (STAR -> ^(IMPORT_CMD[$ref] $id1 STAR)
              | import_as_names -> ^(IMPORT_CMD[$ref] $id1 import_as_names)
              | LPAREN import_as_names RPAREN -> ^(IMPORT_CMD[$ref] $id1 import_as_names)
              )
           ;

import_as_names : import_as_name (COMMA import_as_name)* (COMMA)? -> ^(IMPORT_ARGS import_as_name+)
                ;

import_as_name
	:	id1=NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV[$id1] $id1 $id2?) 
	|	id1=DOTTED_NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV[$id1] $id1 $id2?) 
	;

dotted_as_name
	:	id1=NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV[$id1] $id1 $id2?) 
	| 	id1=DOTTED_NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV[$id1] $id1 $id2?) 
	;
	
dotted_as_names : dotted_as_name (COMMA dotted_as_name)* -> ^(IMPORT_ARGS dotted_as_name+)
                ;

global_stmt : 'global' NAME (COMMA NAME)*
            ;

exec_stmt : 'exec' expr ('in' test (COMMA test)?)?
          ;

assert_stmt : 'assert' test (COMMA test)?
            ;

compound_stmt : if_stmt
              | while_stmt
              | for_stmt
              | try_stmt
              | with_stmt
              | funcdef
              | classdef
              ;

if_stmt	:	if_clause (elif_clauses)? (else_clause)? -> ^(IFBLOCK if_clause elif_clauses? else_clause?)
	;
	
	
if_clause:	ref=IF test COLON suite -> ^(IF_CMD[$ref] test suite)
	;
	
elif_clauses
	:	(elif_clause)+ -> ^(ELIF_CLAUSES elif_clause+)
	;
	
elif_clause
	:	ref='elif' test COLON suite -> ^(ELIF_CMD[$ref] test suite)
	;
	
else_clause
	:	ref='else' COLON suite -> ^(ELSE_CMD[$ref] suite)
	;

while_stmt : while_clause (else_clause)? -> ^(WHILEBLOCK while_clause else_clause?)
           ;

while_clause: ref='while' test COLON suite -> ^(WHILE_CMD[$ref] test suite)
            ;
            
for_stmt : ref='for' exprlist 'in' testlist COLON suite  -> ^(FORLOOP_CMD[$ref] exprlist testlist suite)
         ;

try_stmt:	try_clause except_clause (finally_clause)? -> ^(TRYBLOCK try_clause except_clause finally_clause?)
	;
	
try_clause
	:	ref='try' COLON suite -> ^(TRY_CMD[$ref] suite)
	;
	
except_clause
	:	ref='except' trailer? COLON suite -> ^(EXCEPT_CMD[$ref] trailer? suite)
	;
	
finally_clause
	:	ref='finally' COLON suite -> ^(FINALLY_CMD[$ref] suite)
	;
	
with_stmt: ref='with'  id1=with_clause COLON id2=suite -> ^(WITH_CMD[$ref] $id1 $id2)
         ;
         
with_clause
	:	with_item (COMMA with_item)* -> ^(WITH_ARGS with_item+)
	;
	
with_item
	:	id1=test ref='as' id2=test -> ^(WITH_EQUIV[$ref] $id1 $id2)
	;
  
suite : NEWLINE INDENT (stmt_inside_block)+ DEDENT -> ^(INDENT stmt_inside_block+)
      | INDENT (stmt_inside_block)+ DEDENT -> ^(INDENT stmt_inside_block+)
      ;


test: or_test
    ;

or_test : and_test (OR^ and_test)*
        ;

and_test : not_test (AND^ not_test)*
         ;
         
not_test : NOT^ not_test
	|	comparison
         ;

comparison: expr ( (LESS^|GREATER^|EQUAL^|GREATEREQUAL^|LESSEQUAL^|ALT_NOTEQUAL^|NOTEQUAL^|IN^|NOTIN^|IS^|ISNOT^) expr)*
          ;

expr : xor_expr (VBAR^ xor_expr)*
     ;

xor_expr : and_expr (CIRCUMFLEX^ and_expr)*
         ;

and_expr : shift_expr (AMPER^ shift_expr)*
         ;

shift_expr : arith_expr ((LEFTSHIFT^|RIGHTSHIFT^) arith_expr)*
           ;

arith_expr: term ((PLUS^|MINUS^) term)*
          ;

term : factor ((STAR^ | SLASH^ | DOUBLESLASH^ | DOUBLESTAR^ ) factor)*
     ;


factor : op=PLUS power -> ^(UNARY_EXPRESSION $op power )
	| op = MINUS power -> ^(UNARY_EXPRESSION $op power)
	| op = TILDE power -> ^(UNARY_EXPRESSION $op power)
	//| op = NOT power 
	| power
       ;

power : atom (trailer)? (DOT power)? -> ^(EXPRESSION atom trailer? power?)
  ;

atom : ref=LPAREN
       ( 
       testlist_gexp
       )? 
       RPAREN -> ^(INNER_BRANCH[$ref] testlist_gexp)
     | ref=LBRACK (listmaker)  -> ^(LISTMAKER_CMD[$ref] listmaker?)
     | ref=LCURLY (dictmaker) -> ^(DICTMAKER_CMD[$ref] dictmaker?)
     | BACKQUOTE! testlist BACKQUOTE!
     | id1=NAME (PERCENT test)? -> ^(VARIABLE_CMD[$id1] $id1 test?)
     | id1=DOTTED_NAME (PERCENT test)? -> ^(CLASSVARIABLE_CMD[$id1] $id1 test?)
     | id1=INT (PERCENT test)? -> ^(VALUETYPE[$id1] INT_TYPE $id1 test?)
     | id1=LONGINT (PERCENT test)? -> ^(VALUETYPE[$id1] LONG_TYPE $id1 test?)
     | id1=FLOAT (PERCENT test)? -> ^(VALUETYPE[$id1] DOUBLE_TYPE $id1 test?)
     //| id1=STRING -> ^(VALUETYPE[$id1] STRING_TYPE $id1)
     | id1=STRING (PERCENT string_argument )? -> ^(VALUETYPE[$id1] STRING_TYPE $id1 string_argument?)
     ;

string_argument
  : (LPAREN!) (arglist) (RPAREN!)
  ;
  
listmaker : 	list_arguments list_for? RBRACK -> ^(LISTCOMPREHENSION_CMD list_arguments list_for?)
	  |	RBRACK!
    ;
    
list_arguments: list_argument (COMMA list_argument)* -> ^(LIST_ARGS list_argument+)
    ;

list_argument
	:	testlist
	;
	
dictmaker : dict_arguments  RCURLY -> ^(DICTIONARY_CMD dict_arguments)
  | RCURLY!
          ;
          
dict_arguments: dict_argument COLON dict_argument (options {k=2;}:COMMA dict_argument COLON dict_argument)* (COMMA)? -> ^(DICT_ARGS dict_argument+)
    ;      
          
dict_argument
	:	testlist;
	

testlist_gexp
    : test (PERCENT)? ( (options {k=2;}: COMMA! test)* (COMMA!)? 
           | gen_for
           )           
    ;

/*
testlist_gexp
	:	gexp_argument ( (options {k=2;}:COMMA gexp_argument)* (COMMA)? -> ^(GEXP_ARGS gexp_argument+)
				| gen_for
				)
	;
	
gexp_argument
	:	test
	;
*/

trailer	:	LPAREN! inner_trailer
	|	inner_subscript
	//|	PERCENT inner_trailer1 -> ^(PERCENT inner_trailer1)
	;
	
inner_trailer
	:	arglist RPAREN -> ^(TRAILER arglist) 
	|	RPAREN -> ^(TRAILER NO_ARGS)
	;	
/*	
trailer : (LPAREN) (arglist) (RPAREN) -> ^(TRAILER arglist) 
	| LPAREN RPAREN -> ^(TRAILER NO_ARGS)
        | LBRACK subscriptlist RBRACK -> ^(TRAILER subscriptlist)
        ;
*/        

inner_subscript
	:	(subscriptlist_outer)+ -> ^(SUBSCRIPTLISTS subscriptlist_outer+)
	;
	
subscriptlist_outer
	:	LBRACK subscriptlist RBRACK -> ^(SUBSCRIPTLIST subscriptlist)
	;
	
subscriptlist : subscript (options {greedy=true;}:COMMA subscript)* (COMMA)? -> ^(SUBSCRIPTS subscript+)
              ;
              
subscript : 
          test
          ;

exprlist : expr (options {k=2;}: COMMA! expr)* (COMMA!)?
         ;

testlist
    : test 
    ;

classdef: ref='class' id1=NAME (LPAREN testlist? RPAREN)? COLON suite -> ^(CLASS_CMD[$ref] $id1 suite testlist?)
        ;

/*
arglist : argument (ASSIGN sub_argument)? (COMMA argument (ASSIGN sub_argument)?)* -> ^(ARGUMENTS argument+)
        |   STAR test (COMMA DOUBLESTAR test)?
        |   DOUBLESTAR test
        ;
*/

arglist : argument  (COMMA argument?)* -> ^(ARGUMENTS argument+)
        |   STAR test (COMMA DOUBLESTAR test)?
        |   DOUBLESTAR test
        ;
      
print_argument
	:	testlist
	;
	
/*
argument : testlist 
         ;
*/        

argument
        	:	expr_stmt
        	;
/*        	      
sub_argument
	:	testlist
	;
*/
list_iter : list_for
          | list_if
          ;

list_for : 'for' exprlist 'in' testlist (list_iter)? -> ^(LISTLOOPCONTROL_CMD exprlist testlist list_iter?)
         ;

list_if : 'if' test (list_iter)? -> ^(LISTCONDITION_CMD test list_iter?)
        ;

gen_iter: gen_for
        | gen_if
        ;

gen_for: 'for' exprlist 'in' or_test gen_iter?
       ;

gen_if: 'if' test gen_iter?
      ;
      

LPAREN    : '(' {implicitLineJoiningLevel++;} ;

RPAREN    : ')' {implicitLineJoiningLevel--;} ;

LBRACK    : '[' {implicitLineJoiningLevel++;} ;

RBRACK    : ']' {implicitLineJoiningLevel--;} ;

COLON     : ':' ;

COMMA    : ',' ;

SEMI    : ';' ;

DOT : '.' ;

PLUS    : '+' ;

MINUS    : '-' ;

STAR    : '*' ;

SLASH    : '/' ;

VBAR    : '|' ;

AMPER    : '&' ;

LESS    : '<' ;

GREATER    : '>' ;

ASSIGN    : '=' ;

PERCENT    : '%' ;

BACKQUOTE    : '`' ;

LCURLY    : '{' {implicitLineJoiningLevel++;} ;

RCURLY    : '}' {implicitLineJoiningLevel--;} ;

CIRCUMFLEX    : '^' ;

TILDE    : '~' ;

EQUAL    : '==' ;

NOTEQUAL    : '!=' ;

ALT_NOTEQUAL: '<>' ;

LESSEQUAL    : '<=' ;

LEFTSHIFT    : '<<' ;

GREATEREQUAL    : '>=' ;

RIGHTSHIFT    : '>>' ;

PLUSEQUAL    : '+=' ;

MINUSEQUAL    : '-=' ;

DOUBLESTAR    : '**' ;

STAREQUAL    : '*=' ;

DOUBLESLASH    : '//' ;

SLASHEQUAL    : '/=' ;

VBAREQUAL    : '|=' ;

PERCENTEQUAL    : '%=' ;

AMPEREQUAL    : '&=' ;

CIRCUMFLEXEQUAL    : '^=' ;

LEFTSHIFTEQUAL    : '<<=' ;

RIGHTSHIFTEQUAL    : '>>=' ;

DOUBLESTAREQUAL    : '**=' ;

DOUBLESLASHEQUAL    : '//=' ;

AT : '@' ;

AND : 'and' ;

OR : 'or' ;

NOT : 'not' ;

IN  : 'in';

NOTIN : 'not in';

IS  : 'is';

ISNOT : 'is not';

PRINT 	: 'print';

AS 	:	 'as';

IF	:	'if';

FLOAT
    :   '.' DIGITS (Exponent)?
    |   DIGITS '.' Exponent
    |   DIGITS ('.' (DIGITS (Exponent)?)? | Exponent)
    ;

LONGINT
    :   INT ('l'|'L')
    ;

fragment
Exponent
    :    ('e' | 'E') ( '+' | '-' )? DIGITS
    ;
  
INT :   // Hex
         '0' ('x' | 'X') ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
    |   // Octal
         '0' DIGITS*
    |    '1'..'9' DIGITS*
    ;

COMPLEX
    :   INT ('j'|'J')
    |   FLOAT ('j'|'J')
    ;

fragment
DIGITS : ( '0' .. '9' )+ ;


DOTTED_NAME
	:  NAME (DOT NAME)+
	|  STRING DOT NAME
	;
   
    
NAME:    ( 'a' .. 'z' | 'A' .. 'Z' | '_')
        ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
    ;
		
/** Match various string types.  Note that greedy=false implies '''
 *  should make us exit loop not continue.
 */
STRING
    :   ('r'|'u'|'ur')?
        //(   '\'\'\'' (options {greedy=false;}:TRIAPOS)* '\'\'\''
        //(   '"""' (options {greedy=false;}:TRIQUOTE)* '"""'
        (	'\'\'\'' (options {greedy=false;}:TRIAPOS)* '\'\'\''
   	|	'"""' (options {greedy=false;}:TRIQUOTE)* '"""'
    	| 	'"' (ESC|~('\\'|'\n'|'"'))* '"'
        |   	'\'' (ESC|~('\\'|'\n'|'\''))* '\''
        )
    ;

/** the two '"'? cause a warning -- is there a way to avoid that? */
fragment
TRIQUOTE
    : '"'? '"'? (ESC|~('\\'|'"'))+
    ;

/** the two '\''? cause a warning -- is there a way to avoid that? */
fragment
TRIAPOS
    : '\''? '\''? (ESC|~('\\'|'\''))+
    ;

fragment
ESC
    :    '\\' .
    ;

/** Consume a newline and any whitespace at start of next line
 *  unless the next line contains only white space, in that case
 *  emit a newline.
 */
CONTINUED_LINE
    :    '\\' ('\r')? '\n' (' '|'\t')*  { $channel=HIDDEN; }
         ( nl=NEWLINE {emit(new ClassicToken(NEWLINE,nl.getText()));}
         |
         )
    ;

/** Treat a sequence of blank lines as a single blank line.  If
 *  nested within a (..), {..}, or [..], then ignore newlines.
 *  If the first newline starts in column one, they are to be ignored.
 *
 *  Frank Wierzbicki added: Also ignore FORMFEEDS (\u000C).
 */
 /*
NEWLINE
    :   (('\u000C')?('\r')? '\n' )+
        {if ( startPos==0 || implicitLineJoiningLevel>0 )
            $channel=HIDDEN;
        }
    ;
    */

NEWLINE
@init {
    int spaces = 0;
    count = 0;
    //int leading_space = 0;
}
    :   ((('\u000C')?('\r')? '\n' ) | '\t' | ' ' )* (('\u000C')?('\r')? '\n' )
    leading_space = (' '  { spaces++; } | '\t' { spaces += 8; spaces -= (spaces \% 8); } )*
        {
      if ( startPos==0 || implicitLineJoiningLevel>0 )
        $channel=HIDDEN;
        

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
    ;

WS  :    {startPos>0}?=> (' '|'\t'|'\u000C')+ {$channel=HIDDEN;}
    ;
    
/** Grab everything before a real symbol.  Then if newline, kill it
 *  as this is a blank line.  If whitespace followed by comment, kill it
 *  as it's a comment on a line by itself.
 *
 *  Ignore leading whitespace when nested in [..], (..), {..}.
 */
LEADING_WS
@init {
    int spaces = 0;
}
    :   {startPos==0}?=>
        (   {implicitLineJoiningLevel>0}? ( ' ' | '\t' )+ {$channel=HIDDEN;}
           |    (     ' '  { spaces++; }
            |    '\t' { spaces += 8; spaces -= (spaces \% 8); }
               )+
            {
            // make a string of n spaces where n is column number - 1
            char[] indentation = new char[spaces];
            for (int i=0; i<spaces; i++) {
                indentation[i] = ' ';
            }
            String s = new String(indentation);
            emit(new ClassicToken(LEADING_WS,new String(indentation)));
            }
            // kill trailing newline if present and then ignore
            //( ('\r')? '\n' {if (token!=null) token.setChannel(HIDDEN); else $channel=HIDDEN;})*
           // {token.setChannel(99); }
        )
    ;

/** Comments not on line by themselves are turned into newlines.

    b = a # end of line comment

    or

    a = [1, # weird
         2]

    This rule is invoked directly by nextToken when the comment is in
    first column or when comment is on end of nonwhitespace line.

    Only match \n here if we didn't start on left edge; let NEWLINE return that.
    Kill if newlines if we live on a line by ourselves
    
    Consume any leading whitespace if it starts on left edge.
 */
COMMENT
@init {
    $channel=HIDDEN;
}
    :    {startPos==-1}?=> (' '|'\t')* '#' (~'\n')* '\n'+
    |    {startPos>-1}?=> '#' (~'\n')* // let NEWLINE handle \n unless char pos==0 for '#'
    ;

