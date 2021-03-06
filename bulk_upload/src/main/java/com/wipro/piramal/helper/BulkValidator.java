package com.wipro.piramal.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.Configuration;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

@Service
public class BulkValidator {

	List<ErrorResponse> errorList = new ArrayList<ErrorResponse>();

	public List<ErrorResponse> validate(List list) {

		Validator validator = configValidator();

		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {

		
			Set<ConstraintViolation<Object>> violations = validator.validate(iterator.next());

			Iterator<ConstraintViolation<Object>> validateResult = violations.iterator();
			while (validateResult.hasNext()) {
				ConstraintViolation next = validateResult.next();
				// violations.forEach(v ->
				// System.out.println(v.getInvalidValue() + "-$$$$$$- " +
				// v.getMessage());
				errorList.add(new ErrorResponse(next.getInvalidValue().toString(), next.getMessage()));

			}
		}
		return errorList;

	}

	static Validator configValidator() {
		Configuration<?> config = Validation.byDefaultProvider().configure();
		ValidatorFactory factory = config.buildValidatorFactory();
		Validator validator = factory.getValidator();
		factory.close();
		return validator;
	}

}
