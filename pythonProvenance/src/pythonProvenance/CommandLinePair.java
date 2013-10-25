package pythonProvenance;

import pythonProvenance.commands.MethodCommand;

public class CommandLinePair {
	private MethodCommand cmd;
	private int line;
	
	public CommandLinePair(MethodCommand cmd, int line){
		this.cmd = cmd;
		this.line = line;
	}

	public MethodCommand getCmd() {
		return cmd;
	}

	public void setCmd(MethodCommand cmd) {
		this.cmd = cmd;
	}
	
}
