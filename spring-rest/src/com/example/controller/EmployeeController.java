package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.DBException;
import com.example.exception.DataAccessException;
import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = { MediaType.TEXT_PLAIN_VALUE})
	public String addOneEmployee(@RequestBody Employee employee) {
		System.out.println("=====  EmployeeController.addOneEmployee(Employee employee) =====");
		try {
			employeeService.addEmployee(employee);
			return "Employee data saveed properly!!";
		} catch (DBException e) {
			e.printStackTrace();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return "";
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public Employee readOneEmployee(@PathVariable("id") int eid) {
		System.out.println("=====  EmployeeController.readOneEmployee(int eid) =====");
		Employee employee = new Employee();
		try {
			employee = employeeService.readEmployeeById(eid);
		} catch (DBException e) {
			e.printStackTrace();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Employee> readAllEmployees() {
		System.out.println("=====  EmployeeController.readAllEmployees() =====");
		List<Employee> employees = new ArrayList<>();
		try {
			employees = employeeService.listAll();
		} catch (DBException e) {
			e.printStackTrace();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return employees;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = { "text/xml", "text/json",
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public Employee readEmployeeData() {
		System.out.println("=====  EmployeeController.readEmployeeData() =====");
		return new Employee(100, "Raj", 10000.00, "Jr Developer", "GBM", "raj@hsbc.in", "9811010100");
	}

	/*
	 * @RequestMapping(value= "/employee", method = RequestMethod.GET, produces = {
	 * "text/xml", MediaType.APPLICATION_XML_VALUE }) public Employee
	 * readEmployeeDataAsXML() {
	 * System.out.println("=====  EmployeeController.readEmployeeDataAsXML() ====="
	 * ); return new Employee(100, "Raj", 10000.00, "Jr Developer", "GBM",
	 * "raj@hsbc.in", "9811010100"); }
	 * 
	 * @RequestMapping(value = "/employee", method = RequestMethod.GET, produces = {
	 * "text/json", MediaType.APPLICATION_JSON_VALUE }) public Employee
	 * readEmployeeDataAsJSON() {
	 * System.out.println("=====  EmployeeController.readEmployeeDataAsJSON() ====="
	 * ); return new Employee(100, "Raj", 10000.00, "Jr Developer", "GBM",
	 * "raj@hsbc.in", "9811010100"); }
	 */

}
