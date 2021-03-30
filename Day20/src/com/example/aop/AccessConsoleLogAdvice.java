package com.example.aop;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
public class AccessConsoleLogAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object bean) throws Throwable {
		System.out.println(bean.getClass().getName()+"."+method.getName()+" method is accessed at "+LocalDateTime.now());
	}

}
