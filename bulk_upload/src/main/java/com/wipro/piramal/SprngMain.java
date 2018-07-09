package com.wipro.piramal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SprngMain {

	public static void main(String a[]) {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

			String format = sdf.format(new Date());
	
			System.out.println(" > >  "+format);
	}
}
