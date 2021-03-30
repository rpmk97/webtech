package com.example.zero._2;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

	public void greet(String name) {
		System.out.printf("Hello Mr. %s%n", name);
	}

}
