package pythonProvenance.inference;

public class TraversalHistory {
	private String processID;
	private boolean traversed;
	
	public TraversalHistory(String a, boolean b ){
		this.processID = a;
		this.traversed = b;
	}
	
	public void setTraversed(boolean b){
		this.traversed = b;
	}
	
	public String getProcessID(){
		return this.processID;
	}
	
	public boolean getTraversed(){
		return this.traversed;
	}

}
