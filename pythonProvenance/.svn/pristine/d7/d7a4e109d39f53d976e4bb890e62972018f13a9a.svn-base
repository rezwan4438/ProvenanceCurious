package pythonProvenance.gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class SubMenuGUI {

	/**
	 * @param args
	 */
	
	private String choice;
	JOptionPane op;
	DefaultComboBoxModel choicesList = new DefaultComboBoxModel();
	
	
	public SubMenuGUI(){
		
		String header = new String();
		
		
			header = "(a) Grouping Process\n" +
					"(b) Discarding Constants\n" +
					"(c) Combining a & b\n" + 
					"(d) Slicing Process (radius=1)\n"+
					"(e) Slicing Process (radius=2)\n"+
					"(f) Show Workflow Provenance Graph\n";
			
			choicesList.addElement("a");
			choicesList.addElement("b");
			choicesList.addElement("c");
			choicesList.addElement("d");
			choicesList.addElement("e");
			choicesList.addElement("f");
		
		
		//String header = "(1) Request Fine-grained Provenance\n(2) See Customized Provenance Graphs\n(3)Terminate the program";
		JComboBox choices = new JComboBox(choicesList);
		
		Object [] msg = {
				header,
				"Choose one of the options", choices				
		};
		
		op = new JOptionPane(
				msg,
				JOptionPane.QUESTION_MESSAGE,
				JOptionPane.OK_CANCEL_OPTION,
				null,
				null);
		
		JDialog dialog = op.createDialog(null, "Menu");
		dialog.setVisible(true);
	 
		int result = JOptionPane.OK_OPTION;
		
		try{
			result = ((Integer)op.getValue()).intValue();
		}
		
		catch(Exception uninitializedValue){}
	 
		if(result == JOptionPane.OK_OPTION)
		{
			this.choice = choices.getSelectedItem().toString();
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Quiting Program", "Quiting", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}   		
	}
	
	public String getChoice(){
		return this.choice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubMenuGUI m = new SubMenuGUI();
		System.out.println(m.getChoice());
		
	}

}
