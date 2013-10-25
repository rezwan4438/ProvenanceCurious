tree grammar PythonProvenanceTree;

options	{
	ASTLabelType = CommonTree;
	tokenVocab = pythonProvenance;
	}
	

@header	{
  package pythonProvenance;
  import pythonProvenance.commands.*;
  import java.util.*;
  import org.antlr.runtime.BitSet;
}

@members{
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

funcdef returns [Command result]
	: ^(OUTER_FUNCTION_CMD id1=NAME id2=parameters id3=suite){
		if($id2.result!=null){
			$result = new FunctionDefinitionCommand($id1.text, $id2.result, $id3.result, line);	
			
			int start = ((FunctionDefinitionCommand)($result)).findStartLine();
        		((FunctionDefinitionCommand)($result)).setStartLine(start);
			
			System.out.println("***FunctionDefinition -> " + $id1.text + " Parameters: "+$id2.result + " Suite: "+$id3.result +" Start: " + ((FunctionDefinitionCommand)($result)).getStartLine() + " End: " + ((FunctionDefinitionCommand)($result)).getEndLine() + " " + $result );
    			commandList.add($result);
    		}
    		else{
    			$result = new FunctionDefinitionCommand($id1.text, $id3.result, line);	
    			
    			int start = ((FunctionDefinitionCommand)($result)).findStartLine();
        		((FunctionDefinitionCommand)($result)).setStartLine(start);
    			
			System.out.println("***FunctionDefinition -> " + $id1.text + " Suite: "+$id3.result +" Start: " + ((FunctionDefinitionCommand)($result)).getStartLine() + " End: " + ((FunctionDefinitionCommand)($result)).getEndLine() + " " + $result );
    			commandList.add($result);
    		}
	}
        ;

parameters returns [Command result] 
	: (cmd=varargslist)? {
		if($cmd.result!=null){
			$result = new ArgumentsCommand($cmd.result, line);
        	 	System.out.println("Arguments:"+$cmd.result+" "+" Line: " + line + " " +$result);
        	 	commandList.add($result);
        	 }
	}
        ;

varargslist returns [List result]
scope{List current;}
@init{$varargslist::current = new ArrayList<Command>();}
	: ^(OUTER_FUNCTION_ARGS defparameter+){
		$result = $varargslist::current;
		System.out.println("List:"+$result);
	}
        ;

defparameter 
	: id1=test (ASSIGN test)?{
		$varargslist::current.add($id1.result);
		System.out.println("Current List:"+$varargslist::current);
	}
        ;

stmt 	: 	simple_stmt
	|	compound_stmt
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
	   }
     	| cmd=print_stmt {
     		$result = $cmd.result;
     		}
     	| cmd=import_stmt{
     		$result = $cmd.result;
     		}
     	| cmd=flow_stmt{
     		$result = $cmd.result;
     		}
     ;
     
print_stmt returns [Command result]
	: ^(PRINT_CMD cmd=printlist) {
		$result = new PrintCommand($cmd.result, line);
		System.out.println("***PrintCommand -> Arguments: " + $cmd.result +" Line: " + line + " " + $result);
		commandList.add($result);
		Iterator<Command> cit = $cmd.result.iterator();
		while(cit.hasNext()){
			commandList.remove(cit.next());
		}
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

print_argument : cmd=testlist {
		$printlist::current.add($cmd.result);
		System.out.println("Current List:"+$printlist::current);
		commandList.remove($cmd.result);
		if(cmd instanceof BinaryCommand){
			commandList.remove(((BinaryCommand)cmd).getOperand1());
			commandList.remove(((BinaryCommand)cmd).getOperand2());
		}
	}
  ;
  
import_stmt returns [Command result]
	: cmd=import_name { $result = $cmd.result ; }
	| cmd= import_from { $result = $cmd.result ; }
	;
	
import_from returns [Command result]
	: cmd=import_from_name { $result = $cmd.result;}
	| cmd=import_from_dotted_name { $result = $cmd.result;}
	;
	
import_from_name returns [Command result]
	: ^(IMPORT_CMD id1=NAME cmd=import_as_names){
		$result = new ImportCommand($id1.text, $cmd.result, line);
		System.out.println("***ImportCommand " + $id1.text + " " + $cmd.result + " Line: "+ line + " " +$result);
		commandList.add($result);
		
		Iterator<ImportEquivalent> it = $cmd.result.iterator();
		while(it.hasNext()){
			ImportEquivalent temp = it.next();
			String str = $id1.text + "." + temp.getOp1();
			temp.setOp1(str);
		}
	}
	| ^(IMPORT_CMD id1=NAME id2=STAR){
		c = new ImportEquivalent($id1.text, $id1.text, line);
		//System.out.println("***Import Equivalency " + $id1.text + " as " + $id1.text + " Line: "+ line + " " + c);
		importPairsList.add(c);
		
		String id3 = $id1.text;
		$result = new ImportCommand(id3, line);
		System.out.println("***ImportCommand " + id3 + " Line: "+ line + " " + $result);
		commandList.add($result);
	}
	;
	
import_from_dotted_name returns [Command result]
	: ^(IMPORT_CMD id1=DOTTED_NAME cmd=import_as_names){
		$result = new ImportCommand($id1.text, $cmd.result, line);
		System.out.println("***ImportCommand " + $id1.text + " " + $cmd.result + " Line: "+ line + " " +$result);
		commandList.add($result);
		
		Iterator<ImportEquivalent> it = $cmd.result.iterator();
		while(it.hasNext()){
			ImportEquivalent temp = it.next();
			String str = $id1.text + "." + temp.getOp1();
			temp.setOp1(str);
		}
	}
	| ^(IMPORT_CMD id1=DOTTED_NAME id2=STAR){
		
		c = new ImportEquivalent($id1.text, $id1.text, line);
		//System.out.println("***Import Equivalency " + $id1.text + " as " + $id1.text + " Line: "+ line + " " + c);
		importPairsList.add(c);
		
		String id3 = $id1.text;
		$result = new ImportCommand(id3, line);
		System.out.println("***ImportCommand " + id3 + " Line: "+ line + " " + $result);
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
  	
 
import_as_name
	: ^(IMPORT_EQUIV id1=DOTTED_NAME id2=NAME?) {
		if($id2.text!=null){
			c = new ImportEquivalent ($id1.text, $id2.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id2.text + " Line: "+ line + " " + c);
		}
		else{
			c = new ImportEquivalent ($id1.text, $id1.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id1.text + " Line: "+ line + " " + c);
		}
		
		importPairsList.add(c);
		$dotted_as_names::current.add(c);
		System.out.println("Current List:"+$dotted_as_names::current);
	}
	| ^(IMPORT_EQUIV id1=NAME id2=NAME?) {
		if($id2.text!=null){
			c = new ImportEquivalent ($id1.text, $id2.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id2.text + " Line: "+ line + " " + c);
		}
		else{
			c = new ImportEquivalent ($id1.text, $id1.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id1.text + " Line: "+ line + " " + c);
		}
		importPairsList.add(c);
		$import_as_names::current.add(c);
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

dotted_as_name
	: ^(IMPORT_EQUIV id1=DOTTED_NAME id2=NAME?) {
		if($id2.text!=null){
			c = new ImportEquivalent ($id1.text, $id2.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id2.text + " Line: "+ line + " " + c);
		}
		else{
			c = new ImportEquivalent ($id1.text, $id1.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id1.text + " Line: "+ line + " " + c);
		}
		
		importPairsList.add(c);
		$dotted_as_names::current.add(c);
		System.out.println("Current List:"+$dotted_as_names::current);
	}
	| ^(IMPORT_EQUIV id1=NAME id2=NAME?) {
		if($id2.text!=null){
			c = new ImportEquivalent ($id1.text, $id2.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id2.text + " Line: "+ line + " " + c);
		}
		else{
			c = new ImportEquivalent ($id1.text, $id1.text, line);
			//System.out.println("***Import Equivalency " + $id1.text + " as " + $id1.text + " Line: "+ line + " " + c);
		}
		
		importPairsList.add(c);
		$dotted_as_names::current.add(c);
		System.out.println("Current List:"+$dotted_as_names::current);
	}
	;
	
import_name returns [Command result]
	: ^(IMPORT_CMD cmd=dotted_as_names){
		$result = new ImportCommand($cmd.result, line);
		System.out.println("***ImportCommand " + $cmd.result + " Line: "+ line + " " + $result);
		commandList.add($result);
	}
	;
	  		
expr_stmt returns [Command result]
  : ^(op=ASSIGN id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=PLUSEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=MINUSEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=STAREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=SLASHEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=PERCENTEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=AMPEREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=VBAREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=CIRCUMFLEXEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=LEFTSHIFTEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=RIGHTSHIFTEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=DOUBLESTAREQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | ^(op=DOUBLESLASHEQUAL id1=testlist id2=testlist){
    $result = new AssignCommand($op.text,$id1.result, $id2.result, line);
    System.out.println("***AssignCommand -> Op1:"+$id1.result+"  Op2:"+$id2.result+"  "+" Line: " + line + " " + $result);
    commandList.add($result); 
    }
  | cmd=testlist{
    $result=$cmd.result;
  }
  ;

flow_stmt returns [Command result]
	: cmd=return_stmt{
		$result = $cmd.result;
	}
	;
	
return_stmt returns [Command result]
	: ^(RETURN_CMD cmd=arglist){
		if($cmd.result!=null){
			$result = new ReturnCommand($cmd.result, line);
			System.out.println("***ReturnCommand "+$cmd.result + " " +"Line: " + line + " " +$result);
			commandList.add($result);
		}
	}
	;

compound_stmt returns [Command result]
	      : cmd=if_stmt { $result = $cmd.result; } 
	      | cmd=while_stmt { $result = $cmd.result; }
              | cmd=for_stmt { $result = $cmd.result; }
              | cmd=try_stmt { $result = $cmd.result; } 
              | cmd=funcdef { $result = $cmd.result; }
              | cmd=classdef { $result = $cmd.result; } 
              | cmd=with_stmt{$result = $cmd.result;}
              ;
              
if_stmt returns [Command result]
	: ^(IFBLOCK id1=if_clause id2=elif_clauses? id3=else_clause?){
		if($id1.result!=null && $id2.result!=null && $id3.result!=null){
			$result = new IfBlockCommand($id1.result, $id2.result, $id3.result, line);
			
			int start = ((IfBlockCommand)($result)).findStartLine();
        		((IfBlockCommand)($result)).setStartLine(start);
        		
			System.out.println("***IfBlockCommand -> "+ $id1.result+ " "+ $id2.result +" "+ $id3.result+" Start: " + ((IfBlockCommand)($result)).getStartLine() + " End: " + ((IfBlockCommand)($result)).getEndLine() + " " + $result );
			commandList.add($result);
		}
		else if($id1.result!=null && $id2.result==null && $id3.result!=null){
      			$result = new IfBlockCommand($id1.result, $id3.result, line);
      			
      			int start = ((IfBlockCommand)($result)).findStartLine();
        		((IfBlockCommand)($result)).setStartLine(start);
        		
      			
      			System.out.println("***IfBlockCommand -> "+ $id1.result+ " "+ $id3.result+" Start: " + ((IfBlockCommand)($result)).getStartLine() + " End: " + ((IfBlockCommand)($result)).getEndLine() + " " + $result );
      			commandList.add($result);
    		}
    		else if($id1.result!=null && $id2.result==null && $id3.result==null){
      			$result = new IfBlockCommand($id1.result, line);
      
      			int start = ((IfBlockCommand)($result)).findStartLine();
        		((IfBlockCommand)($result)).setStartLine(start);
        	
      			System.out.println("***IfBlockCommand -> "+ $id1.result+" Start: " + ((IfBlockCommand)($result)).getStartLine() + " End: " + ((IfBlockCommand)($result)).getEndLine() + " " + $result );
      			commandList.add($result);
    		}
    		else if($id1.result!=null && $id2.result!=null && $id3.result==null){
      			$result = new IfBlockCommand($id1.result, $id2.result, line);
      
      			int start = ((IfBlockCommand)($result)).findStartLine();
        		((IfBlockCommand)($result)).setStartLine(start);
        		
      			System.out.println("***IfBlockCommand -> "+ $id1.result+ " " +$id2.result+ " Start: " + ((IfBlockCommand)($result)).getStartLine() + " End: " + ((IfBlockCommand)($result)).getEndLine() + " " + $result );
      			commandList.add($result);
    		}
    		else{
    
    		}
	}
       	;
       	
if_clause returns [Command result]
	: ^(IF_CMD id1=test id2=suite){
		$result = new IfClauseCommand($id1.result, $id2.result, line);
		
		int start = ((IfClauseCommand)($result)).findStartLine();
        	((IfClauseCommand)($result)).setStartLine(start);
		
		System.out.println("***IfClauseCommand -> " + $id1.result + " "+ $id2.result + " Start: " + ((IfClauseCommand)($result)).getStartLine() + " End: " + ((IfClauseCommand)($result)).getEndLine() + " " + $result );
		commandList.add($result);
	}
	;
	
elif_clauses returns [List result]
scope{List current; }
@init{$elif_clauses::current = new ArrayList<Command>();}
	: ^(ELIF_CLAUSES elif_clause+){
		$result = $elif_clauses::current;
		System.out.println("List:"+$result);
	}
	;
		
elif_clause
	: ^(ELIF_CMD id1=test id2=suite){
		d = new ElifClauseCommand($id1.result, $id2.result, line);
		
		int start = ((ElifClauseCommand)(d)).findStartLine();
        	((ElifClauseCommand)(d)).setStartLine(start);
        	
		System.out.println("***ElifClauseCommand -> "+ $id1.result + " " + $id2.result + " Start: " + ((ElifClauseCommand)(d)).getStartLine() + " End: " + ((ElifClauseCommand)(d)).getEndLine() + " " + d );
		commandList.add(d);
		
		$elif_clauses::current.add(d);
		System.out.println("Current List:"+$elif_clauses::current);
	} 
        ;

else_clause returns [Command result]
  : ^(ELSE_CMD cmd=suite){
      $result = new ElseClauseCommand($cmd.result, line);
      
      int start = ((ElseClauseCommand)($result)).findStartLine();
      ((ElseClauseCommand)($result)).setStartLine(start);
        	
      System.out.println("***ElseClauseCommand -> " + $cmd.result + " Start: " + ((ElseClauseCommand)($result)).getStartLine() + " End: " + ((ElseClauseCommand)($result)).getEndLine() + " " + $result );
      commandList.add($result);
  }
  ;

while_stmt returns [Command result]
  : ^(WHILEBLOCK id1=while_clause id2=else_clause?){
      if($id1.result!=null && $id2.result!=null){
        $result = new WhileBlockCommand($id1.result,$id2.result, line);
        
        int start = ((WhileBlockCommand)($result)).findStartLine();
      ((WhileBlockCommand)($result)).setStartLine(start);
      
        System.out.println("***WhileBlockCommand -> " + $id1.result + " " + $id2.result + " Start: " + ((WhileBlockCommand)($result)).getStartLine() + " End: " +((WhileBlockCommand)($result)).getEndLine() + " " + $result);
        commandList.add($result);
      }
      else if ($id1.result!=null && $id2.result==null){
        $result = new WhileBlockCommand($id1.result, line);
        
        int start = ((WhileBlockCommand)($result)).findStartLine();
      ((WhileBlockCommand)($result)).setStartLine(start);
      
        System.out.println("***WhileBlockCommand -> " + $id1.result + " Start: " + ((WhileBlockCommand)($result)).getStartLine() + " End: " +((WhileBlockCommand)($result)).getEndLine() + " " + $result);
        commandList.add($result);
      }
      else{
      }
  }
  ;
  
while_clause returns [Command result]
  : ^(WHILE_CMD id1=test id2=suite){
      $result = new WhileClauseCommand($id1.result, $id2.result, line);
      
      int start = ((WhileClauseCommand)($result)).findStartLine();
      ((WhileClauseCommand)($result)).setStartLine(start);
      
      System.out.println("***WhileClauseCommand -> " + $id1.result + " "+ $id2.result +" Start: " + ((WhileClauseCommand)($result)).getStartLine() + " End: " +((WhileClauseCommand)($result)).getEndLine() + " " + $result);
      commandList.add($result);
      if($id1.result instanceof MethodCommand)
      	commandList.remove($id1.result);
      
  }
  ;

for_stmt returns [Command result]
  : ^(FORLOOP_CMD id1=exprlist id2=testlist id3=suite){
  	// start line number
    	$result = new ForLoopCommand($id1.result, $id2.result, $id3.result, line);
    	
    	int start = ((ForLoopCommand)($result)).findStartLine();
      	((ForLoopCommand)($result)).setStartLine(start);
      
    	System.out.println("***ForLoopCommand -> " + $id1.result + " "+$id2.result + " "+$id3.result+" Start: " + ((ForLoopCommand)($result)).getStartLine() + " End: " +((ForLoopCommand)($result)).getEndLine() + " " + $result);
    	commandList.add($result);
    	
    	//commandList.remove($id1.result);
    	
    	if($id2.result instanceof MethodCommand)
      		commandList.remove($id2.result);
  }
  ;
  
try_stmt returns [Command result] 
  : ^(TRYBLOCK id1=try_clause id2=except_clause id3=finally_clause?){
      if($id1.result!=null && $id2.result!=null && $id3.result!=null){
        $result = new TryBlockCommand($id1.result, $id2.result, $id3.result, line);
        
        int start = ((TryBlockCommand)($result)).findStartLine();
        ((TryBlockCommand)($result)).setStartLine(start);
      
        System.out.println("***TryBlockCommand -> " + $id1.result + " " + $id2.result + " " + $id3.result + " Start: " + ((TryBlockCommand)($result)).getStartLine() + " End: " + ((TryBlockCommand)($result)).getEndLine() + " " + $result);
        commandList.add($result);
      }
      else if($id1.result!=null && $id2.result!=null && $id3.result==null){
        $result = new TryBlockCommand($id1.result, $id2.result, $id3.result, line);
        
        int start = ((TryBlockCommand)($result)).findStartLine();
        ((TryBlockCommand)($result)).setStartLine(start);
      
        System.out.println("***TryBlockCommand -> " + $id1.result + " " + $id2.result + " Start: " + ((TryBlockCommand)($result)).getStartLine() + " End: " + ((TryBlockCommand)($result)).getEndLine() + " " + $result);
        commandList.add($result);
      }      
      else{
      }
  }
  ;
  
try_clause returns [Command result]
  : ^(TRY_CMD cmd=suite){
      $result = new TryClauseCommand($cmd.result, line);
      
      int start = ((TryClauseCommand)($result)).findStartLine();
      ((TryClauseCommand)($result)).setStartLine(start);
      
      System.out.println("***TryClauseCommand -> " + $cmd.result + " Start: " + ((TryClauseCommand)($result)).getStartLine() + " End: " + ((TryClauseCommand)($result)).getEndLine() + " " + $result);
      commandList.add($result);
      
  }
  ;
  
except_clause returns [Command result]
  : ^(EXCEPT_CMD id1=trailer? id2=suite ){
      if($id1.result!=null && $id2.result!=null){
        $result = new ExceptClauseCommand($id1.result, $id2.result, line);
        
        int start = ((ExceptClauseCommand)($result)).findStartLine();
      	((ExceptClauseCommand)($result)).setStartLine(start);
        
        System.out.println("***ExceptClauseCommand -> " + $id1.result + " " + $id2.result + " Start: " +((ExceptClauseCommand)($result)).getStartLine() + " End: " + ((ExceptClauseCommand)($result)).getEndLine() + " " + $result);
        commandList.add($result);
      }
      
      else if($id1.result==null && $id2.result!=null){
         $result = new ExceptClauseCommand($id1.result, $id2.result, line);
        
        int start = ((ExceptClauseCommand)($result)).findStartLine();
      	((ExceptClauseCommand)($result)).setStartLine(start);
        
        System.out.println("***ExceptClauseCommand -> " + $id2.result + " Start: " +((ExceptClauseCommand)($result)).getStartLine() + " End: " + ((ExceptClauseCommand)($result)).getEndLine() + " " + $result);
        commandList.add($result);
      } 
      
      else{
      }
  }
  ;

finally_clause returns [Command result]
  : ^(FINALLY_CMD cmd=suite){
      $result = new FinallyClauseCommand($cmd.result, line);
      
      int start = ((FinallyClauseCommand)($result)).findStartLine();
      ((FinallyClauseCommand)($result)).setStartLine(start);
      	
      System.out.println("***FinallyClauseCommand -> " + $cmd.result + " Start: " +((FinallyClauseCommand)($result)).getStartLine() + " End: " + ((FinallyClauseCommand)($result)).getEndLine() + " " + $result);
      commandList.add($result);
  }
  ;


with_stmt returns [Command result]: ^(WITH_CMD id1=with_clause id2=suite){
	$result = new WithCommand($id1.result, $id2.result, line);
	
	((WithCommand)($result)).setStartLine();
	
	System.out.println("***WithBlockCommand -> " + $id2.result + " Start: " +((WithCommand)($result)).getStartLine() + " End: " + ((WithCommand)($result)).getEndLine() + " " + $result);
      	commandList.add($result);
	}
        ;
    
with_clause returns [List result]
scope {List current; }
@init {$with_clause::current = new ArrayList<Command>(); } 
	:  ^(WITH_ARGS with_item+) { 
		$result = $with_clause::current; 
		System.out.println("List:"+$result);
	}
  	;    
	
with_item
	: ^(WITH_EQUIV id1=test id2=test?){
	
		if($id2.result!=null){
			w = new WithEquivalent ($id1.result, $id2.result, line);
			System.out.println("***With Equivalency " + $id1.result + " as " + $id2.result + " Line: "+ line + " " + c);
		}
		else{
			w = new WithEquivalent ($id1.result, $id1.result, line);
			System.out.println("***With Equivalency " + $id1.result + " as " + $id2.result + " Line: "+ line + " " + c);
		}
		withPairsList.add(w);
		$with_clause::current.add(w);
		System.out.println("Current List:"+$with_clause::current);
	}
	;
	

suite returns [List result]
scope {List currentStmt; }
@init {$suite::currentStmt = new ArrayList<Command>(); } 
	:^(INDENT stmt_inside_block+) {
      		$result = $suite::currentStmt;
      		System.out.println("List of Statements inside block: " + $result);
      		
        }
      ;

stmt_inside_block 
	: id1=simple_stmt {$suite::currentStmt.add($id1.result); }
  	| id2=compound_stmt {$suite::currentStmt.add($id2.result);}
  	;

test returns [Command result]
  : cmd=or_test {
      $result = $cmd.result;
    }
    ;

or_test returns [Command result]
  : ^(op=OR id1=or_test id2=or_test){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+ " Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=and_test){
    $result = $cmd.result;
  } 
  ;

and_test returns [Command result] 
  : ^(op=AND id1=and_test id2=and_test){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=not_test){
    $result = $cmd.result;
  }
  ;

not_test returns [Command result] 
  : ^(op=NOT cmd=not_test){
    $result = new UnaryCommand($op.text, $cmd.result, line);
    System.out.println("Operator:"+$op.text+" "+$cmd.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | cmd=comparison{
    $result = $cmd.result;
  }
  ;

comparison returns [Command result]
  : ^(op=LESS id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=GREATER id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=EQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=GREATEREQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=LESSEQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=ALT_NOTEQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=NOTEQUAL id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=IN id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=NOTIN id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=IS id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | ^(op=ISNOT id1=comparison id2=comparison){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  } 
  | (cmd=expr){
    $result = $cmd.result;
  }
  ;

expr returns [Command result]
  : ^(op=VBAR id1=expr id2=expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=xor_expr){
    $result = $cmd.result;
  } 
  ;

xor_expr returns [Command result]
  : ^(op=CIRCUMFLEX id1=xor_expr id2=xor_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=and_expr){
    $result = $cmd.result;
  }
  ;

and_expr returns [Command result] 
  : ^(op=AMPER id1=and_expr id2=and_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=shift_expr){
    $result = $cmd.result;
  }
  ;

shift_expr returns [Command result]
  : ^(op=LEFTSHIFT id1=shift_expr id2=shift_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
    }
  | ^(op=RIGHTSHIFT id1=shift_expr id2=shift_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=arith_expr){
    $result = $cmd.result;
  }
  ;

arith_expr returns [Command result]
  : ^(op=PLUS id1=arith_expr id2=arith_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
    }
  | ^(op=MINUS id1=arith_expr id2=arith_expr){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=term){
    $result = $cmd.result;
  }
  ;
  
term returns [Command result]
	: ^(op=STAR id1=term id2=term){ 
		$result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
		System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
		commandList.add($result);
	}
	| ^(op=SLASH id1=term id2=term){
	  $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
	  System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
	  commandList.add($result);
	}
	| ^(op=DOUBLESLASH id1=term id2=term){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | ^(op=DOUBLESTAR id1=term id2=term){
    $result = new BinaryCommand($op.text, $id1.result, $id2.result, line);
    System.out.println("Operator:"+$op.text+" "+$id1.result+" "+$id2.result+" "+" Line: " + line + " " +$result);
    commandList.add($result);
  }
  | (cmd=factor){
    $result = $cmd.result;
  }
     ;


factor returns [Command result] 
	: ^(UNARY_EXPRESSION op=PLUS cmd=power){ 
		$result = new UnaryCommand($op.text, $cmd.result, line);
		 System.out.println("Operator:"+$op.text+" "+$cmd.result+" "+" Line: " + line + " " +$result);
		 commandList.add($result);
	}	
	| ^(UNARY_EXPRESSION op=MINUS cmd=power){ 
		$result = new UnaryCommand($op.text, $cmd.result, line);
		 System.out.println("Operator:"+$op.text+" "+$cmd.result+" "+" Line: " + line + " " +$result);
		 commandList.add($result);
	}
	| ^(UNARY_EXPRESSION op=TILDE cmd=power){ 
		$result = new UnaryCommand($op.text, $cmd.result, line);
		 System.out.println("Operator:"+$op.text+" "+$cmd.result+" "+" Line: " + line + " " +$result);
		 commandList.add($result);
	}
	| cmd=power { $result = $cmd.result; }
       ;

power returns [Command result]
	: ^(EXPRESSION id1=atom id2=trailer? id3=power?){
	  
	  if($id3.result==null){
	  	if($id1.result!=null && $id2.result!=null){  		
	     		// retrieve name	
	   		if($id1.result.toString().matches("(.*)ClassVariableCommand(.*)")){
	   			str = ((ClassVariableCommand)($id1.result)).getName();
	   			//System.out.println("Debug-ClassVariable: " + str);
	   		}
	  		else if($id1.result.toString().matches("(.*)VariableCommand(.*)")){
	   			str = ((VariableCommand)($id1.result)).getName();
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
		  	if($id2.result.toString().matches("(.*)ArgumentsCommand(.*)")){
			   	$result = new MethodCommand(str, $id2.result, line);
			   	//System.out.println("*********Before Adding Method*******"+ getCommandList());
			   	System.out.println("***MethodCommand -> Name: " + str + " Args: " + $id2.result + " " +" Line: " + line + " " + $result);
			   	commandList.remove($id1.result);
			   	commandList.add($result);
			   	//System.out.println("*********After Adding Method*******"+ getCommandList());
		   	}
		   	else {
			   	$result = new SubscriptedVariableCommand(str, $id2.result, line);
			   	System.out.println("***SubscriptedVariableCommand -> Name: " + str + " Args: " + $id2.result + " " +" Line: " + line + " " + $result);
			   	commandList.remove($id1.result);
			   	commandList.add($result);
		   	}
	  	}
	  	else if ($id1.result!=null && $id2.result==null){   		
		 	$result = $id1.result;
	  	}
	  	else if ($id1.result == null && $id2.result!=null){
	   		$result = $id2.result;
	  	}
	  	else{
	   		$result = null;
	  	}
	  }
	  else{
	  	if($id1.result!=null && $id2.result!=null){  		
	     		// retrieve name	
	   		if($id1.result.toString().matches("(.*)ClassVariableCommand(.*)")){
	   			str = ((ClassVariableCommand)($id1.result)).getName();
	   			//System.out.println("Debug-ClassVariable: " + str);
	   		}
	  		else if($id1.result.toString().matches("(.*)VariableCommand(.*)")){
	   			str = ((VariableCommand)($id1.result)).getName();
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
		  	if($id2.result instanceof ArgumentsCommand){
			   	$result = new MethodCommand(str, $id2.result, line);
			   	((MethodCommand)($result)).setJoinArg($id3.result);
			   	//System.out.println("*********Before Adding Method*******"+ getCommandList());
			   	System.out.println("***MethodCommand -> Name: " + str + " Args: " + $id2.result + " Others: " + $id3.result +" Line: " + line + " " + $result);
			   	commandList.remove($id1.result);
			   	commandList.add($result);
			   	//System.out.println("*********After Adding Method*******"+ getCommandList());
		   	}
		   	else {
			   	$result = new SubscriptedVariableCommand(str, $id2.result, line);
			   	System.out.println("***SubscriptedVariableCommand -> Name: " + str + " Args: " + $id2.result + " " +" Line: " + line + " " + $result);
			   	commandList.remove($id1.result);
			   	commandList.add($result);
		   	}
	  	}
	  	else if ($id1.result!=null && $id2.result==null){   		
		 	$result = $id1.result;
	  	}
	  	else if ($id1.result == null && $id2.result!=null){
	   		$result = $id2.result;
	  	}
	  	else{
	   		$result = null;
	  	}

	  }
	}
  	;

	
atom returns [Command result]
@init {
  CommonTree ahead = (CommonTree)input.LT(1);
  line = ahead.getToken().getLine();
  System.out.println("line = " + line);
  
}
	: ^(VARIABLE_CMD id1=NAME id3=test) {
	  if($id1.text.equals("range"))
	     $result = null;
	  else{
	  	if($id3.result == null){
		  $result = new VariableCommand($id1.text,line);
		  System.out.println("***Variable:"+$id1.text+" Line: "+ line + " " + $result);
		  commandList.add($result);
		  //System.out.println("****** After Adding Variable *******" + getCommandList());
		  
		}
		else{
		  VariableCommand temp = new VariableCommand($id1.text,line);
		  System.out.println("***Variable:"+$id1.text+" Line: "+ line + " " + temp);
		  commandList.add(temp);
		  
		  String op = "\%";
		  $result = new BinaryCommand(op, temp, $id3.result, line);
   		  System.out.println("Operator:"+op+" "+temp+" "+$id3.result+" "+" Line: " + line + " " +$result);
   		  commandList.add($result);
		  
		}
	     }
	}
	| ^(CLASSVARIABLE_CMD id1=DOTTED_NAME id3=test) {
		if($id3.result == null){
	     		$result = new ClassVariableCommand($id1.text, line);
	     		System.out.println("***ClassVariable:"+$id1.text+" "+" Line: "+ line + " " +$result);
       	     		commandList.add($result);
       	     	}
       	     	else{
       	     		ClassVariableCommand temp = new ClassVariableCommand($id1.text,line);
		  	System.out.println("***ClassVariable:"+$id1.text+" Line: "+ line + " " + temp);
		  	commandList.add(temp);
       	     		
       	     		String op = "\%";
		 	$result = new BinaryCommand(op, temp, $id3.result, line);
   		  	System.out.println("Operator:"+op+" "+temp+" "+$id3.result+" "+" Line: " + line + " " +$result);
   		  	commandList.add($result);
       	     	
       	     	
       	     	}
	}
	| ^(VALUETYPE type=INT_TYPE id1=INT id3=test){
		if($id3.result == null){
			$result = new DatatypeCommand($type.text,$id1.text, line);
			System.out.println("***Value:"+$id1.text+" "+" Line: "+ line + " " +$result);
			commandList.add($result);
		}
		else{
			DatatypeCommand temp = new DatatypeCommand($type.text,$id1.text, line);
			System.out.println("***Value:"+$id1.text+" "+" Line: "+ line + " " +$result);
			commandList.add(temp);
			
			String op = "\%";
		 	$result = new BinaryCommand(op, temp, $id3.result, line);
   		  	System.out.println("Operator:"+op+" "+temp+" "+$id3.result+" "+" Line: " + line + " " +$result);
   		  	commandList.add($result);
			
		}
		//System.out.println("****** After Adding Integer Value *******" + getCommandList());
	}
	| ^(VALUETYPE type=LONG_TYPE id1=LONGINT id3=test){
		if($id3.result == null){
			$result = new DatatypeCommand($type.text,$id1.text, line);
			System.out.println("***Value:"+$id1.text+" "+" Line: "+ line + " " +$result);
			commandList.add($result);
		}
		else{
			DatatypeCommand temp = new DatatypeCommand($type.text,$id1.text, line);
			System.out.println("***Value:"+$id1.text+" "+" Line: "+ line + " " +$result);
			commandList.add(temp);
			
			String op = "\%";
		 	$result = new BinaryCommand(op, temp, $id3.result, line);
   		  	System.out.println("Operator:"+op+" "+temp+" "+$id3.result+" "+" Line: " + line + " " +$result);
   		  	commandList.add($result);
			
		}
	}
	| ^(VALUETYPE type=DOUBLE_TYPE id1=FLOAT id3=test){
		if($id3.result == null){
			$result = new DatatypeCommand($type.text,$id1.text, line);
			System.out.println("***Value:"+$id1.text+" "+" Line: "+ line + " " +$result);
			commandList.add($result);
		}
		else{
			DatatypeCommand temp = new DatatypeCommand($type.text,$id1.text, line);
			System.out.println("***Value:"+$id1.text+" "+" Line: "+ line + " " +$result);
			commandList.add(temp);
			
			String op = "\%";
		 	$result = new BinaryCommand(op, temp, $id3.result, line);
   		  	System.out.println("Operator:"+op+" "+temp+" "+$id3.result+" "+" Line: " + line + " " +$result);
   		  	commandList.add($result);
			
		}
	}
	| ^(VALUETYPE type=STRING_TYPE id1=STRING id2=string_argument?){
	  	if($id2.result == null){
		  $result = new DatatypeCommand($type.text,$id1.text, line);
		  System.out.println("***Value:"+$id1.text+" "+" Line: "+ line + " " +$result);
		  commandList.add($result);
		  }
		else{
		  $result = new DatatypeCommand($type.text,$id1.text, $id2.result, line);
      		  System.out.println("***Value:"+$id1.text+" "+$id2.result + " " +" Line: "+ line + " " + $result);
      		  commandList.add($result);
      		  System.out.println(commandList.toString());
      		  //remove arguments as commands
      		  /*
      		  Iterator<Command> cit = $id2.result.iterator();
      		  while(cit.hasNext())
  			commandList.remove(cit.next());
  		  */
  		  }  		  
      		  
	}
	| ^(INNER_BRANCH cmd=testlist_gexp) {$result = $cmd.result;}
	| ^(LISTMAKER_CMD cmd=listmaker?) {
        
          $result = $cmd.result;
  }
  | ^(DICTMAKER_CMD cmd=dictmaker?){
        if($cmd.result == null)
          $result = null;
        else
          $result = $cmd.result;
  }
	;
	
string_argument returns [List result]
	: cmd=arglist { $result = $cmd.result;}
	;
	
listmaker returns [Command result]
          : ^(LISTCOMPREHENSION_CMD id1=list_arguments id2=list_for?){
          	if($id2.result!=null){
             		$result = new ListComprehensionCommand($id1.result, $id2.result, line);
             		System.out.println("***ListComprehension -> Arguments: " + $id1.result + " " + $id2.result + " " + "Line: " + line + " " +$result);
             		commandList.add($result);
             	}
             	else{
             		$result = new ListComprehensionCommand($id1.result, line);
             		System.out.println("***ListComprehension -> Arguments: " + $id1.result + " " + "Line: " + line + " " +$result);
             		commandList.add($result);
             	}
          }
          ;

list_arguments returns [List result]
scope{List current;}
@init{$list_arguments::current = new ArrayList<Command>();}
  : ^(LIST_ARGS list_argument+){
      $result = $list_arguments::current;
      System.out.println("List:"+$result);
  }
  ;
  
list_argument
    : cmd=testlist{$list_arguments::current.add($cmd.result); commandList.remove($cmd.result);}
    ;

dictmaker returns [Command result]
    : ^(DICTIONARY_CMD cmd=dict_arguments){
        $result = new DictComprehensionCommand($cmd.result, line);
        System.out.println("***DictComprehension -> Arguments: " + $cmd.result + " " + "Line: " + line + " " +$result);
        commandList.add($result);
    }        
    ;
    
dict_arguments returns [List result]
scope{List current;}
@init{$dict_arguments::current = new ArrayList<Command>();}
  : ^(DICT_ARGS dict_argument+){
      $result = $dict_arguments::current;
      System.out.println("Dictionary List:"+$result);
  }
  ;
  
dict_argument
    : cmd=testlist{$dict_arguments::current.add($cmd.result); commandList.remove($cmd.result);}
    ;

testlist_gexp returns [Command result]
    : cmd=test ( (options {k=2;}: test)*){
    $result = $cmd.result;
    }        
    ;

/*
trailer returns [Command result]
        : (cmd=arglist)? {
          if($cmd.result!=null){
        	 $result = new ArgumentsCommand($cmd.result);
        	 System.out.println("Arguments:"+$cmd.result+" "+$result);
        	 commandList.add($result);
        	 }
       	  else{
        	 $result = new ArgumentsCommand();
        	 System.out.println("Empty Arguments: "+$result);
        	 commandList.add($result);
        	 }
        } 
        | (cmd=subscriptlist) {
          	$result = new SubscriptsCommand($cmd.result);
          	System.out.println("Subscripts:"+$cmd.result+" "+$result);
          	commandList.add($result);
        }
        ;
        
*/

trailer returns [Command result]
	: cmd1=inner_trailer{
		$result = $cmd1.result;
	}
	| cmd2=inner_subscript {
          	$result = new SubscriptsCommand($cmd2.result, line);
          	System.out.println("***SubscriptsCommand -> Arguments"+ $cmd2.result + " Line: "+line+ " " + $result);     
          	//$result = $cmd2.result;
          }
        ;
        
inner_trailer returns [Command result]
	: ^(TRAILER cmd=arglist){
		$result = new ArgumentsCommand($cmd.result, line);
        	 System.out.println("Arguments:"+$cmd.result+" "+" Line: " + line + " " +$result);
        	 commandList.add($result);
        	 //System.out.println("******* After Adding Arguments ******* " + getCommandList());
	}
	| ^(TRAILER NO_ARGS){
		 $result = new ArgumentsCommand(line);
        	 System.out.println("Empty Arguments: ... "+" Line: " + line + " " +$result);
        	 commandList.add($result);
        	 //System.out.println("******* After Adding Empty Arguments ******* " + getCommandList());
	}	
	;
	
inner_subscript returns [List result]
scope{List current;}
@init{$inner_subscript::current = new ArrayList<Command>(); }
	: ^(SUBSCRIPTLISTS cmd=subscriptlist_outer+){
		$result = $inner_subscript::current ;
		//System.out.println("***SubscriptsCommand -> Arguments"+ $inner_subscript::current + " Line: "+line+ " " + $result);  
		System.out.println("Current Inner Subscript List:"+$inner_subscript::current);
	}
	;


subscriptlist_outer
	: ^(SUBSCRIPTLIST cmd=subscriptlist){
		
		SubscriptIndexCommand temp = new SubscriptIndexCommand($cmd.result,line);
		System.out.println("Subscript Index:"+$cmd.result+" "+" Line: " + line + " " +temp);
		$inner_subscript::current.add(temp);
		
		System.out.println("Inner Subscript List:"+$inner_subscript::current);
	}
	;
	

subscriptlist returns [List result]
scope{List current;}
@init{$subscriptlist::current = new ArrayList<Command>(); }
	: ^(SUBSCRIPTS cmd=subscript+){
		$result = $subscriptlist::current;
		System.out.println("Current Subscript List:"+$subscriptlist::current);
	}
        ;

subscript
	: 
	cmd=test {
        	$subscriptlist::current.add($cmd.result);
        	//commandList.remove($cmd.result);
		System.out.println("Subscript List:"+$subscriptlist::current);
		
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

classdef returns [Command result]
    : ^(CLASS_CMD id1=NAME id2=suite id3=testlist?){
        if($id3.result!=null){
          $result = new ClassDefinitionCommand($id1.text, $id2.result, $id3.result, line);
          
          int start = ((ClassDefinitionCommand)($result)).findStartLine();
          ((ClassDefinitionCommand)($result)).setStartLine(start);
        		
          System.out.println("***ClassDefinitionCommand -> " + $id1.text + " " + $id2.result + " " + $id3.result + " Start: " + ((ClassDefinitionCommand)($result)).getStartLine() + " End: " + ((ClassDefinitionCommand)($result)).getEndLine() + " " + $result );
          commandList.add($result);
          classList.add($result);
        }
        else {
          $result = new ClassDefinitionCommand($id1.text, $id2.result, line);
          
          int start = ((ClassDefinitionCommand)($result)).findStartLine();
          ((ClassDefinitionCommand)($result)).setStartLine(start);
          
          System.out.println("***ClassDefinitionCommand -> " + $id1.text + " " + $id2.result + " Start: " + ((ClassDefinitionCommand)($result)).getStartLine() + " End: " + ((ClassDefinitionCommand)($result)).getEndLine() + " " + $result );
          commandList.add($result);
          classList.add($result);
        }
    } 
    ;

arglist returns [List result]
scope {List current; }
@init {$arglist::current = new ArrayList<Command>(); } 
	:  ^(ARGUMENTS argument+) { 
		$result = $arglist::current; 
		System.out.println("List:"+$result);
		
	}
  ;

argument : cmd=expr_stmt {
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
          		$result = new ListLoopControlCommand($id1.result, $id2.result, $id3.result, line);
          		System.out.println("***ListLoopControl -> Args: " + $id1.result +" "+$id2.result+" "+$id3.result + " "+"Line: " + line + " " +$result);
          		commandList.add($result);
          	}
          	else
          		{
          		$result = new ListLoopControlCommand($id1.result, $id2.result, line);
          		System.out.println("***ListLoopControl -> Args: " + $id1.result +" "+$id2.result+ " "+"Line: " + line + " " +$result);
          		commandList.add($result);
          	}
          }
         ;

list_if returns [Command result]
	: ^(LISTCONDITION_CMD id1=test id2=list_iter?){
		$result = new ListConditionCommand ($id1.result, $id2.result, line);
          	System.out.println("***ListCondition -> Args: " + $id1.result +" "+$id2.result+" "+ " "+"Line: " + line + " " +$result);
          	commandList.add($result);
          }
        ;


