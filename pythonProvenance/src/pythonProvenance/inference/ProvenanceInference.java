package pythonProvenance.inference;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.Arc;

public class ProvenanceInference {

	/**
	 * @param args
	 */
	
	public List<ProvenanceTuple> pTuples;
	public List<AbstractPE> PEList;
	public List<Arc> ArcList;
	public String selectedView;
	public String databaseLocation;
	public Integer PRyear;
	public Integer PRmonth;
	public Integer pos_x;
	public Integer pos_y;
	
	public Connection conn;
	public Statement stat;
	
	
	public ProvenanceInference(){
		this.pTuples = new ArrayList<ProvenanceTuple>();
	}
	
	public void setVariables(List<AbstractPE> pes, List<Arc> arcs, String s, String d, int year, int month, int x, int y){
		this.PEList = pes;
		this.ArcList = arcs;
		this.selectedView = s;
		this.databaseLocation = d;
		this.PRyear = year;
		this.PRmonth = month;
		this.pos_x = x;
		this.pos_y = y;
		
		System.out.println(this.databaseLocation + " " + this.selectedView);
	}
	private  void getProvenanceTuples(String processID, String view) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String query;
		String timestamp = "";
		Integer rowID, posX, posY;
		String tupleID;
		String tupleValue;

		
		//Statement stat = conn.createStatement();
		ResultSet rs1, rs2;
		int type = 0;

		query = "SELECT * from view_info where name = '" + view + "'";
		System.out.println("Query: "+query);
		rs2 = stat.executeQuery(query);
		while(rs2.next()){
			type = rs2.getInt("type");
		}

		if(type == 1){
			timestamp = "0";
		}
		else if(type == 2){
			timestamp = this.PRmonth.toString();
		}
		else if(type == 3){
			timestamp = PRyear.toString() + "000";
		}
		else if(type == 4){
			if(PRmonth < 10)
				timestamp = PRyear.toString() + "00" + PRmonth.toString();
			else
				timestamp = PRyear.toString() + "0" + PRmonth.toString();
		}
		else {
			System.out.println("Undefined Type!!!");
			type = 5;
		}


		if(type!=5){
			query = "SELECT * from " + view + " where timestamp = '" + timestamp + "' and pos_x = " + this.pos_x + " and pos_y = " + this.pos_y +";";
			System.out.println("Query: " + query);

			rs1 = stat.executeQuery(query);
			while(rs1.next()){
				rowID = Integer.valueOf(rs1.getInt("id"));
				tupleValue = Double.valueOf(rs1.getDouble("value")).toString();
				posX = Integer.valueOf(rs1.getInt("pos_x"));
				posY = Integer.valueOf(rs1.getInt("pos_y"));
				tupleID = view + "_" + rowID.toString();
				//System.out.println(tupleID);

				//System.out.println(returnIndex);
				ProvenanceTuple cTuple = new ProvenanceTuple(tupleID, view, rowID, posX, posY, processID, tupleValue, type);
				pTuples.add(cTuple);

			}

			rs1.close();
			//conn.close();
		}
		else{
			
			ProvenanceTuple cTuple = new ProvenanceTuple("const", view, 1, this.pos_x, this.pos_y, processID, "const", 5);
			pTuples.add(cTuple);
		}
	}
	
	public List<ProvenanceTuple> start(List<AbstractPE> pes, List<Arc> arcs, String sView, String databaseLocation, Integer year, Integer month, int x, int y) throws ClassNotFoundException, SQLException{
		System.out.println("Computation Phase");
		
		Class.forName("org.sqlite.JDBC");
		String connectionString;
		connectionString = "jdbc:sqlite:D:\\utrecht.sqlite";
		this.conn = DriverManager.getConnection(connectionString);
		this.stat = conn.createStatement();
		
		setVariables(pes, arcs, sView, databaseLocation, year, month, x, y);
		
		/**** retrieve value from source process *****/
		for(AbstractPE p: pes){
			if(p.isPersistentView()==true && p.getView().contains("int_")!=true){
				String processID = p.getName().split(":")[0];
				String viewName1 = p.getView().split(":")[1];
				String viewName = "";
				if(viewName1.contains("=0")!=true){
					if(viewName1.contains("="))
						viewName = viewName1.split("=")[0];
					else
						viewName = viewName1;
					
					try {
						getProvenanceTuples(processID, viewName);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
		this.conn.close();
		
		try {
			drawGraph();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pTuples;
	}
	
	public void drawGraph() throws IOException{
		

		Date date = new Date();
		Long timestamp = date.getTime();

		String fileName = "provenance_graph_" +  this.selectedView + "_" + this.PRyear.toString() + "_" + this.PRmonth.toString() + "_" + this.pos_y.toString() + "_" + this.pos_x.toString() + ".dot" ;

		File file = new File(fileName);
		if(file.exists()){
			file.delete();
		}

		FileWriter fstream = new FileWriter(fileName, true);

		BufferedWriter out = new BufferedWriter(fstream);

		//Write Header in the file
		out.write("## - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
		out.write("## Date: " + date.getDate() + "-" + (date.getMonth()+1) + "-" + (date.getYear()+1900) + "\n");
		out.write("## Time: " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + "\n");
		out.write("##\n");
		out.write("## This is the Fine-grained Provenance graph. \n");
		out.write("## - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 

		// header part
		out.write("digraph ProvenanceGraph {\n");
		out.write("size=\"120\";\n");
		out.write("rankdir=TB;\n");
		out.write("graph [dpi = 200, fontsize = 30, label = \"Fine-grained Provenance Graph (" + this.PRyear.toString() + "_" + this.PRmonth.toString() + "_" + this.pos_x.toString() + "_" + this.pos_y.toString() +")\"]\n"); 
		out.write("node [fontsize=30, width=\".3\", height=\".2\", margin=.1];\n");
		
		// nodes part
		String nodeIdent;
		String nodeName;
		String nodeLabel;
		String view;
		String value;
		
		for(AbstractPE a : this.PEList){
			nodeIdent = a.getName().split(":")[0];
			nodeName = a.getName().split(":")[1];

			nodeName = nodeName.replace("\"", " ");
			nodeName = nodeName.replace("\'", " ");

			view = a.getView();
			value = "";
			
			for(ProvenanceTuple pt: this.pTuples){
				if(pt.getProcessID().equals(nodeIdent)){
					value = pt.getValue();
					break;
				}
			}
			
			if(value!=""){
				nodeLabel = nodeIdent+":"+nodeName+"\\nView:- " + view + "\\nValue: " + value + "\\n";
				if(nodeIdent.contains("S"))
					out.write("\"" + nodeIdent + "\" [style=\"filled\", fillcolor=\"lightgray\", shape=box, label=\"" + nodeLabel + "\"];\n");
				else
					out.write("\"" + nodeIdent + "\" [style=\"filled\", fillcolor=\"lightcyan\", shape=box, label=\"" + nodeLabel + "\"];\n");
			}
			else{
				nodeLabel = nodeIdent+":"+nodeName+"\\nView:- " + view + "\\n";
				out.write("\"" + nodeIdent + "\" [shape=box, label=\"" + nodeLabel + "\"];\n");
			}
		}

		String sourceID;
		String targetID;
			
		for(Arc arc : this.ArcList){
				sourceID = arc.getArcFromPE().getName().split(":")[0];
				targetID = arc.getArcToPE().getName().split(":")[0];
				out.write("\"" + sourceID + "\" -> \"" + targetID + "\" [arrowhead=\"vee\",arrowtail=\"none\"];\n");
		}
			
		out.write("}");

		out.close();
			
		String outputFileName = fileName.split(".dot")[0] + ".jpg";
		System.out.println(outputFileName);

		String cmd = "cmd.exe /C dot -Tjpeg -o " + outputFileName + " " + fileName;
		System.out.println(cmd);

		Runtime rt = Runtime.getRuntime();

		Process p = rt.exec(cmd);

		
		String xmlFileName = fileName.split(".dot")[0] + ".graphml";
		cmd = "cmd.exe /C python dottoxml.py " + fileName + " " + xmlFileName;
		
		
        Process p1 = rt.exec(cmd);
		System.out.println("JPEG and GRAPHML files are created successfully.");
			

		/*
		String openGraphCmd = "cmd.exe /C " + outputFileName;
		Process p1 = rt.exec(openGraphCmd);
		*/	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProvenanceInference pInf = new ProvenanceInference();
		
		
	}

}
