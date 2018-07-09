package com.wipro.piramal.vo;

import javax.validation.constraints.NotNull;

import com.wipro.piramal.validator.NotNullNumberFormat;
import com.wipro.piramal.validator.ValidInput;

/**
 * @author Praveen $oni 
 */
public class ShlVo {

	/** The identifier. */
	@NotNullNumberFormat(nullable =true)
	private long identifier;

	/** The req. */
	@NotNull
	private String req;

	/** The pid. */
	@NotNull
	@ValidInput(expectedValue = "shl" , message = "{shl.pid}")
	private String pid;

	/** The key. */
	@NotNull
	@ValidInput(expectedValue = "AssessmentId" , message = "{shl.key}")
	private String key;

	/** The value. */
	@NotNull
	@ValidInput(expectedValue = "66619CD1-71CE-495C-8829-3DE5DEB56168,37ADDAAC-3684-4C1F-97F7-170DD76074B2" , message = "{shl.value}")
	private String value;

	/** The override. */
	@ValidInput(expectedValue = "FALSE,TRUE", message = "{shl.override}" ,nullable =true)
	private String override;

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
	 * Gets the req.
	 *
	 * @return the req
	 */
	public String getReq() {
		return req;
	}

	/**
	 * Sets the req.
	 *
	 * @param req
	 *            the new req
	 */
	public void setReq(String req) {
		this.req = req;
	}

	/**
	 * Gets the pid.
	 *
	 * @return the pid
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * Sets the pid.
	 *
	 * @param pid
	 *            the new pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *            the new key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value
	 *            the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Checks if is override.
	 *
	 * @return the string
	 */
	public String isOverride() {
		return override;
	}

	/**
	 * Sets the override.
	 *
	 * @param override
	 *            the new override
	 */
	public void setOverride(String override) {
		this.override = override;
	}

}
