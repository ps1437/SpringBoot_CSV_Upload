package com.wipro.piramal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Contantss {
	@Value("${valid.reqtype}")
	public static String reqType;
}
