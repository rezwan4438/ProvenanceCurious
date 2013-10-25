package pythonProvenance.commands;

public class BinaryCommand extends Command{

	public String operator;
	private Command operand1;
	private Command operand2;
	private int line;
	
	public BinaryCommand(String a, Command op1, Command op2, int b){
		this.operator = a;
		this.operand1 = op1;
		this.operand2 = op2;
		this.line = b;
	}
	
	public String getOperator(){
		
		return this.operator;
		
	}
	
	public Command getOperand1(){
		return this.operand1;
	}
	
	public Command getOperand2(){
		return this.operand2;
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