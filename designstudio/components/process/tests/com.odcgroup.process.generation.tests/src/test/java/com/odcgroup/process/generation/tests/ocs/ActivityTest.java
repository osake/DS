package com.odcgroup.process.generation.tests.ocs;

import org.w3c.dom.Document;

public class ActivityTest extends BaseWorkflowGenerationTester {
	
	@Override
	protected void checkDocuments(Document doc1, Document doc2) {
		checkXML(doc1, doc2, "workflow:activity", "name");
	}

}
