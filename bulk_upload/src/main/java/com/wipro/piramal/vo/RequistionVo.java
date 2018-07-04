package com.wipro.piramal.vo;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

import com.wipro.piramal.util.BulkConstant;
import com.wipro.piramal.validator.ValidInput;

/**
 * @author Praveen $oni
 */
@Component
public class RequistionVo {

	/** The identifier. */
	private long identifier;

	/** The req type. */
	@ValidInput(expectedValue = BulkConstant.VALID_REQ_TYPE, message = "{requ.reqType}")
	private String reqType;

	/** The position code. */
	@NumberFormat
	private long positionCode;

	/** The justification. */
	@NotNull
	@ValidInput(expectedValue = BulkConstant.VALID_JUSTIFICATION, message = "{requ.justification}")
	private String justification;

	/** The budgeted position. */
	@NotNull
	@ValidInput(expectedValue = "Yes,No", message = "{requ.budget}")
	private String budgetedPosition;

	/** The eeo job. */
	@ValidInput(expectedValue = "Professionals", message = "{requ.eeo}")
	private String eeoJob;

	/** The contract type. */
	@NotNull
	@ValidInput(expectedValue = BulkConstant.VALID_CONTRACT_TYPE, message = "{requ.contract}")
	private String contractType;

	/** The aao job. */
	private String aaoJob;

	/** The worktype. */
	@NotNull
	@ValidInput(expectedValue = "Indirect,Direct", message = "{requ.workType}")
	private String worktype;

	/** The recruiter. */
	@NotNull
	@NumberFormat
	private long recruiter;

	/** The hiring mgr. */
	@NotNull
	@NumberFormat
	private long hiringMgr;

	/** The shift. */
	@NotNull
	@ValidInput(expectedValue = BulkConstant.VALID_SHIFT, message = "{requ.shift}")
	private String shift;

	/** The education. */
	@NotNull
	@ValidInput(expectedValue = BulkConstant.VALID_EDUCATION, message = "{requ.education}")
	private String education;

	/** The experience. */
	@NotNull
	@ValidInput(expectedValue = BulkConstant.VALID_EXPER, message = "{requ.experience}")
	private String experience;

	/** The currency. */
	@NotNull
	@ValidInput(expectedValue = BulkConstant.VALID_CURRENCY, message = "{msg.currency}")
	private String currency;

	/** The pay basis. */
	@NotNull
	@ValidInput(expectedValue = BulkConstant.VALID_PAY, message = "{msg.payBasis}")
	private String payBasis;

	/** The min salary. */
	@NotNull
	@NumberFormat

	private long minSalary;

	/** The max salary. */
	@NotNull
	@NumberFormat
	private long maxSalary;

	/** The desc external. */
	@NotNull
	private String descExternal;

	/** The qual external. */
	@NotNull
	private String qualExternal;

	/** The des internal. */
	@NotNull
	private String desInternal;

	/** The qual internal. */
	@NotNull
	private String qualInternal;

	/** The status. */
	@NotNull
	private String status;

	/**
	 * Gets the identifier.
	 *
	 * @return the identifier
	 */
	public long getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the identifier.
	 *
	 * @param identifier
	 *            the new identifier
	 */
	public void setIdentifier(long identifier) {
		this.identifier = identifier;
	}

	/**
	 * Gets the req type.
	 *
	 * @return the req type
	 */
	public String getReqType() {
		return reqType;
	}

	/**
	 * Sets the req type.
	 *
	 * @param reqType
	 *            the new req type
	 */
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	/**
	 * Gets the position code.
	 *
	 * @return the position code
	 */
	public long getPositionCode() {
		return positionCode;
	}

	/**
	 * Sets the position code.
	 *
	 * @param positionCode
	 *            the new position code
	 */
	public void setPositionCode(long positionCode) {
		this.positionCode = positionCode;
	}

	/**
	 * Gets the justification.
	 *
	 * @return the justification
	 */
	public String getJustification() {
		return justification;
	}

	/**
	 * Sets the justification.
	 *
	 * @param justification
	 *            the new justification
	 */
	public void setJustification(String justification) {
		this.justification = justification;
	}

	/**
	 * Gets the budgeted position.
	 *
	 * @return the budgeted position
	 */
	public String getBudgetedPosition() {
		return budgetedPosition;
	}

	/**
	 * Sets the budgeted position.
	 *
	 * @param budgetedPosition
	 *            the new budgeted position
	 */
	public void setBudgetedPosition(String budgetedPosition) {
		this.budgetedPosition = budgetedPosition;
	}

	/**
	 * Gets the eeo job.
	 *
	 * @return the eeo job
	 */
	public String getEeoJob() {
		return eeoJob;
	}

	/**
	 * Sets the eeo job.
	 *
	 * @param eeoJob
	 *            the new eeo job
	 */
	public void setEeoJob(String eeoJob) {
		this.eeoJob = eeoJob;
	}

	/**
	 * Gets the contract type.
	 *
	 * @return the contract type
	 */
	public String getContractType() {
		return contractType;
	}

	/**
	 * Sets the contract type.
	 *
	 * @param contractType
	 *            the new contract type
	 */
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	/**
	 * Gets the aao job.
	 *
	 * @return the aao job
	 */
	public String getAaoJob() {
		return aaoJob;
	}

	/**
	 * Sets the aao job.
	 *
	 * @param aaoJob
	 *            the new aao job
	 */
	public void setAaoJob(String aaoJob) {
		this.aaoJob = aaoJob;
	}

	/**
	 * Gets the worktype.
	 *
	 * @return the worktype
	 */
	public String getWorktype() {
		return worktype;
	}

	/**
	 * Sets the worktype.
	 *
	 * @param worktype
	 *            the new worktype
	 */
	public void setWorktype(String worktype) {
		this.worktype = worktype;
	}

	/**
	 * Gets the recruiter.
	 *
	 * @return the recruiter
	 */
	public long getRecruiter() {
		return recruiter;
	}

	/**
	 * Sets the recruiter.
	 *
	 * @param recruiter
	 *            the new recruiter
	 */
	public void setRecruiter(long recruiter) {
		this.recruiter = recruiter;
	}

	/**
	 * Gets the hiring mgr.
	 *
	 * @return the hiring mgr
	 */
	public long getHiringMgr() {
		return hiringMgr;
	}

	/**
	 * Sets the hiring mgr.
	 *
	 * @param hiringMgr
	 *            the new hiring mgr
	 */
	public void setHiringMgr(long hiringMgr) {
		this.hiringMgr = hiringMgr;
	}

	/**
	 * Gets the shift.
	 *
	 * @return the shift
	 */
	public String getShift() {
		return shift;
	}

	/**
	 * Sets the shift.
	 *
	 * @param shift
	 *            the new shift
	 */
	public void setShift(String shift) {
		this.shift = shift;
	}

	/**
	 * Gets the education.
	 *
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * Sets the education.
	 *
	 * @param education
	 *            the new education
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * Gets the experience.
	 *
	 * @return the experience
	 */
	public String getExperience() {
		return experience;
	}

	/**
	 * Sets the experience.
	 *
	 * @param experience
	 *            the new experience
	 */
	public void setExperience(String experience) {
		this.experience = experience;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency
	 *            the new currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Gets the pay basis.
	 *
	 * @return the pay basis
	 */
	public String getPayBasis() {
		return payBasis;
	}

	/**
	 * Sets the pay basis.
	 *
	 * @param payBasis
	 *            the new pay basis
	 */
	public void setPayBasis(String payBasis) {
		this.payBasis = payBasis;
	}

	/**
	 * Gets the min salary.
	 *
	 * @return the min salary
	 */
	public long getMinSalary() {
		return minSalary;
	}

	/**
	 * Sets the min salary.
	 *
	 * @param minSalary
	 *            the new min salary
	 */
	public void setMinSalary(long minSalary) {
		this.minSalary = minSalary;
	}

	/**
	 * Gets the max salary.
	 *
	 * @return the max salary
	 */
	public long getMaxSalary() {
		return maxSalary;
	}

	/**
	 * Sets the max salary.
	 *
	 * @param maxSalary
	 *            the new max salary
	 */
	public void setMaxSalary(long maxSalary) {
		this.maxSalary = maxSalary;
	}

	/**
	 * Gets the desc external.
	 *
	 * @return the desc external
	 */
	public String getDescExternal() {
		return descExternal;
	}

	/**
	 * Sets the desc external.
	 *
	 * @param descExternal
	 *            the new desc external
	 */
	public void setDescExternal(String descExternal) {
		this.descExternal = descExternal;
	}

	/**
	 * Gets the qual external.
	 *
	 * @return the qual external
	 */
	public String getQualExternal() {
		return qualExternal;
	}

	/**
	 * Sets the qual external.
	 *
	 * @param qualExternal
	 *            the new qual external
	 */
	public void setQualExternal(String qualExternal) {
		this.qualExternal = qualExternal;
	}

	/**
	 * Gets the des internal.
	 *
	 * @return the des internal
	 */
	public String getDesInternal() {
		return desInternal;
	}

	/**
	 * Sets the des internal.
	 *
	 * @param desInternal
	 *            the new des internal
	 */
	public void setDesInternal(String desInternal) {
		this.desInternal = desInternal;
	}

	/**
	 * Gets the qual internal.
	 *
	 * @return the qual internal
	 */
	public String getQualInternal() {
		return qualInternal;
	}

	/**
	 * Sets the qual internal.
	 *
	 * @param qualInternal
	 *            the new qual internal
	 */
	public void setQualInternal(String qualInternal) {
		this.qualInternal = qualInternal;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
