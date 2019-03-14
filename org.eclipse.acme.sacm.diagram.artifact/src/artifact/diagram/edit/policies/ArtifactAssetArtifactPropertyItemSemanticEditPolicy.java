package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactAssetArtifactPropertyItemSemanticEditPolicy extends ArtifactBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ArtifactAssetArtifactPropertyItemSemanticEditPolicy() {
		super(ArtifactElementTypes.ArtifactAssetArtifactProperty_4102);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
