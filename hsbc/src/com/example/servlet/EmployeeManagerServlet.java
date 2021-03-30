package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.exception.DBException;
import com.example.exception.DataAccessException;
import com.example.model.Employee;
import com.example.service.EmployeeService;

public class EmployeeManagerServlet extends HttpServlet {
	
	EmployeeService employeeService = new EmployeeService();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==== Inside EmployeeManagerServlet.doGet() ===== ");
		
		PrintWriter writer = response.getWriter();
		StringBuffer buffer = new StringBuffer();
		try {
			List<Employee> employees = employeeService.listAll();
			buffer.append("<html>");
				buffer.append("<body>");
					buffer.append("<header><h1>Employee List</h1></header>");
					buffer.append("<table>");
						buffer.append("<tbody>");
							for (Employee employee : employees) {
								buffer.append("<tr>");
									buffer.append("<td>");
									buffer.append(employee.getEmployeeId());
									buffer.append("</td>");
									buffer.append("<td>");
									buffer.append(employee.getName());
									buffer.append("</td>");
									buffer.append("<td>");
									buffer.append(employee.getSalary());
									buffer.append("</td>");
									buffer.append("<td>");
									buffer.append(employee.getDesig());
									buffer.append("</td>");
									buffer.append("<td>");
									buffer.append(employee.getDept());
									buffer.append("</td>");
									buffer.append("<td>");
									buffer.append(employee.getEmail());
									buffer.append("</td>");
									buffer.append("<td>");
									buffer.append(employee.getPhone());
									buffer.append("</td>");
								buffer.append("</tr>");
							}
						buffer.append("</tbody>");
					buffer.append("</table>");
				buffer.append("</body>");
			buffer.append("</html>");
			writer.write(buffer.toString());
		} catch (DBException e) {
			e.printStackTrace();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

	}

}
