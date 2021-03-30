package com.example.service;

/**
 * @author Ritesh Tyagi
 * @since 1.0 This service class is used for doing calculations of numeric data
 *        and having total two functionalities only.
 */
public class CalculatorService {

	/**
	 * @author Ritesh Tyagi
	 * @since 1.0
	 * @param arg1
	 *            will carry number to be use in sum
	 * @param arg2
	 *            will carry number to be use in sum
	 * @return will return result of type int
	 */
	public int doSum(int arg1, int arg2) {
		System.out.println("===== Inside CalculatorService.doSum() =====");
		return arg1 + arg2;
	}

	public int doDiff(int arg1, int arg2) {
		System.out.println("===== Inside CalculatorService.doDiff() =====");
		return arg1 - arg2;
	}

	public int doMultiply(int arg1, int arg2) {
		System.out.println("===== Inside CalculatorService.doMultiply() =====");
		return arg1 * arg2;
	}

	public int doDivide(int arg1, int arg2) {
		System.out.println("===== Inside CalculatorService.doDivide() =====");
		return arg1 / arg2;
	}

}
