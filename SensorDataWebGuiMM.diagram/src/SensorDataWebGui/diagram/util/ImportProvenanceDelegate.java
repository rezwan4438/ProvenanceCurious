package SensorDataWebGui.diagram.util;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.ObjectPluginAction;

import agg.xt_basis.Graph;
import agg.xt_basis.Node;

import pythonProvenance.PythonProvenance;
import pythonProvenance.graphs.ProvenanceGraph;



import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.Arc;
import SensorDataWebGui.FixedWindow;
import SensorDataWebGui.InputOutputMappingTypes;
import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.ProcessingElementTypes;
import SensorDataWebGui.Source;
import SensorDataWebGui.SourceTypes;
import SensorDataWebGui.StandardSensorDataWeb;
import SensorDataWebGui.TriggerTypes;
import SensorDataWebGui.TupleWindow;
import SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart;
import SensorDataWebGui.diagram.part.Messages;
import SensorDataWebGui.diagram.part.SensorDataWebGuiDiagramEditorPlugin;
import SensorDataWebGui.diagram.part.SensorDataWebGuiDiagramEditorUtil;
import SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry;
import SensorDataWebGui.impl.SensorDataWebGuiFactoryImpl;

public class ImportProvenanceDelegate implements IObjectActionDelegate {

	public static PythonProvenance pProv;
	public static ProvenanceGraph pGraph;
	public static Graph baseGraph;
	
	protected void initializeDiagram(File file) throws ExecutionException, IOException, PartInitException{
		String diagramFile = file.getFullPath().toString().replace(".py", ".sdw");
        IProject project = file.getProject();
        IFile f = project.getFile(diagramFile);
        
		// initialize model file
        // based on generated IamlNewDiagramFileWizard#performFinish
        // based on generated IamlInitDiagramFileAction#run
        ResourceSet resourceSet = new ResourceSetImpl();
        URI diagramModelURI = URI.createPlatformResourceURI(diagramFile, false);
        final Resource diagramResource = resourceSet.createResource(diagramModelURI);
        final StandardSensorDataWeb modelRoot2 = initializeModel(project, file);
        diagramResource.getContents().add(modelRoot2);
        List<IFile> affectedFiles = new LinkedList();
        affectedFiles.add(f);
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

	protected StandardSensorDataWeb initializeModel(IProject project, File file){
		
		SensorDataWebGuiFactoryImpl factory = new SensorDataWebGuiFactoryImpl();
		final StandardSensorDataWeb modelRoot2 = factory.createStandardSensorDataWeb();
		/**** Rezwan's inclusion ****/
		EList<AbstractPE> listPE = modelRoot2.getContainsPEs();
		EList<Arc> listArc = modelRoot2.getContainsArcs();
		String constant = "";
		this.pGraph = initializeProvenanceGraph(project, file);
		System.out.println("Provenance Graph: " + this.pGraph.toString());
		this.baseGraph = this.pGraph.getBaseGraph();
        System.out.println("Base Graph: " + this.baseGraph.getNodesList().size());
        System.out.println("Number of edges: " + this.baseGraph.getArcsCount());
        int countPE = 0;
        int countArc = 0;
        for(Node process : this.baseGraph.getNodesList()){
        	if(process.getAttribute().getValueAt("ident").toString().contains("S")){
        		constant = "=" + process.getAttribute().getValueAt("source_name").toString();
        	}
        	else{
	        	if(process.getAttribute().getValueAt("source_names")!=null)
	        		constant = "=" + process.getAttribute().getValueAt("source_names").toString();
	        	else
	        		constant = "";
        	}
        	
        	ProcessingElement pe = factory.createProcessingElement();
            pe.setName(process.getAttribute().getValueAt("ident").toString()+":"+process.getAttribute().getValueAt("name").toString());
        	pe.setView(process.getAttribute().getValueAt("view_ident").toString()+":"+process.getAttribute().getValueAt("view_name").toString()+constant);
        	pe.setPersistentView(Boolean.parseBoolean(process.getAttribute().getValueAt("view_persistent").toString()));
        	pe.setTriggerpredicate(process.getAttribute().getValueAt("trigger").toString());
        	pe.setTriggerType(TriggerTypes.TUPLE);
        	pe.setInputOutputMappingType(findInputOutputMapping(process.getAttribute().getValueAt("in/out").toString()));
        	pe.setDescription(process.getAttribute().getValueAt("type").toString()+
        			"Operation (Line# "+ process.getAttribute().getValueAt("line#").toString()+"--"+
        			process.getAttribute().getValueAt("endLine#").toString()+")");
        	pe.setNbrAllowedInputs(100);
        	
        	listPE.add(pe);
        	System.out.println("PE added : " + pe.getName());
        		
        	
        	countPE++;
        }
        
        System.out.println("PEs added Done = " + countPE);
        
        for(agg.xt_basis.Arc edge : this.baseGraph.getArcsList()){
        	
        	TupleWindow arc = factory.createTupleWindow();
        	String sourceName = edge.getSource().getAttribute().getValueAt("ident").toString()+":"+edge.getSource().getAttribute().getValueAt("name").toString();
        	String targetName = edge.getTarget().getAttribute().getValueAt("ident").toString()+":"+edge.getTarget().getAttribute().getValueAt("name").toString();
        	System.out.println("Arc Source: " + sourceName + "---> Target: " + targetName);
        	
        	AbstractPE fromPE = findPE(sourceName, listPE);
        	AbstractPE toPE = findPE(targetName, listPE);
        	arc.setArcFromPE(fromPE);
        	arc.setArcToPE(toPE);
        	arc.setWindowPredicate("1");
        	
        	listArc.add(arc);
        	countArc++;
        	System.out.println("Arc added : " + countArc);
        }
        
        //System.out.println("Arcs added");
		/**** End ****/	
        
        /*
		Source se = factory.createSource();
		se.setName("S1");
		ProcessingElement pe = factory.createProcessingElement();
		pe.setName("hellow");
		pe.setDescription("this is a first successful test: imported "+file.getFullPath().toString());
		FixedWindow arc = factory.createFixedWindow();
		arc.setArcFromPE(se);
		arc.setArcToPE(pe);
		//EList<AbstractPE> list = modelRoot2.getContainsPEs();
		listPE.add(pe);
		listPE.add(se);
		//modelRoot2.getContainsArcs().add(arc);
		listArc.add(arc);
		*/
        
        System.out.println("No. of processes: " + listPE.size());
        System.out.println("No. of arcs: " + listArc.size());
		modelRoot2.setName("test");
		return modelRoot2;
	}

	private InputOutputMappingTypes findInputOutputMapping(String inOut) {
		// TODO Auto-generated method stub
		InputOutputMappingTypes found = null;
		if(inOut.toLowerCase().equals("onetoone"))
			found = InputOutputMappingTypes.ONE_TO_ONE;
		else if(inOut.toLowerCase().equals("onetomany"))
			found = InputOutputMappingTypes.ONE_TO_MANY;
		else if(inOut.toLowerCase().equals("manytoone"))
			found = InputOutputMappingTypes.MANY_TO_ONE;
		else 
			found = InputOutputMappingTypes.MANY_TO_MANY;
		
		return found;
	}

	private AbstractPE findPE(String nodeName, EList<AbstractPE> list) {
		// TODO Auto-generated method stub
		AbstractPE found = null;
		for(AbstractPE pe : list){
			if(pe.getName().equals(nodeName)){
				found = pe;
				break;
			}
		}
		
		return found;
	}

	private ProvenanceGraph initializeProvenanceGraph(IProject project, File file) {
		// TODO Auto-generated method stub
		System.out.println("Executing Python Provenance");
		this.pProv = new PythonProvenance();
		System.out.println("Instantiating Python Provenance Object");
		String fullPathTemp = project.getWorkspace().getRoot().getLocation().toString()+file.getFullPath().toString();
		//System.out.println("Full Path Temp: " + fullPathTemp);
		String fullPath = fullPathTemp.replace("/", "\\");
		System.out.println("Full Path: " + fullPath);
		System.out.println("File Name: " + file.getName());
		ProvenanceGraph pGraph = this.pProv.controller(fullPath,file.getName());
        return pGraph;
	}

	public void run(IAction action) {
		ObjectPluginAction oact = (ObjectPluginAction) action;
		TreeSelection sel = (TreeSelection) oact.getSelection();
		File csel = (File) sel.getFirstElement();
		try {
			initializeDiagram(csel);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Shell shell = new Shell();
//		MessageDialog.openInformation(
//				shell,
//				"My Title",
//				"Project Explorer Example Action: "+csel.getName());
	}


	public void selectionChanged(IAction action, ISelection selection) {
	}
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
}
