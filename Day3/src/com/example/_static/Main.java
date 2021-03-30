package com.example._static;

public class Main {
	
	public static void main(String[] args) {
				
		//System.out.println(Student.maxMarks);
		
		
		Student s1 = new Student("Roti",80,60);
		Student s2 = new Student("Dal",50,40);
		Student s3 = new Student("Chicken",50,90);
		Student s4 = new Student("Mutton",10,20);
		

		Student.calculateTotal(s1);
		Student.calculateTotal(s2);
		Student.calculateTotal(s3);
		Student.calculateTotal(s4);
		
		
		/*		
		System.out.println(s1.name);
		
		System.out.println(s1.maxMarks);
	
		System.out.println(s2.name);
		System.out.println(s2.maxMarks);
		
		System.out.println(Student.maxMarks);
		
		Student.maxMarks = 500;
		
		System.out.println(s1.name);
		System.out.println(s1.maxMarks);
	
		System.out.println(s2.name);
		System.out.println(s2.maxMarks);
		
		s1.maxMarks = 1000;
		
		System.out.println(Student.maxMarks);
		System.out.println(s1.maxMarks);
		System.out.println(s2.maxMarks);*/
	
	
		//s1.details();
		//s2.details();
		//s3.details();
		//s4.details();
		
	}

}
