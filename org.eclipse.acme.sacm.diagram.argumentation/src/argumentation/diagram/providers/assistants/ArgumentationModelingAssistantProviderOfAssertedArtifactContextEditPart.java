package argumentation.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import argumentation.diagram.edit.parts.ArgumentReasoningEditPart;
import argumentation.diagram.edit.parts.ArtifactReferenceEditPart;
import argumentation.diagram.edit.parts.AssertedArtifactContextEditPart;
import argumentation.diagram.edit.parts.AssertedArtifactSupportEditPart;
import argumentation.diagram.edit.parts.AssertedContextEditPart;
import argumentation.diagram.edit.parts.AssertedEvidenceEditPart;
import argumentation.diagram.edit.parts.AssertedInferenceEditPart;
import argumentation.diagram.edit.parts.ClaimEditPart;
import argumentation.diagram.providers.ArgumentationElementTypes;
import argumentation.diagram.providers.ArgumentationModelingAssistantProvider;

/**
 * @generated
 */
public class ArgumentationModelingAssistantProviderOfAssertedArtifactContextEditPart
		extends ArgumentationModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AssertedArtifactContextEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(AssertedArtifactContextEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ArgumentationElementTypes.AssertionMetaClaim_4201);
		types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		types.add(ArgumentationElementTypes.AssertedRelationshipReasoning_4204);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((AssertedArtifactContextEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(AssertedArtifactContextEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClaimEditPart) {
			types.add(ArgumentationElementTypes.AssertionMetaClaim_4201);
		}
		if (targetEditPart instanceof ClaimEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof ArtifactReferenceEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof ArgumentReasoningEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof AssertedInferenceEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof AssertedContextEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof AssertedEvidenceEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof AssertedArtifactContextEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof AssertedArtifactSupportEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipSource_4202);
		}
		if (targetEditPart instanceof ClaimEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof ArtifactReferenceEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof ArgumentReasoningEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof AssertedInferenceEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof AssertedContextEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof AssertedEvidenceEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof AssertedArtifactContextEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof AssertedArtifactSupportEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		}
		if (targetEditPart instanceof ArgumentReasoningEditPart) {
			types.add(ArgumentationElementTypes.AssertedRelationshipReasoning_4204);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AssertedArtifactContextEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(AssertedArtifactContextEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ArgumentationElementTypes.AssertionMetaClaim_4201) {
			types.add(ArgumentationElementTypes.Claim_2205);
		} else if (relationshipType == ArgumentationElementTypes.AssertedRelationshipSource_4202) {
			types.add(ArgumentationElementTypes.Claim_2205);
			types.add(ArgumentationElementTypes.ArtifactReference_2206);
			types.add(ArgumentationElementTypes.ArgumentReasoning_2207);
			types.add(ArgumentationElementTypes.AssertedInference_2208);
			types.add(ArgumentationElementTypes.AssertedContext_2209);
			types.add(ArgumentationElementTypes.AssertedEvidence_2210);
			types.add(ArgumentationElementTypes.AssertedArtifactContext_2211);
			types.add(ArgumentationElementTypes.AssertedArtifactSupport_2212);
		} else if (relationshipType == ArgumentationElementTypes.AssertedRelationshipTarget_4203) {
			types.add(ArgumentationElementTypes.Claim_2205);
			types.add(ArgumentationElementTypes.ArtifactReference_2206);
			types.add(ArgumentationElementTypes.ArgumentReasoning_2207);
			types.add(ArgumentationElementTypes.AssertedInference_2208);
			types.add(ArgumentationElementTypes.AssertedContext_2209);
			types.add(ArgumentationElementTypes.AssertedEvidence_2210);
			types.add(ArgumentationElementTypes.AssertedArtifactContext_2211);
			types.add(ArgumentationElementTypes.AssertedArtifactSupport_2212);
		} else if (relationshipType == ArgumentationElementTypes.AssertedRelationshipReasoning_4204) {
			types.add(ArgumentationElementTypes.ArgumentReasoning_2207);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AssertedArtifactContextEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(AssertedArtifactContextEditPart target) {
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
		return doGetTypesForSource((AssertedArtifactContextEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(AssertedArtifactContextEditPart target,
			IElementType relationshipType) {
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
