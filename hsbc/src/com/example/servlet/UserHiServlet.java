package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/userhi")
public class UserHiServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("======== Inside UserHiServlet.doGet() ========");

		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("USER-NAME");

		PrintWriter writer = response.getWriter();
		writer.write("<div style='float:right'><a href='userlogout'>Logout</a></div>");
		writer.write("<br/><br/><h1>Hi Mr. " + name + "</h1>");
		writer.write("<h1>Session ID : "+session.getId()+"</h1>");

	}

}
