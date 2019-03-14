
package assuranceCase.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class AssurancecasePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSACM1Group());
		paletteRoot.add(createGSN2Group());
		paletteRoot.add(createCAE3Group());
	}

	/**
	* Creates "SACM" palette tool group
	* @generated 
	*/
	private PaletteContainer createSACM1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(assuranceCase.diagram.part.Messages.SACM1Group_title);
		paletteContainer.setId("createSACM1Group"); //$NON-NLS-1$
		paletteContainer.add(createAssuranceCasePackage1CreationTool());
		paletteContainer.add(createAssuranceCasePackageInterface2CreationTool());
		paletteContainer.add(createAssuranceCasePackageBinding3CreationTool());
		paletteContainer.add(createArgumentPackage4CreationTool());
		paletteContainer.add(createArgumentPackageInterface5CreationTool());
		paletteContainer.add(createArgumentPackageBinding6CreationTool());
		paletteContainer.add(createArtifactPackage7CreationTool());
		paletteContainer.add(createArtifactPackageInterface8CreationTool());
		paletteContainer.add(createArtifactPackageBinding9CreationTool());
		paletteContainer.add(createTerminologyPackage10CreationTool());
		paletteContainer.add(createTerminologyPackageInterface11CreationTool());
		paletteContainer.add(createTerminologyPackageBinding12CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "GSN" palette tool group
	* @generated
	*/
	private PaletteContainer createGSN2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(assuranceCase.diagram.part.Messages.GSN2Group_title);
		paletteContainer.setId("createGSN2Group"); //$NON-NLS-1$
		paletteContainer.add(createModule1CreationTool());
		paletteContainer.add(createContractModule2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "CAE" palette tool group
	* @generated
	*/
	private PaletteContainer createCAE3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(assuranceCase.diagram.part.Messages.CAE3Group_title);
		paletteContainer.setId("createCAE3Group"); //$NON-NLS-1$
		paletteContainer.add(createCAEModule1CreationTool());
		paletteContainer.add(createCAEModuleInterface2CreationTool());
		paletteContainer.add(createCAEModuleBinding3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssuranceCasePackage1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.AssuranceCasePackage1CreationTool_title,
				assuranceCase.diagram.part.Messages.AssuranceCasePackage1CreationTool_desc, Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackage_2001));
		entry.setId("createAssuranceCasePackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackage_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssuranceCasePackageInterface2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.AssuranceCasePackageInterface2CreationTool_title,
				assuranceCase.diagram.part.Messages.AssuranceCasePackageInterface2CreationTool_desc,
				Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageInterface_2019));
		entry.setId("createAssuranceCasePackageInterface2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageInterface_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssuranceCasePackageBinding3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.AssuranceCasePackageBinding3CreationTool_title,
				assuranceCase.diagram.part.Messages.AssuranceCasePackageBinding3CreationTool_desc,
				Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageBinding_2018));
		entry.setId("createAssuranceCasePackageBinding3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.AssuranceCasePackageBinding_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArgumentPackage4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.ArgumentPackage4CreationTool_title,
				assuranceCase.diagram.part.Messages.ArgumentPackage4CreationTool_desc, Collections
						.singletonList(assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackage_2004));
		entry.setId("createArgumentPackage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackage_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArgumentPackageInterface5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.ArgumentPackageInterface5CreationTool_title,
				assuranceCase.diagram.part.Messages.ArgumentPackageInterface5CreationTool_desc,
				Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageInterface_2003));
		entry.setId("createArgumentPackageInterface5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageInterface_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArgumentPackageBinding6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.ArgumentPackageBinding6CreationTool_title,
				assuranceCase.diagram.part.Messages.ArgumentPackageBinding6CreationTool_desc, Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageBinding_2002));
		entry.setId("createArgumentPackageBinding6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArgumentPackageBinding_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactPackage7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.ArtifactPackage7CreationTool_title,
				assuranceCase.diagram.part.Messages.ArtifactPackage7CreationTool_desc, Collections
						.singletonList(assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackage_2007));
		entry.setId("createArtifactPackage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackage_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactPackageInterface8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.ArtifactPackageInterface8CreationTool_title,
				assuranceCase.diagram.part.Messages.ArtifactPackageInterface8CreationTool_desc,
				Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageInterface_2009));
		entry.setId("createArtifactPackageInterface8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageInterface_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactPackageBinding9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.ArtifactPackageBinding9CreationTool_title,
				assuranceCase.diagram.part.Messages.ArtifactPackageBinding9CreationTool_desc, Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageBinding_2008));
		entry.setId("createArtifactPackageBinding9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.ArtifactPackageBinding_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTerminologyPackage10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.TerminologyPackage10CreationTool_title,
				assuranceCase.diagram.part.Messages.TerminologyPackage10CreationTool_desc, Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackage_2010));
		entry.setId("createTerminologyPackage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackage_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTerminologyPackageInterface11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.TerminologyPackageInterface11CreationTool_title,
				assuranceCase.diagram.part.Messages.TerminologyPackageInterface11CreationTool_desc,
				Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageInterface_2011));
		entry.setId("createTerminologyPackageInterface11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageInterface_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTerminologyPackageBinding12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.TerminologyPackageBinding12CreationTool_title,
				assuranceCase.diagram.part.Messages.TerminologyPackageBinding12CreationTool_desc,
				Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageBinding_2012));
		entry.setId("createTerminologyPackageBinding12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes.getImageDescriptor(
				assuranceCase.diagram.providers.AssurancecaseElementTypes.TerminologyPackageBinding_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModule1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.Module1CreationTool_title,
				assuranceCase.diagram.part.Messages.Module1CreationTool_desc,
				Collections.singletonList(assuranceCase.diagram.providers.AssurancecaseElementTypes.Module_2013));
		entry.setId("createModule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.Module_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContractModule2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.ContractModule2CreationTool_title,
				assuranceCase.diagram.part.Messages.ContractModule2CreationTool_desc, Collections
						.singletonList(assuranceCase.diagram.providers.AssurancecaseElementTypes.ContractModule_2014));
		entry.setId("createContractModule2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.ContractModule_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCAEModule1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.CAEModule1CreationTool_title,
				assuranceCase.diagram.part.Messages.CAEModule1CreationTool_desc,
				Collections.singletonList(assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModule_2015));
		entry.setId("createCAEModule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModule_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCAEModuleInterface2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.CAEModuleInterface2CreationTool_title,
				assuranceCase.diagram.part.Messages.CAEModuleInterface2CreationTool_desc, Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleInterface_2016));
		entry.setId("createCAEModuleInterface2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleInterface_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCAEModuleBinding3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				assuranceCase.diagram.part.Messages.CAEModuleBinding3CreationTool_title,
				assuranceCase.diagram.part.Messages.CAEModuleBinding3CreationTool_desc, Collections.singletonList(
						assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleBinding_2017));
		entry.setId("createCAEModuleBinding3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(assuranceCase.diagram.providers.AssurancecaseElementTypes
				.getImageDescriptor(assuranceCase.diagram.providers.AssurancecaseElementTypes.CAEModuleBinding_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
