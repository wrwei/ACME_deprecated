package acme.diagram.util;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class NotificationHandler {

	private static NotificationHandler instance;
	
	protected TransactionalEditingDomain editingDomain;
	
	public static NotificationHandler getInstance() {
		if (instance == null) {
			instance = new NotificationHandler();
		}
		return instance;
	}
	
	public NotificationHandler() {
		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("acme.diagram.EditingDomain");
	}
	
	

}
