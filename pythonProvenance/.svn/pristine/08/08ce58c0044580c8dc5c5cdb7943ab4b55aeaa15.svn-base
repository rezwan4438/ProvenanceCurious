package pythonProvenance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import pythonProvenance.commands.ClassDefinitionCommand;
import pythonProvenance.commands.Command;
import pythonProvenance.commands.ImportEquivalent;
import pythonProvenance.commands.MethodCommand;
import pythonProvenance.graphs.ProvenanceGraph;

public class PythonProvenanceCmd {
	public PythonProvenanceCmd(){
	}

	public String start(String fullpath){
		try {
			ANTLRFileStream h1 = new ANTLRFileStream(fullpath);
			PythonProvenanceLexer lex = new PythonProvenanceLexer(h1);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			PythonProvenanceParser parser = new PythonProvenanceParser(tokens);
			// starting rule of the grammar, thus start of the parser
			PythonProvenanceParser.file_input_return r = parser.file_input();
			CommonTree ast = null;
			if(r!=null){
				ast = (CommonTree) r.getTree();
			}

			if(ast==null) return "Th selected script seems to be empty.";
			/********** WALKER ***********/
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
			nodes.setTokenStream(tokens);
			PythonProvenanceTree walker = new PythonProvenanceTree(nodes);
			walker.file_input();
			/******* walker complete *****/

			ArrayList<Command> c = (ArrayList<Command>) walker.getClassList();
			HashSet<String> classList = new HashSet<String>();
			Iterator<Command> classit = c.iterator();
			while(classit.hasNext()){
				ClassDefinitionCommand curCmd = (ClassDefinitionCommand) classit.next();
				classList.add(curCmd.getName());
			}

			ArrayList<ImportEquivalent> p = (ArrayList<ImportEquivalent>) walker.getImportPairsList();
			HashSet<String> importList = new HashSet<String>();
			if(p.size()>0){
				Iterator<ImportEquivalent> pit = p.iterator(); 
				while(pit.hasNext()){
					ImportEquivalent curIm = pit.next();
					importList.add(curIm.getOp2());
				}
			}

			Iterator<ImportEquivalent> pt = p.iterator(); 
			Command cmd;
			boolean foundClass = false;
			boolean foundImport = false;
			String fPart = "";
			String lPart = "";
			ArrayList<Command> b = (ArrayList<Command>) walker.getCommandList();
			Iterator<Command> it = b.iterator(); 
			Set<String> uniqueMethods = new HashSet<String>();
			while(it.hasNext()){
				cmd = it.next();
				/**** Write method command into a file ****/
				if(cmd!=null)
					if(cmd instanceof MethodCommand){
						if(((MethodCommand)cmd).getName().contains(".")){
							fPart = ((MethodCommand)cmd).getName().split("[.]")[0];
							lPart = ((MethodCommand)cmd).getName().split("[.]")[1];
						} else{
							fPart = ((MethodCommand)cmd).getName();
							lPart = ((MethodCommand)cmd).getName();
						}
						foundClass = classList.contains(((MethodCommand)cmd).getName());
						foundImport = importList.contains(fPart);
						if(foundClass == false && foundImport == true){
							uniqueMethods.add(((MethodCommand)(cmd)).getName());
						}
						else if(foundClass == false && foundImport == false){
							uniqueMethods.add(lPart);
						}
						else{
							System.out.println("Not including ... ");
						}
					}
			}
			File file2=new File("methods_desc.txt");
			if(file2.exists()==false){
				try{
					FileWriter fstream = new FileWriter( "methods_desc.txt", true );
					BufferedWriter out = new BufferedWriter(fstream);		
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
			Set storedMethods = new HashSet<String>();
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


			BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));

			boolean present = false;
			//				if(storedMethods.size()>0){
			while(a.hasNext()){
				uniqueStr = a.next();
				present = storedMethods.contains(uniqueStr);
				//						Iterator<String> s = storedMethods.iterator();
				//						while(s.hasNext()){
				//							//present = false;
				//							storedStr = s.next();
				//							if(uniqueStr.equals(storedStr)){
				//								present = true;
				//								System.out.println(uniqueStr + " : Methods description already entered!");
				//								break;
				//							}
				//							else
				//								continue;
				//						}
				//						
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
			//				} else {
			//					while(a.hasNext()){
			//						uniqueStr = a.next();					
			//						System.out.println("New Method Found \"" + uniqueStr + " \"...  Enter information: ");
			//						System.out.println("Pattern:(#in/out mapping, #source(yes/no), #writes output(yes/no)");
			//						try {
			//							line = brIn.readLine();
			//						} catch (IOException ioe) {
			//							System.err.println(ioe.getMessage());
			//						}
			//						input.append(uniqueStr+","+line.toString());
			//						input.append("\n");
			//					}
			//				} 



			// Open a file to write methods properties
			File file = new File("methods_desc.txt");
			BufferedWriter out1=null;
			try{
				FileWriter fstream1 = new FileWriter( "methods_desc.txt", true );
				out1 = new BufferedWriter(fstream1);			
			} catch (Exception e){//Catch exception if any
				System.err.println("File Open Error: " + e.getMessage());
			}
			out1.write(input.toString());
			out1.close();

			/***** Create a new graph ********/
			//ProvenanceGraph graph = null;
			try {
				ProvenanceGraph graph = new ProvenanceGraph(fullpath,b,p,c);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
