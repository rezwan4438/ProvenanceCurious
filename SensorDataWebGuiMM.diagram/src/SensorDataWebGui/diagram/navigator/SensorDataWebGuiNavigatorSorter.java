package SensorDataWebGui.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SensorDataWebGuiNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SensorDataWebGui.diagram.navigator.SensorDataWebGuiNavigatorItem) {
			SensorDataWebGui.diagram.navigator.SensorDataWebGuiNavigatorItem item = (SensorDataWebGui.diagram.navigator.SensorDataWebGuiNavigatorItem) element;
			return SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
