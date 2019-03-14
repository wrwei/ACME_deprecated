package artifact.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import artifact.diagram.edit.commands.ActivityCreateCommand;
import artifact.diagram.edit.commands.ArtifactCreateCommand;
import artifact.diagram.edit.commands.ArtifactGroupCreateCommand;
import artifact.diagram.edit.commands.ArtifactPackageBindingCreateCommand;
import artifact.diagram.edit.commands.ArtifactPackageCreateCommand;
import artifact.diagram.edit.commands.ArtifactPackageInterfaceCreateCommand;
import artifact.diagram.edit.commands.EventCreateCommand;
import artifact.diagram.edit.commands.ParticipantCreateCommand;
import artifact.diagram.edit.commands.PropertyCreateCommand;
import artifact.diagram.edit.commands.ResourceCreateCommand;
import artifact.diagram.edit.commands.TechniqueCreateCommand;
import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactPackageItemSemanticEditPolicy extends ArtifactBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ArtifactPackageItemSemanticEditPolicy() {
		super(ArtifactElementTypes.ArtifactPackage_1002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArtifactElementTypes.ArtifactPackage_2101 == req.getElementType()) {
			return getGEFWrapper(new ArtifactPackageCreateCommand(req));
		}
		if (ArtifactElementTypes.ArtifactPackageInterface_2102 == req.getElementType()) {
			return getGEFWrapper(new ArtifactPackageInterfaceCreateCommand(req));
		}
		if (ArtifactElementTypes.ArtifactPackageBinding_2103 == req.getElementType()) {
			return getGEFWrapper(new ArtifactPackageBindingCreateCommand(req));
		}
		if (ArtifactElementTypes.ArtifactGroup_2111 == req.getElementType()) {
			return getGEFWrapper(new ArtifactGroupCreateCommand(req));
		}
		if (ArtifactElementTypes.Technique_2104 == req.getElementType()) {
			return getGEFWrapper(new TechniqueCreateCommand(req));
		}
		if (ArtifactElementTypes.Activity_2105 == req.getElementType()) {
			return getGEFWrapper(new ActivityCreateCommand(req));
		}
		if (ArtifactElementTypes.Participant_2106 == req.getElementType()) {
			return getGEFWrapper(new ParticipantCreateCommand(req));
		}
		if (ArtifactElementTypes.Artifact_2107 == req.getElementType()) {
			return getGEFWrapper(new ArtifactCreateCommand(req));
		}
		if (ArtifactElementTypes.Resource_2108 == req.getElementType()) {
			return getGEFWrapper(new ResourceCreateCommand(req));
		}
		if (ArtifactElementTypes.Property_2109 == req.getElementType()) {
			return getGEFWrapper(new PropertyCreateCommand(req));
		}
		if (ArtifactElementTypes.Event_2110 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
