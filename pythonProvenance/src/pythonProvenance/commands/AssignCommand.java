package pythonProvenance.commands;

public class AssignCommand extends Command{
	
	private String operator;
	private Command operandLeft;
	private Command operandRight;
	private int line;
	
	public AssignCommand(String op, Command a, Command b, int c ) {
		this.operator = op;
		this.operandLeft = a;
		this.operandRight = b;
		this.line = c;
	}
	
	public String getOperator(){
		return this.operator;
	}
	public Command getOperandLeft(){
		return this.operandLeft;
	}
	public Command getOperandRight(){
		return this.operandRight;
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