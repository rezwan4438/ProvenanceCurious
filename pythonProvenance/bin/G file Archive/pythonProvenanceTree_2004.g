tree grammar pythonProvenanceTree;

options	{
	ASTLabelType = CommonTree;
	tokenVocab = pythonProvenance;
	}
	

@header	{
  import commands.*;
  import java.util.*;
  import org.antlr.runtime.BitSet;
}

@members{
	// for commands
	private ArrayList<Command> commandList = new ArrayList<Command>();
	public List<Command> getCommandList(){
		return commandList;
	}
	
	//for variables 
	private ArrayList<Command> variableList = new ArrayList<Command>();
	public List<Command> getVariableList(){
		return variableList;
	}
	
	public VariableCommand a;
	public DatatypeCommand b;
}
	
single_input :  simple_stmt
             | 	compound_stmt 
             ;

file_input : (stmt)*
           ;

eval_input:
       testlist
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
       
simple_stmt : small_stmt 
            ;

small_stmt 
	   : cmd=expr_stmt {commandList.add($cmd.result); }
           | report_stmt
           | setclone_stmt
           ;

expr_stmt returns [Command result]
  : ^(op=ASSIGN id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("Op1:"+$id1.result+"Op2:"+$id2.result+" "+$result);
    //commandList.add($result); 
  }
  | cmd=testlist{
    $result=$cmd.result;
  }
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

for_stmt returns [Command result]
  : ^(FORLOOP_CMD id1=exprlist id2=testlist id3=suite){
    
  }
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

report_stmt
	:	cmd=report_expr {commandList.add($cmd.result);}
	;
	
setclone_stmt
	:	cmd=setclone_expr {commandList.add($cmd.result);}
	;
	
suite : simple_stmt
      | INDENT (stmt)+ DEDENT
      | ^(INDENT stmt+) {}
      ;

test returns [Command result]
  : cmd=or_test {
      $result = $cmd.result;
    }
    ;

or_test returns [Command result]
  : ^(op=OR id1=or_test id2=or_test){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | (cmd=and_test){
    $result = $cmd.result;
  } 
  ;

and_test returns [Command result] 
  : ^(op=AND id1=and_test id2=and_test){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | (cmd=not_test){
    $result = $cmd.result;
  }
  ;

not_test returns [Command result] 
  : ^(op=NOT cmd=not_test){
    $result = new UnaryCommand($op.text, $cmd.result);
    System.out.println("Operator:"+$op.text+" "+$cmd.result+" "+$result);
    commandList.add($result);
  }
  | cmd=comparison{
    $result = $cmd.result;
  }
  ;

comparison returns [Command result]
  : ^(op=LESS id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=GREATER id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=EQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=GREATEREQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=LESSEQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=ALT_NOTEQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=NOTEQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=IN id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=NOTIN id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=IS id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | ^(op=ISNOT id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  } 
  | (cmd=expr){
    $result = $cmd.result;
  }
  ;

expr returns [Command result]
  : ^(op=VBAR id1=expr id2=expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | (cmd=xor_expr){
    $result = $cmd.result;
  } 
  ;

xor_expr returns [Command result]
  : ^(op=CIRCUMFLEX id1=xor_expr id2=xor_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | (cmd=and_expr){
    $result = $cmd.result;
  }
  ;

and_expr returns [Command result] 
  : ^(op=AMPER id1=and_expr id2=and_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
  }
  | (cmd=shift_expr){
    $result = $cmd.result;
  }
  ;

shift_expr returns [Command result]
  : ^(op=LEFTSHIFT id1=shift_expr id2=shift_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
    }
  | ^(op=RIGHTSHIFT id1=shift_expr id2=shift_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | (cmd=pcr_expr){
    $result = $cmd.result;
  }
  ;

pcr_expr returns [Command result]
  : ^(op=PCR_READMAP cmd=pcr_expr){
    $result = new PCRReadmapCommand($cmd.result);
  }
  | (cmd=arith_expr){ $result = $cmd.result;}
  ;

arith_expr returns [Command result]
  : ^(op=PLUS id1=arith_expr id2=arith_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
    }
  | ^(op=MINUS id1=arith_expr id2=arith_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | (cmd=term){
    $result = $cmd.result;
  }
  ;
  

term returns [Command result]
	: ^(op=STAR id1=term id2=term){ 
		$result = new BinaryCommand($op.text, $id1.result, $id2.result);
		System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
		commandList.add($result);
	}
	| ^(op=SLASH id1=term id2=term){
	  $result = new BinaryCommand($op.text, $id1.result, $id2.result);
	  System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
	  commandList.add($result);
	}
	| ^(op=DOUBLESLASH id1=term id2=term){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | ^(op=DOUBLESTAR id1=term id2=term){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+$result);
    commandList.add($result);
  }
  | (cmd=factor){
    $result = $cmd.result;
  }
     ;


factor returns [Command result] 
	: 
       cmd=power { $result = $cmd.result; }
       ;

power returns [Command result]
	: (id1=atom) (id2=inner_atom){
	  if($id1.result==null && $id2.result!=null){
	     $result = $id2.result;
	  }
	  else if ($id1.result!=null && $id2.result!=null){ 
		  $result = new VariableWithArgsCommand($id1.result, $id2.result);
		}
		else if ($id1.result!=null && $id2.result==null){
		  $result = $id1.result;
		}
		else
		  $result = null;
	} 
  ;
  
inner_atom returns [Command result]
  : cmd=trailer{ $result = $cmd.result;}
	;
	
atom returns [Command result]
	: ^(VARIABLE_CMD id1=NAME) {
	  if($id1.text.equals("int") | $id1.text.equals("long") | $id1.text.equals("float") | $id1.text.equals("range"))
	     $result = null;
	  else{
		  $result = new VariableCommand($id1.text);
		  System.out.println("Variable:"+$id1.text+" "+$result);
		  variableList.add($result);
		  }
	}
	| ^(VALUETYPE type=INT_TYPE id1=INT){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(VALUETYPE type=LONG_TYPE id1=LONGINT){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(VALUETYPE type=DOUBLE_TYPE id1=FLOAT){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(VALUETYPE type=STRING_TYPE id1=STRING){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(INNER_BRANCH cmd=testlist_gexp) {$result = $cmd.result;}
	;
	
report_expr returns [Command result]
	:^(REPORT_CMD id1=NAME id2=STRING cmd=arglist?){
		a = new VariableCommand($id1.text);
		System.out.println("Variable:"+$id1.text+ " "+a);
		variableList.add(a);
		
		b = new DatatypeCommand("STRING_TYPE",$id2.text);
		System.out.println("Value:"+$id2.text+" "+b);
		commandList.add(b);
		
		$result = new PCRReportCommand($id1.text, $id2.text, $cmd.result);
		System.out.println("Source:"+$id1.text+" Location:"+$id2.text+" Arguments:"+$cmd.result + " "+$result);
	}
	;
	
setclone_expr returns [Command result]
	:	^(SETCLONE_CMD id1=NAME){
			a = new VariableCommand($id1.text);
			System.out.println("Variable:"+$id1.text+ " "+a);
			variableList.add(a);
			
			$result = new PCRSetcloneCommand($id1.text);
			System.out.println("Source:"+$id1.text+ " "+$result);
	}
	;
	
listmaker returns [Command result]
          : ^(LIST id1=test id2=list_for){
            //$result = new ListCommand($id1.result, $id2.result);
          }
          ;

testlist_gexp returns [Command result]
    : cmd=test ( (options {k=2;}: test)* | gen_for){
    $result = $cmd.result;
    }        
    ;

trailer returns [Command result]
        : (cmd=arglist)? {
          if($cmd.result!=null){
        	 $result = new ArgumentsCommand($cmd.result);
        	 System.out.println($cmd.result);
        	 commandList.add($result);
        	 }
        } 
        | DOT NAME
        ;

exprlist returns [Command result]
  : cmd=expr {
    $result = $cmd.result;
  } 
  ;

testlist returns [Command result]
    : cmd=test {
      $result = $cmd.result;
    } 
    ;

dictmaker : test COLON test (options {k=2;}:COMMA test COLON test)* (COMMA)?
          ;

classdef: 'class' NAME (LPAREN testlist? RPAREN)? COLON suite
        ;

arglist returns [List result]
scope {List current; }
@init {$arglist::current = new ArrayList<Command>(); } 
	:  ^(ARGUMENTS argument+) { 
		$result = $arglist::current; 
		
	}
  ;

argument : cmd=test ( (ASSIGN test) | gen_for)? {
		$arglist::current.add($cmd.result);
	}
  ;

list_iter : list_for
          | list_if
          ;

list_for returns [Command result]
          : ^(LOOP id1=exprlist id2=testlist){
          //$result = new LoopCommand($id1.result, $id2.result);
          }
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



