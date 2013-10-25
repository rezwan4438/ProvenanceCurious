grammar pythonProvenance;

options	{
	output = AST;
	}
	
tokens {
    INDENT = '>>>';
    DEDENT = '<<<';
    REPORT_CMD;
    SETCLONE_CMD;
    ASSIGN_CMD;
    VALUETYPE;
    FORLOOP_CMD;
    INT_TYPE;
    DOUBLE_TYPE;
    LONG_TYPE;
    STRING_TYPE;
    ARGUMENTS;
    LIST;
    LOOP;
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

funcdef : decorators? 'def' NAME parameters COLON suite
        ;

parameters : LPAREN (varargslist)? RPAREN
           ;

varargslist : defparameter (options {greedy=true;}:COMMA defparameter)*
              (COMMA
                  ( STAR NAME (COMMA DOUBLESTAR NAME)?
                  | DOUBLESTAR NAME
                  )?
              )?
            | STAR NAME (COMMA DOUBLESTAR NAME)?
            | DOUBLESTAR NAME
            ;

defparameter : fpdef (ASSIGN test)?
             ;

fpdef : NAME
      | LPAREN fplist RPAREN
      ;

fplist : fpdef (options {greedy=true;}:COMMA fpdef)* (COMMA)?
       ;

stmt : simple_stmt
     | compound_stmt
     ;

simple_stmt : small_stmt (options {greedy=true;}:SEMI small_stmt)* (SEMI)? (NEWLINE!)
            ;

small_stmt : expr_stmt
           | print_stmt ->
           | del_stmt -> 
           | pass_stmt ->
           | flow_stmt ->
           | import_stmt -> 
           | global_stmt ->
           | exec_stmt ->
           | assert_stmt -> 
           | report_stmt
           | setclone_stmt
           ;

expr_stmt : testlist
            ( augassign yield_expr
            | augassign testlist
            | assigns -> ^(ASSIGN_CMD testlist assigns)
            )?
          ;

assigns
    : assign_testlist+
    | assign_yield+
    //| assign_scalar
    ;

assign_testlist
       : ASSIGN! testlist
       ;

assign_yield
    : ASSIGN! yield_expr
    ;

/*
assign_readmap 
	: ASSIGN! readmap_expr
	;
	
assign_scalar
	:	ASSIGN! scalar_expr
	;
	*/
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

print_stmt : 'print' (printlist | RIGHTSHIFT printlist)?
           ;

printlist returns [boolean newline]
    : test (options {k=2;}: COMMA test)* (COMMA)?
    ;


del_stmt : 'del' exprlist
         ;

pass_stmt : 'pass'
          ;

flow_stmt : break_stmt
          | continue_stmt
          | return_stmt
          | raise_stmt
          | yield_stmt
          ;

break_stmt : 'break'
           ;

continue_stmt : 'continue'
              ;

return_stmt : 'return' (testlist)?
            ;

yield_stmt : yield_expr
           ;

raise_stmt: 'raise' (test (COMMA test (COMMA test)?)?)?
          ;

import_stmt : import_name
            | import_from
            ;

import_name : 'import' dotted_as_names
            ;

import_from: 'from' (DOT* dotted_name | DOT+) 'import'
              (STAR
              | import_as_names
              | LPAREN import_as_names RPAREN
              )
           ;

import_as_names : import_as_name (COMMA import_as_name)* (COMMA)?
                ;

import_as_name : NAME ('as' NAME)?
               ;

dotted_as_name : dotted_name ('as' NAME)?
               ;

dotted_as_names : dotted_as_name (COMMA dotted_as_name)*
                ;
dotted_name : NAME (DOT NAME)*
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

if_stmt: 'if' test COLON suite elif_clause*  ('else' COLON suite)?
       ;

elif_clause : 'elif' test COLON suite
            ;

while_stmt : 'while' test COLON suite ('else' COLON suite)?
           ;

for_stmt : 'for' exprlist 'in' testlist COLON suite ('else' COLON suite)? -> ^(FORLOOP_CMD exprlist testlist suite)
         ;

try_stmt : 'try' COLON suite
           ( except_clause+ ('else' COLON suite)? ('finally' COLON suite)?
           | 'finally' COLON suite
           )
         ;

with_stmt: 'with' test (with_var)? COLON suite
         ;

with_var: ('as' | NAME) expr
        ;

except_clause : 'except' (test (COMMA test)?)? COLON suite
              ;
/*
readmap_stmt
	:	readmap_expr
	;
	*/
	
report_stmt
	:	report_expr
	;
	
setclone_stmt
	:	setclone_expr
	;
	
suite : simple_stmt
      | NEWLINE! INDENT (stmt)+ DEDENT
      | INDENT^ (stmt)+ DEDENT!
      ;

test: or_test
    ( ('if' or_test 'else') => 'if' or_test 'else' test)?
    | lambdef
    ;

or_test : and_test (OR^ and_test)*
        ;

and_test : not_test (AND^ not_test)*
         ;

not_test : NOT^ not_test
         | comparison
         ;

comparison: expr (comp_op expr)*
          ;

comp_op : LESS^
        | GREATER^
        | EQUAL^
        | GREATEREQUAL^
        | LESSEQUAL^
        | ALT_NOTEQUAL^
        | NOTEQUAL^
        | 'in'^
        | NOT 'in'^
        | 'is'^
        | 'is' NOT^
        ;

expr : xor_expr (VBAR^ xor_expr)*
     ;

xor_expr : and_expr (CIRCUMFLEX^ and_expr)*
         ;

and_expr : shift_expr (AMPER^ shift_expr)*
         ;

shift_expr : pcr_expr ((LEFTSHIFT^|RIGHTSHIFT^) pcr_expr)*
           ;

pcr_expr: (PCR_READMAP^|PCR_SCALAR^|PCR_MIN^|PCR_MAX^|PCR_COVER^|PCR_IFTHEN^|PCR_IFTHENELSE^|PCR_ARAETOTAL^|PCR_ACCUTHRESHOLDFLUX^)* arith_expr
	;

arith_expr: term ((PLUS^|MINUS^) term)*
          ;

term : factor ((STAR^ | SLASH^ | DOUBLESLASH^ | DOUBLESTAR^ ) factor)*
     ;


factor : PLUS factor
       | MINUS factor
       | TILDE factor
       | power
       ;

power : (atom | 'int'! | 'long'! | 'float'! | 'range'!) (PERCENT!)? (trailer)* //(options {greedy=true;}: factor)?
      ;
	
atom : LPAREN! 
       ( yield_expr
       | testlist_gexp
       )?
       RPAREN!
     | LBRACK! (listmaker)? RBRACK!
     | LCURLY! (dictmaker)? RCURLY!
     | BACKQUOTE! testlist BACKQUOTE!
     | NAME
     | id1=INT -> ^(VALUETYPE INT_TYPE $id1 )
     | id1=LONGINT -> ^(VALUETYPE LONG_TYPE $id1 )
     | id1=FLOAT -> ^(VALUETYPE DOUBLE_TYPE $id1 )
     | COMPLEX
     | id1=STRING -> ^(VALUETYPE STRING_TYPE $id1 )
     // deleted | (STRING)+
     ;

report_expr
	:	PCR_REPORT LPAREN id1=NAME COMMA id2=STRING (PERCENT)? arglist? RPAREN -> ^(REPORT_CMD $id1 $id2 arglist? )
	;
	
setclone_expr
	:	PCR_SETCLONE LPAREN id1=NAME RPAREN -> ^(SETCLONE_CMD $id1)
	;
	
listmaker : test 
            ( list_for
            | (options {greedy=true;}:COMMA test)*
            ) (COMMA)? -> ^(LIST test list_for)
          ;

testlist_gexp
    : test ( (options {k=2;}: COMMA test)* (COMMA)? 
           | gen_for
           )
           
    ;

lambdef: 'lambda' (varargslist)? COLON test
       ;

trailer : (LPAREN!) (arglist)? (RPAREN!) 
        | LBRACK! subscriptlist RBRACK!
        | DOT NAME
        ;

subscriptlist : subscript (options {greedy=true;}:COMMA subscript)* (COMMA)?
              ;

subscript : DOT DOT DOT
          | test (COLON (test)? (sliceop)?)?
          | COLON (test)? (sliceop)?
          ;

sliceop : COLON (test)?
        ;

exprlist : expr (options {k=2;}: COMMA! expr)* (COMMA!)?
         ;

testlist
    : test (options {k=2;}: COMMA! test)* (COMMA!)?
    ;

dictmaker : test COLON test (options {k=2;}:COMMA test COLON test)* (COMMA)?
          ;

classdef: 'class' NAME (LPAREN testlist? RPAREN)? COLON suite
        ;

arglist : argument (COMMA argument)* 
          ( COMMA
            ( STAR test (COMMA DOUBLESTAR test)?
            | DOUBLESTAR test
            )?
          )? -> ^(ARGUMENTS argument+)
        |   STAR test (COMMA DOUBLESTAR test)?
        |   DOUBLESTAR test
        ;

argument : test ( (ASSIGN test) | gen_for)?
         ;

list_iter : list_for
          | list_if
          ;

list_for : 'for' exprlist 'in' testlist (list_iter)? -> ^(LOOP exprlist testlist)
         ;

list_if : 'if' test (list_iter)?
        ;

gen_iter: gen_for
        | gen_if
        ;

gen_for: 'for' exprlist 'in' or_test gen_iter?
       ;

gen_if: 'if' test gen_iter?
      ;

yield_expr : 'yield' testlist?
           ;

PCR_READMAP: 'pcr.readmap';

PCR_SCALAR
	:	'pcr.scalar'
	;
	
PCR_REPORT
	:	'pcr.report';
	
PCR_SETCLONE
	:	'pcr.setclone'
	;
	
PCR_MIN	:	'pcr.min';

PCR_MAX	:	'pcr.max';

PCR_IFTHEN
	:	'pcr.ifthen';
	
PCR_IFTHENELSE
	:	'pcr.ifthenelse';
	
PCR_COVER
	:	'pcr.cover';

PCR_ARAETOTAL
	:	'pcr.areatotal';
	
	
PCR_ACCUTHRESHOLDFLUX
	:	'pcr.accuthresholdflux';


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

NAME:    ( 'a' .. 'z' | 'A' .. 'Z' | '_')
        ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
				

			if (implicitLineJoiningLevel==0)
			{
				if ( spaces > IndentStack[sp] ) {
					sp++;
					IndentStack[sp] = spaces;
					emit(new ClassicToken(INDENT,"\n>>>\n"));

				}
				else
				{
					while (spaces < IndentStack[sp]) {
						sp--;
						//IndentStack.RemoveAt(IndentStack.Count - 1);
						emit(new ClassicToken(DEDENT,"\n<<<\n"));
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

