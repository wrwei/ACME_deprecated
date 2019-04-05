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
package acme.artifact.diagram.dialog;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import base.ModelElement;

public class EventPropertyDialog extends ACMEAbstractArtefactDialog {

	public EventPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Event: " + getName();
	}

	@Override
	protected void createCustomGroups(Composite control) {
		// TODO Auto-generated method stub
		
	}
}
