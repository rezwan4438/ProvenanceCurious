package pythonProvenance.commands;

public class ListLoopControlCommand extends Command {
	
	private Command variable;
	private Command value;
	private Command condition;
	private int line;
	
	public ListLoopControlCommand(Command a, Command b, int d){
		this.variable = a;
		this.value = b;
		this.condition = null;
		this.line = d;
	}
	
	public ListLoopControlCommand(Command a, Command b, Command c, int d){
		this.variable = a;
		this.value = b;
		this.condition = c;
		this.line = d;
	}
	
	public int getLine(){
		return this.line;
	}
	
	public Command getVariable(){
		return this.variable;
	}
	
	public Command getValue(){
		return this.value;
	}
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

}
