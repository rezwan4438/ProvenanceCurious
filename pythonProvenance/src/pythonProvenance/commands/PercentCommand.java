package pythonProvenance.commands;

public class PercentCommand extends Command {
	private ArgumentsCommand arguments;
	private int line;
	
	public PercentCommand(ArgumentsCommand cmd, int a){
		this.arguments = cmd;
		this.line = a;
	}
	
	public ArgumentsCommand getArguments(){
		return this.arguments;
	}

	@Override
	public int getLine() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}
}
