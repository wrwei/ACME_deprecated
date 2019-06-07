/*******************************************************************************
 * Copyright (c) 2011-2019 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.common.diagram.dialog;


import javax.swing.JTextArea;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import base.ModelElement;

public abstract class ModelElementPropertyDialog extends TitleAreaDialog {

	protected Text nameText;
	protected Text descriptionText;
	protected Text implementationConstraintText;
	
	//default name and description string
	protected String name = "";
	protected String description = "";
	protected String implementationConstraint = "";
	
	
	protected boolean uninstantiated = false;
	protected Button uninstantiatedCheckBox;

	
	protected boolean isAbstract = false;
	protected boolean isCitation = false;

	protected Label citationLabel;
	protected Text citationText;
	protected Button citationButton;
	protected Button citation_removeButton;
	protected Button citation_goToButton;

	
	protected ModelElement modelElement;
	
	public ModelElementPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell);
		if (modelElement != null) {
			this.modelElement = modelElement;
			if (modelElement.getName() != null) {
				name = modelElement.getName().getContent();	
			}
			if (modelElement.getDescription() != null) {
				description = modelElement.getDescription().getContent().getValue().get(0).getContent();	
			}
			if (modelElement.getImplementationConstraint() != null) {
				implementationConstraint = modelElement.getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
			}
		}
	}
	
	protected abstract String getTitleString();
	
	@Override
	public void create() {
		super.create();
		setTitle(getTitleString());
	}
	
	protected static Composite createGroupContainer(Composite parent, String text, int columns) {
		//create a group
		final Group group = new Group(parent, SWT.FILL);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText(text);
		group.setLayout(new GridLayout(1,false));
		
		//create composite for group content
		final Composite groupContent = new Composite(group, SWT.FILL);
		groupContent.setLayout(new GridLayout(columns, false));
		groupContent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		return groupContent;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite superControl = (Composite) super.createDialogArea(parent);
		this.setTitle(getTitleString());
		
		//create a new composite with grid layout, 1 column
		Composite control = new Composite(superControl, SWT.FILL);
		control.setLayout(new GridLayout(1,true));
		control.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//create sub-groups in the control
		createGroups(control);
		control.layout();
		control.pack();

		return control;
	}
	
	protected void createGroups(Composite control) {
		createIdentityGroup(control);
		createImplementationGroup(control);
	}
	
	protected void createIsAbstractGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		isAbstract = modelElement.isIsAbstract();
		isCitation = modelElement.isIsCitation();
		
		createIsPublicCheckButton(groupContent);
		groupContent.layout();
		groupContent.pack();
	}
	
	private void createIsPublicCheckButton(Composite container) {
		final Button isAbstractButton = new Button(container, SWT.CHECK);
		isAbstractButton.setSelection(isAbstract);
		isAbstractButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					isAbstract = true;
				}
				else {
					isAbstract = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(isAbstract);
			}
		});
		createLabel(container, "Abstract");
	}
	
	
	protected void createIdentityGroup(Composite parent) {
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Identification", 2);
		
		//name label
		Label nameLabel = new Label(groupContent, SWT.NONE);
		nameLabel.setText("Name:           ");
		
		//set layout for name text
		nameText = new Text(groupContent, SWT.BORDER);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		nameText.setText(name);
		nameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				name = nameText.getText();
			}
		});
		
		//description label
		Label descriptionLabel = new Label(groupContent, SWT.NONE);
		descriptionLabel.setText("Description: ");
		
		//set layout for description text
		descriptionText = new Text(groupContent, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 75;
		descriptionText.setLayoutData(data);
		descriptionText.setText(description);
		descriptionText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				description = descriptionLabel.getText();
			}
		});
		
		groupContent.layout();
		groupContent.pack();
	}
	
	protected void createImplementationGroup(Composite parent) {
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Implementation Constraints", 2);
		
		//name label
		Label implementationConstraintLabel = new Label(groupContent, SWT.NONE);
		implementationConstraintLabel.setText("Constraint:   ");
		
		//set layout for name text
		implementationConstraintText = new Text(groupContent, SWT.BORDER);
		implementationConstraintText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		implementationConstraintText.setText(implementationConstraint);
		implementationConstraintText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				implementationConstraint = implementationConstraintText.getText();
			}
		});
		
		groupContent.layout();
		groupContent.pack();
	}
	
	protected void createLabel(Composite container, String name)
	{
		Label undevelopedLabel = new Label(container, SWT.NONE);
		undevelopedLabel.setText(name);
		GridData nameData = new GridData();
		nameData.grabExcessHorizontalSpace = true;
		nameData.horizontalAlignment = GridData.FILL;
	}
	
	//creates the uninstantiated check button
	protected void createUninstantiatedCheckButton(Composite container) {
		//create button and add selection listener
		uninstantiatedCheckBox = new Button(container, SWT.CHECK);
		uninstantiatedCheckBox.setSelection(uninstantiated);
		uninstantiatedCheckBox.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					uninstantiated = true;
				}
				else {
					uninstantiated = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(uninstantiated);
			}
		});
		createLabel(container, "Uninstantiated");
	}
	
	@Override
	protected boolean isResizable() {
		return false;
	}
	
	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}
	
	protected void saveInput() {
		name = nameText.getText();
		description = descriptionText.getText();
		implementationConstraint = implementationConstraintText.getText();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImplementationConstraint() {
		return implementationConstraint;
	}
	
	public void setImplementationConstraint(String implementationConstraint) {
		this.implementationConstraint = implementationConstraint;
	}
	
	public ModelElement getModelElement() {
		return modelElement;
	}
	
	public void setModelElement(ModelElement modelElement) {
		this.modelElement = modelElement;
	}
	
	public boolean getUninstantiated() {
		return uninstantiated;
	}
	
	public boolean getIsAbstract() {
		return isAbstract;
	}
}
