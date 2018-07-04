package com.wipro.piramal.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author Praveen $oni
 *
 */
@ControllerAdvice
public class BulkExceptionHandler {

	/**
	 * @param ex
	 * @param model
	 * @return
	 */
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormat(Exception ex, Model model, RedirectAttributes ra) {

		System.out.println("---------------------------------------");
		
		ex.printStackTrace();
		List<ErrorResponse> errorList = new ArrayList<ErrorResponse>();
		ErrorResponse resp = new ErrorResponse();
		String message = ex.getCause().getMessage();
		resp.setErrorId(message.split("\"")[1].replace("\"", ""));
		resp.setErrorMsg("Invalid Value, Expected Numerical Value");
		errorList.add(resp);
		ra.addFlashAttribute("errorList", errorList);
		return "redirect:/bulk/uploadFailure";
	}

	/**
	 * @param ex
	 * @param model
	 * @return
	 */
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String arrayIndex(Exception ex, Model model, RedirectAttributes ra) {
		ex.printStackTrace();
		List<ErrorResponse> errorList = new ArrayList<ErrorResponse>();
		ErrorResponse resp = new ErrorResponse();

		String message = ex.getCause().getMessage();
		resp.setErrorId(message.split("\"")[1].replace("\"", ""));
		resp.setErrorMsg("Input File is invalid.. ");
		errorList.add(resp);
		ra.addFlashAttribute("errorList", errorList);
		return "redirect:/bulk/uploadFailure";
	}

	/**
	 * * @param ex
	 * 
	 * @param model
	 * @return
	 */
	@ExceptionHandler(NullPointerException.class)
	public String exception(Exception ex, Model model) {
		
		System.out.println("-------------------XXXXXX--------------------");
		model.addAttribute("errorMessage", "Something went wrong, Please try again !");
		return "errorPage";
	}

}
