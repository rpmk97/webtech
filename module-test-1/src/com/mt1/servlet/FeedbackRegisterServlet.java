package com.mt1.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet to capture the feedback for pressure cooker by users 
 * and to save to some permanent storage.
 * */
@WebServlet("/feedbackRegister")
public class FeedbackRegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	int userCount = 0;

	/**
	 * Feedback will be posted to this method so entire logic to capture feedback
	 * will be written here.
	 * */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletContext  application = request.getServletContext();
		int rating = 0;	
		
		if(request.getParameter("rating") != null && request.getParameter("rating").trim().length() > 0) {
			rating = Integer.parseInt(request.getParameter("rating"));
			userCount++;
		}
	
		if(application.getAttribute("FEEDBACK") == null) {
			Map<String, Integer> feedbackData =  new HashMap<>();
			feedbackData.put("User-"+userCount, rating);
			application.setAttribute("FEEDBACK",feedbackData);
		} else {
			Map<String, Integer> feedbackData =  (Map<String, Integer>)application.getAttribute("FEEDBACK");
			feedbackData.put("User-"+userCount, rating);
		}
		System.out.println("Feedback has been submitted successfully!!!!");
		response.sendRedirect("home.html");
	}
}
