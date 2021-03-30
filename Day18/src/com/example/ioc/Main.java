package com.example.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		//IoC Container is started
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/example/ioc/appCxt.xml");
		System.out.println("IoC Container is started!!");
		
		CalculatorService calculatorService = (CalculatorService) applicationContext.getBean("calculatorService");
		int rs  = calculatorService.sum(2, 2);
		System.out.printf("Result : %s%n",rs);
	
		PersonalDetailService personalDetailService = (PersonalDetailService) applicationContext.getBean("personalDetailService");

		personalDetailService.info("Raju", "98111010100");
		personalDetailService.info("Monu", "98111010111");

		
		
		//IoC Container is stopped
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
		
		/*CalculatorService calculatorService = new CalculatorService();
		int rs  = calculatorService.sum(2, 2);
		System.out.printf("Result : %s%n",rs);*/
	}

}
