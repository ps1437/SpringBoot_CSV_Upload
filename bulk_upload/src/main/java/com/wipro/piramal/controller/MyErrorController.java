package com.wipro.piramal.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {

	@RequestMapping("/error")
	public String handleError(Model model) {
		
		model.addAttribute("errorMessage", "Something went wrong, Please try again !");
		return "errorPage";
		
	}

	@Override
	public String getErrorPath() {
		System.out.println("dasdadasdasdsdasd");
		
		return "/errorPage";
	}
}