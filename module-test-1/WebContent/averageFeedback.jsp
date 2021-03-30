<%@page import="java.util.Collection"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Average Feedback Page</title>
		<style>
			section{
				border: 2px solid;
				border-radius:5px solid;
				height:40px;
  				width: 69%;
  				text-align:center;
			}
		</style>
	</head>
	<body>
		<section>
			Average feedback for the Pressure cooker product based on feedback from 
			<% 
			
				if(application.getAttribute("FEEDBACK") == null) {
					out.println("0");
				} else {
					Map<String, Integer> feedbackData =  (Map<String, Integer>)application.getAttribute("FEEDBACK");
					out.println(feedbackData.size());
				}
			%>
			users is
			<% 
				if(application.getAttribute("FEEDBACK") == null) {
					out.println("0");
				} else {
					Map<String, Integer> feedbackData =  (Map<String, Integer>)application.getAttribute("FEEDBACK");
					int userCount = feedbackData.size();
					Collection<Integer> ratings  = feedbackData.values();
					int total = 0;
					for(int rating : ratings){
						total = total + rating;
					}
					out.println(total/userCount);
				}
			%>
		</section>
	</body>
</html>

