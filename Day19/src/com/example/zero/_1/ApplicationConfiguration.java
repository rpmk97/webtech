package com.example.zero._1;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
		ClassPathResource classPathResource1 = new ClassPathResource("com/example/zero/app.properties");
		ClassPathResource classPathResource2 = new ClassPathResource("com/example/zero/jdbc.properties");
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		//configurer.setLocation(classPathResource);
		configurer.setLocations(classPathResource1,classPathResource2);
		return configurer;
	}

	@Bean
	@Lazy
	public GreetService greetService() {
		return new GreetService();
	}

	// @Bean(initMethod="init",destroyMethod="clean")
	@Bean
	// @Scope("prototype")
	public CalculatorService calculatorService() {
		return new CalculatorService();
	}
	
	@Bean
	public CarDAO carDAO() {
		return new CarDAO();
	}
}
