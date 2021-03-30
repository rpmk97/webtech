<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<% 
		String name = request.getParameter("name");
		String city = request.getParameter("city");
	
		//session.setMaxInactiveInterval(10);
		session.setAttribute("NAME",name);
		session.setAttribute("CITY",city);
		session.setAttribute("WEATHER","20 degree temprature");
			
		out.print("Session ID : "+session.getId());
		out.print("<br/>We know, Mr. "+name+", you live in "+city);
		out.print("<br/>Todays weather is "+session.getAttribute("WEATHER"));
	%>	
</body>
</html>