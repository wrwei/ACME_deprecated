
package argumentation.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import argumentation.diagram.providers.ArgumentationElementTypes;

/**
 * @generated
 */
public class ArgumentationPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createArgumentPackage1Group());
		paletteRoot.add(createArgumentationElements2Group());
	}

	/**
	* Creates "Argument Package" palette tool group
	* @generated
	*/
	private PaletteContainer createArgumentPackage1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ArgumentPackage1Group_title);
		paletteContainer.setId("createArgumentPackage1Group"); //$NON-NLS-1$
		paletteContainer.add(createArgumentPackage1CreationTool());
		paletteContainer.add(createArgumentPackageInterface2CreationTool());
		paletteContainer.add(createArgumentPackageBinding3CreationTool());
		paletteContainer.add(createArgumentGroup4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Argumentation Elements" palette tool group
	* @generated
	*/
	private PaletteContainer createArgumentationElements2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ArgumentationElements2Group_title);
		paletteContainer.setId("createArgumentationElements2Group"); //$NON-NLS-1$
		paletteContainer.add(createClaim1CreationTool());
		paletteContainer.add(createArtifactReference2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createArgumentPackage1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArgumentPackage1CreationTool_title,
				Messages.ArgumentPackage1CreationTool_desc,
				Collections.singletonList(ArgumentationElementTypes.ArgumentPackage_2201));
		entry.setId("createArgumentPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ArgumentationElementTypes.getImageDescriptor(ArgumentationElementTypes.ArgumentPackage_2201));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArgumentPackageInterface2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArgumentPackageInterface2CreationTool_title,
				Messages.ArgumentPackageInterface2CreationTool_desc,
				Collections.singletonList(ArgumentationElementTypes.ArgumentPackageInterface_2202));
		entry.setId("createArgumentPackageInterface2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ArgumentationElementTypes.getImageDescriptor(ArgumentationElementTypes.ArgumentPackageInterface_2202));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArgumentPackageBinding3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArgumentPackageBinding3CreationTool_title,
				Messages.ArgumentPackageBinding3CreationTool_desc,
				Collections.singletonList(ArgumentationElementTypes.ArgumentPackageBinding_2203));
		entry.setId("createArgumentPackageBinding3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ArgumentationElementTypes.getImageDescriptor(ArgumentationElementTypes.ArgumentPackageBinding_2203));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArgumentGroup4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArgumentGroup4CreationTool_title,
				Messages.ArgumentGroup4CreationTool_desc,
				Collections.singletonList(ArgumentationElementTypes.ArgumentGroup_2204));
		entry.setId("createArgumentGroup4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentationElementTypes.getImageDescriptor(ArgumentationElementTypes.ArgumentGroup_2204));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClaim1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Claim1CreationTool_title,
				Messages.Claim1CreationTool_desc, Collections.singletonList(ArgumentationElementTypes.Claim_2205));
		entry.setId("createClaim1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentationElementTypes.getImageDescriptor(ArgumentationElementTypes.Claim_2205));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactReference2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArtifactReference2CreationTool_title,
				Messages.ArtifactReference2CreationTool_desc,
				Collections.singletonList(ArgumentationElementTypes.ArtifactReference_2206));
		entry.setId("createArtifactReference2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ArgumentationElementTypes.getImageDescriptor(ArgumentationElementTypes.ArtifactReference_2206));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
