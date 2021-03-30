package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	int employeeId;
	String name;
	double salary;
	String desig;
	String dept;
	String email;
	String phone;

	public Employee() {
	}

	public Employee(String name, double salary, String desig, String dept, String email, String phone) {
		this.name = name;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
		this.email = email;
		this.phone = phone;
	}

	public Employee(int employeeId, String name, double salary, String desig, String dept, String email, String phone) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
		this.email = email;
		this.phone = phone;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
