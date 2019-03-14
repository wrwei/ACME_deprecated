package argumentation.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import argumentation.diagram.providers.ArgumentationElementTypes;

/**
 * @generated
 */
public class AssertedRelationshipReasoningItemSemanticEditPolicy extends ArgumentationBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AssertedRelationshipReasoningItemSemanticEditPolicy() {
		super(ArgumentationElementTypes.AssertedRelationshipReasoning_4204);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
