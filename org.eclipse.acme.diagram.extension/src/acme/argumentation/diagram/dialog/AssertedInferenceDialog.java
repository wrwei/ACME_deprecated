/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package acme.argumentation.diagram.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import argumentation.AssertedInference;
import argumentation.AssertionDeclaration;
import base.ModelElement;

public class AssertedInferenceDialog extends ModelElementPropertyDialog{

	protected Combo combo;
	protected int selectedIndex = -1;

	public AssertedInferenceDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createDeclarationGroup(control);
		createIsAbstractGroup(control);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for AssertedInference: " + getName();
	}
	
	protected void createDeclarationGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Assertion Declaration", 1);
	
		AssertedInference assertedInference = (AssertedInference) getModelElement();
		if (assertedInference.getAssertionDeclaration() == AssertionDeclaration.ASSERTED) {
			selectedIndex = 0;
		}
		else if (assertedInference.getAssertionDeclaration() == AssertionDeclaration.NEEDS_SUPPORT) {
			selectedIndex = 1;
		}
		else if (assertedInference.getAssertionDeclaration() == AssertionDeclaration.ASSUMED) {
			selectedIndex = 2;
		}
		else if (assertedInference.getAssertionDeclaration() == AssertionDeclaration.AXIOMATIC) {
			selectedIndex = 3;
		}
		else if (assertedInference.getAssertionDeclaration() == AssertionDeclaration.DEFEATED) {
			selectedIndex = 4;
		}
		else if (assertedInference.getAssertionDeclaration() == AssertionDeclaration.AS_CITED) {
			selectedIndex = 5;
		}
	
		combo = new Combo(groupContent, SWT.READ_ONLY|SWT.DROP_DOWN);
		combo.add("Asserted");
		combo.add("NeedsSupport");
		combo.add("Assumed");
		combo.add("Axiomatic");
		combo.add("Defeated");
		combo.add("AsCited");
		combo.select(selectedIndex);
		
		
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				switch (combo.getSelectionIndex()) {
				case 0:
					selectedIndex = 0;
					break;
				case 1:
					selectedIndex = 1;
					break;
				case 2:
					selectedIndex = 2;
					break;
				case 3:
					selectedIndex = 3;
					break;
				case 4:
					selectedIndex = 4;
					break;
				case 5:
					selectedIndex = 5;
					break;
				default:
					break;
				}
			}
		});
		
		groupContent.layout();
		groupContent.pack();
	}
	
	public int getSelectedIndex() {
		return selectedIndex;
	}
	

}
