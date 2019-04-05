package acme.diagram.util;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import argumentation.ArgumentPackage;
import argumentation.ArgumentationElement;
import artifact.ArtifactAsset;
import artifact.ArtifactPackage;
import assuranceCase.AssuranceCasePackage;
import base.ArtifactElement;
import base.Base_Factory;
import base.Description;
import base.ExpressionLangString;
import base.LangString;
import base.ModelElement;
import base.MultiLangString;
import gsn.ContractModule;
import gsn.Module;
import terminology.Category;
import terminology.Expression;
import terminology.Term;
import terminology.TerminologyPackage;
import terminology.Terminology_Factory;

public class ModelElementUtil {
	
	public static ModelElement getRootElement(ModelElement modelElement) {
		return (ModelElement) EcoreUtil.getRootContainer(modelElement);
	}
	
	public static ModelElement getContainingPackage(ModelElement modelElement) {
		ModelElement container = (ModelElement) modelElement.eContainer();
		if (container != null) {
			if (container instanceof ArgumentPackage ||
					container instanceof TerminologyPackage ||
					container instanceof ArtifactPackage ||
					container instanceof Module) {
				return container;
			}
		}
		return null;
	}

	public static ArgumentPackage getContainingModule(ModelElement modelElement) {
		ModelElement container = (ModelElement) modelElement.eContainer();
		if (container != null) {
			if (container instanceof ArgumentPackage) {
				return (ArgumentPackage) container;
			}
		}
		return null;
	}

	public static ArtifactPackage getContainingArtifactPackage(ModelElement modelElement) {
		ModelElement container = (ModelElement) modelElement.eContainer();
		if (container != null) {
			if (container instanceof ArtifactPackage) {
				return (ArtifactPackage) container;
			}
		}
		return null;
	}
	
	public static TerminologyPackage getContainingTerminologyPackage(ModelElement modelElement) {
		ModelElement container = (ModelElement) modelElement.eContainer();
		if (container != null) {
			if (container instanceof TerminologyPackage) {
				return (TerminologyPackage) container;
			}
		}
		return null;
	}

	public static AssuranceCasePackage getContainingAssuranceCasePackage(ModelElement modelElement) {
		ModelElement container = (ModelElement) modelElement.eContainer();
		if (container != null) {
			if (container instanceof ArtifactPackage) {
				AssuranceCasePackage containingACPackage = (AssuranceCasePackage) container.eContainer();
				if (containingACPackage != null) {
					return containingACPackage;
				}
			} else if (container instanceof Module || container instanceof ContractModule) {
				AssuranceCasePackage containingACPackage = (AssuranceCasePackage) container.eContainer();
				if (containingACPackage != null) {
					return containingACPackage;
				}
			} else if (container instanceof AssuranceCasePackage) {
				return (AssuranceCasePackage) container;
			}
		}
		return null;
	}

	public static ArgumentPackage locateOtherModuleByName(String name, ArgumentationElement argumentationElement) {
		for (ArgumentPackage ap : getAllArgumentPackages(argumentationElement)) {
			if (ap instanceof ArgumentPackage) {
				if (ap.getName().getContent().equals(name)) {
					return (ArgumentPackage) ap;
				}
			}
		}
		return null;
	}

	public static ModelElement locateModelElementByName(String name, ArgumentPackage ap) {
		for (ArgumentationElement ae : ap.getArgumentationElement()) {
			if (ae.getName().getContent().equals(name)) {
				return ae;
			}
		}
		return null;
	}

	public static ModelElement locateArtifactAssetByName(String name, ArtifactPackage ap) {
		for (ArtifactElement ae : ap.getArtifactElement()) {
			if (ae.getName().getContent().equals(name)) {
				return ae;
			}
		}
		return null;
	}
	
	public static ModelElement locateArgumentElementByName(String name, ArgumentPackage ap) {
		for (ArgumentationElement ae : ap.getArgumentationElement()) {
			if (ae.getName().getContent().equals(name)) {
				return ae;
			}
		}
		return null;
	}

	public static String getModuleName(ArgumentationElement argumentationElement) {
		if (argumentationElement instanceof ArgumentPackage) {
			return argumentationElement.getName().getContent();
		} else {
			return getContainingModule(argumentationElement).getName().getContent();
		}
	}

	public static String getArtifactPackageName(ArtifactAsset artifactAsset) {
		return getContainingArtifactPackage(artifactAsset).getName().getContent();
	}
	
	public static ArgumentPackage locateArgumentPackage(String name, ModelElement modelElement) {
		ArrayList<ArgumentPackage> argumentPackages = getAllArgumentPackages(modelElement);
		for(ArgumentPackage ap: argumentPackages) {
			if (name.equals(ModelElementFeatureUtil.getName(ap))) {
				return ap;
			}
		}
		return null;
	}
	
	public static ArrayList<ArgumentPackage> getAllArgumentPackages(ModelElement modelElement) {
		ArrayList<ArgumentPackage> ret = new ArrayList<ArgumentPackage>();
		EObject root = EcoreUtil.getRootContainer(modelElement);
		if (root instanceof ArgumentPackage) {
			ret.add((ArgumentPackage) root);
		}
		Iterator<EObject> iter= root.eAllContents();

		while (iter.hasNext()) {
			EObject temp = iter.next();
			if (temp instanceof ArgumentPackage) {
				ret.add((ArgumentPackage) temp);
			}
		}
		return ret;
	}
	
	public static ArrayList<ArtifactPackage> getAllArtifactPackages(ModelElement modelElement) {
		ArrayList<ArtifactPackage> ret = new ArrayList<ArtifactPackage>();
		EObject root = EcoreUtil.getRootContainer(modelElement);
		if (root instanceof ArtifactPackage) {
			ret.add((ArtifactPackage) root);
		}
		Iterator<EObject> iter= root.eAllContents();
		while (iter.hasNext()) {
			EObject temp = iter.next();
			if (temp instanceof ArtifactPackage) {
				ret.add((ArtifactPackage) temp);
			}
		}
		return ret;
	}

	public static ArtifactPackage locateArtifactPackage(String name, ModelElement modelElement) {
		ArrayList<ArtifactPackage> artifactPackages = getAllArtifactPackages(modelElement);
		for(ArtifactPackage ap: artifactPackages) {
			if (name.equals(ModelElementFeatureUtil.getName(ap))) {
				return ap;
			}
		}
		return null;
	}
	
	public static void createName(ModelElement modelElement, String name) {
		Base_Factory base_Factory = Base_Factory.eINSTANCE;
		LangString langString = base_Factory.createLangString();
		langString.setLang("English");
		langString.setContent(name);
		modelElement.setName(langString);
	}
	
	public static void createDescription(ModelElement modelElement, String description) {
		Base_Factory base_Factory = Base_Factory.eINSTANCE;
		Terminology_Factory term_factory = Terminology_Factory.eINSTANCE;

		Description desc = base_Factory.createDescription();
		MultiLangString multiLangString = base_Factory.createMultiLangString();
		ExpressionLangString descriptionLangString = base_Factory.createExpressionLangString();
		
		descriptionLangString.setLang("English");
		descriptionLangString.setContent(description);
		Expression expression = term_factory.createExpression();
		expression.setValue(description);
		createName(expression, modelElement.getName().getContent() + "_description");
		descriptionLangString.setExpression(expression);
		
		multiLangString.getValue().add(descriptionLangString);
		desc.setContent(multiLangString);
		modelElement.setDescription(desc);
	}
	
	public static Category createCategory(String name, String desc) {
		Terminology_Factory terminology_Factory = Terminology_Factory.eINSTANCE;
		Category category = terminology_Factory.createCategory();
		createName(category, name);
		createDescription(category, desc);
		return category;
	}
	
	public static Term createTerm(String name, String desc, String value, String externalRef, ArrayList<Category> categories) {
		Terminology_Factory terminology_Factory = Terminology_Factory.eINSTANCE;
		Term term = terminology_Factory.createTerm();
		createName(term, name);
		createDescription(term, desc);
		term.setValue(value);
		term.setExternalReference(externalRef);
		if (categories != null) {
			term.getCategory().addAll(categories);	
		}
		return term;
	}
	
	public static Expression createExpression(String name, String desc, String value, ArrayList<Category> categories, ArrayList<Expression> elements) {
		Terminology_Factory terminology_Factory = Terminology_Factory.eINSTANCE;
		Expression expression = terminology_Factory.createExpression();
		createName(expression, name);
		createDescription(expression, desc);
		expression.setValue(value);
		expression.getCategory().addAll(categories);
		expression.getElement().addAll(elements);
		return expression;
	}
	
}
