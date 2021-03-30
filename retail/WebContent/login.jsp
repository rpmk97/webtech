<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<header>
		<h1>Login Page</h1>
	</header>
	<section>
		<%
			if (request.getParameter("user") != null
					&& request.getParameter("user").trim().length() > 0) {
				if (request.getParameter("password") != null
						&& request.getParameter("password").trim().length() > 0) {
				
					String user = request.getParameter("user");
					String password = request.getParameter("password");
							
					if(user.equals("admin") &&  password.equals("admin")){
						%>
							<jsp:forward page="success.jsp">
								<jsp:param value="Good Morning" name="greet"/>
							</jsp:forward>
						<% 
					}else{
						%>
							<jsp:forward page="error.jsp" />
						<% 
					}
				}
			}
		%>
	</section>
</body>
</html>