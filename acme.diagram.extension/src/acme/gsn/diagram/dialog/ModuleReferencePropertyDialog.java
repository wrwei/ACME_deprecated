/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.BrowseModelElementListener;
import acme.diagram.util.ModelElementUtil;
import argumentation.ArgumentPackage;
import assuranceCase.AssuranceCasePackage;
import base.ModelElement;
import gsn.Module;
import gsn.ModuleReference;

public class ModuleReferencePropertyDialog extends ModelElementPropertyDialog {

	protected Label moduleLabel;
	protected Text moduleFullName;
	protected Button browseButton;


	public ModuleReferencePropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Goal: " + getName();
	}

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
		createReferenceGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		ModuleReference moduleReference = (ModuleReference) modelElement;
		uninstantiated = moduleReference.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}

	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 3);

		moduleLabel = new Label(groupContent, SWT.NONE);
		moduleLabel.setText("Module:         ");

		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		moduleFullName = new Text(groupContent, SWT.BORDER);
		moduleFullName.setLayoutData(filePathData);
		moduleFullName.setEditable(false);
		moduleFullName.setBackground(ColorConstants.white);

		ModuleReference moduleReference = (ModuleReference) modelElement;

		if (moduleReference.getCitedElement() != null) {
			Module module = (Module) moduleReference.getCitedElement();
			String moduleName = ModelElementUtil.getModuleName(module);
			moduleFullName.setText(moduleName);
		}


		browseButton = new Button(groupContent, SWT.NONE);
		browseButton.setText("Browse...");
		browseButton.addListener(SWT.Selection, new BrowseModelElementListener() {

			@Override
			public void selectionChanged(String selection) {
				String moduleName = selection;
				ModuleReference moduleReference = (ModuleReference) modelElement;
				Module module = (Module) ModelElementUtil.locateOtherModuleByName(moduleName, moduleReference);
				if (module != null) {
					moduleReference.setCitedElement(module);
					moduleFullName.setText(selection);
					return;
				}
			}

			@Override
			public String getTitle() {
				return "Other Modules";
			}

			@Override
			public ArrayList<String> getModelElements() {
				ModuleReference moduleReference = (ModuleReference) modelElement;
				Module containingModule = (Module) ModelElementUtil.getContainingModule(moduleReference);
				AssuranceCasePackage containingACPackage = ModelElementUtil.getContainingAssuranceCasePackage(containingModule);
				ArrayList<String> ret = new ArrayList<String>();

				for(ArgumentPackage ap: containingACPackage.getArgumentPackage())
				{
					if (!ap.equals(containingModule)) {
						String moduleName = ap.getName().getContent();
						ret.add(moduleName);
					}
				}
				return ret;
			}

			@Override
			public String getMessage() {
				return "Select a Module";
			}
		});
	}
}
