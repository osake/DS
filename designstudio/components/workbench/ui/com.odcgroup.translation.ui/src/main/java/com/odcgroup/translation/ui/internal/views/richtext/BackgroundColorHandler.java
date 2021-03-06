package com.odcgroup.translation.ui.internal.views.richtext;

import java.util.Set;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;

class BackgroundColorHandler extends ColorHandler {

	@Override
	public void updateStyle(boolean selected) {
		ColorDialog colorDialog = new ColorDialog(getText().getShell());
		RGB rgb = colorDialog.open();
		if (rgb != null) {
			setColor(createColor(rgb), false);
		}
	}

	public BackgroundColorHandler(StyledText text, Set<Color> colors) {
		super(text, colors);
	}

}
