package com.example.aspectj;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	public int diff(int arg1, int arg2) {
		return arg1 - arg2;
	}
}
