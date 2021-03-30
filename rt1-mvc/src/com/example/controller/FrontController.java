package com.example.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.UserRatingService;

public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Landing user request inside FrontController!!");
		ServletContext application = request.getServletContext();

		if (application.getAttribute("USERRATINGSERVICE") == null) {
			UserRatingService userRatingService = new UserRatingService();
			application.setAttribute("USERRATINGSERVICE", userRatingService);
		}
		
		String requestURI = request.getRequestURI();

		if (requestURI.endsWith("home")) {
			System.out.println("Forwarding from FrontController to Home View!!");
			request.getRequestDispatcher("/WEB-INF/pages/home.html").forward(request, response);
		} else if (requestURI.endsWith("form")) {
			System.out.println("Forwarding from FrontController to Feedback Form View!!");
			request.getRequestDispatcher("/WEB-INF/pages/feedbackForm.html").forward(request, response);
		} else if (requestURI.endsWith("register")) {
			if (request.getParameter("rating") != null && request.getParameter("rating").trim().length() > 0) {
				int rating = Integer.parseInt(request.getParameter("rating"));
				UserRatingService userRatingService = (UserRatingService) application.getAttribute("USERRATINGSERVICE");
				userRatingService.increaseUserCount();
				userRatingService.addRating(rating);
				System.out.println("User Rating has been submitted successfully and now redirecting to home page!!!!");
				response.sendRedirect("home");
			}
		}else if (requestURI.endsWith("average")) {
			UserRatingService userRatingService = (UserRatingService) application.getAttribute("USERRATINGSERVICE");
			request.setAttribute("USERCOUNT", userRatingService.readUserCount());
			request.setAttribute("AVERAGERATING", userRatingService.averageRating());
			System.out.println("Forwarding from FrontController to Average View!!");
			request.getRequestDispatcher("/WEB-INF/pages/averageFeedback.jsp").forward(request, response);
		} 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
