package com.example.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component
public class SuccessLogAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object result, Method method, Object[] args, Object bean) throws Throwable {
		System.out.println(bean.getClass().getName() + "." + method.getName() + " method is successfully returned!!");
	}

}
