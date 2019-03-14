package gsn.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import gsn.diagram.part.GsnVisualIDRegistry;

/**
 * @generated
 */
public class GsnEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GsnVisualIDRegistry.getVisualID(view)) {

			case GsnEditPart.VISUAL_ID:
				return new GsnEditPart(view);

			case ModuleEditPart.VISUAL_ID:
				return new ModuleEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ContractModuleEditPart.VISUAL_ID:
				return new ContractModuleEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case GoalEditPart.VISUAL_ID:
				return new GoalEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case StrategyEditPart.VISUAL_ID:
				return new StrategyEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case SolutionEditPart.VISUAL_ID:
				return new SolutionEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case JustificationEditPart.VISUAL_ID:
				return new JustificationEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case AssumptionEditPart.VISUAL_ID:
				return new AssumptionEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case ModuleReferenceEditPart.VISUAL_ID:
				return new ModuleReferenceEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			case WrappingLabel18EditPart.VISUAL_ID:
				return new WrappingLabel18EditPart(view);

			case ChoiceNodeEditPart.VISUAL_ID:
				return new ChoiceNodeEditPart(view);

			case WrappingLabel19EditPart.VISUAL_ID:
				return new WrappingLabel19EditPart(view);

			case ContractModuleReferenceEditPart.VISUAL_ID:
				return new ContractModuleReferenceEditPart(view);

			case WrappingLabel20EditPart.VISUAL_ID:
				return new WrappingLabel20EditPart(view);

			case WrappingLabel21EditPart.VISUAL_ID:
				return new WrappingLabel21EditPart(view);

			case AwayGoalEditPart.VISUAL_ID:
				return new AwayGoalEditPart(view);

			case WrappingLabel22EditPart.VISUAL_ID:
				return new WrappingLabel22EditPart(view);

			case WrappingLabel23EditPart.VISUAL_ID:
				return new WrappingLabel23EditPart(view);

			case WrappingLabel24EditPart.VISUAL_ID:
				return new WrappingLabel24EditPart(view);

			case AwayContextEditPart.VISUAL_ID:
				return new AwayContextEditPart(view);

			case WrappingLabel25EditPart.VISUAL_ID:
				return new WrappingLabel25EditPart(view);

			case WrappingLabel26EditPart.VISUAL_ID:
				return new WrappingLabel26EditPart(view);

			case WrappingLabel27EditPart.VISUAL_ID:
				return new WrappingLabel27EditPart(view);

			case AwaySolutionEditPart.VISUAL_ID:
				return new AwaySolutionEditPart(view);

			case WrappingLabel28EditPart.VISUAL_ID:
				return new WrappingLabel28EditPart(view);

			case WrappingLabel29EditPart.VISUAL_ID:
				return new WrappingLabel29EditPart(view);

			case WrappingLabel30EditPart.VISUAL_ID:
				return new WrappingLabel30EditPart(view);

			case SupportedByEditPart.VISUAL_ID:
				return new SupportedByEditPart(view);

			case WrappingLabel31EditPart.VISUAL_ID:
				return new WrappingLabel31EditPart(view);

			case InContextOfEditPart.VISUAL_ID:
				return new InContextOfEditPart(view);

			case WrappingLabel32EditPart.VISUAL_ID:
				return new WrappingLabel32EditPart(view);

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
