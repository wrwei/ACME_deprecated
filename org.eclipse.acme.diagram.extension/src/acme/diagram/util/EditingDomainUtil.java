package acme.diagram.util;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class EditingDomainUtil {

	public static TransactionalEditingDomain getEditingDomain() {
		TransactionalEditingDomain editingDomain;
		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");
		return editingDomain;
	}
}
