package SensorDataWebGui.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class SensorDataWebGuiPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSensorDataWebGui1Group());
	}

	/**
	 * Creates "SensorDataWebGui" palette tool group
	 * @generated
	 */
	private PaletteContainer createSensorDataWebGui1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				SensorDataWebGui.diagram.part.Messages.SensorDataWebGui1Group_title);
		paletteContainer.setId("createSensorDataWebGui1Group"); //$NON-NLS-1$
		paletteContainer.add(createTupleWindow1CreationTool());
		paletteContainer.add(createTimeWindow2CreationTool());
		paletteContainer.add(createFixedWindow3CreationTool());
		paletteContainer.add(createProcessingElement4CreationTool());
		paletteContainer.add(createSource5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTupleWindow1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002);
		LinkToolEntry entry = new LinkToolEntry(
				SensorDataWebGui.diagram.part.Messages.TupleWindow1CreationTool_title,
				SensorDataWebGui.diagram.part.Messages.TupleWindow1CreationTool_desc,
				types);
		entry.setId("createTupleWindow1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
						.getImageDescriptor(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TupleWindow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeWindow2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003);
		LinkToolEntry entry = new LinkToolEntry(
				SensorDataWebGui.diagram.part.Messages.TimeWindow2CreationTool_title,
				SensorDataWebGui.diagram.part.Messages.TimeWindow2CreationTool_desc,
				types);
		entry.setId("createTimeWindow2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
						.getImageDescriptor(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.TimeWindow_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFixedWindow3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001);
		LinkToolEntry entry = new LinkToolEntry(
				SensorDataWebGui.diagram.part.Messages.FixedWindow3CreationTool_title,
				SensorDataWebGui.diagram.part.Messages.FixedWindow3CreationTool_desc,
				types);
		entry.setId("createFixedWindow3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
						.getImageDescriptor(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.FixedWindow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessingElement4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002);
		NodeToolEntry entry = new NodeToolEntry(
				SensorDataWebGui.diagram.part.Messages.ProcessingElement4CreationTool_title,
				SensorDataWebGui.diagram.part.Messages.ProcessingElement4CreationTool_desc,
				types);
		entry.setId("createProcessingElement4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
						.getImageDescriptor(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSource5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.Source_2001);
		NodeToolEntry entry = new NodeToolEntry(
				SensorDataWebGui.diagram.part.Messages.Source5CreationTool_title,
				SensorDataWebGui.diagram.part.Messages.Source5CreationTool_desc,
				types);
		entry.setId("createSource5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
						.getImageDescriptor(SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.Source_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
