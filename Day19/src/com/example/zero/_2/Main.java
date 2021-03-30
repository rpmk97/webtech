package com.example.zero._2;

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

		CarService carService = applicationContext.getBean(CarService.class);
		carService.displayDetails(200);
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

}
