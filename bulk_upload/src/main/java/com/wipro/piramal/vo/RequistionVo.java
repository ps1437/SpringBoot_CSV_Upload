package com.wipro.piramal.vo;

import com.wipro.piramal.validator.InputValid;

public class RequistionVo {

	private long identifier;
	@InputValid(days = { "SATURDAY", "SUNDAY" }, message = "Please Enter correct input")
	private String reqType;
	private long positionCode;
	private String justification;
	private String budgetedPosition;
	private String eeoJob;
	private String contractType;
	private String aaoJob;
	private String worktype;
	private long recruiter;
	private long hiringMgr;
	private String shift;
	private String education;
	private String experience;
	private String currency;
	private String payBasis;
	private long minSalary;
	private long maxSalary;
	private String descExternal;
	private String qualExternal;
	private String desInternal;
	private String qualInternal;
	private String status;

	public long getIdentifier() {
		return identifier;
	}

	public void setIdentifier(long identifier) {
		this.identifier = identifier;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public long getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(long positionCode) {
		this.positionCode = positionCode;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getBudgetedPosition() {
		return budgetedPosition;
	}

	public void setBudgetedPosition(String budgetedPosition) {
		this.budgetedPosition = budgetedPosition;
	}

	public String getEeoJob() {
		return eeoJob;
	}

	public void setEeoJob(String eeoJob) {
		this.eeoJob = eeoJob;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getAaoJob() {
		return aaoJob;
	}

	public void setAaoJob(String aaoJob) {
		this.aaoJob = aaoJob;
	}

	public String getWorktype() {
		return worktype;
	}

	public void setWorktype(String worktype) {
		this.worktype = worktype;
	}

	public long getRecruiter() {
		return recruiter;
	}

	public void setRecruiter(long recruiter) {
		this.recruiter = recruiter;
	}

	public long getHiringMgr() {
		return hiringMgr;
	}

	public void setHiringMgr(long hiringMgr) {
		this.hiringMgr = hiringMgr;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayBasis() {
		return payBasis;
	}

	public void setPayBasis(String payBasis) {
		this.payBasis = payBasis;
	}

	public long getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(long minSalary) {
		this.minSalary = minSalary;
	}

	public long getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(long maxSalary) {
		this.maxSalary = maxSalary;
	}

	public String getDescExternal() {
		return descExternal;
	}

	public void setDescExternal(String descExternal) {
		this.descExternal = descExternal;
	}

	public String getQualExternal() {
		return qualExternal;
	}

	public void setQualExternal(String qualExternal) {
		this.qualExternal = qualExternal;
	}

	public String getDesInternal() {
		return desInternal;
	}

	public void setDesInternal(String desInternal) {
		this.desInternal = desInternal;
	}

	public String getQualInternal() {
		return qualInternal;
	}

	public void setQualInternal(String qualInternal) {
		this.qualInternal = qualInternal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
