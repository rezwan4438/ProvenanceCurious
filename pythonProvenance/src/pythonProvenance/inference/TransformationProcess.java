package pythonProvenance.inference;

import java.util.ArrayList;
import java.util.List;

import agg.xt_basis.Arc;
import agg.xt_basis.Node;

public class TransformationProcess{
	
	private String processID;
	private String processName;
	private Integer noOfSources;
	public List<String> sources = new ArrayList<String> ();
	public List<String> sourcesType = new ArrayList<String> ();
	private String windowType;
	private Integer windowSize;
	private Integer triggerRate;
	private String inputMapping; 
	private String outputMapping;
	private Integer noOfParents;
	public List<String> parents = new ArrayList<String> ();
	private String description;
	private boolean producesOutput;
	private boolean finalProcess;
	private String nodeName;
	private Integer contribution;
	public Node nodeRef;
	public List<Arc> nodeIncomingArcs = new ArrayList<Arc> ();
	public List<Arc> nodeOutgoingArcs = new ArrayList<Arc> ();
	public List<Node> nodeParents = new ArrayList<Node> ();
	public List<Node> nodeChilds = new ArrayList<Node> ();
   
	
	/******** Set Methods *********/
	public void setProcessID(String s){
		this.processID = s;
	}
	
	public void setNodeName (String s){
		this.nodeName = s;
	}
	
	public void setContribution (Integer s){
		this.contribution = s;
	}
	public void setProcessName (String s){
		this.processName = s;
	}
	
	public void setNoOfSources (Integer s){
		this.noOfSources = s;
	}
	
	public void setSources (ArrayList<String> s){
		
		for(int i = 0; i < s.size(); i++){
			//System.out.println(s.get(i));
			this.sources.add(s.get(i));
			//System.out.println("SetSources: " + this.sources.get(i));
		}
			
	}
	
	public void setSourcesTypes (ArrayList<String> s){
		
		for(int i = 0; i < s.size(); i++){
			//System.out.println(s.get(i));
			this.sourcesType.add(s.get(i));
			//System.out.println("SetSources: " + this.sources.get(i));
		}
			
	}
	
	
	public void setWindowType(String s){
		this.windowType = s;
	}
	
	public void setWindowSize(Integer s){
		this.windowSize = s;
	}
	
	public void setTriggerRate(Integer s){
		this.triggerRate = s;
	}
	
	public void setInputMapping(String s){
		this.inputMapping = s;
	}
	
	public void setOutputMapping(String s){
		this.outputMapping = s;
	}
	
	public void setDescription(String s){
		this.description = s;
	}
	
	public void setNoOfParents (Integer s){
		this.noOfParents = s;
	}
	
	public void setParents (ArrayList<String> s){
		for(int i = 0; i < s.size(); i++){
			//System.out.println(s.get(i));
			this.parents.add(s.get(i));
			//System.out.println("SetSources: " + this.sources.get(i));
		}
	}
	
	public void setProducesOutput(boolean s){
		this.producesOutput = s;
	}
	
	public void setFinalProcess(boolean s){
		this.finalProcess = s;
	}
	
	public void setNodeRef(Node s){
		this.nodeRef = s;
	}
	
	public void setNodeIncomingArcs(List<Arc> s){
		this.nodeIncomingArcs = s;
	}
	
	public void setNodeOutgoingArcs(List<Arc> s){
		this.nodeOutgoingArcs = s;
	}
	
	public void setNodeParents(List<Node> s){
		this.nodeParents = s;
	}
	
	public void setNodeChilds(List<Node> s){
		this.nodeChilds = s;
	}
	/******** Get Methods *********/
	public String getNodeName(){
		return this.nodeName;
	}
	
	public Integer getContribution(){
		return this.contribution;
	}
	
	public String getProcessID(){
		return this.processID;
	}
	
	public String getProcessName(){
		return this.processName;
	}
	
	public Integer getNoOfSources(){
		return this.noOfSources;
	}
	
	public String sourcesDisplay(){
		String sNames = "";
		for(int i = 0; i < this.getNoOfSources() ; i++ ){
			sNames += this.sources.get(i) + "(" + this.sourcesType.get(i) +  ") ";
		}
		//System.out.println("In Sources: " + sNames);
		return sNames;
	}
	
	public String parentsDisplay(){
		String pNames ="";
		
		if(this.getNoOfParents() == 0){
			pNames = "null";
		}
		else{
			for(int i = 0; i < this.getNoOfParents() ; i++ ){
				pNames += this.parents.get(i) + " ";
			}
		}
		//System.out.println("In Sources: " + sNames);
		return pNames;
	}
	
	
	
	public String getWindowType(){
		return this.windowType;
	}
	
	public Integer getWindowSize(){
		return this.windowSize;
	}
	
	public Integer getTriggerRate(){
		return this.triggerRate;
	}
	
	public String getInputMapping(){
		return this.inputMapping;
	}
	
	public String getOutputMapping(){
		return this.outputMapping;
	}
	
	public String getDescription(){
		return this.description;
	}
	public Integer getNoOfParents(){
		return this.noOfParents;
	}
	
	public boolean getProducesOutput(){
		return this.producesOutput;
	}
	
	public boolean getFinalProcess(){
		return this.finalProcess;
	}
	
	public ArrayList<String> getSources(){
		return (ArrayList<String>) this.sources;
	}

	public ArrayList<String> getSourcesType(){
		return (ArrayList<String>) this.sourcesType;
	}

	public Node getNodeRef(){
		return this.nodeRef;
	}
	
	public List<Arc> getNodeIncomingArcs(){
		return this.nodeIncomingArcs;
	}
	
	public List<Arc> getNodeOutgoingArcs(){
		return this.nodeOutgoingArcs;
	}
	
	public List<Node> getNodeParents(){
		return this.nodeParents;
	}
	
	public List<Node> getNodeChilds(){
		return this.nodeChilds;
	}

	

}

