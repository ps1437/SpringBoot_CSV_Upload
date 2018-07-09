package com.wipro.piramal.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wipro.piramal.service.BulkService;

/**
 * @author Praveen $oni
 *
 */
@ControllerAdvice
public class BulkExceptionHandler {
	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(BulkExceptionHandler.class);

	/**
	 * @param ex
	 * @param model
	 * @return
	 */
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormat(Exception ex, Model model, RedirectAttributes ra) {

		System.out.println("---------------------------------------");
		LOGGER.error("BulkExceptionHandler : - numberFormat()" + ex.getMessage());

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

		LOGGER.error("BulkExceptionHandler : - arrayIndex()" + ex.getMessage());

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
	public String nullPointerExceptionHandler(Exception ex, Model model) {

		LOGGER.error("BulkExceptionHandler : - nullPointerExceptionHandler()" + ex.getMessage());
		ex.printStackTrace();
		System.out.println("-------------------XXXXXX--------------------");
		model.addAttribute("errorMessage", "Something went wrong, Please try again !");
		return "errorPage";
	}
}
