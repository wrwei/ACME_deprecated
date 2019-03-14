
package artifact.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createArtifactPackage1Group());
		paletteRoot.add(createArtifactElement2Group());
		paletteRoot.add(createArtifactRelationship3Group());
	}

	/**
	* Creates "ArtifactPackage" palette tool group
	* @generated
	*/
	private PaletteContainer createArtifactPackage1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ArtifactPackage1Group_title);
		paletteContainer.setId("createArtifactPackage1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.ArtifactPackage1Group_desc);
		paletteContainer.add(createArtifactPackage1CreationTool());
		paletteContainer.add(createArtifactPackageInterface2CreationTool());
		paletteContainer.add(createArtifactPackageBinding3CreationTool());
		paletteContainer.add(createArtifactGroup4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "ArtifactElement" palette tool group
	* @generated
	*/
	private PaletteContainer createArtifactElement2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ArtifactElement2Group_title);
		paletteContainer.setId("createArtifactElement2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.ArtifactElement2Group_desc);
		paletteContainer.add(createArtifact1CreationTool());
		paletteContainer.add(createActivity2CreationTool());
		paletteContainer.add(createEvent3CreationTool());
		paletteContainer.add(createTechnique4CreationTool());
		paletteContainer.add(createResource5CreationTool());
		paletteContainer.add(createParticipant6CreationTool());
		paletteContainer.add(createProperty7CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "ArtifactRelationship" palette tool group
	* @generated
	*/
	private PaletteContainer createArtifactRelationship3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ArtifactRelationship3Group_title);
		paletteContainer.setId("createArtifactRelationship3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.ArtifactRelationship3Group_desc);
		paletteContainer.add(createArtifactAssetRelationship1CreationTool());
		paletteContainer.add(createArtifactAssetPropertyRelationship2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactPackage1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArtifactPackage1CreationTool_title,
				Messages.ArtifactPackage1CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.ArtifactPackage_2101));
		entry.setId("createArtifactPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.ArtifactPackage_2101));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactPackageInterface2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArtifactPackageInterface2CreationTool_title,
				Messages.ArtifactPackageInterface2CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.ArtifactPackageInterface_2102));
		entry.setId("createArtifactPackageInterface2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.ArtifactPackageInterface_2102));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactPackageBinding3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArtifactPackageBinding3CreationTool_title,
				Messages.ArtifactPackageBinding3CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.ArtifactPackageBinding_2103));
		entry.setId("createArtifactPackageBinding3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.ArtifactPackageBinding_2103));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactGroup4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ArtifactGroup4CreationTool_title,
				Messages.ArtifactGroup4CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.ArtifactGroup_2111));
		entry.setId("createArtifactGroup4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.ArtifactGroup_2111));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifact1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Artifact1CreationTool_title,
				Messages.Artifact1CreationTool_desc, Collections.singletonList(ArtifactElementTypes.Artifact_2107));
		entry.setId("createArtifact1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.Artifact_2107));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivity2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Activity2CreationTool_title,
				Messages.Activity2CreationTool_desc, Collections.singletonList(ArtifactElementTypes.Activity_2105));
		entry.setId("createActivity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.Activity_2105));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEvent3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Event3CreationTool_title,
				Messages.Event3CreationTool_desc, Collections.singletonList(ArtifactElementTypes.Event_2110));
		entry.setId("createEvent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.Event_2110));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTechnique4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Technique4CreationTool_title,
				Messages.Technique4CreationTool_desc, Collections.singletonList(ArtifactElementTypes.Technique_2104));
		entry.setId("createTechnique4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.Technique_2104));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createResource5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Resource5CreationTool_title,
				Messages.Resource5CreationTool_desc, Collections.singletonList(ArtifactElementTypes.Resource_2108));
		entry.setId("createResource5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.Resource_2108));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParticipant6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Participant6CreationTool_title,
				Messages.Participant6CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.Participant_2106));
		entry.setId("createParticipant6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.Participant_2106));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProperty7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Property7CreationTool_title,
				Messages.Property7CreationTool_desc, Collections.singletonList(ArtifactElementTypes.Property_2109));
		entry.setId("createProperty7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.Property_2109));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactAssetRelationship1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ArtifactAssetRelationship1CreationTool_title,
				Messages.ArtifactAssetRelationship1CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.ArtifactAssetRelationship_4101));
		entry.setId("createArtifactAssetRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.ArtifactAssetRelationship_4101));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArtifactAssetPropertyRelationship2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ArtifactAssetPropertyRelationship2CreationTool_title,
				Messages.ArtifactAssetPropertyRelationship2CreationTool_desc,
				Collections.singletonList(ArtifactElementTypes.ArtifactAssetArtifactProperty_4102));
		entry.setId("createArtifactAssetPropertyRelationship2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ArtifactElementTypes.getImageDescriptor(ArtifactElementTypes.ArtifactAssetArtifactProperty_4102));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
