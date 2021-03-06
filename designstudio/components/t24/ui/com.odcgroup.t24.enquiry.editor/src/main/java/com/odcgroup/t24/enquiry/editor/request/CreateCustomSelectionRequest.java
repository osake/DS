package com.odcgroup.t24.enquiry.editor.request;

import org.eclipse.gef.Request;

import com.odcgroup.t24.enquiry.enquiry.Enquiry;

/**
 *
 * @author phanikumark
 *
 */
public class CreateCustomSelectionRequest extends Request {
	
	private Enquiry enquiry;
	public static final String CREATE_CUSTOMSELECTION = "createCustomSelection" ;
	
	public CreateCustomSelectionRequest(Enquiry enquiry) {
		this.enquiry = enquiry;
		setType(CREATE_CUSTOMSELECTION);
	}
	
	public Enquiry getEnquiry() {
		return enquiry;
	}

}
