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
import argumentation.ArgumentationElement;
import assuranceCase.AssuranceCasePackage;
import base.ModelElement;
import gsn.AwaySolution;
import gsn.Gsn_Package;
import gsn.Module;
import gsn.Solution;

public class AwaySolutionPropertyDialog extends ModelElementPropertyDialog {

	protected Label solutionLabel;
	protected Text solutionFullName;
	protected Button browseButton;
	protected Button goToButton;
	
	public AwaySolutionPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for AwaySolution: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		AwaySolution awaySolution = (AwaySolution) modelElement;
		if (awaySolution.getCitedElement() != null) {
			Solution solution = (Solution) awaySolution.getCitedElement();
			descriptionText.setText(solution.getDescription().getContent().getValue().get(0).getContent());
		}
		else {
			descriptionText.setText("<...>");
		}
		descriptionText.setBackground(ColorConstants.white);
		descriptionText.setEditable(false);
		createFeaturesGroup(control);
		createReferenceGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		AwaySolution awaySolution = (AwaySolution) modelElement;
		uninstantiated = awaySolution.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}
	
	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 4);

		solutionLabel = new Label(groupContent, SWT.NONE);
		GridData away_label_data = new GridData(SWT.FILL);
		away_label_data.widthHint = LABEL_WIDTH;
		solutionLabel.setLayoutData(away_label_data);
		solutionLabel.setText("Away Solution: ");

		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		solutionFullName = new Text(groupContent, SWT.BORDER);
		solutionFullName.setLayoutData(filePathData);
		solutionFullName.setEditable(false);
		solutionFullName.setBackground(ColorConstants.white);
		
		AwaySolution awaySolution = (AwaySolution) modelElement;
		if (awaySolution.getReferencedArtifactElement().size() >0 ) {
			Solution solution = (Solution) awaySolution.getReferencedArtifactElement().get(0);
			String moduleName = ModelElementUtil.getModuleName(solution);
			String solutionName = solution.getName().getContent();
			solutionFullName.setText(moduleName + "-" + solutionName);
		}

		
		browseButton = new Button(groupContent, SWT.NONE);
		browseButton.setText("Browse...");
		browseButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String[] val = selection.split("-");
				String moduleName = val[0];
				String solutionName = val[1];
				AwaySolution awaySolution = (AwaySolution) modelElement;
				Module module = (Module) ModelElementUtil.locateOtherModuleByName(moduleName, awaySolution);
				Solution solution = (Solution) ModelElementUtil.locateModelElementByName(solutionName, module);
				if (module != null && solution != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							solution, 
							Gsn_Package.eINSTANCE.getSolution_IsPublic(), 
							true);
					ModelElementFeatureUtil.addFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							awaySolution, 
							Gsn_Package.eINSTANCE.getAwaySolution().getEStructuralFeature("referencedArtifactElement"), 
							solution);
//					solution.setIsPublic(true);
//					awaySolution.setCitedElement(solution);
					solutionFullName.setText(selection);
					return;
				}
			}
			
			@Override
			public String getTitle() {
				return "Solutions in other Modules";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				AwaySolution awaySolution = (AwaySolution) modelElement;
				Module containingModule = (Module) ModelElementUtil.getContainingModule(awaySolution);
				AssuranceCasePackage containingACPackage = ModelElementUtil.getContainingAssuranceCasePackage(containingModule);
				ArrayList<String> ret = new ArrayList<String>();
				
				for(ArgumentPackage ap: containingACPackage.getArgumentPackage())
				{
					if (!ap.equals(containingModule)) {
						String moduleName = ap.getName().getContent();
						for(ArgumentationElement ae: ap.getArgumentationElement())
						{
							if (ae instanceof Solution) {
								Solution solution = (Solution) ae;
								String solutionName = solution.getName().getContent();
								String val = moduleName + "-" + solutionName;
								ret.add(val);
							}
						}
					}
				}
				return ret;
			}
			
			@Override
			public String getMessage() {
				return "Select an away Solution";
			}
		});
		
		goToButton = new Button(groupContent, SWT.NONE);
		goToButton.setText("Go to");
		goToButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				Solution solution = (Solution) awaySolution.getReferencedArtifactElement().get(0);
				if (solution != null) {
					boolean success = NavigationManager.navigateToEditor(solution);
					if (success) {
						getShell().close();
					}
				}
			}
		});
	}
	
	public void updateDescription() {
		AwaySolution awaySolution = (AwaySolution) modelElement;
		if (awaySolution.getCitedElement() != null) {
			Solution solution = (Solution) awaySolution.getCitedElement();
			descriptionText.setText(solution.getDescription().getContent().getValue().get(0).getContent());
		}
	}
}
