package com.anand.java.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTimeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println("Current date:"+date);
		LocalTime time = LocalTime.now();
		System.out.println("Current time:"+time);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfWeek());
		
		System.out.println("Calculate Age");
		
		LocalDate bdt = LocalDate.of(1983,5,22);
		LocalDate td = LocalDate.now();
		Period p = Period.between(bdt, td);
		System.out.println("Age is:"+p.getYears()+"Years - "+p.getMonths()+"Months and "+p.getDays()+"Days");
		
		Year y = Year.of(2018);
		System.out.println("Year:"+y+" is "+(y.isLeap()?" Leap Year":"not Leap Year"));
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("current timezone"+zone);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
	}

}
