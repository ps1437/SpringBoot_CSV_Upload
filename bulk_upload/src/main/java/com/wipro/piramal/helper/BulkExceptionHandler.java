package com.wipro.piramal.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BulkExceptionHandler {

	@ExceptionHandler(NumberFormatException.class)
	public String numberFormat(Exception ex, Model model) {
		List<ErrorResponse> errorList = new ArrayList<ErrorResponse>();
		ErrorResponse resp = new ErrorResponse();
		resp.setErrorId("Input Type Error");
		resp.setErrorMsg(ex.getCause().getMessage() + " Numerical Value required");
		errorList.add(resp);
		model.addAttribute("errorList", errorList);
	
		return "bulkUpload";
	}

	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String arrayIndex(Exception ex, Model model) {
		List<ErrorResponse> errorList = new ArrayList<ErrorResponse>();
		ErrorResponse resp = new ErrorResponse();
		resp.setErrorId("Input Type Error");
		resp.setErrorMsg(ex.getCause().getMessage() + " Input in valid ");
		errorList.add(resp);
		model.addAttribute("errorList", errorList);
		return "bulkUpload";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String exception(Exception ex , Model model) {
		model.addAttribute("errorMessage", "Something went wrong, Please try again !");
		return "errorPage";
	}
	

}
