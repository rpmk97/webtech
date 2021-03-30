package com.example.exception;

public class Main {

	public static void main(String[] args) {

		new Main();
	}

	public Main() {
		// UC1();
		UC2();
	}

	// Developer 2
	void UC2() {

		CinemaService cinemaService = new CinemaService();

		try {

			int i = 10 / 5;

			cinemaService.watchMovie("KGF", 34);
			System.out.println("Finished the movie!!!!!");
		} catch (InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		} catch (MovieNameRequiredException ex) {
			System.out.println(ex.getMessage());
		} 
	}

	void UC1() {
		try {

			// file open
			CourseService courseService = null;
			// courseService.details();

			int[] numbers = { 23, 5, 23, 30, 44, 90 };
			System.out.println(numbers[2]);

			int i = 10;
			int j = 0;
			int rs = i / j;
			System.out.printf("Result : %s%n", rs);
			// file close
			System.out.println("Done!!!!");
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException handled!!!!!");
			System.out.println(ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException handled!!!!!");
			System.out.println(ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException handled!!!!!");
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Exception handled!!!!!");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("I am the boss!!!!");
		}

	}

}
