package argumentation.diagram.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.ArgumentPackage;
import argumentation.Argumentation_Factory;
import argumentation.Argumentation_Package;
import argumentation.AssertedInference;
import argumentation.Claim;
import argumentation.diagram.edit.parts.ClaimEditPart;

public class SupportClaimFreshHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				if (element instanceof EditPart) {
					ClaimEditPart claimEditPart = (ClaimEditPart) element;
					Claim claim = (Claim) claimEditPart.resolveSemanticElement();
					ArgumentPackage argumentPackage = (ArgumentPackage) claim.eContainer();
					Claim newClaim = Argumentation_Factory.eINSTANCE.createClaim();
					
					AssertedInference assertedInference = Argumentation_Factory.eINSTANCE.createAssertedInference();
					
					ModelElementFeatureUtil.createBasicFeature(newClaim);
					ModelElementFeatureUtil.createBasicFeature(assertedInference);
					
					assertedInference.getSource().add(newClaim);
					assertedInference.getTarget().add(claim);
					
					TransactionalEditingDomain editingDomain;
					editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");

					ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), newClaim);
					ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), assertedInference);
				}
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
