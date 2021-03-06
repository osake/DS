package com.odcgroup.page.ui.properties.sections;

import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.IFilter;

import com.odcgroup.page.metamodel.PropertyCategory;
import com.odcgroup.page.ui.properties.IWidgetPropertySource;
import com.odcgroup.page.util.AdaptableUtils;

/**
 * @author atr
 */
public class LimitationSectionFilter implements IFilter {

	/**
	 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
	 */
	public boolean select(Object object) {
		boolean select = false; 
		if (object instanceof EditPart) {
			IWidgetPropertySource source = (IWidgetPropertySource) AdaptableUtils.getAdapter(object, IWidgetPropertySource.class);
			if (source != null) {
				source.setCurrentPropertyCategory(PropertyCategory.LIMITATION_LITERAL);
				select = source.getPropertyDescriptors().length > 0;
			}
		}
		return select;
	}

}
