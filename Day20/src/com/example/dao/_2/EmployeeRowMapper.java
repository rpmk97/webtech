package com.example.dao._2;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(resultSet.getInt(1));
		employee.setName(resultSet.getString(2));
		employee.setSalary(resultSet.getDouble(3));
		employee.setDesig(resultSet.getString(4));
		employee.setDept(resultSet.getString(5));
		employee.setEmail(resultSet.getString(6));
		employee.setPhone(resultSet.getString(7));
		return employee;
	}

}
