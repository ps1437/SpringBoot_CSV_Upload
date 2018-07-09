package com.wipro.piramal.vo;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.wipro.piramal.validator.DateFomatter;
import com.wipro.piramal.validator.NotNullNumberFormat;
import com.wipro.piramal.validator.ValidInput;

public class CandidateExpVo {
	

	@NotNullNumberFormat(nullable = true)
	private long indent;
	private String userName;
	@NotNullNumberFormat(nullable = true)
	private long ds;
	@ValidInput(expectedValue = "TRUE,FALSE", message = " Expected values are [TRUE ,FALSE]", nullable = true)
	private String ce;
	private String empName;
	private String otherEmpName;
	private String jobFunction;
//	private String name;
	private String otherJobTitle;
	@NotNull
	private String industryType;
	@NotNull
	private String workContract;
	@DateFomatter(pattern = "yyyy-MM-dd" , nullable = true ,message = "yyyy-MM-dd")
	private String beginDate;
	@DateFomatter(pattern = "yyyy-MM-dd" , nullable = true,message = "yyyy-MM-dd")
	private String endDate;
	private String responsibility;

	public long getIndent() {
		return indent;
	}

	public void setIndent(long indent) {
		this.indent = indent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getDs() {
		return ds;
	}

	public void setDs(long ds) {
		this.ds = ds;
	}

	public String getCe() {
		return ce;
	}

	public void setCe(String ce) {
		this.ce = ce;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getOtherEmpName() {
		return otherEmpName;
	}

	public void setOtherEmpName(String otherEmpName) {
		this.otherEmpName = otherEmpName;
	}

	public String getJobFunction() {
		return jobFunction;
	}

	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public String getOtherJobTitle() {
		return otherJobTitle;
	}

	public void setOtherJobTitle(String otherJobTitle) {
		this.otherJobTitle = otherJobTitle;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getWorkContract() {
		return workContract;
	}

	public void setWorkContract(String workContract) {
		this.workContract = workContract;
	}

	

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

}
