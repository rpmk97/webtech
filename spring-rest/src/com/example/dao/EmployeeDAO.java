package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.exception.DataAccessException;
import com.example.model.Employee;

@Repository
public class EmployeeDAO {

	Connection connection = null;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void save(Employee employee) throws DataAccessException {
		System.out.println("==== Inside EmployeeDAO.save(Employee employee) ===== ");

		PreparedStatement statement = null;
		try {

			String query = "INSERT INTO EMPLOYEE_MASTER(NAME,SALARY,DESIG,DEPT,EMAIL,PHONE) VALUES(?,?,?,?,?,?)";

			statement = connection.prepareStatement(query);
			statement.setString(1, employee.getName());
			statement.setDouble(2, employee.getSalary());
			statement.setString(3, employee.getDesig());
			statement.setString(4, employee.getDept());
			statement.setString(5, employee.getEmail());
			statement.setString(6, employee.getPhone());
			
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException("Could not save data to DB!!");
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Employee selectById(int id) throws DataAccessException {
		System.out.println("==== Inside EmployeeDAO.selectById(int id) ===== ");

		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Employee employee = new Employee();

		try {

			statement = connection.prepareStatement("SELECT * FROM EMPLOYEE_MASTER WHERE ID=?");
			statement.setInt(1, id);

			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				employee.setEmployeeId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getDouble(3));
				employee.setDesig(resultSet.getString(4));
				employee.setDept(resultSet.getString(5));
				employee.setEmail(resultSet.getString(6));
				employee.setPhone(resultSet.getString(7));
			}
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException("Could not load data from DB!!");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Employee> selectAll() throws DataAccessException {
		System.out.println("==== Inside EmployeeDAO.selectAll() ===== ");

		PreparedStatement statement = null;
		ResultSet resultSet = null;
		List<Employee> employees = new ArrayList<>();

		try {

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
			throw new DataAccessException("Could not load data from DB!!");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
