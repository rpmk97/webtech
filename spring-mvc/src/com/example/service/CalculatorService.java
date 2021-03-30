package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int doSum(int arg1, int arg2) {
		System.out.println("===== CalculatorService.doSum(int arg1, int arg2) =====");
		return arg1 + arg2;
	}

	public int doDiff(int arg1, int arg2) {
		System.out.println("===== CalculatorService.doDiff(int arg1, int arg2) =====");
		return arg1 - arg2;
	}

}
