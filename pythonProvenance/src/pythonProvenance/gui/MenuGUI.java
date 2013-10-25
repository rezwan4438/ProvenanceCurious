package pythonProvenance.gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MenuGUI {

	/**
	 * @param args
	 */
	
	private String choice;
	JOptionPane op;
	DefaultComboBoxModel choicesList = new DefaultComboBoxModel();
	
	
	public MenuGUI(String a){
		
		String header = new String();
		
		/*
			header = "(1) Select Another Script\n(2) Terminate the Program\n";
			choicesList.addElement("1");
			choicesList.addElement("2");
	    */
		header = "(1) Select Another Script\n(2) Terminate the Program\n(5) Request Provenance";
		choicesList.addElement("1");
		choicesList.addElement("2");
		choicesList.addElement("5");
		
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
		MenuGUI m = new MenuGUI(null);
		System.out.println(m.getChoice());
		
	}

}
