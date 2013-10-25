package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

public class DatatypeCommand extends Command {

	private String dataType;
	private String value;
	private ArrayList<Command> arguments;
	private int line;
	
	public DatatypeCommand(String a, String b, int d) {
		this.dataType = a;
		this.value = b;
		this.arguments = null;
		this.line = d;
	}
	
	public DatatypeCommand(String a, String b, List c, int d) {
		this.dataType = a;
		this.value = b;
		this.arguments = (ArrayList<Command>) c;
		this.line = d;
	}

	public void setArguments(List a){
		this.arguments = (ArrayList<Command>) a;
	}
	
	public String getDataType(){
		return this.dataType;
	}

	public String getValue(){
		return this.value;
	}
	
	public int getLine(){
		return this.line;
	}
	
	public List getArguments(){
		return this.arguments;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}

}
