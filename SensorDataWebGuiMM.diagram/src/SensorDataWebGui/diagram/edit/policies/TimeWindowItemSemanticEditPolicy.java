package SensorDataWebGui.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class TimeWindowItemSemanticEditPolicy
		extends
		SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TimeWindowItemSemanticEditPolicy() {
		super(
				SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
