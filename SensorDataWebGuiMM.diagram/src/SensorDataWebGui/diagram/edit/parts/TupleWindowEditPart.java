package SensorDataWebGui.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
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
public class TupleWindowEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public TupleWindowEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SensorDataWebGui.diagram.edit.policies.TupleWindowItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart) {
			((SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTupleWindowNameFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart) {
			((SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTupleWindowWindowPredicateFigure());
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
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart) {
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
		return new TupleWindowFigure();
	}

	/**
	 * @generated
	 */
	public TupleWindowFigure getPrimaryShape() {
		return (TupleWindowFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TupleWindowFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTupleWindowWindowPredicateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTupleWindowNameFigure;

		/**
		 * @generated
		 */
		public TupleWindowFigure() {
			this.setLineWidth(1);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTupleWindowWindowPredicateFigure = new WrappingLabel();
			fFigureTupleWindowWindowPredicateFigure.setText("<...>");

			this.add(fFigureTupleWindowWindowPredicateFigure);

			fFigureTupleWindowNameFigure = new WrappingLabel();
			fFigureTupleWindowNameFigure.setText("<...>");

			this.add(fFigureTupleWindowNameFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setLineWidth(1);
			df.setBackgroundColor(ColorConstants.white);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTupleWindowWindowPredicateFigure() {
			return fFigureTupleWindowWindowPredicateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTupleWindowNameFigure() {
			return fFigureTupleWindowNameFigure;
		}

	}

}
