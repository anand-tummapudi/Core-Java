package com.anand.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String []args) {
		LocalDate ld = LocalDate.now();
		System.out.println("Local Date:"+ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println("Local Time:"+lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Local Date Time:"+ldt);
		
		LocalDate sdt = LocalDate.of(1993, 5, 21);
		System.out.println("Local Date with specified date:"+sdt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println("Formatted date in dd-MM-yyyy format:"+sdt.format(dtf));
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Zone Date Time:"+zdt);
		
		ZonedDateTime centralEastern = LocalDateTime.now().atZone(ZoneId.of("CET"));
		System.out.println("Central Time:"+centralEastern);
		
	}
}
