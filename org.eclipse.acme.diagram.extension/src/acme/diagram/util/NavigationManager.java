/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.diagram.util;

import java.util.Iterator;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import argumentation.ArgumentationElement;
import base.ModelElement;

public class NavigationManager {

	public static boolean navigateToEditor(ModelElement modelElement) {
		try {
			TransactionalEditingDomain editingDomain = EditingDomainUtil.getEditingDomain();
			Diagram diagram = null;
			EList<Resource> resources = editingDomain.getResourceSet().getResources();
			for(Resource resource: resources)
			{
				Iterator<EObject> iter = resource.getAllContents();
				while(iter.hasNext()) {
					EObject eObject = iter.next();
					if (eObject instanceof Diagram) {
						for(Object obj: ((Diagram) eObject).getChildren())
						{
							if (obj instanceof ShapeImpl) {
								ShapeImpl shapeImpl = (ShapeImpl) obj;
								if (shapeImpl.getElement() != null &&
										shapeImpl.getElement().equals(modelElement)) {
									diagram = (Diagram) eObject;
									break;
								}
							}
						}
					}
				}
			}
			URI uri = EcoreUtil.getURI(diagram);
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			String displayName = "";
			if (modelElement instanceof ArgumentationElement) {
				displayName = ModelElementFeatureUtil.getName(ModelElementUtil.getContainingModule(modelElement));
			}
			else {
				displayName = ModelElementFeatureUtil.getName(ModelElementUtil.getContainingArtifactPackage(modelElement));
			}
			IDiagramWorkbenchPart editor = (IDiagramWorkbenchPart) page.openEditor(new URIEditorInput(uri, 
					displayName), 
					getEditorID(modelElement));
			for(Object part: editor.getDiagramEditPart().getChildren()) {
				if (part instanceof ShapeNodeEditPart) {
					ShapeNodeEditPart editPart = (ShapeNodeEditPart) part;
					if (editPart.resolveSemanticElement().equals(modelElement)) {
						editor.getDiagramGraphicalViewer().select(editPart);
						break;
					}
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static String getEditorID(ModelElement modelElement) {
		if (modelElement instanceof ArgumentationElement) {
			return "gsn.diagram.part.GsnDiagramEditorID";
		}
		else {
			return "artifact.diagram.part.ArtifactDiagramEditorID";
		}
	}
	
}
