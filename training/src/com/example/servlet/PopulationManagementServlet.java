package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/india/population")
public class PopulationManagementServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside PopulationManagementServlet.doGet() ========");
		PrintWriter writer = response.getWriter();
		
		long population = 0L;
		
		ServletContext servletContext = request.getServletContext();
		if(servletContext.getAttribute("INDIA-POPULATION") == null) {
			population = 140000000;
			servletContext.setAttribute("INDIA-POPULATION",population);
		}else {
			population = (Long)(servletContext.getAttribute("INDIA-POPULATION"));
			population = population + 500;
			servletContext.setAttribute("INDIA-POPULATION",population);
		}

		System.out.println("User speaks '"+request.getHeader("Accept-Language")+"' languge!!");
		System.out.println("Request Received From '"+request.getHeader("User-Agent")+"' Browser!!");
		System.out.println("Request Received From '"+request.getRemoteHost()+"' IP Address!!");
		writer.write("<h1>Population of India as on "+LocalDateTime.now()+" time is "+population+"</h1>");
	}
	
}
