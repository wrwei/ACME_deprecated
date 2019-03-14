package assuranceCase.diagram.providers;

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
		ElementInitializers cached = assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
