package com.example.bean.factory;

public class CarFactory {

	public static Car create() {
		return new Car("Cruze LTZ",1700000.00);
	}
}
