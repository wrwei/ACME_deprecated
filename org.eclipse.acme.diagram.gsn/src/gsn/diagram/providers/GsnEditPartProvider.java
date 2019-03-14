package gsn.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import gsn.diagram.edit.parts.GsnEditPart;
import gsn.diagram.edit.parts.GsnEditPartFactory;
import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class GsnEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public GsnEditPartProvider() {
		super(new GsnEditPartFactory(), GsnVisualIDRegistry.TYPED_INSTANCE, GsnEditPart.MODEL_ID);
	}

}
