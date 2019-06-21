/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package acme.argumentation.diagram.dialog;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.BrowseModelElementListener;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.diagram.util.ModelElementUtil;
import acme.diagram.util.NavigationManager;
import argumentation.ArgumentPackage;
import argumentation.ArtifactReference;
import artifact.ArtifactAsset;
import artifact.ArtifactPackage;
import base.ModelElement;
import gsn.Gsn_Package;

public class ArtifactReferenceDialog extends ModelElementPropertyDialog{

	public ArtifactReferenceDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createIsAbstractGroup(control);
		createCitationGroup(control);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for ArtifactReference: " + getName();
	}

	protected void createCitationGroup(Composite container) {
		//create group content
		final Composite groupContent = createGroupContainer(container, "Citation", 5);

		//citation label
		citationLabel = new Label(groupContent, SWT.NONE);
		citationLabel.setText("Artifact:         ");

		//citation text
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		citationText = new Text(groupContent, SWT.BORDER);
		citationText.setLayoutData(filePathData);
		citationText.setEditable(false);
		citationText.setBackground(ColorConstants.white);
		
		ArtifactReference artifactReference = (ArtifactReference) modelElement;
		if (artifactReference.getCitedElement() != null) {
			ModelElement citedElement = (ModelElement) artifactReference.getCitedElement();
			String packageName = ModelElementFeatureUtil.getName(ModelElementUtil.getContainingPackage(citedElement));
			String citedElementName = ModelElementFeatureUtil.getName(citedElement);
			citationText.setText(packageName + "-" + citedElementName);
		}

		
		citationButton = new Button(groupContent, SWT.NONE);
		citationButton.setText("Cite...");
		citationButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				//split the name
				String[] val = selection.split("-");
				//first part is the package name
				String packageName = val[0];
				//second part is the element name
				String citedElementName = val[1];
				
				//get the artifact reference
				ArtifactReference artifactReference = (ArtifactReference) modelElement;
				
				//attempt to locate package
				ArgumentPackage argumentPackage = ModelElementUtil.locateArgumentPackage(packageName, artifactReference);
				ArtifactPackage artifactPackage = ModelElementUtil.locateArtifactPackage(packageName, artifactReference);
				ModelElement citedElement = null;
				if (argumentPackage != null) {
					citedElement = ModelElementUtil.locateArgumentElementByName(citedElementName, argumentPackage);
				}
				else if (artifactPackage != null) {
					citedElement = ModelElementUtil.locateArtifactAssetByName(citedElementName, artifactPackage);
				}
				//set cited element
				if (citedElement != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							artifactReference, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							citedElement);
					citationText.setText(selection);
					return;
				}
			}
			
			@Override
			public String getTitle() {
				return "Cite an ArtifactElement";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				ModelElement rooElement = ModelElementUtil.getRootElement(modelElement);
				Iterator<EObject> iter = rooElement.eAllContents();

				ArrayList<String> ret = new ArrayList<String>();

				while(iter.hasNext()) {
					EObject next = iter.next();
					if (next instanceof ArtifactReference || next instanceof ArtifactAsset) {
						ModelElement containingPackage = ModelElementUtil.getContainingPackage((ModelElement) next);
						String packageName = ModelElementFeatureUtil.getName(containingPackage);
						String citedElementName = ModelElementFeatureUtil.getName(next);
						ret.add(packageName + "-" + citedElementName);
					}
				}
				return ret;
			}
			
			@Override
			public String getMessage() {
				return "Select an Artifact";
			}
		});
		
		citation_removeButton = new Button(groupContent, SWT.NONE);
		citation_removeButton.setText("Remove");
		citation_removeButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				if (modelElement.getCitedElement() != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							modelElement, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							null);
					citationText.setText("");
				}
			}
		});
		
		citation_goToButton = new Button(groupContent, SWT.NONE);
		citation_goToButton.setText("Go to");
		citation_goToButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				ModelElement citedElement = (ModelElement) artifactReference.getCitedElement();
				boolean success = NavigationManager.navigateToEditor(citedElement);
				if (success) {
					getShell().close();
				}
			}
		});
	}
}
