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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import argumentation.AssertedRelationship;
import base.ImplementationConstraint;
import base.ModelElement;
import gsn.InContextOf;
import gsn.SupportedBy;

public class AssertedRelationshipPropertyDialog extends ModelElementPropertyDialog {

	protected boolean isMany;
	protected boolean isOptional;
	protected String isManyExpression = "";

	protected Button isManyButton;
	protected Button isOptionalButton;
	protected Text isManyExpressionText;

	public AssertedRelationshipPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for InContextOf: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		nameText.setEditable(false);
		nameText.setBackground(ColorConstants.white);
		
		if (modelElement instanceof SupportedBy) {
			SupportedBy supportedBy = (SupportedBy) modelElement;
			isMany = supportedBy.isIsMany();
			isOptional = supportedBy.isIsOptional();
		}
		else if (modelElement instanceof InContextOf) {
			InContextOf inContextOf = (InContextOf) modelElement;
			isMany = inContextOf.isIsMany();
			isOptional = inContextOf.isIsOptional();
		}

		AssertedRelationship assertedRelationship = (AssertedRelationship) modelElement;
		
		if (!assertedRelationship.getImplementationConstraint().isEmpty()) {
			ImplementationConstraint constraint = assertedRelationship.getImplementationConstraint().get(0);
			isManyExpression = constraint.getContent().getValue().get(0).getContent();		
		}
		
		createManyExpression(groupContent);
		createIsManyCheckButton(groupContent);
		createIsOptionalCheckButton(groupContent);
	}
	
	private void createManyExpression(Composite container) {
		Label nameLabel = new Label(container, SWT.NONE);
		nameLabel.setText("Many Expr:      ");
		GridData nameData = new GridData();
		nameData.grabExcessHorizontalSpace = true;
		nameData.horizontalAlignment = GridData.FILL;
		
		isManyExpressionText = new Text(container, SWT.BORDER);
		isManyExpressionText.setLayoutData(nameData);
		isManyExpressionText.setText(isManyExpression);
	}
	
	private void createIsManyCheckButton(Composite container) {
		isManyButton = new Button(container, SWT.CHECK);
		isManyButton.setSelection(isMany);
		isManyButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					isMany = true;
					isManyExpressionText.setEditable(true);
					isOptionalButton.setSelection(false);
					isOptional = false;
				}
				else {
					isMany = false;
					isManyExpressionText.setEditable(true);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(isMany);
			}
		});
		createLabel(container, "Many ");
	}
	
	private void createIsOptionalCheckButton(Composite container) {
		isOptionalButton = new Button(container, SWT.CHECK);
		isOptionalButton.setSelection(isOptional);
		if (isOptional) {
			isManyExpressionText.setEditable(false);
		}
		isOptionalButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					isOptional = true;
					isManyButton.setSelection(false);
					isMany = false;
					isManyExpressionText.setEditable(false);
				}
				else {
					isOptional = false;
					isManyExpressionText.setEditable(true);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(isOptional);
			}
		});
		createLabel(container, "Optional");
	}

	@Override
	protected void saveInput() {
		isManyExpression = isManyExpressionText.getText();
		super.saveInput();
	}

	public boolean getIsMany() {
		return isMany;
	}
	
	public boolean getIsOptional() {
		return isOptional;
	}
	
	public String getIsManyExpression() {
		return isManyExpression;
	}
}
