package com.wipro.piramal.util;

import com.wipro.piramal.vo.CandidateVo;
import com.wipro.piramal.vo.OfferVo;
import com.wipro.piramal.vo.RequistionVo;

public class ValidConstant {

	// Requistion Template Valid Values -Start
	public static final String VALID_REQ_TYPE = "Campus,Fresher,Trainee,Professional,Pipeline-General";
	public static final String VALID_JUSTIFICATION = "Replacement,New Position";
	public static final String VALID_CONTRACT_TYPE = "Permanent,apprentice,Trainee,Temporary,Not Specified";
	public static final String VALID_SHIFT = "Day Job,Evening Job,Night Job,On Call,Variable,Flex Time,Weekend,Rotating,Not Specified";
	public static final String VALID_EDUCATION = "Master's Degree,Bachelor's Degree,Doctorate Degree,PHD,Post PHD,Higher,High School Diplomo,GED,GCSE,Technical Diplomo,A Level,Associate's Degree,College Diplomo,Non-Degree Program(+_14 Years),Other";
	public static final String VALID_EXPER = "Between 1 to 3 Years,Less than 1 Year,Between 3 to 7 Years,Between 7 to 15 Years,More Than 15 Years";
	public static final String VALID_CURRENCY = "Indian Rupee (INR),US Doller (USD),Canadian Doller (CAD),Euro (EUR),Pound Sterling(GBP),Sri Lanka Rupee (LKR),Italian Lira (ITL)";
	public static final String VALID_PAY = "Yearly,Weekly,Hourly,Biweekly,Semimonthly,Monthly,Total,Daily";
	// Requistion Template Valid Values -End
	public static final String VALID_BAND = "1,2,3,4,5,6,7,A,BRetainer,Trainee";
	public static final String VALID_GRADE = "1,10,1A,1B,2,2+,2A,2B,3,3A,3B,3C,6+,DIGWALA,DLGWALB,FT,M0,M1,M2,MHDW1,N1,OA,OB,OC,PTPW1,PTPW2,R1,S1,T0,T1,Trainee,Workman";
	public static final String VALID_LETTERS = "FS_India_Offer_Letter,FS_India_Offer_Letter_Bricker,Piramal Canada Offer Letter,Piramal india Offer Letter";
	public static final String VALID_CURRENCY_BASIC = "Indian Rupee (INR),US Doller (USD),Canadian Doller (CAD),Euro (EUR),Pound Sterling(GBP),Sri Lanka Rupee (LKR),Italian Lira (ITL)";
	public static final String VALID_PAY_BASIC = "Yearly,Weekly,Hourly,Biweekly,Semimonthly,Monthly,Total,Daily";

	
	
	
	
	public static final String CANDIDATE_TEMPLATE = "classpath:templates/TechGig.txt";
	public static final String REQUISTION_TEMPLATE = "classpath:templates/TechGig.txt";
	public static final String OFFERS_TEMPLATE = "classpath:templates/TechGig.txt";

	public final static String[] REQUISTION_COLUMNS = { "identifier", "reqType", "positionCode",
			"justification", "budgetedPosition", "eeoJob", "contractType", "aaoJob", "worktype", "recruiter",
			"hiringMgr", "shift", "education", "experience", "currency", "payBasis", "minSalary", "maxSalary",
			"descExternal", "qualExternal", "desInternal", "qualInternal", "status" };
	
	public final static String[] OFFERS_COLUMNS = { "identifier", "applNo", "legalEntity", "band", "grade",
			"payBasis", "startDate", "fixedPay", "loyalaity", "currency", "basic", "petrolAllowance", "carAllowance",
			"joiningBonus", "lta", "expirationDate", "medical", "statutoryBonus", "specialAllowance", "ctc",
			"tribalAreaAllowance", "driverSalary", "performancePay", "eduAllowance", "pglBonus", "healthCoverage",
			"conveyance", "gratuity", "pf", "carParkingAndCleaning", "letterUsed", "relocationDesc",  "hra", "hiringManagerTitle",
			"comments" };
	
	public final static String[] CANDIDATE_COLUMNS  = null;
	
	public static final Class CANDIDATE_CLASS = CandidateVo.class;
	public static final Class REQUSITION_CLASS = RequistionVo.class;
	public static final Class OFFERS_CLASS = OfferVo.class;
}
