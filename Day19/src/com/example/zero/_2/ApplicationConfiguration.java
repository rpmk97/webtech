package com.example.zero._2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan(basePackages= "com.example.zero._2")
public class ApplicationConfiguration {

	@Bean
	public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		configurer.setLocations(
				new ClassPathResource("com/example/zero/_2/app.properties"),
				new ClassPathResource("com/example/zero/_2/jdbc.properties"));
		return configurer;
	}
	
	@Bean(destroyMethod="close")
	public FileWriter fileWriter() {
		String path = "C:\\hsbc-pune-workspace\\Day19\\logs\\access.log";
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(path,true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileWriter;
	}
	
	@Bean
	public List<String> colors() {
		List<String> list = Arrays.asList("Red","Green","Blue","Yellow");
		return list;
	}
	

}
