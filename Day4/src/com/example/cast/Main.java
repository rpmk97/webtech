package com.example.cast;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		//UC1();
		//UC2();
		//UC3();
		UC4();
	}


	void UC4() {
		Dog dog = new Dog(); 
		Animal animal = dog;
		Dog dog1 = (Dog) animal;
		
		System.out.println(dog);
		System.out.println(animal);
		
		dog.eat();
		dog.bark();
		
		animal.eat();
		dog1.bark();
	}

	void UC3() {
		Animal animal = new Dog(); 
		System.out.println(animal);
	}
	
	void UC2() {
		
		Dog dog = (Dog) new Animal(); //Runtime Error will come
		System.out.println(dog);
	}
	
	void UC1() {
		
		int i = 10;
		long j = i; // Implicit Type Casting

		System.out.println(i);
		System.out.println(j);

		long x = 1000L;
		int y = (int) x; // Explicit Type Casting

		System.out.println(x);
		System.out.println(y);

		double a = 12000.00;
		int b = (int) a;

		System.out.println(a);
		System.out.println(b);

		char ch = 'R';
		int c = ch;

		System.out.println(ch);
		System.out.println(c);

	}

}
