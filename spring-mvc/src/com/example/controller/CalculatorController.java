package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.CalculatorService;

@Controller
public class CalculatorController {

	@Autowired
	CalculatorService calculatorService;

	@RequestMapping(path = "/calcForm")
	public String calcFormPage() {
		System.out.println("===== Inside CalculatorController.calcFormPage() =====");
		return "calForm";
	}

	@RequestMapping(path = "/calc")
	public ModelAndView calculateSubmit(HttpServletRequest request) {

		System.out.println("===== Inside CalculatorController.calculateSubmit() =====");

		int firstNumber = 0;
		int secondNumber = 0;

		if (request.getParameter("firstNumber") != null && request.getParameter("firstNumber").trim().length() > 0) {
			firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
		}
		if (request.getParameter("secondNumber") != null && request.getParameter("secondNumber").trim().length() > 0) {
			secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
		}

		ModelAndView modelAndView = null;

		if (firstNumber == 0 || secondNumber == 0) {
			modelAndView = new ModelAndView("calForm", "MESSAGE", "Error in doing calculations!!");
		} else {
			modelAndView = new ModelAndView("success", "RESULT", calculatorService.doSum(firstNumber, secondNumber));
		}
		return modelAndView;
	}

	@RequestMapping(path = "/calcSubmit")
	public ModelAndView calcSubmit(@RequestParam("firstNumber") int numberOne,
			@RequestParam("secondNumber") int numberTwo) {

		System.out.println("===== Inside CalculatorController.calcSubmit() =====");

		ModelAndView modelAndView = null;

		if (numberOne == 0 || numberTwo == 0) {
			modelAndView = new ModelAndView("calForm", "MESSAGE", "Error in doing calculations!!");
		} else {
			modelAndView = new ModelAndView("success", "RESULT", calculatorService.doSum(numberOne, numberOne));
		}
		return modelAndView;
	}

}
