package com.wipro.piramal.exceptions;

/**
 * @author Praveen $oni
 * @category Error response Calss
 */
public class ErrorResponse {

	/** The error msg. */
	private String errorMsg;

	/** The error id. */
	private String errorId;

	/**
	 * Instantiates a new error response.
	 */
	public ErrorResponse() {
	}

	/**
	 * Instantiates a new error response.
	 *
	 * @param errorId
	 *            the error id
	 * @param errorMsg
	 *            the error msg
	 */
	public ErrorResponse(String errorId, String errorMsg) {
		super();

		this.errorId = errorId;
		this.errorMsg = errorMsg;
	}

	/**
	 * Gets the error msg.
	 *
	 * @return the error msg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * Sets the error msg.
	 *
	 * @param errorMsg
	 *            the new error msg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * Gets the error id.
	 *
	 * @return the error id
	 */
	public String getErrorId() {
		return errorId;
	}

	/**
	 * Sets the error id.
	 *
	 * @param errorId
	 *            the new error id
	 */
	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

}
