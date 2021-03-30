<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%
		//request.setAttribute("TODAY", "Wednesday");
		//pageContext.setAttribute("TODAY", "Sunday");
		//session.setAttribute("TODAY", "Monday");
		//application.setAttribute("TODAY", "Saturday");
	%>
	<%
		out.print(request.getAttribute("TODAY"));
	%>	 
	<br/>
	<%= request.getAttribute("TODAY") %>	 
	<br/>
	<!-- JSP EL syntax -->
	<!-- JSP EL is to make it simple to access scoped variables and 
		 display their values -->
	${ TODAY }
</body>
</html>