package SensorDataWebGui.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class SensorDataWebGuiEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(view)) {

			case SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.StandardSensorDataWebEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceNameEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceNameEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceViewEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceViewEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.FixedWindowEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.TupleWindowEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.TimeWindowEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart(
						view);

			case SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart.VISUAL_ID:
				return new SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
