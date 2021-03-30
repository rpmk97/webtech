package com.example.lazy;

public class CalculatorService {

	public CalculatorService() {
		System.out.println("===== Inside CalculatorService() =====");
	}

	public void init() {
		System.out.println("===== Inside CalculatorService.init() =====");
	}

	public void clean() {
		System.out.println("===== Inside CalculatorService.clean() =====");
	}

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}
}
