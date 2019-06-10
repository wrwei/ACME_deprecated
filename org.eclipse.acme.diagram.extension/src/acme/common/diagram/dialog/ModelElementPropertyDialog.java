/*******************************************************************************
 * Copyright (c) 2011-2019 Ran Wei.
 * All rights reserved.
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.common.diagram.dialog;


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

	protected final int LABEL_WIDTH = 80;
	protected final int DESC_FIELD_HEIGHT = 70;
	protected final int IMPL_FIELD_HEIGHT = 70;
	
	//name, description and implementaiton constraint text fields
	protected Text nameText;
	protected Text descriptionText;
	protected Text implementationConstraintText;
	
	//strings to hold name, description and impl constraint
	protected String name = "";
	protected String description = "";
	protected String implementationConstraint = "";
	
	//uninstantiated
	protected boolean uninstantiated = false;
	protected Button uninstantiatedCheckBox;

	//is abstract and is citation
	protected boolean isAbstract = false;
	protected boolean isCitation = false;

	//citation label and citation text field
	protected Label citationLabel;
	protected Text citationText;
	
	//cite button, remove button, goto button for citations.
	protected Button citationButton;
	protected Button citation_removeButton;
	protected Button citation_goToButton;
	
	//model element for the dialog
	protected ModelElement modelElement;
	
	//abstract method for sub classes to override
	protected abstract String getTitleString();

	
	//constructor
	public ModelElementPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell);
		//check if model element is null
		if (modelElement != null) {
			this.modelElement = modelElement;
			
			//get contents if they are not null
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
	
	@Override
	public void create() {
		super.create();
		setTitle(getTitleString());
	}

	//dialog area is the base of the entire dialog
	@Override
	protected Control createDialogArea(Composite parent) {
		//super Composite to contain everything
		Composite superControl = (Composite) super.createDialogArea(parent);
		this.setTitle(getTitleString());
		
		//create a new composite with grid layout, 1 column
		Composite control = new Composite(superControl, SWT.FILL);
		control.setLayout(new GridLayout(1,true));
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = 600;
		control.setLayoutData(data);
//		control.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//create sub-groups in the control
		createGroups(control);
		control.layout();
		control.pack();

		return control;
	}
	
	//utility method to create group containers
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

	protected void createGroups(Composite control) {
		createIdentityGroup(control);
		createImplementationGroup(control);
	}
	
	
	
	
	protected void createIdentityGroup(Composite parent) {
		//group to id the model element
		final Composite groupContent = createGroupContainer(parent, "Identification", 2);
		
		//name label
		Label nameLabel = new Label(groupContent, SWT.NONE);
		GridData name_label_data = new GridData(SWT.FILL);
		name_label_data.widthHint = LABEL_WIDTH;
		nameLabel.setLayoutData(name_label_data);
		nameLabel.setText("Name:");
		
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
		GridData description_label_data = new GridData(SWT.FILL);
		description_label_data.widthHint = LABEL_WIDTH;
		descriptionLabel.setLayoutData(description_label_data);
		descriptionLabel.setText("Description:");
		
		//set layout for description text
		descriptionText = new Text(groupContent, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = DESC_FIELD_HEIGHT;
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
		GridData impl_constraint_label_data = new GridData(SWT.FILL);
		impl_constraint_label_data.widthHint = LABEL_WIDTH;
		implementationConstraintLabel.setLayoutData(impl_constraint_label_data);

		implementationConstraintLabel.setText("Constraint:");
		
		//set layout for name text
		implementationConstraintText = new Text(groupContent, SWT.MULTI|SWT.BORDER|SWT.WRAP | SWT.V_SCROLL);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = IMPL_FIELD_HEIGHT;

		implementationConstraintText.setLayoutData(data);
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
	
	//utility method for sub classes
	protected void createIsAbstractGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		isAbstract = modelElement.isIsAbstract();
		isCitation = modelElement.isIsCitation();
		
		createIsPublicCheckButton(groupContent);
		groupContent.layout();
		groupContent.pack();
	}
	
	//utility method for sub classes
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
	
	//set if is resizable
	@Override
	protected boolean isResizable() {
		return false;
	}
	
	//save input when ok is pressed
	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}
	
	//save input
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
