package com.odcgroup.pageflow.editor.diagram.custom.properties.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Node;

import com.odcgroup.pageflow.editor.diagram.edit.parts.SubPageflowStateEditPart;

public class SubPageflowStatePropertyFilter extends AbstractPropertyFilter {

	@Override
	public EObject fetchEObject(Object toTest) {
		if (toTest instanceof SubPageflowStateEditPart){
			SubPageflowStateEditPart sep = (SubPageflowStateEditPart)toTest;
			Node node = (Node)sep.getModel();
			return node.getElement();
		}
		return null;
	}

}
