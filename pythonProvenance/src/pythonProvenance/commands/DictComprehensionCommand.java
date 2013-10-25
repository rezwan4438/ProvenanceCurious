package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class DictComprehensionCommand extends Command{
		
	private ArrayList<Command> arguments;
	private int line;
		
	public DictComprehensionCommand(List a, int b){
		this.arguments = (ArrayList<Command>)a;
		this.line = b;
	}
		
	public int getLine(){
		return this.line;
	}
		
	public ArrayList<Command> getArguments(){
		return this.arguments;
	}
	
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}

