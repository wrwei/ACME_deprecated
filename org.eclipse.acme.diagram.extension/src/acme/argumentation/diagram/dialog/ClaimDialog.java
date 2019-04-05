package acme.argumentation.diagram.dialog;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
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
import argumentation.ArgumentPackage;
import argumentation.AssertionDeclaration;
import argumentation.Claim;
import base.ModelElement;
import gsn.Gsn_Package;

public class ClaimDialog extends ModelElementPropertyDialog {

	protected Combo combo;
	protected int selectedIndex = -1;
	
	public ClaimDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createDeclarationGroup(control);
		createIsAbstractGroup(control);
		createCitationGroup(control);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Claim: " + getName();
	}
	
	protected void createDeclarationGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Assertion Declaration", 1);
	
		Claim claim = (Claim) getModelElement();
		if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSERTED) {
			selectedIndex = 0;
		}
		else if (claim.getAssertionDeclaration() == AssertionDeclaration.NEEDS_SUPPORT) {
			selectedIndex = 1;
		}
		else if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSUMED) {
			selectedIndex = 2;
		}
		else if (claim.getAssertionDeclaration() == AssertionDeclaration.AXIOMATIC) {
			selectedIndex = 3;
		}
		else if (claim.getAssertionDeclaration() == AssertionDeclaration.DEFEATED) {
			selectedIndex = 4;
		}
		else if (claim.getAssertionDeclaration() == AssertionDeclaration.AS_CITED) {
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
	
	protected void createCitationGroup(Composite container) {
		//create group content
		final Composite groupContent = createGroupContainer(container, "Citation", 5);

		//citation label
		citationLabel = new Label(groupContent, SWT.NONE);
		citationLabel.setText("Claim:         ");

		//citation text
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		citationText = new Text(groupContent, SWT.BORDER);
		citationText.setLayoutData(filePathData);
		citationText.setEditable(false);
		citationText.setBackground(ColorConstants.white);
		
		Claim claim = (Claim) modelElement;
		if (claim.getCitedElement() != null) {
			Claim citedClaim = (Claim) claim.getCitedElement();
			String packageName = ModelElementFeatureUtil.getName(ModelElementUtil.getContainingPackage(citedClaim));
			String citedClaimName = ModelElementFeatureUtil.getName(citedClaim);
			citationText.setText(packageName + "-" + citedClaimName);
		}

		
		citationButton = new Button(groupContent, SWT.NONE);
		citationButton.setText("Cite...");
		citationButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String[] val = selection.split("-");
				String moduleName = val[0];
				String citedClaimName = val[1];
				Claim claim = (Claim) modelElement;
				ArgumentPackage argumentPackage = (ArgumentPackage) ModelElementUtil.locateArgumentPackage(moduleName, claim);
				Claim citedClaim = (Claim) ModelElementUtil.locateArgumentElementByName(citedClaimName, argumentPackage);
				if (argumentPackage != null && citedClaim != null) {
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							claim, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							citedClaim);
					citationText.setText(selection);
					return;
				}
			}
			
			@Override
			public String getTitle() {
				return "Cite another Claim";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				Claim claim = (Claim) modelElement;
				ModelElement rooElement = ModelElementUtil.getRootElement(claim);
				Iterator<EObject> iter = rooElement.eAllContents();

				ArrayList<String> ret = new ArrayList<String>();

				while(iter.hasNext()) {
					EObject next = iter.next();
					if (next instanceof Claim) {
						ArgumentPackage argumentPackage = (ArgumentPackage) ModelElementUtil.getContainingPackage((ModelElement) next);
						String argumentName = ModelElementFeatureUtil.getName(argumentPackage);
						String claimName = ModelElementFeatureUtil.getName(next);
						ret.add(argumentName + "-" + claimName);
					}
				}
				return ret;
			}
			
			@Override
			public String getMessage() {
				return "Select an Artifact";
			}
		});
		
		citation_removeButton = new Button(groupContent, SWT.NONE);
		citation_removeButton.setText("Remove");
		citation_removeButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				Claim claim = (Claim) modelElement;
				if (claim.getCitedElement() != null) {
//					solution.setCitedElement(null);
					ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							claim, 
							Gsn_Package.eINSTANCE.getSolution().getEStructuralFeature("citedElement"), 
							null);
					citationText.setText("");
				}
			}
		});
		
		citation_goToButton = new Button(groupContent, SWT.NONE);
		citation_goToButton.setText("Go to");
		citation_goToButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				ModelElement citedElement = (ModelElement) claim.getCitedElement();
				boolean success = NavigationManager.navigateToEditor(citedElement);
				if (success) {
					getShell().close();
				}
			}
		});
	}
	
	
	public int getSelectedIndex() {
		return selectedIndex;
	}
	
}
