package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class PrintCommand extends Command{
	
	private int numOfArgs;
	private ArrayList<Command> arguments;
	private int line;
	
	public PrintCommand(List<Command> a, int b){
		this.arguments = (ArrayList<Command>) a;
		this.numOfArgs = a.size();
		this.line = b;
	}
	
	public int getNumOfArgs(){
		return this.numOfArgs;
	}
	
	public String getArgument(int index){
		return this.arguments.get(index).toString();
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
