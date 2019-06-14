/*******************************************************************************
 * Copyright (c) 2011-2017 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.dialog;

import java.util.ArrayList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import artifact.ArtifactAsset;
import artifact.ArtifactPackage;
import assuranceCase.AssuranceCasePackage;
import base.ArtifactElement;
import base.ModelElement;
import gsn.Gsn_Package;
import gsn.Module;
import gsn.Solution;

public class SolutionPropertyDialog extends ModelElementPropertyDialog {

	protected boolean isPublic = false;
	protected Button isPublicButton;
	
	protected Label referenceLabel;
	protected Text referenceText;
	protected Button referenceButton;
	protected Button removeButton;
	protected Button goToButton;
	
	public SolutionPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Solution: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
		createReferenceGroup(control);
	}
	

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		Solution solution = (Solution) modelElement;
		isPublic = solution.isIsPublic();
		uninstantiated = solution.isUninstantiated();
		
		createIsPublicCheckButton(groupContent);
		createUninstantiatedCheckButton(groupContent);
	}

	private void createIsPublicCheckButton(Composite container) {
		isPublicButton = new Button(container, SWT.CHECK);
		isPublicButton.setSelection(isPublic);
		isPublicButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					isPublic = true;
				}
				else {
					isPublic = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(isPublic);
			}
		});
		createLabel(container, "Public");
	}
	
	public boolean getIsPublic() {
		return isPublic;
	}
	
	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 5);

		referenceLabel = new Label(groupContent, SWT.NONE);
		referenceLabel.setText("Artefact:         ");

		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		referenceText = new Text(groupContent, SWT.BORDER);
		referenceText.setLayoutData(filePathData);
		referenceText.setEditable(false);
		referenceText.setBackground(ColorConstants.white);
		
		Solution solution = (Solution) modelElement;
		if (solution.getCitedElement() != null) {
			ArtifactAsset artifactAsset = (ArtifactAsset) solution.getCitedElement();
			String moduleName = ModelElementUtil.getArtifactPackageName(artifactAsset);
			String solutionName = artifactAsset.getName().getContent();
			referenceText.setText(moduleName + "-" + solutionName);
		}

		
		referenceButton = new Button(groupContent, SWT.NONE);
		referenceButton.setText("Browse...");
		referenceButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String[] val = selection.split("-");
				String moduleName = val[0];
				String solutionName = val[1];
				Solution solution = (Solution) modelElement;
				ArtifactPackage module = (ArtifactPackage) ModelElementUtil.locateArtifactPackage(moduleName, solution);
				ArtifactAsset artifactAsset = (ArtifactAsset) ModelElementUtil.locateArtifactAssetByName(solutionName, module);
				if (module != null && artifactAsset != null) {
//					solution.setCitedElement(artifactAsset);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							solution, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							artifactAsset);
					referenceText.setText(selection);
					return;
				}
			}
			
			@Override
			public String getTitle() {
				return "Refererence to Artifact";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				Solution solution = (Solution) modelElement;
				Module containingModule = (Module) ModelElementUtil.getContainingModule(solution);
				AssuranceCasePackage containingACPackage = ModelElementUtil.getContainingAssuranceCasePackage(containingModule);
				ArrayList<String> ret = new ArrayList<String>();
				
				for(ArtifactPackage ap: containingACPackage.getArtifactPackage())
				{
					String packageName = ap.getName().getContent();
					for(ArtifactElement ae: ap.getArtifactElement())
					{
							ArtifactAsset artifactAsset = (ArtifactAsset) ae;
							String artifactAssetName = artifactAsset.getName().getContent();
							String val = packageName + "-" + artifactAssetName;
							ret.add(val);
					}
				}
				return ret;
			}
			
			@Override
			public String getMessage() {
				return "Select an Artifact";
			}
		});
		
		removeButton = new Button(groupContent, SWT.NONE);
		removeButton.setText("Remove");
		removeButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				Solution solution = (Solution) modelElement;
				if (solution.getCitedElement() != null) {
//					solution.setCitedElement(null);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							solution, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							null);
					referenceText.setText("");
				}
			}
		});
		
		goToButton = new Button(groupContent, SWT.NONE);
		goToButton.setText("Go to");
		goToButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				ModelElement citedElement = (ModelElement) solution.getCitedElement();
				if (citedElement != null) {
					boolean success = NavigationManager.navigateToEditor(citedElement);
					if (success) {
						getShell().close();
					}
				}
			}
		});
	}
	
}
