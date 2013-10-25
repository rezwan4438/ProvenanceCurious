package SensorDataWebGui.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SensorDataWebGuiParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser sourceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSourceName_5001Parser() {
		if (sourceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_Name() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceName_5001Parser = parser;
		}
		return sourceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourcePersistentView_5030Parser;

	/**
	 * @generated
	 */
	private IParser getSourcePersistentView_5030Parser() {
		if (sourcePersistentView_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_PersistentView() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_PersistentView() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourcePersistentView_5030Parser = parser;
		}
		return sourcePersistentView_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceTransactionTime_5031Parser;

	/**
	 * @generated
	 */
	private IParser getSourceTransactionTime_5031Parser() {
		if (sourceTransactionTime_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_TransactionTime() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_TransactionTime() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceTransactionTime_5031Parser = parser;
		}
		return sourceTransactionTime_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceValidTime_5032Parser;

	/**
	 * @generated
	 */
	private IParser getSourceValidTime_5032Parser() {
		if (sourceValidTime_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_ValidTime() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_ValidTime() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceValidTime_5032Parser = parser;
		}
		return sourceValidTime_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceView_5033Parser;

	/**
	 * @generated
	 */
	private IParser getSourceView_5033Parser() {
		if (sourceView_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_View() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_View() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceView_5033Parser = parser;
		}
		return sourceView_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceLocation_5034Parser;

	/**
	 * @generated
	 */
	private IParser getSourceLocation_5034Parser() {
		if (sourceLocation_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_Location() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_Location() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceLocation_5034Parser = parser;
		}
		return sourceLocation_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceSampleTime_5035Parser;

	/**
	 * @generated
	 */
	private IParser getSourceSampleTime_5035Parser() {
		if (sourceSampleTime_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_SampleTime() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_SampleTime() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceSampleTime_5035Parser = parser;
		}
		return sourceSampleTime_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceSampleTimeDistribution_5036Parser;

	/**
	 * @generated
	 */
	private IParser getSourceSampleTimeDistribution_5036Parser() {
		if (sourceSampleTimeDistribution_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_SampleTimeDistribution() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_SampleTimeDistribution() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceSampleTimeDistribution_5036Parser = parser;
		}
		return sourceSampleTimeDistribution_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceTimeout_5037Parser;

	/**
	 * @generated
	 */
	private IParser getSourceTimeout_5037Parser() {
		if (sourceTimeout_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_Timeout() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_Timeout() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceTimeout_5037Parser = parser;
		}
		return sourceTimeout_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceSourceType_5050Parser;

	/**
	 * @generated
	 */
	private IParser getSourceSourceType_5050Parser() {
		if (sourceSourceType_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_SourceType() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getSource_SourceType() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			sourceSourceType_5050Parser = parser;
		}
		return sourceSourceType_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementName_5013Parser() {
		if (processingElementName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_Name() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementName_5013Parser = parser;
		}
		return processingElementName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementPersistentView_5039Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementPersistentView_5039Parser() {
		if (processingElementPersistentView_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_PersistentView() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_PersistentView() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementPersistentView_5039Parser = parser;
		}
		return processingElementPersistentView_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementTransactionTime_5040Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementTransactionTime_5040Parser() {
		if (processingElementTransactionTime_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_TransactionTime() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_TransactionTime() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementTransactionTime_5040Parser = parser;
		}
		return processingElementTransactionTime_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementValidTime_5041Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementValidTime_5041Parser() {
		if (processingElementValidTime_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_ValidTime() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_ValidTime() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementValidTime_5041Parser = parser;
		}
		return processingElementValidTime_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementView_5042Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementView_5042Parser() {
		if (processingElementView_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_View() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getAbstractPE_View() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementView_5042Parser = parser;
		}
		return processingElementView_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementFunctorType_5043Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementFunctorType_5043Parser() {
		if (processingElementFunctorType_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_FunctorType() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_FunctorType() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementFunctorType_5043Parser = parser;
		}
		return processingElementFunctorType_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementInputOutputMappingType_5044Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementInputOutputMappingType_5044Parser() {
		if (processingElementInputOutputMappingType_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_InputOutputMappingType() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_InputOutputMappingType() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementInputOutputMappingType_5044Parser = parser;
		}
		return processingElementInputOutputMappingType_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementPeType_5045Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementPeType_5045Parser() {
		if (processingElementPeType_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_PeType() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_PeType() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementPeType_5045Parser = parser;
		}
		return processingElementPeType_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementProcessingDelay_5046Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementProcessingDelay_5046Parser() {
		if (processingElementProcessingDelay_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_ProcessingDelay() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_ProcessingDelay() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementProcessingDelay_5046Parser = parser;
		}
		return processingElementProcessingDelay_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementProcessingDelayDistribution_5047Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementProcessingDelayDistribution_5047Parser() {
		if (processingElementProcessingDelayDistribution_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_ProcessingDelayDistribution() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_ProcessingDelayDistribution() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementProcessingDelayDistribution_5047Parser = parser;
		}
		return processingElementProcessingDelayDistribution_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementTriggerpredicate_5048Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementTriggerpredicate_5048Parser() {
		if (processingElementTriggerpredicate_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_Triggerpredicate() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_Triggerpredicate() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementTriggerpredicate_5048Parser = parser;
		}
		return processingElementTriggerpredicate_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingElementTriggerType_5049Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingElementTriggerType_5049Parser() {
		if (processingElementTriggerType_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_TriggerType() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getProcessingElement_TriggerType() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			processingElementTriggerType_5049Parser = parser;
		}
		return processingElementTriggerType_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser fixedWindowName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getFixedWindowName_6001Parser() {
		if (fixedWindowName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_Name() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			fixedWindowName_6001Parser = parser;
		}
		return fixedWindowName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser fixedWindowWindowPredicate_6002Parser;

	/**
	 * @generated
	 */
	private IParser getFixedWindowWindowPredicate_6002Parser() {
		if (fixedWindowWindowPredicate_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_WindowPredicate() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_WindowPredicate() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			fixedWindowWindowPredicate_6002Parser = parser;
		}
		return fixedWindowWindowPredicate_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser tupleWindowName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getTupleWindowName_6003Parser() {
		if (tupleWindowName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_Name() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			tupleWindowName_6003Parser = parser;
		}
		return tupleWindowName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser tupleWindowWindowPredicate_6004Parser;

	/**
	 * @generated
	 */
	private IParser getTupleWindowWindowPredicate_6004Parser() {
		if (tupleWindowWindowPredicate_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_WindowPredicate() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_WindowPredicate() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			tupleWindowWindowPredicate_6004Parser = parser;
		}
		return tupleWindowWindowPredicate_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeWindowName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getTimeWindowName_6005Parser() {
		if (timeWindowName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_Name() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			timeWindowName_6005Parser = parser;
		}
		return timeWindowName_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeWindowWindowPredicate_6006Parser;

	/**
	 * @generated
	 */
	private IParser getTimeWindowWindowPredicate_6006Parser() {
		if (timeWindowWindowPredicate_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_WindowPredicate() };
			EAttribute[] editableFeatures = new EAttribute[] { SensorDataWebGui.SensorDataWebGuiPackage.eINSTANCE
					.getArc_WindowPredicate() };
			SensorDataWebGui.diagram.parsers.MessageFormatParser parser = new SensorDataWebGui.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			timeWindowWindowPredicate_6006Parser = parser;
		}
		return timeWindowWindowPredicate_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SensorDataWebGui.diagram.edit.parts.SourceNameEditPart.VISUAL_ID:
			return getSourceName_5001Parser();
		case SensorDataWebGui.diagram.edit.parts.SourcePersistentViewEditPart.VISUAL_ID:
			return getSourcePersistentView_5030Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceTransactionTimeEditPart.VISUAL_ID:
			return getSourceTransactionTime_5031Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceValidTimeEditPart.VISUAL_ID:
			return getSourceValidTime_5032Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceViewEditPart.VISUAL_ID:
			return getSourceView_5033Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceLocationEditPart.VISUAL_ID:
			return getSourceLocation_5034Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceSampleTimeEditPart.VISUAL_ID:
			return getSourceSampleTime_5035Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceSampleTimeDistributionEditPart.VISUAL_ID:
			return getSourceSampleTimeDistribution_5036Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceTimeoutEditPart.VISUAL_ID:
			return getSourceTimeout_5037Parser();
		case SensorDataWebGui.diagram.edit.parts.SourceSourceTypeEditPart.VISUAL_ID:
			return getSourceSourceType_5050Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementNameEditPart.VISUAL_ID:
			return getProcessingElementName_5013Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementPersistentViewEditPart.VISUAL_ID:
			return getProcessingElementPersistentView_5039Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementTransactionTimeEditPart.VISUAL_ID:
			return getProcessingElementTransactionTime_5040Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementValidTimeEditPart.VISUAL_ID:
			return getProcessingElementValidTime_5041Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementViewEditPart.VISUAL_ID:
			return getProcessingElementView_5042Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementFunctorTypeEditPart.VISUAL_ID:
			return getProcessingElementFunctorType_5043Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementInputOutputMappingTypeEditPart.VISUAL_ID:
			return getProcessingElementInputOutputMappingType_5044Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementPeTypeEditPart.VISUAL_ID:
			return getProcessingElementPeType_5045Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayEditPart.VISUAL_ID:
			return getProcessingElementProcessingDelay_5046Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementProcessingDelayDistribuEditPart.VISUAL_ID:
			return getProcessingElementProcessingDelayDistribution_5047Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerpredicateEditPart.VISUAL_ID:
			return getProcessingElementTriggerpredicate_5048Parser();
		case SensorDataWebGui.diagram.edit.parts.ProcessingElementTriggerTypeEditPart.VISUAL_ID:
			return getProcessingElementTriggerType_5049Parser();
		case SensorDataWebGui.diagram.edit.parts.FixedWindowDescriptionEditPart.VISUAL_ID:
			return getFixedWindowName_6001Parser();
		case SensorDataWebGui.diagram.edit.parts.FixedWindowNameEditPart.VISUAL_ID:
			return getFixedWindowWindowPredicate_6002Parser();
		case SensorDataWebGui.diagram.edit.parts.TupleWindowNameEditPart.VISUAL_ID:
			return getTupleWindowName_6003Parser();
		case SensorDataWebGui.diagram.edit.parts.TupleWindowWindowPredicateEditPart.VISUAL_ID:
			return getTupleWindowWindowPredicate_6004Parser();
		case SensorDataWebGui.diagram.edit.parts.TimeWindowNameEditPart.VISUAL_ID:
			return getTimeWindowName_6005Parser();
		case SensorDataWebGui.diagram.edit.parts.TimeWindowWindowPredicateEditPart.VISUAL_ID:
			return getTimeWindowWindowPredicate_6006Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SensorDataWebGui.diagram.part.SensorDataWebGuiVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SensorDataWebGui.diagram.providers.SensorDataWebGuiElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
