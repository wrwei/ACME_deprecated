package assuranceCase.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class AssurancecaseEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (assuranceCase.diagram.part.AssurancecaseVisualIDRegistry.getVisualID(view)) {

			case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart(view);

			case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabelEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel2EditPart(view);

			case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel9EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel10EditPart(view);

			case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel11EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel12EditPart(view);

			case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ArgumentPackageEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel7EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel8EditPart(view);

			case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel3EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel4EditPart(view);

			case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel5EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel6EditPart(view);

			case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ArtifactPackageEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel13EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel14EditPart(view);

			case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel15EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel16EditPart(view);

			case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel17EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel18EditPart(view);

			case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.TerminologyPackageEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel19EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel20EditPart(view);

			case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel21EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel22EditPart(view);

			case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel23EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel24EditPart(view);

			case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ModuleEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel25EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel26EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel26EditPart(view);

			case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.ContractModuleEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel27EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel27EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel28EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel28EditPart(view);

			case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.CAEModuleEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel29EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel29EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel30EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel30EditPart(view);

			case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel31EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel31EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel32EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel32EditPart(view);

			case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel33EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel33EditPart(view);

			case assuranceCase.diagram.edit.parts.WrappingLabel34EditPart.VISUAL_ID:
				return new assuranceCase.diagram.edit.parts.WrappingLabel34EditPart(view);
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
