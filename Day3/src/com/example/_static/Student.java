package com.example._static;

public class Student {

	String name;
	int hindi;
	int english;
	static int maxMarks = 200;

	public Student() {
	}

	public Student(String name, int hindi, int english) {
		this.name = name;
		this.hindi = hindi;
		this.english = english;
	}

	void details() {
		System.out.printf("Name : %s%n", this.name);
		System.out.printf("Hindi : %s%n", this.hindi);
		System.out.printf("English : %s%n", this.english);
		System.out.printf("Max Marks : %s%n", this.maxMarks);
		System.out.println("==================================");
	}

	static void calculateTotal(Student student) {
		//int total = student.hindi + student.english;
		int total = internalCalculate(student.hindi , student.english);
		System.out.printf("%s got Total Marks: %s/%s %n", student.name, total, maxMarks);
	}
	
	private static int internalCalculate(int hindi,int english) {
		return hindi + english;
	}

}
