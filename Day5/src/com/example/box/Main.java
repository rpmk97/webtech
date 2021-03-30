package com.example.box;

public class Main {

	public static void main(String[] args) {
	
		int i = 10;
		Integer it = new Integer(i); //Explicit Boxing/Wrapping
		
		System.out.println(i);
		System.out.println(it);
		
		int j = it.intValue(); //Explicit Unboxing/Unwrapping
		System.out.println(j);
		
		//Java 5
		int a = 20000;
		Integer b = a; //Implicit/auto Boxing/Wrapping
		
		System.out.println(b.getClass());
		System.out.println(b.hashCode());
		System.out.println(b instanceof Integer);
		
		Integer y = new Integer(490000);
		int value = y; //Implicit/Auto Unboxing/Unwrapping
	}
	
	
}
