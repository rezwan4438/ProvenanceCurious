package pythonProvenance.commands;

import java.util.ArrayList;

public class TryBlockCommand extends Command{

	private Command tryClause;
	private Command exceptClause;
	private Command finallyClause;
	private int startLine;
	private int endLine;
	
	public TryBlockCommand (Command a, Command b, Command c, int d){
		this.tryClause = a;
		this.exceptClause = b;
		this.finallyClause = c;
		this.endLine = d;
		this.startLine = -1;
	}
	
	public TryBlockCommand (Command a, Command b, int d){
		this.tryClause = a;
		this.exceptClause = b;
		this.finallyClause = null;
		this.endLine = d;
		this.startLine = -1;
	}
	
	public int getStartLine(){
		return this.startLine;
	}
	
	public int getEndLine(){
		return this.endLine;
	}
	
	public int findStartLine(){
		TryClauseCommand a = (TryClauseCommand) this.tryClause;
		int start = a.getStartLine(); 
		return start;
	}
	
	public void setStartLine(int a){
		this.startLine = a;
	}
	
	public int getLine(){
		return this.endLine;
	}
	
	public ArrayList<Command> getStatements() {
		ArrayList<Command> statements = new ArrayList<Command>();
		
		statements.add(this.tryClause);
		
		if(this.exceptClause!=null)
			statements.add(this.exceptClause);
		
		if(this.finallyClause!=null)
			statements.add(this.finallyClause);
		
	
		return statements;
	}	


@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
