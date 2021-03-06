package com.odcgroup.translation.ui.command;

import java.util.Locale;

import com.odcgroup.translation.core.ITranslation;
import com.odcgroup.translation.core.ITranslationKind;
import com.odcgroup.translation.core.TranslationException;

/**
 * TODO: Document me!
 * 
 * @author atr
 * 
 */
public class GEFUpdateTranslationCommand extends GEFTranslationCommand {

	private String oldText;
	private String newText;

	@Override
	public void execute() {
		try {
			oldText = getTranslation().setText(getKind(), getLocale(), newText);
		} catch (TranslationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void undo() {
		try {
			if (oldText != null) {
				getTranslation().setText(getKind(), getLocale(), oldText);
			}
		} catch (TranslationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param translation
	 * @param kind
	 * @param locale
	 * @param text
	 */
	public GEFUpdateTranslationCommand(ITranslation translation, ITranslationKind kind, Locale locale, String text) {
		super(translation, kind, locale);
		this.newText = text;
	}

}
