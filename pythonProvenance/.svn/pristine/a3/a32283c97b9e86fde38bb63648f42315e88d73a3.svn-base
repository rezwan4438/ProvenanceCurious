package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class ReturnCommand extends Command {
	
	private List arguments;
	private int line;
	
	public ReturnCommand(List a, int b){
		this.arguments = (ArrayList<Command>) a;
		this.line = b;
	}
	
	public ReturnCommand(int b){
		this.arguments = null;
		this.line = b;
	}
	
	public List getArguments(){
		return this.arguments;
	}
	
	public Command getArgument(int i){
		return (Command) this.arguments.get(i);
	}
	
	public int getLine(){
		return this.line;
	}
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}

}
