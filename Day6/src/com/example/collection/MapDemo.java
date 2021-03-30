package com.example.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		new MapDemo();
	}

	public MapDemo() {
		// UC1();
		// UC2();
		// UC3();
		UC4();
	}

	private void UC4() {

		// Map<Integer, String> employees = new HashMap<>();
		Map<Integer, String> employees = new TreeMap<>();

		employees.put(104, "Jaggu");
		employees.put(101, "Jaggu");
		employees.put(103, "Chandu");
		employees.put(102, "Pintu");

		Set<Entry<Integer, String>> entries = employees.entrySet();

		System.out.println(entries);

		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

	private void UC3() {

		Map<Integer, String> employees = new HashMap<>();

		employees.put(101, "Jaggu");
		employees.put(102, "Pintu");
		employees.put(103, "Chandu");
		employees.put(104, "Jaggu");

		Collection<String> names = employees.values();

		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
			System.out.println(name.toUpperCase());
			System.out.println(name.toLowerCase());
		}
	}

	private void UC2() {

		Map<Integer, String> employees = new HashMap<>();

		employees.put(101, "Jaggu");
		employees.put(102, "Pintu");
		employees.put(103, "Chandu");
		employees.put(104, "Ghanshu");
		employees.put(102, "Raju");

		Set<Integer> keys = employees.keySet();

		System.out.printf("Keys : %s%n", keys);

		for (Integer key : keys) {
			System.out.println(key);
			System.out.println(employees.get(key));
		}
	}

	private void UC1() {

		Map<Integer, String> employees = new HashMap<>();

		employees.put(101, "Jaggu");
		employees.put(102, "Pintu");
		employees.put(103, "Chandu");
		employees.put(104, "Ghanshu");
		employees.put(102, "Raju");

		System.out.printf("Size : %s%n", employees.size());
		System.out.printf("Elements : %s%n", employees);

		String name = employees.get(103);
		System.out.println(name);

		employees.remove(103);

		System.out.printf("Size : %s%n", employees.size());
		System.out.printf("Elements : %s%n", employees);

		System.out.println(employees.containsKey(102));
		System.out.println(employees.containsValue("Raju"));
	}
}
