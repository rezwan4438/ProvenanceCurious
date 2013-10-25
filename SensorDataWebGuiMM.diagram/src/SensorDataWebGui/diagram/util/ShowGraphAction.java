package SensorDataWebGui.diagram.util;

import java.awt.Frame;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import agg.xt_basis.Graph;

import pythonProvenance.PythonProvenance;
import pythonProvenance.graphs.ImageManipulation;
import pythonProvenance.graphs.ProvenanceGraph;

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.Source;
import SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart;
import SensorDataWebGui.diagram.edit.parts.SourceEditPart;


/**
 * @generated
 */
public class ShowGraphAction extends AbstractHandler {

	/**
	 * @generated
	 */
	
	
	
	
	
	
	@SuppressWarnings("restriction")
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("executed graph printing");
		IWorkbenchPage page;
		IEditorInput input;
		page = PlatformUI.getWorkbench ().getActiveWorkbenchWindow ().getActivePage ();
		input = page.getActiveEditor().getEditorInput();
		//setProvenance();
		
//		IWorkbench workbench = PlatformUI.getWorkbench ();
		try {
			
			EvaluationContext context = (EvaluationContext) event.getApplicationContext();
			List<Object> def = (List<Object>) context.getDefaultVariable();
			AbstractPE ref=null;
			if(def.get(0) instanceof ProcessingElementEditPart){
				ProcessingElementEditPart peep = (ProcessingElementEditPart) def.get(0);
				Shape shape = (Shape) peep.getModel();
				ref = (ProcessingElement) shape.getElement();
				String vName = ref.getView().split(":")[1];
				SensorDataWebGui.presentation.SensorDataWebGuiEditor.viewName = vName;
				
				//page = PlatformUI.getWorkbench ().getActiveWorkbenchWindow ().getActivePage ();
				//input = page.getActiveEditor().getEditorInput();
				/*
				try {
					IEditorPart editor = page.openEditor (input, "SensorDataWebGui.presentation.SensorDataWebGuiEditorID", true, 3);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				}
			else 
				if(def.get(0) instanceof SourceEditPart){
					SourceEditPart sep = (SourceEditPart) def.get(0);
					Shape shape = (Shape) sep.getModel();
					ref = (Source) shape.getElement();
					} 
				else {
					System.out.println("show graph was accessible for an element of class "+def.get(0).getClass());
				}
			System.out.println("reference name:"+ref.getName());
			IEditorPart editor = page.openEditor (input, "SensorDataWebGui.presentation.SensorDataWebGuiEditorID", true, 3);
			
			
			//		IEditorPart diagramEditor = HandlerUtil.getActiveEditorChecked(event);
			//		IWorkbenchPage page = diagramEditor.getEditorSite().getPage();
			//	    Composite chartComposite = new Composite(shell, SWT.EMBEDDED);
			//	    Frame chartFrame = SWT_AWT.new_Frame(chartComposite);
			//	    Label label = new Label(chartComposite, 0);
			//        label.setText("Hello World");

			//	    EvaluationContext context = (EvaluationContext) event.getApplicationContext();
			//	    List<Object> mouseListeners = (List<Object>) context.getDefaultVariable();
			//	    ProcessingElementEditPart peep = (ProcessingElementEditPart) mouseListeners.get(0);
			//	    Shape shape = (Shape) peep.getModel();
			//	    ProcessingElement pe = (ProcessingElement) shape.getElement();
			////	    Frame chartFrame = SWT_AWT.new_Frame(chartComposite);
			////	    createChart(chartFrame);
			//		String id = "SensorDataWebGui.diagram.util.ShowGraphViewPart";
			//		try {
			//			page.showView(id, "1", IWorkbenchPage.VIEW_VISIBLE);
			//			page.showView(id, "2", IWorkbenchPage.VIEW_ACTIVATE);
			//		} catch (PartInitException e) {
			//			// TODO Auto-generated catch block
			//			e.printStackTrace();
			//		}
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		catch (PartInitException e) {
			e.printStackTrace();
		}
*/
		//	    ShowGraphViewPart pgvp = new ShowGraphViewPart();
		//	    pgvp.createPartControl(shell);
		return null;
	}


	//	private void createChart(Frame chartFrame){
	//		// Create the JFreeChart data
	//		DefaultPieDataset pieData = new DefaultPieDataset();
	//		pieData.setValue("Slice 1", 50);
	//		pieData.setValue("Slice 2", 70);
	//		pieData.setValue("Slice 3", 90);
	//		pieData.setValue("Slice 4", 20);
	//
	//		// Create the actuall JFreeChart chart
	//		JFreeChart chart = ChartFactory.createPieChart3D("Sample Chart", pieData, true, true, false);
	//		chartFrame.setLayout(new GridLayout());
	//		ChartPanel cp = new ChartPanel(chart);
	//		chartFrame.add(cp);
	//	}

}