package argumentation.diagram.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.ModelElementFeatureUtil;
import acme.diagram.util.ModelElementUtil;
import argumentation.ArgumentPackage;
import argumentation.Argumentation_Factory;
import argumentation.Argumentation_Package;
import argumentation.ArtifactReference;
import argumentation.AssertedEvidence;
import argumentation.Claim;
import argumentation.diagram.edit.parts.ClaimEditPart;
import base.ModelElement;

public class ProvideEvidenceHandler implements IHandler {

	private ArtifactReference artifactReference = null;
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
					
					
					ElementListSelectionDialog dialog = new ElementListSelectionDialog( 
							Display.getDefault().getActiveShell(), 
							new LabelProvider() {

								@Override
								public String getText(Object element) {
									return (String) element;
								}
								
								Image image = null;
								
								@Override
								public Image getImage(Object element) {
									return image;
								}
								
							});
					
					dialog.setMessage("Provide evidence for Claim: " + ModelElementFeatureUtil.getName(claim));
					dialog.setTitle("Provide evidence");
					
					List<String> modelElements = new ArrayList<String>();
					modelElements.addAll(getModelElements(claim));
					
					dialog.setElements(modelElements.toArray());
					
					if (dialog.open() == Window.OK) {
						if (dialog.getResult().length > 0) {
							selectionChanged((String) dialog.getResult()[0], claim);
						}
					}
					
					if (artifactReference != null) {
						AssertedEvidence assertedEvidence = Argumentation_Factory.eINSTANCE.createAssertedEvidence();
						
						ModelElementFeatureUtil.createBasicFeature(assertedEvidence);
						
						assertedEvidence.getSource().add(artifactReference);
						assertedEvidence.getTarget().add(claim);
						
						TransactionalEditingDomain editingDomain;
						editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");

						ModelElementFeatureUtil.addFeatureTransactional(editingDomain, argumentPackage, Argumentation_Package.eINSTANCE.getArgumentPackage_ArgumentationElement(), assertedEvidence);

					}
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
	
	public ArrayList<String> getModelElements(ModelElement modelElement) {
		ModelElement rooElement = (ModelElement) modelElement.eContainer();
		Iterator<EObject> iter = rooElement.eAllContents();

		ArrayList<String> ret = new ArrayList<String>();

		while(iter.hasNext()) {
			EObject next = iter.next();
			if (next instanceof ArtifactReference) {
				ModelElement containingPackage = ModelElementUtil.getContainingPackage((ModelElement) next);
				String packageName = ModelElementFeatureUtil.getName(containingPackage);
				String citedElementName = ModelElementFeatureUtil.getName(next);
				ret.add(packageName + "-" + citedElementName);
			}
		}
		return ret;
	}
	
	public void selectionChanged(String selection, ModelElement modelElement) {
		//get the strings
		String[] val = selection.split("-");
		
		//get the artifact name
		String artefactRefName = val[1];
		
		//the claim
		Claim claim = (Claim) modelElement;
		
		//get the argument package
		ArgumentPackage argumentPackage = (ArgumentPackage) claim.eContainer();
		
		if (argumentPackage != null) {
			artifactReference = (ArtifactReference) ModelElementUtil.locateArgumentElementByName(artefactRefName, argumentPackage);
		}
	}


}
