package com.odcgroup.page.model.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.odcgroup.page.metamodel.MetaModel;
import com.odcgroup.page.metamodel.PropertyType;
import com.odcgroup.page.metamodel.PropertyTypeConstants;
import com.odcgroup.page.metamodel.WidgetType;
import com.odcgroup.page.metamodel.util.MetaModelRegistry;
import com.odcgroup.page.model.Property;
import com.odcgroup.page.model.Widget;
import com.odcgroup.page.model.util.MatrixHelper;
import com.odcgroup.page.model.widgets.matrix.IMatrixCellItem;

/**
 * @author pkk
 *
 */
public class MatrixCellItemPropertyFilter implements PropertyFilter {

	/* (non-Javadoc)
	 * @see com.odcgroup.page.model.filter.PropertyFilter#filter(com.odcgroup.page.model.Widget)
	 */
	@Override
	public List<Property> filter(Widget widget) {
		
		// These are the WidgetType's of the Label and Field
		MetaModel mm = MetaModelRegistry.getMetaModel();
		String library = widget.getLibraryName();
		WidgetType wt = mm.findWidgetType(library, widget.getTypeName());
		
		// Add all the PropertyTypes which exist 
		Set<PropertyType> allowedTypes = new HashSet<PropertyType>();
		allowedTypes.addAll(wt.getAllPropertyTypes().values());
		
		String typeName = widget.getTypeName();
		if (typeName.equals("MatrixCellItem")) {
			IMatrixCellItem item = MatrixHelper.getMatrixCellItem(widget);
			allowedTypes.remove(mm.findPropertyType(library, "cssClass"));
			if (item.isComputed()) {
				allowedTypes.remove(mm.findPropertyType(library, PropertyTypeConstants.DOMAIN_ATTRIBUTE));
			} else if (item.isDomainBound()) {
				allowedTypes.remove(mm.findPropertyType(library, "column-name"));
			}
		} else if (typeName.equals("MatrixContentCellItem") || typeName.equals("MatrixExtraColumnItem")) {
			IMatrixCellItem item = null;
			if(typeName.equals("MatrixContentCellItem")) {
				item = MatrixHelper.getMatrixContentCellItem(widget);
			} else {
				item = MatrixHelper.getMatrixExtraColumnItem(widget);
			}
			if (item.isDomainBound()) {
				allowedTypes.remove(mm.findPropertyType(library, "column-name"));
			}
		}
		
		List<Property> result = new ArrayList<Property>();
		for (Property p : widget.getProperties()) {
			if (allowedTypes.contains(p.getType())) {
				result.add(p);
			}
		}
		
		return result;
	}

}
