package SensorDataWebGui.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.StandardSensorDataWeb;

public class AbstractPEContentProvider extends AdapterFactoryContentProvider {

	public AbstractPEContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object[] getElements(Object object){
		Object[] root = super.getElements(object);
		GMFResource gres = (GMFResource)root[0];
		EList<EObject> groot = gres.getContents();
		StandardSensorDataWeb ssdw = (StandardSensorDataWeb)groot.get(0);
		return ssdw.getContainsPEs().toArray();
	}


}
