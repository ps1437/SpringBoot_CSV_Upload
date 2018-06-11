package com.wipro.piramal.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wipro.piramal.service.BulkService;

import au.com.bytecode.opencsv.CSVReader;

@Controller
public class BulkUploadController {

	private BulkService service;

	@Autowired
	public BulkUploadController(BulkService service) {
		this.service = service;
	}

	@GetMapping("/")
	public String index() {
		return "login";
	}

	@PostMapping("/login")
	public String login(HttpServletRequest request, Model model) {

		System.out.println(" emailId: " + request.getParameter("email"));
		model.addAttribute("emailId", request.getParameter("email"));
		return "upload";
	}

	@GetMapping("/app/download/{fileName}")
	public void downlaodTemplate(@PathVariable("fileName") String fileName, HttpServletResponse response)
			 {
		service.downloadTemplates(fileName, response);
	}

	@PostMapping("/app/upload")
	public String singleFileUploddad(@RequestParam("file") MultipartFile file, final RedirectAttributes redirectAttributes)
			throws IOException {

		System.out.println("DASDASDASD");

		CSVReader reader = new CSVReader(new InputStreamReader(file.getInputStream()), ',');
		List<String[]> allRows = reader.readAll();
		System.out.println("allRows : " + allRows.size());
		for (String[] row : allRows) {
			System.out.println("--------" + Arrays.toString(row));
		}
	//	redirectAttributes.addFlashAttribute("status", "Uploaded sucessfully...");
		return "redirect:/app/uploadStatus";
	}

	@GetMapping("/app/uploadStatus")
	public String uploadStatus() {
		System.out.println("help>>>>>>>>>>>>>>>>");
		System.out.println("status'; ");
		return "upload";
	}

	@GetMapping("/app/sendMail")
	public String sendMail(@RequestParam("status") String status, Model model) {
		model.addAttribute("status", status);
		return "upload";
	}

}
