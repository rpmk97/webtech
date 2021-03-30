package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet extends GenericServlet {
	
	String greet = null;
	
	public HelloServlet() {
		System.out.println("==== Inside HelloServlet constructor() ====");
	}
	
	/*@Override
	public void init() {
		System.out.println("==== Inside HelloServlet init() ====");
	}*/
	
	@Override
	public void init(ServletConfig config) {
		System.out.println("==== Inside HelloServlet init() ====");
		greet = config.getInitParameter("user.greet");
		System.out.printf("Greet : %s%n",greet);
	}
	
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("==== Inside HelloServlet service() ====");
		PrintWriter writer = response.getWriter();
		writer.write("<h1>"+greet+" from Servlet</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("==== Inside HelloServlet destroy() ====");
	}
	
}
