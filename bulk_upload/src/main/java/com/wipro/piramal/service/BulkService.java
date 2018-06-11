package com.wipro.piramal.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@Service
public class BulkService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BulkService.class);
	private static final String CANDIDATE = "classpath:templates/TechGig.txt";
	private static final String REQUSITION = "classpath:templates/TechGig.txt";
	private static final String OFFERS = "classpath:templates/TechGig.txt";

	public void downloadTemplates(String fileName, HttpServletResponse response) {
		String tempalteName = getTemplateName(fileName);
		File file = null;
		try {

			file = ResourceUtils.getFile(tempalteName);
			InputStream inputStream = new FileInputStream(file);
			response.setContentType("application/csv");
			response.setHeader("Content-Disposition", "attachment; filename=TechGig.txt");
			IOUtils.copy(inputStream, response.getOutputStream());
		} catch (FileNotFoundException exp) {
			LOGGER.error(" BulkService.downloadTemplates() :" + exp.getMessage());
			exp.printStackTrace();
		} catch (IOException exp) {
			LOGGER.error(" BulkService.downloadTemplates() :  " + exp.getMessage());
			exp.printStackTrace();
		}

	}

	public static String getTemplateName(String name) {
		String templateName = "";
		switch (name) {
		case "CANDIDATE":
			templateName = CANDIDATE;
			break;
		case "REQUSITION":
			templateName = REQUSITION;
			break;
		case "OFFERS":
			templateName = OFFERS;
			break;

		}
		return templateName;

	}
}
