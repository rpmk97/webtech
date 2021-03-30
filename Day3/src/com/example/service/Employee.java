package com.example.service;

import com.example.model.Person;

public class Employee extends Person {

	int id = 1001;
	double salary = 500000.00;
	
	public void info() {
		System.out.printf("UID : %s%n",this.uid);
		System.out.printf("Name : %s%n",this.name);
	}
}
