package pythonProvenance.commands;

public class ClassVariableCommand extends Command{

	private String name;
	private int line;
	
	public ClassVariableCommand(String a, int b){
		this.name = a;
		this.line = b;
	}
	
	public String getName(){
		return this.name;
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