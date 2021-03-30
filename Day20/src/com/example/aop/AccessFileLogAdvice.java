package com.example.aop;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccessFileLogAdvice implements MethodBeforeAdvice {

	@Autowired
	FileWriter fileWriter;
	
	@Override
	public void before(Method method, Object[] args, Object bean) throws Throwable {
		fileWriter.write(bean.getClass().getName()+"."+method.getName()+" method is accessed at "+LocalDateTime.now());
		fileWriter.write("\n");
		fileWriter.flush();
	}

}
