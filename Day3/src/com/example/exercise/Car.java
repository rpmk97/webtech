package com.example.exercise;

public class Car extends Vehicle implements Acceleratable, Washable, Repairable {

	public void start() {
		System.out.println("Car started with button press!!!");
	}

	public void speedUp() {
		System.out.println("Car is speeding up!!!");
	}

	public void wash() {
		System.out.println("Car is being cleaned!!!");
	}
	
	public void repair() {
		System.out.println("Car is being repaired!!!");
	}
}
