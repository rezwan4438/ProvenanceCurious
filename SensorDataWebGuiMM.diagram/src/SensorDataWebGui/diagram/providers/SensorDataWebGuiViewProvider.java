package SensorDataWebGui.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import SensorDataWebGui.DiagramTypes;
import SensorDataWebGui.StandardSensorDataWeb;

/**
 * @generated
 */
public class SensorDataWebGuiViewProvider extends AbstractProvider implements
		IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
				.equals(op.getSemanticHint())
				&& SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
						.equals(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
				case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID == visualID
				|| SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram
				.setType(SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {
		case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
			return createSource_2001(domainElement, containerView, index,
					persisted, preferencesHint);
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
			return createProcessingElement_2002(domainElement, containerView,
					index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getVisualID(elementTypeHint)) {
		case SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID:
			return createFixedWindow_4001(getSemanticElement(semanticAdapter),
					containerView, index, persisted, preferencesHint);
		case SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID:
			return createTupleWindow_4002(getSemanticElement(semanticAdapter),
					containerView, index, persisted, preferencesHint);
		case SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID:
			return createTimeWindow_4003(getSemanticElement(semanticAdapter),
					containerView, index, persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createSource_2001(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node
				.setType(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
				.getLineStyle_LineColor(), FigureUtilities
				.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
				.getFillStyle_FillColor(), FigureUtilities
				.RGBToInteger(fillRGB));
		Node label5001 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceNameEditPart.VISUAL_ID));
		Node label5030 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart.VISUAL_ID));
		Node label5031 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart.VISUAL_ID));
		Node label5032 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart.VISUAL_ID));
		Node label5033 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceViewEditPart.VISUAL_ID));
		Node label5034 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart.VISUAL_ID));
		Node label5035 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart.VISUAL_ID));
		Node label5036 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart.VISUAL_ID));
		Node label5037 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart.VISUAL_ID));
		Node label5050 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createProcessingElement_2002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node
				.setType(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
				.getLineStyle_LineColor(), FigureUtilities
				.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
				.getFillStyle_FillColor(), FigureUtilities
				.RGBToInteger(fillRGB));
		Node label5013 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart.VISUAL_ID));
		Node label5039 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart.VISUAL_ID));
		Node label5040 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart.VISUAL_ID));
		Node label5041 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart.VISUAL_ID));
		Node label5042 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart.VISUAL_ID));
		Node label5043 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart.VISUAL_ID));
		Node label5044 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart.VISUAL_ID));
		Node label5045 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart.VISUAL_ID));
		Node label5046 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart.VISUAL_ID));
		Node label5047 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart.VISUAL_ID));
		Node label5048 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart.VISUAL_ID));
		Node label5049 = createLabel(
				node,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createFixedWindow_4001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList points = new ArrayList(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge
				.setType(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
				.getLineStyle_LineColor(), FigureUtilities
				.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
					.getRoutingStyle_Routing(), routing);
		}
		Node label6001 = createLabel(
				edge,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart.VISUAL_ID));
		label6001.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6001 = (Location) label6001.getLayoutConstraint();
		location6001.setX(0);
		location6001.setY(40);
		Node label6002 = createLabel(
				edge,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart.VISUAL_ID));
		label6002.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6002 = (Location) label6002.getLayoutConstraint();
		location6002.setX(0);
		location6002.setY(60);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createTupleWindow_4002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList points = new ArrayList(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge
				.setType(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
				.getLineStyle_LineColor(), FigureUtilities
				.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
					.getRoutingStyle_Routing(), routing);
		}
		Node label6003 = createLabel(
				edge,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart.VISUAL_ID));
		label6003.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6003 = (Location) label6003.getLayoutConstraint();
		location6003.setX(0);
		location6003.setY(40);
		Node label6004 = createLabel(
				edge,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart.VISUAL_ID));
		label6004.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6004 = (Location) label6004.getLayoutConstraint();
		location6004.setX(0);
		location6004.setY(60);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createTimeWindow_4003(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList points = new ArrayList(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge
				.setType(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
				.getLineStyle_LineColor(), FigureUtilities
				.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
					.getRoutingStyle_Routing(), routing);
		}
		Node label6005 = createLabel(
				edge,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart.VISUAL_ID));
		label6005.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6005 = (Location) label6005.getLayoutConstraint();
		location6005.setX(0);
		location6005.setY(40);
		Node label6006 = createLabel(
				edge,
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart.VISUAL_ID));
		label6006.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6006 = (Location) label6006.getLayoutConstraint();
		location6006.setX(0);
		location6006.setY(60);
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
				.equals(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put(
							"modelID", SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(TransactionUtil
					.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
