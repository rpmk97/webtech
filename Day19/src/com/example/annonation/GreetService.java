package com.example.annonation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Scope("singleton")
@Component
public class GreetService {
	
	public GreetService() {
		System.out.println("====== Indside GreetService() ======");
	}

	public void greet(String name) {
		System.out.printf("Hello Mr. %s%n", name);
	}

}
