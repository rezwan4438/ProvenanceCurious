package SensorDataWebGui.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
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
public class FixedWindowEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public FixedWindowEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SensorDataWebGui.diagram.edit.policies.FixedWindowItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart) {
			((SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFixedWindowNameFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart) {
			((SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFixedWindowWindowPredicateFigure());
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
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart) {
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
		return new FixedWindowFigure();
	}

	/**
	 * @generated
	 */
	public FixedWindowFigure getPrimaryShape() {
		return (FixedWindowFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class FixedWindowFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFixedWindowWindowPredicateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFixedWindowNameFigure;

		/**
		 * @generated
		 */
		public FixedWindowFigure() {
			this.setLineWidth(1);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFixedWindowWindowPredicateFigure = new WrappingLabel();
			fFigureFixedWindowWindowPredicateFigure.setText("<...>");

			this.add(fFigureFixedWindowWindowPredicateFigure);

			fFigureFixedWindowNameFigure = new WrappingLabel();
			fFigureFixedWindowNameFigure.setText("<...>");

			this.add(fFigureFixedWindowNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setLineWidth(1);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFixedWindowWindowPredicateFigure() {
			return fFigureFixedWindowWindowPredicateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFixedWindowNameFigure() {
			return fFigureFixedWindowNameFigure;
		}

	}

}
