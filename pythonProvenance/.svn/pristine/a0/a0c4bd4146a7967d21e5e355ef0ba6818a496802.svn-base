package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExceptClauseCommand extends Command{

	private Command argument;
	private ArrayList<Command> statements;
	private int startLine;
	private int endLine;
	
	public ExceptClauseCommand(Command a, List b, int c){
		this.argument = a;
		this.statements = (ArrayList<Command>) b;
		this.endLine = c;
		this.startLine = -1;
	}
	
	public ExceptClauseCommand(List b, int c){
		this.argument = null;
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
		int start = 10000;
		if(this.argument!=null)
			start = this.argument.getLine();
		else{
			Iterator<Command> a = this.statements.iterator();
			//start = 10000;
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
