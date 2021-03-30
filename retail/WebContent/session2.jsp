<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<% 
		String name = (String) session.getAttribute("NAME");
		String city = (String) session.getAttribute("CITY");
		
		session.removeAttribute("WEATHER");
		
		out.print("Session ID : "+session.getId());
		out.print("<br/>We know, Mr. "+name+", you live in "+city);
		out.print("<br/>Todays weather is "+session.getAttribute("WEATHER"));

	%>	
</body>
</html>