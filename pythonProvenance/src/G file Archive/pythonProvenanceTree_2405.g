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
	
	/* 
	private ArrayList<Command> variableList = new ArrayList<Command>();
	public List<Command> getVariableList(){
		return variableList;
	}
	*/
	
	public VariableCommand a;
	public DatatypeCommand b;
	public String str;
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
     
/*       
stmt	:	simple_stmt
	|	compound_stmt
	;
*/

stmt 
@init {
  CommonTree ahead = (CommonTree)input.LT(1);
  int line = ahead.getToken().getLine();
  System.out.println("line=" + line);
}
	: 	simple_stmt
	|	compound_stmt
	;
	
stmt_inside_block 
	: id1=simple_stmt {$suite::currentStmt.add($id1.result); }
     	| id2=compound_stmt {$suite::currentStmt.add($id2.result);}
     	;
       
simple_stmt returns [Command result]
	: cmd=small_stmt {
		//$result = new Statements($cmd.result);
		$result = $cmd.result;
		//System.out.println("***Statements: " + $cmd.result + " " + $result);
	} 
        ;

small_stmt returns [Command result]
	: cmd=expr_stmt {
	   $result = $cmd.result;
	   commandList.add($cmd.result); 
	   }
     	| cmd=report_stmt {
     		$result = $cmd.result;
     	}
     	| cmd=setclone_stmt {
     		$result = $cmd.result;
     	}
     	| cmd=print_stmt {
     		$result = $cmd.result;
     		}
     	| cmd=import_stmt{
     		$result = $cmd.result;
     		}
     ;
     
print_stmt returns [Command result]
	: ^(PRINT_CMD cmd=printlist) {
		$result = new PrintCommand($cmd.result);
		System.out.println("***PrintCommand -> Arguments: " + $cmd.result + " " + $result);
		commandList.add($result);
	}
	;           
	
printlist returns [List result]
scope {List current; }
@init {$printlist::current = new ArrayList<Command>(); } 
	:  ^(PRINT_ARGS print_argument+) { 
		$result = $printlist::current; 
		System.out.println("List:"+$result);
		
	}
  ;

print_argument : cmd=test {
		$printlist::current.add($cmd.result);
		System.out.println("Current List:"+$printlist::current);
	}
  ;
  

import_stmt returns [Command result]
	: cmd=import_name { $result = $cmd.result ; }
	| cmd= import_from { $result = $cmd.result ; }
	;
	
import_from returns [Command result]
	: ^(IMPORT_CMD id1=NAME cmd=import_as_names){
		$result = new ImportCommand($id1.text, $cmd.result);
		System.out.println("***ImportCommand " + $id1.text + " " + $cmd.result + " "+ $result);
		commandList.add($result);
	}
	| ^(IMPORT_CMD id1=NAME id2=STAR){
		String id3 = $id1.text + $id2.text;
		$result = new ImportCommand(id3);
		System.out.println("***ImportCommand " + id3 + " " + $result);
		commandList.add($result);
	}
	;
import_as_names returns [List result]
scope {List current; }
@init {$import_as_names::current = new ArrayList<Command>(); } 
	:  ^(IMPORT_ARGS import_as_name+) { 
		$result = $import_as_names::current; 
		System.out.println("List:"+$result);
	}
  	;
  	
 
import_as_name returns [Command result]
	: ^(IMPORT_EQUIV id1=NAME id2=NAME?) {
		if($id2.text!=null)
			$result = new ImportEquivalent ($id1.text, $id2.text);
		else
			$result = new ImportEquivalent ($id1.text);
		
		commandList.add($result);
		System.out.println("***Import Equivalency " + $id1.text + "as" + $id2.text + " " + $result);
		$import_as_names::current.add($result);
		System.out.println("Current List:"+$import_as_names::current);
	}
	;
	
	
dotted_as_names returns [List result]
scope {List current; }
@init {$dotted_as_names::current = new ArrayList<Command>(); } 
	:  ^(IMPORT_ARGS dotted_as_name+) { 
		$result = $dotted_as_names::current; 
		System.out.println("List:"+$result);
	}
  	;

dotted_as_name returns [Command result]
	: ^(IMPORT_EQUIV id1=IMPORT_NAME id2=NAME?) {
		if($id2.text!=null)
			$result = new ImportEquivalent ($id1.text, $id2.text);
		else
			$result = new ImportEquivalent ($id1.text);
		
		commandList.add($result);
		System.out.println("***Import Equivalency " + $id1.text + "as" + $id2.text + " " + $result);
		$dotted_as_names::current.add($result);
		System.out.println("Current List:"+$dotted_as_names::current);
	}
	| ^(IMPORT_EQUIV id1=NAME id2=NAME?) {
		if($id2.text!=null)
			$result = new ImportEquivalent ($id1.text, $id2.text);
		else
			$result = new ImportEquivalent ($id1.text);
		
		commandList.add($result);
		System.out.println("***Import Equivalency " + $id1.text + "as" + $id2.text + " " + $result);
		$dotted_as_names::current.add($result);
		System.out.println("Current List:"+$dotted_as_names::current);
	}
	;
	
import_name returns [Command result]
	: ^(IMPORT_CMD cmd=dotted_as_names){
		$result = new ImportCommand($cmd.result);
		System.out.println("***ImportCommand " + $cmd.result + " "+ $result);
		commandList.add($result);
	}
	;
	  	
pcr_stmt returns [Command result]
	:	cmd=readmap_expr {$result = $cmd.result; }
	|	cmd=scalar_expr {$result = $cmd.result; }
	| cmd=min_expr {$result = $cmd.result; }
	| cmd=max_expr {$result = $cmd.result; }
	| cmd=cover_expr {$result = $cmd.result; }
	| cmd=ifthen_expr {$result = $cmd.result; }
	| cmd=ifthenelse_expr {$result = $cmd.result; }
	| cmd=areatotal_expr {$result = $cmd.result; }
	| cmd=accuthresholdflux_expr {$result = $cmd.result; }
	
	;
	
func_stmt returns [Command result]
	: cmd=func_expr {$result = $cmd.result; }
	;
	
expr_stmt returns [Command result]
  : ^(op=ASSIGN id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    //System.out.println("----------------------------------------------------");
    //commandList.add($result); 
  }
  | ^(op=PLUSEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=MINUSEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=STAREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=SLASHEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=PERCENTEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=AMPEREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=VBAREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=CIRCUMFLEXEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=LEFTSHIFTEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=RIGHTSHIFTEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=DOUBLESTAREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | ^(op=DOUBLESLASHEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+$result);
    }
  | cmd=testlist{
    $result=$cmd.result;
  }
  ;

compound_stmt returns [Command result]
	      : if_stmt 
              | while_stmt 
              | cmd=for_stmt { 
              	$result = $cmd.result;
              	//$result = new Statements($cmd.result);
              	//System.out.println("***Statements:"+$cmd.result+" "+$result);
              	
              }
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
    	$result = new ForLoopCommand($id1.result, $id2.result, $id3.result);
    	System.out.println("***ForLoop -> " + $id1.result + " "+$id2.result + " "+$id3.result);
    	commandList.add($result);
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

report_stmt returns [Command result]
	:	cmd=report_expr {$result = $cmd.result; commandList.add($cmd.result);}
	;
	
setclone_stmt returns [Command result]
	:	cmd=setclone_expr {$result = $cmd.result; commandList.add($cmd.result);}
	;

/*	
readmap_stmt returns [Command result]
	:	cmd=readmap_expr {$result = $cmd.result;}
	;
	
scalar_stmt returns [Command result]
	:	cmd=scalar_expr {$result = $cmd.result;}
	;
*/	
suite returns [List result]
scope {List currentStmt; }
@init {$suite::currentStmt = new ArrayList<Command>(); } 
	:^(INDENT stmt_inside_block+) {
      		$result = $suite::currentStmt;
      		System.out.println("List of Statements inside block: " + $result);
      		
        }
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
  | (cmd=arith_expr){
    $result = $cmd.result;
  }
  ;
/*
pcr_expr returns [Command result]
  : ^(op=PCR_READMAP cmd=pcr_expr){
    $result = new PCRReadmapCommand($cmd.result);
  }
  | (cmd=arith_expr){ $result = $cmd.result;}
  ;
*/

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
	: (id1=atom) (id2=trailer){
	  if($id1.result==null && $id2.result!=null){
	     $result = $id2.result;
	  }
	  else if ($id1.result!=null && $id2.result!=null){   		
		 $result = new VariableWithArgsCommand($id1.result, $id2.result);
		 System.out.println("***Variable with Args:"+$id1.result +" "+$id2.result+ " "+$result); 
	  	 commandList.add($result);
	}
	else if ($id1.result!=null && $id2.result==null){
		$result = $id1.result;
	}
	else
		$result = null;
	} 
  ;

	
atom returns [Command result]
	: ^(VARIABLE_CMD id1=NAME) {
	  if($id1.text.equals("int") | $id1.text.equals("long") | $id1.text.equals("float") | $id1.text.equals("range"))
	     $result = null;
	  else{
		  $result = new VariableCommand($id1.text);
		  System.out.println("***Variable:"+$id1.text+" "+$result);
		  commandList.add($result);
		  }
	}
	| ^(VALUETYPE type=INT_TYPE id1=INT){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("***Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(VALUETYPE type=LONG_TYPE id1=LONGINT){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("***Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(VALUETYPE type=DOUBLE_TYPE id1=FLOAT){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("***Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(VALUETYPE type=STRING_TYPE id1=STRING){
		$result = new DatatypeCommand($type.text,$id1.text);
		System.out.println("***Value:"+$id1.text+" "+$result);
		commandList.add($result);
	}
	| ^(INNER_BRANCH cmd=testlist_gexp) {$result = $cmd.result;}
	| (cmd=listmaker) {result=$cmd.result;}
	| ^(PCR_CMD cmd=pcr_stmt) {$result = $cmd.result;}
	| ^(FUNC_CMD cmd=func_stmt) {$result = $cmd.result;}
	;
	
report_expr returns [Command result]
	:^(REPORT_CMD id1=NAME id2=STRING cmd=trailer){
		a = new VariableCommand($id1.text);
		System.out.println("***Variable:"+$id1.text+ " "+a);
		commandList.add(a);
		
		b = new DatatypeCommand("STRING_TYPE",$id2.text);
		System.out.println("***Value:"+$id2.text+" "+b);
		commandList.add(b);
		
		$result = new PCRReportCommand(a, b, $cmd.result);
		System.out.println("***PCRReport -> Source:"+a+" Location:"+b+" Arguments:"+$cmd.result + " "+$result);
	}
	;
	
setclone_expr returns [Command result]
	:	^(SETCLONE_CMD id1=NAME){
			a = new VariableCommand($id1.text);
			System.out.println("Variable:"+$id1.text+ " "+a);
			commandList.add(a);
			
			$result = new PCRSetcloneCommand(a);
			System.out.println("***PCRSetclone -> Source:"+a+ " "+$result);
	}
	;
	
readmap_expr returns [Command result]
  : cmd=inner_readmap_expr {$result = $cmd.result;} 
  ;


inner_readmap_expr returns [Command result]
  : ^(READMAP_CMD id1=NAME) {
        a = new VariableCommand($id1.text);
        System.out.println("***Variable:"+$id1.text+ " "+a);
        commandList.add(a);
        
        $result = new PCRReadmapCommand(a);
        System.out.println("***PCRReadmap -> Source:"+a+ " "+$result);
        commandList.add($result);
  
  }
  | ^(READMAP_CMD id1=STRING cmd=trailer){
        b = new DatatypeCommand("STRING_TYPE", $id1.text);
        System.out.println("***Value:"+$id1.text+ " "+b);
        commandList.add(b);
        
        $result = new PCRReadmapCommand(b, $cmd.result);
        System.out.println("***PCRReadmap -> Source:"+b+ " "+"Arguments:"+$cmd.result+" "+$result);
        commandList.add($result);
  
  }
  ;
  
scalar_expr returns [Command result]
  : cmd=inner_scalar_expr {$result = $cmd.result;}
  ;
  
inner_scalar_expr returns [Command result]
  : ^(SCALAR_CMD id1=INT){
        b = new DatatypeCommand("INT_TYPE",$id1.text);
        System.out.println("***Value:"+$id1.text+" "+b);
        commandList.add(b);
        
        $result = new PCRScalarCommand(b);
        System.out.println("***PCRScalar -> Value:"+b+" "+$result);
        commandList.add($result);
  }
  | ^(SCALAR_CMD id1=STRING cmd=trailer){
        b = new DatatypeCommand("STRING_TYPE",$id1.text);
        System.out.println("***Value:"+$id1.text+" "+b);
        commandList.add(b);
        
        $result = new PCRScalarCommand(b, $cmd.result);
        System.out.println("***PCRScalar -> Value:"+b+ " "+"Arguments:"+$cmd.result+" "+$result);
        commandList.add($result);
  
  }
  | ^(SCALAR_CMD id1=NAME){
        a = new VariableCommand($id1.text);
        System.out.println("***Variable:"+$id1.text+" "+a);
        commandList.add(a);
        
        $result = new PCRScalarCommand(a);
        System.out.println("***PCRScalar -> Value:"+a+" "+$result);
        commandList.add($result);
  }
  ;
  
min_expr returns [Command result]
  :  ^(MIN_CMD cmd=trailer){
        $result = new PCROperationsCommand("pcr.min",$cmd.result);
        System.out.println("***PCRMin -> Arguments: " + $cmd.result + " " + $result);
        commandList.add($result);
  }
  ;
  
max_expr returns [Command result]
  :  ^(MAX_CMD cmd=trailer){
        $result = new PCROperationsCommand("pcr.max",$cmd.result);
        System.out.println("***PCRMax -> Arguments: " + $cmd.result + " " + $result);
        commandList.add($result);
  }
  ;
  
cover_expr returns [Command result]
  :  ^(COVER_CMD cmd=trailer){
        $result = new PCROperationsCommand("pcr.cover",$cmd.result);
        System.out.println("***PCRCover -> Arguments: " + $cmd.result + " " + $result);
        commandList.add($result);
  }
  ;

ifthen_expr returns [Command result]
  :  ^(IFTHEN_CMD cmd=trailer){
        $result = new PCROperationsCommand("pcr.ifthen",$cmd.result);
        System.out.println("***PCRIfthen -> Arguments: " + $cmd.result + " " + $result);
        commandList.add($result);
  }
  ;
  
ifthenelse_expr returns [Command result]
  :  ^(IFTHENELSE_CMD cmd=trailer){
        $result = new PCROperationsCommand("pcr.ifthenelse",$cmd.result);
        System.out.println("***PCRIfthenelse -> Arguments: " + $cmd.result + " " + $result);
        commandList.add($result);
  }
  ;
  
areatotal_expr returns [Command result]
  :  ^(AREATOTAL_CMD cmd=trailer){
        $result = new PCROperationsCommand("pcr.areatotal",$cmd.result);
        System.out.println("***PCRAreatotal -> Arguments: " + $cmd.result + " " + $result);
        commandList.add($result);
  }
  ;

accuthresholdflux_expr returns [Command result]
  : ^(ACCUTHRESHOLDFLUX_CMD cmd=trailer){
        $result = new PCROperationsCommand("pcr.accuthresholdflux",$cmd.result);
        System.out.println("***PCRAccuthresholdflux -> Arguments: " + $cmd.result + " " + $result);
        commandList.add($result);        
  }
  ;

func_expr returns [Command result]
	: ^(FUNC_CALL_CMD id1=FUNCTION_NAME cmd=trailer){
		$result = new FunctionCallCommand($id1.text, $cmd.result);
		commandList.add($result);
		System.out.println("***FunctionCall -> " + $id1.text + " Args: "+$cmd.result+ " " +$result);
	}	
	;
	
listmaker returns [Command result]
          : ^(LISTCOMPREHENSION_CMD id1=test id2=list_for?){
          	if($id2.result!=null){
             		$result = new ListComprehensionCommand($id1.result, $id2.result);
             		System.out.println("***ListComprehension -> Arguments: " + $id1.result + " " + $id2.result + " " + $result);
             		commandList.add($result);
             	}
             	else{
             		$result = new ListComprehensionCommand($id1.result);
             		System.out.println("***ListComprehension -> Arguments: " + $id1.result + " " + $result);
             		commandList.add($result);
             	}
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
        	 System.out.println("Arguments:"+$cmd.result+" "+$result);
        	 commandList.add($result);
        	 }
        } 
        
        | (cmd=subscriptlist) {
          	$result = new SubscriptsCommand($cmd.result);
          	System.out.println("Subscripts:"+$cmd.result+" "+$result);
          	commandList.add($result);
        }
        | ^(DOTFUNCTION id1=NAME id2=arglist){
        	str = "."+$id1.text;
        	$result = new FunctionCommand(str,$id2.result);
        	System.out.println("***Function:"+str+" "+$id2.result+ " "+$result);
        	commandList.add($result);
        	}
        ;


subscriptlist returns [List result]
scope {List current; }
@init {$subscriptlist::current = new ArrayList<Command>(); } 
	: ^(SUBSCRIPTS subscript){
		$result = $subscriptlist::current; 
		System.out.println("Subscript List:"+$result);
	}
              ;

subscript
	: 
	cmd=test {
        	$subscriptlist::current.add($cmd.result);
		System.out.println("Current Subscript List:"+$subscriptlist::current);
        }
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
		System.out.println("List:"+$result);
		
	}
  ;

argument : cmd=test {
		$arglist::current.add($cmd.result);
		System.out.println("Current List:"+$arglist::current);
	}
  ;

list_iter returns [Command result]
	: cmd=list_for {$result = $cmd.result;}
        | cmd=list_if {$result = $cmd.result;}
        ;

list_for returns [Command result]
          : ^(LISTLOOPCONTROL_CMD id1=exprlist id2=testlist id3=list_iter?){
          	if($id3.result!=null){
          		$result = new ListLoopControlCommand($id1.result, $id2.result, $id3.result);
          		System.out.println("***ListLoopControl -> Args: " + $id1.result +" "+$id2.result+" "+$id3.result + " "+$result);
          		commandList.add($result);
          	}
          	else
          		{
          		$result = new ListLoopControlCommand($id1.result, $id2.result);
          		System.out.println("***ListLoopControl -> Args: " + $id1.result +" "+$id2.result+ " "+$result);
          		commandList.add($result);
          	}
          }
         ;

list_if returns [Command result]
	: ^(LISTCONDITION_CMD id1=test id2=list_iter?){
		$result = new ListConditionCommand ($id1.result, $id2.result);
          	System.out.println("***ListCondition -> Args: " + $id1.result +" "+$id2.result+" "+ " "+$result);
          	commandList.add($result);
          }
        ;

gen_iter: gen_for
        | gen_if
        ;

gen_for: 'for' exprlist 'in' or_test gen_iter?
       ;

gen_if: 'if' test gen_iter?
      ;



