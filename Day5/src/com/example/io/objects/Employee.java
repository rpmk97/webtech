package com.example.io.objects;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	int age;
	transient double salary;
	String desig;
	String dept;

	public Employee() {
	}

	public Employee(String name, int age, double salary, String desig, String dept) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
	}

	public Employee(int id, String name, int age, double salary, String desig, String dept) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
