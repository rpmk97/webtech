package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/userhello")
public class UserHelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside UserHelloServlet.doGet() ========");

		String name = request.getParameter("name");
	
		HttpSession session = request.getSession();
		session.setAttribute("USER-NAME",name);
		
		
		PrintWriter writer = response.getWriter();
		writer.write("<h1>Hello Mr. "+name+"</h1>");
		writer.write("<h1>Session ID : "+session.getId()+"</h1>");
	}
	
}
