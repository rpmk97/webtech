package com.example.factory;

public class FurnitureFactory {

	public static Furniture create(char type) {
		if (type == 'C') {
			return new Chair();
		} else if (type == 'D') {
			return new Desk();
		}
		return new Furniture();
	}
}
