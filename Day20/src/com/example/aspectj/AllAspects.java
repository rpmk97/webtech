package com.example.aspectj;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllAspects {

	/*@Before("execution(* com.example.aspectj.PayrollService.*(..))")
	public void accessLogger() {
		System.out.println("Method is accessed at "+LocalDateTime.now());
	}*/
	
	//@Before("execution(* com.example.aspectj.PayrollService.*(..))")
	@Before("execution(* com.example.aspectj.*.*(..))")
	public void accessLogger(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName()+" method is accessed at "+LocalDateTime.now());
	}

	@AfterReturning("execution(* com.example.aspectj.CalculatorService.*(..))")
	public void successLogger(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName()+" method is successfully returned!!");
	}

}
