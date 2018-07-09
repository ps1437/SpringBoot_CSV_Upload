package com.wipro.piramal.util;

import com.wipro.piramal.vo.CandidateBypassVo;
import com.wipro.piramal.vo.CandidateEduVo;
import com.wipro.piramal.vo.CandidateExpVo;
import com.wipro.piramal.vo.CandidateVo;
import com.wipro.piramal.vo.OfferVo;
import com.wipro.piramal.vo.ReqCandidateVo;
import com.wipro.piramal.vo.RequistionVo;
import com.wipro.piramal.vo.ShlVo;

public class MapperConstant {
	// Column ,CSV Mapping configuration
	public final static String[] REQUISTION_COLUMNS = { "identifier", "reqType", "positionCode", "justification",
			"budgetedPosition", "eeoJob", "contractType", "aaoJob", "worktype", "recruiter", "hiringMgr", "shift",
			"education", "experience", "currency", "payBasis", "minSalary", "maxSalary", "descExternal", "qualExternal",
			"desInternal", "qualInternal", "status" };


	public final static String[] OFFERS_COLUMNS = { "identifier", "applNo", "legalEntity", "band", 
			"grade", "payBasis",
			"startDate", "fixedPay", "loyalaity", "currency", "basic", "petrolAllowance", "carAllowance",
			"joiningBonus", "lta", "expirationDate", "medical", "statutoryBonus", "specialAllowance", "ctc",
			"tribalAreaAllowance", "driverSalary", "performancePay", "eduAllowance", "pglBonus", "healthCoverage",
			"conveyance", "gratuity", "pf", "carParkingAndCleaning","letterUsed","relocationDesc", "hra",
			"hiringManagerTitle", "comments" };

	public final static String[] CANDIDATE_BYPASS_COLUMNS = { "identifier", "candidateNumber", "requisitionNumber",
			"step", "status", "comment" };
	public final static String[] SHL_COLUMNS = { "identifier", "req", "pid", "key", "value", "override" };
	public final static String[] REQ_CAND_MAPPING_COLUMNS = { "identifier", "number", "contestNumber", "rmi" };

	public final static String[] CANDIDATE_COLUMNS = { "identifier", "firstName", "lastName", "address", "city", "zip",
			"residence", "primaryNumber", "cellularNumber", "homeNumber", "email", "noticePeriod", "dob", "doa",
			"rehire", "salary", "sal" };

	public final static String[] CANDIDATE_EXP_COLUMNS = { "indent", "userName", "ds", "ce", "empName", "otherEmpName",
			"jobFunction", "otherJobTitle ", "industryType", "workContract", "beginDate",
			"endDate", "responsibility" };

	public final static String[] CANDIDATE_EDU_COLUMNS ={};
			
	// Mapper Class Cofig
	public static final Class<CandidateVo> CANDIDATE_CLASS = CandidateVo.class;
	public static final Class<RequistionVo> REQUSITION_CLASS = RequistionVo.class;
	public static final Class<OfferVo> OFFERS_CLASS = OfferVo.class;
	public static final Class<ShlVo> SHL_CLASS = ShlVo.class;
	public static final Class<ReqCandidateVo> REQ_CAND_CLASS = ReqCandidateVo.class;
	public static final Class<CandidateBypassVo> CAND_BYPASS = CandidateBypassVo.class;
	public static final Class<CandidateExpVo> CAND_EXP_CLASS = CandidateExpVo.class;

	public static final Class<CandidateEduVo> CAND_EDU_CLASS =  CandidateEduVo.class;;
	

}
