package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;

	public List<Employee> listAll() {
		System.out.println("==== Inside EmployeeService.listAll() ===== ");
		return employeeDAO.selectAll();
	}

}
