package com.wipro.piramal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BulkUploadApplication   /*implements CommandLineRunner*/{
/*
	@Autowired
   public BulkSendMail mailSender;
*/	
	public static void main(String[] args) {
		SpringApplication.run(BulkUploadApplication.class, args);
	}
	/*@Override
	public void run(String... arg0) throws Exception {
		
		String from = "praveen3689soni@gmail.com";
		String to = "praveen3689sony@gmail.com";
		String subject = "JavaMailSender";
		String body = "Just-Testing!";
		
		mailSender.sendMail(from, to, subject, body);
	}*/
}
