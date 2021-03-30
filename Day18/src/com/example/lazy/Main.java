package com.example.lazy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/lazy/appCxt.xml");
		System.out.println("IoC Container is started!!");

		/*CalculatorService calculatorService1 =  applicationContext.getBean("calculatorService",CalculatorService.class);
		System.out.println(calculatorService1);

		CalculatorService calculatorService2 =  applicationContext.getBean("calculatorService",CalculatorService.class);
		System.out.println(calculatorService2);
		*/
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

}
