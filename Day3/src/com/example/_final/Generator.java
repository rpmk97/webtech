package com.example._final;

/**
 * 
 * @author Ritesh Tyagi
 * @version 1.0
 * 
 */
public class Generator {

	final String title = "Number Generator";

	final long generate() {
		return (long)(Math.random()*5000);
	}
}
