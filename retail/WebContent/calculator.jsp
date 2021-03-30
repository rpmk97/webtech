<!DOCTYPE html>
<%@page import="com.example.service.CalculatorService"%>
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
		<%
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

			CalculatorService calculator = new CalculatorService();
		%>
		<h1>RESULT : <%= calculator.doSum(firstNumber, secondNumber)  %></h1>
	</section>
</body>
</html>