package artifact.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import artifact.diagram.edit.parts.ArtifactEditPartFactory;
import artifact.diagram.edit.parts.ArtifactPackageCanvasEditPart;
import artifact.diagram.part.ArtifactVisualIDRegistry;

/**
 * @generated
 */
public class ArtifactEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ArtifactEditPartProvider() {
		super(new ArtifactEditPartFactory(), ArtifactVisualIDRegistry.TYPED_INSTANCE,
				ArtifactPackageCanvasEditPart.MODEL_ID);
	}

}
