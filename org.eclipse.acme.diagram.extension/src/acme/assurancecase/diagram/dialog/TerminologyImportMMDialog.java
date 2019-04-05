package acme.assurancecase.diagram.dialog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.EMFReader;
import acme.diagram.util.ModelElementUtil;
import base.ModelElement;
import terminology.Category;
import terminology.Term;
import terminology.TerminologyAsset;
import terminology.TerminologyPackage;

public class TerminologyImportMMDialog extends ModelElementPropertyDialog {

	public TerminologyImportMMDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, null);
	}
	
	protected Text mm_uri;
	protected String mm_path;
	
	protected Label m_label;
	protected Text m_uri;
	protected String m_path;
	
	private CheckboxTreeViewer checkboxTreeViewer;
	
	private EMFReader emfReader = new EMFReader();
	
	private ArrayList<Object> contents = new ArrayList<Object>();

	private TerminologyPackage terminologyPackage;
	
	private ArrayList<EObject> checkedElements = new ArrayList<EObject>();
	
	private HashMap<EObject, TerminologyAsset> map = new HashMap<EObject, TerminologyAsset>();
	
	@Override
	protected String getTitleString() {
		return "Import Terminologies From Another Model";
	}
	
	public void setEmfReader(EMFReader emfReader) {
		this.emfReader = emfReader;
	}
	
	public void setTerminologyPackage(TerminologyPackage terminologyPackage) {
		this.terminologyPackage = terminologyPackage;
	}
	
	@Override
	protected void createGroups(Composite control) {
		createReferenceGroup(control);
		createViewerGroup(control);
	}
	
	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Locations", 4);
	
		final Label mm_label = new Label(groupContent, SWT.NONE);
		mm_label.setText("Metamodel: ");
	
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		mm_uri = new Text(groupContent, SWT.BORDER);
		mm_uri.setLayoutData(filePathData);
		mm_uri.setBackground(ColorConstants.white);
		mm_uri.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				mm_path = mm_uri.getText();
			}
		});
		
		final Button browseButton = new Button(groupContent, SWT.NONE);
		browseButton.setText("Browse...");
		browseButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(browseButton.getShell());
				fileDialog.setText("Locate file");
				String path = fileDialog.open();
				if (path == null) {
					return;
				}
				mm_uri.setText(path);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		final Button loadButton = new Button(groupContent, SWT.NONE);
		loadButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		loadButton.setText("Load");
		loadButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				emfReader.setMm_path(mm_uri.getText());
				boolean success = true;
				try {
					emfReader.load_metamodel();
				} catch (IOException e1) {
					success = false;
				}
				if (success) {
					fillContent();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		
		m_label = new Label(groupContent, SWT.NONE);
		m_label.setText("Model: ");
	
		m_uri = new Text(groupContent, SWT.BORDER);
		m_uri.setLayoutData(filePathData);
		m_uri.setBackground(ColorConstants.white);
		m_uri.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				m_path = m_uri.getText();
			}
		});
		
		final Button m_browseButton = new Button(groupContent, SWT.NONE);
		m_browseButton.setText("Browse...");
		m_browseButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(m_browseButton.getShell());
				fileDialog.setText("Locate file");
				String path = fileDialog.open();
				if (path == null) {
					return;
				}
				m_uri.setText(path);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		final Button m_loadButton = new Button(groupContent, SWT.NONE);
		m_loadButton.setText("Validate");
		m_loadButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				emfReader.setM_path(m_uri.getText());
				boolean success = true;
				try {
					emfReader.load_model();
				} catch (Exception e1) {
					success = false;
				}
				if (!success) {
					m_label.setForeground(ColorConstants.red);
				}
				else {
					m_label.setForeground(ColorConstants.green);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		
		groupContent.getLayout();
		groupContent.pack();
	}
	
	public String getMm_path() {
		return mm_path;
	}
	
	@Override
	protected void saveInput() {
	}
	
	protected void createViewerGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Extract Terminologies", 2);
	
		checkboxTreeViewer = new CheckboxTreeViewer(groupContent);
		checkboxTreeViewer.setContentProvider(new ModelElementContentProvider());
		checkboxTreeViewer.getTree().setHeaderVisible(true);
		checkboxTreeViewer.getTree().setLinesVisible(true);
		GridData treeViewLayout = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3);
		treeViewLayout.minimumHeight = 200;
		checkboxTreeViewer.getControl().setLayoutData(treeViewLayout);

		
		TreeViewerColumn viewerColumn0  = new TreeViewerColumn(checkboxTreeViewer, SWT.NONE);
		viewerColumn0.getColumn().setWidth(500);
		viewerColumn0.getColumn().setText("Name");
		viewerColumn0.setLabelProvider(new DelegatingStyledCellLabelProvider(new TerminologyNameLabelProvider()));

		checkboxTreeViewer.setInput(contents);
		
		checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				handleElement(event.getElement(), event.getChecked());
				checkedElements.clear();
				checkedElements.addAll((Collection<? extends EObject>) Arrays.asList(checkboxTreeViewer.getCheckedElements()));
			}
		});
		
		GridLayoutFactory.fillDefaults().generateLayout(container);
		
		groupContent.layout();
		groupContent.pack();
	}
	
	private void handleElement(Object object, boolean bool) {
		if (bool) {
			if (!checkedElements.contains(object)) {
				checkedElements.add((EObject) object);
			}
		}
		else {
			if (checkedElements.contains(object)) {
				checkedElements.remove(object);
			}
		}
		if (object instanceof EPackage) {
			EPackage ePackage = (EPackage) object;
			ArrayList<EObject> temp = new ArrayList<EObject>();
			temp.add(ePackage);
			if (!ePackage.getESubpackages().isEmpty()) {
				temp.addAll(ePackage.getESubpackages());
				for(EPackage ep: ePackage.getESubpackages()) {
					temp.addAll(emfReader.getAllTypes(ep));
					for(EClass eClass: emfReader.getAllTypes(ep)) {
						temp.addAll(emfReader.getAllFeasibleFeatures(eClass));
					}
				}
			}
			temp.addAll(emfReader.getAllTypes(ePackage));
			for(EClass eClass: emfReader.getAllTypes(ePackage)) {
				temp.addAll(emfReader.getAllFeasibleFeatures(eClass));
			}
			for(EObject obj: temp) {
				checkboxTreeViewer.setExpandedState(obj, bool);
				checkboxTreeViewer.setChecked(obj, bool);
			}
			if (ePackage.getESuperPackage() != null) {
				checkboxTreeViewer.setExpandedState(ePackage.getESuperPackage(), true);
				checkboxTreeViewer.setChecked(ePackage.getESuperPackage(), true);
			}
		}
		else if (object instanceof EClass) {
			EClass eClass = (EClass) object;
			ArrayList<EObject> temp = new ArrayList<EObject>();
			temp.add(eClass);
			temp.addAll(emfReader.getAllFeasibleFeatures(eClass));
			for(EObject obj: temp) {
				checkboxTreeViewer.setExpandedState(object, bool);
				checkboxTreeViewer.setChecked(obj, bool);
			}
			if (bool) {
				EPackage ePackage = eClass.getEPackage();
				checkboxTreeViewer.setExpandedState(ePackage, bool);
				checkboxTreeViewer.setChecked(ePackage, bool);
				EPackage sp = ePackage.getESuperPackage();
				while(sp != null) {
					checkboxTreeViewer.setExpandedState(sp, bool);
					checkboxTreeViewer.setChecked(sp, bool);
					sp = sp.getESuperPackage();
				}
			}
		}
	}
	
	private void fillContent() {
		if (emfReader != null) {
			contents.clear();
			for(EPackage ePackage: emfReader.getAllPackages()) {
				contents.add(ePackage);
			}
			checkboxTreeViewer.setInput(contents);
		}
	}
	
	private class ModelElementContentProvider implements ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			//fillContent();
		}
		
		@Override
		public Object[] getElements(Object inputElement) {
			@SuppressWarnings("unchecked")
			ArrayList<Object> input = (ArrayList<Object>) inputElement;
			return input.toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof EPackage) {
				EPackage ePackage = (EPackage) parentElement;
				if (ePackage.getESubpackages().isEmpty()) {
					return emfReader.getAllTypes(ePackage).toArray();
				}
				else {
					return ePackage.getESubpackages().toArray();
				}
			}
			else if (parentElement instanceof EClass) {
				return emfReader.getAllFeasibleFeatures((EClass) parentElement).toArray();
			}
			return null;
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof EPackage) {
				EPackage ePackage = (EPackage) element;
				if (ePackage.getESubpackages().isEmpty()) {
					if (!emfReader.getAllTypes(ePackage).isEmpty()) {
						return true;
					}
				}
				else {
					return true;
				}
			}
			else if (element instanceof EClass) {
				if (!emfReader.getAllFeasibleFeatures((EClass) element).isEmpty()) {
					return true;
				}
			}
			return false;
		}
	}
	
	private class TerminologyNameLabelProvider extends LabelProvider implements IStyledLabelProvider {

		@Override
		public StyledString getStyledText(Object element) {
			StyledString styledString = null;
			if (element instanceof EPackage) {
				EPackage ePackage = (EPackage) element;
				styledString = new StyledString(ePackage.getName());
			}
			else if (element instanceof EClass) {
				EClass eClass = (EClass) element;
				styledString = new StyledString(eClass.getName());
			}
			else if (element instanceof EAttribute) {
				EAttribute eAttribute = (EAttribute) element;
				styledString = new StyledString(eAttribute.getName());
			}
			return styledString;
		}
	}
	
	private ArrayList<EPackage> getCheckedPackages() {
		ArrayList<EPackage> ret = new ArrayList<EPackage>();
		for(Object obj: checkedElements) {
			if (obj instanceof EPackage) {
				ret.add((EPackage) obj);
			}
		}
		return ret;
	}
	
	private ArrayList<EClass> getCheckedEClasses() {
		ArrayList<EClass> ret = new ArrayList<EClass>();
		for(Object obj: checkedElements) {
			if (obj instanceof EClass) {
				ret.add((EClass) obj);
			}
		}
		return ret;
	}
	
	private ArrayList<EAttribute> getCheckedEAttributes() {
		ArrayList<EAttribute> ret = new ArrayList<EAttribute>();
		for(Object obj: checkedElements) {
			if (obj instanceof EAttribute) {
				ret.add((EAttribute) obj);
			}
		}
		return ret;
	}
	
	public void createTerminologies() {
		ArrayList<EPackage> checkedPackages = getCheckedPackages();
		ArrayList<EClass> checkedClasses = getCheckedEClasses();
		ArrayList<EAttribute> checkedAttributes = getCheckedEAttributes();
		for(EPackage ePackage: checkedPackages) {
			Category ep_category = ModelElementUtil.createCategory(ePackage.getName(), "");
			map.put(ePackage, ep_category);
			terminologyPackage.getTerminologyElement().add(ep_category);
			for(EClass eClass: checkedClasses) {
				if (eClass.getEPackage().equals(ePackage) && checkedClasses.contains(eClass)) {
					Category cat = ModelElementUtil.createCategory(eClass.getName(), "");
					terminologyPackage.getTerminologyElement().add(cat);
					map.put(eClass, cat);
					cat.setCategory(ep_category);
					for(EAttribute eAttribute: eClass.getEAttributes()) {
						if (checkedAttributes.contains(eAttribute)) {
							Category attr_cat = ModelElementUtil.createCategory(eAttribute.getName(), "");
							attr_cat.setCategory(cat);
							map.put(eAttribute, attr_cat);
							terminologyPackage.getTerminologyElement().add(attr_cat);
						}
					}
				}
			}
			EPackage parent = ePackage.getESuperPackage();
			Category temp = ep_category;
			while(parent != null) {
				Category parent_cat = ModelElementUtil.createCategory(parent.getName(), "");
				terminologyPackage.getTerminologyElement().add(parent_cat);
				map.put(parent, parent_cat);
				temp.setCategory(parent_cat);
				temp = parent_cat;
				parent = parent.getESuperPackage();
			}
		}
		
		for(EObject obj: map.keySet()) {
			if (obj instanceof EClass) {
				ArrayList<EObject> all = emfReader.getAllOfKind((EClass) obj);
				for(EObject eObject: all) {
					for(EAttribute eAttribute: getCheckedEAttribute((EClass) obj)) {
						String value = (String) eObject.eGet(eAttribute);
						Term term = ModelElementUtil.createTerm(value, "", value, "", null);
						Category cat = (Category) map.get(eAttribute);
						if (cat != null) {
							term.getCategory().add(cat);	
						}
					}
				}
			}
		}
	}
	
	protected ArrayList<EAttribute> getCheckedEAttribute(EClass eClass) {
		ArrayList<EAttribute> checkedAttributes = getCheckedEAttributes();
		ArrayList<EAttribute> ret = new ArrayList<EAttribute>();
		for(EAttribute eAttribute: eClass.getEAttributes()) {
			if (checkedAttributes.contains(eAttribute)) {
				ret.add(eAttribute);
			}
		}
		return ret;
	}
}
