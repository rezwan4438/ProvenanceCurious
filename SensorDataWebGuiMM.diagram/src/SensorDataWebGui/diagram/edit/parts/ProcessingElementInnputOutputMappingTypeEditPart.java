package SensorDataWebGui.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ProcessingElementInnputOutputMappingTypeEditPart extends
		LabelEditPart implements ITextAwareEditPart, IBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5016;

	/**
	 * @generated
	 */
	private DirectEditManager manager;

	/**
	 * @generated
	 */
	private IParser parser;

	/**
	 * @generated
	 */
	private List parserElements;

	/**
	 * @generated
	 */
	private String defaultText;

	/**
	 * @generated
	 */
	static {
		registerSnapBackPosition(
				SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
						.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementInnputOutputMappingTypeEditPart.VISUAL_ID),
				new Point(0, 0));
	}

	/**
	 * @generated
	 */
	public ProcessingElementInnputOutputMappingTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
		installEditPolicy(
				EditPolicy.SELECTION_FEEDBACK_ROLE,
				new SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy());
	}

	/**
	 * @generated
	 */
	public IBorderItemLocator getBorderItemLocator() {
		IFigure parentFigure = getFigure().getParent();
		if (parentFigure != null && parentFigure.getLayoutManager() != null) {
			Object constraint = parentFigure.getLayoutManager().getConstraint(
					getFigure());
			return (IBorderItemLocator) constraint;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public void refreshBounds() {
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getLocation_Y())).intValue();
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Width())).intValue();
		int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Height())).intValue();
		getBorderItemLocator()
				.setConstraint(new Rectangle(x, y, width, height));
	}

	/**
	 * @generated
	 */
	protected String getLabelTextHelper(IFigure figure) {
		if (figure instanceof WrappingLabel) {
			return ((WrappingLabel) figure).getText();
		} else {
			return ((Label) figure).getText();
		}
	}

	/**
	 * @generated
	 */
	protected void setLabelTextHelper(IFigure figure, String text) {
		if (figure instanceof WrappingLabel) {
			((WrappingLabel) figure).setText(text);
		} else {
			((Label) figure).setText(text);
		}
	}

	/**
	 * @generated
	 */
	protected Image getLabelIconHelper(IFigure figure) {
		if (figure instanceof WrappingLabel) {
			return ((WrappingLabel) figure).getIcon();
		} else {
			return ((Label) figure).getIcon();
		}
	}

	/**
	 * @generated
	 */
	protected void setLabelIconHelper(IFigure figure, Image icon) {
		if (figure instanceof WrappingLabel) {
			((WrappingLabel) figure).setIcon(icon);
		} else {
			((Label) figure).setIcon(icon);
		}
	}

	/**
	 * @generated
	 */
	public void setLabel(IFigure figure) {
		unregisterVisuals();
		setFigure(figure);
		defaultText = getLabelTextHelper(figure);
		registerVisuals();
		refreshVisuals();
	}

	/**
	 * @generated
	 */
	protected List getModelChildren() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public IGraphicalEditPart getChildBySemanticHint(String semanticHint) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getParserElement() {
		return resolveSemanticElement();
	}

	/**
	 * @generated
	 */
	protected Image getLabelIcon() {
		EObject parserElement = getParserElement();
		if (parserElement == null) {
			return null;
		}
		return SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
				.getImage(parserElement.eClass());
	}

	/**
	 * @generated
	 */
	protected String getLabelText() {
		String text = null;
		EObject parserElement = getParserElement();
		if (parserElement != null && getParser() != null) {
			text = getParser().getPrintString(
					new EObjectAdapter(parserElement),
					getParserOptions().intValue());
		}
		if (text == null || text.length() == 0) {
			text = defaultText;
		}
		return text;
	}

	/**
	 * @generated
	 */
	public void setLabelText(String text) {
		setLabelTextHelper(getFigure(), text);
		Object pdEditPolicy = getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (pdEditPolicy instanceof SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) {
			((SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) pdEditPolicy)
					.refreshFeedback();
		}
		Object sfEditPolicy = getEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE);
		if (sfEditPolicy instanceof SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) {
			((SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) sfEditPolicy)
					.refreshFeedback();
		}
	}

	/**
	 * @generated
	 */
	public String getEditText() {
		if (getParserElement() == null || getParser() == null) {
			return ""; //$NON-NLS-1$
		}
		return getParser().getEditString(
				new EObjectAdapter(getParserElement()),
				getParserOptions().intValue());
	}

	/**
	 * @generated
	 */
	protected boolean isEditable() {
		return getParser() != null;
	}

	/**
	 * @generated
	 */
	public ICellEditorValidator getEditTextValidator() {
		return new ICellEditorValidator() {

			public String isValid(final Object value) {
				if (value instanceof String) {
					final EObject element = getParserElement();
					final IParser parser = getParser();
					try {
						IParserEditStatus valid = (IParserEditStatus) getEditingDomain()
								.runExclusive(new RunnableWithResult.Impl() {

									public void run() {
										setResult(parser.isValidEditString(
												new EObjectAdapter(element),
												(String) value));
									}
								});
						return valid.getCode() == ParserEditStatus.EDITABLE ? null
								: valid.getMessage();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}

				// shouldn't get here
				return null;
			}
		};
	}

	/**
	 * @generated
	 */
	public IContentAssistProcessor getCompletionProcessor() {
		if (getParserElement() == null || getParser() == null) {
			return null;
		}
		return getParser().getCompletionProcessor(
				new EObjectAdapter(getParserElement()));
	}

	/**
	 * @generated
	 */
	public ParserOptions getParserOptions() {
		return ParserOptions.NONE;
	}

	/**
	 * @generated
	 */
	public IParser getParser() {
		if (parser == null) {
			parser = SensorDataWebGui.diagram.providers.SensorDataWebGuiParserProvider
					.getParser(
							SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes.ProcessingElement_2001,
							getParserElement(),
							SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
									.getType(SensorDataWebGui.diagram.edit.parts.ProcessingElementInnputOutputMappingTypeEditPart.VISUAL_ID));
		}
		return parser;
	}

	/**
	 * @generated
	 */
	protected DirectEditManager getManager() {
		if (manager == null) {
			setManager(new TextDirectEditManager(
					this,
					TextDirectEditManager.getTextCellEditorClass(this),
					SensorDataWebGui.diagram.edit.parts.SensorDataWebGuiEditPartFactory
							.getTextCellEditorLocator(this)));
		}
		return manager;
	}

	/**
	 * @generated
	 */
	protected void setManager(DirectEditManager manager) {
		this.manager = manager;
	}

	/**
	 * @generated
	 */
	protected void performDirectEdit() {
		getManager().show();
	}

	/**
	 * @generated
	 */
	protected void performDirectEdit(Point eventLocation) {
		if (getManager().getClass() == TextDirectEditManager.class) {
			((TextDirectEditManager) getManager()).show(eventLocation
					.getSWTPoint());
		}
	}

	/**
	 * @generated
	 */
	private void performDirectEdit(char initialCharacter) {
		if (getManager() instanceof TextDirectEditManager) {
			((TextDirectEditManager) getManager()).show(initialCharacter);
		} else {
			performDirectEdit();
		}
	}

	/**
	 * @generated
	 */
	protected void performDirectEditRequest(Request request) {
		final Request theRequest = request;
		try {
			getEditingDomain().runExclusive(new Runnable() {

				public void run() {
					if (isActive() && isEditable()) {
						if (theRequest
								.getExtendedData()
								.get(
										RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							Character initialChar = (Character) theRequest
									.getExtendedData()
									.get(
											RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							performDirectEdit(initialChar.charValue());
						} else if ((theRequest instanceof DirectEditRequest)
								&& (getEditText().equals(getLabelText()))) {
							DirectEditRequest editRequest = (DirectEditRequest) theRequest;
							performDirectEdit(editRequest.getLocation());
						} else {
							performDirectEdit();
						}
					}
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @generated
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabel();
		refreshFont();
		refreshFontColor();
		refreshUnderline();
		refreshStrikeThrough();
	}

	/**
	 * @generated
	 */
	protected void refreshLabel() {
		setLabelTextHelper(getFigure(), getLabelText());
		setLabelIconHelper(getFigure(), getLabelIcon());
		Object pdEditPolicy = getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (pdEditPolicy instanceof SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) {
			((SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) pdEditPolicy)
					.refreshFeedback();
		}
		Object sfEditPolicy = getEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE);
		if (sfEditPolicy instanceof SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) {
			((SensorDataWebGui.diagram.edit.policies.SensorDataWebGuiTextSelectionEditPolicy) sfEditPolicy)
					.refreshFeedback();
		}
	}

	/**
	 * @generated
	 */
	protected void refreshUnderline() {
		FontStyle style = (FontStyle) getFontStyleOwnerView().getStyle(
				NotationPackage.eINSTANCE.getFontStyle());
		if (style != null && getFigure() instanceof WrappingLabel) {
			((WrappingLabel) getFigure()).setTextUnderline(style.isUnderline());
		}
	}

	/**
	 * @generated
	 */
	protected void refreshStrikeThrough() {
		FontStyle style = (FontStyle) getFontStyleOwnerView().getStyle(
				NotationPackage.eINSTANCE.getFontStyle());
		if (style != null && getFigure() instanceof WrappingLabel) {
			((WrappingLabel) getFigure()).setTextStrikeThrough(style
					.isStrikeThrough());
		}
	}

	/**
	 * @generated
	 */
	protected void refreshFont() {
		FontStyle style = (FontStyle) getFontStyleOwnerView().getStyle(
				NotationPackage.eINSTANCE.getFontStyle());
		if (style != null) {
			FontData fontData = new FontData(style.getFontName(), style
					.getFontHeight(), (style.isBold() ? SWT.BOLD : SWT.NORMAL)
					| (style.isItalic() ? SWT.ITALIC : SWT.NORMAL));
			setFont(fontData);
		}
	}

	/**
	 * @generated
	 */
	protected void setFontColor(Color color) {
		getFigure().setForegroundColor(color);
	}

	/**
	 * @generated
	 */
	protected void addSemanticListeners() {
		if (getParser() instanceof ISemanticParser) {
			EObject element = resolveSemanticElement();
			parserElements = ((ISemanticParser) getParser())
					.getSemanticElementsBeingParsed(element);
			for (int i = 0; i < parserElements.size(); i++) {
				addListenerFilter(
						"SemanticModel" + i, this, (EObject) parserElements.get(i)); //$NON-NLS-1$
			}
		} else {
			super.addSemanticListeners();
		}
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		if (parserElements != null) {
			for (int i = 0; i < parserElements.size(); i++) {
				removeListenerFilter("SemanticModel" + i); //$NON-NLS-1$
			}
		} else {
			super.removeSemanticListeners();
		}
	}

	/**
	 * @generated
	 */
	protected AccessibleEditPart getAccessibleEditPart() {
		if (accessibleEP == null) {
			accessibleEP = new AccessibleGraphicalEditPart() {

				public void getName(AccessibleEvent e) {
					e.result = getLabelTextHelper(getFigure());
				}
			};
		}
		return accessibleEP;
	}

	/**
	 * @generated
	 */
	private View getFontStyleOwnerView() {
		return getPrimaryView();
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (NotationPackage.eINSTANCE.getFontStyle_FontColor().equals(feature)) {
			Integer c = (Integer) event.getNewValue();
			setFontColor(DiagramColorRegistry.getInstance().getColor(c));
		} else if (NotationPackage.eINSTANCE.getFontStyle_Underline().equals(
				feature)) {
			refreshUnderline();
		} else if (NotationPackage.eINSTANCE.getFontStyle_StrikeThrough()
				.equals(feature)) {
			refreshStrikeThrough();
		} else if (NotationPackage.eINSTANCE.getFontStyle_FontHeight().equals(
				feature)
				|| NotationPackage.eINSTANCE.getFontStyle_FontName().equals(
						feature)
				|| NotationPackage.eINSTANCE.getFontStyle_Bold()
						.equals(feature)
				|| NotationPackage.eINSTANCE.getFontStyle_Italic().equals(
						feature)) {
			refreshFont();
		} else {
			if (getParser() != null
					&& getParser().isAffectingEvent(event,
							getParserOptions().intValue())) {
				refreshLabel();
			}
			if (getParser() instanceof ISemanticParser) {
				ISemanticParser modelParser = (ISemanticParser) getParser();
				if (modelParser.areSemanticElementsAffected(null, event)) {
					removeSemanticListeners();
					if (resolveSemanticElement() != null) {
						addSemanticListeners();
					}
					refreshLabel();
				}
			}
		}
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	protected IFigure createFigure() {
		IFigure label = createFigurePrim();
		defaultText = getLabelTextHelper(label);
		return label;
	}

	/**
	 * @generated
	 */
	protected IFigure createFigurePrim() {
		return new ProcessingElementFigure();
	}

	/**
	 * @generated
	 */
	public class ProcessingElementFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementPersistentViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementTriggerTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementTriggerpredicateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementPeTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessingElementFunctorTypeFigure;

		/**
		 * @generated
		 */
		public ProcessingElementFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProcessingElementNameFigure = new WrappingLabel();
			fFigureProcessingElementNameFigure.setText("<...>");

			GridData constraintFFigureProcessingElementNameFigure = new GridData();
			constraintFFigureProcessingElementNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementNameFigure.horizontalIndent = 0;
			constraintFFigureProcessingElementNameFigure.horizontalSpan = 2;
			constraintFFigureProcessingElementNameFigure.verticalSpan = 1;
			constraintFFigureProcessingElementNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureProcessingElementNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementNameFigure,
					constraintFFigureProcessingElementNameFigure);

			WrappingLabel processingElementPeTypeLabelFigure0 = new WrappingLabel();
			processingElementPeTypeLabelFigure0.setText("PE type");

			GridData constraintProcessingElementPeTypeLabelFigure0 = new GridData();
			constraintProcessingElementPeTypeLabelFigure0.verticalAlignment = GridData.BEGINNING;
			constraintProcessingElementPeTypeLabelFigure0.horizontalAlignment = GridData.BEGINNING;
			constraintProcessingElementPeTypeLabelFigure0.horizontalIndent = 0;
			constraintProcessingElementPeTypeLabelFigure0.horizontalSpan = 1;
			constraintProcessingElementPeTypeLabelFigure0.verticalSpan = 1;
			constraintProcessingElementPeTypeLabelFigure0.grabExcessHorizontalSpace = false;
			constraintProcessingElementPeTypeLabelFigure0.grabExcessVerticalSpace = false;
			this.add(processingElementPeTypeLabelFigure0,
					constraintProcessingElementPeTypeLabelFigure0);

			fFigureProcessingElementPeTypeFigure = new WrappingLabel();
			fFigureProcessingElementPeTypeFigure.setText("<...>");

			GridData constraintFFigureProcessingElementPeTypeFigure = new GridData();
			constraintFFigureProcessingElementPeTypeFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementPeTypeFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementPeTypeFigure.horizontalIndent = 1;
			constraintFFigureProcessingElementPeTypeFigure.horizontalSpan = 1;
			constraintFFigureProcessingElementPeTypeFigure.verticalSpan = 1;
			constraintFFigureProcessingElementPeTypeFigure.grabExcessHorizontalSpace = false;
			constraintFFigureProcessingElementPeTypeFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementPeTypeFigure,
					constraintFFigureProcessingElementPeTypeFigure);

			WrappingLabel processingElementViewLabelFigure0 = new WrappingLabel();
			processingElementViewLabelFigure0.setText("view");

			GridData constraintProcessingElementViewLabelFigure0 = new GridData();
			constraintProcessingElementViewLabelFigure0.verticalAlignment = GridData.BEGINNING;
			constraintProcessingElementViewLabelFigure0.horizontalAlignment = GridData.BEGINNING;
			constraintProcessingElementViewLabelFigure0.horizontalIndent = 0;
			constraintProcessingElementViewLabelFigure0.horizontalSpan = 1;
			constraintProcessingElementViewLabelFigure0.verticalSpan = 1;
			constraintProcessingElementViewLabelFigure0.grabExcessHorizontalSpace = false;
			constraintProcessingElementViewLabelFigure0.grabExcessVerticalSpace = false;
			this.add(processingElementViewLabelFigure0,
					constraintProcessingElementViewLabelFigure0);

			fFigureProcessingElementViewFigure = new WrappingLabel();
			fFigureProcessingElementViewFigure.setText("<...>");

			GridData constraintFFigureProcessingElementViewFigure = new GridData();
			constraintFFigureProcessingElementViewFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementViewFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementViewFigure.horizontalIndent = 1;
			constraintFFigureProcessingElementViewFigure.horizontalSpan = 1;
			constraintFFigureProcessingElementViewFigure.verticalSpan = 1;
			constraintFFigureProcessingElementViewFigure.grabExcessHorizontalSpace = false;
			constraintFFigureProcessingElementViewFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementViewFigure,
					constraintFFigureProcessingElementViewFigure);

			WrappingLabel processingElementPersistentViewLabelFigure0 = new WrappingLabel();
			processingElementPersistentViewLabelFigure0.setText("persistent");

			GridData constraintProcessingElementPersistentViewLabelFigure0 = new GridData();
			constraintProcessingElementPersistentViewLabelFigure0.verticalAlignment = GridData.BEGINNING;
			constraintProcessingElementPersistentViewLabelFigure0.horizontalAlignment = GridData.BEGINNING;
			constraintProcessingElementPersistentViewLabelFigure0.horizontalIndent = 0;
			constraintProcessingElementPersistentViewLabelFigure0.horizontalSpan = 1;
			constraintProcessingElementPersistentViewLabelFigure0.verticalSpan = 1;
			constraintProcessingElementPersistentViewLabelFigure0.grabExcessHorizontalSpace = false;
			constraintProcessingElementPersistentViewLabelFigure0.grabExcessVerticalSpace = false;
			this.add(processingElementPersistentViewLabelFigure0,
					constraintProcessingElementPersistentViewLabelFigure0);

			fFigureProcessingElementPersistentViewFigure = new WrappingLabel();
			fFigureProcessingElementPersistentViewFigure.setText("<...>");

			GridData constraintFFigureProcessingElementPersistentViewFigure = new GridData();
			constraintFFigureProcessingElementPersistentViewFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementPersistentViewFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementPersistentViewFigure.horizontalIndent = 1;
			constraintFFigureProcessingElementPersistentViewFigure.horizontalSpan = 1;
			constraintFFigureProcessingElementPersistentViewFigure.verticalSpan = 1;
			constraintFFigureProcessingElementPersistentViewFigure.grabExcessHorizontalSpace = false;
			constraintFFigureProcessingElementPersistentViewFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementPersistentViewFigure,
					constraintFFigureProcessingElementPersistentViewFigure);

			WrappingLabel processingElementTriggerTypeLabelFigure0 = new WrappingLabel();
			processingElementTriggerTypeLabelFigure0.setText("trigger");

			GridData constraintProcessingElementTriggerTypeLabelFigure0 = new GridData();
			constraintProcessingElementTriggerTypeLabelFigure0.verticalAlignment = GridData.BEGINNING;
			constraintProcessingElementTriggerTypeLabelFigure0.horizontalAlignment = GridData.BEGINNING;
			constraintProcessingElementTriggerTypeLabelFigure0.horizontalIndent = 0;
			constraintProcessingElementTriggerTypeLabelFigure0.horizontalSpan = 1;
			constraintProcessingElementTriggerTypeLabelFigure0.verticalSpan = 1;
			constraintProcessingElementTriggerTypeLabelFigure0.grabExcessHorizontalSpace = false;
			constraintProcessingElementTriggerTypeLabelFigure0.grabExcessVerticalSpace = false;
			this.add(processingElementTriggerTypeLabelFigure0,
					constraintProcessingElementTriggerTypeLabelFigure0);

			fFigureProcessingElementTriggerTypeFigure = new WrappingLabel();
			fFigureProcessingElementTriggerTypeFigure.setText("<...>");

			GridData constraintFFigureProcessingElementTriggerTypeFigure = new GridData();
			constraintFFigureProcessingElementTriggerTypeFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementTriggerTypeFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementTriggerTypeFigure.horizontalIndent = 1;
			constraintFFigureProcessingElementTriggerTypeFigure.horizontalSpan = 1;
			constraintFFigureProcessingElementTriggerTypeFigure.verticalSpan = 1;
			constraintFFigureProcessingElementTriggerTypeFigure.grabExcessHorizontalSpace = false;
			constraintFFigureProcessingElementTriggerTypeFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementTriggerTypeFigure,
					constraintFFigureProcessingElementTriggerTypeFigure);

			WrappingLabel processingElementTriggerpredicateLabelFigure0 = new WrappingLabel();
			processingElementTriggerpredicateLabelFigure0.setText("trig pred");

			GridData constraintProcessingElementTriggerpredicateLabelFigure0 = new GridData();
			constraintProcessingElementTriggerpredicateLabelFigure0.verticalAlignment = GridData.BEGINNING;
			constraintProcessingElementTriggerpredicateLabelFigure0.horizontalAlignment = GridData.BEGINNING;
			constraintProcessingElementTriggerpredicateLabelFigure0.horizontalIndent = 0;
			constraintProcessingElementTriggerpredicateLabelFigure0.horizontalSpan = 1;
			constraintProcessingElementTriggerpredicateLabelFigure0.verticalSpan = 1;
			constraintProcessingElementTriggerpredicateLabelFigure0.grabExcessHorizontalSpace = false;
			constraintProcessingElementTriggerpredicateLabelFigure0.grabExcessVerticalSpace = false;
			this.add(processingElementTriggerpredicateLabelFigure0,
					constraintProcessingElementTriggerpredicateLabelFigure0);

			fFigureProcessingElementTriggerpredicateFigure = new WrappingLabel();
			fFigureProcessingElementTriggerpredicateFigure.setText("<...>");

			GridData constraintFFigureProcessingElementTriggerpredicateFigure = new GridData();
			constraintFFigureProcessingElementTriggerpredicateFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementTriggerpredicateFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementTriggerpredicateFigure.horizontalIndent = 1;
			constraintFFigureProcessingElementTriggerpredicateFigure.horizontalSpan = 1;
			constraintFFigureProcessingElementTriggerpredicateFigure.verticalSpan = 1;
			constraintFFigureProcessingElementTriggerpredicateFigure.grabExcessHorizontalSpace = false;
			constraintFFigureProcessingElementTriggerpredicateFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementTriggerpredicateFigure,
					constraintFFigureProcessingElementTriggerpredicateFigure);

			WrappingLabel processingElementFunctorTypeLabelFigure0 = new WrappingLabel();
			processingElementFunctorTypeLabelFigure0.setText("functor");

			GridData constraintProcessingElementFunctorTypeLabelFigure0 = new GridData();
			constraintProcessingElementFunctorTypeLabelFigure0.verticalAlignment = GridData.BEGINNING;
			constraintProcessingElementFunctorTypeLabelFigure0.horizontalAlignment = GridData.BEGINNING;
			constraintProcessingElementFunctorTypeLabelFigure0.horizontalIndent = 0;
			constraintProcessingElementFunctorTypeLabelFigure0.horizontalSpan = 1;
			constraintProcessingElementFunctorTypeLabelFigure0.verticalSpan = 1;
			constraintProcessingElementFunctorTypeLabelFigure0.grabExcessHorizontalSpace = false;
			constraintProcessingElementFunctorTypeLabelFigure0.grabExcessVerticalSpace = false;
			this.add(processingElementFunctorTypeLabelFigure0,
					constraintProcessingElementFunctorTypeLabelFigure0);

			fFigureProcessingElementFunctorTypeFigure = new WrappingLabel();
			fFigureProcessingElementFunctorTypeFigure.setText("<...>");

			GridData constraintFFigureProcessingElementFunctorTypeFigure = new GridData();
			constraintFFigureProcessingElementFunctorTypeFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementFunctorTypeFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureProcessingElementFunctorTypeFigure.horizontalIndent = 1;
			constraintFFigureProcessingElementFunctorTypeFigure.horizontalSpan = 1;
			constraintFFigureProcessingElementFunctorTypeFigure.verticalSpan = 1;
			constraintFFigureProcessingElementFunctorTypeFigure.grabExcessHorizontalSpace = false;
			constraintFFigureProcessingElementFunctorTypeFigure.grabExcessVerticalSpace = false;
			this.add(fFigureProcessingElementFunctorTypeFigure,
					constraintFFigureProcessingElementFunctorTypeFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementNameFigure() {
			return fFigureProcessingElementNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementViewFigure() {
			return fFigureProcessingElementViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementPersistentViewFigure() {
			return fFigureProcessingElementPersistentViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementTriggerTypeFigure() {
			return fFigureProcessingElementTriggerTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementTriggerpredicateFigure() {
			return fFigureProcessingElementTriggerpredicateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementPeTypeFigure() {
			return fFigureProcessingElementPeTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessingElementFunctorTypeFigure() {
			return fFigureProcessingElementFunctorTypeFigure;
		}

	}

}
