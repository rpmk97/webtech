package com.example.service;

import java.util.List;

import com.example.dao.EmployeeDAO;
import com.example.exception.DBException;
import com.example.exception.DataAccessException;
import com.example.model.Employee;
import com.example.util.DBUtil;

public class EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAO();

	public List<Employee> listAll() throws DBException, DataAccessException {
		System.out.println("==== Inside EmployeeService.listAll() ===== ");
		DBUtil.open();
		employeeDAO.setConnection(DBUtil.get());
		return employeeDAO.selectAll();
	}

}
