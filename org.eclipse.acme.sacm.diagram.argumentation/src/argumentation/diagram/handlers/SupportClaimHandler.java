package argumentation.diagram.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.ArgumentPackage;
import argumentation.ArgumentationElement;
import argumentation.Argumentation_Factory;
import argumentation.Argumentation_Package;
import argumentation.AssertedInference;
import argumentation.Claim;
import argumentation.diagram.edit.parts.ClaimEditPart;
import base.ModelElement;

public class SupportClaimHandler implements IHandler {

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
					int count = 0;
					AssertedInference temp = null;
					for(ArgumentationElement ae: argumentPackage.getArgumentationElement()) {
						if (ae instanceof AssertedInference) {
							AssertedInference ai = (AssertedInference) ae;
							if (ai.getTarget().contains(claim)) {
								count++;
								temp = ai;
							}
						}
					}
					if (count == 1 && temp != null) {
						Claim newClaim = Argumentation_Factory.eINSTANCE.createClaim();
						ModelElementFeatureUtil.createBasicFeature(newClaim);
						TransactionalEditingDomain editingDomain;
						editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
						ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), newClaim);
						ModelElementFeatureUtil.addFeatureTransactional(editingDomain, temp, Argumentation_Package.eINSTANCE.getAssertedRelationship_Source(), newClaim);
					}
					else {
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
						
						ClaimEditPart cep = (ClaimEditPart) locateEditPart(claimEditPart.getParent().getChildren(), newClaim);
						System.out.println(cep.getFigure().getBounds());
						cep.getFigure().setBounds(claimEditPart.getFigure().getBounds());
						System.out.println(cep.getFigure().getBounds());
					}
					
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
	
	public ShapeNodeEditPart locateEditPart(List<ShapeNodeEditPart> list, ModelElement modelElemenet) {
		for(ShapeNodeEditPart part : list) {
			Object obj = part.resolveSemanticElement();
			if(obj.equals(modelElemenet))
			{
				return part;
			}
		}
		return null;
	}

}
