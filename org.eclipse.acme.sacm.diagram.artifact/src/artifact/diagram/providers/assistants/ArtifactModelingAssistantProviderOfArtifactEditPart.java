package artifact.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import artifact.diagram.edit.parts.ActivityEditPart;
import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.EventEditPart;
import artifact.diagram.edit.parts.ParticipantEditPart;
import artifact.diagram.edit.parts.PropertyEditPart;
import artifact.diagram.edit.parts.ResourceEditPart;
import artifact.diagram.edit.parts.TechniqueEditPart;
import artifact.diagram.providers.ArtifactElementTypes;
import artifact.diagram.providers.ArtifactModelingAssistantProvider;

/**
 * @generated
 */
public class ArtifactModelingAssistantProviderOfArtifactEditPart extends ArtifactModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ArtifactEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ArtifactEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		types.add(ArtifactElementTypes.ArtifactAssetArtifactProperty_4102);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ArtifactEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ArtifactEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TechniqueEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		}
		if (targetEditPart instanceof ParticipantEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		}
		if (targetEditPart instanceof ArtifactEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		}
		if (targetEditPart instanceof ResourceEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		}
		if (targetEditPart instanceof PropertyEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		}
		if (targetEditPart instanceof EventEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		}
		if (targetEditPart instanceof PropertyEditPart) {
			types.add(ArtifactElementTypes.ArtifactAssetArtifactProperty_4102);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ArtifactEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ArtifactEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ArtifactElementTypes.ArtifactAssetRelationship_4101) {
			types.add(ArtifactElementTypes.Technique_2104);
			types.add(ArtifactElementTypes.Activity_2105);
			types.add(ArtifactElementTypes.Participant_2106);
			types.add(ArtifactElementTypes.Artifact_2107);
			types.add(ArtifactElementTypes.Resource_2108);
			types.add(ArtifactElementTypes.Property_2109);
			types.add(ArtifactElementTypes.Event_2110);
		} else if (relationshipType == ArtifactElementTypes.ArtifactAssetArtifactProperty_4102) {
			types.add(ArtifactElementTypes.Property_2109);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ArtifactEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ArtifactEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ArtifactElementTypes.ArtifactAssetRelationship_4101);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ArtifactEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ArtifactEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ArtifactElementTypes.ArtifactAssetRelationship_4101) {
			types.add(ArtifactElementTypes.Technique_2104);
			types.add(ArtifactElementTypes.Activity_2105);
			types.add(ArtifactElementTypes.Participant_2106);
			types.add(ArtifactElementTypes.Artifact_2107);
			types.add(ArtifactElementTypes.Resource_2108);
			types.add(ArtifactElementTypes.Property_2109);
			types.add(ArtifactElementTypes.Event_2110);
		}
		return types;
	}

}
