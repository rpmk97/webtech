package com.example.annonation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//UC1();
		//UC2();
		//UC3();
		UC4();
	}
	
	private static void UC4() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/annonation/appCxt.xml");
		System.out.println("IoC Container is started!!");
	
		CalculatorService calculatorService = applicationContext.getBean("calculatorService", CalculatorService.class);
		System.out.println(calculatorService.sum(2, 2));
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

	private static void UC3() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/annonation/appCxt.xml");
		System.out.println("IoC Container is started!!");

		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}


	private static void UC2() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/annonation/appCxt.xml");
		System.out.println("IoC Container is started!!");

		GreetService greetService1 = applicationContext.getBean("greetService", GreetService.class);
		System.out.println(greetService1);
		
		GreetService greetService2 = applicationContext.getBean("greetService", GreetService.class);
		System.out.println(greetService2);

		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

	private static void UC1() {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/annonation/appCxt.xml");
		System.out.println("IoC Container is started!!");

		GreetService greetService = applicationContext.getBean("greetService", GreetService.class);
		greetService.greet("Raju");
	
		CalculatorService calculatorService = applicationContext.getBean("calculatorService", CalculatorService.class);
		System.out.println(calculatorService.sum(2, 2));
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

}
