package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FunctionDefinitionCommand extends Command {
	
	private String name;
	private Command arguments;
	private ArrayList<Command> statements;
	private int startLine;
	private int endLine;
	
	public FunctionDefinitionCommand(String a, Command b, List c, int d){
		this.name = a;
		this.arguments = b;
		this.statements = (ArrayList<Command>) c;
		this.endLine = d;
		this.startLine = -1;
	}
	
	public FunctionDefinitionCommand(String a, List c, int d){
		this.name = a;
		this.arguments = null;
		this.statements = (ArrayList<Command>) c;
		this.endLine = d;
		this.startLine = -1;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Command getArguments(){
		return this.arguments;
	}
	
	public int getStartLine(){
		return this.startLine;
	}
	
	public int getEndLine(){
		return this.endLine;
	}
	
	public int findStartLine(){
		int start = 10000;
		if(this.arguments!=null)
			start = this.arguments.getLine();
		else{
			Iterator<Command> a = this.statements.iterator();
			while(a.hasNext()){
				Command cmd = a.next();
				if(cmd.getLine() < start)
					start = cmd.getLine();
			}
			start--;
		}
		return start;
	}
	
	public void setStartLine(int a){
		this.startLine = a;
	}
	
	public int getLine(){
		return this.endLine;
	}
	
	public ArrayList<Command> getStatements(){
		return this.statements;
	}
	
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
