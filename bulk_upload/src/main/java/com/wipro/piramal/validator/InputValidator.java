package com.wipro.piramal.validator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.wipro.piramal.helper.ErrorResponse;

public class InputValidator implements ConstraintValidator<InputValid, String> {

	private Set<String> validDays;

	public boolean isValid(LocalDate localDate, ConstraintValidatorContext context) {
		return localDate != null && validDays.contains(localDate.getDayOfWeek());
	}

	@Override
	public void initialize(InputValid arg0) {
		validDays = Arrays.stream(arg0.days()).collect(Collectors.toSet());

	}

	@Override
	public boolean isValid(String input, ConstraintValidatorContext arg1) {

		System.out.println(" arg0 >> " + input);

		if (!validDays.contains(input))
			return false;
		return true;
	}

	List<ErrorResponse> errorResp = new ArrayList<ErrorResponse>();

	public List<ErrorResponse> getErrorDes(String input, Set<String> validDays) {
		ErrorResponse res = new ErrorResponse();
		res.setErrorId(input);
		res.setErrorMsg(validDays.toString());

		errorResp.add(res);
		return errorResp;

	}

}