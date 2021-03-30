package com.example.dao._1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.example.model.Employee;

public class EmployeeDAO {

	DataSource dataSource;
	
	public List<Employee> selectAll() {
		System.out.println("==== Inside EmployeeDAO.selectAll() ===== ");

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		List<Employee> employees = new ArrayList<>();

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("SELECT * FROM EMPLOYEE_MASTER");
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmployeeId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getDouble(3));
				employee.setDesig(resultSet.getString(4));
				employee.setDept(resultSet.getString(5));
				employee.setEmail(resultSet.getString(6));
				employee.setPhone(resultSet.getString(7));
				employees.add(employee);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employees;
	}
}
