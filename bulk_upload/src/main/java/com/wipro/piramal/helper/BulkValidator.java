package com.wipro.piramal.helper;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.Configuration;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.wipro.piramal.vo.RequistionVo;

@Service
public class BulkValidator {

	public void validate(List<RequistionVo> list) {
		Configuration<?> config = Validation.byDefaultProvider().configure();
		ValidatorFactory factory = config.buildValidatorFactory();
		Validator validator = factory.getValidator();
		factory.close();

		System.out.println(">>>>>>>");
		Iterator<RequistionVo> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println("<<<<<<<<<<<>>>>>>");
			RequistionVo reqVo = iterator.next();
			Set<ConstraintViolation< RequistionVo>> violations = validator.validate( reqVo);
			System.out.println(violations.size() + " P:< > ");
			violations.forEach(v -> System.out.println(v.getPropertyPath() + "-$$$$$$- " + v.getMessage()));
		}

		

	}

}
