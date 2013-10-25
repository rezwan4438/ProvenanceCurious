package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class WhileClauseCommand extends Command{

	private Command argument;
	private ArrayList<Command> statements;
	private int startLine;
	private int endLine;
	
	public WhileClauseCommand(Command a, List b, int c){
		this.argument = a;
		this.statements = (ArrayList<Command>) b;
		this.endLine = c;
		this.startLine = -1;
	}
	
	public int getStartLine(){
		return this.startLine;
	}
	
	public int getEndLine(){
		return this.endLine;
	}
	
	public int findStartLine(){
		int start = this.argument.getLine();
		return start;
	}
	
	public void setStartLine(int a){
		this.startLine = a;
	}
	
	public int getLine(){
		return this.endLine;
	}
	
	public Command getArgument(){
		return this.argument;
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