package com.example.exception;

public class MovieNameRequiredException extends Exception {

	public MovieNameRequiredException() {
	}

	public MovieNameRequiredException(String message) {
		super(message);
	}

}
