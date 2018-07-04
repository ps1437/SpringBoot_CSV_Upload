package com.wipro.piramal.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wipro.piramal.exceptions.ErrorResponse;
import com.wipro.piramal.service.BulkService;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author Praveen $oni
 * @category Controller
 */
@Controller
public class BulkUploadController {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(BulkService.class);

	private String emailId;
	@Value("${download.path.candidate}")
	private String candidateDownloadPath;
	@Value("${download.path.requestion}")
	private String reqDownloadPath;
	@Value("${download.path.shl}")
	private String shlDownloadPath;

	/** The service. */
	private BulkService service;

	/**
	 * Instantiates a new bulk upload controller.
	 *
	 * @param service
	 *            the service
	 */
	@Autowired
	public BulkUploadController(BulkService service) {
		this.service = service;
	}

	/**
	 * Index.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String index() {
		return "login";
	}

	/**
	 * Login.
	 *
	 * @param request
	 *            the request
	 * @param model
	 *            the model
	 * @return the string
	 */
	@PostMapping("/bulk/login")
	public String login(HttpServletRequest request, Model model) {
		emailId = request.getParameter("email");

		model.addAttribute("emailId", emailId);
		return "bulkUpload";
	}

	/**
	 * Downlaod template.
	 *
	 * @param fileName
	 *            the file name
	 * @param response
	 *            the response
	 */
	@GetMapping("/bulk/download/{fileName}")
	public void downlaodTemplate(@PathVariable("fileName") String fileName, HttpServletResponse response) {
		service.downloadTemplates(fileName, response);
	}

	/**
	 * Uploadlaod template.
	 *
	 * @param file
	 *            the file
	 * @param model
	 *            the model
	 * @param request
	 *            the request
	 * @param ra
	 *            the ra
	 * @return the string
	 */
	@PostMapping("/bulk/upload")
	public String uploadlaodTemplate(@RequestParam("file") MultipartFile file, Model model, HttpServletRequest request,
			HttpServletResponse response, RedirectAttributes ra) {

		String fileType = null;

		fileType = request.getParameter("templateId");
		if ("C".equalsIgnoreCase(fileType)) {
			fileType = request.getParameter("subTemplateId");

		}

		System.out.println("file : file" + file.getName());
		List<ErrorResponse> processData = null;
		CSVReader reader;
		try {
			reader = new CSVReader(new InputStreamReader(file.getInputStream()), ',', '"', 1);

			processData = service.processData(reader, fileType);

			if (null == processData) {
				// ra.addFlashAttribute("emptyFile", true);
				return "redirect:/bulk/emptyFile";
			}
			if (processData.size() == 0) {

				/*
				 * File savedFile = service.moveFileToServer(fileType, new
				 * InputStreamReader(file.getInputStream())); if (null !=
				 * savedFile) { boolean mailStatus = service.sendMail(savedFile,
				 * response); // ra.addFlashAttribute("mailStaus", "File Sent //
				 * Sucessfully");
				 * 
				 * }
				 */
				return "redirect:/bulk/uploadSuccess";

			} else {
				ra.addFlashAttribute("errorList", processData);
			}

		} catch (IOException exp) {
			LOGGER.error("BulkUploadController.uploadlaodTemplate()" + exp.getMessage());
			exp.printStackTrace();
		}
		return "redirect:/bulk/uploadFailure";
	}

	/**
	 * Upload sucesdasds.
	 *
	 * @param request
	 *            the request
	 * @param model
	 *            the model
	 * @return the string
	 */
	@GetMapping("/bulk/uploadFailure")
	public String uploadFailed(Model model) {
		System.out.println(" >  < > <> <> < >< > < > <>  < ");
		Map md = model.asMap();
		if (md.containsKey("errorList")) {
			List<ErrorResponse> object = (List<ErrorResponse>) md.get("errorList");
			model.addAttribute("errorList", object);
		}
		return "bulkUpload";
	}

	@GetMapping("/bulk/emptyFile")
	public String uploadFileEmpty(Model model) {
		model.addAttribute("emptyFile", true);
		return "bulkUpload";
	}

	/**
	 * Upload sucess.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@GetMapping("/bulk/uploadSuccess")
	public String uploadSuccess(Model model) {
		model.addAttribute("fileUploaded", true);
		return "bulkUpload";
	}

	/**
	 * Send mail.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@GetMapping("/bulk/downloadFile")
	public void downloadFile(HttpServletResponse response, HttpServletRequest request, RedirectAttributes ra,
			Model model) {

		service.downloadOutputFile(candidateDownloadPath, response);

	}

	@GetMapping("/bulk/download/emptyDir")
	public String fileNotAvailable(Model model) {
		model.addAttribute("fileStatus", "<b> No file available for download </b>");
		return "bulkUpload";
	}

	/**
	 * Error page.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@GetMapping("/error")
	public String errorPage(Model model) {
		model.addAttribute("errorMessage", "Something went wrong, Please try again !");
		return "errorPage";
	}

}
