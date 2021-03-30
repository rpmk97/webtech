package com.example.property;

public class GreetService {

	String title;
	String version;
	String greeting;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void info() {
		System.out.printf("%s %s %n", title, version);
	}
	
	public void greet(String name) {
		System.out.printf("%s Mr. %s%n", greeting, name);
	}

}
