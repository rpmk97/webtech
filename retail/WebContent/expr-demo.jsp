<!DOCTYPE html>
<%@page import="java.time.LocalTime"%>
<html>
<head>
</head>
<body>
	Current Value is : 
	<%
		int value = 200;
		out.println(value);
		out.println("<br/>Current Value is : "+value);
	%>
	<!-- JSP expression syntax -->
	<!-- JSP expressions provide an easy way of displaying dynamic content-->
	<br/>
	Current Value  :	<%= value %>
	<h1>Current Time :	<%= LocalTime.now() %></h1>
	<h1>Sum of 10 + 2  :	<%= 10 + 2 %></h1>
	<h1>Some Random Value  :	<%= Math.random() %></h1>
</body>
</html>