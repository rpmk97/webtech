package com.example.zero._1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class CalculatorService {
	
	@Value("${app.title}")
	String title;

	@PostConstruct
	public void init() {
		System.out.println("===== Inside CalculatorService.init() =====");
		System.out.printf("Title : %s%n",this.title);
	}

	@PreDestroy
	public void clean() {
		System.out.println("===== Inside CalculatorService.clean() =====");
	}

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}
}
