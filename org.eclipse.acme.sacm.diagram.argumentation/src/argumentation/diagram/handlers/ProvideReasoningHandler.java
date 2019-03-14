package argumentation.diagram.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.ModelElementFeatureUtil;
import argumentation.ArgumentPackage;
import argumentation.ArgumentReasoning;
import argumentation.Argumentation_Factory;
import argumentation.Argumentation_Package;
import argumentation.AssertedRelationship;
import argumentation.diagram.edit.parts.AssertedRelationshipSourceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipTargetEditPart;

public class ProvideReasoningHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				AssertedRelationship relationship = null;	
				if (element instanceof AssertedRelationshipTargetEditPart) {
					AssertedRelationshipTargetEditPart editPart = (AssertedRelationshipTargetEditPart) element;
					ShapeNodeEditPart part = (ShapeNodeEditPart) editPart.getSource();
					relationship = (AssertedRelationship) part.resolveSemanticElement();
				}
				else if (element instanceof AssertedRelationshipSourceEditPart) {
					AssertedRelationshipSourceEditPart editPart = (AssertedRelationshipSourceEditPart) element;
					ShapeNodeEditPart part = (ShapeNodeEditPart) editPart.getSource();
					relationship = (AssertedRelationship) part.resolveSemanticElement();
				}
				
				if (relationship != null) {
					ArgumentPackage argumentPackage = (ArgumentPackage) relationship.eContainer();
					ArgumentReasoning reasoning = Argumentation_Factory.eINSTANCE.createArgumentReasoning();
					ModelElementFeatureUtil.createBasicFeature(reasoning);
					TransactionalEditingDomain editingDomain;
					editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
					ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), reasoning);
					ModelElementFeatureUtil.setFeatureTransactional(editingDomain, relationship, Argumentation_Package.eINSTANCE.getAssertedRelationship_Reasoning(), reasoning);
				}
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
