package com.odcgroup.mdf.model.translation;

import java.util.Locale;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.odcgroup.mdf.ecore.MdfClassImpl;
import com.odcgroup.mdf.ecore.MdfDatasetImpl;
import com.odcgroup.mdf.ecore.MdfDomainImpl;
import com.odcgroup.mdf.ecore.MdfFactory;
import com.odcgroup.translation.core.ITranslation;
import com.odcgroup.translation.core.ITranslationKind;
import com.odcgroup.translation.core.TranslationException;

/**
 * Test the translation provider
 * @author yan
 */
public class MdfInheritableTranslationProviderTest {
	
	protected IProject project;
	protected MdfDomainImpl domain;
	protected MdfClassImpl mdfClass;
	protected MdfDatasetImpl mdfDataset;

	@Before
	@SuppressWarnings("unchecked")
	public void setUp() throws Exception {
		
		// create a dummy project with the OfsNature.
		project = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
		project.create(null);
		project.open(null);
		IProjectDescription description = project.getDescription();
		String[] natures = { "org.eclipse.jdt.core.javanature" };
		description.setNatureIds(natures);
		project.setDescription(description, null);

		// create a dummy domain
		domain = (MdfDomainImpl)MdfFactory.eINSTANCE.createMdfDomain();
		domain.setName("dummyDomain");
		mdfClass = (MdfClassImpl)MdfFactory.eINSTANCE.createMdfClass();
		domain.getClasses().add(mdfClass);
		mdfDataset = (MdfDatasetImpl)MdfFactory.eINSTANCE.createMdfDataset();
		domain.getDatasets().add(mdfDataset);
	}
	
	@After
	public void tearDown() throws Exception {
		domain = null;
		mdfClass = null;
		if (project != null) {
			project.delete(true, null);
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testTranslationProviderIllegalArgs() {
		new MdfInheritableTranslationProvider()
				.getTranslation(project, mdfClass);
	}
	
	@Test
	public void testTranslationProvider() throws TranslationException {
		ITranslation translation = new MdfInheritableTranslationProvider()
				.getTranslation(project, mdfDataset);
		Assert.assertTrue("Wrong translation object returned", 
				translation instanceof MdfInheritableTranslation);
		
		translation.setText(ITranslationKind.NAME, Locale.FRENCH, "test");
		Assert.assertEquals("The translation object is not connected to the class", 
				translation.getText(ITranslationKind.NAME, Locale.FRENCH),
				"test");
	}

}
