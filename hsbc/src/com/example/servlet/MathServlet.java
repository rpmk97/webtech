package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MathServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside MathServlet.doPost() ========");

		int i = Integer.parseInt(request.getParameter("val1"));
		int j = Integer.parseInt(request.getParameter("val2"));
		int rs = i + j;
		PrintWriter writer = response.getWriter();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("topbar.html");
		dispatcher.include(request, response);
		
		writer.write("<h1>Simple Math Calculator</h1>");
		writer.write("<h2>Result : " + rs + "</h2>");
	
		dispatcher = request.getRequestDispatcher("bottombar.html");
		dispatcher.include(request, response);
		
	}

}
