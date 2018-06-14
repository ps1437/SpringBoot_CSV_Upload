package com.wipro.piramal.validator;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DaysOfWeekValidator implements ConstraintValidator<DaysOfWeek, String> {

	private Set<String> validDays;

	public boolean isValid(LocalDate localDate, ConstraintValidatorContext context) {
		return localDate != null && validDays.contains(localDate.getDayOfWeek());
	}

	@Override
	public void initialize(DaysOfWeek arg0) {
		validDays = Arrays.stream(arg0.days()).collect(Collectors.toSet());
		System.out.println(" > < validDays >> " + validDays);

	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {

		System.out.println(" arg0 >> " + arg0);
		return false;
	}

}