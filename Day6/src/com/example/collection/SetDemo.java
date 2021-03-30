package com.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		new SetDemo();
	}

	public SetDemo() {
		//UC1();
		UC2();
	}
	
	
	private void UC2() {
		
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(600);
		numbers.add(300);
		numbers.add(500);
		numbers.add(700);
		numbers.add(100);
		numbers.add(800);
		numbers.add(900);
		numbers.add(670);
	
		System.out.printf("Size : %s%n", numbers.size());
		System.out.printf("Elements : %s%n", numbers);
	}


	private void UC1() {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(600);
		numbers.add(300);
		numbers.add(500);
		numbers.add(700);
		numbers.add(100);
		numbers.add(800);
		numbers.add(900);
		numbers.add(670);
		
		numbers.remove(800);
	
		System.out.printf("Size : %s%n", numbers.size());
		System.out.printf("Elements : %s%n", numbers);
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() /10);
		}
		
		System.out.println(numbers.isEmpty());
		
		System.out.println(numbers.contains(100));
		
		numbers.clear();
		
		System.out.printf("Size : %s%n", numbers.size());
		System.out.printf("Elements : %s%n", numbers);
	}
}
