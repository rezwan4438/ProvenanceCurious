package pythonProvenance.commands;

public class MethodCommand extends Command{

	private String name;
	private Command argument;
	private Command joinArg;
	private int line;
	
	public MethodCommand(String a, Command b, int c){
		this.name = a;
		this.argument = b;
		this.line = c;
		this.joinArg = null;
	}
	
	public void setJoinArg(Command a){
		this.joinArg = a;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Command getArgument(){
		return this.argument;
	}
	 
	public Command getJoinArg(){
		return this.joinArg;
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
