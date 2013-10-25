package pythonProvenance.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class PanelWithBackground {
	
	public PanelWithBackground(){}
	
	public static void createAndShowGUI(){
		
		ImagePanel panel = new ImagePanel(new ImageIcon("map_edited.gif").getImage());
	
	    JFrame frame = new JFrame();
	    frame.setTitle("World Map");
	    
	    frame.getContentPane().add(panel);
	    
	    frame.pack();
	    frame.setVisible(true);
	}

	public static void main(String[] args) {
	       
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

	}
}

class ImagePanel extends JPanel implements MouseListener, MouseMotionListener{

	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
    
		addMouseListener(this);
		addMouseMotionListener(this);
    
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("X: " + this.getWidth());
		//System.out.println("Y: " + this.getHeight());
		//System.out.println("X: " + e.getX());
		//System.out.println("Y: " + e.getY());
		int convX = Math.round((e.getX()*720)/this.getWidth());
		int convY = Math.round(((e.getY())*360)/this.getHeight());
		//System.out.println("Converted X: " + convX);
		//System.out.println("Converted Y: " + convY);
		Object [] message = { "You have selected Cell (" + convX + "," + convY + ")." +
				"\nDo you want to infer Fine-grained Provenance for this cell?"
		};
		String title = "Confirmation";
		int result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(result==JOptionPane.YES_OPTION){
			// execute provenance inference phase
			JOptionPane.showMessageDialog(null, "Executing Inference");
			
		}
		else{
			
		}
}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int convX = Math.round((e.getX()*720)/this.getWidth());
		int convY = Math.round(((e.getY())*360)/this.getHeight());
		//System.out.println("Converted X: " + convX);
		//System.out.println("Converted Y: " + convY);
		this.setToolTipText(convX + "," + convY);
		this.repaint();
	}
}




