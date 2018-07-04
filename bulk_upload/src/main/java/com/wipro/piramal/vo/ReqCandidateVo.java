package com.wipro.piramal.vo;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

/**
 * @author Praveen $oni 
 */
public class ReqCandidateVo {

	/** The identifier. */
	@NumberFormat
	private long identifier;

	/** The number. */
	@NotNull
	@NumberFormat
	private long number;

	/** The contest number. */
	private String contestNumber;

	/** The rmi. */
	private String rmi;

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
	 * Gets the number.
	 *
	 * @return the number
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * Sets the number.
	 *
	 * @param number
	 *            the new number
	 */
	public void setNumber(long number) {
		this.number = number;
	}

	/**
	 * Gets the contest number.
	 *
	 * @return the contest number
	 */
	public String getContestNumber() {
		return contestNumber;
	}

	/**
	 * Sets the contest number.
	 *
	 * @param contestNumber
	 *            the new contest number
	 */
	public void setContestNumber(String contestNumber) {
		this.contestNumber = contestNumber;
	}

	/**
	 * Gets the rmi.
	 *
	 * @return the rmi
	 */
	public String getRmi() {
		return rmi;
	}

	/**
	 * Sets the rmi.
	 *
	 * @param rmi
	 *            the new rmi
	 */
	public void setRmi(String rmi) {
		this.rmi = rmi;
	}

}
