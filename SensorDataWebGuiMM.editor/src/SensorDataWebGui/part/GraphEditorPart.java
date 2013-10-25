package SensorDataWebGui.part;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import agg.xt_basis.Arc;



import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.SensorDataWebGuiPackage;
import SensorDataWebGui.StandardSensorDataWeb;
import SensorDataWebGui.presentation.SensorDataWebGuiEditor;
import SensorDataWebGui.util.AbstractPEContentProvider;

import pythonProvenance.inference.ProvenanceInference;
import pythonProvenance.inference.ProvenanceTuple;

public class GraphEditorPart extends SensorDataWebGuiEditorPart {

	protected CheckboxTableViewer viewer;
	
	public List<AbstractPE> persistents;
	public List<SensorDataWebGui.Arc> arcs;
	public String databaseLocation;
	public String viewName;
	public Integer PRyear;
	public Integer PRmonth;
	public String mapName;
	
	public List<ProvenanceTuple> pTuples;
	
	

	//final Resource r = domain.getResourceSet().createResource(URI.createURI("file://foo.extlibrary"));

// We execute this command on the command stack because otherwise, we will not
//  have write permissions on the editing domain.


	
	public GraphEditorPart(SensorDataWebGuiEditor parent) {
		super(parent);
	}

	
	
	
	
	public void executeInference(int x, int y){
		
		ProvenanceInference inf = new ProvenanceInference();
		try {
			System.out.println("Database Location: " + databaseLocation);
			pTuples = inf.start(persistents, arcs, viewName, databaseLocation, PRyear, PRmonth, x, y);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Provenance Execution Done");
		
	}
	
	public void printPTuples(){
		for(ProvenanceTuple pt: this.pTuples){
			System.out.print(pt.toString());
		}
	}
	public void setProvenanceData(){
		
		
		  
		  //System.out.println("Command Stack Done: " + apes.get(0).getName());
		  
		  
		System.out.println("Provenance Set started");
		System.out.println("Provennace Size: " + this.pTuples.size());
		//printPTuples();
		System.out.println("PEs Size: " + this.persistents.size());
		
		
		
		/*
		
		for(ProvenanceTuple pt : this.pTuples){
			String val = pt.getRowID().toString() + "," + pt.getPosX().toString() + "," + pt.getPosY().toString() + "," + pt.getValue();
			System.out.println("pTuple: " + val);
			for(final AbstractPE a : this.persistents){
				String pid = a.getName().split(":")[0];
				String view = a.getView();
				
				if(pt.getProcessID().equals(pid)){
					System.out.println("Process ID: " + pid);
					final String newView = view + "--> value (" + val + ")";
					System.out.println("New View: " + newView);
					
					
					//a.eSetDeliver(false);
					//a.setViewPassword(newView);
					
					System.out.println("New View set");
					break;
				}
			}
		}
		
		System.out.println("Provenance Set done");
		
		TransactionalEditingDomain domain = (TransactionalEditingDomain) getEditingDomain();

		EList<EObject> contentList = domain.getResourceSet().getResources().get(0).getContents();
	    StandardSensorDataWeb ssdw = (StandardSensorDataWeb)contentList.get(0);
	    EList<AbstractPE> apes = ssdw.getContainsPEs();
	    System.out.println("Description: "+apes.get(0).getDescription());
	    
		CommandStack stack = domain.getCommandStack();
		this.doSave(null);

		// execute some change, just as in any EMF.Edit application
		Command cmd = domain.createCommand(
		       SetCommand.class,
		       new CommandParameter(apes.get(0), SensorDataWebGuiPackage.Literals.ABSTRACT_PE__DESCRIPTION, "test"));
		stack.execute(cmd);
		*/
	}
	
	public void setVariables(){
		this.pTuples = new ArrayList<ProvenanceTuple>();
		this.persistents = SensorDataWebGui.presentation.SensorDataWebGuiEditor.PEList;
		this.arcs = SensorDataWebGui.presentation.SensorDataWebGuiEditor.ArcList;
		this.PRyear = SensorDataWebGui.presentation.SensorDataWebGuiEditor.PRyear;
		this.PRmonth = SensorDataWebGui.presentation.SensorDataWebGuiEditor.PRmonth;
		this.databaseLocation = SensorDataWebGui.presentation.SensorDataWebGuiEditor.databaseLocation;
		this.viewName = SensorDataWebGui.presentation.SensorDataWebGuiEditor.viewName;
		this.mapName = SensorDataWebGui.presentation.SensorDataWebGuiEditor.mapName;
		
	}
	
	public void printVariables(){
		System.out.println("Number of Persistent Process: " + this.persistents.size());
		for(AbstractPE a : this.persistents){
			System.out.println(a.getView());
		}
		System.out.println("Selected view: " + this.viewName);
		System.out.println("year: " + this.PRyear);
		System.out.println("month: " + this.PRmonth);
		System.out.println("Database: " + this.databaseLocation);
	}
	
	
	@Override
	public void createPartControl(final Composite parent) {
		
		
		  
		setVariables();
		
		printVariables();
		
		System.out.println("Drawing will start");
		
		Composite composite = new Composite(parent, SWT.NONE);

		final Image image = new Image(Display.getCurrent(),"map_edited.gif");
		//image.getImageData().getPixel(0, 0);		       
		           		
		final Canvas canvas = new Canvas(composite, SWT.NONE);
		canvas.setBackgroundImage(image);
		
		canvas.setBounds(0, 0, image.getImageData().width, image.getImageData().height);
		canvas.setSize(image.getImageData().width, image.getImageData().height);
		canvas.setVisible(true);
		
		System.out.println("Canvas set");
		           
		Label label = new Label(composite, SWT.NONE);
		label.setText("Please Double-Click to select a cell.");
		label.setBounds(0, image.getImageData().height + 100, 500, image.getImageData().height + 300);
		label.setVisible(true);
		           		
		System.out.println("Label set");
		
		 
		
		canvas.addMouseMoveListener(new MouseMoveListener(){
			@Override
			public void mouseMove(org.eclipse.swt.events.MouseEvent e) {
				int convX = Math.round((e.x*720)/image.getImageData().width);
			    int convY = Math.round(((e.y)*360)/image.getImageData().height);
			    //System.out.println("Converted X: " + convX);
			    //System.out.println("Converted Y: " + convY);
			           				
			    canvas.setToolTipText(convX + "," + convY);
			    canvas.redraw();
			}
		});
		           		
		           		
		canvas.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent e) {
				int convX = Math.round((e.x*720)/image.getImageData().width);
				int convY = Math.round(((e.y)*360)/image.getImageData().height);
				//System.out.println("Converted X: " + convX);
				//System.out.println("Converted Y: " + convY);
				Object [] message = { "You have selected Cell (" + convX + "," + convY + ")." +
						"\nDo you want to infer Fine-grained Provenance?"
				};
				String title = "Confirmation";
				int result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.YES_OPTION){
					// execute provenance inference phase
					//JOptionPane.showMessageDialog(null, "Executing Inference");      
					executeInference(convY, convX);
					//setProvenanceData();
					JOptionPane.showMessageDialog(null, "Finished Inference");  
					
					
				}
				else{
					           				
				}       			
			}

			@Override
			public void mouseDown(org.eclipse.swt.events.MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseUp(org.eclipse.swt.events.MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

		
		           			
		});
		           		
		           		/*
		           		Button fontButton = new Button(composite, SWT.NONE);
		           		//GridData gd = new GridData(GridData.BEGINNING);
		           		//gd.horizontalSpan = 2;
		           		//fontButton.setLayoutData(gd);
		           		fontButton.setText("Change Font...");
		           		fontButton.setBounds(x, y, width, height)
		           		
		           		

		           		fontButton.addSelectionListener(new SelectionAdapter() {
		           			public void widgetSelected(SelectionEvent event) {
		           				//setFont();
		           				System.out.println("hit the button");
		           			}
		           		});
		             
						*/
		
		

//		EList<EObject> contentList = editingDomain.getResourceSet().getResources().get(0).getContents();
//		StandardSensorDataWeb ssdw = (StandardSensorDataWeb)contentList.get(0);
//		EList<AbstractPE> apes = ssdw.getContainsPEs();
//		for(AbstractPE ape : apes){
//			if(ape instanceof Source){
//				Source s = (Source)ape;
//				System.out.println(s.getName());
//			} else{
//				ProcessingElement pe = (ProcessingElement) ape;
//				System.out.println(pe.getName());
//			}
//		}

	}

	@Override
	public void setFocus() {
		viewer.getTable().setFocus();
	}

	@Override
	public void setInput(Object input) {
		viewer.setInput(input);
	}

}
