package com.example.zero._1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);
		System.out.println("IoC Container is started!!");

		GreetService greetService = applicationContext.getBean("greetService", GreetService.class);
		greetService.greet("Raju");

		CalculatorService calculatorService = applicationContext.getBean("calculatorService", CalculatorService.class);
		System.out.println(calculatorService.sum(2, 2));

		CarDAO carDAO = applicationContext.getBean(CarDAO.class);
		carDAO.dbInfo();
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

}
