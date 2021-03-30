package com.example.exception;

public class DataAccessException extends Exception {

	public DataAccessException() {
	}
	
	public DataAccessException(String message) {
		super(message);
	}
}
