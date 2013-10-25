grammar pythonProvenance;

options {
  output = AST;
  }
  
tokens {
    INDENT = '>>>';
    DEDENT = '<<<';
    PCR_CMD;
    REPORT_CMD;
    SETCLONE_CMD;
    READMAP_CMD;
    SCALAR_CMD;
    MIN_CMD;
    MAX_CMD;
    COVER_CMD;
    IFTHEN_CMD;
    IFTHENELSE_CMD;
    AREATOTAL_CMD;
    ACCUTHRESHOLDFLUX_CMD;
    ASSIGN_CMD;
    VALUETYPE;
    FORLOOP_CMD;
    VARIABLE_CMD;
    INNER_BRANCH;
    INT_TYPE;
    DOUBLE_TYPE;
    LONG_TYPE;
    STRING_TYPE;
    ARGUMENTS;
    SUBSCRIPTS;
    LISTCOMPREHENSION_CMD;
    LISTLOOPCONTROL_CMD;
    LISTCONDITION_CMD;
    DOTFUNCTION;
    PRINT_CMD;
    PRINT_ARGS;
    IMPORT_EQUIV;
    IMPORT_ARGS;
    IMPORT_CMD;
    FUNC_CMD;
    FUNC_CALL_CMD;
    OUTER_FUNCTION_CMD;
    OUTER_FUNCTION_ARGS;
    RETURN_CMD;
    TRY_CMD;
    EXCEPT_CMD;
    FINALLY_CMD;
    IF_CMD;
    ELIF_CMD;
    ELSE_CMD;
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

funcdef : decorators? 'def' id1=NAME parameters COLON suite -> ^(OUTER_FUNCTION_CMD $id1 parameters suite)
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

defparameter : NAME (ASSIGN test)?
             ;

/*
fpdef : NAME
      | LPAREN fplist RPAREN
      ;

fplist : fpdef (options {greedy=true;}:COMMA fpdef)* (COMMA)?
       ;
*/       

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
	
	/*
pcr_stmt: readmap_expr
  | scalar_expr
  | min_expr
  | max_expr
  | cover_expr
  | ifthen_expr
  | ifthenelse_expr
  | areatotal_expr
  | accuthresholdflux_expr
  ;
 */
  
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
  
/*
assigns
    : assign_testlist
    | assign_yield
    ;

assign_testlist
       : ASSIGN! testlist
       ;

assign_yield
    : ASSIGN! yield_expr
    ;

augassign : PLUSEQUAL
          | MINUSEQUAL
          | STAREQUAL
          | SLASHEQUAL
          | PERCENTEQUAL
          | AMPEREQUAL
          | VBAREQUAL
          | CIRCUMFLEXEQUAL
          | LEFTSHIFTEQUAL
          | RIGHTSHIFTEQUAL
          | DOUBLESTAREQUAL
          | DOUBLESLASHEQUAL
          ;

*/

print_stmt : ref=PRINT (printlist | RIGHTSHIFT printlist)? -> ^(PRINT_CMD[$ref] printlist)
           ;

printlist returns [boolean newline]
    : print_argument (options {k=2;}: COMMA print_argument)* (COMMA)? -> ^(PRINT_ARGS print_argument+)
    ;


del_stmt : 'del' exprlist
         ;

pass_stmt : 'pass'
          ;

flow_stmt : break_stmt
          | continue_stmt
          | return_stmt
          | raise_stmt
          ;

break_stmt : 'break'
           ;

continue_stmt : 'continue'
              ;

return_stmt : 'return' (testlist)? -> ^(RETURN_CMD testlist)
            ;

/*
yield_stmt : yield_expr
           ;

*/
raise_stmt: 'raise' (test (COMMA test (COMMA test)?)?)?
          ;

import_stmt : import_name
            | import_from
            ;

import_name : 'import' dotted_as_names -> ^(IMPORT_CMD dotted_as_names)
            ;

/*
import_from: 'from' (DOT* dotted_name | DOT+) 'import'
              (STAR
              | import_as_names
              | LPAREN import_as_names RPAREN
              )
           ;
*/

import_from: 'from' NAME 'import'
              (STAR -> ^(IMPORT_CMD NAME STAR)
              | import_as_names -> ^(IMPORT_CMD NAME import_as_names)
              | LPAREN import_as_names RPAREN -> ^(IMPORT_CMD NAME import_as_names)
              )
           ;

import_as_names : import_as_name (COMMA import_as_name)* (COMMA)? -> ^(IMPORT_ARGS import_as_name+)
                ;

import_as_name
	:	id1=NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV $id1 $id2?) 
	|	id1=IMPORT_NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV $id1 $id2?) 
	;
/*
dotted_as_name : dotted_name ('as' NAME)?
               ;
*/

dotted_as_name
	:	id1=NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV $id1 $id2?) 
	|	id1=IMPORT_NAME (AS id2=NAME)? -> ^(IMPORT_EQUIV $id1 $id2?) 
	;
	
dotted_as_names : dotted_as_name (COMMA dotted_as_name)* -> ^(IMPORT_ARGS dotted_as_name+)
                ;

/*                
dotted_name : NAME (DOT NAME)*
            ;
*/

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
      
/*              
if_stmt: 'if' test COLON suite elif_clause*  ('else' COLON suite)? -> 
       ;
*/

if_stmt	:	if_block (elif_block)* (else_block)?
	;
	
if_block:	'if' test COLON suite -> ^(IF_CMD test suite)
	;
	
elif_block
	:	'elif' test COLON suite -> ^(ELIF_CMD test suite)
	;
else_block
	:	'else' COLON suite -> ^(ELSE_CMD suite)
	;
	
/*	
elif_clause : 'elif' test COLON suite
            ;
*/

while_stmt : 'while' test COLON suite ('else' COLON suite)?
           ;

for_stmt : 'for' exprlist 'in' testlist COLON suite  -> ^(FORLOOP_CMD exprlist testlist suite)
         ;

/*
try_stmt : 'try' COLON suite
           ( except_clause+ ('else' COLON suite)? ('finally' COLON suite)?
           | 'finally' COLON suite
           )
         ;
*/

try_stmt:	try_block except_block (finally_block)? 
	;
	
try_block
	:	'try' COLON suite -> ^(TRY_CMD suite)
	;
	
except_block
	:	'except' trailer? COLON suite -> ^(EXCEPT_CMD trailer? suite)
	;
	
finally_block
	:	'finally' COLON suite -> ^(FINALLY_CMD suite)
	;
	
with_stmt: 'with' test (with_var)? COLON suite
         ;

with_var: ('as' | NAME) expr
        ;
/*
except_clause : 'except' (test (COMMA test)?)? COLON suite
              ;
*/
  
  /*
report_stmt
  : report_expr
  ;
  
setclone_stmt
  : setclone_expr
  ;
  
  */
  
/*
readmap_stmt
  : readmap_expr
  ;
  
scalar_stmt
  : scalar_expr
  ;
*/

func_stmt
	:	func_expr;
	
  
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
         | comparison
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
/*
pcr_expr: (PCR_READMAP^|PCR_SCALAR^|PCR_MIN^|PCR_MAX^|PCR_COVER^|PCR_IFTHEN^|PCR_IFTHENELSE^|PCR_ARAETOTAL^|PCR_ACCUTHRESHOLDFLUX^)* arith_expr
  ;
*/
arith_expr: term ((PLUS^|MINUS^) term)*
          ;

term : factor ((STAR^ | SLASH^ | DOUBLESLASH^ | DOUBLESTAR^ ) factor)*
     ;


factor : PLUS factor
       | MINUS factor
       | TILDE factor
       | power
       ;

power : atom 
  ;

atom : LPAREN
       ( 
       testlist_gexp
       )? 
       RPAREN -> ^(INNER_BRANCH testlist_gexp)
     | LBRACK! (listmaker)? RBRACK!
     | LCURLY! (dictmaker)? RCURLY!
     | BACKQUOTE! testlist BACKQUOTE!
     | id1=NAME -> ^(VARIABLE_CMD $id1)
     | id1=INT -> ^(VALUETYPE INT_TYPE $id1 )
     | id1=LONGINT -> ^(VALUETYPE LONG_TYPE $id1 )
     | id1=FLOAT -> ^(VALUETYPE DOUBLE_TYPE $id1 )
     | COMPLEX
     | id1=STRING (PERCENT trailer)?  -> ^(VALUETYPE STRING_TYPE $id1 trailer?)
     //| cmd=pcr_stmt -> ^(PCR_CMD $cmd)
     | cmd1=func_stmt -> ^(FUNC_CMD $cmd1)
     | id1=NAME trailer -> ^(FUNC_CALL_CMD $id1 trailer)
     ;

func_expr
	:	id1=FUNCTION_NAME trailer -> ^(FUNC_CALL_CMD $id1 trailer)
	;
	
/*
report_expr
  : PCR_REPORT LPAREN id1=NAME COMMA id2=STRING (PERCENT)? trailer? RPAREN -> ^(REPORT_CMD $id1 $id2 trailer? )
  ;
  
setclone_expr
  : PCR_SETCLONE LPAREN id1=NAME RPAREN -> ^(SETCLONE_CMD $id1)
  ;
  
readmap_expr
  : PCR_READMAP! LPAREN! inner_readmap_expr 
  ;

*/

/*
inner_readmap_expr
  : id1=NAME RPAREN -> ^(READMAP_CMD $id1)
  | id1=STRING (PERCENT)? trailer? RPAREN -> ^(READMAP_CMD $id1 trailer?)
  ;
  

scalar_expr
  : PCR_SCALAR! LPAREN! inner_scalar_expr 
  ;
  
inner_scalar_expr
  : id1=INT RPAREN -> ^(SCALAR_CMD $id1)
  | id1=STRING (PERCENT)? arglist? RPAREN -> ^(SCALAR_CMD $id1 arglist?)
  |   id1=NAME RPAREN -> ^(SCALAR_CMD $id1)
  ;
  
min_expr: PCR_MIN  trailer  -> ^(MIN_CMD trailer)
  ;
  
max_expr: PCR_MAX trailer -> ^(MAX_CMD trailer)
  ;
  
cover_expr
  : PCR_COVER trailer -> ^(COVER_CMD trailer)
  ;

ifthen_expr
  : PCR_IFTHEN trailer -> ^(IFTHEN_CMD trailer)
  ;

ifthenelse_expr
  : PCR_IFTHENELSE trailer -> ^(IFTHENELSE_CMD trailer)
  ;
  
areatotal_expr
  : PCR_AREATOTAL trailer -> ^(AREATOTAL_CMD trailer)
  ;

accuthresholdflux_expr
  : PCR_ACCUTHRESHOLDFLUX trailer -> ^(ACCUTHRESHOLDFLUX_CMD trailer)
  ;

*/

listmaker : test list_for? -> ^(LISTCOMPREHENSION_CMD test list_for?)
          ;

testlist_gexp
    : test ( (options {k=2;}: COMMA! test)* (COMMA!)? 
           | gen_for
           )
           
    ;


trailer : (LPAREN!) (arglist)? (RPAREN!) 
        | LBRACK! subscriptlist RBRACK!
        | DOT id1=NAME LPAREN arglist RPAREN -> ^(DOTFUNCTION $id1 arglist)
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

dictmaker : test COLON test (options {k=2;}:COMMA test COLON test)* (COMMA)?
          ;

classdef: 'class' NAME (LPAREN testlist? RPAREN)? COLON suite
        ;

arglist : argument (COMMA argument)* -> ^(ARGUMENTS argument+)
        |   STAR test (COMMA DOUBLESTAR test)?
        |   DOUBLESTAR test
        ;

print_argument
	:	test
	;
	
argument : test 
         ;

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
      
/*
yield_expr : 'yield' testlist?
           ;
*/

/*
PCR : 'pcr.';

PCR_READMAP: 'pcr.readmap';

PCR_SCALAR
  : 'pcr.scalar'
  ;
  
PCR_REPORT
  : 'pcr.report';
  
PCR_SETCLONE
  : 'pcr.setclone'
  ;
  
PCR_MIN : 'pcr.min';

PCR_MAX : 'pcr.max';

PCR_IFTHEN
  : 'pcr.ifthen';
  
PCR_IFTHENELSE
  : 'pcr.ifthenelse';
  
PCR_COVER
  : 'pcr.cover';

PCR_AREATOTAL
  : 'pcr.areatotal';
  
  
PCR_ACCUTHRESHOLDFLUX
  : 'pcr.accuthresholdflux';
*/

LPAREN    : '(' {implicitLineJoiningLevel++;} ;

RPAREN    : ')' {implicitLineJoiningLevel--;} ;

LBRACK    : '[' {implicitLineJoiningLevel++;} ;

RBRACK    : ']' {implicitLineJoiningLevel--;} ;

COLON     : ':' ;

COMMA    : ',' ;

SEMI    : ';' ;

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

DOT : '.' ;

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
    |   '1'..'9' DIGITS*
    ;

COMPLEX
    :   INT ('j'|'J')
    |   FLOAT ('j'|'J')
    ;

fragment
DIGITS : ( '0' .. '9' )+ ;

FUNCTION_NAME
	:  NAME DOT NAME
	;


NAME:    ( 'a' .. 'z' | 'A' .. 'Z' | '_')
        ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
    ;
    
    
IMPORT_NAME:    ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.')
        ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
    ;
		
/** Match various string types.  Note that greedy=false implies '''
 *  should make us exit loop not continue.
 */
STRING
    :   ('r'|'u'|'ur')?
        (   '\'\'\'' (options {greedy=false;}:TRIAPOS)* '\'\'\''
        |   '"""' (options {greedy=false;}:TRIQUOTE)* '"""'
        |   '"' (ESC|~('\\'|'\n'|'"'))* '"'
        |   '\'' (ESC|~('\\'|'\n'|'\''))* '\''
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
}
    :   ((('\u000C')?('\r')? '\n' ) | '\t' | ' ' )* (('\u000C')?('\r')? '\n' )
    leading_space = (' '  { spaces++; } | '\t' { spaces += 8; spaces -= (spaces \% 8); } )*
        {
      if ( startPos==0 || implicitLineJoiningLevel>0 )
        $channel=HIDDEN;
        

      if (startPos>=0 && implicitLineJoiningLevel==0)
      {
        if ( spaces > IndentStack[sp] ) {
          sp++;
          IndentStack[sp] = spaces;
          emit(new ClassicToken(INDENT,">>>"));

        }
        else
        {
          while (spaces < IndentStack[sp]) {
            sp--;
            //IndentStack.RemoveAt(IndentStack.Count - 1);
            emit(new ClassicToken(DEDENT,"<<<"));
          }
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

