package com.example.model;

public class Car {

	private static Car car = null;
	public int vin;
	private int speed = 80; // Miles per Hour

	private Car() {
		System.out.println("Inside Car() constructor!!");
	}

	public static Car newInstance() {
		if (car == null)
			car = new Car();
		return car;
	}

	public void info() {
		System.out.printf("VIN : %s%n", this.vin);
	}

	private void essembleAndReady() {
		System.out.println("Car is being essambled and is now ready!!");
	}

	public void start() {
		essembleAndReady();
		System.out.println("Car Engine started!!");
	}

	public void speedUp() {
		if (this.speed <= 180)
			this.speed += 10;
		System.out.printf("Car is speeding up and running at the speed of %s miles per hour!!%n", this.speed);
	}

}
