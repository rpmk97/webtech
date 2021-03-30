package com.example.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/aop/appCxt.xml");
		System.out.println("IoC Container is started!!");

		PayrollService payrollService = applicationContext.getBean("payrollService",PayrollService.class);
	
		payrollService.calculateHRA(40000.00);
		payrollService.calculateDA(40000.00);
		payrollService.calculateTA(40000.00);
		payrollService.calculateTDS(40000.00);
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");

	}

}
