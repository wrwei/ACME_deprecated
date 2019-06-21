/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.diagram.util;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class EditingDomainUtil {

	public static TransactionalEditingDomain getEditingDomain() {
		TransactionalEditingDomain editingDomain;
		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
		return editingDomain;
	}
}
