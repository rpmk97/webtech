package com.example.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/lifecycle/appCxt.xml");
		System.out.println("IoC Container is started!!");

		HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
		GreetService greetService = applicationContext.getBean("greetService", GreetService.class);
			
		//helloService.hello("Raju");
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");

	}

}
