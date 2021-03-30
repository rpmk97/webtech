package com.example.service;

import com.example.model.Car;

class Driver {

	void drive() {
		//Car car = new Car();
		Car car = Car.newInstance();
		Car car1 = Car.newInstance();
		Car car2 = Car.newInstance();
		
		System.out.println(car);
		System.out.println(car1);
		System.out.println(car2);
		
		// System.out.println(car.vin);
		car.info();
		car.start();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
	}
}
