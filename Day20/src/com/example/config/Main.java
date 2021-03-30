package com.example.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.EmployeeService;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/config/appCxt.xml");
		System.out.println("IoC Container is started!!");

		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		System.out.println(employeeService.listAll());
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");

	}

}
