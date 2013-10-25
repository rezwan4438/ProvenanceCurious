package SensorDataWebGui.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import SensorDataWebGui.DiagramTypes;
import SensorDataWebGui.Source;
import SensorDataWebGui.StandardSensorDataWeb;

/**
 * @generated
 */
public class SourceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public SourceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SensorDataWebGui.diagram.edit.policies.SourceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		SourceFigure figure = new SourceFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public SourceFigure getPrimaryShape() {
		return (SourceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSourceSampleTimeDistributionFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSourceSampleTimeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSourceTimeoutFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSourceValidTimeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSourceLocationFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSourceTransactionTimeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSourceSourceTypeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSourcePersistentViewFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceNameEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSourceNameFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceViewEditPart) {
			((SensorDataWebGui.diagram.edit.parts.SourceViewEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSourceViewFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.SourceViewEditPart) {
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
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getType(SensorDataWebGui.diagram.edit.parts.SourceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001);
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002);
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart) {
			types
					.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001);
		}
		if (targetEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart) {
			types
					.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002);
		}
		if (targetEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart) {
			types
					.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001) {
			types
					.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002);
		}
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002) {
			types
					.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002);
		}
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003) {
			types
					.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002);
		}
		return types;
	}
		
	/**
	 * @generated
	 */
	public class SourceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceSourceTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourcePersistentViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceTimeoutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceLocationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceValidTimeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceTransactionTimeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceSampleTimeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceSampleTimeDistributionFigure;

		private WrappingLabel fFigureSourceLocationLabelFigure;
		private WrappingLabel fFigureSourcePersistentViewLabelFigure;
		private WrappingLabel fFigureSourceSampleTimeDistributionLabelFigure;
		private WrappingLabel fFigureSourceSampleTimeLabelFigure;
		private WrappingLabel fFigureSourceTransactionTimeLabelFigure;
		private WrappingLabel fFigureSourceValidTimeLabelFigure;
		private WrappingLabel fFigureSourceTimeoutLabelFigure;
		private GridData fConstraintFigure;
		
		private Vector<WrappingLabel> fFigureOrder = new Vector<WrappingLabel>();
		private Vector<WrappingLabel> fFigureLabelOrder = new Vector<WrappingLabel>();
		
		// first dimension 0=standard, 1=provenance, 2=propagation
		private final boolean[][] mapping = {{true,true,true}, // source type
				{true, true, true}, // source view
				{false, true,true}, // view persistent
				{false, true,true}, // timeout
				{false, false,true}, // location
				{false, false,true}, // valid time
				{false, true,true}, // transaction time
				{false, true,true}, // sample time
				{false, false,true} // sample time distribution
		};
		private WrappingLabel fFigureSourceSourceTypeLabelFigure;
		private WrappingLabel fFigureSourceViewLabelFigure;
		
		/**
		 * @generated NOT
		 */
		public SourceFigure() {
			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
			updateFace();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureSourceNameFigure = new WrappingLabel();
			fFigureSourceNameFigure.setText("<...>");

			GridData constraintFFigureSourceNameFigure = new GridData();
			constraintFFigureSourceNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureSourceNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureSourceNameFigure.horizontalIndent = 0;
			constraintFFigureSourceNameFigure.horizontalSpan = 2;
			constraintFFigureSourceNameFigure.verticalSpan = 1;
			constraintFFigureSourceNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureSourceNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureSourceNameFigure,
							constraintFFigureSourceNameFigure);

			fFigureSourceSourceTypeLabelFigure = new WrappingLabel();
			fFigureSourceSourceTypeLabelFigure.setText("type");
			fFigureLabelOrder.add(fFigureSourceSourceTypeLabelFigure);
			
//			this.add(fFigureSourceSourceTypeLabelFigure);

			fFigureSourceSourceTypeFigure = new WrappingLabel();
			fFigureSourceSourceTypeFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceSourceTypeFigure);
			
			fConstraintFigure = new GridData();
			fConstraintFigure.verticalAlignment = GridData.BEGINNING;
			fConstraintFigure.horizontalAlignment = GridData.FILL;
			fConstraintFigure.horizontalIndent = 1;
			fConstraintFigure.horizontalSpan = 1;
			fConstraintFigure.verticalSpan = 1;
			fConstraintFigure.grabExcessHorizontalSpace = true;
			fConstraintFigure.grabExcessVerticalSpace = false;
//			this.add(fFigureSourceSourceTypeFigure,fConstraintFigure);

			fFigureSourceViewLabelFigure = new WrappingLabel();
			fFigureSourceViewLabelFigure.setText("view");
			fFigureLabelOrder.add(fFigureSourceViewLabelFigure);
			
//			this.add(fFigureSourceViewLabelFigure);

			fFigureSourceViewFigure = new WrappingLabel();
			fFigureSourceViewFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceViewFigure);
			
//			this.add(fFigureSourceViewFigure,fConstraintFigure);

			fFigureSourcePersistentViewLabelFigure = new WrappingLabel();
			fFigureSourcePersistentViewLabelFigure.setText("persistent");
			fFigureLabelOrder.add(fFigureSourcePersistentViewLabelFigure);
			
//			this.add(fFigureSourcePersistentViewLabelFigure);

			fFigureSourcePersistentViewFigure = new WrappingLabel();
			fFigureSourcePersistentViewFigure.setText("<...>");
			fFigureOrder.add(fFigureSourcePersistentViewFigure);
			
//			this.add(fFigureSourcePersistentViewFigure,fConstraintFigure);

			fFigureSourceTimeoutLabelFigure = new WrappingLabel();
			fFigureSourceTimeoutLabelFigure.setText("timeout");
			fFigureLabelOrder.add(fFigureSourceTimeoutLabelFigure);
			
//			this.add(fFigureSourceTimeoutLabelFigure);

			fFigureSourceTimeoutFigure = new WrappingLabel();
			fFigureSourceTimeoutFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceTimeoutFigure);
			
//			this.add(fFigureSourceTimeoutFigure,fConstraintFigure);

			fFigureSourceLocationLabelFigure = new WrappingLabel();
			fFigureSourceLocationLabelFigure.setText("location");
			fFigureLabelOrder.add(fFigureSourceLocationLabelFigure);
			
//			this.add(fFigureSourceLocationLabelFigure);

			fFigureSourceLocationFigure = new WrappingLabel();
			fFigureSourceLocationFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceLocationFigure);
			
//			this.add(fFigureSourceLocationFigure,fConstraintFigure);

			fFigureSourceValidTimeLabelFigure = new WrappingLabel();
			fFigureSourceValidTimeLabelFigure.setText("valid time");
			fFigureLabelOrder.add(fFigureSourceValidTimeLabelFigure);
			
//			this.add(fFigureSourceValidTimeLabelFigure);

			fFigureSourceValidTimeFigure = new WrappingLabel();
			fFigureSourceValidTimeFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceValidTimeFigure);
			
//			this.add(fFigureSourceValidTimeFigure,fConstraintFigure);

			fFigureSourceTransactionTimeLabelFigure = new WrappingLabel();
			fFigureSourceTransactionTimeLabelFigure.setText("trans time");
			fFigureLabelOrder.add(fFigureSourceTransactionTimeLabelFigure);
			
//			this.add(fFigureSourceTransactionTimeLabelFigure);

			fFigureSourceTransactionTimeFigure = new WrappingLabel();
			fFigureSourceTransactionTimeFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceTransactionTimeFigure);
			
//			this.add(fFigureSourceTransactionTimeFigure,fConstraintFigure);

			fFigureSourceSampleTimeLabelFigure = new WrappingLabel();
			fFigureSourceSampleTimeLabelFigure.setText("sample");
			fFigureLabelOrder.add(fFigureSourceSampleTimeLabelFigure);
			
//			this.add(fFigureSourceSampleTimeLabelFigure);

			fFigureSourceSampleTimeFigure = new WrappingLabel();
			fFigureSourceSampleTimeFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceSampleTimeFigure);
			
//			this.add(fFigureSourceSampleTimeFigure,fConstraintFigure);

			fFigureSourceSampleTimeDistributionLabelFigure = new WrappingLabel();
			fFigureSourceSampleTimeDistributionLabelFigure.setText("sample dist");
			fFigureLabelOrder.add(fFigureSourceSampleTimeDistributionLabelFigure);
			
//			this.add(fFigureSourceSampleTimeDistributionLabelFigure);

			fFigureSourceSampleTimeDistributionFigure = new WrappingLabel();
			fFigureSourceSampleTimeDistributionFigure.setText("<...>");
			fFigureOrder.add(fFigureSourceSampleTimeDistributionFigure);
			
//			this.add(fFigureSourceSampleTimeDistributionFigure,fConstraintFigure);
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceNameFigure() {
			return fFigureSourceNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceSourceTypeFigure() {
			return fFigureSourceSourceTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceViewFigure() {
			return fFigureSourceViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourcePersistentViewFigure() {
			return fFigureSourcePersistentViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceTimeoutFigure() {
			return fFigureSourceTimeoutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceLocationFigure() {
			return fFigureSourceLocationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceValidTimeFigure() {
			return fFigureSourceValidTimeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceTransactionTimeFigure() {
			return fFigureSourceTransactionTimeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceSampleTimeFigure() {
			return fFigureSourceSampleTimeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceSampleTimeDistributionFigure() {
			return fFigureSourceSampleTimeDistributionFigure;
		}

		public void updateFace() {
			EditPart diagram = SourceEditPart.this.getParent();
			
			StandardSensorDataWeb sdw = (StandardSensorDataWeb) ((Diagram) diagram.getModel()).getElement();
			
			List children = this.getChildren();
			int j = children.size()-1;
			for(int i=fFigureOrder.size()-1;i>=0;i--){
				if(children.get(j)==fFigureOrder.get(i)){
					if(!mapping[i][sdw.getDiagramType().getValue()]){
						this.remove(fFigureOrder.get(i));
						// remove also the corresponding label
						this.remove(fFigureLabelOrder.get(i));
						
					}
					j=j-2;
				} else {
					if(mapping[i][sdw.getDiagramType().getValue()]){
						this.add(fFigureLabelOrder.get(i),j+1);
						this.add(fFigureOrder.get(i),fConstraintFigure,j+2);
					} 				
				}
			}
			
			// update tooltip
			String tooltipText;
			Source source = (Source) ((Node) SourceEditPart.this.getModel()).getElement();
			if (source.getDescription() != null
					&& source.getDescription().length() > 0) {
				tooltipText = source.getDescription();
			} else {
				tooltipText = source.getName();
			}
//			if (getToolTip() == null) {
//				setToolTip(new IFigure(new Label(tooltipText)));
//			} else if (getToolTip() instanceof Label) {
//				((Label) getToolTip()).setText(tooltipText);
//			}
		}
	}

}
