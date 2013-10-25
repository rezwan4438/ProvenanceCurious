package SensorDataWebGui.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		SensorDataWebGui.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		SensorDataWebGui.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		SensorDataWebGui.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		SensorDataWebGui.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		SensorDataWebGui.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return SensorDataWebGui.diagram.part.SensorDataWebGuiDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
