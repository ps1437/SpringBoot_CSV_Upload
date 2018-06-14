package com.wipro.piramal.helper;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BulkExceptionHandler {

	@ExceptionHandler(NumberFormatException.class)
	public String numberFormat(Exception ex, Model model) {
		ErrorResponse resp = new ErrorResponse();
		resp.setErrorId("Input Type Error");

		resp.setErrorMsg(ex.getCause().getMessage() + " Numecial Value required");
		model.addAttribute("errors", resp);
		return "bulkUpload";
	}

	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String arrayIndex(Exception ex, Model model) {
		ErrorResponse resp = new ErrorResponse();
		resp.setErrorId("Input Type Error");
		resp.setErrorMsg(ex.getCause().getMessage() + " Input in valid");
		model.addAttribute("errors", resp);
		return "bulkUpload";
	}

}
