package com.example.factory;

public class Main {

	public static void main(String[] args) {
		
		//UC1();
		UC2();
	}

	//Using factory
	private static void UC2() {
		
		Furniture furniture = FurnitureFactory.create('F');
		furniture.make();
		furniture.paint();
		
		furniture = FurnitureFactory.create('C');
		furniture.make();
		furniture.paint();

		furniture = FurnitureFactory.create('D');
		furniture.make();
		furniture.paint();
	}

	
	//Without factory
	private static void UC1() {
		
		Furniture furniture = new Furniture();
		furniture.make();
		furniture.paint();
		
		furniture = new Chair();
		furniture.make();
		furniture.paint();

		furniture = new Desk();
		furniture.make();
		furniture.paint();
	}
}
