<!DOCTYPE html>
<html>
<head>
<style>
	@import url("./css/styles.css");
</style>
</head>
<body>
	<header>
		<h1>Simple Calculator</h1>
	</header>
	<section>
		<h1>
			SUM :
			<%
			response.setContentType("text/html");

			int firstNumber = 0;
			int secondNumber = 0;

			if (request.getParameter("firstNumber") != null
					&& request.getParameter("firstNumber").trim().length() > 0) {
				firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
			}
			if (request.getParameter("secondNumber") != null
					&& request.getParameter("secondNumber").trim().length() > 0) {
				secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
			}

			out.print(firstNumber + secondNumber);
		%>
		</h1>
	</section>
</body>
</html>