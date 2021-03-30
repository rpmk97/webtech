<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
<style>
</style>
</head>
<body>
	<header>
		<h1>Java Standard Tag Library Demo</h1>
	</header>
	<section>
	<%
		List<String> colors = new ArrayList<>();	
		colors.add("Black");
		colors.add("White");
		colors.add("Blue");
		colors.add("Green");
		
		request.setAttribute("BEAUTIFUL_COLORS", colors);
		
	%>
	<h2>Available Car Colors are : </h2>
	<c:forEach var="color" items="${BEAUTIFUL_COLORS}">
		<h3><c:out value="${color}" /></h3>
	</c:forEach>
	<h2>Available Car Colors are : </h2>
	<%
		for(String color : colors) {
		%>
			<h3><%= color %></h3>
		<%
		}
	%>
	</section>
</body>
</html>