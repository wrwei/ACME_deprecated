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
import argumentation.ArgumentationElement;
import assuranceCase.AssuranceCasePackage;
import base.ModelElement;
import gsn.AwayContext;
import gsn.Context;
import gsn.Goal;
import gsn.Gsn_Package;

public class AwayContextPropertyDialog extends ModelElementPropertyDialog {

	protected Label contextLabel;
	protected Text contextFullName;
	protected Button browseButton;
	protected Button goToButton;

	public AwayContextPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for AwayContext: " + getName();
	}

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		AwayContext awayContext = (AwayContext) modelElement;
		if (awayContext.getCitedElement() != null) {
			Context context = (Context) awayContext.getCitedElement();
			descriptionText.setText(context.getDescription().getContent().getValue().get(0).getContent());
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

		AwayContext awayContext = (AwayContext) modelElement;
		uninstantiated = awayContext.isUninstantiated();
		createUninstantiatedCheckButton(groupContent);
	}

	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 4);

		contextLabel = new Label(groupContent, SWT.NONE);
		contextLabel.setText("Away Context:   ");

		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		contextFullName = new Text(groupContent, SWT.BORDER);
		contextFullName.setLayoutData(filePathData);
		contextFullName.setEditable(false);
		contextFullName.setBackground(ColorConstants.white);

		AwayContext awayContext = (AwayContext) modelElement;
		if (awayContext.getCitedElement() != null) {
			Context context = (Context) awayContext.getCitedElement();
			String moduleName = ModelElementUtil.getModuleName(context);
			String contextName = context.getName().getContent();
			contextFullName.setText(moduleName + "-" + contextName);
		}


		browseButton = new Button(groupContent, SWT.NONE);
		browseButton.setText("Browse...");
		browseButton.addListener(SWT.Selection, new BrowseModelElementListener() {

			@Override
			public void selectionChanged(String selection) {
				String[] val = selection.split("-");
				String moduleName = val[0];
				String contextName = val[1];
				AwayContext awayContext = (AwayContext) modelElement;
				ArgumentPackage module = (ArgumentPackage) ModelElementUtil.locateOtherModuleByName(moduleName, awayContext);
				Context context = (Context) ModelElementUtil.locateModelElementByName(contextName, module);
				if (module != null && context != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(),
							context,
							Gsn_Package.eINSTANCE.getContext_IsPublic(),
							true);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(),
							awayContext,
							Gsn_Package.eINSTANCE.getAwayContext().getEStructuralFeature("citedElement"),
							context);
//					context.setIsPublic(true);
//					awayContext.setCitedElement(context);
					contextFullName.setText(selection);
					updateDescription();
					return;
				}
			}

			@Override
			public String getTitle() {
				return "Contexts in other Modules";
			}

			@Override
			public ArrayList<String> getModelElements() {
				ModelElement rooElement = ModelElementUtil.getRootElement(modelElement);
				Iterator<EObject> iter = rooElement.eAllContents();

				ArrayList<String> ret = new ArrayList<String>();

				while(iter.hasNext()) {
					EObject next = iter.next();
					if (next instanceof Context) {
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
				return "Select an away Context";
			}
		});

		goToButton = new Button(groupContent, SWT.NONE);
		goToButton.setText("Go to");
		goToButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ModelElement citedElement = (ModelElement) awayContext.getCitedElement();
				boolean success = NavigationManager.navigateToEditor(citedElement);
				if (success) {
					getShell().close();
				}
			}
		});
	}

	public void updateDescription() {
		AwayContext awayContext = (AwayContext) modelElement;
		if (awayContext.getCitedElement() != null) {
			Context context = (Context) awayContext.getCitedElement();
			descriptionText.setText(context.getDescription().getContent().getValue().get(0).getContent());
		}
	}
}
