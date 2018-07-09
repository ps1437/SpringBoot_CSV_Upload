package com.wipro.piramal.util;

import org.springframework.stereotype.Component;

import com.wipro.piramal.vo.CandidateBypassVo;
import com.wipro.piramal.vo.CandidateVo;
import com.wipro.piramal.vo.OfferVo;
import com.wipro.piramal.vo.ReqCandidateVo;
import com.wipro.piramal.vo.RequistionVo;
import com.wipro.piramal.vo.ShlVo;

/**
 * @author Praveen $oni
 */
@Component
public class BulkConstant {

	/* OutPut File Names */
	public static final String REQ_OP_FILE = "Requistion.csv";
	public static final String CAND_OP_FILE = "Candidate.csv";
	public static final String SHL_OP_FILE = "SHL.csv";
	public static final String OFFERS_OP_FILE = "Offers.csv";
	public static final String CAND_BYPASS_OP_FILE = "Candidate Bypass.csv";
	public static final String REQ_CAND_OP_FILE = "Requsition Candidate Mapping.csv";

	// Templates
	public static final String CANDIDATE_TEMPLATE = "classpath:templates/candidate/Candidate_Template.csv";
	public static final String CANDIDATE_EXP_TEMPLATE = "classpath:templates/candidate/Candidate_Experience_Template.csv";
	public static final String CANDIDATE_EDU_TEMPLATE = "classpath:templates/candidate/Candidate_Experience_Template.csv";
	public static final String CANDIDATE_BYPASS_TEMPLATE = "classpath:templates/candidate/Candidate_Bypass_Template.csv";

	public static final String REQUISTION_CANDIDATE_TEMPLATE = "classpath:templates/Requisition_Candidate_Map _Template.csv";
	public static final String REQUISTION_TEMPLATE = "classpath:templates/Requsition_Template.csv";

	public static final String OFFERS_TEMPLATE = "classpath:templates/Offer_Template.csv";
	public static final String SHL_TEMPLATE = "classpath:templates/SHL_Template.csv";

	// Template Valid Values -Validations
	public static final String VALID_REQ_TYPE = "Campus,Fresher,Trainee,Professional,Pipeline-General";
	public static final String VALID_JUSTIFICATION = "Replacement,New Position";
	public static final String VALID_AAP_JOB_GROUP="AAP Job Group,101 Executives,102 Department Heads,103 Contract Managers,113	Business Managers,123 Sales and Marketing Managers,201 Senior Professionals,801 Laborers,701 Operatives,601 Craft Workers,502 Interns,501 Administrative,301 Technicians";
	public static final String VALID_CONTRACT_TYPE = "Permanent,apprentice,Trainee,Temporary,Not Specified";
	public static final String VALID_SHIFT = "Day Job,Evening Job,Night Job,On Call,Variable,Flex Time,Weekend,Rotating,Not Specified";
	public static final String VALID_EDUCATION = "Master's Degree,Bachelor's Degree,Doctorate Degree,PHD,Post PHD,Higher,High School Diplomo,GED,GCSE,Technical Diplomo,A Level,Associate's Degree,College Diplomo,Non-Degree Program(+_14 Years),Other";
	public static final String VALID_EXPER = "Between 1 to 3 Years,Less than 1 Year,Between 3 to 7 Years,Between 7 to 15 Years,More Than 15 Years";
	public static final String VALID_CURRENCY = "Indian Rupee (INR),US Doller (USD),Canadian Doller (CAD),Euro (EUR),Pound Sterling(GBP),Sri Lanka Rupee (LKR),Italian Lira (ITL)";
	public static final String VALID_PAY = "Yearly,Weekly,Hourly,Biweekly,Semimonthly,Monthly,Total,Daily";
	public static final String VALID_BAND = "1,2,3,4,5,6,7,A,BRetainer,Trainee";
	public static final String VALID_GRADE = "1,10,1A,1B,2,2+,2A,2B,3,3A,3B,3C,6+,DIGWALA,DLGWALB,FT,M0,M1,M2,MHDW1,N1,OA,OB,OC,PTPW1,PTPW2,R1,S1,T0,T1,Trainee,Workman";
	public static final String VALID_LETTERS = "FS_India_Offer_Letter,FS_India_Offer_Letter_Bricker,Piramal Canada Offer Letter,Piramal india Offer Letter";

}
