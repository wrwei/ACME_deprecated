package gsn.diagram.providers;

import gsn.diagram.part.GsnDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GsnDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			GsnDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
