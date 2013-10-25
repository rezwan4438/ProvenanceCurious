package pythonProvenance.gui;


import java.util.logging.Logger;

import javax.swing.JFileChooser;

import pythonProvenance.PythonProvenance;

public class fileChooser{
	
	public static final Logger logger = Logger.getLogger(PythonProvenance.class.getName());
	private String path;
	private String name;
	
	public fileChooser(String loc){
		
		JFileChooser fc = new JFileChooser(loc);
		int returnVal = fc.showDialog(null, "Select Database");
		if(returnVal == fc.APPROVE_OPTION){
			logger.info("Path " + fc.getSelectedFile().getAbsolutePath());
			this.path = fc.getSelectedFile().getAbsolutePath();
			this.name = fc.getSelectedFile().getName();
		}
		else{
			this.path = null;
			this.name = null;
			logger.info("Choose again");
		}
		
	}
	
	public String getPath(){
		return this.path;
	}
	
	public String getName(){
		return this.name;
	}
	
	public static void main(String args[]){
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showDialog(null, "Select Database");
		if(returnVal == fc.APPROVE_OPTION){
			logger.info("Path " + fc.getSelectedFile().getAbsolutePath());
			
		}
		else{
			logger.info("Choose again");
		}
		
	}


	
	
}
