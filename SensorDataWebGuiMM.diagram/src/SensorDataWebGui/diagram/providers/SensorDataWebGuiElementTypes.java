package SensorDataWebGui.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class SensorDataWebGuiElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private SensorDataWebGuiElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType StandardSensorDataWeb_1000 = getElementType("SensorDataWebGuiMM.diagram.StandardSensorDataWeb_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Source_2001 = getElementType("SensorDataWebGuiMM.diagram.Source_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessingElement_2002 = getElementType("SensorDataWebGuiMM.diagram.ProcessingElement_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FixedWindow_4001 = getElementType("SensorDataWebGuiMM.diagram.FixedWindow_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TupleWindow_4002 = getElementType("SensorDataWebGuiMM.diagram.TupleWindow_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeWindow_4003 = getElementType("SensorDataWebGuiMM.diagram.TimeWindow_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return SensorDataWebGui.diagram.part.SensorDataWebGuiDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(StandardSensorDataWeb_1000,
					SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
							.getStandardSensorDataWeb());

			elements.put(Source_2001,
					SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
							.getSource());

			elements.put(ProcessingElement_2002,
					SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
							.getProcessingElement());

			elements.put(FixedWindow_4001,
					SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
							.getFixedWindow());

			elements.put(TupleWindow_4002,
					SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
							.getTupleWindow());

			elements.put(TimeWindow_4003,
					SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
							.getTimeWindow());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(StandardSensorDataWeb_1000);
			KNOWN_ELEMENT_TYPES.add(Source_2001);
			KNOWN_ELEMENT_TYPES.add(ProcessingElement_2002);
			KNOWN_ELEMENT_TYPES.add(FixedWindow_4001);
			KNOWN_ELEMENT_TYPES.add(TupleWindow_4002);
			KNOWN_ELEMENT_TYPES.add(TimeWindow_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID:
			return StandardSensorDataWeb_1000;
		case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
			return Source_2001;
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
			return ProcessingElement_2002;
		case SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID:
			return FixedWindow_4001;
		case SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID:
			return TupleWindow_4002;
		case SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID:
			return TimeWindow_4003;
		}
		return null;
	}

}
