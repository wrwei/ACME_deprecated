package argumentation.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import argumentation.diagram.part.ArgumentationVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentationEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ArgumentationVisualIDRegistry.getVisualID(view)) {

			case ArgumentPackageCanvasEditPart.VISUAL_ID:
				return new ArgumentPackageCanvasEditPart(view);

			case ArgumentPackageEditPart.VISUAL_ID:
				return new ArgumentPackageEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ArgumentPackageInterfaceEditPart.VISUAL_ID:
				return new ArgumentPackageInterfaceEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ArgumentPackageBindingEditPart.VISUAL_ID:
				return new ArgumentPackageBindingEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case ArgumentGroupEditPart.VISUAL_ID:
				return new ArgumentGroupEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case ClaimEditPart.VISUAL_ID:
				return new ClaimEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ArtifactReferenceEditPart.VISUAL_ID:
				return new ArtifactReferenceEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case ArgumentReasoningEditPart.VISUAL_ID:
				return new ArgumentReasoningEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case AssertedInferenceEditPart.VISUAL_ID:
				return new AssertedInferenceEditPart(view);

			case AssertedContextEditPart.VISUAL_ID:
				return new AssertedContextEditPart(view);

			case AssertedEvidenceEditPart.VISUAL_ID:
				return new AssertedEvidenceEditPart(view);

			case AssertedArtifactContextEditPart.VISUAL_ID:
				return new AssertedArtifactContextEditPart(view);

			case AssertedArtifactSupportEditPart.VISUAL_ID:
				return new AssertedArtifactSupportEditPart(view);

			case AssertionMetaClaimEditPart.VISUAL_ID:
				return new AssertionMetaClaimEditPart(view);

			case AssertedRelationshipSourceEditPart.VISUAL_ID:
				return new AssertedRelationshipSourceEditPart(view);

			case AssertedRelationshipTargetEditPart.VISUAL_ID:
				return new AssertedRelationshipTargetEditPart(view);

			case AssertedRelationshipReasoningEditPart.VISUAL_ID:
				return new AssertedRelationshipReasoningEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
