<!-- JSP Directive -->
<%@ page import="java.time.LocalDate"  %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	
	<!-- JSP Action syntax -->
	<!-- JSP Actions are used to do things at run time only -->
	<!-- JSP Include Action -->
	<jsp:include page="header.jsp" />

	<!-- JSP Include Directive -->
	<%@include file="header.jsp" %>
	
	<h1>Today's Date : 
	<!-- Scriptlet for Java logic -->
	<% 
		LocalDate currentDate = LocalDate.now();
		out.write(currentDate.toString());
	%>	
	</h1>
	<h1>Hello to JSP Technology</h1>
	<%@include file="footer.html" %>
	<jsp:include page="footer.html" />
</body>
</html>