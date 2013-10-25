package SensorDataWebGui.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TupleWindowReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TupleWindowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof SensorDataWebGui.TupleWindow) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof SensorDataWebGui.AbstractPE && newEnd instanceof SensorDataWebGui.AbstractPE)) {
			return false;
		}
		SensorDataWebGui.AbstractPE target = getLink().getArcToPE();
		if (!(getLink().eContainer() instanceof SensorDataWebGui.StandardSensorDataWeb)) {
			return false;
		}
		SensorDataWebGui.StandardSensorDataWeb container = (SensorDataWebGui.StandardSensorDataWeb) getLink()
				.eContainer();
		return SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiBaseItemSemanticEditPolicy.LinkConstraints
				.canExistTupleWindow_4002(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SensorDataWebGui.ProcessingElement && newEnd instanceof SensorDataWebGui.ProcessingElement)) {
			return false;
		}
		SensorDataWebGui.AbstractPE source = getLink().getArcFromPE();
		if (!(getLink().eContainer() instanceof SensorDataWebGui.StandardSensorDataWeb)) {
			return false;
		}
		SensorDataWebGui.StandardSensorDataWeb container = (SensorDataWebGui.StandardSensorDataWeb) getLink()
				.eContainer();
		return SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiBaseItemSemanticEditPolicy.LinkConstraints
				.canExistTupleWindow_4002(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setArcFromPE(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setArcToPE(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected SensorDataWebGui.TupleWindow getLink() {
		return (SensorDataWebGui.TupleWindow) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected SensorDataWebGui.AbstractPE getOldSource() {
		return (SensorDataWebGui.AbstractPE) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SensorDataWebGui.AbstractPE getNewSource() {
		return (SensorDataWebGui.AbstractPE) newEnd;
	}

	/**
	 * @generated
	 */
	protected SensorDataWebGui.ProcessingElement getOldTarget() {
		return (SensorDataWebGui.ProcessingElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SensorDataWebGui.ProcessingElement getNewTarget() {
		return (SensorDataWebGui.ProcessingElement) newEnd;
	}
}
