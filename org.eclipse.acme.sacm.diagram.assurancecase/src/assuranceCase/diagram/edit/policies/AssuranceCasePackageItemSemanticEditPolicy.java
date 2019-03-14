package assuranceCase.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class AssuranceCasePackageItemSemanticEditPolicy
		extends assuranceCase.diagram.edit.policies.AssurancecaseBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AssuranceCasePackageItemSemanticEditPolicy() {
		super(assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackage_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackage_2001 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.AssuranceCasePackageCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageBinding_2018 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.AssuranceCasePackageBindingCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageInterface_2019 == req
				.getElementType()) {
			return getGEFWrapper(
					new assuranceCase.diagram.edit.commands.AssuranceCasePackageInterfaceCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackage_2004 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ArgumentPackageCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageBinding_2002 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ArgumentPackageBindingCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageInterface_2003 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ArgumentPackageInterfaceCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackage_2007 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ArtifactPackageCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageBinding_2008 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ArtifactPackageBindingCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageInterface_2009 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ArtifactPackageInterfaceCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackage_2010 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.TerminologyPackageCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageInterface_2011 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.TerminologyPackageInterfaceCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageBinding_2012 == req
				.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.TerminologyPackageBindingCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.Module_2013 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ModuleCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.ContractModule_2014 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.ContractModuleCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModule_2015 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.CAEModuleCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleInterface_2016 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.CAEModuleInterfaceCreateCommand(req));
		}
		if (assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleBinding_2017 == req.getElementType()) {
			return getGEFWrapper(new assuranceCase.diagram.edit.commands.CAEModuleBindingCreateCommand(req));
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
