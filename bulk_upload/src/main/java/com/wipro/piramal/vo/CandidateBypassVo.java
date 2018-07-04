package com.wipro.piramal.vo;

import org.springframework.format.annotation.NumberFormat;

/**
 * @author Praveen $oni 
 */
public class CandidateBypassVo {

	/** The identifier. */
	@NumberFormat
	private long identifier;

	/** The candidate number. */
	@NumberFormat
	private long candidateNumber;

	/** The requisition number. */
	private String requisitionNumber;

	/** The step. */
	private String step;

	/** The status. */
	private String status;

	/** The comment. */
	private String comment;

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
	 * Gets the candidate number.
	 *
	 * @return the candidate number
	 */
	public long getCandidateNumber() {
		return candidateNumber;
	}

	/**
	 * Sets the candidate number.
	 *
	 * @param candidateNumber
	 *            the new candidate number
	 */
	public void setCandidateNumber(long candidateNumber) {
		this.candidateNumber = candidateNumber;
	}

	/**
	 * Gets the requisition number.
	 *
	 * @return the requisition number
	 */
	public String getRequisitionNumber() {
		return requisitionNumber;
	}

	/**
	 * Sets the requisition number.
	 *
	 * @param requisitionNumber
	 *            the new requisition number
	 */
	public void setRequisitionNumber(String requisitionNumber) {
		this.requisitionNumber = requisitionNumber;
	}

	/**
	 * Gets the step.
	 *
	 * @return the step
	 */
	public String getStep() {
		return step;
	}

	/**
	 * Sets the step.
	 *
	 * @param step
	 *            the new step
	 */
	public void setStep(String step) {
		this.step = step;
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

	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the comment.
	 *
	 * @param comment
	 *            the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
