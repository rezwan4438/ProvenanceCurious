package pythonProvenance.commands;

public class UnaryCommand extends Command{
	private String operator;
	private Command operand;
	private int line;
	
	public UnaryCommand(String a, Command op, int b){
		this.operator = a;
		this.operand = op;
		this.line = b;
	}
	
	public String getOperator(){
		return this.operator;	
	}
	
	public Command getOperand(){
		return this.operand;
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
