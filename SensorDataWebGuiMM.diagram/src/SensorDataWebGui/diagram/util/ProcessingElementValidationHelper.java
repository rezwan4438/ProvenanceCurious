package SensorDataWebGui.diagram.util;

import org.eclipse.gmf.runtime.notation.Node;

import SensorDataWebGui.ProcessingElement;

public class ProcessingElementValidationHelper {
	public static boolean numberOfInputArcsChecked(Node context){
		 ProcessingElement pe = (ProcessingElement) context.getElement();
//		 System.out.println(pe.getName()+"  allowedInput:"+pe.getNbrAllowedInputs()+"   incoming Arcs:"+context.getTargetEdges().size());
		 return pe.getNbrAllowedInputs()>=context.getTargetEdges().size();
	}
}
