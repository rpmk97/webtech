package com.example.dao._2;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.Employee;

public class EmployeeDAO {

	DataSource dataSource;
	
	public List<Employee> selectAll() {
		System.out.println("==== Inside EmployeeDAO.selectAll() ===== ");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_MASTER",new EmployeeRowMapper());
	}
}
