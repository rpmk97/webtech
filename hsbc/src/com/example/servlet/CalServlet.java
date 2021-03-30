package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalServlet extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside CalServlet.service() ========");
		
		int i = Integer.parseInt(request.getParameter("val1"));
		int j = Integer.parseInt(request.getParameter("val2"));
		
		//int i = 100;
		//int j = 100;
		
		int rs = i + j;

		PrintWriter writer = response.getWriter();
		writer.write("<h1>Simple Calculator</h1>");
		writer.write("<h2>Result : " + rs + "</h2>");
	}

}
