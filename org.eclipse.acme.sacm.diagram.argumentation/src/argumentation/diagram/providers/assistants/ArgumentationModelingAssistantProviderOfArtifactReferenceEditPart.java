package argumentation.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import argumentation.diagram.edit.parts.ArtifactReferenceEditPart;
import argumentation.diagram.providers.ArgumentationElementTypes;
import argumentation.diagram.providers.ArgumentationModelingAssistantProvider;

/**
 * @generated
 */
public class ArgumentationModelingAssistantProviderOfArtifactReferenceEditPart
		extends ArgumentationModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ArtifactReferenceEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ArtifactReferenceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ArtifactReferenceEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ArtifactReferenceEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ArgumentationElementTypes.AssertedRelationshipSource_4202) {
			types.add(ArgumentationElementTypes.AssertedInference_2208);
			types.add(ArgumentationElementTypes.AssertedContext_2209);
			types.add(ArgumentationElementTypes.AssertedEvidence_2210);
			types.add(ArgumentationElementTypes.AssertedArtifactContext_2211);
			types.add(ArgumentationElementTypes.AssertedArtifactSupport_2212);
		} else if (relationshipType == ArgumentationElementTypes.AssertedRelationshipTarget_4203) {
			types.add(ArgumentationElementTypes.AssertedInference_2208);
			types.add(ArgumentationElementTypes.AssertedContext_2209);
			types.add(ArgumentationElementTypes.AssertedEvidence_2210);
			types.add(ArgumentationElementTypes.AssertedArtifactContext_2211);
			types.add(ArgumentationElementTypes.AssertedArtifactSupport_2212);
		}
		return types;
	}

}
