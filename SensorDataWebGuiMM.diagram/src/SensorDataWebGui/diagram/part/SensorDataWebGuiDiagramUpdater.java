package SensorDataWebGui.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SensorDataWebGuiDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getVisualID(view)) {
		case SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID:
			return getStandardSensorDataWeb_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStandardSensorDataWeb_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SensorDataWebGui.StandardSensorDataWeb modelElement = (SensorDataWebGui.StandardSensorDataWeb) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getContainsPEs().iterator(); it
				.hasNext();) {
			SensorDataWebGui.AbstractPE childElement = (SensorDataWebGui.AbstractPE) it
					.next();
			int visualID = SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID) {
				result
						.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID) {
				result
						.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getVisualID(view)) {
		case SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID:
			return getStandardSensorDataWeb_1000ContainedLinks(view);
		case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
			return getSource_2001ContainedLinks(view);
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
			return getProcessingElement_2002ContainedLinks(view);
		case SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID:
			return getFixedWindow_4001ContainedLinks(view);
		case SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID:
			return getTupleWindow_4002ContainedLinks(view);
		case SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID:
			return getTimeWindow_4003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getVisualID(view)) {
		case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
			return getSource_2001IncomingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
			return getProcessingElement_2002IncomingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID:
			return getFixedWindow_4001IncomingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID:
			return getTupleWindow_4002IncomingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID:
			return getTimeWindow_4003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
				.getVisualID(view)) {
		case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
			return getSource_2001OutgoingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
			return getProcessingElement_2002OutgoingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID:
			return getFixedWindow_4001OutgoingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID:
			return getTupleWindow_4002OutgoingLinks(view);
		case SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID:
			return getTimeWindow_4003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStandardSensorDataWeb_1000ContainedLinks(View view) {
		SensorDataWebGui.StandardSensorDataWeb modelElement = (SensorDataWebGui.StandardSensorDataWeb) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_FixedWindow_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_TupleWindow_4002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_TimeWindow_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSource_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcessingElement_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFixedWindow_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTupleWindow_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTimeWindow_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSource_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProcessingElement_2002IncomingLinks(View view) {
		SensorDataWebGui.ProcessingElement modelElement = (SensorDataWebGui.ProcessingElement) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_FixedWindow_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TupleWindow_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TimeWindow_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFixedWindow_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTupleWindow_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTimeWindow_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSource_2001OutgoingLinks(View view) {
		SensorDataWebGui.Source modelElement = (SensorDataWebGui.Source) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FixedWindow_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_TupleWindow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_TimeWindow_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProcessingElement_2002OutgoingLinks(View view) {
		SensorDataWebGui.ProcessingElement modelElement = (SensorDataWebGui.ProcessingElement) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_FixedWindow_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_TupleWindow_4002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_TimeWindow_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFixedWindow_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTupleWindow_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTimeWindow_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_FixedWindow_4001(
			SensorDataWebGui.StandardSensorDataWeb container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContainsArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SensorDataWebGui.FixedWindow) {
				continue;
			}
			SensorDataWebGui.FixedWindow link = (SensorDataWebGui.FixedWindow) linkObject;
			if (SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE dst = link.getArcToPE();
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							dst,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001,
							SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_TupleWindow_4002(
			SensorDataWebGui.StandardSensorDataWeb container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContainsArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SensorDataWebGui.TupleWindow) {
				continue;
			}
			SensorDataWebGui.TupleWindow link = (SensorDataWebGui.TupleWindow) linkObject;
			if (SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE dst = link.getArcToPE();
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							dst,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002,
							SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_TimeWindow_4003(
			SensorDataWebGui.StandardSensorDataWeb container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContainsArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SensorDataWebGui.TimeWindow) {
				continue;
			}
			SensorDataWebGui.TimeWindow link = (SensorDataWebGui.TimeWindow) linkObject;
			if (SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE dst = link.getArcToPE();
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							dst,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003,
							SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_FixedWindow_4001(
			SensorDataWebGui.ProcessingElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_ArcToPE()
					|| false == setting.getEObject() instanceof SensorDataWebGui.FixedWindow) {
				continue;
			}
			SensorDataWebGui.FixedWindow link = (SensorDataWebGui.FixedWindow) setting
					.getEObject();
			if (SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							target,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001,
							SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_TupleWindow_4002(
			SensorDataWebGui.ProcessingElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_ArcToPE()
					|| false == setting.getEObject() instanceof SensorDataWebGui.TupleWindow) {
				continue;
			}
			SensorDataWebGui.TupleWindow link = (SensorDataWebGui.TupleWindow) setting
					.getEObject();
			if (SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							target,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002,
							SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_TimeWindow_4003(
			SensorDataWebGui.ProcessingElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_ArcToPE()
					|| false == setting.getEObject() instanceof SensorDataWebGui.TimeWindow) {
				continue;
			}
			SensorDataWebGui.TimeWindow link = (SensorDataWebGui.TimeWindow) setting
					.getEObject();
			if (SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							target,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003,
							SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_FixedWindow_4001(
			SensorDataWebGui.AbstractPE source) {
		SensorDataWebGui.StandardSensorDataWeb container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SensorDataWebGui.StandardSensorDataWeb) {
				container = (SensorDataWebGui.StandardSensorDataWeb) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContainsArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SensorDataWebGui.FixedWindow) {
				continue;
			}
			SensorDataWebGui.FixedWindow link = (SensorDataWebGui.FixedWindow) linkObject;
			if (SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE dst = link.getArcToPE();
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			if (src != source) {
				continue;
			}
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							dst,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001,
							SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_TupleWindow_4002(
			SensorDataWebGui.AbstractPE source) {
		SensorDataWebGui.StandardSensorDataWeb container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SensorDataWebGui.StandardSensorDataWeb) {
				container = (SensorDataWebGui.StandardSensorDataWeb) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContainsArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SensorDataWebGui.TupleWindow) {
				continue;
			}
			SensorDataWebGui.TupleWindow link = (SensorDataWebGui.TupleWindow) linkObject;
			if (SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE dst = link.getArcToPE();
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			if (src != source) {
				continue;
			}
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							dst,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002,
							SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_TimeWindow_4003(
			SensorDataWebGui.AbstractPE source) {
		SensorDataWebGui.StandardSensorDataWeb container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SensorDataWebGui.StandardSensorDataWeb) {
				container = (SensorDataWebGui.StandardSensorDataWeb) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContainsArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SensorDataWebGui.TimeWindow) {
				continue;
			}
			SensorDataWebGui.TimeWindow link = (SensorDataWebGui.TimeWindow) linkObject;
			if (SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID != SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SensorDataWebGui.AbstractPE dst = link.getArcToPE();
			SensorDataWebGui.AbstractPE src = link.getArcFromPE();
			if (src != source) {
				continue;
			}
			result
					.add(new SensorDataWebGui.diagram.part.SensorDataWebGuiLinkDescriptor(
							src,
							dst,
							link,
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003,
							SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID));
		}
		return result;
	}

}
