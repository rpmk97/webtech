package com.example.aspectj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/aspectj/appCxt.xml");
		System.out.println("IoC Container is started!!");

		PayrollService payrollService = applicationContext.getBean("payrollService", PayrollService.class);
		GreetService greetService = applicationContext.getBean("greetService", GreetService.class);
		CalculatorService calculatorService = applicationContext.getBean("calculatorService", CalculatorService.class);

		payrollService.calculateHRA(40000.00);
		payrollService.calculateDA(40000.00);
		payrollService.calculateTA(40000.00);
		payrollService.calculateTDS(40000.00);
		
		greetService.greet("Raju");
		
		System.out.println(calculatorService.sum(2, 2));
		System.out.println(calculatorService.diff(2, 2));
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");

	}

}
