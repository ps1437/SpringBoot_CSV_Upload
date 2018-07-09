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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wipro.piramal.exceptions.ErrorResponse;
import com.wipro.piramal.service.BulkService;

/**
 * @author Praveen $oni
 */
@Service
public class BulkValidator {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(BulkValidator.class);
	/**
	 * Validate.
	 *
	 * @param list
	 *            the list
	 * @return the list
	 */
	public List<ErrorResponse> validate(List list) {

		LOGGER.info(" BulkValidator.validate() : Validating list ");
		
		
		List<ErrorResponse> errorList = new ArrayList<ErrorResponse>();

		Validator validator = configValidator();

		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {

			Set<ConstraintViolation<Object>> violations = validator.validate(iterator.next());
			Iterator<ConstraintViolation<Object>> validateResult = violations.iterator();
			while (validateResult.hasNext()) {
				LOGGER.info(" BulkValidator.validate() : List having error ..... ");
				
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
		
		LOGGER.info(" BulkValidator.configValidator() : Configuring validator ..... ");
		Configuration<?> config = Validation.byDefaultProvider().configure();
		ValidatorFactory factory = config.buildValidatorFactory();
		Validator validator = factory.getValidator();
		factory.close();
		return validator;
	}

}
