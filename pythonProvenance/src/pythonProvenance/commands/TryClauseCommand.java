package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TryClauseCommand extends Command{

	private ArrayList<Command> statements;
	private int startLine;
	private int endLine;
	
	public TryClauseCommand(List a, int b){
		this.statements = (ArrayList<Command>) a;
		this.endLine = b;
		this.startLine = -1;
	}
	
	public int getStartLine(){
		return this.startLine;
	}
	
	public int getEndLine(){
		return this.endLine;
	}
	
	public int findStartLine(){
		Iterator<Command> a = this.statements.iterator();
		int start = 10000;
		while(a.hasNext()){
			Command cmd = a.next();
			if(cmd.getLine() < start)
				start = cmd.getLine();
		}
		return start-1;
	}
	
	public void setStartLine(int a){
		this.startLine = a;
	}
	
	public ArrayList<Command> getStatements(){
		return this.statements;
	}
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}

	
	@Override
	public int getLine() {
		return this.endLine;
	}
	
	

}
