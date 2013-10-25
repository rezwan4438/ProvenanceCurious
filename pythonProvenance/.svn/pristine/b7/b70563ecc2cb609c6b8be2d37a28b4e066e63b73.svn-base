package pythonProvenance.commands;

public class ImportEquivalent extends Command {

	private String op1;
	private String op2;
	private int line;
	
	public ImportEquivalent(String a, String b, int c){
		this.op1 = a;
		this.op2 = b;
		this.line = c;
	}
	
	public ImportEquivalent(String a, int c){
		this.op1 = a;
		this.op2 = null;
		this.line = c;
	}
	
	public String getOp1(){
		return this.op1;
	}
	
	public String getOp2(){
		return this.op2;
	}
	
	public void setOp1(String s){
		this.op1 = s;
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
