package com.wipro.piramal.validator;

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

import com.wipro.piramal.exceptions.ErrorResponse;

/**
 * @author Praveen $oni
 */
@Service
public class BulkValidator {

	/**
	 * Validate.
	 *
	 * @param list
	 *            the list
	 * @return the list
	 */
	public List<ErrorResponse> validate(List list) {

		List<ErrorResponse> errorList = new ArrayList<ErrorResponse>();

		Validator validator = configValidator();

		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {

			Set<ConstraintViolation<Object>> violations = validator.validate(iterator.next());
			Iterator<ConstraintViolation<Object>> validateResult = violations.iterator();
			while (validateResult.hasNext()) {
				ConstraintViolation next = validateResult.next();
				errorList.add(new ErrorResponse(next.getInvalidValue().toString(), next.getMessage()));
			}
		}
		return errorList;

	}

	/**
	 * Config validator.
	 *
	 * @return the validator
	 */
	static Validator configValidator() {
		Configuration<?> config = Validation.byDefaultProvider().configure();
		ValidatorFactory factory = config.buildValidatorFactory();
		Validator validator = factory.getValidator();
		factory.close();
		return validator;
	}

}
