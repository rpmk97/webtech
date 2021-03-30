package com.example._abstract;

abstract class Shape {

	String title;

	public Shape() {
		this.title = "Beautiful Shapes";
	}
	
	Shape(String title) {
		this.title = title;
	}
	
	void info() {
		System.out.printf("It is all about %s!!%n",this.title);
	}

	abstract void draw();
	abstract void paint();

}
