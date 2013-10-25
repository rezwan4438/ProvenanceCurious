package pythonProvenance.graphs;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import pythonProvenance.PythonProvenance;
import pythonProvenance.commands.ArgumentsCommand;
import pythonProvenance.commands.AssignCommand;
import pythonProvenance.commands.BinaryCommand;
import pythonProvenance.commands.ClassDefinitionCommand;
import pythonProvenance.commands.ClassVariableCommand;
import pythonProvenance.commands.Command;
import pythonProvenance.commands.DatatypeCommand;
import pythonProvenance.commands.DictComprehensionCommand;
import pythonProvenance.commands.ElifClauseCommand;
import pythonProvenance.commands.ElseClauseCommand;
import pythonProvenance.commands.ExceptClauseCommand;
import pythonProvenance.commands.FinallyClauseCommand;
import pythonProvenance.commands.ForLoopCommand;
import pythonProvenance.commands.FunctionDefinitionCommand;
import pythonProvenance.commands.IfBlockCommand;
import pythonProvenance.commands.IfClauseCommand;
import pythonProvenance.commands.ImportEquivalent;
import pythonProvenance.commands.ListComprehensionCommand;
import pythonProvenance.commands.ListLoopControlCommand;
import pythonProvenance.commands.MethodCommand;
import pythonProvenance.commands.ReturnCommand;
import pythonProvenance.commands.SubscriptIndexCommand;
import pythonProvenance.commands.SubscriptedVariableCommand;
import pythonProvenance.commands.SubscriptsCommand;
import pythonProvenance.commands.TryBlockCommand;
import pythonProvenance.commands.TryClauseCommand;
import pythonProvenance.commands.UnaryCommand;
import pythonProvenance.commands.VariableCommand;
import pythonProvenance.commands.WhileBlockCommand;
import pythonProvenance.commands.WhileClauseCommand;
import pythonProvenance.commands.WithCommand;
import pythonProvenance.commands.WithEquivalent;
import pythonProvenance.inference.PersistentProcess;
import pythonProvenance.inference.TransformationProcess;

import agg.attribute.AttrInstance;
import agg.attribute.AttrManager;
import agg.attribute.AttrType;
import agg.attribute.AttrTypeMember;
import agg.attribute.facade.impl.DefaultInformationFacade;
import agg.attribute.handler.AttrHandler;
import agg.attribute.impl.ValueMember;
import agg.attribute.impl.ValueTuple;
import agg.attribute.view.AttrViewSetting;
import agg.cons.AtomConstraint;
import agg.util.Pair;
import agg.xt_basis.Arc;
import agg.xt_basis.BaseFactory;
import agg.xt_basis.CompletionStrategySelector;
import agg.xt_basis.DefaultGraTraImpl;
import agg.xt_basis.GraGra;
import agg.xt_basis.GraTraEvent;
import agg.xt_basis.GraTraEventListener;
import agg.xt_basis.Graph;
import agg.xt_basis.LayeredGraTraImpl;
import agg.xt_basis.Match;
import agg.xt_basis.MorphCompletionStrategy;
import agg.xt_basis.Node;
import agg.xt_basis.Rule;
import agg.xt_basis.StaticStep;
import agg.xt_basis.Type;
import agg.xt_basis.TypeException;


public class ProvenanceGraph implements GraTraEventListener{
	
	public static final Logger logger = Logger.getLogger(PythonProvenance.class.getName());
	/*** Initial Variables ***/
	private final BaseFactory bf = BaseFactory.theFactory();
	private final AttrHandler javaHandler = DefaultInformationFacade.self()
			.getJavaHandler();
	private final MorphCompletionStrategy strategy = CompletionStrategySelector
			.getDefault();
	private DefaultGraTraImpl gratraDefault;
	private LayeredGraTraImpl gratraLayered;
	private GraGra graphGrammar;
	
	
	// command list holder
	public List commands;
	public List classes;
	public List importPairs;
	public List functionParameters;
	public List classParameters;
	public List classObjects;
	public List transformationProcess;
	public List persistent;
	public List triggerLines;
	
	//nodes holder
	public ArrayList<Node> nodes;
	
	// process counter to number process
	public int processCounter;
	public int sourceProcessCounter;
	public int viewCounter;
	public int sourceCounter;
	
	public List viewTuples = new ArrayList<ViewTuples>();
	
	// graph object
	public Graph graph;
	public Graph baseGraph;
	public Graph groupingGraph;
	public Graph discardingGraph;
	public Graph combiningGraph;
	
	// node types
	public Type nodeType_view;
	public Type nodeType_source;
	public Type nodeType_process;
	public Type nodeType_sourceProcess;
	
	// arc type
	public Type arcType;
	
	// Attr Types
	public AttrType attrType_view;
	public AttrType attrType_source;
	public AttrType attrType_process;
	public AttrType attrType_sourceProcess;
	
	// Attr Managers
	public AttrManager attrManager_view;
	public AttrManager attrManager_source;
	public AttrManager attrManager_process;
	public AttrManager attrManager_sourceProcess;
	
	// Attr view settings
	public  AttrViewSetting openView_view;
	public  AttrViewSetting openView_source;
	public  AttrViewSetting openView_process;
	public  AttrViewSetting openView_sourceProcess;
	
	
	// other variables
	public AttrInstance attrInstance = null;
	public ValueTuple vt = null;
	public ValueMember vm = null;
	
	// dotty file
	public FileWriter dottyStream;
	public BufferedWriter dottyOut;
	public String dottyFileName;
	
	public String testFileName;
	
	public int executionCountGrouping;
	public int executionCountDiscarding;
	public int executionCountGroupingDiscarding;
	
	
	public ProvenanceGraph(String fileName, List b, List p, List c) throws IOException, InterruptedException{
		// iniitialize command list and process counter
		this.commands = b;
		this.importPairs = p;
		this.classes = c;
		this.functionParameters = new ArrayList<FunctionParamPair>();
		this.classParameters = new ArrayList<ClassParamPair>();
		this.classObjects = new ArrayList<ClassObjectPair> ();
		this.triggerLines = new ArrayList<Integer>();
		this.processCounter = 0;
		this.viewCounter = 0;
		this.sourceCounter = 0;
		this.sourceProcessCounter = 0;
		
		this.testFileName = fileName;
		
		this.executionCountGrouping = 0;
		this.executionCountDiscarding = 0;
		this.executionCountGroupingDiscarding = 0;
		
		this.transformationProcess = new ArrayList<TransformationProcess> ();
		
		this.persistent = new ArrayList<PersistentProcess> ();
		
		String logFileName = this.testFileName.split(".py")[0] + ".log" ;
		Handler handler = new FileHandler(logFileName, 50000, 1);
		logger.addHandler(handler);
		
		// create host graph
		createGraGraGraph();
		
		// create maintenance rules
		createGraGraRules();
		
		// execute maintenance rules
		graphGrammarTransform("");
		
		//logger.info("Please Enter to Continue ... ");
		//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
		
		/*
		BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
		brIn.readLine();
		*/
		// other rules for control structures
		
		noMemberFunctionRule();
		
		logger.info("Executing re-write rule for method concatenation ... ");
		methodConcatenation();
		prepareDottyFile("_methodConcat");
		writeDottyFile(graph, false);
		showGraph(graph, true);
		
		String dotFileName = this.dottyFileName;
		String outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
		createXML(dotFileName, outputFileName);
		
		//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
		/*
		logger.info("Please Enter to Continue ... ");
		brIn = new BufferedReader(new InputStreamReader(System.in));
		brIn.readLine();
		*/
		
		if(checkRuleExecution("forLoop")){
			logger.info("Found for loop. Executing re-write rule ... ");
			//forloopRule();
			forLoopRule();
			prepareDottyFile("_forLoop");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			printProcess();
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}
		
		if(checkRuleExecution("WhileBlock")){
			logger.info("Found while. Executing re-write rule ... ");
			whileRule();
			prepareDottyFile("_while");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			printProcess();
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}
		
		if(checkRuleExecution("If-Elif-Else Block")){
			logger.info("Found if block. Executing re-write rule ... ");
			ifElifElseRule();
			prepareDottyFile("_ifElifElse");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}
		
		if(checkRuleExecution("with")){
			logger.info("Found with block. Executing re-write rule ... ");
			withRule();
			prepareDottyFile("_with");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}
		
		if(checkRuleExecution("Try-Except-Finally Block")){
			logger.info("Found try block. Executing re-write rule ... ");
			tryExceptFinallyRule();
			prepareDottyFile("_tryExceptFinally");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}
		
		if(checkRuleExecution("Call Function")){
			logger.info("Found call function. Executing re-write rule ... ");
			callFunctionRule();
			prepareDottyFile("_callFunction");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}
		
		if(checkRuleExecution("Create Object")){
			logger.info("Found create object. Executing re-write rule ... ");
			createObjectRule();
			prepareDottyFile("_createObject");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}
		
		if(checkRuleExecution("Call Member Function")){
			logger.info("Found call member function. Executing re-write rule ... ");
			callMemberFunctionRule();
			prepareDottyFile("_callMemberFunction");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			
			dotFileName = this.dottyFileName;
			outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
			/*
			logger.info("Please Enter to Continue ... ");
			brIn = new BufferedReader(new InputStreamReader(System.in));
			brIn.readLine();
			*/
		}		
		
				
		createGraGraMergingRules();
		
		graphGrammarTransform("withMerging");
		//closeDottyFile(); // execute it and have the jpg file
		
		//documentPersistentProcess();
		
		//prepareCustomizeGraphs();
		
	}
	
	// function creating arc between source and target node
	public void createArc(Node src, Node trg){
		try{
			Arc tempArc = graph.createArc(arcType, src, trg); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create Arc failed! " + ex.getMessage());
		}
	}
	
	public boolean checkRuleExecution(String str){
		boolean executeRule = false;
		
		Iterator<Node> nodeIT = this.graph.getNodes(nodeType_process).iterator();
		while(nodeIT.hasNext()){
			Node currentNode = nodeIT.next();
			if(currentNode.getAttribute().getValueAt("name").toString().equals(str)){
				executeRule = true;
				break;
			}
		}
		
		return executeRule;
		
	}

	public Graph copyBaseGraph(){
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return graphGrammar.getGraph().graphcopy();
	}
	
	public Graph copyGroupingGraph(){
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "grouping" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return graphGrammar.getGraph().graphcopy();
		
	}
	
	public Graph copyDiscardingGraph(){
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "discarding" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return graphGrammar.getGraph().graphcopy();
	}
	
	public Graph copyCombiningGraph(){
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "groupingDiscarding" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return graphGrammar.getGraph().graphcopy();
	}
	
	public Graph copySlicing1Graph(){
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_1" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return graphGrammar.getGraph().graphcopy();
	}
	
	public Graph copySlicing2Graph(){
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_2" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return graphGrammar.getGraph().graphcopy();
	}
	
	public void documentPersistentProcess(){
		
		
		Node source = null;
		Iterator<Node> sp = graphGrammar.getGraph().getNodesList().iterator();
		
		//Iterator<Node> sp = graphGrammar.getGraph().getNodes(nodeType_sourceProcess).iterator();
		while(sp.hasNext()){
			
			source = sp.next();
			if(source.getType().getName().equals("Source Process")){
				String id = source.getAttribute().getValueAt("ident").toString();
				String view = source.getAttribute().getValueAt("view_name").toString();
				String value = source.getAttribute().getValueAt("source_names").toString();
				
				PersistentProcess newEntry = new PersistentProcess(id, view, value);
				persistent.add(newEntry);
			}
			else if(source.getType().getName().equals("Process")){
				if(source.getAttribute().getValueAt("producesOutput")!=null){
					if(source.getAttribute().getValueAt("producesOutput").toString()=="true"){
						String id = source.getAttribute().getValueAt("ident").toString();
						String view = source.getAttribute().getValueAt("view_name").toString();
						PersistentProcess newEntry = new PersistentProcess(id, view);
						persistent.add(newEntry);
					}
				}
			}
		}	
		
	}
	
	
	private void createGraGraRules(){
		
		createRule1(); // passing intermediate view states to view
		
		createRule2(); // discarding intermediate view and assign node (process)
		 
		createRule3(); // discarding intermediate view and assign node (source process)		
		
		createRule5(); // for output methods - make process produces output
	}
	
	public void noMemberFunctionRule(){
		Iterator<Node> n = graph.getNodes(nodeType_process).iterator();
		List<Node> deletedNodes = new ArrayList<Node>();
		while(n.hasNext()){
			Node curNode = n.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("Call Member Function")){
				if(curNode.getNumberOfIncomingArcs()==0)
					deletedNodes.add(curNode);
			}
		}
		// destroy nodes
		Iterator<Node> del = deletedNodes.iterator();
		while(del.hasNext()){
			try {
				graph.destroyNode(del.next());
			} catch (TypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// trigger assignment for for and while loop
	public void triggerAssignment(Integer startLine, Integer endLine, Integer trigger){
		Iterator<Node> p = graph.getNodesList().iterator();
		while(p.hasNext()){
			Node curProcess = p.next();
			boolean lineFound = false;
			if(curProcess.getAttribute().getValueAt("ident").toString().matches("(.*)P(.*)")){
				Integer sLine = Integer.parseInt(curProcess.getAttribute().getValueAt("line#").toString());
				Iterator<Integer> temp = this.triggerLines.iterator();
				while(temp.hasNext()){
					if(sLine==temp.next()){
						lineFound = true;
						break;
					}
				}
				if(sLine > startLine && sLine <= endLine && lineFound!=true){
					//a.add(curProcess);
					attrInstance = curProcess.getAttribute();
					vt = (ValueTuple) attrInstance;
					// Set values of attributes
					vm = (ValueMember) vt.getMemberAt("trigger");
					vm.setExprAsObject(trigger);
					vm.checkValidity();
					this.triggerLines.add(sLine);
				}
			}
		}
		return;
	}
	
	// rule for while loop
	public void whileRule(){
		
		Iterator<Node> e = graph.getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			Node curNode = null;
			Node whileClause = null;
			Node whileBlock = null;
			Node increment = null;
			Node condition = null;
			Node outgoing = null;
			List<Node> whileBody = new ArrayList<Node>();
			List<Node> whileBodyProcess = new ArrayList<Node>();
			List<Node> incrementBody = new ArrayList<Node>();
			String variableName;
			Integer startLine = null, endLine = null, trigger = null;
			
			curNode = e.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("WhileBlock")){
				whileBlock = curNode;
				
				// get outgoing arcs - to do
				Iterator<Arc> out = whileBlock.getOutgoingArcs();
				while(out.hasNext()){
					Node o = (Node) out.next().getTarget();
					outgoing = o;
				}
				
				// get incoming arcs
				Iterator<Arc> a = curNode.getIncomingArcs();
				while(a.hasNext()){
					Node curNode1 = (Node) a.next().getSource();
					if(curNode1.getAttribute().getValueAt("name").toString().equals("WhileClause")){
						whileClause = curNode1;
						startLine = Integer.parseInt(whileClause.getAttribute().getValueAt("line#").toString());
						endLine = Integer.parseInt(whileClause.getAttribute().getValueAt("endLine#").toString());
						Iterator<Arc> a1 = curNode1.getIncomingArcs();
						while(a1.hasNext()){
							Node curNode2 = (Node) a1.next().getSource();
							Integer tempLine = Integer.parseInt(curNode2.getAttribute().getValueAt("line#").toString());
							if(tempLine == startLine){
								condition = curNode2;
							}
							else if(tempLine > startLine && tempLine < endLine){
								whileBody.add(curNode2);
							}
							else{
								increment = curNode2;
							}
						}
					}
					else 
					{
						// for else clause
					}
				}
				
				// process increment node
				if(increment!=null){
					variableName = increment.getAttribute().getValueAt("name").toString();
					incrementBody = nodeAncestorWhile(increment, variableName);
					Iterator<Node> ib = incrementBody.iterator();
					while(ib.hasNext()){
						Node cur = ib.next();
						if(cur.getAttribute().getValueAt("ident").toString().matches("S(.*)")){
							trigger = Integer.parseInt(cur.getAttribute().getValueAt("name").toString());
						}
					}
				}
				
				// process whileBody nodes
				Iterator<Node> p = graph.getNodesList().iterator();
				while(p.hasNext()){
					Node curProcess = p.next();
					if(curProcess.getAttribute().getValueAt("ident").toString().matches("(.*)P(.*)")){
						Integer sLine = Integer.parseInt(curProcess.getAttribute().getValueAt("line#").toString());
						if(sLine > startLine && sLine < endLine){
							whileBodyProcess.add(curProcess);
						}
					}
				}
				
				triggerAssignment(startLine, endLine, trigger);
				
				// process range node -> make connection to body
				Iterator<Node> p2 = whileBodyProcess.iterator();
				while(p2.hasNext()){
					createArc(condition,p2.next());
				}
				
				// make connection to outer block
				if(outgoing!=null){
					Iterator<Node> temp = whileBody.iterator();
					while(temp.hasNext()){
						Node t = temp.next();
						logger.info("While Body: " + t.getAttribute().getValueAt("ident").toString());
						createArc(t, outgoing);
					}
				}
				
				// delete nodes
				if(increment!=null){
					Iterator<Node> del = incrementBody.iterator();
					while(del.hasNext()){
						try {
							graph.destroyNode(del.next());
						} catch (TypeException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				try {
					graph.destroyNode(whileBlock);
				} catch (TypeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					graph.destroyNode(whileClause);
				} catch (TypeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			} // initial if
		} // initial while
	}
	
	public void forLoopRule(){
		Iterator<Node> n = graph.getNodes(nodeType_process).iterator();
		while(n.hasNext()){
			Node forLoopBlock = null;
			Node loopVariable = null;
			Node outgoing = null;
			Node rangeView = null;
			List<Node> substituteNode = new ArrayList<Node>();
			Node argumentNode = null;
			Integer startLine = null;
			Integer endLine = null;
			boolean iterative = false;
			Integer trigger = null;
			List<Node> deletedNodes = new ArrayList<Node>();
			List<Node> statementNodes = new ArrayList<Node>();
			
			Node cur = n.next();
			if(cur.getAttribute().getValueAt("name").toString().equals("forLoop")){
				forLoopBlock = cur;
				startLine = Integer.parseInt(forLoopBlock.getAttribute().getValueAt("line#").toString());
				endLine = Integer.parseInt(forLoopBlock.getAttribute().getValueAt("endLine#").toString());
				trigger = Integer.parseInt(forLoopBlock.getAttribute().getValueAt("trigger").toString());
				// get loop variable node - process outgoing arcs
				Iterator<Arc> aOut = forLoopBlock.getOutgoingArcs();
				while(aOut.hasNext()){
					Node cur1out = (Node) aOut.next().getTarget();
					if(cur1out.getAttribute().getValueAt("ident").toString().matches("(.*)V(.*)")){
						loopVariable = cur1out;
					}
					else
						outgoing = cur1out;	
				}
				// check for source method or output method
				if(loopVariable!=null){
					Iterator<Arc> varOut1 = loopVariable.getOutgoingArcs();
					while(varOut1.hasNext()){
						Node o1 = (Node) varOut1.next().getTarget();
						substituteNode.add(o1);
						Iterator<Arc> varOut2 = o1.getOutgoingArcs();
						while(varOut2.hasNext()){
							Node o2 = (Node) varOut2.next().getTarget();
							Iterator<Arc> varOut3 = o2.getOutgoingArcs();
							while(varOut3.hasNext()){
								Node o3 = (Node) varOut3.next().getTarget();
								if(o3.getAttribute().getValueAt("type").toString().equals("Source Method") ||
								   o3.getAttribute().getValueAt("type").toString().equals("Output Method")){
									iterative = true;
									break;
								}
							}
							if(iterative==true)
								break;
						}
						/*
						if(iterative==true)
							break;
						*/
					}
				}
				else{
					iterative=true;
				}
				// process incoming nodes
				
				Iterator<Arc> aIn = forLoopBlock.getIncomingArcs();
				while(aIn.hasNext()){
					Node cur1in = (Node) aIn.next().getSource();
					if(cur1in.getAttribute().getValueAt("ident").toString().matches("(.*)V(.*)") 
					&& cur1in.getAttribute().getValueAt("desc").toString().equals("Arguments")){
						argumentNode = cur1in;
					}
					else{
						statementNodes.add(cur1in);
					}
				}
				
				// trigger assignment
				triggerAssignment(startLine, endLine, trigger);
				// iterate over data - utrecht case
				if(iterative==true){
					if(loopVariable!=null)
						deletedNodes.add(loopVariable);
					deletedNodes.add(forLoopBlock);
					Iterator<Node> s = substituteNode.iterator();
					while(s.hasNext()){
						createArc(argumentNode, s.next());
					}
					if(outgoing!=null){
						Iterator<Node> temp = statementNodes.iterator();
						while(temp.hasNext()){
							createArc(temp.next(), outgoing);
						}
					}				
				}
				// other cases
				else{
					deletedNodes.add(loopVariable);
					deletedNodes.add(forLoopBlock);
					Iterator<Node> s = substituteNode.iterator();
					while(s.hasNext()){
						createArc(argumentNode, s.next());
					}
					if(outgoing!=null){
						Iterator<Node> temp = statementNodes.iterator();
						while(temp.hasNext()){
							createArc(temp.next(), outgoing);
						}
					}
				}
				
				Iterator<Node> del = deletedNodes.iterator();
				while(del.hasNext()){
					Node d = del.next();
					try {
						graph.destroyNode(d);
					} catch (TypeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			} // initial if
		} // initial while
		
	}
	
	public void forloopRule(){
		Node curNode=null;
		Node curNode1 = null;
		Node targetNode = null;
		Node argNode = null;
		Node tempInputNode = null;
		Arc curArc = null;
		Arc curArc1 = null;
		Arc curArc2 = null;
		Arc curArc3 = null;
		Arc tempInputArc = null;
		String varName=null;
		//String processName = null;
		String viewName = null;
		String methodType = null;
		List deletedNodes = new ArrayList<Node>();
		List connectingNodes = new ArrayList<Node>();
		Node substituteNode = null;
		Node argumentNode = null;
		Iterator<Node> e = graphGrammar.getGraph().getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("forLoop")){
				logger.info("ForLoop Process Info: " + curNode.getAttribute().getValueAt("ident") + " " + curNode.getAttribute().getValueAt("line#"));
				Iterator<Arc> arcs = curNode.getOutgoingArcs();
				while(arcs.hasNext()){
					curArc = arcs.next();
					// checking for inner for loop
					if(((Node)curArc.getTarget()).getAttribute().getValueAt("name").toString().equals("forLoop")==false){
						varName = curArc.getTarget().getAttribute().getValueAt("name").toString();
						substituteNode = (Node) curArc.getTarget();
					}
					//logger.infoln("View Name: " + varName);
					
				}
				
				viewName = varName ;
				boolean found = false;
				Iterator<Node> e1 = graphGrammar.getGraph().getNodes(nodeType_view).iterator();
				while(e1.hasNext()){
					curNode1 = e1.next();
					if(curNode1.getAttribute().getValueAt("name").equals(viewName)){
						Iterator<Arc> arcs1 = curNode1.getOutgoingArcs();
						while(arcs1.hasNext()){
							curArc1 = arcs1.next();
							Node nextNode = (Node) curArc1.getTarget(); // process - argument []
							Iterator<Arc> arcs2 = nextNode.getOutgoingArcs();
							while(arcs2.hasNext()){
								curArc2 = arcs2.next();
								Node nextNextNode = (Node) curArc2.getTarget();
								Iterator<Arc> arcs3 = nextNextNode.getOutgoingArcs();
								while(arcs3.hasNext()){
									curArc3 = arcs3.next();
									if(curArc3.getTarget().getAttribute().getValueAt("type").equals("Source Method") || 
									curArc3.getTarget().getAttribute().getValueAt("type").equals("Output Method")){
										found = true;
										//argumentNode = curNode1;
										break;
									}
								}
								
							
							}
							
						}
					}
					
				} // while ends - pattern detection
				
				if(found==true){
					
					// substitute node 
					
					
					// get argument node
					Iterator<Arc> incomingArcs = curNode.getIncomingArcs();
					logger.info("Size of incoming arcs: " + curNode.getNumberOfIncomingArcs());
					while(incomingArcs.hasNext()){
						curArc1 = incomingArcs.next();
						targetNode = ((Node)(curArc1.getSource()));
						if(targetNode.getAttribute().getValueAt("desc").toString().equals("Arguments")){
							logger.info("Inner: Got match" );
							argNode = targetNode;
							break;
						}	
					}
					
					//make connection with argNode
					try{
						tempInputArc = graph.createArc(arcType, argNode, substituteNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (For Loop - Rewrite) " + ex.getMessage());
					}
					
					//delete for loop node
					deletedNodes.add(curNode);
					
					
					
				}
				else
					continue;
				/*
				//check argNode
				if(argNode==null)
					logger.infoln("Node NULL");
					
				// get connecting nodes
				targetNode = ((Node)(curArc.getTarget()));
				Iterator<Arc> cArcs = targetNode.getOutgoingArcs();
				while(cArcs.hasNext()){
					tempInputNode = ((Node)(cArcs.next().getTarget()));
					connectingNodes.add(tempInputNode);
				}
					
				Iterator<Node> e3 = connectingNodes.iterator();
				while(e3.hasNext()){
					tempInputNode = e3.next();
					try{
						tempInputArc = graph.createArc(arcType, argNode, tempInputNode); 
					} catch (TypeException ex) {
						logger.infoln("Create tempInputArc failed! (For Loop - Rewrite) " + ex.getMessage());
					}
				}
				deletedNodes.add(curNode);
				if(((Node)(curArc.getTarget())).getAttribute().getValueAt("name").toString().equals("forLoop")==false)
					deletedNodes.add((Node)(curArc.getTarget())); // discarding view for control variable
			}
			*/
				
			Iterator<Node> del = deletedNodes.iterator();
			while(del.hasNext()){
				Node curDelNode = del.next();
				try {
					graphGrammar.getGraph().destroyNode(curDelNode);
				} catch (TypeException e2) {
				// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
				
			for(int i = 0; i< deletedNodes.size(); i++)
				deletedNodes.remove(i);
			
			
			//get incoming arcs - substitute node
			Node newSubNode = null;
			Iterator<Arc> incomingArcs = substituteNode.getIncomingArcs();
			while(incomingArcs.hasNext()){
				curArc1 = incomingArcs.next();
				if(curArc1.getSource().getType().getName().equals("View"))
					newSubNode = (Node) curArc1.getSource();	
			}
			
			Node tempNode = null;
			Iterator<Arc> outgoingArcs = substituteNode.getOutgoingArcs();
			while(outgoingArcs.hasNext()){
				curArc2 = outgoingArcs.next();
				tempNode = (Node) curArc2.getTarget();
				try{
					tempInputArc = graph.createArc(arcType, newSubNode, tempNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (For Loop - Rewrite) " + ex.getMessage());
				}
				
			}
			
			try {
				graphGrammar.getGraph().destroyNode(substituteNode);
			} catch (TypeException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			} // for loop checking ends
			
			
			
	} // while ends
		
		
		
		
		
		
		
		/*
		if(found!=true){
			e = graphGrammar.getGraph().getNodes(nodeType_process).iterator();
			while(e.hasNext()){
				curNode = e.next();
				methodType = curNode.getAttribute().getValueAt("type").toString();
				if(methodType.equals("Output Method")){
					found = true;
					break;
				}
				else
					continue;
			}
			if(found==true)
				return true;
			else
				return false;
		}
		else
			return true;
		*/
		
	}
	
	public Command findCommand(String a){
		Command tempCommand = null;
		Iterator<Command> cmd = this.commands.iterator();
		while(cmd.hasNext()){
			Command curCmd = cmd.next();
			if(curCmd.toString().equals(a)){
				tempCommand = curCmd;
			}
			
		}
		return tempCommand;
	}
	
	public StringBuffer findCommandName(Command cmd, StringBuffer s){
		if(cmd instanceof VariableCommand){
			VariableCommand varCmd = (VariableCommand)(cmd);
			s.append(varCmd.getName());
		}
		else if(cmd instanceof DatatypeCommand){
			DatatypeCommand dataCmd = (DatatypeCommand)(cmd);
			s.append(dataCmd.getValue());
		}
		else if(cmd instanceof BinaryCommand){
			s.append(getBinaryOperationName((BinaryCommand)cmd));
		}
		else if(cmd instanceof SubscriptedVariableCommand){
			s.append(((SubscriptedVariableCommand) cmd).getName());
			s.append(getSubscriptVariableIndex((SubscriptedVariableCommand) cmd));
		}
		else{
			
		}
		
		return s;
	}
	
	public void copyNode(Node temp, Node a, String vName){
		String id = a.getAttribute().getValueAt("ident").toString();
		String name = a.getAttribute().getValueAt("name").toString();
		String viewId = a.getAttribute().getValueAt("view_ident").toString();
		String viewName = a.getAttribute().getValueAt("view_name").toString();
		boolean perst = false;
		//perst =  Boolean.parseBoolean(a.getAttribute().getValueAt("view_persistent").toString());
		String type = a.getAttribute().getValueAt("type").toString();
		String inOut = a.getAttribute().getValueAt("in/out").toString();
		int trigger = Integer.parseInt(a.getAttribute().getValueAt("trigger").toString());
		String ref = a.getAttribute().getValueAt("ref").toString();
		int startLine = Integer.parseInt(a.getAttribute().getValueAt("line#").toString());
		int endLine = Integer.parseInt(a.getAttribute().getValueAt("endLine#").toString());
		
		String newID = id + "_" + vName;
		
		
		enterValueProcessNode(temp, newID, name, viewId, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
		
	}
	
	public void copyViewNode(Node temp, Node a, String vName){
		String id = a.getAttribute().getValueAt("ident").toString();
		String name = a.getAttribute().getValueAt("name").toString();
		String process_id = a.getAttribute().getValueAt("process_ident").toString();
		Boolean perst = Boolean.parseBoolean(a.getAttribute().getValueAt("persistent").toString());
		Boolean inter = Boolean.parseBoolean(a.getAttribute().getValueAt("intermediate").toString());
		String ref = a.getAttribute().getValueAt("ref").toString();
		String desc = a.getAttribute().getValueAt("desc").toString();
		Integer line = Integer.parseInt(a.getAttribute().getValueAt("line#").toString());
		
		String newID = id + "_" + vName;
		
		
		enterValueViewNode(temp, newID, name, process_id, perst, inter, ref, desc, line);
		
	}
	
	public void updateProcessNodeInfo(Node p, Node v){
		
		String viewID = v.getAttribute().getValueAt("ident").toString();
		String viewName = v.getAttribute().getValueAt("name").toString();
		//boolean perst = Boolean.parseBoolean(v.getAttribute().getValueAt("persistent").toString());
		boolean perst = false;
		
		attrInstance = p.getAttribute();
		vt = (ValueTuple) attrInstance;
		// Set values of attributes
		vm = (ValueMember) vt.getMemberAt("view_ident");
		vm.setExprAsObject(viewID);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_name");
		vm.setExprAsObject(viewName);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_persistent");
		vm.setExprAsObject(perst);
		vm.checkValidity();
		
	}
	
	public boolean checkNameMain(Node curNode, List deletedNodesMain, List statementNodes){
		if(curNode.getNumberOfIncomingArcs()==1){
			deletedNodesMain.add(curNode);
			Iterator<Arc> in1 = curNode.getIncomingArcs();
			while(in1.hasNext()){
				Node t1 = (Node) in1.next().getSource();
				if(t1.getAttribute().getValueAt("name").toString().equals("if")){
					deletedNodesMain.add(t1);
					Iterator<Arc> in2 = t1.getIncomingArcs();
					while(in2.hasNext()){
						Node t2 = (Node) in2.next().getSource();
						if(t2.getAttribute().getValueAt("ident").toString().matches("(.*)V(.*)") && 
						t2.getAttribute().getValueAt("intermediate").toString().equals("true")){
							deletedNodesMain.add(t2);
							Iterator<Arc> in3 = t2.getIncomingArcs();
							while(in3.hasNext()){
								Node t3 = (Node) in3.next().getSource();
								deletedNodesMain.add(t3);
								Iterator<Arc> in4 = t3.getIncomingArcs();
								while(in4.hasNext()){
									Node t4 = (Node) in4.next().getSource();
									deletedNodesMain.add(t4);
									if(t4.getAttribute().getValueAt("name").toString().equals("\'__main__\'") ||
									   t4.getAttribute().getValueAt("name").toString().equals("\"__main__\"")){
										return true;
									}
								}
							}
						}
						else{
							statementNodes.add(t2);
						}
					}
				}
			}	
		}
		return false;
	}
	public void ifElifElseRule() {
		
		Node curNode = null;
		
		Iterator<Node> e = graphGrammar.getGraph().getNodes(nodeType_process).iterator();
		
		//searching for if-elif-else block
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("If-Elif-Else Block")){
				
				List<Node> delMainNodes = new ArrayList<Node> ();
				List candidateView = new ArrayList<String> ();
				List candidateViewNode = new ArrayList<Node> ();
				Node elseNode = null;
				List<Node> deletedNodes = new ArrayList<Node> ();
				List<Arc> deletedArcs = new ArrayList<Arc> ();
				List<Arc> deletedArcs1 = new ArrayList<Arc> ();
				List nodePairs = new ArrayList<NodePair> ();
							
				List<Node> deletedNodesMain = new ArrayList<Node>();
				List<Node> statementNodes = new ArrayList<Node>();
				boolean mainFound = false;
				Node outgoing = null;
				logger.info("Block: " + curNode.getAttribute().getValueAt("ident").toString());
				
				// outgoing arcs
				Iterator<Arc> out = curNode.getOutgoingArcs();
				while(out.hasNext()){
					outgoing = (Node) out.next().getTarget();
				}
				
				// check for __name__ = __main__
				mainFound = checkNameMain(curNode, deletedNodesMain, statementNodes);
				
				logger.info("main Found: " + mainFound);
				//getting incoming arcs 
				if(mainFound==false){
					Iterator<Arc> incoming = curNode.getIncomingArcsVec().iterator();
					while(incoming.hasNext()){
						Arc curArc = incoming.next();
						Node localNode = (Node) curArc.getSource();
						logger.info("ID: " + localNode.getAttribute().getValueAt("ident").toString());
						String line = localNode.getAttribute().getValueAt("line#").toString();
						
						// create multiple nodes for if - elif - else depending on number of incoming arcs
						Node tempNode = null;
						int incomingArcs = localNode.getNumberOfIncomingArcs();
						Iterator<Arc> in = localNode.getIncomingArcs();
						if(localNode.getAttribute().getValueAt("name").equals("else")){
							if(incomingArcs >= 1){
								while(in.hasNext()){
									Arc inputArc = in.next();
									Node inputNode = (Node) inputArc.getSource();
									if(inputNode.getAttribute().getValueAt("name").toString().equals("return")){
										
										/*
										Iterator<Arc> ret = inputNode.getIncomingArcs();
										while(ret.hasNext()){
											Node curRet = (Node) ret.next().getSource();
											String vName = "return";
											try{
												tempNode = graph.createNode(nodeType_process);
											}
											catch(TypeException ex){
												System.err.println(" Copy Node failed !!! " + ex.getMessage());
											}
											
											copyNode(tempNode, localNode, vName);
											logger.infoln("Copied Node Name: " +tempNode.getAttribute().getValueAt("name").toString());
											
											NodePair np = new NodePair(localNode, tempNode);
											nodePairs.add(np);
											
											updateProcessNodeInfo(tempNode, inputNode);
										}*/
										
									}
									else{
										if(inputNode.getAttribute().getValueAt("intermediate").toString().equals("false")){
											
											String vName = inputNode.getAttribute().getValueAt("name").toString();
											try{
												tempNode = graph.createNode(nodeType_process);
											}
											catch(TypeException ex){
												System.err.println(" Copy Node failed !!! " + ex.getMessage());
											}
											
											copyNode(tempNode, localNode, vName);
											logger.info("Copied Node Name: " +tempNode.getAttribute().getValueAt("name").toString());
											
											NodePair np = new NodePair(localNode, tempNode);
											nodePairs.add(np);
											
											updateProcessNodeInfo(tempNode, inputNode);
											
											if(inputNode.getOutgoingArcsVec().size()>1){
												Iterator<String> vit = candidateView.iterator();
												int count = 0;
												boolean found = false;
												while(vit.hasNext()){
													String cStr = vit.next();
													if(cStr.equals(inputNode.getAttribute().getValueAt("name").toString())){
														found = true;
														break;
													}
													count++;
												}
												if(found==true){
													candidateView.remove(count);
													candidateViewNode.remove(count);
												}
												
												candidateView.add(inputNode.getAttribute().getValueAt("name").toString());
												candidateViewNode.add(inputNode); 
												logger.info("Initial Candidate View: " + candidateView.toArray().toString());
											}
										}
									}
								}
								
							}
							// if else has no statements
							else{
								
							}
						}
						else{
							if(incomingArcs >= 2){
								while(in.hasNext()){
									Arc inputArc = in.next();
									Node inputNode = (Node) inputArc.getSource();
									if(inputNode.getAttribute().getValueAt("ident").toString().matches("(.*)V(.*)")
									&& inputNode.getAttribute().getValueAt("intermediate").toString().equals("false")){
										
										String vName = inputNode.getAttribute().getValueAt("name").toString();
										try{
											tempNode = graph.createNode(nodeType_process);
										}
										catch(TypeException ex){
											System.err.println(" Copy Node failed !!! " + ex.getMessage());
										}
										
										copyNode(tempNode, localNode, vName);
										logger.info("Copied Node Name: " +tempNode.getAttribute().getValueAt("name").toString());
										
										NodePair np = new NodePair(localNode, tempNode);
										nodePairs.add(np);
										
										updateProcessNodeInfo(tempNode, inputNode);
										
										//candidate node
										if(inputNode.getOutgoingArcsVec().size()>1){
											Iterator<String> vit = candidateView.iterator();
											int count = 0;
											boolean found = false;
											while(vit.hasNext()){
												String cStr = vit.next();
												if(cStr.equals(inputNode.getAttribute().getValueAt("name").toString())){
													found = true;
													break;
												}
												count++;
											}
											if(found==true){
												candidateView.remove(count);
												candidateViewNode.remove(count);
											}
											
											candidateView.add(inputNode.getAttribute().getValueAt("name").toString());
											candidateViewNode.add(inputNode); 
											logger.info("Initial Candidate View: " + candidateView.toArray().toString());
										}
									}
								}
								
							}
						}
						
						if(localNode.getAttribute().getValueAt("name").equals("else")){
							
							Iterator<Arc> incoming1 = localNode.getIncomingArcsVec().iterator();
							while(incoming1.hasNext()){
								Arc curArc1 = incoming1.next();
								Node secondNode = (Node) curArc1.getSource();
															
								String id = localNode.getAttribute().getValueAt("ident").toString();
								String newID = id + "_" + secondNode.getAttribute().getValueAt("name").toString();
								
								Iterator<Arc> incoming2 = secondNode.getIncomingArcs();
								while(incoming2.hasNext()){
									Arc inputArc = incoming2.next();
									Node sourceTempNode = (Node) inputArc.getSource();
									Iterator<Arc> tempit = sourceTempNode.getIncomingArcs();
									logger.info("Source Temp Node: " + sourceTempNode.getAttribute().getValueAt("ident").toString());
									if(sourceTempNode.getAttribute().getValueAt("name").toString().equals("=")){
										while(tempit.hasNext()){
											Node sourceNode = (Node) tempit.next().getSource();
											logger.info("Source Node: " + sourceNode.getAttribute().getValueAt("ident").toString() + " Dest Node: " + secondNode.getAttribute().getValueAt("ident").toString());
											Iterator<NodePair> npit1 = nodePairs.iterator();
											while(npit1.hasNext()){
												NodePair curNP = npit1.next();
												if(curNP.getValue().getAttribute().getValueAt("ident").toString().equals(newID)){
													Node destNode = curNP.getValue();
													try{
														Arc tempArc = graph.createArc(arcType, sourceNode, destNode);
													}
													catch(TypeException ex){
														System.err.println("Create arc failed!!!" + ex.getMessage());
													}
												}
											}
											if(inputArc!=null)
												deletedArcs.add(inputArc);
											deletedNodes.add(sourceTempNode);
										}
									}
									else{
										Node secondNodeCopy = null;
										
										try {
											secondNodeCopy = graph.createNode(nodeType_view);
										} catch (TypeException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										copyViewNode(secondNodeCopy, secondNode, "initial");
										createArc(sourceTempNode, secondNodeCopy);
										Node sourceNode = sourceTempNode;
										
										logger.info("Source Node: " + secondNodeCopy.getAttribute().getValueAt("ident").toString() + " Dest Node: " + secondNode.getAttribute().getValueAt("ident").toString());
										Iterator<NodePair> npit1 = nodePairs.iterator();
										while(npit1.hasNext()){
											NodePair curNP = npit1.next();
											if(curNP.getValue().getAttribute().getValueAt("ident").toString().equals(newID)){
												Node destNode = curNP.getValue();
												try{
													Arc tempArc = graph.createArc(arcType, secondNodeCopy, destNode);
												}
												catch(TypeException ex){
													System.err.println("Create arc failed!!!" + ex.getMessage());
												}
											}
										}	
										if(inputArc!=null)
											deletedArcs.add(inputArc);
										
									}
								}
								if(curArc1!=null)
									deletedArcs.add(curArc1);
								
								Iterator<NodePair> npit = nodePairs.iterator();
								while(npit.hasNext()){
									NodePair curNP = npit.next();
									if(curNP.getValue().getAttribute().getValueAt("ident").toString().equals(newID)){
										Node destNode = curNP.getValue();
										try{
											Arc tempArc = graph.createArc(arcType, destNode, secondNode);
										}
										catch(TypeException ex){
											System.err.println("Create arc failed!!!" + ex.getMessage());
										}
									}
								}
								
								try{
									Arc tempArc = graph.createArc(arcType, secondNode, curNode);
								}
								catch(TypeException ex){
									System.err.println("Create arc failed!!!" + ex.getMessage());
								}
							}
							
							
							/*
							if(elseNode!=null){
								
								Iterator<NodePair> npit = nodePairs.iterator();
								while(npit.hasNext()){
									NodePair curNP = npit.next();
									if(curNP.getKey().equals(localNode)){
										Node destNode = curNP.getValue();
										try{
											Arc tempArc = graph.createArc(arcType, elseNode, destNode);
										}
										catch(TypeException ex){
											System.err.println("Create arc failed!!!" + ex.getMessage());
										}
									}
								}
							}
							*/	
							
						}
						// if and else if
						else{
							
							String newName = null;
							Iterator<Arc> incoming1 = localNode.getIncomingArcsVec().iterator();
							while(incoming1.hasNext()){
								Arc curArc1 = incoming1.next();
								Node secondNode = (Node) curArc1.getSource();
								// find conditional branch
								if(secondNode.getAttribute().getValueAt("line#").toString().equals(line)){
									logger.info(secondNode.getAttribute().getValueAt("ident").toString());
									Iterator<Arc> incoming2 = secondNode.getIncomingArcsVec().iterator();
									while(incoming2.hasNext()){
										Node thirdNode = (Node) incoming2.next().getSource();
										String ref = thirdNode.getAttribute().getValueAt("ref").toString();
										logger.info("Compare Node: " + thirdNode.getAttribute().getValueAt("ident").toString());
										Command temp = findCommand(ref);
										if(temp instanceof BinaryCommand){
											BinaryCommand cmd = (BinaryCommand) temp;
											StringBuffer left = new StringBuffer();
											StringBuffer right = new StringBuffer();
											left = findCommandName(cmd.getOperand1(),left);
											right = findCommandName(cmd.getOperand2(), right);
											newName = left.toString() + thirdNode.getAttribute().getValueAt("name") + right.toString();
										}
										else if(temp instanceof ClassVariableCommand){
											newName = thirdNode.getAttribute().getValueAt("name").toString() + "!=null";
										}
										else{
											newName = "Undefined!";
										}
										logger.info("Changed Name: " + newName);
										//make new arcs
										Iterator<Arc> incoming3 = thirdNode.getIncomingArcsVec().iterator();
										while(incoming3.hasNext()){
											Node fourthNode = (Node) incoming3.next().getSource();
											
											/*
											if(localNode.getAttribute().getValueAt("name").toString().equals("if")){
												logger.info("If node matched");
												if(fourthNode.getAttribute().getValueAt("name").toString().equals(left.toString())){
													elseNode = fourthNode;
													logger.info("Elsenode Assignment Complete");
												}
											}
											*/
											
											Iterator<NodePair> npit = nodePairs.iterator();
											while(npit.hasNext()){
												NodePair curNP = npit.next();
												if(curNP.getKey().equals(localNode)){
													Node destNode = curNP.getValue();
													try{
														Arc tempArc = graph.createArc(arcType, fourthNode, destNode);
													}
													catch(TypeException ex){
														System.err.println("Create arc failed!!!" + ex.getMessage());
													}
												}
											}
											
											
										}
										// delete thirdnode
										deletedNodes.add(thirdNode);
									}
									deletedNodes.add(secondNode);
								}
								else{
									if(curArc1!=null)
										deletedArcs.add(curArc1);
									
									String id = localNode.getAttribute().getValueAt("ident").toString();
									String newID = id + "_" + secondNode.getAttribute().getValueAt("name").toString();
									
									Iterator<Arc> incoming2 = secondNode.getIncomingArcs();
									while(incoming2.hasNext()){
										Arc inputArc = incoming2.next();
										Node sourceTempNode = (Node) inputArc.getSource();
										Iterator<Arc> tempit = sourceTempNode.getIncomingArcs();
										logger.info("Source Temp Node: " + sourceTempNode.getAttribute().getValueAt("ident").toString());
										if(sourceTempNode.getAttribute().getValueAt("name").toString().equals("=")){
											while(tempit.hasNext()){
												Node sourceNode = (Node) tempit.next().getSource();
												logger.info("Source Node: " + sourceNode.getAttribute().getValueAt("ident").toString() + " Dest Node: " + secondNode.getAttribute().getValueAt("ident").toString());
												Iterator<NodePair> npit1 = nodePairs.iterator();
												while(npit1.hasNext()){
													NodePair curNP = npit1.next();
													if(curNP.getValue().getAttribute().getValueAt("ident").toString().equals(newID)){
														Node destNode = curNP.getValue();
														try{
															Arc tempArc = graph.createArc(arcType, sourceNode, destNode);
														}
														catch(TypeException ex){
															System.err.println("Create arc failed!!!" + ex.getMessage());
														}
													}
												}
												if(inputArc!=null)
													deletedArcs.add(inputArc);
												deletedNodes.add(sourceTempNode);
											}
										}
										else{
											Node secondNodeCopy = null;
											
											try {
												secondNodeCopy = graph.createNode(nodeType_view);
											} catch (TypeException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											
											copyViewNode(secondNodeCopy, secondNode, "initial");
											
											createArc(sourceTempNode, secondNodeCopy);
											
											Node sourceNode = sourceTempNode;
											
											logger.info("Source Node: " + secondNodeCopy.getAttribute().getValueAt("ident").toString() + " Dest Node: " + secondNode.getAttribute().getValueAt("ident").toString());
											Iterator<NodePair> npit1 = nodePairs.iterator();
											while(npit1.hasNext()){
												NodePair curNP = npit1.next();
												if(curNP.getValue().getAttribute().getValueAt("ident").toString().equals(newID)){
													Node destNode = curNP.getValue();
													try{
														Arc tempArc = graph.createArc(arcType, secondNodeCopy, destNode);
													}
													catch(TypeException ex){
														System.err.println("Create arc failed!!!" + ex.getMessage());
													}
												}
											}
											if(inputArc!=null)
												deletedArcs.add(inputArc);
										}
									}
									
									Iterator<NodePair> npit = nodePairs.iterator();
									while(npit.hasNext()){
										NodePair curNP = npit.next();
										if(curNP.getValue().getAttribute().getValueAt("ident").toString().equals(newID)){
											Node destNode = curNP.getValue();
											try{
												Arc tempArc = graph.createArc(arcType, destNode, secondNode);
											}
											catch(TypeException ex){
												System.err.println("Create arc failed!!!" + ex.getMessage());
											}
										}
									}
									
									try{
										Arc tempArc = graph.createArc(arcType, secondNode, curNode);
									}
									catch(TypeException ex){
										System.err.println("Create arc failed!!!" + ex.getMessage());
									}
									
								}
							}
							String tempName = localNode.getAttribute().getValueAt("name").toString() + " " + newName;
							
							Iterator<NodePair> npit = nodePairs.iterator();
							while(npit.hasNext()){
								NodePair curNP = npit.next();
								if(curNP.getKey().equals(localNode)){
									Node destNode = curNP.getValue();
									
									attrInstance = destNode.getAttribute();
									vt = (ValueTuple) attrInstance;
									
									// Set values of attributes
									vm = (ValueMember) vt.getMemberAt("name");
									vm.setExprAsObject(tempName);
									vm.checkValidity();
									
								}
							}
							
							
						} // else finished --> if and else if
						if(curArc!=null)
							deletedArcs.add(curArc);
						deletedNodes.add(localNode);
					}
					
					logger.info("Candidate View: " + candidateView);
					
					
					// arc destroy
					
					logger.info("Total deleted arcs: " + deletedArcs.size());
					Iterator<Arc> delArcs = deletedArcs.iterator();
					while(delArcs.hasNext()){
						Arc next = delArcs.next();
						logger.info("Deleted Arc: " + ((Node)(next.getSource())).getAttribute().getValueAt("ident").toString() + "-> " + ((Node)(next.getTarget())).getAttribute().getValueAt("ident").toString());
						try {
							graph.destroyArc(next);
						} catch (TypeException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					//create if-elif-else node depending on candidate view
					List blockNodes = new ArrayList<Node>();
					if(candidateViewNode!=null){
						Node tempBlockNode = null;
						Iterator<Node> node = candidateViewNode.iterator();
						while(node.hasNext()){
							try{
								tempBlockNode = graph.createNode(nodeType_process);
							}
							catch(TypeException ex){
								System.err.println("create node failed !!!" + ex.getMessage());
							}
							Node currentNode = node.next();
							String currentNodeName = currentNode.getAttribute().getValueAt("name").toString();
							copyNode(tempBlockNode, curNode, currentNodeName);
							blockNodes.add(tempBlockNode);
							
						}
					}
					
					//making connection
					Node tempViewNode = null;
					Iterator<Arc> in = curNode.getIncomingArcs();
					while(in.hasNext()){
						Arc cArc = in.next();
						Node srcNode = (Node) cArc.getSource();
						String srcName = "_" + srcNode.getAttribute().getValueAt("name").toString();
						Iterator<Node> bNodes = blockNodes.iterator();
						while(bNodes.hasNext()){
							Node curBlockNode = bNodes.next();
							if(curBlockNode.getAttribute().getValueAt("ident").toString().contains(srcName)){
								
								createArc(srcNode, curBlockNode);
								// name change to Union
								
								attrInstance = curBlockNode.getAttribute();
								vt = (ValueTuple) attrInstance;
								
								// Set values of attributes
								vm = (ValueMember) vt.getMemberAt("name");
								vm.setExprAsObject("Union");
								vm.checkValidity();
								
							}
						}
						
						
						
						//creating phi nodes and connection
						if(srcNode.getNumberOfOutgoingArcs()>2){
							List<Node> sources = new ArrayList<Node> ();
							// incoming node (if/elif/else)
							Iterator<Arc> in1 = srcNode.getIncomingArcs();
							while(in1.hasNext()){
								Arc cIn1 = in1.next();
								sources.add((Node) cIn1.getSource());
								deletedArcs1.add(cIn1);
							}
							
				
							// outgoing node (if/elif/else)
							Iterator<Arc> out1 = srcNode.getOutgoingArcs();
							while(out1.hasNext()){
								Arc cOut1 = out1.next();
								Node dest1 = (Node) cOut1.getTarget();
								
								Iterator<Node> bNodes1 = blockNodes.iterator();
								while(bNodes1.hasNext()){
									Node curBlockNode = bNodes1.next();
									if(curBlockNode.equals(dest1)){
										deletedArcs1.add(cOut1);
									}
								}				
							}
							
							
							try{
								tempViewNode = graph.createNode(nodeType_view);
							}
							catch(TypeException ex){
								System.err.println("create node failed !!!" + ex.getMessage());
							}
							
							
							
							String id = srcNode.getAttribute().getValueAt("ident").toString();
							String newid = "V"+(++this.viewCounter);
							//logger.infoln("New Node: " + id);
							//logger.infoln("Number of Outgoing Arcs: "+srcNode.getNumberOfOutgoingArcs() +" incoming arcs: " + srcNode.getNumberOfIncomingArcs());
							String name = srcNode.getAttribute().getValueAt("name").toString();
							String processId = srcNode.getAttribute().getValueAt("ident").toString()+ "_" + name;
							boolean perst = Boolean.parseBoolean(srcNode.getAttribute().getValueAt("persistent").toString());
							boolean inter = Boolean.parseBoolean(srcNode.getAttribute().getValueAt("intermediate").toString());
							String ref = srcNode.getAttribute().getValueAt("ref").toString();
							String desc = "";
							int line = Integer.parseInt(srcNode.getAttribute().getValueAt("line#").toString());
							enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
							
							//update View Info
							attrInstance = srcNode.getAttribute();
							vt = (ValueTuple) attrInstance;
							
							// Set values of attributes
							vm = (ValueMember) vt.getMemberAt("ident");
							vm.setExprAsObject(newid);
							vm.checkValidity();
							
							
							//make connection with else node
							Iterator<Node> s = sources.iterator();
							while(s.hasNext()){
								try{
									Arc tempArc = graph.createArc(arcType, s.next(), tempViewNode);
								}
								catch(TypeException ex){
									System.err.println("create node failed !!!" + ex.getMessage());
								}
							}
							
							Iterator<Node> bNodes1 = blockNodes.iterator();
							while(bNodes1.hasNext()){
								Node curBlockNode = bNodes1.next();
								if(curBlockNode.getAttribute().getValueAt("ident").toString().contains(name)){
									try{
										Arc tempArc = graph.createArc(arcType, tempViewNode, curBlockNode);
									}
									catch(TypeException ex){
										System.err.println("create node failed !!!" + ex.getMessage());
									}
									
									try{
										Arc tempArc = graph.createArc(arcType, curBlockNode, srcNode);
									}
									catch(TypeException ex){
										System.err.println("create node failed !!!" + ex.getMessage());
									}
									
									updateProcessNodeInfo(curBlockNode,srcNode);
								
								}
							}
							
							if(outgoing!=null){
								createArc(srcNode, outgoing);
							}
							
							
						}
					}
					
					delMainNodes.add(curNode);
					//deletedNodes.add(curNode);
					// arc destroy
					Iterator<Arc> delArcs1 = deletedArcs1.iterator();
					while(delArcs1.hasNext()){
						try {
							graph.destroyArc(delArcs1.next());
						} catch (TypeException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					// node destroy
					Iterator<Node> delNodes = deletedNodes.iterator();
					while(delNodes.hasNext()){
						try {
							graph.destroyNode(delNodes.next());
						} catch (TypeException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}	
					Iterator<Node> delNodes1 = delMainNodes.iterator();
					while(delNodes1.hasNext()){
						try {
							graph.destroyNode(delNodes1.next());
						} catch (TypeException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					/*
					try {
						prepareDottyFile("_ifElifElse_temp");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						writeDottyFile(graph, false);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						showGraph(graph, false);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					logger.info("Please Enter to Continue ... ");
					BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
					try {
						brIn.readLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					*/
				} // mainFound == false 
				else{
					
					if(outgoing!=null){
						Iterator<Node> s = statementNodes.iterator();
						while(s.hasNext()){
							createArc(s.next(), outgoing);
						}
					}
					
					Iterator<Node> delNodes = deletedNodesMain.iterator();
					while(delNodes.hasNext()){
						try {
							graph.destroyNode(delNodes.next());
						} catch (TypeException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				
			} // initial if
			
		} // initial while
		
		// node destroy
			
		
		
		
		
	}
	
	
	public void callFunctionRule(){
		//searching for call-function block
		Node curNode = null;
		Node methodCallNode = null;
		Node methodDefNode = null;
		List parametersIn = new ArrayList<ParamPair>();
		List parametersOut = new ArrayList<ParamPair>();
		List deletedNodes = new ArrayList<Node>();
		List functionDefNodes = new ArrayList<Node>();
		String uniqueLine = "";
		boolean noReturn = true;
		Node returnNode = null;
		
		Iterator<Node> e = graphGrammar.getGraph().getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("Call Function")){
				parametersIn.clear();
				parametersOut.clear();
				logger.info("Block: " + curNode.getAttribute().getValueAt("ident").toString());
				// get call node ->
				Iterator<Arc> outgoing = curNode.getOutgoingArcs();
				while(outgoing.hasNext()){
					methodCallNode = (Node) outgoing.next().getTarget();
				}
				//get def node <-
				Iterator<Arc> incoming = curNode.getIncomingArcs();
				while(incoming.hasNext()){
					methodDefNode = (Node) incoming.next().getSource();
				}
				logger.info("Method Call Node: " + methodCallNode.getAttribute().getValueAt("ident").toString());
				logger.info("Method Def Node : " + methodDefNode.getAttribute().getValueAt("ident").toString());
				uniqueLine = methodCallNode.getAttribute().getValueAt("line#").toString();
				// check return node
				Iterator<Arc> incomingReturn = methodDefNode.getIncomingArcs();
				while(incomingReturn.hasNext()){
					Node current = (Node) incomingReturn.next().getSource();
					if(current.getAttribute().getValueAt("name").equals("return")){
						returnNode = current;
						noReturn = false;
						break;
					}
				}
				// Parameters in
				String callCommandRef = methodCallNode.getAttribute().getValueAt("ref").toString();
				Iterator<Command> cmd = this.commands.iterator();
				List<Command> argsCommandIn = new ArrayList<Command>();
				while(cmd.hasNext()){
					Command curCmd = cmd.next();
					if(curCmd.toString().equals(callCommandRef)){
						logger.info("Call Command Ref: " + curCmd.toString());
						MethodCommand callCmd = ((MethodCommand) (curCmd));
						ArgumentsCommand argCmd = ((ArgumentsCommand)(callCmd.getArgument()));
						for(int i = 0; i < argCmd.getNumOfArgs(); i++){
							argsCommandIn.add(argCmd.getArgument(i));
						}
					}
				}
				
				String defCommandRef = methodDefNode.getAttribute().getValueAt("ref").toString();
				cmd = this.commands.iterator();
				List<Command> argsCommandOut = new ArrayList<Command>();
				while(cmd.hasNext()){
					Command curCmd = cmd.next();
					if(curCmd.toString().equals(defCommandRef)){
						logger.info("Def Command Ref: " + curCmd.toString());
						FunctionDefinitionCommand defCmd = ((FunctionDefinitionCommand) (curCmd));
						ArgumentsCommand argCmd = ((ArgumentsCommand)(defCmd.getArguments()));
						for(int i = 0; i < argCmd.getNumOfArgs(); i++){
							argsCommandOut.add(argCmd.getArgument(i));
						}
					}
				}
				
				Node in = null;
				Node out = null;
				int count = argsCommandIn.size();
				logger.info("Count: " + count);
				for(int j = 0; j<count; j++){
					in = findViewTuples(argsCommandIn.get(j).toString());
					Iterator<FunctionParamPair> fpit = functionParameters.iterator();
					while(fpit.hasNext()){
						FunctionParamPair curFP = fpit.next();
						if(curFP.getFunction().equals(methodDefNode)){
							if(curFP.getParameter().getAttribute().getValueAt("ref").toString().equals(argsCommandOut.get(j).toString()))
							out = curFP.getParameter();
						}
					}
					
					//Node out = findViewTuples(argsCommandOut.get(j).toString());
					ParamPair pp = new ParamPair(in,out);
					
					parametersIn.add(pp);
				}
				
				Iterator<ParamPair> ppit = parametersIn.iterator();
				while(ppit.hasNext()){
					ParamPair curPair = ppit.next();
					logger.info("In: " + curPair.getIn().getAttribute().getValueAt("name").toString() + " Out: " + curPair.getOut().getAttribute().getValueAt("name").toString());
				}
				
				//Result Out
				Node callOutNode = null;
				Node defOutNode = null;
				Iterator<Arc> outCallit = methodCallNode.getOutgoingArcs();
				while(outCallit.hasNext()){
					callOutNode = (Node) outCallit.next().getTarget();
				}
				
				Node outNode = callOutNode; // node after return ... 
				
				
				if(noReturn==false){
						Node temp = returnNode;
						Iterator<Arc> rit = temp.getIncomingArcs();
						while(rit.hasNext()){
							defOutNode = (Node) rit.next().getSource();
							ParamPair pp = new ParamPair(callOutNode, defOutNode);
							parametersOut.add(pp);
						}
				}
				else{
					Iterator<Arc> outDefit = methodDefNode.getIncomingArcs();
					while(outDefit.hasNext()){
						Node temp = (Node) outDefit.next().getSource();
						if(temp.getNumberOfIncomingArcs() > 0){
							defOutNode = temp;
							ParamPair pp = new ParamPair(callOutNode, defOutNode);
							parametersOut.add(pp);
						}			
					}
				}
				
				
				Iterator<ParamPair> ppit1 = parametersOut.iterator();
				while(ppit1.hasNext()){
					ParamPair curPair = ppit1.next();
					logger.info("In: " + curPair.getIn().getAttribute().getValueAt("name").toString() + " Out: " + curPair.getOut().getAttribute().getValueAt("name").toString());
				}
				
				
				// copy graph
				List<Node> subgraphNodes = new ArrayList<Node>();
				List<Arc> subgraphArcs = new ArrayList<Arc>();
				
				subgraphNodes.clear();
				subgraphArcs.clear();
				
				Node tempNode = null; 
				
				Iterator<Arc> a1 = methodDefNode.getIncomingArcs();
				while(a1.hasNext()){
					Arc curA1 = a1.next();
					Node srcCurA1 = (Node) curA1.getSource();
					if(srcCurA1.getAttribute().getValueAt("name").toString().equals("return")){
						Iterator<Arc> a2 = srcCurA1.getIncomingArcs();
						while(a2.hasNext()){
							Arc curA2 = a2.next();
							Node srcCurA2 = (Node) curA2.getSource();
							if(srcCurA2.getType().getName().equals("View")){
								
								try{
									tempNode = graph.createNode(nodeType_view);
								} catch(TypeException ex){
									System.err.println("Create node failed!!!" + ex.getMessage());
								}
								copyNodeInfo(tempNode, srcCurA2, uniqueLine);
								subgraphNodes.add(tempNode);
								
								copyGraph1(srcCurA2, subgraphNodes, subgraphArcs, uniqueLine);
								//break;
							}
						}
					}
					else{
						Node srcCurA2 = srcCurA1;
						if(srcCurA2.getType().getName().equals("View")){
							
							try{
								tempNode = graph.createNode(nodeType_view);
							} catch(TypeException ex){
								System.err.println("Create node failed!!!" + ex.getMessage());
							}
							copyNodeInfo(tempNode, srcCurA2, uniqueLine);
							subgraphNodes.add(tempNode);
							
							copyGraph1(srcCurA2, subgraphNodes, subgraphArcs, uniqueLine);
							//break;
						}
					}
				}
				
				
				
				// parameter in
				
				Node paramIn = null;
				Node paramOut = null;
				
				Iterator<ParamPair> callIn = parametersIn.iterator();
				while(callIn.hasNext()){
					ParamPair pp1 = callIn.next();
					Node currentIn = pp1.getIn();
					Node currentOut = pp1.getOut();
					
					try{
						paramIn = graph.createNode(nodeType_process);
					} catch(TypeException ex){
						System.err.println("create parameter in node failed!!!" + ex.getMessage());
					}
					
					String id = "P"+(++this.processCounter);
					String name = "ParamIn_"+methodCallNode.getAttribute().getValueAt("name").toString();
					String viewID = currentOut.getAttribute().getValueAt("ident").toString();
					String viewName = currentOut.getAttribute().getValueAt("name").toString();
					boolean perst = Boolean.parseBoolean(currentOut.getAttribute().getValueAt("persistent").toString());
					String type = "Parameter In";
					String inOut = "OneToOne";
					int trigger = 1;
					String ref = methodCallNode.getAttribute().getValueAt("ref").toString();
					int startLine = Integer.parseInt(methodCallNode.getAttribute().getValueAt("line#").toString());
					int endLine = Integer.parseInt(methodCallNode.getAttribute().getValueAt("endLine#").toString());
					 
					enterValueProcessNode(paramIn, id, name, viewID, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
					
					try{
						Arc tempArc = graph.createArc(arcType, currentIn, paramIn);
					} catch(TypeException ex){
						System.err.println("Create param in node failed!!!" + ex.getMessage());
					}
					
					Iterator<Node> ait = subgraphNodes.iterator();
					while(ait.hasNext()){
						Node c2 = ait.next();
						String temp_id = c2.getAttribute().getValueAt("ident").toString().split("#")[0];
						logger.info("Candidate ID: " + temp_id);
						if(temp_id.equals(currentOut.getAttribute().getValueAt("ident").toString())){
							try{
								Arc tempArc = graph.createArc(arcType, paramIn, c2);
							} catch(TypeException ex){
								System.err.println("Create param in node failed!!!" + ex.getMessage());
							}
							break;
						}
					}
					
					
					
				}
				
				// return out
				
				try{
					paramOut = graph.createNode(nodeType_process);
				} catch(TypeException ex){
					System.err.println("create parameter in node failed!!!" + ex.getMessage());
				}
				
				String id = "P"+(++this.processCounter);
				String name = "";
				logger.info("Return: " + noReturn);
				if(noReturn==false)
					name = "Return_"+methodCallNode.getAttribute().getValueAt("name").toString();
				else
					name = "NoReturn_"+methodCallNode.getAttribute().getValueAt("name").toString();
				
				String viewID = outNode.getAttribute().getValueAt("ident").toString();
				String viewName = outNode.getAttribute().getValueAt("name").toString();
				boolean perst = Boolean.parseBoolean(outNode.getAttribute().getValueAt("persistent").toString());
				String type = "Return";
				String inOut = "OneToOne";
				int trigger = 1;
				String ref = methodDefNode.getAttribute().getValueAt("ref").toString();
				int startLine = Integer.parseInt(methodDefNode.getAttribute().getValueAt("line#").toString());
				int endLine = Integer.parseInt(methodDefNode.getAttribute().getValueAt("endLine#").toString());
				 
				enterValueProcessNode(paramOut, id, name, viewID, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
					
				// arc from return node to result node 
				try{
					Arc tempArc = graph.createArc(arcType, paramOut, outNode);
				} catch(TypeException ex){
					System.err.println("Create param in node failed!!!" + ex.getMessage());
				}
				
				
				Iterator<ParamPair> callOut = parametersOut.iterator();
				while(callOut.hasNext()){
					ParamPair pp2 = callOut.next();
					Node currentIn = pp2.getOut();
					//Node currentOut = pp2.getIn();
					
					
					
					Iterator<Node> ait = subgraphNodes.iterator();
					while(ait.hasNext()){
						Node c3 = ait.next();
						String temp_id = c3.getAttribute().getValueAt("ident").toString().split("#")[0];
						logger.info("Candidate ID: " + temp_id);
						if(temp_id.equals(currentIn.getAttribute().getValueAt("ident").toString())){
							try{
								Arc tempArc = graph.createArc(arcType, c3, paramOut);
							} catch(TypeException ex){
								System.err.println("Create param in node failed!!!" + ex.getMessage());
							}
							break;
						}
					}
										
					
						
					
				}
				
				boolean foundDefNode = false;
				Iterator<Node> nit = functionDefNodes.iterator();
				while(nit.hasNext()){
					Node curDefNode = nit.next();
					if(curDefNode.equals(methodDefNode)){
						foundDefNode = true;
						break;
					}
				}
				if(foundDefNode==false)
					functionDefNodes.add(methodDefNode);
				
				
				deletedNodes.add(methodCallNode);
				deletedNodes.add(curNode);
			} // initial if ends
		} // while ends
		
		//Nodes destroy
		Iterator<Node> del = deletedNodes.iterator();
		while(del.hasNext()){
			try {
				graph.destroyNode(del.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		deletedNodes.clear();
		
		Iterator<Node> nit1 = functionDefNodes.iterator();
		while(nit1.hasNext()){
			Node curDefNode = nit1.next();
			deletedNodes.add(curDefNode);
			deleteGraph(curDefNode, deletedNodes);
		}
		
		//Nodes destroy: Function Body
		Iterator<Node> del1 = deletedNodes.iterator();
		while(del1.hasNext()){
			try {
				graph.destroyNode(del1.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public void createObjectRule(){
		//searching for call-function block
		Node curNode = null;
		Node methodCallNode = null;
		Node methodDefNode = null;
		List parametersIn = new ArrayList<ParamPair>();
		List parametersOut = new ArrayList<ParamPair>();
		List deletedNodes = new ArrayList<Node>();
		List functionDefNodes = new ArrayList<Node>();
		String uniqueLine = "";
		
		Iterator<Node> e = graphGrammar.getGraph().getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("Create Object")){
				parametersIn.clear();
				parametersOut.clear();
				logger.info("Block: " + curNode.getAttribute().getValueAt("ident").toString());
				// get call node ->
				Iterator<Arc> outgoing = curNode.getOutgoingArcs();
				while(outgoing.hasNext()){
					methodCallNode = (Node) outgoing.next().getTarget();
				}
				//get def node <-
				Iterator<Arc> incoming = curNode.getIncomingArcs();
				while(incoming.hasNext()){
					methodDefNode = (Node) incoming.next().getSource();
				}
				
				logger.info("Method Call Node: " + methodCallNode.getAttribute().getValueAt("ident").toString());
				logger.info("Method Def Node : " + methodDefNode.getAttribute().getValueAt("ident").toString());
				uniqueLine = methodCallNode.getAttribute().getValueAt("line#").toString();
				
				// Parameters in
				String callCommandRef = methodCallNode.getAttribute().getValueAt("ref").toString();
				Iterator<Command> cmd = this.commands.iterator();
				List<Command> argsCommandIn = new ArrayList<Command>();
				while(cmd.hasNext()){
					Command curCmd = cmd.next();
					if(curCmd.toString().equals(callCommandRef)){
						logger.info("Call Command Ref: " + curCmd.toString());
						MethodCommand callCmd = ((MethodCommand) (curCmd));
						ArgumentsCommand argCmd = ((ArgumentsCommand)(callCmd.getArgument()));
						for(int i = 0; i < argCmd.getNumOfArgs(); i++){
							argsCommandIn.add(argCmd.getArgument(i));
						}
					}
				}
				
				String defCommandRef = "";
				Node methodInitNode = null;
				//matching class name and function name
				Iterator<ClassParamPair> cpit = this.classParameters.iterator();
				while(cpit.hasNext()){
					ClassParamPair curPP = cpit.next();
					Node classNode = curPP.getClassName();
					Node functionNode = curPP.getFunctionName();
					if(classNode.equals(methodDefNode)){
						if(functionNode.getAttribute().getValueAt("name").toString().equals("__init__")){
							defCommandRef = functionNode.getAttribute().getValueAt("ref").toString();
							methodInitNode = functionNode;
						}
					}
				}
				
				//String defCommandRef = methodDefNode.getAttribute().getValueAt("ref").toString();
				cmd = this.commands.iterator();
				List<Command> argsCommandOut = new ArrayList<Command>();
				while(cmd.hasNext()){
					Command curCmd = cmd.next();
					if(curCmd.toString().equals(defCommandRef)){
						logger.info("Def Command Ref: " + curCmd.toString());
						FunctionDefinitionCommand defCmd = ((FunctionDefinitionCommand) (curCmd));
						ArgumentsCommand argCmd = ((ArgumentsCommand)(defCmd.getArguments()));
						for(int i = 0; i < argCmd.getNumOfArgs(); i++){
							
							if(((VariableCommand)(argCmd.getArgument(i))).getName().equals("self")!=true){
								logger.info("Init Arguments: " + argCmd.getArgument(i));
								argsCommandOut.add(argCmd.getArgument(i));
							}
						}
					}
				}
				
				Node in = null;
				Node out = null;
				int count = argsCommandIn.size();
				logger.info("Count: " + count);
				for(int j = 0; j<count; j++){
					in = findViewTuples(argsCommandIn.get(j).toString());
					Iterator<FunctionParamPair> fpit = functionParameters.iterator();
					while(fpit.hasNext()){
						FunctionParamPair curFP = fpit.next();
						if(curFP.getFunction().equals(methodInitNode)){
							if(curFP.getParameter().getAttribute().getValueAt("ref").toString().equals(argsCommandOut.get(j).toString()))
							out = curFP.getParameter();
						}
					}
					
					//Node out = findViewTuples(argsCommandOut.get(j).toString());
					ParamPair pp = new ParamPair(in,out);
					
					parametersIn.add(pp);
				}
				
				Iterator<ParamPair> ppit = parametersIn.iterator();
				while(ppit.hasNext()){
					ParamPair curPair = ppit.next();
					logger.info("In: " + curPair.getIn().getAttribute().getValueAt("name").toString() + " Out: " + curPair.getOut().getAttribute().getValueAt("name").toString());
				}
								
				
				//Result Out
				Node callOutNode = null;
				Node defOutNode = null;
				Iterator<Arc> outCallit = methodCallNode.getOutgoingArcs();
				while(outCallit.hasNext()){
					callOutNode = (Node) outCallit.next().getTarget();
				}
				
				Iterator<Arc> outDefit = methodInitNode.getIncomingArcs();
				logger.info("Reference Node: " + methodInitNode.getAttribute().getValueAt("ident").toString());
				while(outDefit.hasNext()){
					Node temp = (Node) outDefit.next().getSource();
					if(temp.getNumberOfIncomingArcs()>0){
						ParamPair pp = new ParamPair(callOutNode, temp);
						parametersOut.add(pp);
					}
				}
				
				//ParamPair pp = new ParamPair(callOutNode, defOutNode);
				//parametersOut.add(pp);
				// copy graph
				List<Node> subgraphNodes = new ArrayList<Node>();
				List<Arc> subgraphArcs = new ArrayList<Arc>();
				
				subgraphNodes.clear();
				subgraphArcs.clear();
				
				Node tempNode = null;
				Node source = null;
				Iterator<ParamPair> ppit1 = parametersOut.iterator();
				while(ppit1.hasNext()){
					ParamPair curPair = ppit1.next();
					
					logger.info("In: " + curPair.getIn().getAttribute().getValueAt("name").toString() + " Out: " + curPair.getOut().getAttribute().getValueAt("name").toString());
					
					source = curPair.getOut();
					
					try{
						tempNode = graph.createNode(nodeType_view);
					} catch(TypeException ex){
						System.err.println("Create node failed!!!" + ex.getMessage());
					}
					copyNodeInfo(tempNode, source, uniqueLine);
					subgraphNodes.add(tempNode);
					
					copyGraph1(source, subgraphNodes, subgraphArcs, uniqueLine);
					//break;
				}
				
				
				
				
				
			
				// parameter in
				
				Node paramIn = null;
				Node paramOut = null;
				
				Iterator<ParamPair> callIn = parametersIn.iterator();
				while(callIn.hasNext()){
					ParamPair pp1 = callIn.next();
					Node currentIn = pp1.getIn();
					Node currentOut = pp1.getOut();
					
					try{
						paramIn = graph.createNode(nodeType_process);
					} catch(TypeException ex){
						System.err.println("create parameter in node failed!!!" + ex.getMessage());
					}
					
					String id = "P"+(++this.processCounter);
					String name = "ParamIn_"+methodCallNode.getAttribute().getValueAt("name").toString();
					String viewID = currentOut.getAttribute().getValueAt("ident").toString();
					String viewName = currentOut.getAttribute().getValueAt("name").toString();
					boolean perst = Boolean.parseBoolean(currentOut.getAttribute().getValueAt("persistent").toString());
					String type = "Parameter In";
					String inOut = "OneToOne";
					int trigger = 1;
					String ref = methodCallNode.getAttribute().getValueAt("ref").toString();
					int startLine = Integer.parseInt(methodCallNode.getAttribute().getValueAt("line#").toString());
					int endLine = Integer.parseInt(methodCallNode.getAttribute().getValueAt("endLine#").toString());
					 
					enterValueProcessNode(paramIn, id, name, viewID, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
					
					try{
						Arc tempArc = graph.createArc(arcType, currentIn, paramIn);
					} catch(TypeException ex){
						System.err.println("Create param in node failed!!!" + ex.getMessage());
					}
					
					Iterator<Node> ait = subgraphNodes.iterator();
					while(ait.hasNext()){
						Node c2 = ait.next();
						String temp_id = c2.getAttribute().getValueAt("ident").toString().split("#")[0];
						logger.info("Candidate ID: " + temp_id);
						if(temp_id.equals(currentOut.getAttribute().getValueAt("ident").toString())){
							try{
								Arc tempArc = graph.createArc(arcType, paramIn, c2);
							} catch(TypeException ex){
								System.err.println("Create param in node failed!!!" + ex.getMessage());
							}
							break;
						}
					}
					
					
					
				}
				
				// return out
				try{
					paramOut = graph.createNode(nodeType_process);
				} catch(TypeException ex){
					System.err.println("create parameter in node failed!!!" + ex.getMessage());
				}
				
				String id = "P"+(++this.processCounter);
				String name = "Init_"+methodCallNode.getAttribute().getValueAt("name").toString();
				String viewID = callOutNode.getAttribute().getValueAt("ident").toString();
				String viewName = callOutNode.getAttribute().getValueAt("name").toString();
				boolean perst = Boolean.parseBoolean(callOutNode.getAttribute().getValueAt("persistent").toString());
				String type = "Return";
				String inOut = "OneToOne";
				int trigger = 1;
				String ref = methodInitNode.getAttribute().getValueAt("ref").toString();
				int startLine = Integer.parseInt(methodInitNode.getAttribute().getValueAt("line#").toString());
				int endLine = Integer.parseInt(methodInitNode.getAttribute().getValueAt("endLine#").toString());
				 
				enterValueProcessNode(paramOut, id, name, viewID, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
				
				Iterator<ParamPair> callOut = parametersOut.iterator();
				while(callOut.hasNext()){
					ParamPair pp2 = callOut.next();
					Node currentIn = pp2.getOut();
					Node currentOut = pp2.getIn();
					
					
					
					Iterator<Node> ait = subgraphNodes.iterator();
					while(ait.hasNext()){
						Node c3 = ait.next();
						String temp_id = c3.getAttribute().getValueAt("ident").toString().split("#")[0];
						logger.info("Candidate ID: " + temp_id);
						if(temp_id.equals(currentIn.getAttribute().getValueAt("ident").toString())){
							try{
								Arc tempArc = graph.createArc(arcType, c3, paramOut);
							} catch(TypeException ex){
								System.err.println("Create param in node failed!!!" + ex.getMessage());
							}
							break;
						}
					}
										
					
						
					
				}
								
				try{
					Arc tempArc = graph.createArc(arcType, paramOut, callOutNode);
				} catch(TypeException ex){
					System.err.println("Create param in node failed!!!" + ex.getMessage());
				}
				
				
				boolean foundDefNode = false;
				Iterator<Node> nit = functionDefNodes.iterator();
				while(nit.hasNext()){
					Node curDefNode = nit.next();
					if(curDefNode.equals(methodDefNode)){
						foundDefNode = true;
						break;
					}
				}
				if(foundDefNode==false)
					functionDefNodes.add(methodDefNode);
				
				
				deletedNodes.add(methodCallNode);
				deletedNodes.add(curNode);
			} // initial if ends
		} // while ends
		
		//Nodes destroy
		Iterator<Node> del = deletedNodes.iterator();
		while(del.hasNext()){
			try {
				graph.destroyNode(del.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		deletedNodes.clear();
		
		Iterator<Node> nit1 = functionDefNodes.iterator();
		while(nit1.hasNext()){
			Node curDefNode = nit1.next();
			deletedNodes.add(curDefNode);
			deleteGraph(curDefNode, deletedNodes);
		}
		
		//Nodes destroy: Function Body
		/*
		Iterator<Node> del1 = deletedNodes.iterator();
		while(del1.hasNext()){
			try {
				graph.destroyNode(del1.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		*/
		
	}
	
	public void callMemberFunctionRule(){
		//searching for call-function block
		Node curNode = null;
		Node methodCallNode = null;
		Node methodDefNode = null;
		Node methodInitNode = null;
		Node methodNameNode = null;
		Node objectNode = null;
		List parametersIn = new ArrayList<ParamPair>();
		List parametersOut = new ArrayList<ParamPair>();
		List deletedNodes = new ArrayList<Node>();
		List functionDefNodes = new ArrayList<Node>();
		String uniqueLine = "";
		String functionName = "";
		Iterator<Node> e = graphGrammar.getGraph().getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("Call Member Function")){
				parametersIn.clear();
				parametersOut.clear();
				logger.info("Block: " + curNode.getAttribute().getValueAt("ident").toString());
				// get call node ->
				Iterator<Arc> outgoing = curNode.getOutgoingArcs();
				while(outgoing.hasNext()){
					methodCallNode = (Node) outgoing.next().getTarget();
					Iterator<Arc> inc = methodCallNode.getIncomingArcs();
					while(inc.hasNext()){
						Arc curIncs =  inc.next();
						Node curN = (Node) curIncs.getSource();
						if(curN.getType().getName().equals("View")){
							objectNode = (Node) curIncs.getSource();
						}
					}
				}
				
				
				functionName = methodCallNode.getAttribute().getValueAt("name").toString();
				
				//get def node <-
				Iterator<Arc> incoming = curNode.getIncomingArcs();
				while(incoming.hasNext()){
					methodDefNode = (Node) incoming.next().getSource();
				}
				
				if(methodDefNode!=null){
					logger.info("Method Call Node: " + methodCallNode.getAttribute().getValueAt("ident").toString());
					logger.info("Method Def Node : " + methodDefNode.getAttribute().getValueAt("ident").toString());
					uniqueLine = methodCallNode.getAttribute().getValueAt("line#").toString();
					
					// get functionNode
					
					Node callOutNode = null;
					Iterator<Arc> outCallit = methodCallNode.getOutgoingArcs();
					while(outCallit.hasNext()){
						callOutNode = (Node) outCallit.next().getTarget();
					}
					
					// check if there is return
					boolean noReturn = true;
					Node ReturnNode = null;
					Iterator<Arc> incoming1 = methodDefNode.getIncomingArcs();
					while(incoming1.hasNext()){
						Arc curIncoming1 = incoming1.next();
						Node source = (Node) curIncoming1.getSource();
						if(source.getAttribute().getValueAt("name").toString().equals(functionName)){
							methodNameNode = source;
							Iterator<Arc> incoming2 = source.getIncomingArcs();
							while(incoming2.hasNext()){
								Node temp = (Node) incoming2.next().getSource();
								if(temp.getAttribute().getValueAt("name").toString().equals("return")){
									noReturn = false;
									ReturnNode = temp;
									break;
								}
							}
						}
					}
					
					//Result Out
					
					if(noReturn == false){
						Iterator<Arc> incoming3 = ReturnNode.getIncomingArcs();
						while(incoming3.hasNext()){
							Arc curIncoming3 = incoming3.next();
							methodInitNode = (Node) curIncoming3.getSource();
							ParamPair pp = new ParamPair(callOutNode, methodInitNode);
							parametersOut.add(pp);					
						}
					}
					else{
						incoming1 = methodDefNode.getIncomingArcs();
						while(incoming1.hasNext()){
							Arc curIncoming1 = incoming1.next();
							Node source = (Node) curIncoming1.getSource();
							if(source.getAttribute().getValueAt("name").toString().equals(functionName)){
								methodNameNode = source;
								Iterator<Arc> incoming2 = source.getIncomingArcs();
								while(incoming2.hasNext()){
									Node temp = (Node) incoming2.next().getSource();
									if(temp.getNumberOfIncomingArcs() > 0){
										ParamPair pp = new ParamPair(callOutNode, temp);
										parametersOut.add(pp);	
									}
								}
							}
						}
					}
					
					// Result In 
					String callCommandRef = methodCallNode.getAttribute().getValueAt("ref").toString();
					Iterator<Command> cmd = this.commands.iterator();
					List<Command> argsCommandIn = new ArrayList<Command>();
					while(cmd.hasNext()){
						Command curCmd = cmd.next();
						if(curCmd.toString().equals(callCommandRef)){
							logger.info("Call Command Ref: " + curCmd.toString());
							MethodCommand callCmd = ((MethodCommand) (curCmd));
							ArgumentsCommand argCmd = ((ArgumentsCommand)(callCmd.getArgument()));
							for(int i = 0; i < argCmd.getNumOfArgs(); i++){
								argsCommandIn.add(argCmd.getArgument(i));
							}
						}
					}
					
					
					String defCommandRef = methodNameNode.getAttribute().getValueAt("ref").toString();
					cmd = this.commands.iterator();
					List<Command> argsCommandOut = new ArrayList<Command>();
					while(cmd.hasNext()){
						Command curCmd = cmd.next();
						if(curCmd.toString().equals(defCommandRef)){
							logger.info("Def Command Ref: " + curCmd.toString());
							FunctionDefinitionCommand defCmd = ((FunctionDefinitionCommand) (curCmd));
							ArgumentsCommand argCmd = ((ArgumentsCommand)(defCmd.getArguments()));
							for(int i = 0; i < argCmd.getNumOfArgs(); i++){
								String tempName = "";
								Command temp = argCmd.getArgument(i);
								if(temp instanceof VariableCommand)
									tempName = ((VariableCommand)(temp)).getName();
								if(tempName.equals("self")!=true)
									argsCommandOut.add(argCmd.getArgument(i));
							}
						}
					}
					
					Node in = null;
					Node out = null;
					int count = argsCommandIn.size();
					logger.info("Count: " + count);
					for(int j = 0; j<count; j++){
						in = findViewTuples(argsCommandIn.get(j).toString());
						Iterator<FunctionParamPair> fpit = functionParameters.iterator();
						while(fpit.hasNext()){
							FunctionParamPair curFP = fpit.next();
							if(curFP.getFunction().equals(methodNameNode)){
								if(curFP.getParameter().getAttribute().getValueAt("ref").toString().equals(argsCommandOut.get(j).toString()))
								out = curFP.getParameter();
							}
						}
						
						//Node out = findViewTuples(argsCommandOut.get(j).toString());
						ParamPair pp = new ParamPair(in,out);
						
						parametersIn.add(pp);
					}
					
					Iterator<ParamPair> ppit = parametersIn.iterator();
					while(ppit.hasNext()){
						ParamPair curPair = ppit.next();
						logger.info("In: " + curPair.getIn().getAttribute().getValueAt("name").toString() + " Out: " + curPair.getOut().getAttribute().getValueAt("name").toString());
					}
					
					// copy graph
					List<Node> subgraphNodes = new ArrayList<Node>();
					List<Arc> subgraphArcs = new ArrayList<Arc>();
					
					subgraphNodes.clear();
					subgraphArcs.clear();
					
					Node tempNode = null;
					Node source = null;
					Iterator<ParamPair> ppit1 = parametersOut.iterator();
					while(ppit1.hasNext()){
						ParamPair curPair = ppit1.next();
						
						logger.info("In: " + curPair.getIn().getAttribute().getValueAt("name").toString() + " Out: " + curPair.getOut().getAttribute().getValueAt("name").toString());
						
						source = curPair.getOut();
						
						try{
							tempNode = graph.createNode(nodeType_view);
						} catch(TypeException ex){
							System.err.println("Create node failed!!!" + ex.getMessage());
						}
						copyNodeInfo(tempNode, source, uniqueLine);
						subgraphNodes.add(tempNode);
						
						copyGraph1(source, subgraphNodes, subgraphArcs, uniqueLine);
						//break;
					}
					
				
					// parameter in -- only if it is zero
					
					//List candidateNodes = new ArrayList<Node>();
					
					if(parametersIn.size()==0){
						Iterator<Node> n = subgraphNodes.iterator();
						while(n.hasNext()){
							Node curN = n.next();
							if(curN.getAttribute().getValueAt("name").toString().contains("self")){
								ParamPair pp1 = new ParamPair(objectNode, curN);
								parametersIn.add(pp1);
							}
						}
					}
					
					Node paramIn = null;
					Node paramOut = null;
					
					Iterator<ParamPair> callIn = parametersIn.iterator();
					while(callIn.hasNext()){
						ParamPair pp1 = callIn.next();
						Node currentIn = pp1.getIn();
						Node currentOut = pp1.getOut();
						
						try{
							paramIn = graph.createNode(nodeType_process);
						} catch(TypeException ex){
							System.err.println("create parameter in node failed!!!" + ex.getMessage());
						}
						
						String id = "P"+(++this.processCounter);
						String name = "ParamIn_"+methodDefNode.getAttribute().getValueAt("name").toString()+ "." + methodCallNode.getAttribute().getValueAt("name").toString();
						String viewID = currentOut.getAttribute().getValueAt("ident").toString();
						String viewName = currentOut.getAttribute().getValueAt("name").toString();
						boolean perst = Boolean.parseBoolean(currentOut.getAttribute().getValueAt("persistent").toString());
						String type = "Parameter In";
						String inOut = "OneToOne";
						int trigger = 1;
						String ref = methodCallNode.getAttribute().getValueAt("ref").toString();
						int startLine = Integer.parseInt(methodCallNode.getAttribute().getValueAt("line#").toString());
						int endLine = Integer.parseInt(methodCallNode.getAttribute().getValueAt("endLine#").toString());
						 
						enterValueProcessNode(paramIn, id, name, viewID, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
						
						logger.info("Current In: " + currentIn.getAttribute().getValueAt("ident").toString());
						logger.info("paramIn   : " + paramIn.getAttribute().getValueAt("ident").toString());
						logger.info("Current Out: " + currentOut.getAttribute().getValueAt("ident").toString());
						
						try{
							Arc tempArc = graph.createArc(arcType, currentIn, paramIn);
						} catch(TypeException ex){
							System.err.println("Create param in node failed!!!" + ex.getMessage());
						}
						
						
						
						Iterator<Node> ait = subgraphNodes.iterator();
						while(ait.hasNext()){
							Node c2 = ait.next();
							String temp_id = c2.getAttribute().getValueAt("ident").toString().split("#")[0];
							logger.info("Candidate ID: " + temp_id);
							if(temp_id.equals(currentOut.getAttribute().getValueAt("ident").toString().split("#")[0])){
								try{
									Arc tempArc = graph.createArc(arcType, paramIn, c2);
								} catch(TypeException ex){
									System.err.println("Create param in node failed!!!" + ex.getMessage());
								}
								break;
							}
						}
						
						/*
						try{
							Arc tempArc = graph.createArc(arcType, paramIn, currentOut);
						} catch(TypeException ex){
							System.err.println("Create param in node failed!!!" + ex.getMessage());
						}
						*/
						
					}
					
					// return out
					try{
						paramOut = graph.createNode(nodeType_process);
					} catch(TypeException ex){
						System.err.println("create parameter in node failed!!!" + ex.getMessage());
					}
					
					String id = "P"+(++this.processCounter);
					String name = "";
					if(noReturn == false)
						name = "Return_"+methodDefNode.getAttribute().getValueAt("name").toString()+ "." + methodCallNode.getAttribute().getValueAt("name").toString();
					else
						name = "NoReturn_"+methodDefNode.getAttribute().getValueAt("name").toString()+ "." + methodCallNode.getAttribute().getValueAt("name").toString();
					String viewID = callOutNode.getAttribute().getValueAt("ident").toString();
					String viewName = callOutNode.getAttribute().getValueAt("name").toString();
					boolean perst = Boolean.parseBoolean(callOutNode.getAttribute().getValueAt("persistent").toString());
					String type = "Return";
					String inOut = "OneToOne";
					int trigger = 1;
					String ref = methodNameNode.getAttribute().getValueAt("ref").toString();
					int startLine = Integer.parseInt(methodNameNode.getAttribute().getValueAt("line#").toString());
					int endLine = Integer.parseInt(methodNameNode.getAttribute().getValueAt("endLine#").toString());
					 
					enterValueProcessNode(paramOut, id, name, viewID, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
					
					Iterator<ParamPair> callOut = parametersOut.iterator();
					while(callOut.hasNext()){
						ParamPair pp2 = callOut.next();
						Node currentIn = pp2.getOut();
						Node currentOut = pp2.getIn();
						
						
						
						Iterator<Node> ait = subgraphNodes.iterator();
						while(ait.hasNext()){
							Node c3 = ait.next();
							String temp_id = c3.getAttribute().getValueAt("ident").toString().split("#")[0];
							logger.info("Candidate ID: " + temp_id);
							if(temp_id.equals(currentIn.getAttribute().getValueAt("ident").toString())){
								try{
									Arc tempArc = graph.createArc(arcType, c3, paramOut);
								} catch(TypeException ex){
									System.err.println("Create param in node failed!!!" + ex.getMessage());
								}
								break;
							}
						}
					}
									
					try{
						Arc tempArc = graph.createArc(arcType, paramOut, callOutNode);
					} catch(TypeException ex){
						System.err.println("Create param in node failed!!!" + ex.getMessage());
					}
					
					
					boolean foundDefNode = false;
					Iterator<Node> nit = functionDefNodes.iterator();
					while(nit.hasNext()){
						Node curDefNode = nit.next();
						if(curDefNode.equals(methodDefNode)){
							foundDefNode = true;
							break;
						}
					}
					if(foundDefNode==false)
						functionDefNodes.add(methodDefNode);
					
					
					deletedNodes.add(methodCallNode);
					deletedNodes.add(curNode);
				}
				else{
					deletedNodes.add(curNode);
				}
			} // initial if ends
		} // while ends
		
		//Nodes destroy
		Iterator<Node> del = deletedNodes.iterator();
		while(del.hasNext()){
			try {
				graph.destroyNode(del.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		deletedNodes.clear();
		
		Iterator<Node> nit1 = functionDefNodes.iterator();
		while(nit1.hasNext()){
			Node curDefNode = nit1.next();
			deletedNodes.add(curDefNode);
			deleteGraph(curDefNode, deletedNodes);
		}
		
		//Nodes destroy: Function Body
		
		Iterator<Node> del1 = deletedNodes.iterator();
		while(del1.hasNext()){
			try {
				graph.destroyNode(del1.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
	
	// method concatenation rule
	public void methodConcatenation(){
		Node curNode = null;
		Node subNode = null;
		Node foundNode = null;
		Arc foundArc = null;
		Iterator<Node> e = graph.getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			curNode = e.next();
			// checking whether it is a method or not
			if(curNode.getAttribute().getValueAt("type").toString().equals("Method")){
				Iterator<Arc> a = curNode.getOutgoingArcs();
				while(a.hasNext()){
					Arc curArc = a.next();
					Node trg = (Node)curArc.getTarget();
					if(trg.getNumberOfOutgoingArcs()==2 && trg.getAttribute().getValueAt("intermediate").toString().equals("true")){ // Checking more than 1 outgoing edges
						Iterator<Arc> a1 = trg.getOutgoingArcs();
						// getting  = node and corresponding arc
						while(a1.hasNext()){
							Arc curArc1 = a1.next();
							Node trg1 = (Node) curArc1.getTarget();
							if(trg1.getAttribute().getValueAt("type").toString().equals("Method")){
								subNode = trg1;
							}
							else {
								foundNode = trg1;
								foundArc = curArc1;
							}
						}
						
						if(foundNode!=null && subNode!=null){
							logger.info("Cur: " + curNode.getAttribute().getValueAt("ident").toString() +" sub: " + subNode.getAttribute().getValueAt("ident").toString() + " found: " + foundNode.getAttribute().getValueAt("ident").toString());
							if(subNode.getNumberOfOutgoingArcs()==1){
								
								Integer s = Integer.parseInt(subNode.getAttribute().getValueAt("line#").toString());
								Integer f = Integer.parseInt(foundNode.getAttribute().getValueAt("line#").toString());
								if(s==f){ // same line 
									logger.info("Line# Sub: " + s + " Found: " + f);
									Iterator<Arc> a2 = subNode.getOutgoingArcs();
									while(a2.hasNext()){
										Arc curArc2 = a2.next();
										Node targetNode = (Node) curArc2.getTarget();
										createArc(targetNode,foundNode);
										try {
											graph.destroyArc(foundArc);
										} catch (TypeException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
									methodConcatenation();
								}
							}
							
						} // if we find misplaced equal node 
						
					}
				}
				
			}
			
		} // finished
	
	}
	
	// with construct rule - enter() exit()
	public void withRule(){
		Node curNode = null;
		Integer line = new Integer(0);
		Node outNode = null;
		List<Node> otherOutNodes = new ArrayList<Node>();
		Node inNode = null;
		List<Node> otherInNodes = new ArrayList<Node>();
		Node enterNode = null;
		Node enterViewNode = null;
		Node exitNode = null;
		Node exitViewNode = null;
		List<Node> deletedNodes = new ArrayList<Node>();
		Iterator<Node> e = graph.getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			curNode = e.next();
			// checking with node
			if(curNode.getAttribute().getValueAt("name").toString().equals("with")){
				line = Integer.parseInt(curNode.getAttribute().getValueAt("line#").toString());
				// outgoing arcs
				Iterator<Arc> aOut = curNode.getOutgoingArcs();
				while(aOut.hasNext()){
					Arc curArc = aOut.next();
					Node trg = (Node) curArc.getTarget();
					Integer trgLine = Integer.parseInt(trg.getAttribute().getValueAt("line#").toString());
					if(trgLine == line){ // as node
						outNode = trg;
						logger.info("OutNode: " + outNode.getAttribute().getValueAt("ident").toString());
					}
					else{ // ancestor node 
						otherOutNodes.add(trg);
					}
				}
				// incoming arcs
				Iterator<Arc> aIn = curNode.getIncomingArcs();
				// outgoing arcs
				while(aIn.hasNext()){
					Arc curArc = aIn.next();
					Node src = (Node) curArc.getSource();
					//Integer srcLine = Integer.parseInt(src.getAttribute().getValueAt("line#").toString());
					// ancestor node 
					otherInNodes.add(src);
				}
				
				// insert enter() Method
				try{
					enterNode = graph.createNode(nodeType_process); 		
				} catch (TypeException ex) {
					logger.info("Create enter process failed! " + ex.getMessage());
				}
				
				String enterID = "P" + (++this.processCounter);
				String enterRef = curNode.getAttribute().getValueAt("ref").toString();
				Integer enterLine = Integer.parseInt(curNode.getAttribute().getValueAt("line#").toString());
				
				if(enterNode!=null)
					enterValueProcessNode(enterNode, enterID, "enter", "NA", "NA", false, "method", "OneToOne", 1, enterRef, enterLine, enterLine);
				
				enterViewNode = createIntermediateView(enterID, enterRef, enterLine, false);
				
				// find out as node
				Arc deletedArc = null;
				Iterator<Arc> a = outNode.getOutgoingArcs();
				while(a.hasNext()){
					Arc asArc = a.next();
					Node asNode = (Node) asArc.getTarget();
					createArc(enterViewNode, asNode);
					deletedArc = asArc;
					
				}
				
				createArc(outNode, enterNode);
				createArc(enterNode, enterViewNode);
				
				
				try {
					graph.destroyArc(deletedArc);
				} catch (TypeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// insert exit() method
				try{
					exitNode = graph.createNode(nodeType_process); 		
				} catch (TypeException ex) {
					logger.info("Create exit process failed! " + ex.getMessage());
				}
				
				
				
				String exitID = "P" + (++this.processCounter);
				String exitRef = curNode.getAttribute().getValueAt("ref").toString();
				Integer exitLine = Integer.parseInt(curNode.getAttribute().getValueAt("endLine#").toString());
				
				if(exitNode!=null)
					enterValueProcessNode(exitNode, exitID, "exit", "NA", "NA", false, "method", "OneToOne", 1, exitRef, exitLine, exitLine);
				
				exitViewNode = createIntermediateView(exitID, exitRef, exitLine, false);
				
				createArc(exitNode, exitViewNode);
				
				// connecting inNodes to exit Node
				Iterator<Node> in = otherInNodes.iterator();
				while(in.hasNext()){
					Node nin = in.next();
					createArc(nin, exitNode);
				}
				
				// exitView Node to other out nodes
				Iterator<Node> out = otherOutNodes.iterator();
				while(out.hasNext()){
					Node nout = out.next();
					createArc(exitViewNode,nout);
				}
				
				deletedNodes.add(curNode);
				
			}
		}
		
		// destroy with nodes
		Iterator<Node> del = deletedNodes.iterator();
		while(del.hasNext()){
			try {
				graph.destroyNode(del.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	// try-except-finally rule
	public void tryExceptFinallyRule(){
		Node curNode = null;
		Node curNode1 = null;
		
		boolean blockFound = false;
		
		
		
		
		Iterator<Node> e = graph.getNodes(nodeType_process).iterator();
		while(e.hasNext()){
			Node tryNode = null;
			Node exceptNode = null;
			Node finallyNode = null;
			
			List<Node> inNodes = new ArrayList<Node>();
			List<Node> tryInNodes = new ArrayList<Node>();
			List<Node> exceptInNodes = new ArrayList<Node>();
			List<Node> exceptOriginNodes = new ArrayList<Node>();
			List<Node> deletedNodes = new ArrayList<Node>();
			
			curNode = e.next();
			if(curNode.getAttribute().getValueAt("name").toString().equals("Try-Except-Finally Block")){
				blockFound = true;
				deletedNodes.add(curNode);
				Iterator<Arc> a = curNode.getIncomingArcs();
				while(a.hasNext()){
					inNodes.add((Node) a.next().getSource());
				}
			}
			if(blockFound){
				Iterator<Node> n = inNodes.iterator();
				// distinguish try, except, finally node
				while(n.hasNext()){
					curNode1 = n.next();
					if(curNode1.getAttribute().getValueAt("name").toString().equals("try")){
						tryNode = curNode1;
					}
					else if(curNode1.getAttribute().getValueAt("name").toString().equals("except")){
						exceptNode = curNode1;
					}
					else
						finallyNode = curNode1;
						
				}
				
				// process try node
				deletedNodes.add(tryNode);
				Iterator<Arc> t = tryNode.getIncomingArcs();
				while(t.hasNext()){
					tryInNodes.add((Node) t.next().getSource());
				}
				
				// process except nodes
				
				deletedNodes.add(exceptNode);
				
				Iterator<Arc> t1 = exceptNode.getIncomingArcs();
				while(t1.hasNext()){
					exceptInNodes.add((Node) t1.next().getSource());
				}
				
				Iterator<Node> n1 = exceptInNodes.iterator();
				while(n1.hasNext()){
					List temp = nodeAncestor(e.next());
					if(temp!=null){
						Iterator<Node> n2 = temp.iterator();
						while(n2.hasNext()){
							Node current = n2.next();
							exceptOriginNodes.add(current);
							deletedNodes.add(current);
						}
					}
				}
						
				/*
				Node noExceptNode = null;
				try {
					noExceptNode = graph.createNode(nodeType_process);
				} catch (TypeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String noExceptID = exceptNode.getAttribute().getValueAt("ident").toString() + "'";
				String noExceptName = "No exception";
				String noExceptRef = exceptNode.getAttribute().getValueAt("ref").toString();
				Integer noExceptLine = Integer.parseInt(exceptNode.getAttribute().getValueAt("line#").toString());
				
				enterValueProcessNode(noExceptNode, noExceptID, noExceptName, "NA", "NA", false, "No Exception", "OneToOne", -1, noExceptRef, noExceptLine, noExceptLine);
				
				*/
				
				// process finally node
				if(finallyNode!=null){
					deletedNodes.add(finallyNode);		
				}
				
				
				Iterator<Node> del = deletedNodes.iterator();
				while(del.hasNext()){
						Node current = del.next();
						logger.info("Deleted Node: " + current.getAttribute().getValueAt("ident").toString());
						try {
							graph.destroyNode(current);
						} catch (TypeException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
				
				
			
			}
			// if not found
			
		}
		
		
	}
	
	
	public void nodeReachable(Node b, List c){
		c.add(b);
		if(b.getNumberOfIncomingArcs()>0){
			Iterator<Arc> arcit = b.getIncomingArcs();
			while(arcit.hasNext()){
				nodeReachable((Node) arcit.next().getSource(), c);
			}
		}
		return;
		
	}
	public List nodeAncestor(Node a){
		List ancestorNodes = new ArrayList<Node>();
		
		ancestorNodes.add(a);
		if(a.getNumberOfIncomingArcs()>0){
			Iterator<Arc> arcit = a.getIncomingArcs();
			while(arcit.hasNext()){
				nodeReachable((Node) arcit.next().getSource(), ancestorNodes);
			}
		}
		return ancestorNodes;
	}
	
	public void nodeReachableWhile(Node b, List c, String str){
		
		if(b.getAttribute().getValueAt("name").toString().equals(str)==false){
			c.add(b);
			if(b.getNumberOfIncomingArcs()>0){
				Iterator<Arc> arcit = b.getIncomingArcs();
				while(arcit.hasNext()){
					nodeReachableWhile((Node) arcit.next().getSource(), c, str);
				}
			}
		}
		return;
		
	}
	
	public List nodeAncestorWhile(Node a, String str){
		List ancestorNodes = new ArrayList<Node>();
		
		ancestorNodes.add(a);
		if(a.getNumberOfIncomingArcs()>0){
			Iterator<Arc> arcit = a.getIncomingArcs();
			while(arcit.hasNext()){
				nodeReachableWhile((Node) arcit.next().getSource(), ancestorNodes, str);
			}
		}
		return ancestorNodes;
	}
	
	public void deleteGraph(Node cur, List n){
		boolean foundNode = false;
		Iterator<Arc> incoming = cur.getIncomingArcs();
		while(incoming.hasNext()){
			foundNode = false;
			Arc curArc = incoming.next();
			Node curNode = (Node) curArc.getSource();
			
			Iterator<Node> nodes = n.iterator();
			while(nodes.hasNext()){
				Node c1 = nodes.next();
				if(c1.equals(curNode)){
					foundNode = true;
					break;
				}
			}
			
			if(foundNode == false){
				n.add(curNode);
			}
			
			deleteGraph(curNode, n);
		}
	}
	
	public void copyGraph1(Node cur, List n, List a, String uniqueLine){
		
		boolean foundNode = false;
		boolean foundArc = false;
		Arc tempArc = null;
		Node tempNode = null;
		Node sourceNode = null;
		Node targetNode = null;
		
		Iterator<Node> nodes1 = n.iterator();
		while(nodes1.hasNext()){
			Node c = nodes1.next();
			String temp_id = c.getAttribute().getValueAt("ident").toString().split("#")[0];
			//logger.infoln("Candidate ID: " + temp_id);
			if(temp_id.equals(cur.getAttribute().getValueAt("ident").toString())){
				targetNode = c;
				break;
			}
		}
		
		logger.info("Target Node: " + targetNode.getAttribute().getValueAt("ident").toString());
		
		Iterator<Arc> incoming = cur.getIncomingArcs();
		while(incoming.hasNext()){
			Arc curArc = incoming.next();
			Node curNode = (Node) curArc.getSource();
			foundNode = false;
			foundArc = false;
			
			Iterator<Node> nodes = n.iterator();
			while(nodes.hasNext()){
				Node c1 = nodes.next();
				String temp_id = c1.getAttribute().getValueAt("ident").toString().split("#")[0];
				//logger.infoln("Candidate ID: " + temp_id);
				if(temp_id.equals(curNode.getAttribute().getValueAt("ident").toString())){
					foundNode = true;
					sourceNode = c1;
					break;
				}
			}
			if(foundNode==false){
				logger.info("New Node Found ... " + curNode.getAttribute().getValueAt("ident").toString());
					
				if(curNode.getType().getName().equals("View")){
					try{
						tempNode = graph.createNode(nodeType_view);
					} catch(TypeException ex){
						System.err.println("Copy node failed !!!" + ex.getMessage());
					}
						
					copyNodeInfo(tempNode, curNode, uniqueLine);
						
				}
				else if(curNode.getType().getName().equals("Process")){
					try{
						tempNode = graph.createNode(nodeType_process);
					} catch(TypeException ex){
						System.err.println("Copy node failed !!!" + ex.getMessage());
					}
					copyNodeInfo(tempNode, curNode, uniqueLine);
				}
				else if(curNode.getType().getName().equals("Source")){
					try{
						tempNode = graph.createNode(nodeType_source);
					} catch(TypeException ex){
						System.err.println("Copy node failed !!!" + ex.getMessage());
					}
						
					copyNodeInfo(tempNode, curNode, uniqueLine);
				}
				else if(curNode.getType().getName().equals("Source Process")){
					try{
						tempNode = graph.createNode(nodeType_sourceProcess);
					} catch(TypeException ex){
						System.err.println("Copy node failed !!!" + ex.getMessage());
					}
					
					copyNodeInfo(tempNode, curNode, uniqueLine);
				}
				else{
						
				}
					
				n.add(tempNode);
				sourceNode = tempNode;
			}
			
			logger.info("-------------------------------------");
			logger.info("New Arc: " );
			logger.info(sourceNode.getAttribute().getValueAt("ident").toString());
			logger.info(" -> " + targetNode.getAttribute().getValueAt("ident").toString());
			logger.info("\n");
			
			Iterator<Arc> arcs = a.iterator();
			while(arcs.hasNext()){
				Arc tempArc1 = arcs.next();
				Node src = (Node) tempArc1.getSource();
				Node trg = (Node) tempArc1.getTarget();
					
				logger.info("Old Arc: " + src.getAttribute().getValueAt("ident").toString() + " -> " + trg.getAttribute().getValueAt("ident").toString());
				if(sourceNode.getAttribute().getValueAt("ident").toString().equals(src.getAttribute().getValueAt("ident").toString()) 
				&& targetNode.getAttribute().getValueAt("ident").toString().equals(trg.getAttribute().getValueAt("ident").toString())){
					logger.info("Found Arc");
					foundArc = true;
					break;
				}
					
			}
			if(foundArc==false){
				try{
					tempArc = graph.createArc(arcType, sourceNode, targetNode);
				} catch(TypeException ex){
					System.err.println("Copy arc failed !!!" + ex.getMessage());
				}
					
				a.add(tempArc);
				
			}
			
			logger.info("Call Copy Graph: " + curNode.getAttribute().getValueAt("ident").toString());
			copyGraph1(curNode, n, a, uniqueLine);
					
		}
		
	}
	
	
	
	public void copyNodeInfo(Node to, Node from, String uniqueLine){
		String id = from.getAttribute().getValueAt("ident").toString() + "#" + uniqueLine;
		String name = from.getAttribute().getValueAt("name").toString();
		String ref = from.getAttribute().getValueAt("ref").toString();
		int line = Integer.parseInt(from.getAttribute().getValueAt("line#").toString());
		
		if(from.getType().getName().equals("View")){
			String processID = from.getAttribute().getValueAt("process_ident").toString();
			boolean perst = Boolean.parseBoolean(from.getAttribute().getValueAt("persistent").toString());
			boolean inter = Boolean.parseBoolean(from.getAttribute().getValueAt("intermediate").toString());
			String desc = from.getAttribute().getValueAt("desc").toString();
			
			
			enterValueViewNode(to, id, name, processID, perst, inter, ref, desc, line);
		}
		
		else if(from.getType().getName().equals("Process")){
			boolean perst = false;
			String viewID = from.getAttribute().getValueAt("view_ident").toString();
			String viewName = from.getAttribute().getValueAt("view_name").toString();
			if(from.getAttribute().getValueAt("view_persistent")!=null)
				perst = Boolean.parseBoolean(from.getAttribute().getValueAt("view_persistent").toString());
			String type = from.getAttribute().getValueAt("type").toString();
			String inOut = from.getAttribute().getValueAt("in/out").toString();
			int trigger  = Integer.parseInt(from.getAttribute().getValueAt("trigger").toString());
			int endLine = Integer.parseInt(from.getAttribute().getValueAt("endLine#").toString());
		
			enterValueProcessNode(to, id, name, viewID, viewName, perst, type, inOut, trigger, ref, line, endLine);
		}
		
		else if(from.getType().getName().equals("Source")){
			String type = from.getAttribute().getValueAt("type").toString();
			String arguments = from.getAttribute().getValueAt("arguments").toString();
			
			
			enterValueSourceNode(to, id, name, type, arguments, ref, line);
		}
		
		else if(from.getType().getName().equals("Source Process")){
			String viewID = from.getAttribute().getValueAt("view_ident").toString();
			String viewName = from.getAttribute().getValueAt("view_name").toString();
			boolean perst = Boolean.parseBoolean(from.getAttribute().getValueAt("view_persistent").toString());
			String sourceID = from.getAttribute().getValueAt("source_ident").toString();
			String sourceName = from.getAttribute().getValueAt("source_name").toString();
			String type = from.getAttribute().getValueAt("type").toString();
			String inOut = from.getAttribute().getValueAt("in/out").toString();
			int trigger  = Integer.parseInt(from.getAttribute().getValueAt("trigger").toString());
			int endLine = Integer.parseInt(from.getAttribute().getValueAt("endLine#").toString());
		
			enterValueSourceProcessNode(to, id, name, sourceID, sourceName, viewID, viewName, perst, type, inOut, trigger, ref, line, endLine);
		}
		
		else{
			
		}
	}
	private void createGraGraMergingRules(){
		
		List<Rule> rules = graphGrammar.getListOfRules();
		//logger.infoln("Size: " + rules.size());
		int size = rules.size();
		for(int i = 0; i < size; i++){
			rules.remove(0);
			//System.out.println("i:" + i);
		}
		
		createMergingRule1();
		
		createMergingRule1a();
		
		createMergingRule2a();
		
		createMergingRule2b();
		
		createMergingRule3a();
		
		createMergingRule3b();
	}
	
	public void createRule1(){
		Rule rule1 = graphGrammar.createRule();
		rule1.setName("1.MakingViewsPersistent");
		logger.info("Rule: " + rule1.getName());
		
		Node nl1, nl2, nr1, nr2, pl1, pr1 = null;
		Arc al1, al2, ar1, ar2 = null;
		// Get LHS
		Graph left = rule1.getLeft();
		
		// Get RHS
		Graph right = rule1.getRight();
		
		// create left graph
		nl1 = createViewNode_Rules(left, "true", "true");
		pl1 = createProcessNode_Rules(left, "=", "dontCare");
		nl2 = createViewNode_Rules(left, "false", "false");
		try {
			al1 = left.createArc(arcType, nl1, pl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			al2 = left.createArc(arcType, pl1, nl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//create right graph
		nr1 = createViewNode_Rules(right, "true", "true");
		pr1 = createProcessNode_Rules(right, "=", "dontCare");
		nr2 = createViewNode_Rules(right, "true", "false");
		try {
			ar1 = right.createArc(arcType, nr1, pr1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ar2 = right.createArc(arcType, pr1, nr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(nl1!=null && nr1!=null && nl2!=null && nr2!= null && pl1!=null && pr1!=null){
			rule1.addMapping(nl1, nr1);
			rule1.addMapping(nl2, nr2);
			rule1.addMapping(pl1, pr1);
		}
		
		
	}
	
	public void createRule2(){
		Rule rule2 = graphGrammar.createRule();
		rule2.setName("2.RemovingViews(process)");
		logger.info("Rule: " + rule2.getName());
		
		Node nl1, nl2, nr1, nr2, pl1, pr1, pl2 = null;
		Arc al1, al2, ar1, ar2, al3 = null;
		// Get LHS
		Graph left = rule2.getLeft();
		
		// Get RHS
		Graph right = rule2.getRight();
		
		// create left graph
		pl1 = createProcessNode_Rules(left, "dontCare", "dontCare");
		nl1 = createViewNode_Rules(left, "dontCare" , "true");
		pl2 = createProcessNode_Rules(left, "=", "dontCare");
		nl2 = createViewNode_Rules(left, "dontCare", "false");
		try {
			al1 = left.createArc(arcType, pl1, nl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			al2 = left.createArc(arcType, nl1, pl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			al3 = left.createArc(arcType, pl2, nl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create right graph
		pr1 = createProcessNode_Rules(right, "dontCare", "dontCare");
		nr2 = createViewNode_Rules(right, "dontCare", "false");
		try {
			ar1 = right.createArc(arcType, pr1, nr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(nl1!=null && nl2!=null && nr2!= null && pl1!=null && pl2!=null && pr1!=null){
			
			rule2.addMapping(pl1, pr1);
			rule2.addMapping(nl2, nr2);
			
		}
	}
	
	public void createRule3(){
		Rule rule3 = graphGrammar.createRule();
		rule3.setName("3.RemovingViews(source)");
		logger.info("Rule: " + rule3.getName());
		
		Node nl1, nl2, nr1, nr2, spl1, spr1, pl2 = null;
		Arc al1, al2, ar1, ar2, al3 = null;
		// Get LHS
		Graph left = rule3.getLeft();
		
		// Get RHS
		Graph right = rule3.getRight();
		
		// create left graph
		spl1 = createSourceProcessNode_Rules(left, "dontCare");
		nl1 = createViewNode_Rules(left, "dontCare" , "true");
		pl2 = createProcessNode_Rules(left, "=", "dontCare");
		nl2 = createViewNode_Rules(left, "dontCare", "false");
		try {
			al1 = left.createArc(arcType, spl1, nl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			al2 = left.createArc(arcType, nl1, pl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			al3 = left.createArc(arcType, pl2, nl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create right graph
		spr1 = createSourceProcessNode_Rules(right, "dontCare");
		nr2 = createViewNode_Rules(right, "dontCare", "false");
		try {
			ar1 = right.createArc(arcType, spr1, nr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(nl1!=null && nl2!=null && nr2!= null && spl1!=null && pl2!=null && spr1!=null){
			
			rule3.addMapping(spl1, spr1);
			rule3.addMapping(nl2, nr2);
			
		}
	}
	
	
	public void createRule5(){
		Rule rule5 = graphGrammar.createRule();
		rule5.setName("5.IdentifyingOutputProcess");
		logger.info("Rule: " + rule5.getName());
		
		Node nl1, nl2, nr1, pl1, pr1, pl2, nr2, pr2 = null;
		Arc al1, al2, ar1, ar2, al3, ar3 = null;
		// Get LHS
		Graph left = rule5.getLeft();
		
		// Get RHS
		Graph right = rule5.getRight();
		
		// create left graph
		pl1 = createProcessNode_Rules(left, "dontCare", "dontCare");
		nl1 = createViewNode_Rules(left, "dontCare", "false");
		pl2 = createProcessNode_Rules(left, "dontCare", "dontCare");
		nl2 = createViewNode_Rules(left, "true", "true");
		
		try {
			al1 = left.createArc(arcType, pl1, nl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			al2 = left.createArc(arcType, nl1, pl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			al3 = left.createArc(arcType, pl2, nl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create right graph
		pr1 = createProcessNode_Rules(right, "dontCare", "true");
		nr1 = createViewNode_Rules(right, "true", "false");
		pr2 = createProcessNode_Rules(right, "dontCare", "dontCare");
		nr2 = createViewNode_Rules(right, "true", "true");
		
		try {
			ar1 = right.createArc(arcType, pr1, nr1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ar2 = right.createArc(arcType, nr1, pr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ar3 = right.createArc(arcType, pr2, nr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(nl1!=null && nl2!=null && nr1!=null && nr2!=null && pl1!=null && pr1!=null && pl2!=null && pr2!=null){
			
			rule5.addMapping(nl1, nr1);
			rule5.addMapping(pl1, pr1);
			rule5.addMapping(nl2, nr2);
			rule5.addMapping(pl2, pr2);
			
		}
		
		
	}
	
	public void createMergingRule1(){
		Rule ruleM1 = graphGrammar.createRule();
		ruleM1.setName("M1.MergingSource(withSourceProcess)");
		logger.info("Rule: " + ruleM1.getName());
		
		Node sl1, spl1, spr1 = null;
		Arc al1 = null;
		// Get LHS
		Graph left = ruleM1.getLeft();
		
		// Get RHS
		Graph right = ruleM1.getRight();
		
		// create left graph
		sl1 = createSourceNode_Rules(left);
		spl1 = createSourceProcessNode_Rules(left, "dontCare");
		
		try {
			al1 = left.createArc(arcType, sl1, spl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create right graph
		spr1 = createSourceProcessNode_Rules(right, "dontCare");
		
		
		if(sl1!=null && spl1!=null && spr1!=null){
			
			ruleM1.addMapping(spl1, spr1);
			
		}
		
		
	}
	
	public void createMergingRule1a(){
		Rule ruleM1a = graphGrammar.createRule();
		ruleM1a.setName("M1a.MergingSource(withProcess)");
		logger.info("Rule: " + ruleM1a.getName());
		
		Node sl1, spl1, spr1 = null;
		Arc al1 = null;
		// Get LHS
		Graph left = ruleM1a.getLeft();
		
		// Get RHS
		Graph right = ruleM1a.getRight();
		
		// create left graph
		sl1 = createSourceNode_Rules(left);
		spl1 = createProcessNode_Rules(left, "dontCare", "dontCare");
		
		try {
			al1 = left.createArc(arcType, sl1, spl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create right graph
		spr1 = createProcessNode_Rules(right, "dontCare", "dontCare");
		
		
		if(sl1!=null && spl1!=null && spr1!=null){
			
			ruleM1a.addMapping(spl1, spr1);
			
		}
		
		
	}
	
	public void createMergingRule2a(){
		Rule ruleM2a = graphGrammar.createRule();
		ruleM2a.setName("M2a.MergingView(withProcess-toProcess)");
		logger.info("Rule: " + ruleM2a.getName());
		
		Node pl1, pl2, vl1, pr1, pr2 = null;
		Arc al1, al2, ar1 = null;
		// Get LHS
		Graph left = ruleM2a.getLeft();
		
		// Get RHS
		Graph right = ruleM2a.getRight();
		
		// create left graph
		pl1 = createProcessNode_Rules(left,"dontCare", "dontCare");
		vl1 = createViewNode_Rules(left, "dontCare", "dontCare");
		pl2 = createProcessNode_Rules(left,"dontCare", "dontCare");
		try {
			al1 = left.createArc(arcType, pl1, vl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			al2 = left.createArc(arcType, vl1, pl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create right graph
		pr1 = createProcessNode_Rules(right, "dontCare", "dontCare");
		pr2 = createProcessNode_Rules(right, "dontCare", "dontCare");
		try {
			ar1 = right.createArc(arcType, pr1, pr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pl1!=null && vl1!=null && pr1!=null && pl2!=null && pr2!=null){
			
			ruleM2a.addMapping(pl1, pr1);
			ruleM2a.addMapping(pl2, pr2);
		}
		
		
	}
	public void createMergingRule2b(){
		Rule ruleM2b = graphGrammar.createRule();
		ruleM2b.setName("M2b.MergingView(withProcess-toSourceProcess)");
		logger.info("Rule: " + ruleM2b.getName());
		
		Node pl1, spl2, vl1, pr1, spr2 = null;
		Arc al1, al2, ar1 = null;
		// Get LHS
		Graph left = ruleM2b.getLeft();
		
		// Get RHS
		Graph right = ruleM2b.getRight();
		
		// create left graph
		pl1 = createProcessNode_Rules(left,"dontCare", "dontCare");
		vl1 = createViewNode_Rules(left, "dontCare", "dontCare");
		spl2 = createSourceProcessNode_Rules(left,"dontCare");
		try {
			al1 = left.createArc(arcType, pl1, vl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			al2 = left.createArc(arcType, vl1, spl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create right graph
		pr1 = createProcessNode_Rules(right, "dontCare", "dontCare");
		spr2 = createSourceProcessNode_Rules(right, "dontCare");
		try {
			ar1 = right.createArc(arcType, pr1, spr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pl1!=null && vl1!=null && pr1!=null && spl2!=null && spr2!=null){
			
			ruleM2b.addMapping(pl1, pr1);
			ruleM2b.addMapping(spl2, spr2);
		}
	}
	
	public void createMergingRule3a(){
		Rule ruleM3a = graphGrammar.createRule();
		ruleM3a.setName("M3a.MergingView(withSourceProcesstoProcess)");
		logger.info("Rule: " + ruleM3a.getName());
		
		Node pl1, vl1, pr1, pl2, pr2 = null;
		Arc al1, al2, ar1 = null;
		// Get LHS
		Graph left = ruleM3a.getLeft();
		
		// Get RHS
		Graph right = ruleM3a.getRight();
		
		// create left graph
		pl1 = createSourceProcessNode_Rules(left,"dontCare");
		vl1 = createViewNode_Rules(left, "true", "false");
		pl2 = createProcessNode_Rules(left,"dontCare", "dontCare");
		try {
			al1 = left.createArc(arcType, pl1, vl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			al2 = left.createArc(arcType, vl1, pl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// create right graph
		pr1 = createSourceProcessNode_Rules(right, "dontCare");
		pr2 = createProcessNode_Rules(right, "dontCare", "dontCare");
		try {
			ar1 = right.createArc(arcType, pr1, pr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pl1!=null && vl1!=null && pr1!=null && pl2!=null && pr2!=null){
			
			ruleM3a.addMapping(pl1, pr1);
			ruleM3a.addMapping(pl2, pr2);
		}
		
		
	}
	
	public void createMergingRule3b(){
		Rule ruleM3b = graphGrammar.createRule();
		ruleM3b.setName("M3b.MergingView(withSourceProcesstoSourceProcess)");
		logger.info("Rule: " + ruleM3b.getName());
		
		Node pl1, vl1, pr1, spl2, spr2 = null;
		Arc al1, al2, ar1 = null;
		// Get LHS
		Graph left = ruleM3b.getLeft();
		
		// Get RHS
		Graph right = ruleM3b.getRight();
		
		// create left graph
		pl1 = createSourceProcessNode_Rules(left,"dontCare");
		vl1 = createViewNode_Rules(left, "true", "false");
		spl2 = createSourceProcessNode_Rules(left,"dontCare");
		try {
			al1 = left.createArc(arcType, pl1, vl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			al2 = left.createArc(arcType, vl1, spl2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// create right graph
		pr1 = createSourceProcessNode_Rules(right, "dontCare");
		spr2 = createSourceProcessNode_Rules(right, "dontCare");
		try {
			ar1 = right.createArc(arcType, pr1, spr2);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pl1!=null && vl1!=null && pr1!=null && spl2!=null && spr2!=null){
			
			ruleM3b.addMapping(pl1, pr1);
			ruleM3b.addMapping(spl2, spr2);
		}
		
		
	}
	
	
	public void createMergingRule4(){
		Rule ruleM4 = graphGrammar.createRule();
		ruleM4.setName("M4.MergingFinalView(withProcess)");
		logger.info("Rule: " + ruleM4.getName());
		
		Node nl1, pl1, pr1 = null;
		Arc al1 = null;
		// Get LHS
		Graph left = ruleM4.getLeft();
		
		// Get RHS
		Graph right = ruleM4.getRight();
		
		// create left graph
		pl1 = createProcessNode_Rules(left, "dontCare", "dontCare");
		nl1 = createViewNode_Rules(left, "dontCare", "false");
		
		try {
			al1 = left.createArc(arcType, pl1, nl1);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// create right graph
		pr1 = createProcessNode_Rules(right, "dontCare", "true");
		
		
		if(nl1!=null && pl1!=null && pr1!=null){
			
			ruleM4.addMapping(pl1, pr1);
			
		}
		
		
	}
	
	public void createMergingRuleExtra(){
		logger.info("Invoking extra merging rule");
		Node curNode = null;
		Node tempNode = null;
		Arc curArc = null;
		Arc tempArc = null;
		List deletedNodes = new ArrayList<Node> ();
		Iterator<Node> e = graphGrammar.getGraph().getNodesList().iterator();
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getType().getName().equals("Source Process")){
				if(curNode.getAttribute().getValueAt("name").toString().matches("(.*)casting")){
					
					try{
						tempNode = graph.createNode(nodeType_source);
					} catch (TypeException ex){
						System.err.print("create TempNode failed " + ex.getMessage());		
					}
					
					if(tempNode!=null){
						String id = curNode.getAttribute().getValueAt("source_ident").toString();
						String name = curNode.getAttribute().getValueAt("source_name").toString();
						String ref = curNode.getAttribute().getValueAt("ref").toString();
						int line = Integer.parseInt(curNode.getAttribute().getValueAt("line#").toString());
						enterValueSourceNode(tempNode, id, name, "INT_TYPE", "", ref, line);
					}
					
					Iterator<Arc> outgoing = curNode.getOutgoingArcs();
					while(outgoing.hasNext()){
						curArc = outgoing.next();
						Node trg = (Node) curArc.getTarget();
						try{
							tempArc = graph.createArc(arcType, tempNode, trg);
						} catch (TypeException ex){
							System.err.print("create InputArc failed " + ex.getMessage());		
						}
					}
					
					deletedNodes.add(curNode);
				}
			}
		}
		
		Iterator<Node> del = deletedNodes.iterator();
		while(del.hasNext()){
			try {
				graphGrammar.getGraph().destroyNode(del.next());
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
	
	public void createMergingRule5(){
		 Node curNode;
		 Node viewNode = null;
		 Iterator<Arc> arcs = null;
		 Node tarNode = null;
		 Arc tempArc = null;
		 List deletedViews = new ArrayList<Node> ();
		 Iterator<Node> e = graphGrammar.getGraph().getNodesList().iterator();
		 while(e.hasNext()){
				curNode = e.next();
				if(curNode.getType().getName().equals("Process") || curNode.getType().getName().equals("Source Process")){
					
					List<Arc> arcList = curNode.getOutgoingArcsVec();
					if(arcList.size()==1){
						if(arcList.get(0).getTarget().getType().getName().equals("View")){
							
							logger.info("M5: Node id -> " + curNode.getAttribute().getValueAt("ident"));
							viewNode = (Node) arcList.get(0).getTarget();
							if(viewNode.getIncomingArcsVec().size()==1){
								logger.info("        Deleted View -> " + viewNode.getAttribute().getValueAt("ident"));
								arcs = viewNode.getOutgoingArcs();
								while(arcs.hasNext()){
									tarNode = (Node) arcs.next().getTarget();
									if(tarNode.getType().getName().equals("Process") || 
									tarNode.getType().getName().equals("Source Process")){
										try{
											tempArc = graph.createArc(arcType, curNode, tarNode);
										} catch (TypeException ex){
											System.err.print("create InputArc failed " + ex.getMessage());		
										}
									}
								}
								deletedViews.add(viewNode);
							}
						}
					}
				}
				
				
			}
			
		 // delete views
		 Iterator<Node> del = deletedViews.iterator();
		 while(del.hasNext()){
			 try {
				graph.destroyNode(del.next());
			 } catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
			
	 }
	
	
	
	// delete nodes indegree = 0 and outdegree = 0
	public void createMergingRule6(){
		
		Node curNode = null;
		List deletedNodes = new ArrayList<Node>();
		
		//Iterator<Node> e = graphGrammar.getGraph().getNodes(nodeType_process).iterator(); 
		Iterator<Node> e = graph.getNodesList().iterator();
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getType().getName().toString().matches("View")){
				if(curNode.getNumberOfIncomingArcs()==0 && 
						curNode.getNumberOfOutgoingArcs()==0)
							deletedNodes.add(curNode);
			}
			else if (curNode.getType().getName().toString().matches("Source")){
				if(curNode.getNumberOfIncomingArcs()==0 && 
						curNode.getNumberOfOutgoingArcs()==0)
							deletedNodes.add(curNode);
			}
			else{
				
			}
			
		}
		
		Iterator<Node> del = deletedNodes.iterator();
		while(del.hasNext()){
			try {
				graph.destroyNode(del.next());
			} catch (TypeException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		
	}
	
	public void createMergingRule7(Graph g1){
		/*
		Node curNode = null;
		Arc curArc1 = null;
		Node nextNode = null;
		
		
		
		discardingGraph = g1.graphcopy();
		
		List<Node> constants = discardingGraph.getNodesList();
		*/
		
		List<Node> constants = g1.getNodesList();
		
		for(int i=0; i<constants.size(); i++){
			if(constants.get(i).getType().getName().equals("Source")){
				try{
					logger.info("Destryed: " + constants.get(i).getAttribute().getValueAt("ident").toString());
					g1.destroyNode(constants.get(i));
				} catch(TypeException ex){
					System.err.println("deleted node failed!" + ex.getMessage());
				}
			}
			
			else if(constants.get(i).getType().getName().equals("Source Process")){
				if(constants.get(i).getAttribute().getValueAt("name").toString().equals("=") || constants.get(i).getAttribute().getValueAt("name").toString().matches("(.*)_casting")){
					try{
						g1.destroyNode(constants.get(i));
					} catch(TypeException ex){
						System.err.println("deleted node failed!" + ex.getMessage());
					}
				}
			}
			
			
		}
		
		
		
		
		//discardingGraph = g1.graphcopy();
		
	}
	
public void createMergingRule8A(Graph g1){
		
		
		
		Node curNode = null;
		Arc curArc1 = null;
		Node nextNode = null;
		List<Arc> arcs1 = new ArrayList<Arc>();
		boolean found = false;
		
		String previousName = null;
		String previousViewID = null;
		String previousViewName = null;
		
		String newName = null;
		String newViewID = null;
		String newViewName = null;
		
		//Iterator<Node> e = graphGrammar.getGraph().getNodes(nodeType_process).iterator(); 
		Iterator<Node> e = g1.getNodesList().iterator();
		while(e.hasNext()){
			curNode = e.next();
			if(curNode.getType().getName().equals("Process")){
				if(curNode.getAttribute().getValueAt("producesOutput")==null || curNode.getAttribute().getValueAt("producesOutput").toString().equals("false")){
					arcs1 = curNode.getOutgoingArcsVec();
					if(arcs1.size()==1){
						curArc1 = arcs1.get(0);
						nextNode = (Node) curArc1.getTarget();
						if(nextNode.getType().getName().equals("Process")){
							 found = true;
						}
					}
				}
					
			}
			if(found == true)
				break;
			
		}
		
		if(found == true){
			
			previousName = curNode.getAttribute().getValueAt("name").toString();
			previousViewName = curNode.getAttribute().getValueAt("view_name").toString();
			previousViewID = curNode.getAttribute().getValueAt("view_ident").toString();
			
			newName = previousName + ".." + nextNode.getAttribute().getValueAt("name").toString();
			
			logger.info("Inside M6 " + newName + " Merged Process");
			//newViewName = previousViewName + "+" + nextNode.getAttribute().getValueAt("view_name").toString();
			//newViewID = previousViewID + "+" + nextNode.getAttribute().getValueAt("view_ident").toString();
			
			
			
			/*
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(newViewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(newViewID);
			vm.checkValidity();
			*/
			Iterator<Arc> incomingArcs = curNode.getIncomingArcs();
			Node inputNode = null;
			Arc tempArc = null;
			logger.info(curNode.getAttribute().getValueAt("name") + " " + nextNode.getAttribute().getValueAt("name") + " ");
			while(incomingArcs.hasNext()){
				
				inputNode = (Node) incomingArcs.next().getSource();
				logger.info("Input Node: " + inputNode.getAttribute().getValueAt("name") + " "+nextNode.getAttribute().getValueAt("name"));
				try{
					
					tempArc = g1.createArc(arcType, inputNode, nextNode);
				} catch(TypeException ex){
					System.err.println(" create input arc failed" + ex.getMessage());
				}
			}
			
			try {
				logger.info("Node destroyed");
				g1.destroyNode(curNode);
			} catch (TypeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			attrInstance = nextNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(newName);
			vm.checkValidity();
			
			//groupingGraph
			//groupingGraph.graphcopy(g1);
			
			createMergingRule8A(g1);
		}
		
		
		//groupingGraph.graphcopy(g1);	
		
		//return g1;
	}

	public static void createMergingRule11(Graph g1, String pid) throws IOException, InterruptedException{
		
		List ids = new ArrayList<String>();
		List included = new ArrayList<Boolean>();
		boolean found = false;
		Node curNode = null;
		List<Node> deletedNodes = new ArrayList<Node>();
		Iterator<Node> en = g1.getNodesList().iterator();
		while(en.hasNext()){
			curNode = en.next();
			found = false;
			if(curNode.getAttribute().getValueAt("ident").toString().equals(pid)!=true){
				Iterator<Arc> outgoing = curNode.getOutgoingArcs();
				while(outgoing.hasNext()){
					Arc curArc = outgoing.next();
					Node target = (Node) curArc.getTarget();
					if(target.getAttribute().getValueAt("ident").toString().equals(pid)){
						logger.info("Found: " + curNode.getAttribute().getValueAt("ident").toString());
						found = true;
						break;
					}
					
				}
				if(found==false){
					
					Iterator<Arc> incoming = curNode.getIncomingArcs();
					while(incoming.hasNext()){
						Arc curArc = incoming.next();
						Node source = (Node) curArc.getSource();
						if(source.getAttribute().getValueAt("ident").toString().equals(pid)){
							logger.info("Found: " + curNode.getAttribute().getValueAt("ident").toString());
							found = true;
							break;
						}
						
					}
					if(found==false){
						//ids.add(curNode.getAttribute().getValueAt("ident").toString());
						deletedNodes.add(curNode);
					}
				}
			}
		}
		
		Iterator<Node> dels = deletedNodes.iterator();
		while(dels.hasNext()){
			try {
				logger.info("Node destroyed");
				g1.destroyNode(dels.next());
			} catch (TypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
public static void createMergingRule12(Graph g1, String pid) throws IOException, InterruptedException{
		
		List ids = new ArrayList<String>();
		List included = new ArrayList<Boolean>();
		boolean found = false;
		Node curNode = null;
		List<Node> deletedNodes = new ArrayList<Node>();
		Iterator<Node> en = g1.getNodesList().iterator();
		while(en.hasNext()){
			curNode = en.next();
			found = false;
			if(curNode.getAttribute().getValueAt("ident").toString().equals(pid)!=true){
				Iterator<Arc> outgoing = curNode.getOutgoingArcs();
				while(outgoing.hasNext()){
					Arc curArc = outgoing.next();
					Node target = (Node) curArc.getTarget();
					if(target.getAttribute().getValueAt("ident").toString().equals(pid)){
						logger.info("Found: " + curNode.getAttribute().getValueAt("ident").toString());
						found = true;
						break;
					}
					else{
						Iterator<Arc> outgoing1 = target.getOutgoingArcs();
						while(outgoing1.hasNext()){
							Arc curArc1 = outgoing1.next();
							Node target1 = (Node) curArc1.getTarget();
							if(target1.getAttribute().getValueAt("ident").toString().equals(pid)){
								logger.info("Found: " + curNode.getAttribute().getValueAt("ident").toString());
								found = true;
								break;
							}
						}
					}
					
				}
				if(found==false){
					
					Iterator<Arc> incoming = curNode.getIncomingArcs();
					while(incoming.hasNext()){
						Arc curArc = incoming.next();
						Node source = (Node) curArc.getSource();
						if(source.getAttribute().getValueAt("ident").toString().equals(pid)){
							logger.info("Found: " + curNode.getAttribute().getValueAt("ident").toString());
							found = true;
							break;
						}
						else{
							Iterator<Arc> incoming1 = source.getOutgoingArcs();
							while(incoming1.hasNext()){
								Arc curArc1 = incoming1.next();
								Node source1 = (Node) curArc1.getSource();
								if(source1.getAttribute().getValueAt("ident").toString().equals(pid)){
									logger.info("Found: " + curNode.getAttribute().getValueAt("ident").toString());
									found = true;
									break;
								}
							}
						}
						
					}
					
					if(found==false){
						//ids.add(curNode.getAttribute().getValueAt("ident").toString());
						deletedNodes.add(curNode);
					}
				}
			}
		}
		
		Iterator<Node> dels = deletedNodes.iterator();
		while(dels.hasNext()){
			try {
				logger.info("Node destroyed");
				g1.destroyNode(dels.next());
			} catch (TypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public Node createViewNode_Rules(Graph graph, String perst, String inter){
		Node tempViewNode = null;
		boolean persistent;
		boolean intermediate;

		try{
			tempViewNode = graph.createNode(nodeType_view); 
		} catch (TypeException ex) {
			logger.info("Create view failed! " + ex.getMessage());
		}
		
		if (tempViewNode != null) {
			
			attrInstance = tempViewNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			if(perst.equals("dontCare")!=true){
				persistent = Boolean.parseBoolean(perst);
				vm = (ValueMember) vt.getMemberAt("persistent");
				vm.setExprAsObject(persistent);
				vm.checkValidity();
			}
			if(inter.equals("dontCare")!=true){
				intermediate = Boolean.parseBoolean(inter);
				vm = (ValueMember) vt.getMemberAt("intermediate");
				vm.setExprAsObject(intermediate);
				vm.checkValidity();
			}
			
			
		}
		return tempViewNode;
	}
	
	public Node createProcessNode_Rules(Graph graph, String name, String output){
		Node tempProcessNode = null;
				
		try{
			tempProcessNode = graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			if(name.equals("dontCare")!=true){
				vm = (ValueMember) vt.getMemberAt("name");
				vm.setExprAsObject(name);
				vm.checkValidity();
			}
			if(output.equals("dontCare")!=true){
				vm = (ValueMember) vt.getMemberAt("producesOutput");
				vm.setExprAsObject(Boolean.parseBoolean(output));
				vm.checkValidity();
				
				vm = (ValueMember) vt.getMemberAt("view_persistent");
				vm.setExprAsObject(Boolean.parseBoolean(output));
				vm.checkValidity();
				
			}
			
			
		}
		return tempProcessNode;
	}
	
	public Node createSourceProcessNode_Rules(Graph graph, String name){
		Node tempProcessNode = null;
				
		try{
			tempProcessNode = graph.createNode(nodeType_sourceProcess); 
		} catch (TypeException ex) {
			logger.info("Create source process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			if(name.equals("dontCare")!=true){
				vm = (ValueMember) vt.getMemberAt("name");
				vm.setExprAsObject(name);
				vm.checkValidity();
			}
			
		}
		return tempProcessNode;
	}
	
	public Node createSourceNode_Rules(Graph graph){
		Node tempSourceNode = null;
		
		try{
			tempSourceNode = graph.createNode(nodeType_source); 
		} catch (TypeException ex) {
			logger.info("Create source failed! " + ex.getMessage());
		}
		return tempSourceNode;
	}
	
	public void matchRule(Rule rule1){
		
		boolean doIt = true;
		Match match = null;
		String str = "";
		
		if (doIt) {
			logger.info("Apply " + rule1.getName()
					+ " so long as possible");

			logger.info("Rule " + rule1.getName()
					+ "    >> create match");
			match = graphGrammar.createMatch(rule1);
			match.setCompletionStrategy(this.strategy, true);
			boolean a;
			while (a=match.nextCompletion()) {

				logger.info("match is complete");
				if (match.isValid()) {
					logger.info("match is valid");
					try {
						StaticStep.execute(match);
						System.out
								.println("Rule  " + match.getRule().getName()
										+ " : step is done");
					} catch (TypeException ex) {
						ex.printStackTrace();
						graphGrammar.destroyMatch(match);
						logger.info("Rule  "
								+ match.getRule().getName()
								+ " : match failed! " + ex.getMessage());
					}
				} else
					logger.info("Rule  " + match.getRule().getName()
							+ " : match is not valid");
			}
			logger.info("Rule  " + match.getRule().getName()
					+ " : match has no more completion" + a);
			graphGrammar.destroyMatch(match);
		}
	
	}
	
	private void graphGrammarTransform(String a) throws IOException, InterruptedException {
		logger.info("Matching and graph transformation ");
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + a +".ggx";
		// Get all completion strategies
		//		Enumeration<MorphCompletionStrategy> strategies = CompletionStrategySelector.getStrategies();

		// default strategy is injective, with dangling condition (DPO), with
		// NACs.
		logger.info("Strategy: " + this.strategy);
		this.strategy.showProperties();
		
		// Set graph transformation options
		Vector<String> gratraOptions = new Vector<String>();
		gratraOptions.add("CSP");
		gratraOptions.add("injective");
		gratraOptions.add("dangling");
		gratraOptions.add("NACs");
		gratraOptions.add("PACs");
		gratraOptions.add("GACs");
		gratraOptions.add("consistency");
		graphGrammar.setGraTraOptions(gratraOptions);

		List<Rule> listOfRules = graphGrammar.getListOfRules();
		Iterator<Rule> rit = listOfRules.iterator();
		Rule currentRule = null;
		int count = 0;
		while(rit.hasNext()){
			++count;
			currentRule = rit.next();
			matchRule(currentRule);
		}
					
		
		
		if(a.contains("Merging")){
			createMergingRule5();
			createMergingRule6();
			
			prepareDottyFile("_base");
			
			String fn1 = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" +".ggx";
			graphGrammar.save(fn1);
			logger.info("After applying Rules,  graphGrammar  saved in  " + fn);
			
			writeDottyFile(graph, true);
			showGraph(graph, false);
			
			String dotFileName = this.dottyFileName;
			String outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
			
			JOptionPane.showMessageDialog(null, "Workflow Provenance Graph Generated.\nClick OK to continue ... ");
			/*
			logger.info("Please enter to continue");
			BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
			String choice = brIn.readLine(); 
			*/
			//prepareCustomizeGraphs();
			
			/*
			logger.info("Please Choose Option to Continue");
			logger.info("(1) Group Process --- Compact");
			logger.info("(2) Group Process --- Preserve Source Order");
			
			
			
			
			if(choice.toString().equals("1")){
				logger.info("You have choosen option (1)");
				createMergingRule6();
				prepareDottyFile("_afterTransform_afterMerging_Compact");
				writeDottyFile(true);
				showGraph(graphGrammar, false);
			}
			else if(choice.toString().equals("2")){
				logger.info("You have choosen option (2)");
				createMergingRule7();
				prepareDottyFile("_afterTransform_afterMerging_Source");
				writeDottyFile(true);
				showGraph(graphGrammar, false);
			}
			else {
				logger.info("Default option (1)");
				createMergingRule6();
				prepareDottyFile("_afterTransform_afterMerging_afterGrouping(Compact)");
				writeDottyFile(true);
				showGraph(graphGrammar, false);
			}
			*/
		}
		else{
			
			graphGrammar.save(fn);
			logger.info("After applying Rules,  graphGrammar  saved in  " + fn);
			
			prepareDottyFile("_afterTransform");
			writeDottyFile(graph, false);
			showGraph(graph, true);
			
			String dotFileName = this.dottyFileName;
			String outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
			createXML(dotFileName, outputFileName);
		}	
				
	}
	public void createXML(String in, String out){
		
		String cmd = "cmd.exe /C python dottoxml.py " + in + " " + out;
		
		try{
        	Runtime rt = Runtime.getRuntime();
		
        	//Process p = rt.exec("cmd /c auto.bat");
        	Process p = rt.exec(cmd);
        	//p.waitFor();
        	
        	// any error message?
            StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");            
                    
            // any output?
            StreamGobbler outputGobbler = new StreamGobbler(p.getInputStream(), "OUTPUT");
        	
            // kick them off
            errorGobbler.start();
            outputGobbler.start();
            
            // any error???
            //int exitVal = p.waitFor();
            //logger.info("ExitValue: " + exitVal);  
            
            logger.info("XML File created successfully.");
        } catch (Throwable t){
        	t.printStackTrace();
        }
        
		
	}
	public void init(){
		// Graph Grammar Set base factory and name
		graphGrammar = this.bf.createGraGra();
		graphGrammar.setName("Provenance_Graph_2");

		// Instantiate graph object and set name
		graph = graphGrammar.getGraph();
		graph.setName("HostGraph");
		
		groupingGraph = graphGrammar.getGraph();
		graph.setName("GroupingGraph");
	}
	
	public void typingGraph(){
		/** Typing of graphGrammar */
		
		// Create a type with attr for nodes
		nodeType_view = graphGrammar.createNodeType(true);
		nodeType_source = graphGrammar.createNodeType(true);
		nodeType_process = graphGrammar.createNodeType(true);
		nodeType_sourceProcess = graphGrammar.createNodeType(true);
		
		// Create a type without attr for edges
		arcType = graphGrammar.createArcType(false);
		
		nodeType_view.setStringRepr("View");
		nodeType_view.setAdditionalRepr(":OVAL:java.awt.Color[r=0,g=0,b=0]::[VIEW]");
		
		nodeType_source.setStringRepr("Source");
		nodeType_source.setAdditionalRepr(":OVAL:java.awt.Color[r=0,g=0,b=255]::[SOURCE]");
		
		nodeType_process.setStringRepr("Process");
		nodeType_process.setAdditionalRepr(":RECT:java.awt.Color[r=0,g=0,b=0]::[PROCESS]");
		
		nodeType_sourceProcess.setStringRepr("Source Process");
		nodeType_sourceProcess.setAdditionalRepr(":ROUNDRECT:java.awt.Color[r=0,g=0,b=255]::[SOURCE PROCESS]");
		
		String nodeTypeName_view = nodeType_view.getStringRepr();
		String nodeTypeName_source = nodeType_source.getStringRepr();
		String nodeTypeName_process = nodeType_process.getStringRepr();
		String nodeTypeName_sourceProcess = nodeType_sourceProcess.getStringRepr();
		
		arcType.setAdditionalRepr("[EDGE]");
	}
	
	public void addingTypeAttr(){
		/** Add type attributes */
		// Get attribute type of the node type
		attrType_view = nodeType_view.getAttrType();
		attrType_source = nodeType_source.getAttrType();
		attrType_process = nodeType_process.getAttrType();
		attrType_sourceProcess = nodeType_sourceProcess.getAttrType();
		
		/* Add manager and open view for making some attributes hidden */
		attrManager_view = attrType_view.getAttrManager();
		openView_view = attrManager_view.getDefaultOpenView();
		
		attrManager_source = attrType_source.getAttrManager();
		openView_source = attrManager_source.getDefaultOpenView();
		
		attrManager_process = attrType_process.getAttrManager();
		openView_process = attrManager_process.getDefaultOpenView();
		
		attrManager_sourceProcess = attrType_sourceProcess.getAttrManager();
		openView_sourceProcess = attrManager_sourceProcess.getDefaultOpenView();
		
	}
	
	public void addingAttrView(){
		int slot_variable;
		// declaring attributes
		AttrTypeMember ident_view = attrType_view.addMember(this.javaHandler, "String", "ident");
		AttrTypeMember name_view = attrType_view.addMember(this.javaHandler, "String", "name");
		AttrTypeMember processIdent_view = attrType_view.addMember(this.javaHandler, "String", "process_ident");
		AttrTypeMember isPersistent_view = attrType_view.addMember(this.javaHandler, "boolean", "persistent");
		AttrTypeMember isIntermediate_view = attrType_view.addMember(this.javaHandler, "boolean", "intermediate");
		AttrTypeMember apperanceRef_view = attrType_view.addMember(this.javaHandler, "String", "ref");
		AttrTypeMember desc_view = attrType_view.addMember(this.javaHandler, "String", "desc");
		AttrTypeMember line_view = attrType_view.addMember(this.javaHandler, "int", "line#");
	
		// making attributes hidden
		slot_variable = openView_view.convertIndexToSlot(attrType_view, processIdent_view.getIndexInTuple());
		openView_view.setVisibleAt(attrType_view, false, slot_variable);
		
		slot_variable = openView_view.convertIndexToSlot(attrType_view, apperanceRef_view.getIndexInTuple());
		openView_view.setVisibleAt(attrType_view, false, slot_variable);
		
		slot_variable = openView_view.convertIndexToSlot(attrType_view, isPersistent_view.getIndexInTuple());
		openView_view.setVisibleAt(attrType_view, false, slot_variable);
		
		slot_variable = openView_view.convertIndexToSlot(attrType_view, isIntermediate_view.getIndexInTuple());
		openView_view.setVisibleAt(attrType_view, false, slot_variable);
		
		slot_variable = openView_view.convertIndexToSlot(attrType_view, desc_view.getIndexInTuple());
		openView_view.setVisibleAt(attrType_view, false, slot_variable);
		
	}
	
	public void addingAttrSource(){
		int slot_variable;
		
		AttrTypeMember ident_source = attrType_source.addMember(this.javaHandler, "String", "ident");
		AttrTypeMember name_source = attrType_source.addMember(this.javaHandler, "String", "name");
		AttrTypeMember type_source = attrType_source.addMember(this.javaHandler, "String", "type");
		AttrTypeMember arguments_source = attrType_source.addMember(this.javaHandler, "String", "arguments");
		AttrTypeMember apperanceRef_source = attrType_source.addMember(this.javaHandler, "String", "ref");
		AttrTypeMember line_source = attrType_source.addMember(this.javaHandler, "int", "line#");
		
		slot_variable = openView_source.convertIndexToSlot(attrType_source, apperanceRef_source.getIndexInTuple());
		openView_source.setVisibleAt(attrType_source, false, slot_variable);
		
		slot_variable = openView_source.convertIndexToSlot(attrType_source, type_source.getIndexInTuple());
		openView_source.setVisibleAt(attrType_source, false, slot_variable);
	}
	
	public void addingAttrProcess(){
		int slot_variable;
		
		// Add attribute members for process
		AttrTypeMember ident_process = attrType_process.addMember(this.javaHandler, "String", "ident");
		AttrTypeMember name_process = attrType_process.addMember(this.javaHandler, "String", "name");
		AttrTypeMember viewIdent_process = attrType_process.addMember(this.javaHandler, "String", "view_ident");
		AttrTypeMember viewName_process = attrType_process.addMember(this.javaHandler, "String", "view_name");
		AttrTypeMember viewPersistent_process = attrType_process.addMember(this.javaHandler, "boolean", "view_persistent");
		AttrTypeMember type_process = attrType_process.addMember(this.javaHandler, "String", "type");
		AttrTypeMember inOutMapping_process = attrType_process.addMember(this.javaHandler, "String", "in/out");
		AttrTypeMember triggerRate_process = attrType_process.addMember(this.javaHandler, "int", "trigger");
		AttrTypeMember appearanceRef_process = attrType_process.addMember(this.javaHandler, "String", "ref");
		AttrTypeMember startLine_process = attrType_process.addMember(this.javaHandler, "int", "line#");
		AttrTypeMember endLine_process = attrType_process.addMember(this.javaHandler, "int", "endLine#");
		AttrTypeMember producesOutput_process = attrType_process.addMember(this.javaHandler, "boolean", "producesOutput");
		AttrTypeMember sourceIdents_process = attrType_process.addMember(this.javaHandler, "String", "source_idents");
		AttrTypeMember sourceNames_process = attrType_process.addMember(this.javaHandler, "String", "source_names");
		
		//making fields hidden
		slot_variable = openView_process.convertIndexToSlot(attrType_process, appearanceRef_process.getIndexInTuple());
		openView_process.setVisibleAt(attrType_process, false, slot_variable);
		
		slot_variable = openView_process.convertIndexToSlot(attrType_process, type_process.getIndexInTuple());
		openView_process.setVisibleAt(attrType_process, false, slot_variable);
		
		slot_variable = openView_process.convertIndexToSlot(attrType_process, viewIdent_process.getIndexInTuple());
		openView_process.setVisibleAt(attrType_process, false, slot_variable);
		
		slot_variable = openView_process.convertIndexToSlot(attrType_process, viewName_process.getIndexInTuple());
		openView_process.setVisibleAt(attrType_process, false, slot_variable);
		
		slot_variable = openView_process.convertIndexToSlot(attrType_process, triggerRate_process.getIndexInTuple());
		openView_process.setVisibleAt(attrType_process, false, slot_variable);
		
	}
	
	public void addingAttrSourceProcess(){
		int slot_variable;
		
		// Add attribute members for process
		AttrTypeMember ident_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "ident");
		AttrTypeMember name_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "name");
		AttrTypeMember sourceIdent_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "source_ident");
		AttrTypeMember sourceName_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "source_name");
		AttrTypeMember viewIdent_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "view_ident");
		AttrTypeMember viewName_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "view_name");
		AttrTypeMember viewPersistent_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "boolean", "view_persistent");
		AttrTypeMember type_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "type");
		AttrTypeMember inOutMapping_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "in/out");
		AttrTypeMember triggerRate_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "int", "trigger");
		AttrTypeMember appearanceRef_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "String", "ref");
		AttrTypeMember startLine_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "int", "line#");
		AttrTypeMember endLine_sourceProcess = attrType_sourceProcess.addMember(this.javaHandler, "int", "endLine#");
		
		//making fields hidden
		slot_variable = openView_sourceProcess.convertIndexToSlot(attrType_sourceProcess, appearanceRef_sourceProcess.getIndexInTuple());
		openView_sourceProcess.setVisibleAt(attrType_sourceProcess, false, slot_variable);
		
		slot_variable = openView_sourceProcess.convertIndexToSlot(attrType_sourceProcess, type_sourceProcess.getIndexInTuple());
		openView_sourceProcess.setVisibleAt(attrType_sourceProcess, false, slot_variable);
		
		slot_variable = openView_sourceProcess.convertIndexToSlot(attrType_sourceProcess, sourceIdent_sourceProcess.getIndexInTuple());
		openView_sourceProcess.setVisibleAt(attrType_sourceProcess, false, slot_variable);
		
		slot_variable = openView_sourceProcess.convertIndexToSlot(attrType_sourceProcess, sourceName_sourceProcess.getIndexInTuple());
		openView_sourceProcess.setVisibleAt(attrType_sourceProcess, false, slot_variable);
		
		slot_variable = openView_sourceProcess.convertIndexToSlot(attrType_sourceProcess, triggerRate_sourceProcess.getIndexInTuple());
		openView_sourceProcess.setVisibleAt(attrType_sourceProcess, false, slot_variable);
		
	}
	
	public void enterValueProcessNode(Node a, String id, String name, String view_id, String view_name, boolean view_perst, 
            String type, String inOut, int trigger, String ref, int sLine, int eLine){

		attrInstance = a.getAttribute();
		vt = (ValueTuple) attrInstance;
		
		vm = (ValueMember) vt.getMemberAt("ident");
		vm.setExprAsObject(id);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("name");
		vm.setExprAsObject(name);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_ident");
		vm.setExprAsObject(view_id);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_name");
		vm.setExprAsObject(view_name);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_persistent");
		vm.setExprAsObject(view_perst);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("type");
		vm.setExprAsObject(type);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("in/out");
		vm.setExprAsObject(inOut);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("trigger");
		vm.setExprAsObject(trigger);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("ref");
		vm.setExprAsObject(ref);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("line#");
		vm.setExprAsObject(sLine);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("endLine#");
		vm.setExprAsObject(eLine);
		vm.checkValidity();
		
		logger.info("***Process Node Created*** " + id+ ":" + name);

	}

	public void enterValueSourceProcessNode(Node a, String id, String name, String source_id, String source_name, String view_id, String view_name, boolean view_perst, 
											String type, String inOut, int trigger, String ref, int sLine, int eLine){


		attrInstance = a.getAttribute();
		vt = (ValueTuple) attrInstance;
		
		// Set values of attributes
		vm = (ValueMember) vt.getMemberAt("ident");
		vm.setExprAsObject(id);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("name");
		vm.setExprAsObject(name);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("source_ident");
		vm.setExprAsObject(source_id);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("source_name");
		vm.setExprAsObject(source_name);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_ident");
		vm.setExprAsObject(view_id);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_name");
		vm.setExprAsObject(view_name);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("view_persistent");
		vm.setExprAsObject(view_perst);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("type");
		vm.setExprAsObject(type);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("in/out");
		vm.setExprAsObject(inOut);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("trigger");
		vm.setExprAsObject(trigger);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("ref");
		vm.setExprAsObject(ref);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("line#");
		vm.setExprAsObject(sLine);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("endLine#");
		vm.setExprAsObject(eLine);
		vm.checkValidity();
		
		logger.info("***Source Process Node Created*** " + id+ ":" + name);
		
	}
	
	public void enterValueSourceNode(Node a, String id, String name, String type, String arguments, String ref, int line){
		attrInstance = a.getAttribute();
		vt = (ValueTuple) attrInstance;
		
		// Set values of attributes
		vm = (ValueMember) vt.getMemberAt("ident");
		vm.setExprAsObject(id);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("name");
		vm.setExprAsObject(name);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("type");
		vm.setExprAsObject(type);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("arguments");
		vm.setExprAsObject(arguments);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("ref");
		vm.setExprAsObject(ref);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("line#");
		vm.setExprAsObject(line);
		vm.checkValidity();
		
		logger.info("***Source Node Created*** " + id+ ":" + name);
	}

	public void enterValueViewNode(Node a, String id, String name, String pid, boolean perst, boolean inter, String ref, String desc, int line){
		attrInstance = a.getAttribute();
		vt = (ValueTuple) attrInstance;
		
		// Set values of attributes
		vm = (ValueMember) vt.getMemberAt("ident");
		vm.setExprAsObject(id);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("name");
		vm.setExprAsObject(name);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("process_ident");
		vm.setExprAsObject(pid);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("persistent");
		vm.setExprAsObject(perst);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("intermediate");
		vm.setExprAsObject(inter);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("ref");
		vm.setExprAsObject(ref);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("desc");
		vm.setExprAsObject(desc);
		vm.checkValidity();
		
		vm = (ValueMember) vt.getMemberAt("line#");
		vm.setExprAsObject(line);
		vm.checkValidity();
		
		logger.info("***View Node Created*** " + id+ ":" + name);
		
	}
	
	public void printProcess(){
		logger.info("**** Processes and Triggers ****");
		Iterator<Node> p = graph.getNodesList().iterator();
		while(p.hasNext()){
			Node cp = p.next();
			if(cp.getAttribute().getValueAt("ident").toString().matches("(.*)P(.*)")){
				String id = cp.getAttribute().getValueAt("ident").toString();
				String trigger = cp.getAttribute().getValueAt("trigger").toString();
				logger.info("Process: " + id + "\t->Trigger: " + trigger);
			}
		}
	}		
	
	
	public void printViewTuples(){
		ViewTuples tempTuple = null;
		
		logger.info("*** Content of viewTuples ***");
		Iterator vit = viewTuples.iterator();
		while(vit.hasNext()){
			tempTuple = (ViewTuples) vit.next();
			logger.info(tempTuple.getIdent() + " " + tempTuple.getName() + " " + tempTuple.getFirstRef() + " " + tempTuple.getlastRef() + " " + tempTuple.getNodeRef());
		}
	}
	
	public boolean checkViewTuples(VariableCommand cmd){
		boolean found = false;
		ViewTuples curTuple = null;
		
		Iterator<ViewTuples> vit = viewTuples.iterator();
		while(vit.hasNext()){
			curTuple = vit.next();
			if(curTuple.getName().equals(cmd.getName())){
				found = true;
				// update value of last ref in view Tuples
				curTuple.setLastRef(cmd.toString());
				break;
			}
		}
		return found;
	}
	
	public Node findViewTuples(String key){
		boolean found = false;
		ViewTuples curTuple = null;
		Node inputNode = null;
		String candidate;
		
		Iterator<ViewTuples> vit = viewTuples.iterator();
		while(vit.hasNext()){
			curTuple = vit.next();
			Iterator<String> cit = curTuple.getlastRef().iterator();
			while(cit.hasNext()){
				candidate = cit.next();
				if(candidate.equals(key)){
					found = true;
					break;
				}	
			}
			if(found==true){
				inputNode = (Node) curTuple.getNodeRef();
				break;
			}
		}
		
		return inputNode;
	}
	
	public Node findViewTuplesByName(String key){
		boolean found = false;
		ViewTuples curTuple = null;
		Node inputNode = null;
		String candidate;
		
		Iterator<ViewTuples> vit = viewTuples.iterator();
		while(vit.hasNext()){
			curTuple = vit.next();
			if(curTuple.getName().equals(key)){
				inputNode = curTuple.getNodeRef();
				break;
			}	
		}
		return inputNode;
	}
	
	public boolean checkScopeViewTuples(String key){
		boolean addNode = false;
		boolean found = false;
		ViewTuples curTuple = null;
		String candidate;
		Iterator<ViewTuples> vit = viewTuples.iterator();
		while(vit.hasNext()){
			curTuple = vit.next();
			Iterator<String> cit = curTuple.getlastRef().iterator();
			while(cit.hasNext()){
				candidate = cit.next();
				if(candidate.equals(key)){
					found = true;
					break;
				}
			}
			if(found==true){
				if(curTuple.getFirstRef().equals(key))
					addNode = false;
				else
					addNode = true;
				break;
			}
		}
		return addNode;
	}
	
	public void removeViewTuples(String key){
		String candidate;
		boolean found = false;
		ViewTuples curTuple = null;
		ViewTuples matchedTuple = null;
		Iterator<ViewTuples> vit = viewTuples.iterator();
		while(vit.hasNext()){
			curTuple = vit.next();
			Iterator<String> cit = curTuple.getlastRef().iterator();
			while(cit.hasNext()){
				candidate = cit.next();
				if(candidate.equals(key)){
					found = true;
					break;
				}
			}
			if(found==true){
				if(curTuple.getFirstRef().equals(key)==false)
					matchedTuple = curTuple;
				break;
			}
		}
		if(matchedTuple!=null)
			viewTuples.remove(matchedTuple);
	}
	
	public void removeViewTuplesByName(String name){
		Iterator<ViewTuples> vit = viewTuples.iterator();
		ViewTuples curTuple = null;
		ViewTuples matchedTuple = null;
		boolean found = false;
		while(vit.hasNext()){
			curTuple = vit.next();
			if(curTuple.getName().equals(name)){
				found = true;
				matchedTuple = curTuple;
				break;
			}
		}
		
		if(found == true)
			viewTuples.remove(matchedTuple);
			
	}
	
	public void createViewNode(VariableCommand cmd){
		Node tempViewNode = null;
		
		String id = "V" + (++this.viewCounter);
		String name = cmd.getName();
		String processId = "NA";
		boolean perst = false;
		boolean inter = false;
		String ref = cmd.toString();
		String desc = "";
		int line = cmd.getLine();
		
		
		try{
			tempViewNode = graph.createNode(nodeType_view); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create view failed! " + ex.getMessage());
		}
		
		
		
		
		
		
		if (tempViewNode != null) {
			
			enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
			
			ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,(Node) tempViewNode, line);
			viewTuples.add(tempViewTuple);
			
			//logger.info("***View Node Created*** " + id+ ":" + name);
			//printViewTuples();
		}
	}
	
	
	public Node createArgNode(VariableCommand cmd){
		Node tempViewNode = null;
		
		String id = "";
		String name = "";
		String processId = "NA";
		boolean perst = false;
		boolean inter = false;
		String ref = "";
		String desc = "";
		int line = 0;
		
		try{
			tempViewNode = graph.createNode(nodeType_view); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create view failed! " + ex.getMessage());
		}
		
		id = "V" + (++this.viewCounter);
		name = cmd.getName();
		ref = cmd.toString();
		line = cmd.getLine();
		if (tempViewNode != null) {
			
			enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
			
			//ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,(Node) tempViewNode, line);
			//viewTuples.add(tempViewTuple);
			
			//logger.info("***View Node Created*** " + id+ ":" + name);
			//printViewTuples();
		
		}
		
		return tempViewNode;
	}
	
	// class variable command
	public Node createViewNode(ClassVariableCommand cmd, boolean select){
		
		Node tempViewNode = null;
		String name = "";
		String st = cmd.getName();
		logger.info("Name:" + st);
		
		String lPart= st.split("[.]")[1];
		String fPart= st.split("[.]")[0];
		
		logger.info("First:" + fPart);
	    logger.info("Last:" + lPart);
		
		if(fPart.equals("self")){
			String id = "V" + (++this.viewCounter);
			name = cmd.getName();
			String processId = "NA";
			boolean perst = false;
			boolean inter = false;
			String ref = cmd.toString();
			String desc = "";
			int line = cmd.getLine();
			
			try{
				tempViewNode = graph.createNode(nodeType_view); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create view failed! " + ex.getMessage());
			}
			
			
			if (tempViewNode != null) {
				
				enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
				
				
				ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,(Node) tempViewNode, line);
				viewTuples.add(tempViewTuple);
			}
		}
		
		else{
			Node source = findViewTuplesByName(fPart);
			
			String id = "V" + (++this.viewCounter);
			if(select==false)
				name = fPart;
			else
				name = cmd.getName();
			
			String processId = "NA";
			boolean perst = false;
			boolean inter = false;
			String ref = cmd.toString();
			String desc = "";
			int line = cmd.getLine();
			
			try{
				tempViewNode = graph.createNode(nodeType_view); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create view failed! " + ex.getMessage());
			}
			
			
			if (tempViewNode != null) {
				
				enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
				
				
			}
			
			if(select==true){
				Node tempProcessNode = createAccessClassProcessNode(cmd, source);
				
				try{
					Arc tempArc = graph.createArc(arcType, tempProcessNode, tempViewNode);
				} catch(TypeException ex){
					logger.info("Create view failed! " + ex.getMessage());
				}
				
				ViewTuples tempViewTuple = new ViewTuples(id,cmd.getName(),ref,ref,(Node) tempViewNode, line);
				viewTuples.add(tempViewTuple);
			}
			else{
				removeViewTuplesByName(fPart);
				
				ViewTuples tempViewTuple = new ViewTuples(id,fPart,ref,ref,(Node) tempViewNode, line);
				viewTuples.add(tempViewTuple);
			}
			
			
		}
		printViewTuples();
		
		
		return tempViewNode;
		
		
		
        
	}
	
public void createViewNodeInsideClass(ClassVariableCommand cmd){
		
		Node tempViewNode = null;
		
		String st = cmd.getName();
		logger.info("Name:" + st);
		
		String lPart= st.split("[.]")[1];
		String fPart= st.split("[.]")[0];
		
		logger.info("First:" + fPart);
	    logger.info("Last:" + lPart);
		
		
		String id = "V" + (++this.viewCounter);
		String name = cmd.getName();
		String processId = "NA";
		boolean perst = false;
		boolean inter = false;
		String ref = cmd.toString();
		String desc = "";
		int line = cmd.getLine();
			
		try{
			tempViewNode = graph.createNode(nodeType_view); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create view failed! " + ex.getMessage());
		}
			
			
		if (tempViewNode != null) {
				
			enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
				
			ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,(Node) tempViewNode, line);
			viewTuples.add(tempViewTuple);
		}
		
		
		printViewTuples();
        
	}
	public Node createAccessClassProcessNode(Command cmd, Node a){
		
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		
		
		String st = ((ClassVariableCommand)(cmd)).getName();
		//logger.info("Name:" + st);
		
		String lPart= st.split("[.]")[1];
		String fPart= st.split("[.]")[0];
		
		
		String id = "P" + (++this.processCounter);
		String name = "Select Member " + lPart ;
		String viewId = "NA";
		String viewName = "";
		boolean viewPerst = false;
		String type = "ClassAccess";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getLine();
		int endLine = cmd.getLine();
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		
		if (tempProcessNode != null) {
			enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, viewPerst, type, inOut, trigger, ref, startLine, endLine);
		}
		
				 
        try{
			tempInputArc = graph.createArc(arcType, a, tempProcessNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		return tempProcessNode;
		
	}
	public String getArgumentName(Command cmd){
		StringBuffer name = new StringBuffer();
		if(cmd instanceof VariableCommand)
			name.append(((VariableCommand)(cmd)).getName());
		else if(cmd instanceof DatatypeCommand)
			name.append(((DatatypeCommand)(cmd)).getValue());
		else{
			
		}
		
		return name.toString();
	}
	
	public String getMethodOperationName(MethodCommand cmd){
		StringBuffer operationName = new StringBuffer();
		operationName.append(cmd.getName());
		operationName.append("(");
		for(int i = 1; i <= ((ArgumentsCommand)cmd.getArgument()).getNumOfArgs(); i++){
			if(i < ((ArgumentsCommand)cmd.getArgument()).getNumOfArgs()){
				operationName.append(getArgumentName(((ArgumentsCommand)cmd.getArgument()).getArgument(i-1)));
				operationName.append(",");
			}
			else
				operationName.append(getArgumentName(((ArgumentsCommand)cmd.getArgument()).getArgument(i-1)));
			
		}
		operationName.append(")");
		return operationName.toString();
	}
	
	public String getBinaryOperationName(BinaryCommand cmd){
		StringBuffer operationName = new StringBuffer();
		
		if(cmd.getOperand1() instanceof VariableCommand)
			operationName.append(((VariableCommand)(cmd.getOperand1())).getName());
		else if(cmd.getOperand1() instanceof DatatypeCommand)
			operationName.append(((DatatypeCommand)(cmd.getOperand1())).getValue());
		else if(cmd.getOperand1() instanceof BinaryCommand)
			operationName.append(getBinaryOperationName(((BinaryCommand)(cmd.getOperand1()))));
		else if (cmd.getOperand1() instanceof MethodCommand)
			operationName.append(((MethodCommand) (cmd.getOperand1())).getName());
		else{
			
		}
		
		operationName.append(cmd.getOperator());
		
		if(cmd.getOperand2() instanceof VariableCommand)
			operationName.append(((VariableCommand)(cmd.getOperand2())).getName());
		else if(cmd.getOperand2() instanceof DatatypeCommand)
			operationName.append(((DatatypeCommand)(cmd.getOperand2())).getValue());
		else if(cmd.getOperand2() instanceof BinaryCommand)
			operationName.append(getBinaryOperationName(((BinaryCommand)(cmd.getOperand2()))));
		else if (cmd.getOperand2() instanceof MethodCommand)
			operationName.append(((MethodCommand) (cmd.getOperand2())).getName());
		else{
			
		}
		
		return operationName.toString();
		
	}
	public String getSubscriptVariableIndex(SubscriptedVariableCommand subCmd){
		StringBuffer name_lastPart = new StringBuffer();
		Command argCmd = subCmd.getSubscript();
		Iterator<Command> it = ((SubscriptsCommand)(argCmd)).getArguments().iterator();
		
		while(it.hasNext()){
			name_lastPart.append("[");
			Command curCmd = it.next();
			Iterator<Command> it1 = ((SubscriptIndexCommand)(curCmd)).getArguments().iterator();
			int commaCount = 0;
			while(it1.hasNext()){
				if(commaCount>0){
					name_lastPart.append(",");
				}
				commaCount++;
				Command curCmd1 = it1.next();
				if(curCmd1 instanceof VariableCommand)
					name_lastPart.append(((VariableCommand)(curCmd1)).getName());
				else if (curCmd1 instanceof DatatypeCommand)
					name_lastPart.append(((DatatypeCommand)(curCmd1)).getValue());
				else if (curCmd1 instanceof BinaryCommand)
					name_lastPart.append(getBinaryOperationName((BinaryCommand)(curCmd1)));
			}
		name_lastPart.append("]");
		}
		
		return name_lastPart.toString();
	}
	public Node createViewNode(SubscriptedVariableCommand cmd, boolean part){
			Node tempViewNode = null;
			
			String id = "";
			String name = cmd.getName();
			String processId = "NA";
			boolean perst = false;
			boolean inter = false;
			String ref = "";
			String desc = "";
			int line = 0;
			
			name += getSubscriptVariableIndex(cmd);
			
			/*
			if(part==true){
				Command curCmd;
				Iterator<Command> cit = ((SubscriptsCommand)(cmd.getSubscript())).getArguments().iterator();
				while(cit.hasNext()){
					curCmd = cit.next();
					if(curCmd.getClass().getName().equals("pythonProvenance.commands.DatatypeCommand")){
						name += "[" + ((DatatypeCommand)(curCmd)).getValue() + "]";
					}
					else if(curCmd.getClass().getName().equals("pythonProvenance.commands.VariableCommand")){
						name += "[" + ((VariableCommand)(curCmd)).getName() + "]";
					}
				}
				
				
			}
			*/
			
			try{
				tempViewNode = graph.createNode(nodeType_view); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create view failed! " + ex.getMessage());
			}
			id = "V" + (++this.viewCounter);
			ref = cmd.toString();
			line = cmd.getLine();
			
			if (tempViewNode != null) {
				
				enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
				
				if(part!=true){
					removeViewTuplesByName(name);
					ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,(Node) tempViewNode, line);
					viewTuples.add(tempViewTuple);
					printViewTuples();
				}
				
			}
			
			return tempViewNode;
	}
	
	public Node createViewNode(){
		Node tempViewNode = null;
		
		String id = "NULL";
		String name = "NULL";
		String processId = "NA";
		boolean perst = false;
		boolean inter = false;
		String ref = "NULL";
		String desc = "";
		int line = 0;
		
		try{
			tempViewNode = graph.createNode(nodeType_view); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create view failed! " + ex.getMessage());
		}
		
		if (tempViewNode != null) {
			
			enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
			
			
		}
		return tempViewNode;
	}
	
	public Node createProcessNode(ListComprehensionCommand cmd){
		
		Node tempProcessNode = null;
		Node tempInputNode = null, tempOutputNode = null;
		Arc tempInputArc, tempOutputArc = null;
		
		String id = "";
		String name = "Creating List";
		String sourceId = "NA";
		String sName = "";
		String type = "ListComprehension";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		String viewId = "NA";
		String vName = "";
		boolean vPerst = false;
		
		ListLoopControlCommand listLoopCmd = null;
		String sourceName ="";
		Command curCmd= null;
		Node tempNode = null;
		
		if(cmd.getListFor()!=null){
			
			try{
				tempProcessNode = graph.createNode(nodeType_process);
			} catch (TypeException ex){
				logger.info("Create source process failed! " + ex.getMessage());
			}
			
			
			listLoopCmd = ((ListLoopControlCommand)(cmd.getListFor()));
			tempInputNode = findViewTuples(listLoopCmd.getVariable().toString());
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			sourceName = "[";
			ArgumentsCommand argCmd = ((ArgumentsCommand)(listLoopCmd.getValue()));
			for(int i = 0; i< argCmd.getNumOfArgs(); i++){
				curCmd = argCmd.getArgument(i);
				if(curCmd.toString().matches("(.*)commands.VariableCommand(.*)")){
					sourceName += ((VariableCommand)(curCmd)).getName()+",";
				}
				else if(curCmd.toString().matches("(.*)commands.DatatypeCommand(.*)")){
					sourceName += ((DatatypeCommand)(curCmd)).getValue()+",";
				}
				else{
					tempInputNode = findViewTuples(curCmd.toString());
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! " + ex.getMessage());
					}
				}
			}
			
			if(sourceName.contains(",")){
				try {
					tempNode = createSourceNode(sourceName, cmd, false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				sourceName = "";
			}
			
			try{
				tempInputArc = graph.createArc(arcType, tempNode, tempInputNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			for(int i = 0; i< argCmd.getNumOfArgs(); i++){
				tempInputNode = findViewTuples(argCmd.getArgument(i).toString());
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
			
			id = "P" + (++this.processCounter);
			ref = cmd.toString();
			startLine = cmd.getLine();
			endLine = cmd.getLine();
			
			if(tempProcessNode!=null)
				enterValueProcessNode(tempProcessNode, id, name, viewId, vName, vPerst, type, inOut, trigger, ref, startLine, endLine);
			
		}
		else{
			try{
				tempProcessNode = graph.createNode(nodeType_sourceProcess);
			} catch (TypeException ex){
				logger.info("Create source process failed! " + ex.getMessage());
			}
			
			id = "SP" + (++this.sourceProcessCounter);
			ref = cmd.toString();
			startLine = cmd.getLine();
			endLine = cmd.getLine();
			
			if (tempProcessNode != null) {
				enterValueSourceProcessNode(tempProcessNode, id, name, sourceId, sName, viewId, vName, vPerst, type, inOut, trigger, ref, startLine, endLine);
			}
		}
			sourceName="[";
			curCmd = null;
			MethodCommand methodCmd;
			Iterator<Command> cit = cmd.getArguments().iterator();
			while(cit.hasNext()){
				curCmd = cit.next();
				if(curCmd.toString().matches("(.*)commands.VariableCommand(.*)")){
					sourceName += ((VariableCommand)(curCmd)).getName()+",";
				}
				else if(curCmd.toString().matches("(.*)commands.DatatypeCommand(.*)")){
					sourceName += ((DatatypeCommand)(curCmd)).getValue()+",";
				}
				else if(curCmd.toString().matches("(.*)commands.MethodCommand(.*)")){
					methodCmd = ((MethodCommand)(curCmd));
					try {
						createProcessNode(methodCmd);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					tempInputNode = findViewTuples(curCmd.toString());
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! " + ex.getMessage());
					}
				}
				else{
					
				}
			}
		
			if(sourceName.contains(",")){
				try {
					tempInputNode = createSourceNode(sourceName, cmd, true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
			else
				sourceName = "";
		
		
	
		Node tempIntViewNode = createIntermediateView(id, ref, endLine, false);
		try{
			tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		
		return tempIntViewNode;
		
	}
	public Node createProcessNode(DictComprehensionCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null, tempOutputNode = null;
		Arc tempInputArc, tempOutputArc = null;
		
		try{
			tempProcessNode = graph.createNode(nodeType_sourceProcess);
		} catch (TypeException ex){
			logger.info("Create source process failed! " + ex.getMessage());
		}
		
		String sourceName="[";
		Command curCmd;
		MethodCommand methodCmd;
		int count = 0;
		Iterator<Command> cit = cmd.getArguments().iterator();
		while(cit.hasNext()){
			curCmd = cit.next();
			if(curCmd.toString().matches("(.*)commands.VariableCommand(.*)")){
				sourceName += ((VariableCommand)(curCmd)).getName();
				if((++count)%2==1)
					sourceName += ":";
				else
					sourceName += ",";
			}
			else if(curCmd.toString().matches("(.*)commands.DatatypeCommand(.*)")){
				sourceName += ((DatatypeCommand)(curCmd)).getValue();
				if((++count)%2==1)
					sourceName += ":";
				else
					sourceName += ",";
			}
			else if(curCmd.toString().matches("(.*)commands.MethodCommand(.*)")){
				methodCmd = ((MethodCommand)(curCmd));
				try {
					createProcessNode(methodCmd);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tempInputNode = findViewTuples(curCmd.toString());
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
			else{
				
			}
		}
		
		if(sourceName.contains(",")){
			try {
				tempInputNode = createSourceNode(sourceName, cmd, true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
		}
		else
			sourceName = "";
		
		String id = "SP" + (++this.sourceProcessCounter);
		String name = "Creating Dictionary";
		String sourceId = "NA";
		String sName = "";
		String viewId = "NA";
		String viewName = "";
		boolean viewPerst = false;
		String type = "DictComprehension";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getLine();
		int endLine = cmd.getLine();
		
		
		if (tempProcessNode != null) {
			enterValueSourceProcessNode(tempProcessNode, id, name, sourceId, sName, viewId, viewName, viewPerst, type, inOut, trigger, ref, startLine, endLine);
			
		}
	
		Node tempIntViewNode = createIntermediateView(id, ref, endLine, false);
		
		try{
			tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		return tempIntViewNode;
		
	}
	
	public Node createArgumentsNode(String name, Command cmd, String pName) throws IOException{
		
		Node tempViewNode = null;
		Node tempProcessNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String processId = "NA";
		String desc ="Arguments";
		String type = "Arguments";
		List args = new ArrayList<String>();
		String ref = "";
		int line = 0;
		boolean perst = false;
		boolean inter = true;
		int startLine, endLine;
		String viewName = "";
		String viewId = "NA";
		
		
		StringBuffer reverse_name = new StringBuffer(name).reverse();
		logger.info("Reverse: " + reverse_name.toString());
		reverse_name.replace(0, 1, "]");
		name = new StringBuffer(reverse_name).reverse().toString();
		logger.info("Name: " + name);
		
		
		
		
		id = "V" + (++this.viewCounter);
		ref = cmd.toString();
		line = cmd.getLine();
		try{
			tempViewNode = graph.createNode(nodeType_view); 				
			} catch (TypeException ex) {
				logger.info("Create view failed! " + ex.getMessage());
			}
			
		if(tempViewNode!=null){
			enterValueViewNode(tempViewNode, id, name, processId, perst, inter, ref, desc, line);
		}
		
		try{
			tempProcessNode = graph.createNode(nodeType_process);
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		id = "P" + (++this.processCounter);
		name = pName;
		type = "ArgumentsComposition";
		String inOut = "ManyToOne";
		int trigger = 1;
		ref = cmd.toString();
		startLine = cmd.getLine();
		endLine = cmd.getLine();
		
		if(tempProcessNode!=null){
			enterValueProcessNode(tempProcessNode, id, name, "NA", "", false, type, inOut, trigger, ref, startLine, endLine);
		}
		
		try{
			tempInputArc = graph.createArc(arcType, tempProcessNode, tempViewNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		Command curCmd;
		Node tempNode= null;
		ArgumentsCommand argCmd = null;
		Iterator<Command> arguments = null;
		
		if(cmd.getClass().getName().matches("(.*)ForLoopCommand(.*)")){
			argCmd = ((ArgumentsCommand)((ForLoopCommand)(cmd)).getArguments());
			for(int i = 0; i<argCmd.getNumOfArgs(); i++){
				curCmd = argCmd.getArgument(i);
				tempNode = findViewTuples(curCmd.toString());
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
				
			}
		}
		else if(cmd.getClass().getName().matches("(.*)DatatypeCommand(.*)")){
			arguments = ((DatatypeCommand)(cmd)).getArguments().iterator();
			while(arguments.hasNext()){
				curCmd = arguments.next();
				tempNode = findViewTuples(curCmd.toString());
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
		}
		else if(cmd.getClass().getName().matches("(.*)SubscriptsCommand(.*)")){
			arguments = ((SubscriptsCommand)(cmd)).getArguments().iterator();
			while(arguments.hasNext()){
				curCmd = arguments.next();
				tempNode = findViewTuples(curCmd.toString());
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
		}
		else{
			
		}
		return tempViewNode;
		
	}
	
	public Node createSourceNode(String name, Command cmd, boolean isSource) throws IOException{
		Node tempSourceNode = null;
		Node tempProcessNode = null;
		
		String id = "";
		String type ="";
		List args = new ArrayList<String>();
		String ref = cmd.toString();
		int line = cmd.getLine();
		
		StringBuffer reverse_name = new StringBuffer(name).reverse();
		logger.info("Reverse: " + reverse_name.toString());
		reverse_name.replace(0, 1, "]");
		name = new StringBuffer(reverse_name).reverse().toString();
		logger.info("Name: " + name);
		
		
		if(isSource==true){
			try{
				tempSourceNode = graph.createNode(nodeType_source); 			
			} catch (TypeException ex) {
				logger.info("Create source failed! " + ex.getMessage());
			}
			id = "C" + (++this.sourceCounter);
			type = "List/Dict Comprehension";
			
			if(tempSourceNode!=null)
				enterValueSourceNode(tempSourceNode, id, name, type, args.toString(), ref, line);
			
			//return tempSourceNode;
		}
		else{
			try{
				tempSourceNode = graph.createNode(nodeType_process); 		
			} catch (TypeException ex) {
				logger.info("Create process failed! " + ex.getMessage());
			}
			id = "P" + (++this.processCounter);
			type = "Arguments";
			
			
			if(tempSourceNode!=null)
				enterValueProcessNode(tempSourceNode, id, name, "NA", "", false, type, "ManyToOne", 1, ref, line, line);
			
			
			
			//return tempIntViewNode;
		}
		
		
		return tempSourceNode;
	}
	
	public void createSourceNode(DatatypeCommand cmd){
		Node tempSourceNode = null;
		String id = "C" + (++this.sourceCounter);
		String name = cmd.getValue();
		String type = cmd.getDataType();
		List args = new ArrayList<String>();
		String ref = cmd.toString();
		int line = cmd.getLine();
		
		
		
		try{
			tempSourceNode = graph.createNode(nodeType_source); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create source failed! " + ex.getMessage());
		}
		
		if (tempSourceNode != null) {
			enterValueSourceNode(tempSourceNode, id, name, type, args.toString(), ref, line);
			
			ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,tempSourceNode, line);
			viewTuples.add(tempViewTuple);
			
			//logger.info("***Source Node Created*** " + id+ ":" + name);
			//printViewTuples();
			
		}		
	}
	
	/*
	public Node createSourceNode(DatatypeCommand cmd, List a){
		Node tempSourceNode = null;
		String id = "";
		String name = "";
		String type = "";
		List args = a;
		String ref = "";
		int line = 0;
		
		try{
			tempSourceNode = graph.createNode(nodeType_source); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create source failed! " + ex.getMessage());
		}
		
		if (tempSourceNode != null) {
			attrInstance = tempSourceNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "S" + (++this.sourceCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			name = cmd.getValue();
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			type = cmd.getDataType();
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("arguments");
			vm.setExprAsObject(args);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			line = cmd.getLine();
			vm.setExprAsObject(line);
			vm.checkValidity();
			
			ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,tempSourceNode, line);
			viewTuples.add(tempViewTuple);
			
			logger.info("***Source Node Created*** " + id+ ":" + name);
			printViewTuples();
			
		}
		return tempSourceNode;
		
	}
	*/
	
	/****** Create Intermediate View *****/
	public Node createIntermediateView(String processId, String ref, int line, Boolean isOutput){
		Node tempIntViewNode = null;
		String id = "V" + (++this.viewCounter);
		String name = "int_"+ processId.toString();

		boolean perst = isOutput;
		boolean inter = true;

		String desc = "";

		
		try{
			tempIntViewNode = graph.createNode(nodeType_view); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create intermediate view failed! " + ex.getMessage());
		}
		
		if (tempIntViewNode != null) {
			
			enterValueViewNode(tempIntViewNode, id, name, processId, perst, inter, ref, desc, line);
			
			
			ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,tempIntViewNode, line);
			viewTuples.add(tempViewTuple);
			
			//logger.info("***Intermediate View Node Created*** " + id+ ":" + name);
			//printViewTuples();
		}
		
		return tempIntViewNode;

		
	}
	
	public Node createIntermediateViewClass(String processId, String ref, int line, Boolean isOutput, Node object){
		Node tempIntViewNode = null;
		String id = "V" + (++this.viewCounter);
		String name = object.getAttribute().getValueAt("name").toString();

		boolean perst = isOutput;
		boolean inter = false;

		String desc = "";

		
		try{
			tempIntViewNode = graph.createNode(nodeType_view); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create intermediate view failed! " + ex.getMessage());
		}
		
		if (tempIntViewNode != null) {
			
			enterValueViewNode(tempIntViewNode, id, name, processId, perst, inter, ref, desc, line);
			
			removeViewTuplesByName(name);
			ViewTuples tempViewTuple = new ViewTuples(id,name,ref,ref,tempIntViewNode, line);
			viewTuples.add(tempViewTuple);
			
			//logger.info("***Intermediate View Node Created*** " + id+ ":" + name);
			//printViewTuples();
		}
		
		return tempIntViewNode;

		
	}
	/****** Create Process Nodes ******/
	// binary Command
	public void createProcessNode(BinaryCommand cmd){
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		
		String id =  "P" + (++this.processCounter);
		String name = cmd.getOperator();
		String viewId = "NA";
		String viewName = "";
		String type = "Binary";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getLine();
		int endLine = cmd.getLine();
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) 
			enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, false, type, inOut, trigger, ref, startLine, endLine);
	
		tempIntViewNode = createIntermediateView(id, ref, endLine, false);
		try{
			tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		//create input arcs
		Node tempNode = null;
		String searchKey1 = cmd.getOperand1().toString();
		tempInputNode = findViewTuples(searchKey1);
		if(tempInputNode==null){
			if(cmd.getOperand1().toString().matches("(.*)SubscriptedVariableCommand(.*)")){
				tempNode = createSelectProcessNode(cmd.getOperand1());
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
			else if(cmd.getOperand1().toString().matches("(.*)ClassVariableCommand(.*)")){
				tempNode = createViewNode(((ClassVariableCommand)(cmd.getOperand1())), true);
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
			else {
				
			}
		}
		else{
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
		}
		
		String searchKey2 = cmd.getOperand2().toString();
		tempInputNode = findViewTuples(searchKey2);
		if(tempInputNode==null){
			if(cmd.getOperand2().toString().matches("(.*)SubscriptedVariableCommand(.*)")){
				tempNode = createSelectProcessNode(cmd.getOperand2());
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
			else if(cmd.getOperand2().toString().matches("(.*)ClassVariableCommand(.*)")){
				tempNode = createViewNode(((ClassVariableCommand)(cmd.getOperand2())), true);
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
			else{
				
			}
			
		}
		else{
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
		}
		
		// checking for datatype commands arguments -> seperate function
		createInputArcWithDatatypeArgs(cmd.getOperand1(), cmd.getOperand2(), tempProcessNode);
		
	}
	
	public void createInputArcWithDatatypeArgs(Command a, Command b, Node tempProcessNode){
		DatatypeCommand dataCmd;
		Command curCmd;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		if(a.toString().matches("(.*)DatatypeCommand(.*)")){
			dataCmd = ((DatatypeCommand)(a));
			if(dataCmd.getArguments()!=null){
				Iterator<Command> cit = dataCmd.getArguments().iterator();
				while(cit.hasNext()){
					curCmd = cit.next();
					logger.info("Current Command: " + curCmd.toString());
					if(curCmd.getClass().getName().equals("pythonProvenance.commands.VariableCommand")){
						tempInputNode = findViewTuples(curCmd.toString());
						try{
							tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
						} catch (TypeException ex) {
							logger.info("Create tempInputArc failed! " + ex.getMessage());
						}
					}
					else if(curCmd.getClass().getName().equals("pythonProvenance.commands.SubscriptedVariableCommand")){
						tempInputNode = createSelectProcessNode(curCmd);
						logger.info("Inside Subs Block");
						try{
							tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
						} catch (TypeException ex) {
							logger.info("Create tempInputArc failed!(Subscripted) " + ex.getMessage());
						}
					}
					else{
						
					}
				}
			}
		}
		
		if(b.toString().matches("(.*)DatatypeCommand(.*)")){
			dataCmd = ((DatatypeCommand)(b));
			if(dataCmd.getArguments()!=null){
				Iterator<Command> cit = dataCmd.getArguments().iterator();
				while(cit.hasNext()){
					curCmd = cit.next();
					if(curCmd.getClass().getName().equals("pythonProvenance.commands.VariableCommand")){
						tempInputNode = findViewTuples(curCmd.toString());
						try{
							tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
						} catch (TypeException ex) {
							logger.info("Create tempInputArc failed! " + ex.getMessage());
						}
					}
					else if(curCmd.getClass().getName().equals("pythonProvenance.commands.SubscriptedVariableCommand")){
						tempInputNode = createSelectProcessNode(curCmd);
						logger.info("Inside Subs Block");
						try{
							tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
						} catch (TypeException ex) {
							logger.info("Create tempInputArc failed!(Subscripted) " + ex.getMessage());
						}
					}
					else{
						
					}
				}
			}
		}
	}
	// unary command
	public void createProcessNode(UnaryCommand cmd){
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		
		String id =  "P" + (++this.processCounter);
		String name = cmd.getOperator();
		String viewId = "NA";
		String viewName = "";
		String type = "Unary";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getLine();
		int endLine = cmd.getLine();
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, false, type, inOut, trigger, ref, startLine, endLine);
		}
	
		tempIntViewNode = createIntermediateView(id, ref, endLine, false);
		
		//logger.info("Intermediate View Node  " + tempIntViewNode.toString());
		
		//create output arc to intermediate view
		try{
			tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		//create input arcs
		String searchKey1 = cmd.getOperand().toString();
		tempInputNode = findViewTuples(searchKey1);
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}	
		
		
	}
	// Class command
	public void createClassNode(MethodCommand cmd){
		
		Node tempProcessNode = null;
		
		String id = "P" + (++this.processCounter);
		String name = cmd.getName();
		String viewId = "NA";
		String viewName = "";
		boolean perst = false;
		String type = "Class";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getLine();
		int endLine = cmd.getLine();
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
		
		
		Node tempIntViewNode = createIntermediateView(id, ref, endLine, false);
		//create output arc to intermediate view
		try{
			Arc tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		//create input arcs
		String searchKey = "";
		DatatypeCommand tempDataCmd;
		ArgumentsCommand argCmd = (ArgumentsCommand) (cmd.getArgument());
		int number = argCmd.getNumOfArgs();
		logger.info("Number: "  + number);
		for(int i = 0; i < number; i++){
			logger.info("Argument" + argCmd.getArgument(i));
			searchKey = argCmd.getArgument(i).toString();
			/*
			Node tempInputNode = findViewTuples(searchKey);
			try{
				Arc tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
			}
			*/
			// input arcs from datatype value args
			createArcsWithArguments(argCmd.getArgument(i), tempProcessNode);
			
			// check input arc for function call
			
			
		}
		Node tempClassAccessNode = null;
		
		Node tempInputNode = findViewTuplesByName(name);
		if(tempInputNode!=null){
			tempClassAccessNode = createClassCallProcessNode(cmd);
			try{
				Arc tempInputArc = graph.createArc(arcType, tempInputNode, tempClassAccessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
			}
			
			try{
				Arc tempInputArc = graph.createArc(arcType, tempClassAccessNode, tempProcessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
			}
		}
		
		
	}
	
	// Method Command
	public void createProcessNode(MethodCommand cmd) throws IOException{
		
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		Node tempObjectNode = null;
		
		String st1 = cmd.getName();
		String fPart1="";
		String lPart1="";
		String temp_name = "";
		
		boolean foundObject = false;
		
		if(st1.contains(".")){
			fPart1 = st1.split("[.]")[0];
			lPart1 = st1.split("[.]")[1];
			
			tempObjectNode = findViewTuplesByName(fPart1);
			
			if(tempObjectNode!=null){
				foundObject = true;
				temp_name = lPart1;
			}
			else{
				temp_name = st1;
			}
		}
		
		else{
			temp_name = st1;
		}
		
		String id = "";
		String name = cmd.getName();
		String viewId = "NA";
		String viewName = "";
		String sourceId = "NA";
		String sourceName = "";
		String type = "Method";
		String inOut = "";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		Boolean isSource= false;
		Boolean isOutput= false;
		
		
		// read methods_desc.txt file
		FileInputStream inStream1 = new FileInputStream("methods_desc.txt");
		DataInputStream in1 = new DataInputStream(inStream1);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
		String strLine1;
		String strLine;
		StringTokenizer str_token = null;
		boolean found1=false;
		while((strLine1 = br1.readLine())!=null){
			str_token = new StringTokenizer(strLine1, ",");
			while(str_token.hasMoreTokens()){
				strLine=str_token.nextToken();
				//logger.info("Method Name: " + strLine);
				if(temp_name.equals(strLine)){
					inOut = str_token.nextToken();
					isSource = Boolean.parseBoolean(str_token.nextToken());
					isOutput = Boolean.parseBoolean(str_token.nextToken());
					//logger.info("Info: " + inOut + " " + isSource + " " + isOutput);
					found1=true;
					break;
				}
				else
					break;
			}
			if(found1==true)
				break;
			
		}
		
		boolean classFound = false;
		
		if(found1==false){
			logger.info(name + " is not a method ... ");
			Iterator<Command> cit = this.classes.iterator();
			while(cit.hasNext()){
				Command curCmd = cit.next();
				if(name.equals(((ClassDefinitionCommand)(curCmd)).getName())){
					classFound = true;
					break;
				}
			}
			if(classFound == true){
				logger.info(name + " is a class ... ");
				createClassNode(cmd);
			}
			
		}
		
		else{
			
			
			// resolving method name - checking with import pairs
			if(foundObject==false){
				String st = name;
				String lPart="";
				String fPart="";
		        boolean found = false;
		        for (int i = 0; i < st.length(); i++) {
		                if(st.charAt(i)=='.'){
		                	found = true;
		                }
		                if(found==true)
		                	lPart=lPart+st.charAt(i);
		                else
		                	fPart=fPart+st.charAt(i);
		        }
		        
		        logger.info("First:" + fPart);
		        logger.info("Last:" + lPart);
		        
		       	Iterator<ImportEquivalent> pit = importPairs.iterator();
				ImportEquivalent curPair = null;
				while(pit.hasNext()){
					curPair = pit.next();
					if(fPart.equals(curPair.getOp2())){
						name =  curPair.getOp1()+lPart;
						break;
					}
				}
			}
			else{
				name = temp_name;
			}
			
			// 
			if(isSource==false){
				
				try{
					tempProcessNode =graph.createNode(nodeType_process); 
				} catch (TypeException ex) {
					logger.info("Create process failed! " + ex.getMessage());
				}
				
				attrInstance = tempProcessNode.getAttribute();
				vt = (ValueTuple) attrInstance;
					
				if(tempProcessNode!=null){
						
					vm = (ValueMember) vt.getMemberAt("ident");
					id = "P" + (++this.processCounter);
					vm.setExprAsObject(id);
					vm.checkValidity();
					
					vm = (ValueMember) vt.getMemberAt("view_ident");
					vm.setExprAsObject(viewId);
					vm.checkValidity();
						
					vm = (ValueMember) vt.getMemberAt("view_name");
					vm.setExprAsObject(viewName);
					vm.checkValidity();
						
					if(isOutput==true){
						vm = (ValueMember) vt.getMemberAt("type");
						vm.setExprAsObject("Output Method");
						vm.checkValidity();
					}
					else{
						vm = (ValueMember) vt.getMemberAt("type");
						vm.setExprAsObject("Method");
						vm.checkValidity();
					}
				}
			}
			else{
				try{
					tempProcessNode =graph.createNode(nodeType_sourceProcess); 
				} catch (TypeException ex) {
					logger.info("Create process failed! " + ex.getMessage());
				}
					
				attrInstance = tempProcessNode.getAttribute();
				vt = (ValueTuple) attrInstance;
				
				if(tempProcessNode!=null){
						
					vm = (ValueMember) vt.getMemberAt("ident");
					id = "SP" + (++this.sourceProcessCounter);
					vm.setExprAsObject(id);
					vm.checkValidity();
					
					
					vm = (ValueMember) vt.getMemberAt("source_ident");
					vm.setExprAsObject(sourceId);
					vm.checkValidity();
						
					vm = (ValueMember) vt.getMemberAt("source_name");
					vm.setExprAsObject(sourceName);
					vm.checkValidity();
						
					
					
					vm = (ValueMember) vt.getMemberAt("type");
					vm.setExprAsObject("Source Method");
					vm.checkValidity();
				}
			}
				
			if (tempProcessNode != null) {
				attrInstance = tempProcessNode.getAttribute();
				vt = (ValueTuple) attrInstance;
					
				// Set values of attributes
					
				vm = (ValueMember) vt.getMemberAt("name");
				vm.setExprAsObject(name);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("in/out");
				vm.setExprAsObject(inOut);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("trigger");
				vm.setExprAsObject(trigger);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("ref");
				ref = cmd.toString();
				vm.setExprAsObject(ref);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("line#");
				startLine = cmd.getLine();
				vm.setExprAsObject(startLine);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("endLine#");
				endLine = cmd.getLine();
				vm.setExprAsObject(endLine);
				vm.checkValidity();
					
				logger.info("***Process Node Created*** " + id+ ":" + name);
				//logger.info("Process Node  " + tempProcessNode.toString());
				
				/*
				removeViewTuplesByName(name);
				ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
				viewTuples.add(tempViewTuple);
				*/
			}
			
			
			
			//create input arcs
			
			DatatypeCommand tempDataCmd;
			ArgumentsCommand argCmd = (ArgumentsCommand) (cmd.getArgument());
			int number = argCmd.getNumOfArgs();
			logger.info("Creating Arcs from Arguments -> Process: " + cmd.getName() + "... Number: "  + number);
			for(int i = 0; i < number; i++){
				logger.info("Argument" + argCmd.getArgument(i));
				// input arcs from datatype value args
				createArcsWithArguments(argCmd.getArgument(i), tempProcessNode);
			}
			
			
			// check input arc for function call
			if(foundObject==false){
				if(isSource==true && isOutput==false)
					tempIntViewNode = createIntermediateView(id, ref, endLine, isSource);
				else if (isSource==false && isOutput==true)
					tempIntViewNode = createIntermediateView(id, ref, endLine, isOutput);
				else
					tempIntViewNode = createIntermediateView(id, ref, endLine, false);
				//logger.info("Intermediate View Node  " + tempIntViewNode.toString());
					
				//create output arc to intermediate view
				try{
					tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempOutputArc failed! " + ex.getMessage());
				}
				
				//removeViewTuplesByName(name);
				//ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempIntViewNode, startLine);
				//viewTuples.add(tempViewTuple);
				
				Node tempMethodAccessNode = null;
								
				tempInputNode = findViewTuplesByName(name);
				if(tempInputNode!=null){
					tempMethodAccessNode = createFunctionCallProcessNode(cmd);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempMethodAccessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
					}
					
					try{
						tempInputArc = graph.createArc(arcType, tempMethodAccessNode, tempProcessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
					}
				}
			}
			//member function
			else{
				if(isSource==true && isOutput==false)
					tempIntViewNode = createIntermediateViewClass(id, ref, endLine, isSource, tempObjectNode);
				else if (isSource==false && isOutput==true)
					tempIntViewNode = createIntermediateViewClass(id, ref, endLine, isOutput, tempObjectNode);
				else
					tempIntViewNode = createIntermediateViewClass(id, ref, endLine, false, tempObjectNode);
				//logger.info("Intermediate View Node  " + tempIntViewNode.toString());
					
				//create output arc to intermediate view
				try{
					tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempOutputArc failed! " + ex.getMessage());
				}
				
				
				try{
					tempInputArc = graph.createArc(arcType, tempObjectNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
				
				Node tempMemberMethodAccessNode = null;
				tempMemberMethodAccessNode = createMemberFunctionCallProcessNode(cmd);
				
				try{
					tempInputArc = graph.createArc(arcType, tempMemberMethodAccessNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
				
				//find class name 
				tempInputNode = null;
				Iterator<ClassObjectPair> cob = this.classObjects.iterator();
				while(cob.hasNext()){
					ClassObjectPair pp = cob.next();
					logger.info("Class: " + pp.getClassName() + "Object: " +pp.getObjectName() );
					if(pp.getObjectName().equals(tempObjectNode.getAttribute().getValueAt("name").toString())){
						tempInputNode = findViewTuplesByName(pp.getClassName());
						break;
					}
				}
				
				
				if(tempInputNode!=null){
						
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempMemberMethodAccessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
					}	
				}
			}
			
			//create output arc to the next JoinArg if available
			String searchKey= new String();
			Command joinCmd = cmd.getJoinArg();
			Node tempSource = null;
			if(joinCmd!=null){
				searchKey = joinCmd.toString();
				tempInputNode = findViewTuples(searchKey);
				if(tempInputNode.getIncomingArcsVec().size()==1){
					Iterator<Arc> arcs = tempInputNode.getIncomingArcs();
					while(arcs.hasNext()){
						Arc curArc = arcs.next();
						tempSource = (Node) curArc.getSource();
					}
				}
				
				try{
					tempInputArc = graph.createArc(arcType, tempIntViewNode, tempSource); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
			}
		}
	}
	
	// create method node used as argument
public Node createMethodNode(MethodCommand cmd) throws IOException{
		
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		Node tempObjectNode = null;
		
		String st1 = cmd.getName();
		String fPart1="";
		String lPart1="";
		String temp_name = "";
		
		boolean foundObject = false;
		
		if(st1.contains(".")){
			fPart1 = st1.split("[.]")[0];
			lPart1 = st1.split("[.]")[1];
			
			tempObjectNode = findViewTuplesByName(fPart1);
			
			if(tempObjectNode!=null){
				foundObject = true;
				temp_name = lPart1;
			}
			else{
				temp_name = st1;
			}
		}
		
		else{
			temp_name = st1;
		}
		
		String id = "";
		String name = cmd.getName();
		String viewId = "NA";
		String viewName = "";
		String sourceId = "NA";
		String sourceName = "";
		String type = "Method";
		String inOut = "";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		Boolean isSource= false;
		Boolean isOutput= false;
		
		
		// read methods_desc.txt file
		FileInputStream inStream1 = new FileInputStream("methods_desc.txt");
		DataInputStream in1 = new DataInputStream(inStream1);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
		String strLine1;
		String strLine;
		StringTokenizer str_token = null;
		boolean found1=false;
		while((strLine1 = br1.readLine())!=null){
			str_token = new StringTokenizer(strLine1, ",");
			while(str_token.hasMoreTokens()){
				strLine=str_token.nextToken();
				//logger.info("Method Name: " + strLine);
				if(temp_name.equals(strLine)){
					inOut = str_token.nextToken();
					isSource = Boolean.parseBoolean(str_token.nextToken());
					isOutput = Boolean.parseBoolean(str_token.nextToken());
					//logger.info("Info: " + inOut + " " + isSource + " " + isOutput);
					found1=true;
					break;
				}
				else
					break;
			}
			if(found1==true)
				break;
			
		}
		
		boolean classFound = false;
		
		if(found1==false){
			logger.info(name + " is not a method ... ");
			Iterator<Command> cit = this.classes.iterator();
			while(cit.hasNext()){
				Command curCmd = cit.next();
				if(name.equals(((ClassDefinitionCommand)(curCmd)).getName())){
					classFound = true;
					break;
				}
			}
			if(classFound == true){
				logger.info(name + " is a class ... ");
				createClassNode(cmd);
			}
			
		}
		
		else{
			
			
			// resolving method name - checking with import pairs
			if(foundObject==false){
				String st = name;
				String lPart="";
				String fPart="";
		        boolean found = false;
		        for (int i = 0; i < st.length(); i++) {
		                if(st.charAt(i)=='.'){
		                	found = true;
		                }
		                if(found==true)
		                	lPart=lPart+st.charAt(i);
		                else
		                	fPart=fPart+st.charAt(i);
		        }
		        
		        logger.info("First:" + fPart);
		        logger.info("Last:" + lPart);
		        
		       	Iterator<ImportEquivalent> pit = importPairs.iterator();
				ImportEquivalent curPair = null;
				while(pit.hasNext()){
					curPair = pit.next();
					if(fPart.equals(curPair.getOp2())){
						name =  curPair.getOp1()+lPart;
						break;
					}
				}
			}
			else{
				name = temp_name;
			}
			
			// 
			if(isSource==false){
				
				try{
					tempProcessNode =graph.createNode(nodeType_process); 
				} catch (TypeException ex) {
					logger.info("Create process failed! " + ex.getMessage());
				}
				
				attrInstance = tempProcessNode.getAttribute();
				vt = (ValueTuple) attrInstance;
					
				if(tempProcessNode!=null){
						
					vm = (ValueMember) vt.getMemberAt("ident");
					id = "P" + (++this.processCounter);
					vm.setExprAsObject(id);
					vm.checkValidity();
					
					vm = (ValueMember) vt.getMemberAt("view_ident");
					vm.setExprAsObject(viewId);
					vm.checkValidity();
						
					vm = (ValueMember) vt.getMemberAt("view_name");
					vm.setExprAsObject(viewName);
					vm.checkValidity();
						
					if(isOutput==true){
						vm = (ValueMember) vt.getMemberAt("type");
						vm.setExprAsObject("Output Method");
						vm.checkValidity();
					}
					else{
						vm = (ValueMember) vt.getMemberAt("type");
						vm.setExprAsObject("Method");
						vm.checkValidity();
					}
				}
			}
			else{
				try{
					tempProcessNode =graph.createNode(nodeType_sourceProcess); 
				} catch (TypeException ex) {
					logger.info("Create process failed! " + ex.getMessage());
				}
					
				attrInstance = tempProcessNode.getAttribute();
				vt = (ValueTuple) attrInstance;
				
				if(tempProcessNode!=null){
						
					vm = (ValueMember) vt.getMemberAt("ident");
					id = "SP" + (++this.sourceProcessCounter);
					vm.setExprAsObject(id);
					vm.checkValidity();
						
					vm = (ValueMember) vt.getMemberAt("source_ident");
					vm.setExprAsObject(sourceId);
					vm.checkValidity();
						
					vm = (ValueMember) vt.getMemberAt("source_name");
					vm.setExprAsObject(sourceName);
					vm.checkValidity();
						
					vm = (ValueMember) vt.getMemberAt("type");
					vm.setExprAsObject("Source Method");
					vm.checkValidity();
				}
			}
				
			if (tempProcessNode != null) {
				attrInstance = tempProcessNode.getAttribute();
				vt = (ValueTuple) attrInstance;
					
				// Set values of attributes
					
				vm = (ValueMember) vt.getMemberAt("name");
				vm.setExprAsObject(name);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("in/out");
				vm.setExprAsObject(inOut);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("trigger");
				vm.setExprAsObject(trigger);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("ref");
				ref = cmd.toString();
				vm.setExprAsObject(ref);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("line#");
				startLine = cmd.getLine();
				vm.setExprAsObject(startLine);
				vm.checkValidity();
					
				vm = (ValueMember) vt.getMemberAt("endLine#");
				endLine = cmd.getLine();
				vm.setExprAsObject(endLine);
				vm.checkValidity();
					
				logger.info("***Process Node Created*** " + id+ ":" + name);
				//logger.info("Process Node  " + tempProcessNode.toString());
				
				/*
				removeViewTuplesByName(name);
				ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
				viewTuples.add(tempViewTuple);
				*/
			}
			
			
			
			//create input arcs
			String searchKey = "";
			DatatypeCommand tempDataCmd;
			ArgumentsCommand argCmd = (ArgumentsCommand) (cmd.getArgument());
			int number = argCmd.getNumOfArgs();
			logger.info("Number: "  + number);
			for(int i = 0; i < number; i++){
				logger.info("Argument" + argCmd.getArgument(i));
				searchKey = argCmd.getArgument(i).toString();
					
				tempInputNode = findViewTuples(searchKey);
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
				// input arcs from datatype value args
				createArcsWithArguments(argCmd.getArgument(i), tempProcessNode);
					
				
					
					
			}
			
			
			// check input arc for function call
			if(foundObject==false){
				if(isSource==true && isOutput==false)
					tempIntViewNode = createIntermediateView(id, ref, endLine, isSource);
				else if (isSource==false && isOutput==true)
					tempIntViewNode = createIntermediateView(id, ref, endLine, isOutput);
				else
					tempIntViewNode = createIntermediateView(id, ref, endLine, false);
				//logger.info("Intermediate View Node  " + tempIntViewNode.toString());
					
				//create output arc to intermediate view
				try{
					tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempOutputArc failed! " + ex.getMessage());
				}
				
				//removeViewTuplesByName(name);
				//ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempIntViewNode, startLine);
				//viewTuples.add(tempViewTuple);
				
				Node tempMethodAccessNode = null;
								
				tempInputNode = findViewTuplesByName(name);
				if(tempInputNode!=null){
					tempMethodAccessNode = createFunctionCallProcessNode(cmd);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempMethodAccessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
					}
					
					try{
						tempInputArc = graph.createArc(arcType, tempMethodAccessNode, tempProcessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
					}
				}
			}
			//member function
			else{
				if(isSource==true && isOutput==false)
					tempIntViewNode = createIntermediateViewClass(id, ref, endLine, isSource, tempObjectNode);
				else if (isSource==false && isOutput==true)
					tempIntViewNode = createIntermediateViewClass(id, ref, endLine, isOutput, tempObjectNode);
				else
					tempIntViewNode = createIntermediateViewClass(id, ref, endLine, false, tempObjectNode);
				//logger.info("Intermediate View Node  " + tempIntViewNode.toString());
					
				//create output arc to intermediate view
				try{
					tempOutputArc = graph.createArc(arcType, tempProcessNode, tempIntViewNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempOutputArc failed! " + ex.getMessage());
				}
				
				
				try{
					tempInputArc = graph.createArc(arcType, tempObjectNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
				
				Node tempMemberMethodAccessNode = null;
				tempMemberMethodAccessNode = createMemberFunctionCallProcessNode(cmd);
				
				try{
					tempInputArc = graph.createArc(arcType, tempMemberMethodAccessNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
				
				//find class name 
				tempInputNode = null;
				Iterator<ClassObjectPair> cob = this.classObjects.iterator();
				while(cob.hasNext()){
					ClassObjectPair pp = cob.next();
					if(pp.getObjectName().equals(tempObjectNode.getAttribute().getValueAt("name").toString())){
						tempInputNode = findViewTuplesByName(pp.getClassName());
						break;
					}
				}
				
				
				if(tempInputNode!=null){
						
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempMemberMethodAccessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
					}	
				}
			}
			
			//create output arc to the next JoinArg if available
			Command joinCmd = cmd.getJoinArg();
			Node tempSource = null;
			if(joinCmd!=null){
				searchKey = joinCmd.toString();
				tempInputNode = findViewTuples(searchKey);
				if(tempInputNode.getIncomingArcsVec().size()==1){
					Iterator<Arc> arcs = tempInputNode.getIncomingArcs();
					while(arcs.hasNext()){
						Arc curArc = arcs.next();
						tempSource = (Node) curArc.getSource();
					}
				}
				
				try{
					tempInputArc = graph.createArc(arcType, tempIntViewNode, tempSource); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
			}
		}
		return tempIntViewNode;
	}
	public Node createMemberFunctionCallProcessNode(Command cmd) {
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "Call Member Function";
		String viewId = "NA";
		String viewName = "";
		String type = "FunctionCall";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
		}
		
		return tempProcessNode;
		
	}
	public Node createFunctionCallProcessNode(Command cmd) {
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "Call Function";
		String viewId = "NA";
		String viewName = "";
		String type = "FunctionCall";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
		}
		
		return tempProcessNode;
	}
	
	public Node createClassCallProcessNode(Command cmd) {
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "Create Object";
		String viewId = "NA";
		String viewName = "";
		String type = "ClassCall";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
		}
		
		return tempProcessNode;
	}

	public void createArcsWithArguments(Command cmd, Node outputNode){
		DatatypeCommand dataCmd;
		SubscriptsCommand subsCmd;
		ArgumentsCommand argsCmd;
		Node tempInputNode;
		Arc tempInputArc;
		String sName = "[";
		Node tempNode1 = null;
		if(cmd instanceof DatatypeCommand){
			dataCmd = (DatatypeCommand)(cmd);
			if(dataCmd.getArguments()!=null){
				Iterator<Command> cit = dataCmd.getArguments().iterator();
				Command curCmd;
				String key;
				while(cit.hasNext()){
					curCmd = cit.next();
					if(curCmd instanceof SubscriptedVariableCommand){
						tempInputNode = createSelectProcessNode((SubscriptedVariableCommand)(curCmd));
						createArc(tempInputNode, outputNode);
					}
					else{
						sName += ((VariableCommand)(curCmd)).getName() + ",";
						
					}
				}
				if(sName.contains(",")){
					try {
						tempNode1 = createSourceNode(sName,cmd,false);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Node tempIntViewNode = null;
					Arc tempInputArc1 = null;
					String tempID = tempNode1.getAttribute().getValueAt("ident").toString();
					tempIntViewNode = createIntermediateView(tempID, cmd.toString(), cmd.getLine(), false);
					
					createArc(tempNode1, tempIntViewNode);
					
					createArc(tempIntViewNode, outputNode);
					
					cit = dataCmd.getArguments().iterator();
					while(cit.hasNext()){
						tempInputNode = findViewTuples(cit.next().toString());
						createArc(tempInputNode, tempNode1);
					}
				}
				else
					sName = "";
				
				
				// create link to actual dataType command
				tempInputNode = findViewTuples(dataCmd.toString());
				createArc(tempInputNode, outputNode);
			}
			else{
				tempInputNode = findViewTuples(dataCmd.toString());
				createArc(tempInputNode, outputNode);
			}
		}
		else if(cmd instanceof SubscriptsCommand){
			subsCmd = (SubscriptsCommand)(cmd);
			if(subsCmd.getArguments()!=null){
				Iterator<Command> cit = subsCmd.getArguments().iterator();
				Command curCmd;
				String key;
				while(cit.hasNext()){
					curCmd = cit.next();
					Iterator<Command> index = ((SubscriptIndexCommand)curCmd).getArguments().iterator();
					while(index.hasNext()){
						Command curIndexCmd = index.next();
						key = curIndexCmd.toString();
						tempInputNode = findViewTuples(key);
						createArc(tempInputNode, outputNode);
					}
				}
			}
		}
		else if(cmd instanceof ArgumentsCommand){
			argsCmd = (ArgumentsCommand)(cmd);
			Command curCmd;
			String key;
			if(argsCmd.getNumOfArgs()>0){
				for(int i = 0; i < argsCmd.getNumOfArgs(); i++){
					curCmd = argsCmd.getArgument(i);
					key = curCmd.toString();
					tempInputNode = findViewTuples(key);
					createArc(tempInputNode, outputNode);
				}
			}
		}
		else if(cmd instanceof SubscriptedVariableCommand){
			tempInputNode = createSelectProcessNode(cmd);
			//tempInputNode = findViewTuplesByName(((SubscriptedVariableCommand) cmd).getName());
			createArc(tempInputNode, outputNode);
			
		}
		else if (cmd instanceof VariableCommand){
			tempInputNode = findViewTuples(cmd.toString());
			createArc(tempInputNode, outputNode);
		}
		else if (cmd instanceof MethodCommand){
			tempInputNode = findViewTuples(cmd.toString());
			createArc(tempInputNode, outputNode);
		}
		else if(cmd instanceof AssignCommand){
			tempInputNode = findViewTuples(cmd.toString());
			createArc(tempInputNode, outputNode);
		}
		else if(cmd instanceof ClassVariableCommand){
			tempInputNode = findViewTuples(cmd.toString());
			createArc(tempInputNode, outputNode);
		}
		else if(cmd instanceof BinaryCommand){
			tempInputNode = findViewTuples(cmd.toString());
			createArc(tempInputNode, outputNode);
		}
		else{
			logger.info(cmd + " ... undefined");
		}
		
		
	}
	// assign command
	public void createProcessNode(AssignCommand cmd){
		// check whether it is source process ... Datatype command as argument
		Node tempNode=null;
		logger.info("Left side Command Type:" + cmd.getOperandLeft().getClass().getName());
		
		if(cmd.getOperandRight()==null)
			createSourceProcessNode(cmd, tempNode);
		else if (cmd.getOperandLeft().getClass().getName().equals("pythonProvenance.commands.SubscriptedVariableCommand") && ((cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.DatatypeCommand")) 
																										 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.VariableCommand"))
																										 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.MethodCommand"))
																										 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.BinaryCommand"))
																										 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.UnaryCommand"))
																										 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.SubscriptedVariableCommand"))))
			createUpdateProcessNode(cmd);
		
		else if (cmd.getOperandLeft().getClass().getName().equals("pythonProvenance.commands.ClassVariableCommand") && ((cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.DatatypeCommand")) 
				 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.VariableCommand"))
				 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.MethodCommand"))
				 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.BinaryCommand"))
				 || (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.UnaryCommand")))){
			boolean foundInside = false;
			ClassVariableCommand curCmd = ((ClassVariableCommand)(cmd.getOperandLeft()));
			int line = curCmd.getLine();
			Iterator<Command> cit1 = this.commands.iterator();
			while(cit1.hasNext()){
				Command c = cit1.next();
				if(c.getClass().getName().equals("pythonProvenance.commands.ClassDefinitionCommand")){
					ClassDefinitionCommand curClass = ((ClassDefinitionCommand)(c));
					int start = curClass.getStartLine();
					int end = curClass.getEndLine();
					if(line >= start && line <= end){
						foundInside = true;
						break;
					}
				}
			}
			logger.info("Found Inside Class: " + foundInside);
			
			if(foundInside==false)
				createUpdateMemberNode(cmd);
			
			else
				createProcessNodeInsideClass(cmd);
		}
		/*
		else if(cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.DatatypeCommand") && cmd.getOperator().equals("="))
			createSourceProcessNode(cmd, tempNode);
		
		else if(cmd.getOperandRight().getClass().getName().equals("commands.ListComprehensionCommand"))
			createSourceProcessNode(cmd, tempNode);
		*/	
		else if(cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.DictComprehensionCommand"))
			createSourceProcessNode(cmd, tempNode);
		
		
		else{
			if (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.SubscriptedVariableCommand")){
				tempNode = createSelectProcessNode(cmd);
			}
			if (cmd.getOperandRight().getClass().getName().equals("pythonProvenance.commands.ClassVariableCommand")){
				tempNode = createViewNode(((ClassVariableCommand)(cmd.getOperandRight())), true);
			}
			/*
			if (cmd.getOperandLeft().getClass().getName().equals("commands.ClassVariableCommand")){
				tempNode = createViewNode(((ClassVariableCommand)(cmd.getOperandLeft())), false);
			}*/
			
			Node tempProcessNode = null;
			Node tempIntViewNode = null;
			Node tempInputNode = null;
			Node tempOutputNode = null;
			Arc tempOutputArc = null;
			Arc tempInputArc = null;
			
			String id = "";
			String name = "";
			String viewId = "NA";
			String viewName = "";
			boolean view_perst = false;
			String type = "Assignment";
			String inOut = "OneToOne";
			int trigger = 1;
			String ref = "";
			int startLine = 0;
			int endLine = 0;
			
			try{
				tempProcessNode =graph.createNode(nodeType_process); 
			} catch (TypeException ex) {
				logger.info("Create process failed! " + ex.getMessage());
			}
			
			id = "P" + (++this.processCounter);
			name = cmd.getOperator();
			ref = cmd.toString();
			startLine = cmd.getLine();
			endLine = cmd.getLine();
			
			if (tempProcessNode != null) {
				enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, view_perst, type, inOut, trigger, ref, startLine, endLine);
				
			}
			
			// check if assign operator is not '='
			if(cmd.getOperator().toString().equals("=")!=true){
				tempInputNode = findViewTuples(cmd.getOperandLeft().toString());
				if(tempInputNode!=null){
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! " + ex.getMessage());
					}
				}
			}
			
			
			//create output arc 
			String searchKey1 = cmd.getOperandLeft().toString();
			
			boolean addNode = checkScopeViewTuples(searchKey1);
			if(addNode==false){
				tempOutputNode = findViewTuples(searchKey1);
				try{
					tempOutputArc = graph.createArc(arcType, tempProcessNode, tempOutputNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempOutputArc failed (if)! " + ex.getMessage());
				}
			}
			else{
				removeViewTuples(searchKey1);
				createViewNode((VariableCommand)(cmd.getOperandLeft()));
				tempOutputNode = findViewTuples(searchKey1);
				try{
					tempOutputArc = graph.createArc(arcType, tempProcessNode, tempOutputNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempOutputArc failed (else)! " + ex.getMessage());
				}
			}
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempOutputNode, startLine);
			viewTuples.add(tempViewTuple);
			
			
			//create input arc
			String searchKey2 = cmd.getOperandRight().toString();
			if(tempNode==null){
				if (searchKey2.matches("(.*)ListComprehensionCommand(.*)")){
					ListComprehensionCommand tempListCmd = ((ListComprehensionCommand)(cmd.getOperandRight()));
					tempInputNode = createProcessNode(tempListCmd);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode ); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (list) " + ex.getMessage());
					}
					
					
				}
				else if (searchKey2.matches("(.*)DictComprehensionCommand(.*)")){
					DictComprehensionCommand tempDictCmd = ((DictComprehensionCommand)(cmd.getOperandRight()));
					tempInputNode = createProcessNode(tempDictCmd);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode ); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (dict) " + ex.getMessage());
					}
					
				}
				else{
					tempInputNode = findViewTuples(searchKey2);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! " + ex.getMessage());
					}
					
					if(searchKey2.matches("(.*)MethodCommand(.*)")){
						Iterator<Command> cit = this.classes.iterator();
						while(cit.hasNext()){
							ClassDefinitionCommand cur = (ClassDefinitionCommand) cit.next();
							if(((MethodCommand)(cmd.getOperandRight())).getName().equals(cur.getName())){
								ClassObjectPair pp = new ClassObjectPair(cur.getName(), tempOutputNode.getAttribute().getValueAt("name").toString());
								ClassObjectPair deletedPair = null;
								Iterator<ClassObjectPair> cobj = this.classObjects.iterator();
								while(cobj.hasNext()){
									ClassObjectPair curCobj = cobj.next();
									if(curCobj.getObjectName().equals(tempOutputNode.getAttribute().getValueAt("name").toString())){
										deletedPair = curCobj;
										break;
									}
								}
								if(deletedPair==null)
									this.classObjects.add(pp);
								else{
									this.classObjects.remove(deletedPair);
									this.classObjects.add(pp);
								}
								
							}
						}
						
					}
				}
			}
			else{
				try{
					tempInputArc = graph.createArc(arcType, tempNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
				
			}	
			
			// check assigning instance of class into left variable
			
			
			
		}
		
		logger.info("Inside AssignCommand ... Checking Objects");
		if(cmd.getOperandLeft() instanceof VariableCommand && cmd.getOperandRight() instanceof VariableCommand){
			VariableCommand varRight = (VariableCommand) cmd.getOperandRight();
			VariableCommand varLeft = (VariableCommand) cmd.getOperandLeft();
			String variableNameRight = varRight.getName();
			String variableNameLeft = varLeft.getName(); 
			logger.info("Left: " + variableNameLeft + " Right: " + variableNameRight );
			Iterator<ClassObjectPair> cobj = this.classObjects.iterator();
			while(cobj.hasNext()){
				ClassObjectPair curCobj = cobj.next();
				logger.info("Current Object: " + curCobj.getObjectName());
				if(curCobj.getObjectName().toString().equals(variableNameRight)){
					ClassObjectPair newCobj = new ClassObjectPair(curCobj.getClassName(), variableNameLeft);
					this.classObjects.add(newCobj);
					break;
				}
			}
		}
		
		
		
	}
	// create assign node inside class 
	public void createProcessNodeInsideClass(AssignCommand cmd){
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Node tempOutputNode = null;
		Arc tempOutputArc = null;
		Arc tempInputArc = null;
		
		String id = "P" + (++this.processCounter);
		String name = cmd.getOperator();
		String viewId = "NA";
		String viewName = "";
		boolean view_perst = false;
		String type = "Assignment";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getLine();
		int endLine = cmd.getLine();
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}

		if (tempProcessNode != null) {
			enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, view_perst, type, inOut, trigger, ref, startLine, endLine);
			
		}
		
		// check if assign operator is not '='
		if(cmd.getOperator().toString().equals("=")!=true){
			tempInputNode = findViewTuples(cmd.getOperandLeft().toString());
			if(tempInputNode!=null){
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
		}
		
		
		//create output arc 
		String searchKey1 = cmd.getOperandLeft().toString();
		
		boolean addNode = checkScopeViewTuples(searchKey1);
		if(addNode==false){
			tempOutputNode = findViewTuples(searchKey1);
			try{
				tempOutputArc = graph.createArc(arcType, tempProcessNode, tempOutputNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempOutputArc failed (if)! " + ex.getMessage());
			}
		}
		else{
			removeViewTuples(searchKey1);
			createViewNode((VariableCommand)(cmd.getOperandLeft()));
			tempOutputNode = findViewTuples(searchKey1);
			try{
				tempOutputArc = graph.createArc(arcType, tempProcessNode, tempOutputNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempOutputArc failed (else)! " + ex.getMessage());
			}
		}
		
		ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempOutputNode, startLine);
		viewTuples.add(tempViewTuple);
		
		
		//create input arc
		String searchKey2 = cmd.getOperandRight().toString();
		
		tempInputNode = findViewTuples(searchKey2);
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
	}
	
	
	//For Loop Command
	public void createProcessNode(ForLoopCommand cmd){
		Node tempProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "forLoop";
		String viewId = "NA";
		String viewName = "";
		String type = "ForLoop";
		String inOut = "ManyToMany";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		// determining trigger
		ArgumentsCommand argsCmd;
		VariableCommand varCmd;
		if(cmd instanceof ForLoopCommand){
			if(cmd.getArguments() instanceof ArgumentsCommand){
				argsCmd = (ArgumentsCommand)(cmd.getArguments());
				if(argsCmd.getNumOfArgs()==3){
					if(argsCmd.getArgument(2) instanceof VariableCommand){
						varCmd = ((VariableCommand)(argsCmd.getArgument(2)));
						logger.info("Cmd:"+varCmd.toString());
						int tempLine = findLine(varCmd.toString());
						logger.info("Line:" + tempLine);
						String value = retriveLineDatatype(tempLine);
						
						trigger = Integer.parseInt(value);
						
						logger.info("Trigger: " + trigger + "Command: " + cmd.toString());
					}
					else{
						DatatypeCommand dataCmd = ((DatatypeCommand)(argsCmd.getArgument(2)));
						String value = dataCmd.getValue();
						trigger = Integer.parseInt(value);
						
						logger.info("Trigger: " + trigger + "Command: " + cmd.toString());
					}
				}
				else{
					trigger = 1;
					logger.info("Trigger: " + trigger + "Command: " + cmd.toString());
				}
			}
			else
				trigger = 1;
		}
		
		
		
		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		
		
		// input arcs -> arguments
		// for i in a[b][c]:
		if(cmd.getArguments() instanceof SubscriptedVariableCommand){
			
			// create sub Variable Node
			Node subsNode = createSelectProcessNode(cmd);
			
			// create range node
			Node rangeNode = null;
			String rangeNodeID = "P" + (++this.processCounter);
			
			try{
				rangeNode =graph.createNode(nodeType_process); 
			} catch (TypeException ex) {
				logger.info("Create process failed! (range)" + ex.getMessage());
			}
			
			enterValueProcessNode(rangeNode,rangeNodeID,"range","NA","NA",false,"range","OneToOne",1,cmd.toString(),cmd.getStartLine(),cmd.getStartLine());
			
			// making connection from subscripted variable -> range
			
			
			try{
				tempInputArc = graph.createArc(arcType, subsNode, rangeNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			// making output node of range
			Node tNode = createViewNode();
			String tNodeID = "V" + (++this.viewCounter);
			String tNodeName = ((SubscriptedVariableCommand)(cmd.getArguments())).getName();
			enterValueViewNode(tNode, tNodeID, tNodeName, rangeNodeID, false, true, cmd.toString(), "Arguments", cmd.getStartLine());
			
			try{
				tempInputArc = graph.createArc(arcType, rangeNode, tNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			// output node -> for loop
			try{
				tempInputArc = graph.createArc(arcType, tNode, tempProcessNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
		}
		//for i in a.b():
		else if(cmd.getArguments() instanceof MethodCommand){
			
			// create Method Node
			Node subsNode = null;
			try {
				subsNode = createMethodNode((MethodCommand)cmd.getArguments());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// create range node
			Node rangeNode = null;
			String rangeNodeID = "P" + (++this.processCounter);
			
			try{
				rangeNode =graph.createNode(nodeType_process); 
			} catch (TypeException ex) {
				logger.info("Create process failed! (range)" + ex.getMessage());
			}
			
			enterValueProcessNode(rangeNode,rangeNodeID,"range","NA","NA",false,"range","OneToOne",1,cmd.toString(),cmd.getStartLine(),cmd.getStartLine());
			
			// making connection from subscripted variable -> range
			try{
				tempInputArc = graph.createArc(arcType, subsNode, rangeNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			// making output node of range
			Node tNode = createViewNode();
			String tNodeID = "V" + (++this.viewCounter);
			String tNodeName = ((MethodCommand)(cmd.getArguments())).getName();
			enterValueViewNode(tNode, tNodeID, tNodeName, rangeNodeID, false, true, cmd.toString(), "Arguments", cmd.getStartLine());
			
			try{
				tempInputArc = graph.createArc(arcType, rangeNode, tNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			// output node -> for loop
			try{
				tempInputArc = graph.createArc(arcType, tNode, tempProcessNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
		}
		// for i in variable
		else if(cmd.getArguments() instanceof VariableCommand){
			
			// create range node
			Node rangeNode = null;
			String rangeNodeID = "P" + (++this.processCounter);
			
			try{
				rangeNode =graph.createNode(nodeType_process); 
			} catch (TypeException ex) {
				logger.info("Create process failed! (range)" + ex.getMessage());
			}
			
			enterValueProcessNode(rangeNode,rangeNodeID,"range","NA","NA",false,"range","OneToOne",1,cmd.toString(),cmd.getStartLine(),cmd.getStartLine());
			
			// making connection from subscripted variable -> range
			Node subsNode = findViewTuples(cmd.getArguments().toString());
			try{
				tempInputArc = graph.createArc(arcType, subsNode, rangeNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			// making output node of range
			Node tNode = createViewNode();
			String tNodeID = "V" + (++this.viewCounter);
			String tNodeName = ((VariableCommand)(cmd.getArguments())).getName();
			enterValueViewNode(tNode, tNodeID, tNodeName, rangeNodeID, false, true, cmd.toString(), "Arguments", cmd.getStartLine());
			
			try{
				tempInputArc = graph.createArc(arcType, rangeNode, tNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
			
			// output node -> for loop
			try{
				tempInputArc = graph.createArc(arcType, tNode, tempProcessNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
		}
		// for i in range(x,y,z):
		else{
			String sourceName="[";
			Command curCmd;
			ArgumentsCommand argCmd;
			argCmd = ((ArgumentsCommand)(cmd.getArguments()));
			for(int i = 0; i<argCmd.getNumOfArgs(); i++){
				curCmd = argCmd.getArgument(i);
				if(curCmd instanceof VariableCommand){
					sourceName += ((VariableCommand)(curCmd)).getName()+",";
				}
				else if(curCmd instanceof DatatypeCommand){
					sourceName += ((DatatypeCommand)(curCmd)).getValue()+",";
				}
				else if(curCmd instanceof BinaryCommand){
					sourceName += getBinaryOperationName((BinaryCommand) curCmd)+",";
				}
				else if(curCmd instanceof MethodCommand){
					sourceName += getMethodOperationName((MethodCommand) curCmd)+ ",";
				}
				else{
					sourceName = sourceName;
				}
			}			
			if(sourceName.contains(",")){
				try {
					tempInputNode = createArgumentsNode(sourceName, cmd, "range");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
				
				
			}
			else
				sourceName = "";
			
		}
		// final connection to forloop -> variable
		
		Node tempNode = findViewTuples(cmd.getVariable().toString());
		try{
			tempInputArc = graph.createArc(arcType, tempProcessNode, tempNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed (variable)! " + ex.getMessage());
		}
		
		createArcsWithStatements(cmd,tempProcessNode);
		
		removeViewTuplesByName(((VariableCommand)cmd.getVariable()).getName());
		
	}
	// WhileBlock Command
	public void createProcessNode(WhileBlockCommand cmd){
		Node tempProcessNode = null;
		
		try{
			tempProcessNode = graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! (whileBlock) " + ex.getMessage());
		}
		String id = "P" + (++this.processCounter);
		enterValueProcessNode(tempProcessNode,id,"WhileBlock","NA","NA",false,"WhileBlock","OneToOne",1,cmd.toString(),cmd.getStartLine(),cmd.getEndLine());
		
		logger.info("***Process Node Created*** " + id+ ":" + "WhileBlock");
		ViewTuples tempViewTuple = new ViewTuples(id, "WhileBlock", cmd.toString(), cmd.toString(), tempProcessNode, cmd.getStartLine());
		viewTuples.add(tempViewTuple);
		
		// making connections from clause -> block
		
		Node tempInputNode = findViewTuples(cmd.getWhileClause().toString());
		try{
			Arc tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		if(cmd.getElseClause()!=null){
			tempInputNode = findViewTuples(cmd.getElseClause().toString());
			try{
				Arc tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
		}
		
	}
	
	// While Clause Command
	public void createProcessNode(WhileClauseCommand cmd){
		
		Node tempProcessNode = null;
		String tempNodeName = "";
		
		try{
			tempProcessNode = graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! (whileClause) " + ex.getMessage());
		}
		String id = "P" + (++this.processCounter);
		enterValueProcessNode(tempProcessNode,id,"WhileClause","NA","NA",false,"WhileClause","OneToOne",1,cmd.toString(),cmd.getStartLine(),cmd.getEndLine());
		
		logger.info("***Process Node Created*** " + id+ ":" + "WhileClause");
		ViewTuples tempViewTuple = new ViewTuples(id, "WhileClause", cmd.toString(), cmd.toString(), tempProcessNode, cmd.getStartLine());
		viewTuples.add(tempViewTuple);
		
		//making nodes and connection to argument
		Node tempInputNode = null;
		if(cmd.getArgument() instanceof MethodCommand){
			MethodCommand curCmd = ((MethodCommand) (cmd.getArgument()));
			tempNodeName = curCmd.getName();
			try {
				tempInputNode = createMethodNode(curCmd);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else{
			if(cmd.getArgument() instanceof VariableCommand)
				tempNodeName = ((VariableCommand)(cmd.getArgument())).getName();
			else if (cmd.getArgument() instanceof BinaryCommand)
				tempNodeName = getBinaryOperationName((BinaryCommand)cmd.getArgument());
			else
				tempNodeName = "undefined!";
			
			tempInputNode = findViewTuples(cmd.getArgument().toString());
		}
		
		// create range node
		Node rangeNode = null;
		String rangeNodeID = "P" + (++this.processCounter);
		
		try{
			rangeNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! (range)" + ex.getMessage());
		}
		
		enterValueProcessNode(rangeNode,rangeNodeID,"range","NA","NA",false,"range","OneToOne",1,cmd.toString(),cmd.getStartLine(),cmd.getStartLine());
		
		// making connection from variable -> range
		try{
			Arc tempInputArc = graph.createArc(arcType, tempInputNode, rangeNode); 
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		// making output node of range
		Node tNode = createViewNode();
		String tNodeID = "V" + (++this.viewCounter);
		enterValueViewNode(tNode, tNodeID, tempNodeName, rangeNodeID, false, true, cmd.toString(), "", cmd.getStartLine());
		
		try{
			Arc tempInputArc = graph.createArc(arcType, rangeNode, tNode); 
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		// output node -> process
		try{
			Arc tempInputArc = graph.createArc(arcType, tNode, tempProcessNode); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		createArcsWithStatements(cmd, tempProcessNode);
		
	}
	
	private void createArcsWithStatements(Command cmd, Node tempProcessNode){
		String searchKey;
		Command curStmt_cmd;
		
		boolean foundClass = false;
		
		Iterator<Command> cit = null;
		Node tempInputNode;
		Arc tempInputArc;
		
		// input arcs -> statements
		
		if(cmd instanceof ForLoopCommand)
			cit = ((ForLoopCommand)(cmd)).getStatements().iterator();
		else if(cmd instanceof WhileClauseCommand)
			cit = ((WhileClauseCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof IfClauseCommand)
			cit = ((IfClauseCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof ElseClauseCommand)
			cit = ((ElseClauseCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof ElifClauseCommand)
			cit = ((ElifClauseCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof IfBlockCommand)
			cit = ((IfBlockCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof TryClauseCommand)
			cit = ((TryClauseCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof ExceptClauseCommand)
			cit = ((ExceptClauseCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof FinallyClauseCommand)
			cit = ((FinallyClauseCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof TryBlockCommand)
			cit = ((TryBlockCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof WithCommand)
			cit = ((WithCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof FunctionDefinitionCommand)
			cit = ((FunctionDefinitionCommand)(cmd)).getStatements().iterator();
		else if (cmd instanceof ClassDefinitionCommand){
			cit = ((ClassDefinitionCommand)(cmd)).getStatements().iterator();
			foundClass = true;
		}
		else{
			
		}
		
		// creating arcs
		while(cit.hasNext()){
			curStmt_cmd = cit.next();
			logger.info("Current Statement: " + curStmt_cmd.toString());
			tempInputNode = findViewTuples(curStmt_cmd.toString());
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
			}
			
			if(foundClass == true){
				ClassParamPair cp = new ClassParamPair(tempProcessNode, tempInputNode);
				this.classParameters.add(cp);
			}
		}
	}
	
	private String retriveLineDatatype(int tempLine) {
		String value="";
		ViewTuples tempViewTuple;
		Iterator<ViewTuples> vit = viewTuples.iterator();
		while(vit.hasNext()){
			tempViewTuple = vit.next();
			if(tempViewTuple.getLine()==tempLine){
				if(tempViewTuple.getIdent().matches("(.*)P(.*)"))
					continue;
				else{ 
					if(tempViewTuple.getIdent().matches("(.*)C(.*)"))
						value = tempViewTuple.getName().toString();
				}
			}
		}
		return value;
	}

	private int findLine(String a) {
		int line = 0;
		ViewTuples tempViewTuple;
		String candidate;
		boolean found = false;
		Iterator<ViewTuples> vit = viewTuples.iterator();
		while(vit.hasNext()){
			tempViewTuple = vit.next();
			Iterator<String> str = tempViewTuple.getlastRef().iterator();
			while(str.hasNext()){
				candidate = str.next();
				if(candidate.equals(a)){
					found = true;
					break;
				}
			}
			if(found == true){
				line = tempViewTuple.getLine();
				break;
			}
			
		}
		
		return line;
	}
	// If Clause Command
	public void createProcessNode(IfClauseCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "if";
		String viewId = "NA";
		String viewName = "";
		String type = "IfClause";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		
		// input arc -> argument
		String searchKey = cmd.getArgument().toString();
		tempInputNode = findViewTuples(searchKey);
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
		}
	
		
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// else If clause command
	public void createProcessNode(ElifClauseCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "else if";
		String viewId = "NA";
		String viewName = "";
		String type = "ElseIfClause";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		
		// input arc -> argument
		String searchKey = cmd.getArgument().toString();
		tempInputNode = findViewTuples(searchKey);
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
		}
	
		
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// Else Clause Command
	public void createProcessNode(ElseClauseCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "else";
		String viewId = "NA";
		String viewName = "";
		String type = "ElseClause";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		
	
		
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// if block command
	public void createProcessNode(IfBlockCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "If-Elif-Else Block";
		String viewId = "NA";
		String viewName = "";
		String type = "IfBlock";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// Try Clause Command
	public void createProcessNode(TryClauseCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "try";
		String viewId = "NA";
		String viewName = "";
		String type = "TryClause";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
				
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// Except Clause Command
	public void createProcessNode(ExceptClauseCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "except";
		String viewId = "NA";
		String viewName = "";
		String type = "ExceptClause";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		
		// input arc -> argument
		if(cmd.getArgument()!=null){
			tempInputNode = findViewTuples(cmd.getArgument().toString());
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
			}
		}
		
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// Finally Clause Command
	public void createProcessNode(FinallyClauseCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "finally";
		String viewId = "NA";
		String viewName = "";
		String type = "FinallyClause";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// Try block command
	public void createProcessNode(TryBlockCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "Try-Except-Finally Block";
		String viewId = "NA";
		String viewName = "";
		String type = "TryBlock";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getStartLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getEndLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
	}
	// function defeinition command
	
	public void createProcessNode(FunctionDefinitionCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "P" + (++this.processCounter);
		String name = cmd.getName();
		String viewId = "NA";
		String viewName = "";
		boolean perst = false;
		String type = "FunctionDefinitionBlock";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getStartLine();
		int endLine = cmd.getEndLine();
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			
			
			enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
		// input arcs -> arguments
		String searchKey;
		logger.info("Creating arcs with Arguments: Function");
		if(cmd.getArguments().getClass().getName().equals("pythonProvenance.commands.ArgumentsCommand")){
			ArgumentsCommand argCmd = (ArgumentsCommand) (cmd.getArguments());
			int number = argCmd.getNumOfArgs();
			for(int i = 0; i < number; i++){
				searchKey = argCmd.getArgument(i).toString();
				logger.info("SearchKey: " + searchKey);
				
				tempInputNode = findViewTuples(searchKey);
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
				
				FunctionParamPair fp = new FunctionParamPair(tempProcessNode, tempInputNode);
				this.functionParameters.add(fp);
				
				removeViewTuplesByName(tempInputNode.getAttribute().getValueAt("name").toString());
			}
		}
		else{
			tempInputNode = findViewTuples(cmd.getArguments().toString());
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
			}
		}
		
		
	}
	// class definition command
	public void createProcessNode(ClassDefinitionCommand cmd){
		Node tempProcessNode = null;
		Node tempInputNode = null;
		Arc tempInputArc = null;
		
		String id = "P" + (++this.processCounter);
		String name = cmd.getName();
		String viewId = "NA";
		String viewName = "";
		boolean perst = false;
		String type = "ClassDefinitionCommand";
		String inOut = "ManyToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getStartLine();
		int endLine = cmd.getEndLine();
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			
			enterValueProcessNode(tempProcessNode, id, name, viewId, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
			ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
			viewTuples.add(tempViewTuple);
		}
		
		
		// output arc
			// no output arc, for itself is a big process to infer trigger
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
		// input arcs -> arguments
		String searchKey;
		if(cmd.getArguments()!=null){
			if(cmd.getClass().getName().toString().equals("ArgumentsCommand")){
				ArgumentsCommand argCmd = (ArgumentsCommand) (cmd.getArguments());
				int number = argCmd.getNumOfArgs();
				for(int i = 0; i < number; i++){
					searchKey = argCmd.getArgument(i).toString();
					tempInputNode = findViewTuples(searchKey);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
					}
					
					//ClassParamPair cp = new ClassParamPair(tempProcessNode, tempInputNode);
					//this.classParameters.add(cp);
					
					removeViewTuplesByName(tempInputNode.getAttribute().getValueAt("name").toString());
				}
			}
			else{
				tempInputNode = findViewTuples(cmd.getArguments().toString());
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! (Method) " + ex.getMessage());
				}
			}
		}
		
		
	}
	
	// return  command
	public void createProcessNode(ReturnCommand cmd){
		Node tempProcessNode = null;
		Arc tempInputArc = null;
		Node tempInputNode = null;
		
		String id = "";
		String name = "return";
		String viewId = "NA";
		String viewName = "";
		String type = "ReturnCommand";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempProcessNode != null) {
			attrInstance = tempProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
			
			
		}
		
		
		// output arc
		List args = cmd.getArguments();
		if(args!=null){
			for(int i = 0; i<args.size(); i++){
				tempInputNode = findViewTuples(cmd.getArgument(i).toString());
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempOutputArc failed! " + ex.getMessage());
				}
			}
		}
		
		
		ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
		viewTuples.add(tempViewTuple);
		
	}
	// create process node - WithCommand
	public Node createProcessNode(WithCommand cmd){
		Node tempProcessNode = null;
		
		String id =  "P" + (++this.processCounter);
		String name = "with";
		String viewId = "NA";
		String viewName = "";
		String type = "WithCommand";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getStartLine();
		int endLine = cmd.getEndLine();
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		enterValueProcessNode(tempProcessNode,id,name,viewId,viewName,false,type,inOut,trigger,ref,startLine,endLine);
		ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempProcessNode, startLine);
		viewTuples.add(tempViewTuple);
		
		
		Iterator<Command> arguments = cmd.getArguments().iterator();
		while(arguments.hasNext()){
			Command curArg = arguments.next();
			if(curArg instanceof WithEquivalent){
				Command op1 = ((WithEquivalent)(curArg)).getOp1();
				Command op2 = ((WithEquivalent)(curArg)).getOp2();
				Node tempInputNode1 = findViewTuples(op1.toString());
				Node tempInputNode2 = findViewTuples(op2.toString());
				Node asNode = createProcessNodeForAs(cmd);
				
				try{
					Arc tempInputArc = graph.createArc(arcType, tempInputNode1, asNode); 
				} catch (TypeException ex) {
					logger.info("Create InputArc failed! (With-As) " + ex.getMessage());
				}
				
				try{
					Arc tempInputArc = graph.createArc(arcType, asNode, tempInputNode2); 
				} catch (TypeException ex) {
					logger.info("Create InputArc failed! (With-As) " + ex.getMessage());
				}
				
				try{
					Arc tempInputArc = graph.createArc(arcType, tempProcessNode, tempInputNode1); 
				} catch (TypeException ex) {
					logger.info("Create InputArc failed! (With-As) " + ex.getMessage());
				}
			}
			else{
				logger.info("Incompitable Argument --- WithCommand");
			}
		}
		
		// input arcs -> statements
		createArcsWithStatements(cmd,tempProcessNode);
		
		
		
		return tempProcessNode;
	}
	public Node createProcessNodeForAs(WithCommand cmd){
		Node tempProcessNode = null;
		
		String id =  "P" + (++this.processCounter);
		String name = "as";
		String viewId = "NA";
		String viewName = "";
		String type = "WithCommand-AS";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = cmd.toString();
		int startLine = cmd.getStartLine();
		int endLine = cmd.getStartLine();
		

		try{
			tempProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		enterValueProcessNode(tempProcessNode,id,name,viewId,viewName,false,type,inOut,trigger,ref,startLine,endLine);
		
		return tempProcessNode;
	}
	
	// select process node -> subscripted variable within for loop
	
	public Node createSelectProcessNode(ForLoopCommand cmd){
		Node tempSelectProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Node tempOutputNode = null;
		Arc tempOutputArc = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "";
		String viewId = "NA";
		String viewName = "";
		String type = "Select List";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		SubscriptedVariableCommand subCmd = null;
		
		//StringBuffer name_lastPart = new StringBuffer();
		
		
		
		subCmd =((SubscriptedVariableCommand)(((ForLoopCommand)(cmd)).getArguments()));
			
		name = "select_"+subCmd.getName();
		
			
		
		try{
			tempSelectProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create select process failed! " + ex.getMessage());
		}
		
		if (tempSelectProcessNode != null) {
			attrInstance = tempSelectProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
		}
		
		// input arc from old view 
		tempInputNode = findViewTuplesByName(subCmd.getName());
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempSelectProcessNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		// input arc from subscript
		Command argCmd = (SubscriptsCommand) subCmd.getSubscript();
		createArcsWithArguments(argCmd, tempSelectProcessNode);
		
		
		
		// create output node and arc
		tempOutputNode = createViewNode(subCmd,true);
		try{
			tempOutputArc = graph.createArc(arcType, tempSelectProcessNode, tempOutputNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		return tempOutputNode;
		
	}
	
	//select process node -> subscripted variable at right
	
	public Node createSelectProcessNode(Command cmd){
		
		Node tempSelectProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Node tempOutputNode = null;
		Arc tempOutputArc = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "";
		String viewId = "NA";
		String viewName = "";
		String type = "Select List";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		SubscriptedVariableCommand subCmd = null;
		
		//StringBuffer name_lastPart = new StringBuffer();
		
		
		if(cmd instanceof AssignCommand){
			subCmd =((SubscriptedVariableCommand)(((AssignCommand)(cmd)).getOperandRight()));
			
			name = "select_"+subCmd.getName();
		}
		else{
			subCmd =((SubscriptedVariableCommand)(cmd));
			name = "select_"+subCmd.getName();
		}
		
		
		
		// subscripted variable checking in viewTuples
		/*
		String searchKey = subCmd.getName();
		Command curCmd;
		Iterator<Command> cit = ((SubscriptsCommand)(subCmd.getSubscript())).getArguments().iterator();
		while(cit.hasNext()){
			curCmd = cit.next();
			if(curCmd.getClass().getName().equals("commands.DatatypeCommand")){
				searchKey += "[" + ((DatatypeCommand)(curCmd)).getValue() + "]";
			}
			else if(curCmd.getClass().getName().equals("commands.VariableCommand")){
				searchKey += "[" + ((VariableCommand)(curCmd)).getName() + "]";
			}
		}
		String reference = retrieveRefByName(subCmd.getName());
		
		tempInputNode = findViewTuples(name,reference);
		if(tempInputNode!=null){
			return tempInputNode;
		}
		*/
		
		try{
			tempSelectProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create select process failed! " + ex.getMessage());
		}
		
		if (tempSelectProcessNode != null) {
			attrInstance = tempSelectProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
		}
		
		// input arc from old view 
		tempInputNode = findViewTuplesByName(subCmd.getName());
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempSelectProcessNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		// input arc from subscript
		Command argCmd = (SubscriptsCommand) subCmd.getSubscript();
		createArcsWithArguments(argCmd, tempSelectProcessNode);
		
		
		
		// create output node and arc
		tempOutputNode = createViewNode(subCmd,true);
		try{
			tempOutputArc = graph.createArc(arcType, tempSelectProcessNode, tempOutputNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		return tempOutputNode;
	}
	// update process node -> member variable at left
	public void createUpdateMemberNode(AssignCommand cmd){
		Node tempUpdateProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Node tempOutputNode = null;
		Arc tempOutputArc = null;
		Arc tempInputArc = null;
		
		ClassVariableCommand subCmd =((ClassVariableCommand)(cmd.getOperandLeft()));
		String cmdName = subCmd.getName();
		String fpart = cmdName.split("[.]")[0];
		String lpart = cmdName.split("[.]")[1];
		
		
		String id = "P" + (++this.processCounter);
		String name = "Update Member "+ lpart;
		String viewId = "NA";
		String viewName = "";
		boolean perst = false;
		String type = "Update Member";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = subCmd.toString();
		int startLine = subCmd.getLine();
		int endLine = subCmd.getLine();
		
		
		
		
		
		
		try{
			tempUpdateProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if(tempUpdateProcessNode!=null)
			enterValueProcessNode(tempUpdateProcessNode, id, name, viewId, viewName, perst, type, inOut, trigger, ref, startLine, endLine);
		
		
		
		// input arc from old view 
		tempInputNode = findViewTuplesByName(fpart);
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempUpdateProcessNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		/*
		// input arc from subscript [index]
		Iterator<Command> cit = null;
		String sName = "[";
		Command curCmd = null;
		Node tNode = null;
		SubscriptsCommand argCmd = (SubscriptsCommand) ((SubscriptedVariableCommand)(cmd.getOperandLeft())).getSubscript();
		cit = argCmd.getArguments().iterator();
		while(cit.hasNext()){
			curCmd = cit.next();
			if(curCmd.getClass().getName().matches("(.*)VariableCommand(.*)"))
					sName += ((VariableCommand)(curCmd)).getName().toString() + ",";
			else if(curCmd.getClass().getName().matches("(.*)DatatypeCommand(.*)"))
					sName += ((DatatypeCommand)(curCmd)).getValue().toString() + ",";
		}
		
		
		
		try {
			tNode = createArgumentsNode(sName, argCmd, "index");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			tempInputArc = graph.createArc(arcType, tNode, tempUpdateProcessNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		*/
		
		//create source input node [value]
		String key = cmd.getOperandRight().toString();
		tempInputNode = findViewTuples(key);
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempUpdateProcessNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		// create output node and arc
		tempOutputNode = createViewNode(subCmd, false);
		
		try{
			tempOutputArc = graph.createArc(arcType, tempUpdateProcessNode, tempOutputNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		//removeViewTuplesByName(lpart);
		ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempOutputNode, startLine);
		viewTuples.add(tempViewTuple);
		
	}
	
	// update process node -> subscripted variable at left
	public void createUpdateProcessNode(AssignCommand cmd){
		Node tempUpdateProcessNode = null;
		Node tempIntViewNode = null;
		Node tempInputNode = null;
		Node tempOutputNode = null;
		Arc tempOutputArc = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "";
		String viewId = "NA";
		String viewName = "";
		String type = "Update List";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		
		SubscriptedVariableCommand subCmd =((SubscriptedVariableCommand)(cmd.getOperandLeft()));
		name = "update_"+subCmd.getName();
		
		
		try{
			tempUpdateProcessNode =graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		
		if (tempUpdateProcessNode != null) {
			attrInstance = tempUpdateProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "P" + (++this.processCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_ident");
			vm.setExprAsObject(viewId);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("view_name");
			vm.setExprAsObject(viewName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Process Node Created*** " + id+ ":" + name);
			//logger.info("Process Node  " + tempProcessNode.toString());
		}
		
		// input arc from old view 
		tempInputNode = findViewTuplesByName(subCmd.getName());
		try{
			tempInputArc = graph.createArc(arcType, tempInputNode, tempUpdateProcessNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		// input arc from subscript [index]
		// value -> index -> intermediate view
		
		// create index node 
		Node indexNode = null;
		try{
			indexNode = graph.createNode(nodeType_process); 
		} catch (TypeException ex) {
			logger.info("Create process failed! " + ex.getMessage());
		}
		String indexNodeID = "P" + (++this.processCounter);
		
		enterValueProcessNode(indexNode, indexNodeID, "index", "NA", "NA", false, "Ausiliary", "OneToOne", 1, cmd.toString(), cmd.getLine(), cmd.getLine());
		
		// making connections from the value to index node
		SubscriptsCommand argCmd = (SubscriptsCommand) ((SubscriptedVariableCommand)(cmd.getOperandLeft())).getSubscript();
		Iterator<Command> cit = argCmd.getArguments().iterator();
		while(cit.hasNext()){
			Command curCmd = cit.next();
			Iterator<Command> cit1 = ((SubscriptIndexCommand)(curCmd)).getArguments().iterator();
			while(cit1.hasNext()){
				Command curCmd1 = cit1.next();
				Node input = findViewTuples(curCmd1.toString());
				try{
					tempInputArc = graph.createArc(arcType, input, indexNode ); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create InputArc failed! (index node)" + ex.getMessage());
				}
			}
		}
		
		// create view node and then make connection
		Node tNode = createViewNode();
		String tNodeID = "V" + (++this.viewCounter);
		String tNodeName = getSubscriptVariableIndex(((SubscriptedVariableCommand)(cmd.getOperandLeft())));
		enterValueViewNode(tNode, tNodeID, tNodeName, indexNodeID, false, true, cmd.toString(), "", cmd.getLine());
		
		try{
			tempInputArc = graph.createArc(arcType, indexNode, tNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create InputArc failed! (index -> view)" + ex.getMessage());
		}
		
		try{
			tempInputArc = graph.createArc(arcType, tNode, tempUpdateProcessNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempInputArc failed! " + ex.getMessage());
		}
		
		/*
		Iterator<Command> cit = null;
		String sName = "[";
		Command curCmd = null;
		Node tNode = null;
		SubscriptsCommand argCmd = (SubscriptsCommand) ((SubscriptedVariableCommand)(cmd.getOperandLeft())).getSubscript();
		cit = argCmd.getArguments().iterator();
		while(cit.hasNext()){
			curCmd = cit.next();
			if(curCmd.getClass().getName().matches("(.*)VariableCommand(.*)"))
					sName += ((VariableCommand)(curCmd)).getName().toString() + ",";
			else if(curCmd.getClass().getName().matches("(.*)DatatypeCommand(.*)"))
					sName += ((DatatypeCommand)(curCmd)).getValue().toString() + ",";
		}
		
		
		
		try {
			tNode = createArgumentsNode(sName, argCmd, "index");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		//create source input node [value]
		String key = cmd.getOperandRight().toString();
		tempInputNode = findViewTuples(key);
		if(tempInputNode!=null){
			try{
				tempInputArc = graph.createArc(arcType, tempInputNode, tempUpdateProcessNode ); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
		}
		// subscripted command
		else{
			if(cmd.getOperandRight() instanceof SubscriptedVariableCommand){
				tempInputNode = createSelectProcessNode(cmd.getOperandRight());
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempUpdateProcessNode ); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
		}
		
		// create output node and arc
		tempOutputNode = createViewNode(subCmd,false);
		try{
			tempOutputArc = graph.createArc(arcType, tempUpdateProcessNode, tempOutputNode ); 
			//nodes.add(tempNode);
		} catch (TypeException ex) {
			logger.info("Create tempOutputArc failed! " + ex.getMessage());
		}
		
		ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempOutputNode, startLine);
		viewTuples.add(tempViewTuple);
		
	}
	
	/****** Create Source Process Nodes *****/
	// dataType command as argument
	public void createSourceProcessNode(AssignCommand cmd, Node tempNode){
		Node tempSourceProcessNode = null;
		Node tempOutputNode = null;
		Node tempInputNode = null;
		Arc tempOutputArc = null;
		Arc tempInputArc = null;
		
		String id = "";
		String name = "";
		String sourceId = "NA";
		String sourceName = "";
		String type ="Assignment";
		String inOut = "OneToOne";
		int trigger = 1;
		String ref = "";
		int startLine = 0;
		int endLine = 0;
		
		try{
			tempSourceProcessNode =graph.createNode(nodeType_sourceProcess); 
		} catch (TypeException ex) {
			logger.info("Create source process failed! " + ex.getMessage());
		}
		
		if (tempSourceProcessNode != null) {
			
			attrInstance = tempSourceProcessNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set values of attributes
			vm = (ValueMember) vt.getMemberAt("ident");
			id = "SP" + (++this.sourceProcessCounter);
			vm.setExprAsObject(id);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("name");
			name = cmd.getOperator();
			vm.setExprAsObject(name);
			vm.checkValidity();
			
			
			vm = (ValueMember) vt.getMemberAt("source_ident");
			vm.setExprAsObject(sourceId);
			vm.checkValidity();
			
			
			vm = (ValueMember) vt.getMemberAt("source_name");
			vm.setExprAsObject(sourceName);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("type");
			vm.setExprAsObject(type);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("in/out");
			vm.setExprAsObject(inOut);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("trigger");
			vm.setExprAsObject(trigger);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("ref");
			ref = cmd.toString();
			vm.setExprAsObject(ref);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("line#");
			startLine = cmd.getLine();
			vm.setExprAsObject(startLine);
			vm.checkValidity();
			
			vm = (ValueMember) vt.getMemberAt("endLine#");
			endLine = cmd.getLine();
			vm.setExprAsObject(endLine);
			vm.checkValidity();
			
			logger.info("***Source Process Node Created*** " + id+ ":" + name);
			
		}
		
		// check if assign operator is not '='
		if(cmd.getOperator().toString().equals("=")!=true){
			tempInputNode = findViewTuples(cmd.getOperandLeft().toString());
			if(tempInputNode!=null){
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempSourceProcessNode); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
		}
		
		//create output arc 
		String searchKey1 = cmd.getOperandLeft().toString();
		boolean addNode = checkScopeViewTuples(searchKey1);
		if(addNode==false){
			tempOutputNode = findViewTuples(searchKey1);
			
			attrInstance = tempOutputNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set persistent values		
			vm = (ValueMember) vt.getMemberAt("persistent");
			vm.setExprAsObject(true);
			vm.checkValidity();
			
			try{
				tempOutputArc = graph.createArc(arcType, tempSourceProcessNode, tempOutputNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempOutputArc failed (if)! " + ex.getMessage());
			}
		}
		else{
			removeViewTuples(searchKey1);
			createViewNode((VariableCommand)(cmd.getOperandLeft()));
			tempOutputNode = findViewTuples(searchKey1);
			
			attrInstance = tempOutputNode.getAttribute();
			vt = (ValueTuple) attrInstance;
			
			// Set persistent values		
			vm = (ValueMember) vt.getMemberAt("persistent");
			vm.setExprAsObject(true);
			vm.checkValidity();
			
			try{
				tempOutputArc = graph.createArc(arcType, tempSourceProcessNode, tempOutputNode); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempOutputArc failed (else)! " + ex.getMessage());
			}
		}
		
		
		// create input arcs
		String searchKey2 = null;
		DatatypeCommand dataCmd;
		Node tempNode1=null;
		if(tempNode!=null){ // select process
			try{
				tempInputArc = graph.createArc(arcType, tempNode, tempSourceProcessNode ); 
				//nodes.add(tempNode);
			} catch (TypeException ex) {
				logger.info("Create tempInputArc failed! " + ex.getMessage());
			}
		}
		
		else{
			if(cmd.getOperandRight()!=null){
				searchKey2 = cmd.getOperandRight().toString();
			
				if(searchKey2.matches("(.*)DatatypeCommand(.*)")){
					// input arc from datatype value
					tempInputNode = findViewTuples(searchKey2);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempSourceProcessNode ); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! " + ex.getMessage());
					}
					// input arcs from datatype value args
					String sName = "[";
					dataCmd = ((DatatypeCommand)cmd.getOperandRight());
					if(dataCmd.getArguments()!=null){
						Iterator<Command> cit = dataCmd.getArguments().iterator();
						Command curCmd;
						String key;
						while(cit.hasNext()){
							
							curCmd = cit.next();
							if(curCmd.getClass().getName().equals("pythonProvenance.commands.SubscriptedVariableCommand")){
								tempInputNode = createSelectProcessNode((SubscriptedVariableCommand)(curCmd));
								try{
									tempInputArc = graph.createArc(arcType, tempInputNode, tempSourceProcessNode ); 
									//nodes.add(tempNode);
								} catch (TypeException ex) {
									logger.info("Create tempInputArc failed! " + ex.getMessage());
								}
							}
							else if(curCmd.getClass().getName().equals("pythonProvenance.commands.VariableCommand")){
								sName += ((VariableCommand)(curCmd)).getName() + ",";
								
							}
							else if(curCmd.getClass().getName().equals("pythonProvenance.commands.DatatypeCommand")){
								sName += ((DatatypeCommand)(curCmd)).getValue() + ",";
							}
							else{
								
							}
						}
						if(sName.contains(",")){
							try {
								tempNode1 = createArgumentsNode(sName,dataCmd,"arguments");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							try{
								tempInputArc = graph.createArc(arcType, tempNode1, tempSourceProcessNode); 
								//nodes.add(tempNode);
							} catch (TypeException ex) {
								logger.info("Create tempInputArc failed! " + ex.getMessage());
							}
							
							/*
							cit = dataCmd.getArguments().iterator();
							while(cit.hasNext()){
								tempInputNode = findViewTuples(cit.next().toString());
								try{
									tempInputArc = graph.createArc(arcType, tempInputNode, tempNode1); 
									//nodes.add(tempNode);
								} catch (TypeException ex) {
									logger.info("Create tempInputArc failed! " + ex.getMessage());
								}
								
							}
							*/
							
							
						}
						else
							sName = "";
						
					}
				}
				
				/*
				else if (searchKey2.matches("(.*)ListComprehensionCommand(.*)")){
					ListComprehensionCommand tempListCmd = ((ListComprehensionCommand)(cmd.getOperandRight()));
					tempInputNode = createProcessNode(tempListCmd);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempSourceProcessNode ); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! " + ex.getMessage());
					}
					
					
				}
				else if (searchKey2.matches("(.*)DictComprehensionCommand(.*)")){
					DictComprehensionCommand tempDictCmd = ((DictComprehensionCommand)(cmd.getOperandRight()));
					tempInputNode = createProcessNode(tempDictCmd);
					try{
						tempInputArc = graph.createArc(arcType, tempInputNode, tempSourceProcessNode ); 
						//nodes.add(tempNode);
					} catch (TypeException ex) {
						logger.info("Create tempInputArc failed! " + ex.getMessage());
					}
					
				}
				*/
				else{
					
				}
			}
			// for null assignment
			else{
				tempInputNode = createViewNode();
				try{
					tempInputArc = graph.createArc(arcType, tempInputNode, tempSourceProcessNode ); 
					//nodes.add(tempNode);
				} catch (TypeException ex) {
					logger.info("Create tempInputArc failed! " + ex.getMessage());
				}
			}
		}
		
		
		ViewTuples tempViewTuple = new ViewTuples(id, name, ref, ref, tempOutputNode, startLine);
		viewTuples.add(tempViewTuple);
	}
	
	
	private void createGraGraGraph() throws IOException, InterruptedException {
		logger.info("Create graphGrammar  <Provenance-Graph> ...");
		 
		// Initialization of different variables
		init();
		typingGraph();
		addingTypeAttr();
		
		// adding attributes for different nodes
		addingAttrView();
		addingAttrSource();
		addingAttrProcess();
		addingAttrSourceProcess();
		
		/********* Specification of Type graph **********/
		// no type graph now - to do 

		/********** Create objects of the start graph ****************/
		Node tempNode = null;
		Node tempProcessNode = null;
		Arc tempArc = null;
		// Set attribute values

		
		// List to maintain the refernce of nodes
		
		Iterator<Command> cit = commands.iterator();
		while(cit.hasNext()){
			Command tempCmd = cit.next();
			
			/*********** VariableCommand **************/
			if(tempCmd instanceof VariableCommand){
				VariableCommand curCmd = ((VariableCommand)(tempCmd));
				if(checkViewTuples(curCmd)==true){
					logger.info("View " + curCmd.getName() + " already exists! ");
					logger.info("Last Reference Updated");
					printViewTuples();
				}
				else{
					createViewNode(curCmd);
				}
			}
			
			/********* DatatypeCommand ****************/
			else if(tempCmd instanceof DatatypeCommand){
				DatatypeCommand curCmd = ((DatatypeCommand)(tempCmd));
				createSourceNode(curCmd);
			}
			/************ BinaryCommand **************/
			else if(tempCmd instanceof BinaryCommand){
				BinaryCommand curCmd = ((BinaryCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/********** UnaryCommand ***************/
			else if(tempCmd instanceof UnaryCommand){
				UnaryCommand curCmd = ((UnaryCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/********* AssignCommand **************/
			else if(tempCmd instanceof AssignCommand){
				AssignCommand curCmd = ((AssignCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/********* MethodCommand *************/
			else if(tempCmd instanceof MethodCommand){
				MethodCommand curCmd = ((MethodCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/******** Block Commands *************/
			/******** For Loop Command ***********/
			else if(tempCmd instanceof ForLoopCommand){
				ForLoopCommand curCmd = ((ForLoopCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/******** While Block Command *************/
			else if (tempCmd instanceof WhileBlockCommand){
				WhileBlockCommand curCmd = ((WhileBlockCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/******* While Clause Command *************/
			else if (tempCmd instanceof WhileClauseCommand){
				WhileClauseCommand curCmd = ((WhileClauseCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/******* If Clause Command **********/
			else if(tempCmd instanceof IfClauseCommand){
				IfClauseCommand curCmd = ((IfClauseCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/******* Else If Clause Command **********/
			else if(tempCmd instanceof ElifClauseCommand){
				ElifClauseCommand curCmd = ((ElifClauseCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/****** Else Clause Command ********/
			else if(tempCmd instanceof ElseClauseCommand){
				ElseClauseCommand curCmd = ((ElseClauseCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/****** If Block Command ********/
			else if(tempCmd instanceof IfBlockCommand){
				IfBlockCommand curCmd = ((IfBlockCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/****** Try Clause Command ********/
			else if(tempCmd instanceof TryClauseCommand){
				TryClauseCommand curCmd = ((TryClauseCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/****** Except Clause Command ********/
			else if(tempCmd instanceof ExceptClauseCommand){
				ExceptClauseCommand curCmd = ((ExceptClauseCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/****** Finally Clause Command ********/
			else if(tempCmd instanceof FinallyClauseCommand){
				FinallyClauseCommand curCmd = ((FinallyClauseCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/****** Try Block Command ********/
			else if(tempCmd instanceof TryBlockCommand){
				TryBlockCommand curCmd = ((TryBlockCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/***** FunctionDefinition Command ****/
			else if(tempCmd instanceof FunctionDefinitionCommand){
				FunctionDefinitionCommand curCmd = ((FunctionDefinitionCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/***** Return Command *******/
			else if(tempCmd instanceof ReturnCommand){
				ReturnCommand curCmd = ((ReturnCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/**** With Command ********/
			else if (tempCmd instanceof WithCommand){
				WithCommand curCmd = ((WithCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/***** ClassDefinition Command ****/
			else if(tempCmd instanceof ClassDefinitionCommand){
				ClassDefinitionCommand curCmd = ((ClassDefinitionCommand)(tempCmd));
				createProcessNode(curCmd);
			}
			/**** Class Variable Command *****/
			
			else if(tempCmd instanceof ClassVariableCommand){
				boolean foundInside = false;
				ClassVariableCommand curCmd = ((ClassVariableCommand)(tempCmd));
				int line = curCmd.getLine();
				Iterator<Command> cit1 = this.commands.iterator();
				while(cit1.hasNext()){
					Command c = cit1.next();
					if(c.getClass().getName().equals("pythonProvenance.commands.ClassDefinitionCommand")){
						ClassDefinitionCommand curClass = ((ClassDefinitionCommand)(c));
						int start = curClass.getStartLine();
						int end = curClass.getEndLine();
						if(line >= start && line <= end){
							foundInside = true;
							break;
						}
					}
				}
				if(foundInside==true){
					createViewNodeInsideClass(curCmd);
				}
				/*
				else{
					createViewNode(curCmd, true);
				}
				*/
			}
			
			else{
				continue;
			}			
		}
		
		
		// Prepare dotty file
		prepareDottyFile("_beforeTransform");
		writeDottyFile(graph, false);
		
		String dotFileName = this.dottyFileName;
		String outputFileName = this.dottyFileName.split(".dot")[0] + ".graphml";
		createXML(dotFileName, outputFileName);
		
		graphGrammar.setGraTraOptions(this.strategy);
		
		Pair<Object, String> pair = graphGrammar.isReadyToTransform();
		Object test = null;
		if (pair != null)
			test = pair.first;
		if (test != null) {
			if (test instanceof Graph) {
				logger.info("Grammar  " + graphGrammar.getName()
						+ "  graph: " + graphGrammar.getGraph().getName()
						+ "  is not ready for transform");
			} else if (test instanceof AtomConstraint) {
				String s0 = "Atomic graph constraint  \""
						+ ((AtomConstraint) test).getAtomicName()
						+ "\" is not valid. "
						+ "\nPlease check: "
						+ "\n  - graph morphism ( injective and total )  "
						+ "\n  - attribute context ( variable and condition declarations ).";
				logger.info(s0);
			}
		} else
			logger.info("Grammar  " + graphGrammar.getName()
					+ "  is ready to transform");
		
		
		// Set file name and save grammar
		String fn = graphGrammar.getName() + "_" + testFileName + ".ggx";
		graphGrammar.save(fn);
		logger.info("Grammar "+graphGrammar.getName()
				 +" saved in "+fn);

		showGraph(graph, false);
		
		//JOptionPane.showMessageDialog(null, "Click OK to continue ... ");
		
		/*
		logger.info("Please Enter to Continue ... ");
		BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
		brIn.readLine();
		*/
	}
	

	/** Implements GraTraEventListener 
	 * @throws IOException */
	public void writeDottyFile(Graph graph, boolean isMerged) throws IOException{
		String nodeIdent;
		String nodeName;
		String line;
		int s = 0;
		int p = 0;
		int sp = 0;
		int v = 0;
		logger.info("*** Nodes of the Graph ***");
		Iterator<Node> en = graph.getNodesSet().iterator();
		if(isMerged == false){
			while (en.hasNext()) {
				Node n = en.next();
				//logger.info(n.getAttribute().getValueAt("ident")+ "  " + n.getAttribute().getValueAt("name") + "   "
						//+ n.getAttribute().getValueAt("ref"));
				nodeIdent = n.getAttribute().getValueAt("ident").toString();
				nodeName = n.getAttribute().getValueAt("name").toString();
				String perst, inter, trigger; 
				String outputProcess;
				nodeName = nodeName.replace("\"", " ");
				nodeName = nodeName.replace("\'", " ");
				nodeName = nodeName.replaceAll("\n", " ").replaceAll("\r", " ");
				
				//logger.info(nodeName);
				line = n.getAttribute().getValueAt("line#").toString();
				if(n.getAttribute().getValueAt("endLine#")==null || (n.getAttribute().getValueAt("endLine#").toString().equals(n.getAttribute().getValueAt("line#").toString())))
					line = line;
				else
					line = line + " - " + n.getAttribute().getValueAt("endLine#");
				
				if(nodeIdent.matches("(.*)P(.*)")){
					trigger = n.getAttribute().getValueAt("trigger").toString();
					if(nodeIdent.matches("(.*)S(.*)")){
						++sp;
						dottyOut.write("\"" + nodeIdent + "\"" + "[shape=hexagon, color=blue, label=\"" + nodeIdent  + ": " + nodeName + " (TR:" + trigger + ")\\n(#" + line + ")\\n\"]"+";\n");
					}
					else{
						++p;
						dottyOut.write("\"" + nodeIdent + "\"" + "[shape=box, label=\"" + nodeIdent + ": " + nodeName + " (TR:" + trigger + ")\\n(#" + line + ")\\n\"]"+";\n");
					}
				}
				else{
					if(nodeIdent.matches("(.*)C(.*)")){
						++s;	
						//logger.info("String Name: " + nodeName);
						dottyOut.write("\"" + nodeIdent + "\"" + "[shape=doubleoctagon, color=blue, label=\"" + nodeIdent + ": " + nodeName + "\\n(#" + line + ")\\n\"]"+";\n");
					}
					else{
						++v;
						inter = n.getAttribute().getValueAt("intermediate").toString();
						perst = n.getAttribute().getValueAt("persistent").toString();
						dottyOut.write("\"" + nodeIdent + "\"" + "[shape=oval, label=\"" + nodeIdent + ": " + nodeName + " (" + perst + ", " + inter + ")\\n(#" + line + ")\\n\"]"+";\n");
					}
				}
				
			}
		}
		// Merging
		else{
			while (en.hasNext()) {
				Node n = en.next();
				//logger.info(n.getAttribute().getValueAt("ident")+ "  " + n.getAttribute().getValueAt("name") + "   "
						//+ n.getAttribute().getValueAt("ref"));
				nodeIdent = n.getAttribute().getValueAt("ident").toString();
				nodeName = n.getAttribute().getValueAt("name").toString();
				String perst, inter;
				String sourceIdent, sourceName;
				String viewIdent, viewName, viewPerst, trigger;
				nodeName = nodeName.replace("\"", " ");
				nodeName = nodeName.replace("\'", " ");
				nodeName = nodeName.replaceAll("\n", " ").replaceAll("\r", " ");
				//logger.info(nodeName);
				line = n.getAttribute().getValueAt("line#").toString();
				if(n.getAttribute().getValueAt("endLine#")==null || (n.getAttribute().getValueAt("endLine#").toString().equals(n.getAttribute().getValueAt("line#").toString())))
					line = line;
				else
					line = line + " - " + n.getAttribute().getValueAt("endLine#");
				
				if(nodeIdent.matches("(.*)P(.*)")){
					trigger =  n.getAttribute().getValueAt("trigger").toString();
					if(nodeIdent.matches("(.*)S(.*)")){
						++sp;
						if(n.getAttribute().getValueAt("view_ident")!=null)
							viewIdent = n.getAttribute().getValueAt("view_ident").toString();
						else
							viewIdent = "n/a";
						
						if(n.getAttribute().getValueAt("view_name")!=null)
							viewName = n.getAttribute().getValueAt("view_name").toString();
						else
							viewName = "n/a";
						
						viewName = viewName.replace("\"", " ");
						viewName = viewName.replace("\'", " ");
						viewName = viewName.replaceAll("[\n]", " ").replaceAll("\r", " ");
												
						if(n.getAttribute().getValueAt("view_persistent")!=null)
							viewPerst = n.getAttribute().getValueAt("view_persistent").toString();
						else
							viewPerst = "n/a";
						
						if(n.getAttribute().getValueAt("source_ident")!=null)
							sourceIdent = n.getAttribute().getValueAt("source_ident").toString();
						else
							sourceIdent = "n/a";
						
						if(n.getAttribute().getValueAt("source_name")!=null)
							sourceName = n.getAttribute().getValueAt("source_name").toString();
						else
							sourceName = "n/a";
						
						//sourceName = n.getAttribute().getValueAt("source_name").toString();
						sourceName = sourceName.replace("\"", " ");
						sourceName = sourceName.replace("\'", " ");
						sourceName = sourceName.replaceAll("[\n]", " ").replaceAll("\r", " ");
						
						
						
						if(viewPerst.equals("true")!=true || nodeName.equals("=") || nodeName.matches("(.*)_casting"))
							dottyOut.write("\"" + nodeIdent + "\"" + "[shape=hexagon, color=blue, label=\"" + nodeIdent  + ": " + nodeName + " (TR:" + trigger + ")\\n(ConstInfo:" + sourceIdent+ ":" + sourceName + ")" +"\\n(ViewInfo:" + viewIdent+ ":" + viewName + "-" + viewPerst + ")" +"\\n(#" + line + ")\\n\"]"+";\n");
						else
							dottyOut.write("\"" + nodeIdent + "\"" + "[style=\"filled\", fillcolor=\"yellow\", shape=hexagon, label=\"" + nodeIdent + ": " + nodeName + " (TR:" + trigger + ")\\n(ConstInfo:" + sourceIdent+ ":" + sourceName + ")"+ "\\n(ViewInfo:" + viewIdent+ ":" + viewName + "-" + viewPerst + ")" + "\\n(#" + line + ")\\n\"]"+";\n");
					}
					else{
						++p;
						if(n.getAttribute().getValueAt("view_ident")!=null)
							viewIdent = n.getAttribute().getValueAt("view_ident").toString();
						else
							viewIdent = "n/a";
						
						if(n.getAttribute().getValueAt("view_name")!=null)
							viewName = n.getAttribute().getValueAt("view_name").toString();
						else
							viewName = "n/a";
						
						viewName = viewName.replace("\"", " ");
						viewName = viewName.replace("\'", " ");
						viewName = viewName.replaceAll("[\n]", " ").replaceAll("\r", " ");
						
						if(n.getAttribute().getValueAt("view_persistent")!=null)
							viewPerst = n.getAttribute().getValueAt("view_persistent").toString();
						else
							viewPerst = "n/a";
						
						if(n.getAttribute().getValueAt("source_idents")!=null)
							sourceIdent = n.getAttribute().getValueAt("source_idents").toString();
						else
							sourceIdent = "n/a";
						
						if(n.getAttribute().getValueAt("source_names")!=null)
							sourceName = n.getAttribute().getValueAt("source_names").toString();
						else
							sourceName = "n/a";
						
						//sourceName = n.getAttribute().getValueAt("source_name").toString();
						sourceName = sourceName.replace("\"", " ");
						sourceName = sourceName.replace("\'", " ");
						sourceName = sourceName.replaceAll("[\n]", " ").replaceAll("\r", " ");
						
						
						if(n.getAttribute().getValueAt("producesOutput")!=null){
							if(n.getAttribute().getValueAt("producesOutput").toString().equals("true")){
								dottyOut.write("\"" + nodeIdent + "\"" + "[style=\"filled\", fillcolor=\"yellow\", shape=box3d, label=\"" + nodeIdent + ": " + nodeName + " (TR:" + trigger + ")\\n(ConstInfo:" + sourceIdent+ ":" + sourceName + ")" + "\\n(ViewInfo:" + viewIdent+ ":" + viewName + "-" + viewPerst + ")" + "\\n(#" + line + ")\\n\"]"+";\n");
							}
							else
								dottyOut.write("\"" + nodeIdent + "\"" + "[shape=box, label=\"" + nodeIdent + ": " + nodeName + " (TR:" + trigger + ")\\n(ConstInfo:" + sourceIdent+ ":" + sourceName + ")" + "\\n(ViewInfo:" + viewIdent+ ":" + viewName + "-" + viewPerst + ")" + "\\n(#" + line + ")\\n\"]"+";\n");
						}
						else{
							//outputProcess = "false";
							dottyOut.write("\"" + nodeIdent + "\"" + "[shape=box, label=\"" + nodeIdent + ": " + nodeName + " (TR:" + trigger + ")\\n(ConstInfo:" + sourceIdent+ ":" + sourceName + ")" + "\\n(ViewInfo:" + viewIdent+ ":" + viewName + "-" + viewPerst + ")" + "\\n(#" + line + ")\\n\"]"+";\n");
						}
						//dottyOut.write("\"" + nodeIdent + "\"" + "[shape=box, label=\"" + nodeIdent + ": " + nodeName +"\\n(ViewInfo:" + viewIdent+ "," + viewName + "," + viewPerst + ")" + "\\n(#" + line + ")\\n\"]");
					}
				}
				else{
					if(nodeIdent.matches("(.*)C(.*)")){
						++s;
						dottyOut.write("\"" + nodeIdent + "\"" + "[shape=doubleoctagon, color=blue, label=\"" + nodeIdent + ": " + nodeName + "\\n(#" + line + ")\\n\"]"+";\n");
					}
					else{
						++v;
						inter = n.getAttribute().getValueAt("intermediate").toString();
						perst = n.getAttribute().getValueAt("persistent").toString();
						dottyOut.write("\"" + nodeIdent + "\"" + "[shape=oval, label=\"" + nodeIdent + ": " + nodeName + " (" + perst + "- " + inter + ")\\n(#" + line + ")\\n\"]"+";\n");
					}
				}
				
			}
		}
		System.out.println("=== === Node Statistics === ===");
		System.out.println("Number of Sources:\t\t" + s);
		System.out.println("Number of Source Processes:\t" + sp);
		System.out.println("Number of Processes:\t\t" + p);
		System.out.println("Number of Views:\t\t" + v);
	}
	
	public String getViewName(String processID){
		Node curNode = null;
		String viewName = null;
		Iterator<Node> nit = graphGrammar.getGraph().getNodes(nodeType_process).iterator();
		while(nit.hasNext()){
			curNode = nit.next();
			if(curNode.getAttribute().getValueAt("ident").toString().equals(processID)){
				viewName = curNode.getAttribute().getValueAt("view_name").toString();
				break;
			}
		}
		return viewName;
	}
	
	public void graTraEventOccurred(GraTraEvent e) {
		String ruleName = "";
		int msgGraTra = e.getMessage();
		if ((msgGraTra == GraTraEvent.INPUT_PARAMETER_NOT_SET)) {
		} else if ((msgGraTra == GraTraEvent.STEP_COMPLETED)) {
			ruleName = e.getMatch().getRule().getName();
			logger.info(ruleName + "  is applied");

			try {
				showGraph(graph, false);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

			logger.info("Save transformed graphGrammar");
			String fn = graphGrammar.getName() + "_trans.ggx";
			graphGrammar.save(fn);
			logger.info("Saved in  " + fn);

		} else if (msgGraTra == GraTraEvent.NO_COMPLETION) {
			ruleName = e.getMatch().getRule().getName();
			logger.info(ruleName + "  has no more completion");
		} else if (msgGraTra == GraTraEvent.MATCH_FAILED) {
			ruleName = e.getRule().getName();
			logger.info(ruleName + "  has no more completion");
		} else if (msgGraTra == GraTraEvent.CANNOT_TRANSFORM) {
			ruleName = e.getMatch().getRule().getName();
			logger.info(ruleName + "  cannot transform");
		} else if (msgGraTra == GraTraEvent.TRANSFORM_FINISHED) {
			logger.info("Transformation is finished");
		}
	}
	
	
	public void showGraph(Graph g, boolean isRewrite) throws IOException, InterruptedException {
		//logger.info("\nGraph: " + gragra.getGraph().getName() + " {");
		Iterator<?> e = g.getArcsSet().iterator();
		String sourceNode;
		String targetNode;
		List process = new ArrayList<String>();
		if(isRewrite==false){
			while (e.hasNext()) {
				Arc arc = (Arc) e.next();
				Node src = (Node) arc.getSource();
				Node trg = (Node) arc.getTarget();
				sourceNode = src.getAttribute().getValueAt("ident").toString();
				targetNode = trg.getAttribute().getValueAt("ident").toString();
				
				dottyOut.write("\"" + sourceNode + "\"" + " -> " + "\"" + targetNode + "\" [arrowhead=\"vee\",arrowtail=\"none\"];\n");
			
			}
		}
		else{
			while (e.hasNext()) {
				Arc arc = (Arc) e.next();
				Node src = (Node) arc.getSource();
				Node trg = (Node) arc.getTarget();
				sourceNode = src.getAttribute().getValueAt("ident").toString();
				targetNode = trg.getAttribute().getValueAt("ident").toString();
				//Extra part
				if(src.getType().getName().equals("Source") && (trg.getType().getName().equals("Source Process"))){
					attrInstance = trg.getAttribute();
					vt = (ValueTuple) attrInstance;
					
					// Set values of attributes
				
						vm = (ValueMember) vt.getMemberAt("source_ident");
						vm.setExprAsObject(src.getAttribute().getValueAt("ident"));
						vm.checkValidity();
						
						vm = (ValueMember) vt.getMemberAt("source_name");
						vm.setExprAsObject(src.getAttribute().getValueAt("name"));
						vm.checkValidity();
					
					
				}
				else if(src.getType().getName().equals("Source") && (trg.getType().getName().equals("Process"))){
			
					Iterator<String> it = process.iterator();
					boolean processFound = false;
					while(it.hasNext()){
						String current = it.next();
						if(trg.getAttribute().getValueAt("ident").toString().equals(current)){
							processFound = true;
							break;
						}
					}
					if(processFound==false)
						process.add(trg.getAttribute().getValueAt("ident").toString());
					
					attrInstance = trg.getAttribute();
					vt = (ValueTuple) attrInstance;
					
					// Set values of attributes
					if(trg.getAttribute().getValueAt("source_idents")!=null && processFound==true){
						String old_id = trg.getAttribute().getValueAt("source_idents").toString();
						String old_name = trg.getAttribute().getValueAt("source_names").toString();
						
						String new_id = old_id + "|" + src.getAttribute().getValueAt("ident");
						String new_name = old_name + "|" + src.getAttribute().getValueAt("name");
						
						vm = (ValueMember) vt.getMemberAt("source_idents");
						vm.setExprAsObject(new_id);
						vm.checkValidity();
						
						vm = (ValueMember) vt.getMemberAt("source_names");
						vm.setExprAsObject(new_name);
						vm.checkValidity();
					
					}
					else{
						vm = (ValueMember) vt.getMemberAt("source_idents");
						vm.setExprAsObject(src.getAttribute().getValueAt("ident"));
						vm.checkValidity();
						
						vm = (ValueMember) vt.getMemberAt("source_names");
						vm.setExprAsObject(src.getAttribute().getValueAt("name"));
						vm.checkValidity();
					}
					
				}
				else if(src.getType().getName().equals("Process") && (trg.getType().getName().equals("View"))){
					attrInstance = src.getAttribute();
					vt = (ValueTuple) attrInstance;
					
					// Set values of attributes
					vm = (ValueMember) vt.getMemberAt("view_ident");
					vm.setExprAsObject(trg.getAttribute().getValueAt("ident"));
					vm.checkValidity();
					
					vm = (ValueMember) vt.getMemberAt("view_name");
					vm.setExprAsObject(trg.getAttribute().getValueAt("name"));
					vm.checkValidity();
					
					vm = (ValueMember) vt.getMemberAt("view_persistent");
					vm.setExprAsObject(trg.getAttribute().getValueAt("persistent"));
					vm.checkValidity();
				}
				else if(src.getType().getName().equals("Source Process") && (trg.getType().getName().equals("View"))){
					attrInstance = src.getAttribute();
					vt = (ValueTuple) attrInstance;
					
					// Set values of attributes
					vm = (ValueMember) vt.getMemberAt("view_ident");
					vm.setExprAsObject(trg.getAttribute().getValueAt("ident"));
					vm.checkValidity();
					
					vm = (ValueMember) vt.getMemberAt("view_name");
					vm.setExprAsObject(trg.getAttribute().getValueAt("name"));
					vm.checkValidity();
					
					vm = (ValueMember) vt.getMemberAt("view_persistent");
					vm.setExprAsObject(trg.getAttribute().getValueAt("persistent"));
					vm.checkValidity();
				}
				else {
					
				}
				
				
				dottyOut.write("\"" + sourceNode + "\"" + " -> " + "\"" + targetNode + "\" [arrowhead=\"vee\",arrowtail=\"none\"];\n");
			
			}
		}
		dottyOut.write("}");
		dottyOut.close();
		
		//closeDottyFile();
	}
	
	public void prepareDottyFile(String a) throws IOException{
		Date date = new Date();
		Long timestamp = date.getTime();
		
		String nodeName;
		String nodeLabel;
		
		StringBuffer processConnection = new StringBuffer();
		StringBuffer tupleConnection = new StringBuffer();
		
		processConnection.setLength(0);
		tupleConnection.setLength(0);
		
		dottyFileName = "provenance_graph_" + testFileName.toString() + a + ".dot" ;
		
		File file = new File(dottyFileName);
		if(file.exists()){
			file.delete();
		}
		
		
		dottyStream = new FileWriter(dottyFileName, true);
		
		dottyOut = new BufferedWriter(dottyStream);
		
		//Write Header in the file
		dottyOut.write("## - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
		dottyOut.write("## Date: " + date.getDate() + "-" + (date.getMonth()+1) + "-" + (date.getYear()+1900) + "\n");
		dottyOut.write("## Time: " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + "\n");
		dottyOut.write("##\n");
		dottyOut.write("## This is the coarse-grained Provenance graph \n");
		dottyOut.write("## - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
		
		// main part
		dottyOut.write("digraph ProvenanceGraph {\n");
		dottyOut.write("size=\"120\";\n");
		dottyOut.write("rankdir=TB;\n");
		dottyOut.write("graph [dpi = 200, fontsize = 30, label = \"Provenance Graph (" + testFileName + "_" + a + ")\"];\n"); 
		dottyOut.write("node [fontsize=30, width=\".3\", height=\".2\", margin=.1];\n");
	}
	public class StreamGobbler extends Thread
	{
	    InputStream is;
	    String type;
	    
	    StreamGobbler(InputStream is, String type)
	    {
	        this.is = is;
	        this.type = type;
	    }
	    
	    public void run()
	    {
	        try
	        {
	            InputStreamReader isr = new InputStreamReader(is);
	            BufferedReader br = new BufferedReader(isr);
	            String line=null;
	            while ( (line = br.readLine()) != null)
	                logger.info(type + ">" + line);    
	            } catch (IOException ioe)
	              {
	                ioe.printStackTrace();  
	              }
	    }
	}
	
	public void closeDottyFile() throws IOException, InterruptedException{
		
		
		String outputFileName;
		
		outputFileName = dottyFileName.split(".dot")[0] + ".jpg";
		logger.info(outputFileName);
		
		String cmd = "cmd.exe /C dot -Tjpeg -o " + outputFileName + " " + dottyFileName;
        logger.info(cmd);
		
        /*
        File file = new File("auto.bat");
		if(file.exists()){
			logger.info("auto.bat file deleted!!!");
			file.delete();
		}
		
        FileWriter fstream1 = new FileWriter("auto.bat");
        
		
		BufferedWriter out1 = new BufferedWriter(fstream1);
		
		out1.write(cmd);
		out1.close();
		*/
		//fstream1 = null;
        
        try{
        	Runtime rt = Runtime.getRuntime();
		
        	//Process p = rt.exec("cmd /c auto.bat");
        	Process p = rt.exec(cmd);
        	//p.waitFor();
        	
        	// any error message?
            StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");            
                    
            // any output?
            StreamGobbler outputGobbler = new StreamGobbler(p.getInputStream(), "OUTPUT");
        	
            // kick them off
            errorGobbler.start();
            outputGobbler.start();
            
            // any error???
            int exitVal = p.waitFor();
            logger.info("ExitValue: " + exitVal);  
            
            logger.info("Dotty File created successfully.");
        } catch (Throwable t){
        	t.printStackTrace();
        }
		
		/********* Showing Provenance Graph *********/
		//showProvenanceGraph(outputFileName);
		
		cmd = "cmd.exe /C " + outputFileName;
		try{
        	Runtime rt = Runtime.getRuntime();
		
        	//Process p = rt.exec("cmd /c auto.bat");
        	Process p = rt.exec(cmd);
        	//p.waitFor();
        	
        	// any error message?
            StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");            
                    
            // any output?
            StreamGobbler outputGobbler = new StreamGobbler(p.getInputStream(), "OUTPUT");
        	
            // kick them off
            errorGobbler.start();
            outputGobbler.start();
            
            // any error???
            //int exitVal = p.waitFor();
            //logger.info("ExitValue: " + exitVal);  
            
            logger.info("Image created successfully.");
        } catch (Throwable t){
        	t.printStackTrace();
        }
		
        //Process p1 = rt.exec(openGraphCmd);
	
        //p1.waitFor();
	}
	
	public void executeBase() throws IOException, InterruptedException{
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prepareDottyFile("_base");
		writeDottyFile(graphGrammar.getGraph(), true);
		showGraph(graphGrammar.getGraph(), false);

	}
	
	public void executeGrouping() throws IOException, InterruptedException{
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "grouping" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prepareDottyFile("_grouping");
		writeDottyFile(graphGrammar.getGraph(), true);
		showGraph(graphGrammar.getGraph(), false);

	}
	
	public void executeDiscarding() throws IOException, InterruptedException{
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "discarding" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prepareDottyFile("_discarding");
		writeDottyFile(graphGrammar.getGraph(), true);
		showGraph(graphGrammar.getGraph(), false);

	}
	
	public void executeGroupingDiscarding() throws IOException, InterruptedException{
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "groupingDiscarding" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prepareDottyFile("_groupingDiscarding");
		writeDottyFile(graphGrammar.getGraph(), true);
		showGraph(graphGrammar.getGraph(), false);

	}
	
	public void executeSlicing1(String pid) throws IOException, InterruptedException{
		
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_1" + ".ggx";
		graphGrammar.save(fn);
		
		
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_1" + ".ggx";
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		createMergingRule11(graphGrammar.getGraph(), pid);
		
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_1" + ".ggx";
		graphGrammar.save(fn);
		
		prepareDottyFile("_slicing_1");
		writeDottyFile(graphGrammar.getGraph(), true);
		showGraph(graphGrammar.getGraph(), false);
		
		
	}
	
	public void executeSlicing2(String pid) throws IOException, InterruptedException{
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_2" + ".ggx";
		graphGrammar.save(fn);
		
		
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_2" + ".ggx";
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createMergingRule12(graphGrammar.getGraph(), pid);
		
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_2" + ".ggx";
		graphGrammar.save(fn);
		
		prepareDottyFile("_slicing_2");
		writeDottyFile(graphGrammar.getGraph(), true);
		showGraph(graphGrammar.getGraph(), false);
		
		
	}
	
	
	public void prepareCustomizeGraphs() throws IOException, InterruptedException{
		
		
		
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//baseGraph = graphGrammar.getGraph().graphcopy();
		
		createMergingRule7(graphGrammar.getGraph());
		discardingGraph = graphGrammar.getGraph().graphcopy();
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "discarding" +".ggx";
		graphGrammar.save(fn);
		
		//prepareDottyFile("_Discarding");
		//writeDottyFile(graphGrammar.getGraph(), true);
		//showGraph(graphGrammar.getGraph(), false);
		
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		createMergingRule8A(graphGrammar.getGraph());
		combiningGraph = graphGrammar.getGraph().graphcopy();
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "groupingDiscarding" +".ggx";
		graphGrammar.save(fn);
		
		//prepareDottyFile("_groupingDiscarding");
		//writeDottyFile(graphGrammar.getGraph(), true);
		//showGraph(graphGrammar.getGraph(), false);
		
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createMergingRule8A(graphGrammar.getGraph());
		discardingGraph=graphGrammar.getGraph().graphcopy();
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "grouping" + ".ggx";
		graphGrammar.save(fn);
		
		//prepareDottyFile("_Grouping");
		//writeDottyFile(graphGrammar.getGraph(), true);
		//showGraph(graphGrammar.getGraph(), false);
		
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_1" + ".ggx";
		graphGrammar.save(fn);
		//createMergingRule11()
		
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "slicing_2" + ".ggx";
		graphGrammar.save(fn);
	}

	public Graph getBaseGraph() {
		// TODO Auto-generated method stub
		String fn = graphGrammar.getName() + "_" + testFileName + "_transformed_" + "base" + ".ggx";
		
		try {
			graphGrammar.load(fn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return graphGrammar.getGraph();
	}
	
	
}