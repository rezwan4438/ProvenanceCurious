package pythonProvenance.graphs;


public class ClassObjectPair {
	private String objectName;
	private String className;
	
	public ClassObjectPair(String a, String b){
		this.objectName = b;
		this.className = a;
	}
	
	public String getObjectName(){
		return this.objectName;
	}
	
	public String getClassName(){
		return this.className;
	}
}