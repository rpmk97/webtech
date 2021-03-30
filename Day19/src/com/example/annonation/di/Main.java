package com.example.annonation.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/annonation/di/appCxt.xml");
		System.out.println("IoC Container is started!!");

		CarService carService = applicationContext.getBean("carService", CarService.class);
		carService.displayDetails(100);

		applicationContext.close();
		System.out.println("IoC Container is stopped!!");

	}

}
