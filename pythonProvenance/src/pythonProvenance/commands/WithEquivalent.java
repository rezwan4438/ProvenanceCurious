package pythonProvenance.commands;

public class WithEquivalent extends Command {

	private Command op1;
	private Command op2;
	private int line;
	
	public WithEquivalent(Command a, Command b, int c){
		this.op1 = a;
		this.op2 = b;
		this.line = c;
	}
	
	public WithEquivalent(Command a, int c){
		this.op1 = a;
		this.op2 = null;
		this.line = c;
	}
	
	public Command getOp1(){
		return this.op1;
	}
	
	public Command getOp2(){
		return this.op2;
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
