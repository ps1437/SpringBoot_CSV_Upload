package com.wipro.piramal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Praveen $oni
 * @category Main
 */
@SpringBootApplication
@PropertySource(value = "ValidationMessages.properties", ignoreResourceNotFound = true)
public class BulkUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkUploadApplication.class, args);
	}

}
