package SensorDataWebGui.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TimeWindowEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public TimeWindowEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SensorDataWebGui.diagram.edit.policies.TimeWindowItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart) {
			((SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTimeWindowNameFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart) {
			((SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTimeWindowWindowPredicateFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new TimeWindowFigure();
	}

	/**
	 * @generated
	 */
	public TimeWindowFigure getPrimaryShape() {
		return (TimeWindowFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TimeWindowFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTimeWindowWindowPredicateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTimeWindowNameFigure;

		/**
		 * @generated
		 */
		public TimeWindowFigure() {
			this.setLineWidth(1);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTimeWindowWindowPredicateFigure = new WrappingLabel();
			fFigureTimeWindowWindowPredicateFigure.setText("<...>");

			this.add(fFigureTimeWindowWindowPredicateFigure);

			fFigureTimeWindowNameFigure = new WrappingLabel();
			fFigureTimeWindowNameFigure.setText("<...>");

			this.add(fFigureTimeWindowNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(1);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTimeWindowWindowPredicateFigure() {
			return fFigureTimeWindowWindowPredicateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTimeWindowNameFigure() {
			return fFigureTimeWindowNameFigure;
		}

	}

}
