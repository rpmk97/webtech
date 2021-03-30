package com.example.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	
		time = System.nanoTime();
		System.out.println(time);
	
		//Old enough, do not use
		System.out.printf("Current Date : %s%n",new Date());
		
		//Latest API for Date
		LocalDate localDate = LocalDate.now();
		System.out.printf("Current Date : %s%n",localDate);
		localDate = LocalDate.of(2010, 04, 25);
		System.out.printf("Current Date : %s%n",localDate);
		localDate = LocalDate.ofYearDay(2015,240);
		System.out.printf("Current Date : %s%n",localDate);
		localDate = LocalDate.ofEpochDay(6252);
		System.out.printf("Current Date : %s%n",localDate);
		localDate = LocalDate.parse("2018-02-10");
		System.out.printf("Current Date : %s%n",localDate);
		
		
		LocalTime localTime = LocalTime.now();
		System.out.printf("Current Time : %s%n",localTime);
		localTime = LocalTime.of(11, 25);
		System.out.printf("Current Time : %s%n",localTime);
		localTime = LocalTime.of(11, 25,48);
		System.out.printf("Current Time : %s%n",localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.printf("Current Date & Time : %s%n",localDateTime);
		System.out.printf("Current Date : %s%n",localDateTime.toLocalDate());
		System.out.printf("Current Time : %s%n",localDateTime.toLocalTime());
	}
}
