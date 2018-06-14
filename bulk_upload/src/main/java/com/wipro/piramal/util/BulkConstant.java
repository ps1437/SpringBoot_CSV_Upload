package com.wipro.piramal.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/*
@PropertySource("classpath:valdiation.properties")
@ConfigurationProperties(prefix = "valid")*/
@Component
public class BulkConstant {
	public static String reqtype ;
	
}
