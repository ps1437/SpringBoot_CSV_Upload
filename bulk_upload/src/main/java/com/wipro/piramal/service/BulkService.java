/*
 * 
 */
package com.wipro.piramal.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.wipro.piramal.exceptions.ErrorResponse;
import com.wipro.piramal.util.BulkConstant;
import com.wipro.piramal.util.MapperConstant;
import com.wipro.piramal.validator.BulkValidator;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

/**
 * @author Praveen $oni
 */
@Service
public class BulkService {

	@Value("${outPut.path}")
	private String outPutPath;

	@Value("${download.path.candidate}")
	private String candidateOutputPath;

	/** The validator. */
	@Autowired
	private BulkValidator validator;

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(BulkService.class);

	
	@Autowired
	private SftpConnector connector;
	/**
	 * Download templates.
	 *
	 * @param fileName
	 *            the file name
	 * @param response
	 *            the response
	 */
	public void downloadTemplates(String fileName, HttpServletResponse response) {
		String tempalteName = getTemplateName(fileName);
		File file = null;
		try {
			file = ResourceUtils.getFile(tempalteName);
			InputStream inputStream = new FileInputStream(file);
			response.setContentType("application/csv");
			response.setHeader("Content-Disposition", "filename=" + file.getName());
			ServletOutputStream outputStream2 = response.getOutputStream();

			IOUtils.copy(inputStream, outputStream2);
			String finalString = new String(outputStream2.toString());

			System.out.println(finalString);

		} catch (FileNotFoundException exp) {
			LOGGER.error(" BulkService.downloadTemplates() :" + exp.getMessage());
			exp.printStackTrace();
		} catch (IOException exp) {
			LOGGER.error(" BulkService.downloadTemplates() :  " + exp.getMessage());
			exp.printStackTrace();
		}

	}

	/**
	 * Gets the template name.
	 *
	 * @param name
	 *            the name
	 * @return the template name
	 */
	public static String getTemplateName(String name) {
		
		LOGGER.info(" BulkService.getTemplateName() : Template Name -" + name);
		
		String templateName = "";
		switch (name) {

		case "REQUISTION":
			templateName = BulkConstant.REQUISTION_TEMPLATE;
			break;
		case "OFFERS":
			templateName = BulkConstant.OFFERS_TEMPLATE;
			break;
		case "CANDIDATE":
			templateName = BulkConstant.CANDIDATE_TEMPLATE;
			break;
		case "CANDIDATE_EXP":
			templateName = BulkConstant.CANDIDATE_EXP_TEMPLATE;
			break;
		case "CANDIDATE_EDU":
			templateName = BulkConstant.CANDIDATE_EDU_TEMPLATE;
			break;
		case "CAND_BYPASS":
			templateName = BulkConstant.CANDIDATE_BYPASS_TEMPLATE;
			break;
		case "REQ_CAND":
			templateName = BulkConstant.REQUISTION_CANDIDATE_TEMPLATE;
			break;
		case "SHL":
			templateName = BulkConstant.SHL_TEMPLATE;
			break;

		}
		return templateName;

	}

	/**
	 * Sets the colum mapping.
	 *
	 * @param mappedClass
	 *            the mapped class
	 * @param mappedColumns
	 *            the mapped columns
	 * @return the column position mapping strategy
	 */
	@SuppressWarnings("rawtypes")
	public static ColumnPositionMappingStrategy setColumMapping(Class mappedClass, String[] mappedColumns) {
		ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
		strategy.setType(mappedClass);
		strategy.setColumnMapping(mappedColumns);
		return strategy;
	}

	/**
	 * Process data.
	 *
	 * @param reader
	 *            the reader
	 * @param fileType
	 *            the file type
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public List<ErrorResponse> processData(CSVReader reader, String fileType) {

		List list = null;
		List<ErrorResponse> validate = null;
		CsvToBean csv = new CsvToBean();
		switch (fileType) {
		case "R":

			list = csv.parse(setColumMapping(MapperConstant.REQUSITION_CLASS, MapperConstant.REQUISTION_COLUMNS),
					reader);
			break;
		case "O":
			list = csv.parse(setColumMapping(MapperConstant.OFFERS_CLASS, MapperConstant.OFFERS_COLUMNS), reader);
			break;
		case "RC":
			list = csv.parse(setColumMapping(MapperConstant.REQ_CAND_CLASS, MapperConstant.REQ_CAND_MAPPING_COLUMNS),
					reader);
			break;
		case "S":
			list = csv.parse(setColumMapping(MapperConstant.SHL_CLASS, MapperConstant.SHL_COLUMNS), reader);
			break;
		case "CC":
			list = csv.parse(setColumMapping(MapperConstant.CANDIDATE_CLASS, MapperConstant.CANDIDATE_COLUMNS), reader);
			break;
		case "CB":
			list = csv.parse(setColumMapping(MapperConstant.CAND_BYPASS, MapperConstant.CANDIDATE_BYPASS_COLUMNS),
					reader);
			break;
		case "CEXP":
			list = csv.parse(setColumMapping(MapperConstant.CAND_EXP_CLASS, MapperConstant.CANDIDATE_EXP_COLUMNS),
					reader);
			break;
		case "CEDU":
			list = csv.parse(setColumMapping(MapperConstant.CAND_EDU_CLASS, MapperConstant.CANDIDATE_EDU_COLUMNS),
					reader);
			break;

		}
	
		System.out.println("list: " + list);
		LOGGER.info(" BulkService.processData() : no of rows in CSV  -" + list.size());
		if (list.size() != 0) {
			validate = validator.validate(list);
		}

		return validate;
	}

	public File moveFileToServer(String fileType, InputStreamReader in) {
		File file = null;
		try {
			String fileName = getOutPutFileName(fileType);
			
	
			System.out.println("outPutPath " + outPutPath);
			file = new File(outPutPath + "\\" + fileName);
			FileOutputStream out = new FileOutputStream(file);
			IOUtils.copy(in, out);
			in.close();
			out.close();
			System.out.println(" >> > done");
		} catch (FileNotFoundException exp) {
			exp.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}

		return file;

	}

	private String getOutPutFileName(String fileType) {
		String fileName = "";
		switch (fileType) {
		case "R":
			fileName = BulkConstant.REQ_OP_FILE;
			break;
		case "C":
			fileName = BulkConstant.CAND_OP_FILE;
			break;
		case "O":
			fileName = BulkConstant.OFFERS_OP_FILE;
			break;
		case "RC":
			fileName = BulkConstant.REQ_CAND_OP_FILE;
			break;
		case "CB":
			fileName = BulkConstant.CAND_BYPASS_OP_FILE;
			break;
		case "S":
			fileName = BulkConstant.SHL_OP_FILE;

		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		String currentTime = sdf.format(new Date());
		fileName = fileName.concat(currentTime);

		return fileName;
	}

	public boolean sendMail(File file, HttpServletResponse response) {

		InputStream inputStream = null;
		try {
			if (file.exists()) {

				file = ResourceUtils.getFile(file.getAbsolutePath());
				inputStream = new FileInputStream(file);
				response.setContentType("application/csv");
				response.setHeader("Content-Disposition", "filename=" + file.getName());
				IOUtils.copy(inputStream, response.getOutputStream());
				return true;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	public void downloadOutputFile(String fileName, HttpServletResponse response) {
		InputStream inputStream = null;
		System.out.println("candidateOutputPath :  >> > >>  " + candidateOutputPath);
		boolean fileAvail = false;
		try {
			File file = new File(fileName);
			if (!file.exists()) {

				file.mkdirs();
			}
			File[] fileslist = file.listFiles();
			for (File files : fileslist) {
				if (files.isFile()) {
					fileAvail = true;
					System.out.println(" fileName.getAbsolutePath(): " + files.getAbsolutePath());
					inputStream = new FileInputStream(files.getAbsolutePath());
					response.setContentType("application/csv");
					response.setHeader("Content-Disposition", "filename= " + files.getName());
					ServletOutputStream outputStream = response.getOutputStream();
					IOUtils.copy(inputStream, outputStream);
					outputStream.flush();
					outputStream.close();
				}

			}
			if (!fileAvail) {
				response.sendRedirect("/bulk/download/emptyDir");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
