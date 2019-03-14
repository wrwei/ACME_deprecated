package assuranceCase.diagram.preferences;

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
		assuranceCase.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		assuranceCase.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		assuranceCase.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		assuranceCase.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		assuranceCase.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
