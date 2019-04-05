package acme.diagram.util;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import base.Base_Factory;
import base.Base_Package;
import base.Description;
import base.ExpressionLangString;
import base.ImplementationConstraint;
import base.LangString;
import base.ModelElement;
import base.MultiLangString;
import terminology.Terminology_Factory;

public class ModelElementFeatureUtil {

	public static void createBasicFeature(ModelElement modelElement) {
		createName(modelElement, "Name");
		createDescription(modelElement, "<...>");
		createImplementationConstraint(modelElement, "");
	}
	
	public static void createName(ModelElement modelElement, String name) {
		Base_Factory base_Factory = Base_Factory.eINSTANCE;
		LangString langString = base_Factory.createLangString();
		langString.setLang("ENG");
		langString.setContent(name);
		modelElement.setName(langString);
	}
	
	public static void createDescription(ModelElement modelElement, String description) {
		Base_Factory base_Factory = Base_Factory.eINSTANCE;
		Terminology_Factory term_factory = Terminology_Factory.eINSTANCE;

		//create description
		Description desc = base_Factory.createDescription();
		
		//create multi lang string
		MultiLangString multiLangString = base_Factory.createMultiLangString();
		
		//create expression lang string
		ExpressionLangString descriptionLangString = base_Factory.createExpressionLangString();
		
		//set content
		descriptionLangString.setLang("ENG");
		descriptionLangString.setContent(description);
		
		//create an expression
//		Expression expression = term_factory.createExpression();
//		expression.setValue(description);
		
		//create name for expression
//		createName(expression, modelElement.getName().getContent() + "_description");
//		descriptionLangString.setExpression(expression);
		
		multiLangString.getValue().add(descriptionLangString);
		desc.setContent(multiLangString);
		modelElement.setDescription(desc);
	}
	
	
	public static void createImplementationConstraint(ModelElement modelElement, String constraint) {
		Base_Factory base_Factory = Base_Factory.eINSTANCE;
		ImplementationConstraint implementationConstraint = base_Factory.createImplementationConstraint();
		MultiLangString _multiLangString = base_Factory.createMultiLangString();
		LangString _langString = base_Factory.createLangString();
		_langString.setLang("ENG");
		_langString.setContent(constraint);
		_multiLangString.getValue().add(_langString);
		implementationConstraint.setContent(_multiLangString);
		modelElement.getImplementationConstraint().add(implementationConstraint);
	}
	public static String getName(EObject eObject) {
		if (eObject instanceof ModelElement) {
			ModelElement modelElement = (ModelElement) eObject;
			return modelElement.getName().getContent();
		}
		return null;
	}
	
	public static void setName(EObject eObject, String value) {
		if (eObject instanceof ModelElement) {
			ModelElement modelElement = (ModelElement) eObject;
			modelElement.getName().setContent(value);
		}
	}
	
	public static String getDescription(EObject eObject) {
		if (eObject instanceof ModelElement) {
			ModelElement modelElement = (ModelElement) eObject;
			return modelElement.getDescription().getContent().getValue().get(0).getContent();
		}
		return null;
	}
	
	public static void setDescription(EObject eObject, String value) {
		if (eObject instanceof ModelElement) {
			ModelElement modelElement = (ModelElement) eObject;
			modelElement.getDescription().getContent().getValue().get(0).setContent(value);
		}
	}
	
	public static void setNameTransactional(EditingDomain editingDomain, ModelElement modelElement, String name) {
		SetCommand setCommand = (SetCommand) SetCommand.create(editingDomain, modelElement.getName(), Base_Package.eINSTANCE.getLangString_Content(), name);
		editingDomain.getCommandStack().execute(setCommand);
	}
	
	public static void setDescriptionTransactional(EditingDomain editingDomain, ModelElement modelElement, String description) {
		SetCommand setCommand = (SetCommand) SetCommand.create(editingDomain, modelElement.getDescription().getContent().getValue().get(0), Base_Package.eINSTANCE.getLangString_Content(), description);
		editingDomain.getCommandStack().execute(setCommand);
	}
	
	public static void setFeatureTransactional(EditingDomain editingDomain, Object owner, EStructuralFeature feature, Object value) {
		SetCommand setCommand = (SetCommand) SetCommand.create(editingDomain, owner, feature, value);
		editingDomain.getCommandStack().execute(setCommand);
	}
	
	public static void addFeatureTransactional(EditingDomain editingDomain, Object owner, EStructuralFeature feature, Object value) {
		AddCommand addCommand = (AddCommand) AddCommand.create(editingDomain, owner, feature, value);
		editingDomain.getCommandStack().execute(addCommand);
	}
	
	public static void removeFeatureTransactional(EditingDomain editingDomain, Object owner, EStructuralFeature feature, Object value) {
		RemoveCommand removeCommand = (RemoveCommand) RemoveCommand.create(editingDomain, owner, feature, value);
		editingDomain.getCommandStack().execute(removeCommand);
	}

	
	public static Command getSetCommand(EditingDomain editingDomain, Object owner, EStructuralFeature feature, Object value) {
		SetCommand setCommand = (SetCommand) SetCommand.create(editingDomain, owner, feature, value);
		return setCommand;
	}
	
	public static Command getRemoveCommand(EditingDomain editingDomain, Object owner, EStructuralFeature feature, Object value) {
		RemoveCommand removeCommand = (RemoveCommand) RemoveCommand.create(editingDomain, owner, feature, value);
		return removeCommand;
	}
	
}
