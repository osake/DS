/*
* generated by Xtext
*/
package com.odcgroup.t24.enquiry.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

/**
 * customization of the default outline structure
 * 
 */
public class EnquiryOutlineTreeProvider extends DefaultOutlineTreeProvider {

	@Override
	protected void _createNode(IOutlineNode parentNode, EObject modelElement) {
		Object text = textDispatcher.invoke(modelElement);
		boolean isLeaf = isLeafDispatcher.invoke(modelElement);
		if(text == null && isLeaf)
			return;
		Image image = imageDispatcher.invoke(modelElement);
		if(text==null)
			return;
		createEObjectNode(parentNode, modelElement, image, text, isLeaf);
	}

}
