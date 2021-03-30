package com.example.lifecycle;

public class HelloService {
	
	public void init() {
		System.out.println("===== Inside HelloService.init() =====");
	}

	public void clean() {
		System.out.println("===== Inside HelloService.clean() =====");
	}

	public void hello(String name) {
		System.out.printf("Hello Mr. %s%n", name);
	}
}
