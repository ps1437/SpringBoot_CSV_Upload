package com.wipro.piramal.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberValidator implements ConstraintValidator<NotNullNumberFormat, Long> {
	private boolean nullable;

	@Override
	public void initialize(NotNullNumberFormat input) {
		nullable = input.nullable();

	}

	@Override
	public boolean isValid(Long value, ConstraintValidatorContext context) {

		if (nullable && null == value) {
			return true;
		} else if (!nullable || null != value && nullable) {
			return isNumeric(String.valueOf(value));
		}

		return true;
	}

	public static boolean isNumeric(String string) {
		return string.matches("\\d+");
	}

}
