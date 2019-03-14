package argumentation.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import argumentation.diagram.edit.parts.ClaimEditPart;
import argumentation.diagram.providers.ArgumentationElementTypes;
import argumentation.diagram.providers.ArgumentationModelingAssistantProvider;

/**
 * @generated
 */
public class ArgumentationModelingAssistantProviderOfClaimEditPart extends ArgumentationModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClaimEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClaimEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ArgumentationElementTypes.AssertionMetaClaim_4201);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClaimEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClaimEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClaimEditPart) {
			types.add(ArgumentationElementTypes.AssertionMetaClaim_4201);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClaimEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClaimEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ArgumentationElementTypes.AssertionMetaClaim_4201) {
			types.add(ArgumentationElementTypes.Claim_2205);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClaimEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClaimEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ArgumentationElementTypes.AssertionMetaClaim_4201);
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
		return doGetTypesForSource((ClaimEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClaimEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ArgumentationElementTypes.AssertionMetaClaim_4201) {
			types.add(ArgumentationElementTypes.Claim_2205);
			types.add(ArgumentationElementTypes.AssertedInference_2208);
			types.add(ArgumentationElementTypes.AssertedContext_2209);
			types.add(ArgumentationElementTypes.AssertedEvidence_2210);
			types.add(ArgumentationElementTypes.AssertedArtifactContext_2211);
			types.add(ArgumentationElementTypes.AssertedArtifactSupport_2212);
		} else if (relationshipType == ArgumentationElementTypes.AssertedRelationshipSource_4202) {
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
