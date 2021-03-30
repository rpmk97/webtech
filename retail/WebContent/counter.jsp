<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%
		if (application.getAttribute("COUNTER") == null) {
			application.setAttribute("COUNTER", 1);
			out.println("<h2>Welcome Mr. Guest, You are first visitor of this web application!!</h2>");
			out.println("<h2>$5 million deposited in your account, withdraw fast!!</h2>");
		} else {
			int counter = (Integer) application.getAttribute("COUNTER");
			counter++;
			application.setAttribute("COUNTER", counter);
			out.println("<h2>Welcome Mr. Guest, You are visitor no. "+counter+" of this web application!!</h2>");
		}
	%>
</body>
</html>