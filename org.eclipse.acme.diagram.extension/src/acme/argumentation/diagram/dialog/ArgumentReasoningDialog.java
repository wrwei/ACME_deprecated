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
import org.eclipse.swt.widgets.Combo;
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
import argumentation.ArgumentReasoning;
import base.ModelElement;
import gsn.Gsn_Package;

public class ArgumentReasoningDialog extends ModelElementPropertyDialog {

	protected Combo combo;
	protected int selectedIndex = -1;
	
	public ArgumentReasoningDialog(Shell parentShell, ModelElement modelElement) {
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
		return "Edit the properties for ArgumentReasoning: " + getName();
	}
	
	protected void createCitationGroup(Composite container) {
		//create group content
		final Composite groupContent = createGroupContainer(container, "Citation", 5);

		//citation label
		citationLabel = new Label(groupContent, SWT.NONE);
		citationLabel.setText("ArgumentReasoning:         ");

		//citation text
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		citationText = new Text(groupContent, SWT.BORDER);
		citationText.setLayoutData(filePathData);
		citationText.setEditable(false);
		citationText.setBackground(ColorConstants.white);
		
		ArgumentReasoning reasoning = (ArgumentReasoning) modelElement;
		if (reasoning.getCitedElement() != null) {
			ModelElement citedElement = (ModelElement) reasoning.getCitedElement();
			String packageName = ModelElementFeatureUtil.getName(ModelElementUtil.getContainingPackage(citedElement));
			String citedName = ModelElementFeatureUtil.getName(citedElement);
			citationText.setText(packageName + "-" + citedName);
		}

		
		citationButton = new Button(groupContent, SWT.NONE);
		citationButton.setText("Cite...");
		citationButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String[] val = selection.split("-");
				String moduleName = val[0];
				String citedName = val[1];
				ArgumentReasoning reasoning = (ArgumentReasoning) modelElement;
				ArgumentPackage argumentPackage = (ArgumentPackage) ModelElementUtil.locateArgumentPackage(moduleName, reasoning);
				ModelElement citedElement = ModelElementUtil.locateArgumentElementByName(citedName, argumentPackage);
				if (argumentPackage != null && citedElement != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							reasoning, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							citedElement);
					citationText.setText(selection);
					return;
				}
			}
			
			@Override
			public String getTitle() {
				return "Cite another Claim";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				ArgumentReasoning reasoning = (ArgumentReasoning) modelElement;
				ModelElement rooElement = ModelElementUtil.getRootElement(reasoning);
				Iterator<EObject> iter = rooElement.eAllContents();

				ArrayList<String> ret = new ArrayList<String>();

				while(iter.hasNext()) {
					EObject next = iter.next();
					if (next instanceof ArgumentReasoning) {
						ArgumentPackage argumentPackage = (ArgumentPackage) ModelElementUtil.getContainingPackage((ModelElement) next);
						String argumentName = ModelElementFeatureUtil.getName(argumentPackage);
						String name = ModelElementFeatureUtil.getName(next);
						ret.add(argumentName + "-" + name);
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
				ArgumentReasoning reasoning = (ArgumentReasoning) modelElement;
				if (reasoning.getCitedElement() != null) {
//					solution.setCitedElement(null);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							reasoning, 
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
				ModelElement citedElement = (ModelElement) reasoning.getCitedElement();
				boolean success = NavigationManager.navigateToEditor(citedElement);
				if (success) {
					getShell().close();
				}
			}
		});
	}
	
	
	public int getSelectedIndex() {
		return selectedIndex;
	}
	
}
