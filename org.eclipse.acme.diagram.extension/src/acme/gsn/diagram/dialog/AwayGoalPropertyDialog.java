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
import base.ModelElement;
import gsn.AwayGoal;
import gsn.Goal;
import gsn.Gsn_Package;
import gsn.Module;

public class AwayGoalPropertyDialog extends ModelElementPropertyDialog {

	protected Label goalLabel;
	protected Text goalFullName;
	protected Button browseButton;
	protected Button goToButton;

	
	public AwayGoalPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for AwayGoal: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		AwayGoal awayGoal = (AwayGoal) modelElement;
		if (awayGoal.getCitedElement() != null) {
			Goal goal = (Goal) awayGoal.getCitedElement();
			descriptionText.setText(goal.getDescription().getContent().getValue().get(0).getContent());
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

		AwayGoal awayGoal = (AwayGoal) modelElement;
		uninstantiated = awayGoal.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}
	
	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 4);

		goalLabel = new Label(groupContent, SWT.NONE);
		GridData label_data = new GridData(SWT.FILL);
		label_data.widthHint = LABEL_WIDTH;
		goalLabel.setLayoutData(label_data);

		goalLabel.setText("Away Goal: ");

		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		goalFullName = new Text(groupContent, SWT.BORDER);
		goalFullName.setLayoutData(filePathData);
		goalFullName.setEditable(false);
		goalFullName.setBackground(ColorConstants.white);
		
		AwayGoal awayGoal = (AwayGoal) modelElement;
		if (awayGoal.getCitedElement() != null) {
			Goal goal = (Goal) awayGoal.getCitedElement();
			String moduleName = ModelElementUtil.getModuleName(goal);
			String goalName = goal.getName().getContent();
			goalFullName.setText(moduleName + "-" + goalName);
		}

		
		browseButton = new Button(groupContent, SWT.NONE);
		browseButton.setText("Browse...");
		browseButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String[] val = selection.split("-");
				String moduleName = val[0];
				String goalName = val[1];
				AwayGoal awayGoal = (AwayGoal) modelElement;
				Module module = (Module) ModelElementUtil.locateOtherModuleByName(moduleName, awayGoal);
				Goal goal = (Goal) ModelElementUtil.locateModelElementByName(goalName, module);
				if (module != null && goal != null) {
//					goal.setIsPublic(true);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							goal, 
							Gsn_Package.eINSTANCE.getGoal_IsPublic(), 
							true);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							awayGoal, 
							Gsn_Package.eINSTANCE.getAwayGoal().getEStructuralFeature("citedElement"), 
							goal);
//					awayGoal.setCitedElement(goal);
					goalFullName.setText(selection);
					updateDescription();
					return;
				}
			}
			
			@Override
			public String getTitle() {
				return "Goals in other Modules";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				AwayGoal awayGoal = (AwayGoal) modelElement;
				
				ModelElement rooElement = ModelElementUtil.getRootElement(modelElement);
				Iterator<EObject> iter = rooElement.eAllContents();

				ArrayList<String> ret = new ArrayList<String>();

				while(iter.hasNext()) {
					EObject next = iter.next();
					if (next instanceof Goal) {
						if (!next.eContainer().equals(modelElement.eContainer())) {
							ArgumentPackage argumentPackage = (ArgumentPackage) ModelElementUtil.getContainingPackage((ModelElement) next);
							String argumentName = ModelElementFeatureUtil.getName(argumentPackage);
							String claimName = ModelElementFeatureUtil.getName(next);
							ret.add(argumentName + "-" + claimName);
						}
					}
				}
				return ret;
			}
			
			@Override
			public String getMessage() {
				return "Select an away Goal";
			}
		});
		
		goToButton = new Button(groupContent, SWT.NONE);
		goToButton.setText("Go to");
		goToButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				ModelElement citedElement = (ModelElement) awayGoal.getCitedElement();
				if (citedElement != null) {
					boolean success = NavigationManager.navigateToEditor(citedElement);
					if (success) {
						getShell().close();
					}	
				}
			}
		});
	}
	
	public void updateDescription() {
		AwayGoal awayGoal = (AwayGoal) modelElement;
		if (awayGoal.getCitedElement() != null) {
			Goal goal = (Goal) awayGoal.getCitedElement();
			descriptionText.setText(goal.getDescription().getContent().getValue().get(0).getContent());
		}
	}
}
