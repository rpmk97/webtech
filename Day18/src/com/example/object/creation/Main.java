package com.example.object.creation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/object/creation/appCxt.xml");
		System.out.println("IoC Container is started!!");

		//Developer 1
		CalculatorService calculatorService1 =  applicationContext.getBean("calculatorService",CalculatorService.class);
		System.out.println(calculatorService1);

		//Developer 2
		CalculatorService calculatorService2 =  applicationContext.getBean("calculatorService",CalculatorService.class);
		System.out.println(calculatorService2);

		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

}
