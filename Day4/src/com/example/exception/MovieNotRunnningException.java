package com.example.exception;

public class MovieNotRunnningException extends RuntimeException {

	public MovieNotRunnningException() {
	}

	public MovieNotRunnningException(String message) {
		super(message);
	}
	
}
