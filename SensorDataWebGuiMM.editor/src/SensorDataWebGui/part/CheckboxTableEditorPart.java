package SensorDataWebGui.part;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import SensorDataWebGui.presentation.SensorDataWebGuiEditor;
import SensorDataWebGui.util.AbstractPEContentProvider;

public class CheckboxTableEditorPart extends SensorDataWebGuiEditorPart {

	public CheckboxTableViewer viewer;

	public CheckboxTableEditorPart(SensorDataWebGuiEditor parent) {
		super(parent);
	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new CheckboxTableViewer(parent, SWT.NONE);
		
		viewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));

		viewer.setContentProvider(new AbstractPEContentProvider(getAdapterFactory()));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
				
		createContextMenuFor(viewer);
		getEditorSite().setSelectionProvider(viewer);
		
		
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

