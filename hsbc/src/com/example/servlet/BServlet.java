package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/servlet-b")
public class BServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside BServlet.doGet() ========");
		response.getWriter().write("<h1>Reply by BServlet!!</h1>");
		
		response.getWriter().write("<h1> BServlet says ---- "+request.getAttribute("TODAY")+"</h1>");
		
	}
	
}
