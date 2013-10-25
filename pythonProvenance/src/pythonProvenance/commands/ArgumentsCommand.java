package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class ArgumentsCommand extends Command {

	private int numOfArgs;
	private ArrayList<Command> arguments;
	private int line;
	
	public ArgumentsCommand(List<Command> a, int b){
		this.arguments = (ArrayList<Command>) a;
		this.numOfArgs = a.size();
		this.line = b;
	}
	
	public ArgumentsCommand(int b){
		this.arguments = null;
		this.numOfArgs = 0;
		this.line = b;
	}
	
	public int getNumOfArgs(){
		return this.numOfArgs;
	}
	
	public Command getArgument(int index){
		return this.arguments.get(index);
	}
	
	public ArrayList<Command> getArguments(){
		return this.arguments;
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
