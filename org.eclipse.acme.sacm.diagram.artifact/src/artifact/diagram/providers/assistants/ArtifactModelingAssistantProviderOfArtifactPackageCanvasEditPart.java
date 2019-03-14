package artifact.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import artifact.diagram.providers.ArtifactElementTypes;
import artifact.diagram.providers.ArtifactModelingAssistantProvider;

/**
 * @generated
 */
public class ArtifactModelingAssistantProviderOfArtifactPackageCanvasEditPart
		extends ArtifactModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(ArtifactElementTypes.ArtifactPackage_2101);
		types.add(ArtifactElementTypes.ArtifactPackageInterface_2102);
		types.add(ArtifactElementTypes.ArtifactPackageBinding_2103);
		types.add(ArtifactElementTypes.ArtifactGroup_2111);
		types.add(ArtifactElementTypes.Technique_2104);
		types.add(ArtifactElementTypes.Activity_2105);
		types.add(ArtifactElementTypes.Participant_2106);
		types.add(ArtifactElementTypes.Artifact_2107);
		types.add(ArtifactElementTypes.Resource_2108);
		types.add(ArtifactElementTypes.Property_2109);
		types.add(ArtifactElementTypes.Event_2110);
		return types;
	}

}
