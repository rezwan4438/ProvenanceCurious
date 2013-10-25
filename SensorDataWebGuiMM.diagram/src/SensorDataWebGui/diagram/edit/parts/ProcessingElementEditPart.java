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
import org.eclipse.emf.ecore.impl.EAttributeImpl;
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
import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.ProcessingElementTypes;
import SensorDataWebGui.Source;
import SensorDataWebGui.StandardSensorDataWeb;
import SensorDataWebGui.diagram.edit.parts.SourceEditPart.SourceFigure;

/**
 * @generated
 */
public class ProcessingElementEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public ProcessingElementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SensorDataWebGui.diagram.edit.policies.ProcessingElementItemSemanticEditPolicy());
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
		ProcessingElementFigure figure = new ProcessingElementFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ProcessingElementFigure getPrimaryShape() {
		return (ProcessingElementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementInputOutputMappingTypeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementPersistentViewFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementFunctorTypeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementPeTypeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementProcessingDelayFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementValidTimeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementProcessingDelayDistributionFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementNameFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementTriggerTypeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementViewFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementTransactionTimeFigure());
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart) {
			((SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureProcessingElementTriggerpredicateFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart) {
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
				.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart.VISUAL_ID));
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
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
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
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001) {
			types
			.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.Source_2001);
		}
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001) {
			types
			.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002);
		}
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002) {
			types
			.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.Source_2001);
		}
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002) {
			types
			.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002);
		}
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003) {
			types
			.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.Source_2001);
		}
		if (relationshipType == SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003) {
			types
			.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002);
		}
		return types;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof ProcessingElement &&
				notification.getFeature()instanceof EAttributeImpl) {
			EAttributeImpl f = (EAttributeImpl)notification.getFeature();
			if(f.getName().equals("peType")){
				if(notification.getOldValue()==ProcessingElementTypes.FUNCTOR){
					getPrimaryShape().updateFaceFunctor(true);
				}
				if(notification.getNewValue()==ProcessingElementTypes.FUNCTOR){
					getPrimaryShape().updateFaceFunctor(false);
				}
			}
		}
		super.handleNotificationEvent(notification);
	}


	/**
	 * @generated
	 */
	public class ProcessingElementFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementPersistentViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementValidTimeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementTransactionTimeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementTriggerTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementTriggerpredicateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementPeTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementFunctorTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementInputOutputMappingTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementProcessingDelayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementProcessingDelayDistributionFigure;
		private GridData fConstraintFigure;
		private WrappingLabel fFigureProcessingElementProcessingDelayDistributionLabelFigure;

		private Vector<WrappingLabel> fFigureOrder = new Vector<WrappingLabel>();
		private Vector<WrappingLabel> fFigureLabelOrder = new Vector<WrappingLabel>();

		// first dimension 0=standard, 1=provenance, 2=propagation
		private final boolean[][] mapping = {{true,true,true}, // pe type
				{true, true,true}, // functor
				{true, true, true}, // view
				{false, true,true}, // persistent
				{false, true,true}, // trigger
				{false, true,true}, // trigger predicate
				{false, false,true}, // valid time
				{false, true,true}, // transaction time
				{false, true,true}, // IO mapping
				{false, true,true}, // processing delay
				{false, false,true} // processing delay distribution
		};
		private WrappingLabel fFigureProcessingElementProcessingDelayLabelFigure;
		private WrappingLabel fFigureProcessingElementPeTypeLabelFigure;
		private WrappingLabel fFigureProcessingElementViewLabelFigure;
		private WrappingLabel fFigureProcessingElementPersistentViewLabelFigure;
		private WrappingLabel fFigureProcessingElementTriggerpredicateLabelFigure;
		private WrappingLabel fFigureProcessingElementFunctorTypeLabelFigure;
		private WrappingLabel fFigureProcessingElementValidTimeLabelFigure;
		private WrappingLabel fFigureProcessingElementTransactionTimeLabelFigure;
		private WrappingLabel fFigureProcessingElementTriggerTypeLabelFigure;
		private WrappingLabel fFigureProcessingElementInputOutputMappingTypeLabelFigure;

		/**
		 * @generated NOT
		 */
		public ProcessingElementFigure() {

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

			fFigureProcessingElementNameFigure = new WrappingLabel();
			fFigureProcessingElementNameFigure.setText("<...>");

			GridData constraintFFigureProcessingElementNameFigure = new GridData();
			constraintFFigureProcessingElementNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureProcessingElementNameFigure.horizontalIndent = 0;
			constraintFFigureProcessingElementNameFigure.horizontalSpan = 2;
			constraintFFigureProcessingElementNameFigure.verticalSpan = 1;
			constraintFFigureProcessingElementNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProcessingElementNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementNameFigure,
					constraintFFigureProcessingElementNameFigure);

			fFigureProcessingElementPeTypeLabelFigure = new WrappingLabel();
			fFigureProcessingElementPeTypeLabelFigure.setText("PE type");
			fFigureLabelOrder.add(fFigureProcessingElementPeTypeLabelFigure);

//			this.add(fFigureProcessingElementPeTypeLabelFigure);

			fFigureProcessingElementPeTypeFigure = new WrappingLabel();
			fFigureProcessingElementPeTypeFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementPeTypeFigure);

			fConstraintFigure = new GridData();
			fConstraintFigure.verticalAlignment = GridData.BEGINNING;
			fConstraintFigure.horizontalAlignment = GridData.FILL;
			fConstraintFigure.horizontalIndent = 1;
			fConstraintFigure.horizontalSpan = 1;
			fConstraintFigure.verticalSpan = 1;
			fConstraintFigure.grabExcessHorizontalSpace = true;
			fConstraintFigure.grabExcessVerticalSpace = false;
//			this.add(fFigureProcessingElementPeTypeFigure,fConstraintFigure);

			fFigureProcessingElementFunctorTypeLabelFigure = new WrappingLabel();
			fFigureProcessingElementFunctorTypeLabelFigure.setText("functor");
			fFigureLabelOrder.add(fFigureProcessingElementFunctorTypeLabelFigure);

//			this.add(fFigureProcessingElementFunctorTypeLabelFigure);

			fFigureProcessingElementFunctorTypeFigure = new WrappingLabel();
			fFigureProcessingElementFunctorTypeFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementFunctorTypeFigure);

//			this.add(fFigureProcessingElementFunctorTypeFigure,fConstraintFigure);

			fFigureProcessingElementViewLabelFigure = new WrappingLabel();
			fFigureProcessingElementViewLabelFigure.setText("view");
			fFigureLabelOrder.add(fFigureProcessingElementViewLabelFigure);

//			this.add(fFigureProcessingElementViewLabelFigure);

			fFigureProcessingElementViewFigure = new WrappingLabel();
			fFigureProcessingElementViewFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementViewFigure);

//			this.add(fFigureProcessingElementViewFigure,fConstraintFigure);

			fFigureProcessingElementPersistentViewLabelFigure = new WrappingLabel();
			fFigureProcessingElementPersistentViewLabelFigure.setText("persistent");
			fFigureLabelOrder.add(fFigureProcessingElementPersistentViewLabelFigure);

//			this.add(fFigureProcessingElementPersistentViewLabelFigure);

			fFigureProcessingElementPersistentViewFigure = new WrappingLabel();
			fFigureProcessingElementPersistentViewFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementPersistentViewFigure);

//			this.add(fFigureProcessingElementPersistentViewFigure,fConstraintFigure);

			fFigureProcessingElementTriggerTypeLabelFigure = new WrappingLabel();
			fFigureProcessingElementTriggerTypeLabelFigure.setText("trigger");
			fFigureLabelOrder.add(fFigureProcessingElementTriggerTypeLabelFigure);

//			this.add(fFigureProcessingElementTriggerTypeLabelFigure);

			fFigureProcessingElementTriggerTypeFigure = new WrappingLabel();
			fFigureProcessingElementTriggerTypeFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementTriggerTypeFigure);

//			this.add(fFigureProcessingElementTriggerTypeFigure,fConstraintFigure);

			fFigureProcessingElementTriggerpredicateLabelFigure = new WrappingLabel();
			fFigureProcessingElementTriggerpredicateLabelFigure.setText("trig pred");
			fFigureLabelOrder.add(fFigureProcessingElementTriggerpredicateLabelFigure);

//			this.add(fFigureProcessingElementTriggerpredicateLabelFigure);

			fFigureProcessingElementTriggerpredicateFigure = new WrappingLabel();
			fFigureProcessingElementTriggerpredicateFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementTriggerpredicateFigure);

//			this.add(fFigureProcessingElementTriggerpredicateFigure,fConstraintFigure);

			fFigureProcessingElementValidTimeLabelFigure = new WrappingLabel();
			fFigureProcessingElementValidTimeLabelFigure.setText("valid time");
			fFigureLabelOrder.add(fFigureProcessingElementValidTimeLabelFigure);

//			this.add(fFigureProcessingElementValidTimeLabelFigure);

			fFigureProcessingElementValidTimeFigure = new WrappingLabel();
			fFigureProcessingElementValidTimeFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementValidTimeFigure);

//			this.add(fFigureProcessingElementValidTimeFigure,fConstraintFigure);

			fFigureProcessingElementTransactionTimeLabelFigure = new WrappingLabel();
			fFigureProcessingElementTransactionTimeLabelFigure.setText("trans time");
			fFigureLabelOrder.add(fFigureProcessingElementTransactionTimeLabelFigure);

//			this.add(fFigureProcessingElementTransactionTimeLabelFigure);

			fFigureProcessingElementTransactionTimeFigure = new WrappingLabel();
			fFigureProcessingElementTransactionTimeFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementTransactionTimeFigure);

//			this.add(fFigureProcessingElementTransactionTimeFigure,fConstraintFigure);

			fFigureProcessingElementInputOutputMappingTypeLabelFigure = new WrappingLabel();
			fFigureProcessingElementInputOutputMappingTypeLabelFigure.setText("IO map type");
			fFigureLabelOrder.add(fFigureProcessingElementInputOutputMappingTypeLabelFigure);

//			this.add(fFigureProcessingElementInputOutputMappingTypeLabelFigure);

			fFigureProcessingElementInputOutputMappingTypeFigure = new WrappingLabel();
			fFigureProcessingElementInputOutputMappingTypeFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementInputOutputMappingTypeFigure);

//			this.add(fFigureProcessingElementInputOutputMappingTypeFigure,fConstraintFigure);

			fFigureProcessingElementProcessingDelayLabelFigure = new WrappingLabel();
			fFigureProcessingElementProcessingDelayLabelFigure.setText("proc delay");
			fFigureLabelOrder.add(fFigureProcessingElementProcessingDelayLabelFigure);

//			this.add(fFigureProcessingElementProcessingDelayLabelFigure);

			fFigureProcessingElementProcessingDelayFigure = new WrappingLabel();
			fFigureProcessingElementProcessingDelayFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementProcessingDelayFigure);

//			this.add(fFigureProcessingElementProcessingDelayFigure,fConstraintFigure);

			fFigureProcessingElementProcessingDelayDistributionLabelFigure = new WrappingLabel();
			fFigureProcessingElementProcessingDelayDistributionLabelFigure.setText("proc del dist");
			fFigureLabelOrder.add(fFigureProcessingElementProcessingDelayDistributionLabelFigure);

//			this.add(fFigureProcessingElementProcessingDelayDistributionLabelFigure);

			fFigureProcessingElementProcessingDelayDistributionFigure = new WrappingLabel();
			fFigureProcessingElementProcessingDelayDistributionFigure.setText("<...>");
			fFigureOrder.add(fFigureProcessingElementProcessingDelayDistributionFigure);

//			this.add(fFigureProcessingElementProcessingDelayDistributionFigure,fConstraintFigure);
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
		public WrappingLabel getFigureProcessingElementNameFigure() {
			return fFigureProcessingElementNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementViewFigure() {
			return fFigureProcessingElementViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementPersistentViewFigure() {
			return fFigureProcessingElementPersistentViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementValidTimeFigure() {
			return fFigureProcessingElementValidTimeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementTransactionTimeFigure() {
			return fFigureProcessingElementTransactionTimeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementTriggerTypeFigure() {
			return fFigureProcessingElementTriggerTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementTriggerpredicateFigure() {
			return fFigureProcessingElementTriggerpredicateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementPeTypeFigure() {
			return fFigureProcessingElementPeTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementFunctorTypeFigure() {
			return fFigureProcessingElementFunctorTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementInputOutputMappingTypeFigure() {
			return fFigureProcessingElementInputOutputMappingTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementProcessingDelayFigure() {
			return fFigureProcessingElementProcessingDelayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementProcessingDelayDistributionFigure() {
			return fFigureProcessingElementProcessingDelayDistributionFigure;
		}

		public void updateFace() {
			EditPart diagram = ProcessingElementEditPart.this.getParent();

			StandardSensorDataWeb sdw = (StandardSensorDataWeb) ((Diagram) diagram.getModel()).getElement();

			List children = this.getChildren();
			int j = children.size()-1;
			for(int i=fFigureOrder.size()-1;i>=0;i--){
				if(children.get(j)==fFigureOrder.get(i)){
					if(!mapping[i][sdw.getDiagramType().getValue()] && i!=1){
						this.remove(fFigureOrder.get(i));
						// remove also the corresponding label
						this.remove(fFigureLabelOrder.get(i));

					}
					j=j-2;
				} else {
					if(mapping[i][sdw.getDiagramType().getValue()] && i!=1){
						this.add(fFigureLabelOrder.get(i),j+1);
						this.add(fFigureOrder.get(i),fConstraintFigure,j+2);
					} 				
				}
			}
//			updateFaceFunctor(true);
		}

		public void updateFaceFunctor(boolean remove){
			if(remove){
				this.remove(fFigureLabelOrder.get(1));
				this.remove(fFigureOrder.get(1));
			} else {
				if (!this.getChildren().contains(fFigureLabelOrder.get(1))&&
						this.getChildren().contains(fFigureOrder.get(0))){
					int i = this.getChildren().indexOf(fFigureOrder.get(0));
					this.add(fFigureLabelOrder.get(1),i+1);
					this.add(fFigureOrder.get(1),fConstraintFigure,i+2);
				}
			}

		}
	}

}
