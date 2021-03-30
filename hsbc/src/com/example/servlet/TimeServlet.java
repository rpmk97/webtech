package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TimeServlet extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		LocalDate localDate = LocalDate.now();
		writer.write("<h1>Current Server Date : "+localDate+"</h1>");
	}

}
