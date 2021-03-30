<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file="header.jsp" %>
	<h1>Welcome Mr. <%= request.getParameter("user") %></h1>
	<h1><%= request.getParameter("greet") %> Mr. <%= request.getParameter("user") %></h1>
	<h1>Happy browsing ahead</h1>
	<%@include file="footer.html" %>
</body>
</html>