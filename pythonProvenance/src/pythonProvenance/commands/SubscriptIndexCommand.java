package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class SubscriptIndexCommand extends Command{
	
	private ArrayList<Command> arguments;
	private int line;
	
	public SubscriptIndexCommand(List<Command> a, int b){
		this.arguments = (ArrayList<Command>) a;
		this.line = b;
	}
	
	
	public ArrayList<Command> getArguments(){
		return this.arguments;
	}
	@Override
	public int getLine() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
