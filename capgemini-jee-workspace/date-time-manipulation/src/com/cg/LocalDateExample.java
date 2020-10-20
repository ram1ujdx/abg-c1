package com.cg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate  date1=LocalDate.of(2010, 10, 20);
		LocalDate  date2=LocalDate.of(2010, 11, 25);
//		System.out.println(date1.isBefore(date2));
//		System.out.println(date);
//		date.getYear();
//		System.out.println(date.getMonthValue());
//		LocalDateTime time=LocalDateTime.of(2012, 12,20, 14, 0,10);
//		System.out.println(time);
		
//		Period timeInterval=date1.until(date2);
//		System.out.print(timeInterval.getYears()+" Years, ");
//		System.out.print(timeInterval.getMonths()+" Months, ");
//		System.out.println(timeInterval.getDays()+" Days, ");
		
//		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate formattedDate=LocalDate.parse("19/10/2020", format);
//		System.out.println(formattedDate);
		
		ZonedDateTime time=ZonedDateTime.now(ZoneId.of("Australia/Victoria"));
		System.out.println(time);

	}

}
