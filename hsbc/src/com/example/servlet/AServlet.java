package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/servlet-a")
public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside AServlet.doGet() ========");
		request.setAttribute("TODAY", "FRIDAY-PARTY DAY");
		
		response.sendRedirect("servlet-b");
		
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("servlet-b");
		//requestDispatcher.forward(request, response);
	}
	
}
