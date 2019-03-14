package argumentation.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import argumentation.diagram.edit.commands.ArgumentGroupCreateCommand;
import argumentation.diagram.edit.commands.ArgumentPackageBindingCreateCommand;
import argumentation.diagram.edit.commands.ArgumentPackageCreateCommand;
import argumentation.diagram.edit.commands.ArgumentPackageInterfaceCreateCommand;
import argumentation.diagram.edit.commands.ArgumentReasoningCreateCommand;
import argumentation.diagram.edit.commands.ArtifactReferenceCreateCommand;
import argumentation.diagram.edit.commands.AssertedArtifactContextCreateCommand;
import argumentation.diagram.edit.commands.AssertedArtifactSupportCreateCommand;
import argumentation.diagram.edit.commands.AssertedContextCreateCommand;
import argumentation.diagram.edit.commands.AssertedEvidenceCreateCommand;
import argumentation.diagram.edit.commands.AssertedInferenceCreateCommand;
import argumentation.diagram.edit.commands.ClaimCreateCommand;
import argumentation.diagram.providers.ArgumentationElementTypes;

/**
 * @generated
 */
public class ArgumentPackageItemSemanticEditPolicy extends ArgumentationBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ArgumentPackageItemSemanticEditPolicy() {
		super(ArgumentationElementTypes.ArgumentPackage_1001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArgumentationElementTypes.ArgumentPackage_2201 == req.getElementType()) {
			return getGEFWrapper(new ArgumentPackageCreateCommand(req));
		}
		if (ArgumentationElementTypes.ArgumentPackageInterface_2202 == req.getElementType()) {
			return getGEFWrapper(new ArgumentPackageInterfaceCreateCommand(req));
		}
		if (ArgumentationElementTypes.ArgumentPackageBinding_2203 == req.getElementType()) {
			return getGEFWrapper(new ArgumentPackageBindingCreateCommand(req));
		}
		if (ArgumentationElementTypes.ArgumentGroup_2204 == req.getElementType()) {
			return getGEFWrapper(new ArgumentGroupCreateCommand(req));
		}
		if (ArgumentationElementTypes.Claim_2205 == req.getElementType()) {
			return getGEFWrapper(new ClaimCreateCommand(req));
		}
		if (ArgumentationElementTypes.ArtifactReference_2206 == req.getElementType()) {
			return getGEFWrapper(new ArtifactReferenceCreateCommand(req));
		}
		if (ArgumentationElementTypes.ArgumentReasoning_2207 == req.getElementType()) {
			return getGEFWrapper(new ArgumentReasoningCreateCommand(req));
		}
		if (ArgumentationElementTypes.AssertedInference_2208 == req.getElementType()) {
			return getGEFWrapper(new AssertedInferenceCreateCommand(req));
		}
		if (ArgumentationElementTypes.AssertedContext_2209 == req.getElementType()) {
			return getGEFWrapper(new AssertedContextCreateCommand(req));
		}
		if (ArgumentationElementTypes.AssertedEvidence_2210 == req.getElementType()) {
			return getGEFWrapper(new AssertedEvidenceCreateCommand(req));
		}
		if (ArgumentationElementTypes.AssertedArtifactContext_2211 == req.getElementType()) {
			return getGEFWrapper(new AssertedArtifactContextCreateCommand(req));
		}
		if (ArgumentationElementTypes.AssertedArtifactSupport_2212 == req.getElementType()) {
			return getGEFWrapper(new AssertedArtifactSupportCreateCommand(req));
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
