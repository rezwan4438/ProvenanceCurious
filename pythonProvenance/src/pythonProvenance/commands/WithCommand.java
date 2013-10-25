package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class WithCommand extends Command{
	private ArrayList<Command> arguments;
	private ArrayList<Command> statements;
	private int startLine;
	private int endLine;
	
	public WithCommand(List a, List b, int d){
		this.arguments = (ArrayList<Command>) a;
		this.statements = (ArrayList<Command>) b;
		this.startLine = -1;
		this.endLine = d;
	} 
	
	public void setStartLine(){
		int line = this.arguments.get(0).getLine();
		this.startLine = line;
	}
	
	public int getStartLine(){
		return this.startLine;
	}
	
	public int getEndLine(){
		return this.endLine;
	}
	
	public int getLine(){
		return this.endLine;
	}
	
	public ArrayList<Command> getArguments(){
		return this.arguments;
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
