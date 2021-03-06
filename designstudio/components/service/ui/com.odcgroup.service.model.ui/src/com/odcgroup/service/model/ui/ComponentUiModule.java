/*
 * generated by Xtext
 */
package com.odcgroup.service.model.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.odcgroup.service.model.ui.coloring.ServiceDSLAntlrTokenToAttributeIdMapper;
import com.odcgroup.service.model.ui.coloring.ServiceDSLHighlightingConfiguration;
import com.odcgroup.service.model.ui.outline.FilterModuleAccessContribution;
import com.odcgroup.service.model.ui.outline.FilterPrivateAccessContribution;
import com.odcgroup.service.model.ui.outline.FilterPublicAccessContribution;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ComponentUiModule extends com.odcgroup.service.model.ui.AbstractComponentUiModule {
	public ComponentUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return ServiceDSLNatureAddingEditorCallback.class;
	}

	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return ServiceDSLAntlrTokenToAttributeIdMapper.class;
	}

	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return ServiceDSLHighlightingConfiguration.class;
	}

	public void configureFilterModuleAccessContribution(Binder binder) {
		binder.bind(IOutlineContribution.class).annotatedWith(Names.named("FilterModuleAccessContribution"))
				.to(FilterModuleAccessContribution.class);
	}

	public void configureFilterPrivateAccessContribution(Binder binder) {
		binder.bind(IOutlineContribution.class).annotatedWith(Names.named("FilterPrivateAccessContribution"))
				.to(FilterPrivateAccessContribution.class);
	}

	public void configureFilterPublicAccessContribution(Binder binder) {
		binder.bind(IOutlineContribution.class).annotatedWith(Names.named("FilterPublicAccessContribution"))
				.to(FilterPublicAccessContribution.class);
	}
	
	@Override
	public void configureMarkOccurrencesAction(Binder binder) {
	}

}
