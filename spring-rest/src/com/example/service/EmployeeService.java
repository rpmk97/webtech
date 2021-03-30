package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.exception.DBException;
import com.example.exception.DataAccessException;
import com.example.model.Employee;
import com.example.util.DBUtil;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public void addEmployee(Employee employee) throws DBException, DataAccessException {
		System.out.println("==== Inside EmployeeService.addEmployee() ===== ");
		DBUtil.open();
		employeeDAO.setConnection(DBUtil.get());
		employeeDAO.save(employee);
	}

	public List<Employee> listAll() throws DBException, DataAccessException {
		System.out.println("==== Inside EmployeeService.listAll() ===== ");
		DBUtil.open();
		employeeDAO.setConnection(DBUtil.get());
		return employeeDAO.selectAll();
	}

	public Employee readEmployeeById(int id) throws DBException, DataAccessException {
		System.out.println("==== Inside EmployeeService.readEmployeeById() ===== ");
		DBUtil.open();
		employeeDAO.setConnection(DBUtil.get());
		return employeeDAO.selectById(id);
	}

}
