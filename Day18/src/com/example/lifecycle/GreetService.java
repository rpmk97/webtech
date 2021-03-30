package com.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GreetService implements InitializingBean,DisposableBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("===== Inside GreetService.afterPropertiesSet() =====");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("===== Inside GreetService.destroy() =====");
	}

	public void greet(String name) {
		System.out.printf("Hello Mr. %s%n", name);
	}

}
