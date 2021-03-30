package com.example.property;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/property/appCxt.xml");
		System.out.println("IoC Container is started!!");

		GreetService greetService = applicationContext.getBean("greetService", GreetService.class);
	
		greetService.info();
		greetService.greet("Raju");
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");

	}

}
