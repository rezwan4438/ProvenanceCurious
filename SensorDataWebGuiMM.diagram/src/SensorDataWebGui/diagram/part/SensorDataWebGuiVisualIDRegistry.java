package SensorDataWebGui.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SensorDataWebGuiVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "SensorDataWebGuiMM.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
					.equals(view.getType())) {
				return SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SensorDataWebGui.diagram.part.SensorDataWebGuiDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
				.getStandardSensorDataWeb().isSuperTypeOf(
						domainElement.eClass())
				&& isDiagram((SensorDataWebGui.StandardSensorDataWeb) domainElement)) {
			return SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated NOT
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getModelID(containerView);
		if (!SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID:
			if (SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE.getSource()
					.isSuperTypeOf(domainElement.eClass())
//					&& isSource_2001((SensorDataWebGui.Source) domainElement)
					) {
				return SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID;
			}
			if (SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement().isSuperTypeOf(
							domainElement.eClass())) {
				return SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getModelID(containerView);
		if (!SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
			if (SensorDataWebGui.diagram.edit.parts.SourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID:
			if (SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID:
			if (SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID:
			if (SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID:
			if (SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE.getFixedWindow()
				.isSuperTypeOf(domainElement.eClass())) {
			return SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID;
		}
		if (SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE.getTupleWindow()
				.isSuperTypeOf(domainElement.eClass())) {
			return SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID;
		}
		if (SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE.getTimeWindow()
				.isSuperTypeOf(domainElement.eClass())) {
			return SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			SensorDataWebGui.StandardSensorDataWeb element) {
		return true;
	}

//	/**
//	 * @generated
//	 */
//	private static boolean isSource_2001(SensorDataWebGui.Source domainElement) {
//		// FIXME: implement this method 
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException(
//				"No java implementation provided in 'isSource_2001' operation"); //$NON-NLS-1$
//	}

}
