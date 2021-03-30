package com.example.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.CalculatorService;

@WebServlet("/calc")
public class CalculatorController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	CalculatorService calculatorService = new CalculatorService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Landing the request inside CalculatorController!!");
		
		int firstNumber = 0;
		int secondNumber = 0;

		if (request.getParameter("firstNumber") != null && request.getParameter("firstNumber").trim().length() > 0) {
			firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
		}
		if (request.getParameter("secondNumber") != null && request.getParameter("secondNumber").trim().length() > 0) {
			secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
		}

		int result = calculatorService.doSum(firstNumber, secondNumber);
		request.setAttribute("RESULT", result);
		System.out.println("Forwarding from CalculatorController to View!!");
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
