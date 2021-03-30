<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
</head>
<body>
	Current Population of India : <%= population  %>
	<br/>
	<%
		int population = 135000000;
	%>
	Current Population of India : <%= population  %>
	<!-- JSP declaration syntax  -->
	<!-- JSP declaration allows developers to declare variables, objects or classes -->
	<%! int population = 140000000; %>	
	<br/>
	Current Population of India : <%= population  %>
	<%! List<String> colors = new ArrayList<>(); %>	
	<%
		colors.add("Black");
		colors.add("White");
		colors.add("Blue");
		colors.add("Green");
	%>
	<h2>Available Car Colors are : </h2>
	<%
		for(String color : colors) {
		%>
			<h3><%= color %></h3>
		<%
		}
	%>
	<br/>
	Current Population of India : <%= population  %>
	<%! class UserRatings { int userCount; int averageRating; }  %>
	<%! UserRatings userRatings = new UserRatings();  %>
	<br/>
	No Of Users who gave ratings are  : <%= userRatings.userCount  %>
	<br/>
	Current Average Rating is  : <%= userRatings.averageRating  %>
	
</body>
</html>