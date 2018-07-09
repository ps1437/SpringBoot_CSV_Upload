package com.wipro.piramal.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateFormateValidator implements ConstraintValidator<DateFomatter, String> {
	boolean nullable;
	String pattern = "";

	@Override
	public void initialize(DateFomatter input) {

		nullable = input.nullable();
		pattern = input.pattern();
	}

	@Override
	public boolean isValid(String enteredDate, ConstraintValidatorContext context) {

		System.out.println(" enteredDate L: " + enteredDate);

		if (null == enteredDate && nullable) {
			return true;
		} else if (null != enteredDate && nullable || !nullable) {

			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			sdf.setLenient(false);
			try {
				sdf.parse(enteredDate);

			} catch (ParseException e) {
				System.out.println(sdf + " is Invalid Date format");
				return false;
			}
			return true;
		}

		return true;
	}

}
