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

import com.wipro.piramal.vo.RequistionVo;

import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;

@Service
public class BulkService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BulkService.class);
	private static final String CANDIDATE = "classpath:templates/TechGig.txt";
	private static final String REQUISTION = "classpath:templates/TechGig.txt";
	private static final String OFFERS = "classpath:templates/TechGig.txt";

	public void downloadTemplates(String fileName, HttpServletResponse response) {
		String tempalteName = getTemplateName(fileName);
		File file = null;
		try {

			file = ResourceUtils.getFile(tempalteName);
			InputStream inputStream = new FileInputStream(file);
			response.setContentType("application/csv");
			response.setHeader("Content-Disposition", "filename=TechGig.txt");
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
		case "REQUISTION":
			templateName = REQUISTION;
			break;
		case "OFFERS":
			templateName = OFFERS;
			break;

		}
		return templateName;

	}

	public ColumnPositionMappingStrategy setColumMapping() {
		ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
		strategy.setType(RequistionVo.class);
	
		String[] columns = new String[] { "identifier", "reqType", "positionCode", "justification", "budgetedPosition",
				"eeoJob", "contractType", "aaoJob", "worktype", "recruiter", "hiringMgr", "shift", "education",
				"experience", "currency", "payBasis", "minSalary", "maxSalary", "descExternal", "qualExternal",
				"desInternal", "qualInternal", "status" };
		strategy.setColumnMapping(columns);
		return strategy;
	}

	/*
	 * public ErrorResponse mapToVo(String[] split) {
	 * 
	 * ErrorResponse mapToRequistion = mapToRequistion(split);
	 * 
	 * return mapToRequistion; }
	 * 
	 * 
	 * static ErrorResponse mapToRequistion(String[] split){
	 * 
	 * ErrorResponse resp = new ErrorResponse(); RequistionVo req = new
	 * RequistionVo(); long value = Long.parseLong(split[0]); try {
	 * 
	 * System.out.println("id" + value); req.setIdentifier(value);
	 * req.setReqType(split[1]); value = Long.parseLong(split[2]);
	 * req.setPositionCode(value); req.setJustification(split[3]);
	 * req.setBudgetedPosition(split[4]); req.setEeoJob(split[5]);
	 * req.setContractType(split[6]); req.setAaoJob(split[7]);
	 * req.setWorktype(split[8]); value = Long.parseLong(split[9]);
	 * req.setRecruiter(value); value = Long.parseLong(split[10]);
	 * req.setHiringMgr(value); req.setShift(split[11]);
	 * req.setEducation(split[12]); req.setExperience(split[13]);
	 * req.setCurrency(split[14]); req.setPayBasis(split[15]); value =
	 * Long.parseLong(split[16]); req.setMinSalary(value); value =
	 * Long.parseLong(split[17]); req.setMaxSalary(value);
	 * req.setDescExternal(split[18]); req.setQualExternal(split[19]);
	 * req.setDesInternal(split[20]); req.setQualInternal(split[21]);
	 * req.setStatus(split[22]);
	 * 
	 * } catch (NumberFormatException exp) { String message = exp.getMessage();
	 * resp.setErrorId(String.valueOf(value)); resp.setErrorMsg(message +
	 * " Numeric value is expected"); } catch (ArrayIndexOutOfBoundsException
	 * exp) {
	 * 
	 * } catch (Exception exp) {
	 * 
	 * } return resp; }
	 */

}
