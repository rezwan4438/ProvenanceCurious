package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassDefinitionCommand extends Command {
	
	private String name;
	private Command arguments;
	private ArrayList<Command> statements;
	private int startLine;
	private int endLine;
	
	public ClassDefinitionCommand(String a, List b, Command c, int d){
		this.name = a;
		this.arguments = c;
		this.statements = (ArrayList<Command>) b;
		this.startLine = -1;
		this.endLine = d;
	}
	
	public ClassDefinitionCommand(String a, List b, int d){
		this.name = a;
		this.arguments = null;
		this.statements = (ArrayList<Command>) b;
		this.startLine = -1;
		this.endLine = d;
	}
	
	public String getName(){
		return this.name;
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
				if(cmd.getClass().getName().toString().matches("(.*)FunctionDefinitionCommand(.*)")){
					//System.out.println("********DEBUG*******");
					if(((FunctionDefinitionCommand)(cmd)).getStartLine() < start)
						start = ((FunctionDefinitionCommand)(cmd)).getStartLine();
				}
				else
					if(cmd.getLine()< start)
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
	
	public Command getArguments(){
		return this.arguments;
	}
	
	public ArrayList<Command> getStatements(){
		return this.statements;
	}
	
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}