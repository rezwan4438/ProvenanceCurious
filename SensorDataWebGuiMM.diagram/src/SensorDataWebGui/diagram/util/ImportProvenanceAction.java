package SensorDataWebGui.diagram.util;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import java.awt.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
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

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.Source;
import SensorDataWebGui.StandardSensorDataWeb;
import SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart;
import SensorDataWebGui.diagram.edit.parts.SourceEditPart;
import SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart;
import SensorDataWebGui.diagram.part.Messages;
import SensorDataWebGui.diagram.part.SensorDataWebGuiDiagramEditorPlugin;
import SensorDataWebGui.diagram.part.SensorDataWebGuiDiagramEditorUtil;
import SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry;
import SensorDataWebGui.impl.SensorDataWebGuiFactoryImpl;
import SensorDataWebGui.presentation.SensorDataWebGuiEditor;
import SensorDataWebGui.util.SensorDataWebGuiAdapterFactory;

/**
 * @generated
 */
public class ImportProvenanceAction extends AbstractHandler{
	protected IProject project;
    protected IProgressMonitor monitor = new NullProgressMonitor();

	 protected IProject createProject() throws CoreException {
         // create a new project automatically
         IWorkspace workspace = ResourcesPlugin.getWorkspace();
         IWorkspaceRoot root = workspace.getRoot();
//         root.refreshLocal(5, monitor);
         IProject project = root.getProject(getProjectName());
         // delete any existing ones
//         if (project.exists()) {
//                 project.delete(true, monitor);
//         }
         
         // create it
//         project.create(monitor);
//        project.open(monitor);
         
         return project;
 }
     public String getProjectName() {
         return "test";
 }

	/**
	 * @generated
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("executed import provenance");
		IWorkbenchPage page;
		IEditorInput input;
		page = PlatformUI.getWorkbench ().getActiveWorkbenchWindow ().getActivePage ();
		IEditorPart editor = page.getActiveEditor();
		
		//input = page.getActiveEditor().getEditorInput();
//		IEditorDescriptor desc = PlatformUI.getWorkbench().
//		        getEditorRegistry().getDefaultEditor(file.getName());
//		page.openEditor(input, desc.getId());
		try {
			project = createProject();
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		IWorkbench workbench = PlatformUI.getWorkbench ();
		IFile targetModel = project.getFile("default.sdw");
		IFile targetDiagram = project.getFile("default4.sdw");
		// initialise the model
        try {
			initializeModelFile(targetModel, targetDiagram);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
//		try {
			//SensorDataWebGuiEditor editor = (SensorDataWebGuiEditor) page.openEditor (input, "SensorDataWebGui.presentation.SensorDataWebGuiEditorID", true, 3);
			
			System.out.println("done");
//			EvaluationContext context = (EvaluationContext) event.getApplicationContext();
//			List<Object> def = (List<Object>) context.getDefaultVariable();
//			AbstractPE ref=null;
//			if(def.get(0) instanceof ProcessingElementEditPart){
//				ProcessingElementEditPart peep = (ProcessingElementEditPart) def.get(0);
//				Shape shape = (Shape) peep.getModel();
//				ref = (ProcessingElement) shape.getElement();
//				}else 
//			if(def.get(0) instanceof SourceEditPart){
//				SourceEditPart sep = (SourceEditPart) def.get(0);
//				Shape shape = (Shape) sep.getModel();
//				ref = (Source) shape.getElement();
//				} else {
//					System.out.println("show graph was accessible for an element of class "+def.get(0).getClass());
//				}
//			System.out.println("reference name:"+ref.getName());
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
//		} catch (PartInitException e) {
//			e.printStackTrace();
//		}

		//	    ShowGraphViewPart pgvp = new ShowGraphViewPart();
		//	    pgvp.createPartControl(shell);
		return null;
	}

    protected void initializeModelFile(IFile modelFile, IFile diagramFile) throws Exception {
        // initialize model file
        // based on generated IamlNewDiagramFileWizard#performFinish
        // based on generated IamlInitDiagramFileAction#run
        ResourceSet resourceSet = new ResourceSetImpl();
        URI sourceModelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), false);
        URI diagramModelURI = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), false);
        final Resource modelResource = resourceSet.getResource(sourceModelURI, true);
        final Resource diagramResource = resourceSet.createResource(diagramModelURI);
        EObject modelRoot = (EObject) modelResource.getContents().get(0);
        SensorDataWebGuiFactoryImpl factory = new SensorDataWebGuiFactoryImpl();
        final StandardSensorDataWeb modelRoot2 = factory.createStandardSensorDataWeb();
        
        ProcessingElement pe = factory.createProcessingElement();
        pe.setName("P1");
        pe.setDescription("thios is a first successful test");
        modelRoot2.getContainsPEs().add(pe);
        modelRoot2.setName("sample");
        diagramResource.getContents().add(modelRoot2);
        List affectedFiles = new LinkedList();
        affectedFiles.add(diagramFile);
        TransactionalEditingDomain myEditingDomain = GMFEditingDomainFactory.INSTANCE
                .createEditingDomain();
        
        AbstractTransactionalCommand command = new AbstractTransactionalCommand(
                        myEditingDomain,
                        Messages.SensorDataWebGuiNewDiagramFileWizard_InitDiagramCommand,
                        affectedFiles) {

//                private IAdaptable info;

				protected CommandResult doExecuteWithResult(
                                IProgressMonitor monitor, IAdaptable info)
                                throws ExecutionException {
                        int diagramVID = SensorDataWebGuiVisualIDRegistry.getDiagramVisualID(modelRoot2);
                        if (diagramVID != StandardSensorDataWebEditPart.VISUAL_ID) {
                                return CommandResult
                                                .newErrorCommandResult(Messages.SensorDataWebGuiNewDiagramFileWizard_IncorrectRootError);
                        }
                        Diagram diagram = ViewService.createDiagram(
                                        modelRoot2,
                                        StandardSensorDataWebEditPart.MODEL_ID,
                                        SensorDataWebGuiDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
                        diagramResource.getContents().add(diagram);
                        return CommandResult.newOKCommandResult();
                }
        };
        OperationHistoryFactory.getOperationHistory().execute(command,
                        new NullProgressMonitor(), null);
        diagramResource.save(SensorDataWebGuiDiagramEditorUtil.getSaveOptions());
        SensorDataWebGuiDiagramEditorUtil.openDiagram(diagramResource);
        // end
}

}
