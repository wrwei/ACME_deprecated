package acme.artifact.diagram.dialog;

import java.util.ArrayList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.BrowseModelElementListener;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.diagram.util.ModelElementUtil;
import acme.diagram.util.NavigationManager;
import artifact.ArtifactAsset;
import artifact.ArtifactPackage;
import artifact.Property;
import assuranceCase.AssuranceCasePackage;
import base.ArtifactElement;
import base.Base_Package;
import base.ModelElement;
import gsn.Gsn_Package;
import gsn.Module;
import gsn.Solution;

public abstract class ACMEAbstractArtefactDialog extends ModelElementPropertyDialog {

	protected Label referenceLabel;
	protected Text uri;
	protected Button browseButton;
	protected String uriString;
	
	protected Label citationLabel;
	protected Text citationText;
	protected Button citationButton;
	protected Button removeButton;
	protected Button goToButton;


	public ACMEAbstractArtefactDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}
	
	protected abstract void createCustomGroups(Composite control);

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		//descriptionText.setBackground(ColorConstants.white);
		createCustomGroups(control);
		createReferenceGroup(control);
	}

	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 3);
	
		referenceLabel = new Label(groupContent, SWT.NONE);
		referenceLabel.setText("URI/URL:         ");
	
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		uri = new Text(groupContent, SWT.BORDER);
		uri.setLayoutData(filePathData);
		uri.setBackground(ColorConstants.white);
		uri.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				uriString = uri.getText();
			}
		});
		
		ArtifactAsset artifactAsset = (ArtifactAsset) modelElement;
		//do not the the code below because property is a separate element now
//		if (!artifactAsset.getArtifactProperty().isEmpty()) {
//			Property property = artifactAsset.getArtifactProperty().get(0);
//			String filePath = property.getDescription().getContent().getValue().get(0).getContent();
//			uri.setText(filePath);
//		}
//		else {
//			Property property = Artifact_Factory.eINSTANCE.createProperty();
//			ModelElementFeatureUtil.createBasicFeature(property);
//			ModelElementFeatureUtil.addFeatureTransactional(EditingDomainUtil.getEditingDomain(), artifactAsset, Artifact_Package.eINSTANCE.getArtifactAsset_ArtifactProperty(), property);
//		}
		
		browseButton = new Button(groupContent, SWT.NONE);
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
				uri.setText(path);
				Property property = artifactAsset.getArtifactProperty().get(0);
				ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
						property.getDescription().getContent().getValue().get(0), 
						Base_Package.eINSTANCE.getLangString_Content(), 
						path);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}
	
	protected void createCitationGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Citations", 5);

		citationLabel = new Label(groupContent, SWT.NONE);
		citationLabel.setText("Artefact:         ");

		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		citationText = new Text(groupContent, SWT.BORDER);
		citationText.setLayoutData(filePathData);
		citationText.setEditable(false);
		citationText.setBackground(ColorConstants.white);
		
		Solution solution = (Solution) modelElement;
		if (solution.getCitedElement() != null) {
			ArtifactAsset artifactAsset = (ArtifactAsset) solution.getCitedElement();
			String moduleName = ModelElementUtil.getArtifactPackageName(artifactAsset);
			String solutionName = artifactAsset.getName().getContent();
			citationText.setText(moduleName + "-" + solutionName);
		}

		
		citationButton = new Button(groupContent, SWT.NONE);
		citationButton.setText("Browse...");
		citationButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String[] val = selection.split("-");
				String moduleName = val[0];
				String solutionName = val[1];
				Solution solution = (Solution) modelElement;
				ArtifactPackage module = (ArtifactPackage) ModelElementUtil.locateArtifactPackage(moduleName, solution);
				ArtifactAsset artifactAsset = (ArtifactAsset) ModelElementUtil.locateArtifactAssetByName(solutionName, module);
				if (module != null && artifactAsset != null) {
//					solution.setCitedElement(artifactAsset);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							solution, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							artifactAsset);
					citationText.setText(selection);
					return;
				}
			}
			
			@Override
			public String getTitle() {
				return "Refererence to Artifact";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				Solution solution = (Solution) modelElement;
				Module containingModule = (Module) ModelElementUtil.getContainingModule(solution);
				AssuranceCasePackage containingACPackage = ModelElementUtil.getContainingAssuranceCasePackage(containingModule);
				ArrayList<String> ret = new ArrayList<String>();
				
				for(ArtifactPackage ap: containingACPackage.getArtifactPackage())
				{
					String packageName = ap.getName().getContent();
					for(ArtifactElement ae: ap.getArtifactElement())
					{
							ArtifactAsset artifactAsset = (ArtifactAsset) ae;
							String artifactAssetName = artifactAsset.getName().getContent();
							String val = packageName + "-" + artifactAssetName;
							ret.add(val);
					}
				}
				return ret;
			}
			
			@Override
			public String getMessage() {
				return "Select an Artifact";
			}
		});
		
		removeButton = new Button(groupContent, SWT.NONE);
		removeButton.setText("Remove");
		removeButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				Solution solution = (Solution) modelElement;
				if (solution.getCitedElement() != null) {
//					solution.setCitedElement(null);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							solution, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							null);
					citationText.setText("");
				}
			}
		});
		
		goToButton = new Button(groupContent, SWT.NONE);
		goToButton.setText("Go to");
		goToButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				ModelElement citedElement = (ModelElement) solution.getCitedElement();
				boolean success = NavigationManager.navigateToEditor(citedElement);
				if (success) {
					getShell().close();
				}
			}
		});
	}

	public String getUriString() {
		return uriString;
	}
}