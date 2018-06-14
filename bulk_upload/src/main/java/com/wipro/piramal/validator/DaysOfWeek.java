package com.wipro.piramal.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.DayOfWeek;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DaysOfWeekValidator.class)
public @interface DaysOfWeek {
    String message() default "Hiee";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
 
    String[] days();
}