package com.example.object;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		// UC1();
		// UC2();
		// UC3();
		// UC4();
		// UC5();
		UC6();
	}

	void UC6() {

		Course course1 = new Course("Spring", 24);
		Course course2 = new Course("Spring", 24);

		System.out.println(course1.hashCode() == course2.hashCode());
		System.out.println(course1 == course2);
		System.out.println(course1.equals(course2));
	}

	void UC5() {

		Course course = new Course("JSP", 8);
		System.out.println(course.hashCode());
		System.out.println(course.toString());

		int hash = course.hashCode();
		System.out.println(Integer.toHexString(hash));
		System.out.println(course.getClass() + "@" + Integer.toHexString(hash));

	}

	void UC4() {

		Course course1 = new Course("JSP", 8);
		Course course2 = new Course("JSP", 8);

		System.out.println(course1.hashCode());
		System.out.println(course2.hashCode());

		System.out.printf("Same Content : %s%n", (course1.hashCode() == course2.hashCode()));
		System.out.printf("Same Object : %s%n", (course1 == course2));

		System.out.printf("Object1 Hexa : %s%n", course1);
		System.out.printf("Object2 Hexa: %s%n", course2);
	}

	void UC3() {
		Course course = new Course("JSP", 8);

		System.out.println(course.toString());
		System.out.println(course);
	}

	void UC2() {
		Course course = new Course();
		System.out.println(course.toString());
		System.out.println(course);
	}

	void UC1() {
		Course course = new Course();

		course.toString();
		course.hashCode();
		course.equals(null);

		Object obj = new Course();
	}
}
