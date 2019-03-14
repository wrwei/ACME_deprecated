
package gsn.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import gsn.diagram.providers.GsnElementTypes;

/**
 * @generated
 */
public class GsnPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createBasicGSN1Group());
		paletteRoot.add(createModularGSN2Group());
	}

	/**
	* Creates "Basic GSN" palette tool group
	* @generated
	*/
	private PaletteContainer createBasicGSN1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.BasicGSN1Group_title);
		paletteContainer.setId("createBasicGSN1Group"); //$NON-NLS-1$
		paletteContainer.add(createGoal1CreationTool());
		paletteContainer.add(createStrategy2CreationTool());
		paletteContainer.add(createSolution3CreationTool());
		paletteContainer.add(createContext4CreationTool());
		paletteContainer.add(createJustification5CreationTool());
		paletteContainer.add(createAssumption6CreationTool());
		paletteContainer.add(createInContextOf7CreationTool());
		paletteContainer.add(createSupportedBy8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Modular GSN" palette tool group
	* @generated
	*/
	private PaletteContainer createModularGSN2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ModularGSN2Group_title);
		paletteContainer.setId("createModularGSN2Group"); //$NON-NLS-1$
		paletteContainer.add(createChoiceNode1CreationTool());
		paletteContainer.add(createAwayGoal2CreationTool());
		paletteContainer.add(createAwaySolution3CreationTool());
		paletteContainer.add(createAwayContext4CreationTool());
		paletteContainer.add(createModuleReference5CreationTool());
		paletteContainer.add(createContractModuleReference6CreationTool());
		paletteContainer.add(createModule7CreationTool());
		paletteContainer.add(createContractModule8CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createGoal1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Goal1CreationTool_title,
				Messages.Goal1CreationTool_desc, Collections.singletonList(GsnElementTypes.Goal_2303));
		entry.setId("createGoal1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.Goal_2303));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStrategy2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Strategy2CreationTool_title,
				Messages.Strategy2CreationTool_desc, Collections.singletonList(GsnElementTypes.Strategy_2304));
		entry.setId("createStrategy2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.Strategy_2304));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSolution3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Solution3CreationTool_title,
				Messages.Solution3CreationTool_desc, Collections.singletonList(GsnElementTypes.Solution_2305));
		entry.setId("createSolution3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.Solution_2305));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContext4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Context4CreationTool_title,
				Messages.Context4CreationTool_desc, Collections.singletonList(GsnElementTypes.Context_2306));
		entry.setId("createContext4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.Context_2306));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJustification5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Justification5CreationTool_title,
				Messages.Justification5CreationTool_desc,
				Collections.singletonList(GsnElementTypes.Justification_2307));
		entry.setId("createJustification5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.Justification_2307));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssumption6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Assumption6CreationTool_title,
				Messages.Assumption6CreationTool_desc, Collections.singletonList(GsnElementTypes.Assumption_2308));
		entry.setId("createAssumption6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.Assumption_2308));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInContextOf7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InContextOf7CreationTool_title,
				Messages.InContextOf7CreationTool_desc, Collections.singletonList(GsnElementTypes.InContextOf_4402));
		entry.setId("createInContextOf7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.InContextOf_4402));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSupportedBy8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SupportedBy8CreationTool_title,
				Messages.SupportedBy8CreationTool_desc, Collections.singletonList(GsnElementTypes.SupportedBy_4401));
		entry.setId("createSupportedBy8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.SupportedBy_4401));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createChoiceNode1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ChoiceNode1CreationTool_title,
				Messages.ChoiceNode1CreationTool_desc, Collections.singletonList(GsnElementTypes.ChoiceNode_2310));
		entry.setId("createChoiceNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.ChoiceNode_2310));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAwayGoal2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AwayGoal2CreationTool_title,
				Messages.AwayGoal2CreationTool_desc, Collections.singletonList(GsnElementTypes.AwayGoal_2312));
		entry.setId("createAwayGoal2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.AwayGoal_2312));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAwaySolution3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AwaySolution3CreationTool_title,
				Messages.AwaySolution3CreationTool_desc, Collections.singletonList(GsnElementTypes.AwaySolution_2314));
		entry.setId("createAwaySolution3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.AwaySolution_2314));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAwayContext4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AwayContext4CreationTool_title,
				Messages.AwayContext4CreationTool_desc, Collections.singletonList(GsnElementTypes.AwayContext_2313));
		entry.setId("createAwayContext4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.AwayContext_2313));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModuleReference5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ModuleReference5CreationTool_title,
				Messages.ModuleReference5CreationTool_desc,
				Collections.singletonList(GsnElementTypes.ModuleReference_2309));
		entry.setId("createModuleReference5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.ModuleReference_2309));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContractModuleReference6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContractModuleReference6CreationTool_title,
				Messages.ContractModuleReference6CreationTool_desc,
				Collections.singletonList(GsnElementTypes.ContractModuleReference_2311));
		entry.setId("createContractModuleReference6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.ContractModuleReference_2311));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModule7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Module7CreationTool_title,
				Messages.Module7CreationTool_desc, Collections.singletonList(GsnElementTypes.Module_2301));
		entry.setId("createModule7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.Module_2301));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContractModule8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContractModule8CreationTool_title,
				Messages.ContractModule8CreationTool_desc,
				Collections.singletonList(GsnElementTypes.ContractModule_2302));
		entry.setId("createContractModule8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes.getImageDescriptor(GsnElementTypes.ContractModule_2302));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
