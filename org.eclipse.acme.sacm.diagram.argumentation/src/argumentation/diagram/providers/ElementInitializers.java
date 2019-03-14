package argumentation.diagram.providers;

import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;

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
		ElementInitializers cached = ArgumentationDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ArgumentationDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
