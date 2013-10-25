package SensorDataWebGui.diagram.edit.parts;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.StandardSensorDataWeb;
import SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.ProcessingElementFigure;
import SensorDataWebGui.diagram.edit.parts.SourceEditPart.SourceFigure;

/**
 * @generated
 */
public class StandardSensorDataWebEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "SensorDataWebGui"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public StandardSensorDataWebEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SensorDataWebGui.diagram.edit.policies.StandardSensorDataWebItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new SensorDataWebGui.diagram.edit.policies.StandardSensorDataWebCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof StandardSensorDataWeb &&
				notification.getFeature()instanceof EAttributeImpl) {
			EAttributeImpl f = (EAttributeImpl)notification.getFeature();
			if(f.getName().equals("diagramType")){
				List list = this.getChildren();
				for(Object elem : list){
					if(elem instanceof SourceEditPart){
						SourceFigure prim = ((SourceEditPart) elem).getPrimaryShape();
						prim.updateFace();
					} else
					if(elem instanceof ProcessingElementEditPart){
						ProcessingElementFigure prim = ((ProcessingElementEditPart) elem).getPrimaryShape();
						prim.updateFace();
					}
				}
			}
			//			 StandardSensorDataWeb model = (StandardSensorDataWeb) this.getModel();
			//			 EList<AbstractPE> list = model.getContainsPEs();
			//			 for(AbstractPE ape : list){
			//				 
			//			 }
			//			getPrimaryShape().updateFace();
		}
		super.handleNotificationEvent(notification);
	}
}
