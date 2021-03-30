package com.example.exception;

//Developer 1 -- has designed the functionality for other developers
public class CinemaService {

	public void watchMovie(String movieName,int age) throws InvalidAgeException,MovieNameRequiredException {
		if (movieName == null) {
			throw new MovieNameRequiredException("Movie name is required");
		}
		if (!(movieName.equals("Bahubali") || movieName.equals("KGF"))) {
			throw new MovieNotRunnningException("Movie "+movieName+" is not currently running in the cinema");
		}
		if (age < 10) {
			throw new InvalidAgeException("Go Home, You are not allowed coz your age is " + age);
		}
		System.out.printf("Enjoy the movie as You are %s yrs old.%n", age);
	}

}
