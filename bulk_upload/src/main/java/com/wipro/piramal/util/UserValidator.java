package com.wipro.piramal.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.wipro.piramal.vo.RequistionVo;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return RequistionVo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("$$$$$$$$$$$$$$$$$$$");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "identifier", "Eririrasiodfaosdfjadshfisdifsfbasdbfbjhbfajb");
		RequistionVo user = (RequistionVo) target;

	}

}