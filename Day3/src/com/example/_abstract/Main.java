package com.example._abstract;

public class Main {

	public static void main(String[] args) {

		Square square = new Square();
		Circle circle = new Circle();

		square.info();
		square.draw();
		square.paint();
		
		circle.info();
		circle.draw();
		circle.paint();
	}
}
