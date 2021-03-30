package com.example.annonation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

	public CalculatorService() {
		System.out.println("===== Inside CalculatorService() =====");
	}

	@PostConstruct
	public void init() {
		System.out.println("===== Inside CalculatorService.init() =====");
	}

	@PreDestroy
	public void clean() {
		System.out.println("===== Inside CalculatorService.clean() =====");
	}

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}
}
