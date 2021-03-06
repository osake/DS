package com.odcgroup.t24.enquiry.editor.part.commands;

import java.util.List;

import org.eclipse.gef.commands.Command;

import com.odcgroup.t24.enquiry.enquiry.Enquiry;
import com.odcgroup.t24.enquiry.enquiry.FixedSort;

/**
 
 * @author satishnangi
 *
 */
public class FixedSortMoveUpCommand extends Command {
	private Enquiry enquiry = null;
	private String fieldName = null;
	public FixedSortMoveUpCommand(Enquiry enquiry, String fieldName){
		this.enquiry = enquiry;
		this.fieldName = fieldName;
    }

	@Override
	public void execute() {
		List<FixedSort> fixedSortList = enquiry.getFixedSorts();
		int oldPosition =0;
		for(FixedSort fixedSort : fixedSortList) { 
			if(fixedSort.getField().equals(fieldName)){
				 oldPosition = enquiry.getFixedSorts().indexOf(fixedSort);
			}
		}
		if(oldPosition !=0){
		  enquiry.getFixedSorts().move(oldPosition-1, oldPosition);
		}
	}
}
