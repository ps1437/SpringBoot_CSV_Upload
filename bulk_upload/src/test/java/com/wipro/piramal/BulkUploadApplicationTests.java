package com.wipro.piramal;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BulkUploadApplicationTests {

	@Test
	public void contextLoads() {
		
		ArrayList list = new ArrayList();

		for (int i = 0; i < 10; i++) {
			list.add(i);

		}

		long count = list.stream().count();
	}

}
