package pythonProvenance.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MethodInformation {

	/**
	 * @param args
	 */
	DefaultComboBoxModel ratio = new DefaultComboBoxModel();
	DefaultComboBoxModel conditionRead = new DefaultComboBoxModel();
	DefaultComboBoxModel conditionWrite = new DefaultComboBoxModel();
	JOptionPane op;
	
	private String inputOutputRatio;
	private String readFiles;
	private String writeFiles;
	
	public MethodInformation(String methodName){
		ratio.addElement("OneToOne");
		ratio.addElement("ManyToOne");
		ratio.addElement("ManyToMany");
		
		conditionRead.addElement("true");
		conditionRead.addElement("false");
		
		conditionWrite.addElement("true");
		conditionWrite.addElement("false");
		
		
		
		
		String header = "Enter Information:- "+ methodName;
		
		JComboBox cmbratio = new JComboBox(ratio);
		JComboBox cmbconditionRead = new JComboBox(conditionRead);
		JComboBox cmbconditionWrite = new JComboBox(conditionWrite);
		
		cmbratio.setSelectedIndex(0);
		cmbconditionRead.setSelectedIndex(1);
		cmbconditionWrite.setSelectedIndex(1);
		
		Object [] msg = {
				header,
				"Input-output Ratio", cmbratio,
				"Read Files", cmbconditionRead,
				"Write Files", cmbconditionWrite				
		};
		
		JOptionPane op = new JOptionPane(
				msg,
				JOptionPane.QUESTION_MESSAGE,
				JOptionPane.OK_CANCEL_OPTION,
				null,
				null);
	 
		JDialog dialog = op.createDialog(null, "Method Information");
		dialog.setVisible(true);
	 
		int result = JOptionPane.OK_OPTION;
		
		try{
			result = ((Integer)op.getValue()).intValue();
		}
		
		catch(Exception uninitializedValue){}
	 
		if(result == JOptionPane.OK_OPTION)
		{
			this.inputOutputRatio = ratio.getSelectedItem().toString();
			this.readFiles = conditionRead.getSelectedItem().toString();
			this.writeFiles = conditionWrite.getSelectedItem().toString();
		}
		
		else{
			System.exit(0);
		}   		
	}
	
	
	public String getInputOutputRatio(){
		return this.inputOutputRatio;
	}
	
	public String getReadFiles(){
		return this.readFiles;
	}
	
	public String getWriteFiles(){
		return this.writeFiles;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodInformation m = new MethodInformation("read");
		
		System.out.println(m.inputOutputRatio + " " + m.readFiles + " " + m.writeFiles);
		
	}

}
