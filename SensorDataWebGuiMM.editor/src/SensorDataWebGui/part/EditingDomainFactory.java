package SensorDataWebGui.part;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Factory;

public class EditingDomainFactory implements Factory {
	public TransactionalEditingDomain createEditingDomain() {
		return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
	}

	public TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
		return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rset);
	}

	public TransactionalEditingDomain getEditingDomain(ResourceSet rset) {
		return TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(rset);
	}
}
