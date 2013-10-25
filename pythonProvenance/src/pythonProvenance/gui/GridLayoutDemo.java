package pythonProvenance.gui;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class GridLayoutDemo {
    public final static boolean RIGHT_TO_LEFT = false;

    public ArrayList<JButton> buttons = new ArrayList<JButton>();
    
    public void addComponentsToPane(Container contentPane) {
        if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(
                ComponentOrientation.RIGHT_TO_LEFT);
        }
//        Any number of rows and 2 columns
        contentPane.setLayout(new GridLayout(0,720));
        
        for(int row = 0; row < 360; row ++){
	        for(int col = 0 ; col < 720; col++){
	        	JButton newButton = new JButton();
	        	newButton.setSize(1, 1);
	        	newButton.setBorderPainted(false);
	        	newButton.setBackground(Color.BLUE);
	        	contentPane.add(newButton);
	            buttons.add(newButton);
	        }
        }
    }
        
        
    

    public void createAndShowGUI() {
        //JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("GridLayout Source Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane and components in GridLayout
        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutDemo demo = new GridLayoutDemo();
        demo.createAndShowGUI();
    }
}
