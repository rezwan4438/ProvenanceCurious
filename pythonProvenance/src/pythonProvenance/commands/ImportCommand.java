package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class ImportCommand extends Command{

	private String from;
	private ArrayList<Command> arguments;
	private int line;
	
	public ImportCommand(String a, List<Command> b, int c){
		this.from = a;
		this.arguments = (ArrayList<Command>) b;
		this.line = c;
		//this.numOfArgs = b.size();
	}
	
	public ImportCommand(List<Command> b, int c){
		this.from = null;
		this.arguments = (ArrayList<Command>) b;
		this.line = c;
		//this.numOfArgs = b.size();
	}
	
	public ImportCommand(String a, int c){
		this.from = a;
		this.arguments = null;
		this.line = c;
		//this.numOfArgs = 0;
	}
	
	public String getFrom(){
		return this.from;
	}
	/*
	public int getNumOfArgs(){
		return this.numOfArgs;
	}
	*/
	public String getArgument(int index){
		return this.arguments.get(index).toString();
	}
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getLine() {
		return this.line;
	}

	
}
