package SensorDataWebGui.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class StandardSensorDataWebItemSemanticEditPolicy
		extends
		SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StandardSensorDataWebItemSemanticEditPolicy() {
		super(
				SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.StandardSensorDataWeb_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.Source_2001 == req
				.getElementType()) {
			return getGEFWrapper(new SensorDataWebGui.diagram.edit.commands.SourceCreateCommand(
					req));
		}
		if (SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002 == req
				.getElementType()) {
			return getGEFWrapper(new SensorDataWebGui.diagram.edit.commands.ProcessingElementCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
