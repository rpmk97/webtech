package com.example.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);
		System.out.println("IoC Container is started!!");
	
		GraphicsService graphicsService = applicationContext.getBean(GraphicsService.class);
		graphicsService.info();
		
		applicationContext.close();
		System.out.println("IoC Container is stopped!!");
	}

}
