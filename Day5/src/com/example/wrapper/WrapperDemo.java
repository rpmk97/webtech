package com.example.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
	
		int i = 10;
		Integer it = new Integer(i); //Explicit Boxing/Wrapping
		
		System.out.println(i);
		System.out.println(it);
		
		int j = it.intValue(); //Explicit Unboxing/Unwrapping
		System.out.println(j);
		
		
		char ch = 'T';
		Character character = new Character(ch);
		
		System.out.println(ch);
		System.out.println(character);
		
		char val = character.charValue();
		System.out.println(val);
		
	}
	
	
}
