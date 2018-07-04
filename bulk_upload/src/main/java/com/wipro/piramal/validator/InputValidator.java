package com.wipro.piramal.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.wipro.piramal.exceptions.ErrorResponse;

/**
 * @author Praveen $oni
 *
 */
public class InputValidator implements ConstraintValidator<ValidInput, String> {

	/** The expected values. */
	private String expectedValues;

	private boolean nullable;

	@Override
	public void initialize(ValidInput input) {
		expectedValues = input.expectedValue();
		nullable = input.nullable();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object,
	 * javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(String input, ConstraintValidatorContext arg1) {
		System.out.println("  input  : " + input);

		if (!nullable) {
			for (String value : expectedValues.split(",")) {
				System.out.println(">>> value <<<<" + value);
				if (input.equals(value)) {
					return true;
				}
			}
			return false;
		}
		return true;
	}

	/** The error resp. */
	List<ErrorResponse> errorResp = new ArrayList<ErrorResponse>();

	/**
	 * Gets the error des.
	 *
	 * @param input
	 *            the input
	 * @param validDays
	 *            the valid days
	 * @return the error des
	 */
	public List<ErrorResponse> getErrorDes(String input, Set<String> validDays) {
		ErrorResponse res = new ErrorResponse();
		res.setErrorId(input);
		res.setErrorMsg(validDays.toString());
		errorResp.add(res);
		return errorResp;

	}

}