package com.wipro.piramal;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Praveen $oni
 * 
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.boot.web.servlet.support.SpringBootServletInitializer
	 * #configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BulkUploadApplication.class);
	}

}
