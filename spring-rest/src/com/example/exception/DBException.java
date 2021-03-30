package com.example.exception;

public class DBException extends Exception {

	public DBException() {
	}
	
	public DBException(String message) {
		super(message);
	}
}
