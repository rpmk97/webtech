package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MathServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside MathServlet.doGet() ========");

		int i = 0;
		int j = 0;

		if (request.getParameter("val1") != null) {
			i = Integer.parseInt(request.getParameter("val1"));
		}
		if (request.getParameter("val2") != null) {
			j = Integer.parseInt(request.getParameter("val2"));
		}

		int rs = i + j;

		PrintWriter writer = response.getWriter();

		writer.write("<h1>Simple Math Calculator</h1>");
		writer.write("<h2>Result : " + rs + "</h2>");

	}

}
