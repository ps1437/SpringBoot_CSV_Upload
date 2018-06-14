package com.wipro.piramal.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.wipro.piramal.helper.BulkValidator;
import com.wipro.piramal.service.BulkService;
import com.wipro.piramal.util.BulkConstant;
import com.wipro.piramal.util.UserValidator;
import com.wipro.piramal.vo.RequistionVo;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;

@Controller
public class BulkUploadController {

	private BulkService service;

	@Autowired
	private BulkValidator validator;

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
		model.addAttribute("emailId", request.getParameter("email"));
		return "bulkUpload";
	}

	@GetMapping("/app/download/{fileName}")
	public void downlaodTemplate(@PathVariable("fileName") String fileName, HttpServletResponse response) {
		service.downloadTemplates(fileName, response);
	}

	@PostMapping("/app/upload")
	public String maptoBean(@RequestParam("file") MultipartFile file, Model model) throws IOException {

		/*
		 * System.out.println("BulkUploadController.maptoBean()"); ErrorResponse
		 * errorResp = null; Scanner scanner = new Scanner(new
		 * InputStreamReader(file.getInputStream())); scanner.nextLine(); while
		 * (scanner.hasNextLine()) {
		 * 
		 * String[] split = scanner.nextLine().split(","); errorResp =
		 * service.mapToVo(split); if (null != errorResp) { break; } }
		 * 
		 * model.addAttribute("errors", errorResp);
		 */

		try {
			CsvToBean<RequistionVo> csv = new CsvToBean();
			CSVReader reader = new CSVReader(new InputStreamReader(file.getInputStream()), ',', '"', 1);

			List<RequistionVo> list = csv.parse(service.setColumMapping(), reader);

			validator.validate(list);
		} catch (NumberFormatException exception) {
			exception.printStackTrace();

		}

		return "bulkUpload";
	}

}
