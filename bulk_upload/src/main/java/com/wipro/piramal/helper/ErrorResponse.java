package com.wipro.piramal.helper;

public class ErrorResponse {

	private String errorMsg;
	private String errorId;

	public ErrorResponse() {
	}

	public ErrorResponse(String errorId, String errorMsg) {
		super();

		this.errorId = errorId;
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

}
