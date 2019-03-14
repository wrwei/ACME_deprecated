package acme.diagram.util;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFReader {

	protected ResourceSet resourceSet;
	
	private Resource mm_resource;
	private Resource m_resource;
	private String mm_path;
	private String m_path;
	
	public void setMm_path(String mm_path) {
		this.mm_path = mm_path;
	}
	
	public void setM_path(String m_path) {
		this.m_path = m_path;
	}
	
	public void load_metamodel() throws IOException {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		
		mm_resource = resourceSet.createResource(URI.createFileURI(mm_path));
		mm_resource.load(null);
		
		EPackage ePackage = (EPackage) mm_resource.getContents().get(0);
		resourceSet.getPackageRegistry().put(ePackage.getName(), ePackage);
	}
	
	public void load_model() throws IOException {
		m_resource = resourceSet.createResource(URI.createFileURI(m_path));
		m_resource.load(null);
	}
	
	public Resource getMm_resource() {
		return mm_resource;
	}
	
	public Resource getM_resource() {
		return m_resource;
	}
	
	public ArrayList<EPackage> getAllPackages() {
		ArrayList<EPackage> ret = new ArrayList<EPackage>();
		if (mm_resource != null) {
			for(EObject eObject: mm_resource.getContents()) {
				if (eObject instanceof EPackage) {
					ret.add((EPackage) eObject);
				}
			}
		}
		return ret;
	}
	
	public ArrayList<EClass> getAllTypes(EPackage ePackage) {
		ArrayList<EClass> ret = new ArrayList<EClass>();
		for(EClassifier eClass: ePackage.getEClassifiers()) {
			if (eClass instanceof EClass) {
				ret.add((EClass) eClass);
			}
		}
		return ret; 
	}
	
	public ArrayList<EAttribute> getAllFeasibleFeatures(EClass eClass) {
		ArrayList<EAttribute> ret = new ArrayList<EAttribute>();
		for(EAttribute eAttribute: eClass.getEAttributes()) {
			if (eAttribute.getEType() == EcorePackage.Literals.ESTRING) {
				ret.add(eAttribute);
			}
		}
		return ret;
	}
	
	public ArrayList<EObject> getAllOfKind(EClass type) {
		ArrayList<EObject> ret = new ArrayList<EObject>();
		TreeIterator<EObject> iter = m_resource.getAllContents();
		while(iter.hasNext()) {
			EObject obj = iter.next();

			if (type.isInstance(obj)) {
				ret.add(obj);
			}
		}
		return ret;
	}
	
	public String getVal(EObject eObject, EAttribute eAttribute) {
		return (String) eObject.eGet(eAttribute);
	}
}
