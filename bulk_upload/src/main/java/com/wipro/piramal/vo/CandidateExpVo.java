package com.wipro.piramal.vo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import com.wipro.piramal.validator.ValidInput;

public class CandidateExpVo {
	@NumberFormat
	private long indent;
	private String userName;
	@NumberFormat
	private String ds;
	@ValidInput(expectedValue ="TRUE,FALSE" ,message =" Expected values are [TRUE ,FALSE]")
	private String ce;
	private String empName;
	private String otherEmpName;
	private String jobFunction;
	private String name;
	private String otherJobTitle;
	private String industryType;
	private String workContract;
	private String description;
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private String beginDate;
	@DateTimeFormat(pattern ="yyyy-MM-dd")
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
	public String getDs() {
		return ds;
	}
	public void setDs(String ds) {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
