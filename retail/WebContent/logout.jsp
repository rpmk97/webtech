<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<% 
		session.invalidate();
		out.print("You have successfully logged out!!");
	%>	
</body>
</html>