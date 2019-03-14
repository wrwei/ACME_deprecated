package argumentation.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import argumentation.diagram.providers.ArgumentationElementTypes;
import argumentation.diagram.providers.ArgumentationModelingAssistantProvider;

/**
 * @generated
 */
public class ArgumentationModelingAssistantProviderOfArgumentPackageCanvasEditPart
		extends ArgumentationModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(12);
		types.add(ArgumentationElementTypes.ArgumentPackage_2201);
		types.add(ArgumentationElementTypes.ArgumentPackageInterface_2202);
		types.add(ArgumentationElementTypes.ArgumentPackageBinding_2203);
		types.add(ArgumentationElementTypes.ArgumentGroup_2204);
		types.add(ArgumentationElementTypes.Claim_2205);
		types.add(ArgumentationElementTypes.ArtifactReference_2206);
		types.add(ArgumentationElementTypes.ArgumentReasoning_2207);
		types.add(ArgumentationElementTypes.AssertedInference_2208);
		types.add(ArgumentationElementTypes.AssertedContext_2209);
		types.add(ArgumentationElementTypes.AssertedEvidence_2210);
		types.add(ArgumentationElementTypes.AssertedArtifactContext_2211);
		types.add(ArgumentationElementTypes.AssertedArtifactSupport_2212);
		return types;
	}

}
