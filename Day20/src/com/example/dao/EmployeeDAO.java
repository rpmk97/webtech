package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Employee> selectAll() {
		System.out.println("==== Inside EmployeeDAO.selectAll() ===== ");
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_MASTER",new EmployeeRowMapper());
	}
}
