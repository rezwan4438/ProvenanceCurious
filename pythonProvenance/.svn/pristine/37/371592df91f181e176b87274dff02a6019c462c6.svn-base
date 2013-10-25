package pythonProvenance.inference;

public class ProvenanceTuple {
	private String id;
	private String name;
	private Integer rowID;
	private Integer posX;
	private Integer posY;
	private String processID;
	private String value;
	private int type;
	
	public ProvenanceTuple(String id, String a, Integer b, Integer x, Integer y, String pid, String e, int t){
		this.id = id;
		this.name = a;
		this.rowID = b;
		this.posX = x;
		this.posY = y;
		this.processID = pid;
		this.value = e;
		this.type = t;
	}
	
	/** set methods
	 * @return **/
	
	
	/** get methods *****/
	
	public String getID(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	public Integer getRowID(){
		return this.rowID;
	}

	public String getValue(){
		return this.value;
	}
	
	public Integer getPosX(){
		return this.posX;
	}
	
	public Integer getPosY(){
		return this.posY;
	}
	
	public String getProcessID(){
		return this.processID;
	}
	
	public int getType(){
		return this.type;
	}
	
	public void displayTuple(){
		System.out.println(this.getID() + " " + this.processID + " " + this.getPosX() + " " + this.getPosY() + " " + this.getValue() + " " + this.type);
	}

}
