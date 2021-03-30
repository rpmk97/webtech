package com.example.bean.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/bean/factory/appCxt.xml");
		System.out.println("IoC Container is started!!");
		
		Car car = applicationContext.getBean("car",Car.class);
		System.out.println(car);	
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

}
