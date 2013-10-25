package pythonProvenance;

import inference.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import pythonProvenance.PythonProvenanceParser.file_input_return;
import pythonProvenance.commands.ClassDefinitionCommand;
import pythonProvenance.commands.Command;
import pythonProvenance.commands.ImportEquivalent;
import pythonProvenance.commands.MethodCommand;
import pythonProvenance.graphs.ProvenanceGraph;
import pythonProvenance.inference.PersistentProcess;
import pythonProvenance.inference.ProvenanceTuple;
import pythonProvenance.inference.TransformationProcess;
import pythonProvenance.inference.TraversalHistory;

import agg.xt_basis.Arc;
import agg.xt_basis.BaseFactory;
import agg.xt_basis.GraGra;
import agg.xt_basis.Graph;
import agg.xt_basis.Node;
import agg.xt_basis.Type;
import agg.xt_basis.TypeException;


public class PythonProvenanceCommand {

	/**
	 * @param args
	 */
	public Logger logger = Logger.getLogger(PythonProvenanceCommand.class.getName());
	public ArrayList<Command> a;
//	public ArrayList<Command> b;
//	public ArrayList<ImportEquivalent> p;
	public ArrayList<Command> c;
//	public fstream;
//	public BufferedWriter out;
	public FileWriter fstream1;
	public BufferedWriter out1;
	public String testFileName;


	public Integer noOfProcess;
	public String outputViewName;
	public String outputFileName;
	public Integer outputViewType;
	public String databaseLocation;


	public Integer PRyear;
	public Integer PRmonth;
	public Integer PRposX;
	public Integer PRposY;
	public String PRfinalProcess;

	public List traversalHistory = new ArrayList<TraversalHistory> ();
	public List pTuples = new ArrayList<ProvenanceTuple> ();

	public List sourcesList = new ArrayList<String>();
	public List typesList = new ArrayList<Integer>();

	public ProvenanceGraph graph;
	public Graph fineGraph;

	public int constantCount = 0;

	// dotty file
//	public static FileWriter dottyStream;
//	public static BufferedWriter dottyOut;
//	public static String dottyFileName;
	public static void main(String[] args) throws IOException, RecognitionException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BufferedWriter out ;
		// Open a file to write methods 
		File file=new File("methods_list.txt");
		if(file.exists()==true){
			file.delete();
		}
		try{
			FileWriter fstream = new FileWriter( "methods_list.txt", true );
			out = new BufferedWriter(fstream);			
		}
		catch (Exception e){//Catch exception if any
			System.err.println("File Open Error: " + e.getMessage());
		}

		// set current dir
//		String currentDir = "src\\";
		// read test file name
//		BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Welcome ... ");
//		System.out.println("Enter Test File name: ");
//		testFileName = brIn.readLine();
//		System.out.println("File Name: " + testFileName);
//		if(testFileName.equals(""))
//			testFileName = "test_try.py";

//		String completeFileName = currentDir + testFileName;

		/********** PARSER **************/

		CommonTree ast = null;



		PythonProvenanceLexer lex = new PythonProvenanceLexer(new ANTLRFileStream(completeFileName));

//		logger.info("lex done");

		//System.out.println("lex done");

		CommonTokenStream tokens = new CommonTokenStream(lex);

//		logger.info("token stream done");
		//System.out.println("tokens done");

		PythonProvenanceParser parser = new PythonProvenanceParser(tokens);

//		logger.info("parser done");
		//System.out.println("parser done");


		PythonProvenanceParser.file_input_return r = parser.file_input();

//		logger.info("parser start");
		//System.out.println("parser start");

		if(r!=null){
			ast = (CommonTree) r.getTree();
//			System.out.println(ast.toStringTree());
		}
//		else
//			System.out.println("r==null");

//		logger.info("parser done");



		/********** WALKER ***********/



		CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
		nodes.setTokenStream(tokens);


		PythonProvenanceTree walker = new PythonProvenanceTree(nodes);

//		logger.info("walker start");

		try {
			walker.file_input();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



//		logger.info("walker done");




		/******* walker complete *****/

//		System.out.println("******* Class List ******* ");
		ArrayList<Command> c = (ArrayList<Command>) walker.getClassList();
//		Iterator<Command> ct = c.iterator(); 
//		while(ct.hasNext()){
//			System.out.println(ct.next());
//		}
//
//		System.out.println("****** Import Pairs ******* ");
		ArrayList<ImportEquivalent> p = (ArrayList<ImportEquivalent>) walker.getImportPairsList();
		Iterator<ImportEquivalent> pt = p.iterator(); 
//		while(pt.hasNext()){
//			System.out.println(pt.next());
//		}


		Command cmd;
		boolean foundClass = false;
		boolean foundImport = false;
		String fPart = "";
		String lPart = "";
//		System.out.println("****** Commands ******* ");
		ArrayList<Command> b = (ArrayList<Command>) walker.getCommandList();
		Iterator<Command> it = b.iterator(); 
		while(it.hasNext()){
			cmd = it.next();
//			System.out.println(cmd);
			/**** Write method command into a file ****/
			if(cmd!=null)
				if(cmd.toString().matches("(.*)MethodCommand(.*)")){

					System.out.println("Method Name: " + ((MethodCommand)cmd).getName());
					if(((MethodCommand)cmd).getName().contains(".")){
						fPart = ((MethodCommand)cmd).getName().split("[.]")[0];
						lPart = ((MethodCommand)cmd).getName().split("[.]")[1];
					}
					else{
						fPart = ((MethodCommand)cmd).getName();
						lPart = ((MethodCommand)cmd).getName();
					}
					foundClass = false;
					foundImport = false;

					Iterator<Command> classit = c.iterator();
					while(classit.hasNext()){
						ClassDefinitionCommand curCmd = (ClassDefinitionCommand) classit.next();

						if(((MethodCommand)cmd).getName().equals(curCmd.getName())){
							foundClass = true;
							break;
						}

					}

					if(p.size()==0)
						foundImport = false;
					else{
						Iterator<ImportEquivalent> pit = p.iterator(); 
						while(pt.hasNext()){
							ImportEquivalent curIm = pit.next();
							if(fPart.equals(curIm.getOp2())){
								foundImport = true;
								break;
							}
						}
					}

					if(foundClass == false && foundImport == true){
						out.write(((MethodCommand)(cmd)).getName()+ "," + ((MethodCommand)(cmd)).getLine());
						out.write("\n");
					}
					else if(foundClass == false && foundImport == false){
						out.write(lPart+ "," + ((MethodCommand)(cmd)).getLine());
						out.write("\n");
					}
					else{
						System.out.println("Not including ... ");
					}
				}

		}

		/***** Close methods_list.txt *****/
		out.close();
		//out1.close();

		/***** Read methods_list.txt ******/
		FileInputStream inStream = new FileInputStream("methods_list.txt");
		DataInputStream in = new DataInputStream(inStream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		List currentMethods = new ArrayList<String>();
		//List uniqueMethods = new ArrayList<String>();

		boolean found=false;
		while((strLine = br.readLine())!=null){
			strLine = strLine.replaceFirst(",(.*)", "");
			System.out.println(strLine);
			currentMethods.add(strLine);
		}

		Set<String> uniqueMethods = new HashSet<String>(currentMethods);

		System.out.println("Unique Methods ... ");
		Iterator<String> u = uniqueMethods.iterator();
		while(u.hasNext()){
			System.out.println(u.next());
		}


		/***** Read methods_desc.txt ******/
		File file2=new File("methods_desc.txt");
		if(file2.exists()==false){
			try{
				fstream = new FileWriter( "methods_desc.txt", true );
				out = new BufferedWriter(fstream);		
				out.write("\n");
				out.close();
			}
			catch (Exception e){//Catch exception if any
				System.err.println("File Open Error: " + e.getMessage());
			}
		}

		FileInputStream inStream1 = new FileInputStream("methods_desc.txt");
		if(inStream1==null){

		}
		DataInputStream in1 = new DataInputStream(inStream1);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
		String strLine1;
		List storedMethods = new ArrayList<String>();
		while((strLine1 = br1.readLine())!=null){
			strLine1 = strLine1.replaceFirst(",(.*)", "");
			//System.out.println(strLine1 + " ++++");
			storedMethods.add(strLine1);
		}

		System.out.println("Stored Methods: " + storedMethods.toString());
		/**** ask input for methods ******/
		String uniqueStr;
		String storedStr;
		Iterator<String> a = uniqueMethods.iterator();

		StringBuffer input = new StringBuffer();
		String line = null;



		boolean present = false;
		if(storedMethods.size()>0){
			while(a.hasNext()){
				uniqueStr = a.next();
				present = false;
				Iterator<String> s = storedMethods.iterator();
				while(s.hasNext()){
					//present = false;
					storedStr = s.next();
					if(uniqueStr.equals(storedStr)){
						present = true;
						System.out.println(uniqueStr + " : Methods description already entered!");
						break;
					}
					else
						continue;
				}
				if(present==false){
					System.out.println("New Method Found \"" + uniqueStr + " \"...  Enter information: ");
					System.out.println("Pattern:(#in/out mapping(OneToMany), #source(true/false), #writes output(true/false)");
					try {
						line = brIn.readLine();
					} catch (IOException ioe) {
						System.err.println(ioe.getMessage());
					}
					input.append(uniqueStr+","+line.toString());
					input.append("\n");
				}
			}
		}
		else{
			while(a.hasNext()){
				uniqueStr = a.next();					
				System.out.println("New Method Found \"" + uniqueStr + " \"...  Enter information: ");
				System.out.println("Pattern:(#in/out mapping, #source(yes/no), #writes output(yes/no)");
				try {
					line = brIn.readLine();
				} catch (IOException ioe) {
					System.err.println(ioe.getMessage());
				}
				input.append(uniqueStr+","+line.toString());
				input.append("\n");
			}
		} 



		// Open a file to write methods properties
		file = new File("methods_desc.txt");
		try{
			fstream1 = new FileWriter( "methods_desc.txt", true );
			out1 = new BufferedWriter(fstream1);			
		}
		catch (Exception e){//Catch exception if any
			System.err.println("File Open Error: " + e.getMessage());
		}

		out1.write(input.toString());
		out1.close();



		/***** Create a new graph ********/
		//ProvenanceGraph graph = null;
		try {
			graph = new ProvenanceGraph(testFileName,b,p,c);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		/******* Initialization *******/
		String connectionString;
		try {
			FileInputStream fin = new FileInputStream("conf.txt");
			DataInputStream in2 = new DataInputStream(fin);
			BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
			String str;
			while ((str = br2.readLine()) != null) {
				databaseLocation = str;
			}
			in.close();
		} catch (Exception e) {
			System.err.println(e);
		}



		/******* Menu ********/
		menu();





	}


	public static void displayProvenance() {
		// TODO Auto-generated method stub
		for(int i = 0; i < pTuples.size(); i++){
			((ProvenanceTuple) pTuples.get(i)).displayTuple();
		}
	}

	private static int foundTuples (String tupleID){
		int found = -1;

		for(int i = 0; i < pTuples.size(); i++){
			//System.out.println("Match with: " + pTuples.get(i).getID().toString());
			if(((ProvenanceTuple) pTuples.get(i)).getID().toString().equals(tupleID) == true){
				found = i;
				break;
			}
			else
				continue;
		}

		return found;
	}


	public static TransformationProcess findProcess(String processID){
		TransformationProcess selectedProcess = null, curProcess=null;
		Iterator<TransformationProcess> pit = graph.transformationProcess.iterator();
		while(pit.hasNext()){
			curProcess = pit.next();
			if(curProcess.getProcessID().toString().equals(processID)){
				selectedProcess = curProcess; 
				break;
			}
		}

		return selectedProcess;

	}
	public static void computeProvenance(){
		System.out.println("Computation Phase");



		/**** retrieve value from source process *****/
		PersistentProcess cur = null;
		Iterator<PersistentProcess> perst = graph.persistent.iterator();
		while(perst.hasNext()){
			cur = perst.next();
			try {
				getProvenanceTuples(cur.getProcessID(), cur.getViewName(), cur.getValue());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		JOptionPane.showMessageDialog(null, "Provenance Inference Complete", "Information", JOptionPane.INFORMATION_MESSAGE);



	}
	public static void provenancePhase(String str) throws IOException, InterruptedException, SQLException{
		boolean continue_provenance = requestProvenance();
		if(continue_provenance==true){
			computeProvenance();
			displayProvenance();

			if(str.equals("base")){
				prepareGraphFile(ProvenanceGraph.copyBaseGraph(), str);
			}
			else if(str.equals("grouping")){

				prepareGraphFile(ProvenanceGraph.copyGroupingGraph(), str);
			}
			else if(str.equals("discarding")){
				prepareGraphFile(ProvenanceGraph.copyDiscardingGraph(), str);
			}
			else if(str.equals("groupingDiscarding")){
				prepareGraphFile(ProvenanceGraph.copyCombiningGraph(), str);
			}
			else if(str.matches("slicing_1(.*)")){
				prepareGraphFile(ProvenanceGraph.copySlicing1Graph(), str);
			}
			else if(str.matches("slicing_2(.*)")){
				prepareGraphFile(ProvenanceGraph.copySlicing2Graph(), str);
			}
			else{

			}

		}
	}
	public static void menu() throws IOException{
		BufferedReader brMenu, brMenu1;
		String choice, choice1;
		while(true){
			System.out.println("Choose any option: ");
			System.out.println("(1) Request Provenance on Base Graph");
			System.out.println("(2) See Different Customized Graphs");
			System.out.println("(3) Terminate Program");
			brMenu = new BufferedReader(new InputStreamReader(System.in));
			choice = brMenu.readLine();
			if(choice.equals("1")){
				try {
					provenancePhase("base");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   			

				//JOptionPane.showMessageDialog(null, "Provenance Graph generated", "Information", JOptionPane.INFORMATION_MESSAGE);

			}
			else if(choice.equals("2")){
				System.out.println("You choose to see Customized Graphs.");
				System.out.println("Choose any of the following: ");
				System.out.println("(a) Grouping Process");
				System.out.println("(b) Discarding Constants");
				System.out.println("(c) Combining a & b");
				System.out.println("(d) Slicing Process (radius=1)");
				System.out.println("(e) Slicing Process (radius=2)");
				System.out.println("(f) Show Base Graph");

				brMenu1 = new BufferedReader(new InputStreamReader(System.in));
				choice1 = brMenu1.readLine();

				if(choice1.equals("a")){
					try {
						graph.executeGrouping();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you want to request Provenance for this customized graph? (yes/no)");
					BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
					if(brOption.readLine().equals("yes")){
						try {
							provenancePhase("grouping");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

				else if(choice1.equals("b")){
					try {
						graph.executeDiscarding();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you want to request Provenance for this customized graph? (yes/no)");
					BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
					if(brOption.readLine().equals("yes")){
						try {
							provenancePhase("discarding");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				else if(choice1.equals("c")){
					try {
						graph.executeGroupingDiscarding();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you want to request Provenance for this customized graph? (yes/no)");
					BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
					if(brOption.readLine().equals("yes")){
						try {
							provenancePhase("groupingDiscarding");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				else if(choice1.equals("d")){
					System.out.println("Which process do you want to slice? (process id)");
					BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
					String pChoice = brOption.readLine();
					try {
						graph.executeSlicing1(pChoice);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you want to request Provenance for this customized graph? (yes/no)");
					brOption = new BufferedReader(new InputStreamReader(System.in));
					String arg = "slicing_1" + pChoice;
					if(brOption.readLine().equals("yes")){
						try {
							provenancePhase(arg);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				else if(choice1.equals("e")){
					System.out.println("Which process do you want to slice? (process id)");
					BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
					String pChoice = brOption.readLine();
					try {
						graph.executeSlicing2(pChoice);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you want to request Provenance for this customized graph? (yes/no)");
					brOption = new BufferedReader(new InputStreamReader(System.in));
					String arg = "slicing_2" + pChoice;
					if(brOption.readLine().equals("yes")){
						try {
							provenancePhase(arg);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if(choice1.equals("f")){
					try {
						graph.executeBase();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you want to request Provenance for this customized graph? (yes/no)");
					BufferedReader brOption = new BufferedReader(new InputStreamReader(System.in));
					if(brOption.readLine().equals("yes")){
						try {
							provenancePhase("base");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				else{
					System.out.println("Unrecognized Input ... Try again");
				}


			}
			else if(choice.equals("3")){
				System.out.println("Terminating Program ... Thank You");
				System.exit(0);
			}
			else{
				System.out.println("Unrecognized Input ... Try again");
			}
		}
	}
	private static void getProvenanceTuples(String processID, String view, String value) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String query;
		String timestamp = "";
		Integer rowID, posX, posY;
		String tupleID;
		String tupleValue;

		Class.forName("org.sqlite.JDBC");
		String connectionString;
		connectionString = "jdbc:sqlite:" + databaseLocation;
		Connection conn = DriverManager.getConnection(connectionString);
		Statement stat = conn.createStatement();
		//Statement stat = conn.createStatement();
		ResultSet rs1, rs2;
		int type = 0;

		query = "SELECT * from view_info where name = '" + view + "'";
		rs2 = stat.executeQuery(query);
		while(rs2.next()){
			type = rs2.getInt("type");
		}

		if(type == 1){
			timestamp = "0";
		}
		else if(type == 2){
			timestamp = PRmonth.toString();
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
			query = "SELECT * from " + view + " where timestamp = '" + timestamp + "' and pos_x = " + PRposX + " and pos_y = " + PRposY +";";
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
			conn.close();
		}
		else{
			++constantCount;
			rowID = 0;
			tupleValue = value;
			posX = PRposX;
			posY = PRposY;
			tupleID = "constant_" + constantCount; 
			ProvenanceTuple cTuple = new ProvenanceTuple(tupleID, view, rowID, posX, posY, processID, tupleValue, type);
			pTuples.add(cTuple);
		}
	}

	public static boolean requestProvenance(){
		System.out.println("Request Provenance");

		//String [] type = {"Irrigation Demand", "Return Flow"};
		//JComboBox outputType = new JComboBox (type);
		JTextField year = new JTextField(20);
		JTextField month = new JTextField(20);
		JTextField posX = new JTextField(20);
		JTextField posY = new JTextField(20);
		//JTextField finalProcess = new JTextField(20);

		Object[] msg = {
				"Year" , year, 
				"Month" , month,
				"Cell Position: X-axis" , posX,
				"Cell Position: Y-axis", posY,
				//"Final Process", finalProcess,
		};

		JOptionPane op = new JOptionPane (msg, JOptionPane.QUESTION_MESSAGE, JOptionPane.OK_CANCEL_OPTION, null, null);

		JDialog dialog = op.createDialog(null, "Request Provenance");
		dialog.setVisible(true);

		int result = JOptionPane.OK_OPTION;

		try{
			result = ((Integer)op.getValue()).intValue();
		}
		catch(Exception uninitializedValue){}

		if(result == JOptionPane.OK_OPTION){
			//PRoutputType = outputType.getSelectedIndex();
			PRyear = Integer.parseInt(year.getText());
			PRmonth = Integer.parseInt(month.getText());
			PRposX = Integer.parseInt(posX.getText());
			PRposY = Integer.parseInt(posY.getText());
			//PRfinalProcess = finalProcess.getText();
			Object[] info = {
					"Year: " + PRyear,
					"Month: " + PRmonth,
					"Cell - X: " + PRposX,
					"Cell - Y: " + PRposY,
					//"Final Process: " + PRfinalProcess,
			};

			pTuples.clear();
			traversalHistory.clear();



			JOptionPane.showMessageDialog(null, info, "Information", JOptionPane.INFORMATION_MESSAGE);
			//requestProvenance.setEnabled(false);
			// initialization





			return true;
			//ok.setEnabled(true);
		}

		else {
			JOptionPane.showMessageDialog(null, "Cancelled", "Warning", JOptionPane.WARNING_MESSAGE);
			return false;
		}


	}

	private static Integer getType(String source){

		Integer type = new Integer(0);

		for(int i = 0; i < sourcesList.size(); i++){
			if(sourcesList.get(i).toString().equals(source)){
				type = (Integer) typesList.get(i);
				break;
			}
		}

		return type;
	}
	private static void prepareGraphFile(Graph g, String s) throws IOException, InterruptedException, SQLException{

		Date date = new Date();
		Long timestamp = date.getTime();

		String nodeIdent;
		String nodeName;
		String nodeLabel;
		String line;
		String timestamp1 = "";
		String type = null;

		Integer rowID = 0; 
		Integer posX = 0;
		Integer posY = 0;
		String tupleID = "";
		String value="";
		String view="";

		StringBuffer processConnection = new StringBuffer();
		StringBuffer tupleConnection = new StringBuffer();

		processConnection.setLength(0);
		tupleConnection.setLength(0);

		String fileName = "provenance_graph_" + testFileName.toString() + "_" + s + "_" + PRyear.toString() + "_" + PRmonth.toString() + "_" + PRposX.toString() + "_" + PRposY.toString() + ".dot" ;

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
		out.write("## This is the Provenance graph for the following element: \n");
		out.write("## Year: " + PRyear.toString() + "\n");
		out.write("## Month: " + PRmonth.toString() + "\n");
		out.write("## Cell Value X-axis: " + PRposX.toString() + "\n");
		out.write("## Cell Value Y-axis: " + PRposY.toString() + "\n");
		out.write("##\n");
		out.write("## - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 

		// main part
		out.write("digraph ProvenanceGraph {\n");
		out.write("rankdir=LR;\n");
		out.write("graph [dpi = 200, fontsize = 30, label = \"Provenance Graph (" + PRyear.toString() + "_" + PRmonth.toString() + "_" + PRposX.toString() + "_" + PRposY.toString() + "_" + timestamp.toString() +")\"]\n"); 
		out.write("node [fontsize=30, width=\".3\", height=\".2\", margin=.1];\n");


		Node n = null;
		Iterator<Node> en = g.getNodesList().iterator();
		while(en.hasNext()){
			n = en.next();

			nodeIdent = n.getAttribute().getValueAt("ident").toString();
			nodeName = n.getAttribute().getValueAt("name").toString();

			nodeName = nodeName.replace("\"", " ");
			nodeName = nodeName.replace("\'", " ");

			line = n.getAttribute().getValueAt("line#").toString();
			if(n.getAttribute().getValueAt("endLine#")==null || (n.getAttribute().getValueAt("endLine#").toString().equals(n.getAttribute().getValueAt("line#").toString())))
				line = line;
			else
				line = line + " - " + n.getAttribute().getValueAt("endLine#");


			ProvenanceTuple p = null;
			Iterator<ProvenanceTuple> pit = pTuples.iterator();
			while(pit.hasNext()){
				p = pit.next();
				if(p.getProcessID().equals(nodeIdent)){
					value = p.getValue().toString();
					type = Integer.valueOf(p.getType()).toString();
					view = p.getName();
					break;
				}
			}
			nodeLabel = nodeIdent+":"+nodeName+"\\nValue: " + value + "(" + view + ")\\n(#" + line + ")";

			if(nodeIdent.matches("(.*)P(.*)")){
				if(nodeIdent.matches("(.*)S(.*)")){
					if(type.equals("1")){
						out.write("\"" + nodeIdent + "\" [style=\"filled\", fillcolor=\"lightgray\", shape=hexagon, label=\"" + nodeLabel + "\"];\n"); 
					}
					else if(type.equals("2")){
						out.write("\"" + nodeIdent + "\" [style=\"filled\", fillcolor=\"cyan\", shape=hexagon, label=\"" + nodeLabel + "\"];\n"); 
					}
					else if(type.equals("3")){
						out.write("\"" + nodeIdent + "\" [style=\"filled\", fillcolor=\"lightcyan\", shape=hexagon, label=\"" + nodeLabel + "\"];\n"); 
					}
					else if(type.equals("4")){
						out.write("\"" + nodeIdent + "\" [style=\"filled\", fillcolor=\"skyblue\", shape=hexagon, label=\"" + nodeLabel + "\"];\n"); 
					}
					else{
						out.write("\"" + nodeIdent + "\" [shape=hexagon, color=blue, label=\"" + nodeLabel + "\"];\n");
					}
				}
				else{
					if(n.getAttribute().getValueAt("producesOutput")!=null){
						if(n.getAttribute().getValueAt("producesOutput").toString().equals("true")){
							out.write("\"" + nodeIdent + "\"" + "[style=\"filled\", fillcolor=\"yellow\",shape=box3d, label=\"" + nodeLabel + "\"];\n"); 
						}
						else
							out.write("\"" + nodeIdent + "\"" + "[shape=box, label=\"" + nodeIdent + ": " + nodeName + "\\n(#" + line + ")\\n\"]");
					}
					else{
						//outputProcess = "false";
						out.write("\"" + nodeIdent + "\"" + "[shape=box, label=\"" + nodeIdent + ": " + nodeName + "\\n(#" + line + ")\\n\"]");
					}
				}
			}
			else{
				out.write("\"" + nodeIdent + "\"" + "[shape=doubleoctagon, color=blue, label=\"" + nodeIdent + ": " + nodeName + "\\n(#" + line + ")\\n\"]");
			}
		}

		// for arcs
		Arc a = null;
		Iterator<Arc> arcs = g.getArcsList().iterator();
		while(arcs.hasNext()){
			a = arcs.next();
			Node src = (Node) a.getSource();
			Node trg = (Node) a.getTarget();
			String sourceID = src.getAttribute().getValueAt("ident").toString();
			String targetID = trg.getAttribute().getValueAt("ident").toString();
			out.write("\"" + sourceID + "\" -> \"" + targetID + "\";\n");
		}


		// connection should be made
		String connectionString;
		connectionString = "jdbc:sqlite:" + databaseLocation;
		Connection conn =
			DriverManager.getConnection(connectionString);


		Statement stat = conn.createStatement();



		out.write("}");

		out.close();


		outputFileName = fileName.split(".dot")[0] + ".jpg";
		System.out.println(outputFileName);

		String cmd = "dot -Tjpeg -o " + outputFileName + " " + fileName;
		System.out.println(cmd);

		FileWriter fstream1 = new FileWriter("auto.bat");

		BufferedWriter out1 = new BufferedWriter(fstream1);

		out1.write(cmd);
		out1.close();

		Runtime rt = Runtime.getRuntime();

		Process p = rt.exec("cmd /c auto.bat");

		p.waitFor();
		System.out.println("File created successfully.");
		/********* Showing Provenance Graph *********/
		//showProvenanceGraph(outputFileName);

		String openGraphCmd = "cmd /c " + outputFileName;
		Process p1 = rt.exec(openGraphCmd);

		//p1.waitFor();



	}



}
