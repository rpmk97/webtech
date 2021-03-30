package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		new ListDemo();
	}

	public ListDemo() {
		 UC1();
		// UC2();
		// UC3();
		// UC4();
		// UC5();
		// UC6();
		// UC7();
		// UC8();
		// UC9();
		// UC10();
		// UC11();
		// UC12();
		//UC13();
	}

	private void UC13() {
		List<Double> employeeSalaries = new LinkedList<Double>();
		employeeSalaries.add(200000.00);
		employeeSalaries.add(120000.00);
		employeeSalaries.add(450000.00);
		employeeSalaries.add(340000.00);
		employeeSalaries.add(70000.00);
		employeeSalaries.add(340000.00);

		employeeSalaries.set(3, 3400000.00);
		
		employeeSalaries.remove(5);
		
		double value = employeeSalaries.get(2);
		
		for(double salary : employeeSalaries) {
			System.out.println(salary+(salary*.40));
		}
		
	}

	// Iterating elements from Generic Type collection
	// Java 5
	private void UC12() {
		List<Double> employeeSalaries = new ArrayList<Double>(10);
		employeeSalaries.add(new Double(200000.00));
		employeeSalaries.add(200000.00);
		employeeSalaries.add(500000.00);
		employeeSalaries.add(700000.00);

		Iterator<Double> iterator = employeeSalaries.iterator();
		while (iterator.hasNext()) {
			// Double ref = iterator.next();
			// System.out.println(ref.doubleValue() / 20.0);
			System.out.println(iterator.next() / 20.0);
		}

		/*
		 * for (double value : employeeSalaries) { System.out.println(value * 2.0); }
		 */

		/*
		 * for (Double element : employeeSalaries) { System.out.println(element);
		 * System.out.println(element.doubleValue() * 2.0); }
		 */

	}

	// Reading elements from Generic Type collection
	// Java 5
	private void UC11() {
		List<Double> employeeSalaries = new ArrayList<Double>(10);
		employeeSalaries.add(new Double(200000.00));
		employeeSalaries.add(200000.00);
		employeeSalaries.add(500000.00);
		employeeSalaries.add(700000.00);

		System.out.printf("Size : %s%n", employeeSalaries.size());

		Double ref = employeeSalaries.get(2);
		System.out.println(ref.doubleValue() * 10.00);

		double value = employeeSalaries.get(2);
		System.out.println(value * 10.00);

	}

	// Adding elements using Generic Type
	// Java 5
	private void UC10() {
		List<Double> employeeSalaries = new ArrayList<Double>(10);
		employeeSalaries.add(new Double(200000.00));
		employeeSalaries.add(200000.00);
		employeeSalaries.add(500000.00);
		employeeSalaries.add(700000.00);

		System.out.printf("Size : %s%n", employeeSalaries.size());
		System.out.printf("Elements : %s%n", employeeSalaries);
	}

	// Reading elements
	private void UC9() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(40);
		list.add(800.00);
		list.add(500.00F);
		list.add(true);

		Float value = (Float) list.get(3);
		System.out.println(value.floatValue() / 20.00);

		float val = (Float) list.get(3);
		System.out.println(val / 20.00);

	}

	// Adding elements
	private void UC8() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(40);
		list.add(800.00);
		list.add(500.00F);
		list.add(true);

		System.out.printf("Size : %s%n", list.size());
		System.out.printf("Elements : %s%n", list);
	}

	// Iterating elements
	// Java 5
	private void UC7() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(new Integer(200));
		list.add(new Double(4000.00));
		list.add(new Float(2000.00F));
		list.add(new Integer(200));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new Car());

		for (Object obj : list) {
			System.out.println(obj);
		}

	}

	// Iterating elements
	private void UC6() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(new Integer(200));
		list.add(new Double(4000.00));
		list.add(new Float(2000.00F));
		list.add(new Integer(200));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new Car());

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}

	}

	// Iterating elements
	private void UC5() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(new Integer(200));
		list.add(new Double(4000.00));
		list.add(new Float(2000.00F));
		list.add(new Integer(200));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new Car());

		/*
		 * for (int idx = 0; idx < list.size(); idx++) { Object obj = list.get(idx);
		 * System.out.println(obj); }
		 */

		for (int idx = 0; idx < list.size(); idx++) {
			Object obj = list.get(idx);
			if (obj instanceof Integer) {
				Integer ref = (Integer) obj;
				System.out.println(ref.intValue() + 1000);
			}
			if (obj instanceof Float) {
				Float ref = (Float) obj;
				System.out.println(ref.floatValue() + 1000.00F);
			}
			if (obj instanceof Double) {
				Double ref = (Double) obj;
				System.out.println(ref.doubleValue() + 1000.00);
			}
		}

	}

	// Removing elements
	private void UC4() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(new Integer(200));
		list.add(new Double(4000.00));
		list.add(new Float(2000.00F));
		list.add(new Integer(200));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new Car());

		System.out.printf("Size : %s%n", list.size());
		System.out.printf("Elements : %s%n", list);

		// list.remove(4);
		list.remove(new String("Hi"));

		System.out.printf("Size : %s%n", list.size());
		System.out.printf("Elements : %s%n", list);
	}

	// Updating elements
	private void UC3() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(new Integer(200));
		list.add(new Double(4000.00));
		list.add(new Float(2000.00F));
		list.add(new Integer(200));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new Car());

		System.out.printf("Size : %s%n", list.size());
		System.out.printf("Elements : %s%n", list);

		list.set(4, new String("Helloooooo"));

		System.out.printf("Elements : %s%n", list);
	}

	// Reading elements
	private void UC2() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(new Integer(200));
		list.add(new Double(4000.00));
		list.add(new Float(2000.00F));
		list.add(new Integer(200));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new Car());

		System.out.printf("Size : %s%n", list.size());
		System.out.printf("Elements : %s%n", list);

		Object element = list.get(4);
		System.out.println(element);

		Integer ref = (Integer) element;
		System.out.println(ref.intValue() + 10);
	}

	// Adding elements
	private void UC1() {
		List list = new ArrayList(10);
		int i = 100;
		Integer it = new Integer(i);
		list.add(it);
		list.add(new Integer(200));
		list.add(new Double(4000.00));
		list.add(new Float(2000.00F));
		list.add(new Integer(200));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new Car());
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new String("Hi"));
		list.add(new Boolean(true));
		list.add(new String("Hi"));
		list.add(new Boolean(true));

		System.out.printf("Size : %s%n", list.size());
		System.out.printf("Elements : %s%n", list);
	}
}
