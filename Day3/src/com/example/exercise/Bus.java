package com.example.exercise;

public class Bus extends Vehicle implements Acceleratable, Brakable, Repairable {

	public void start() {
		System.out.println("Bus started with key!!!");
	}
	
	public void speedUp() {
		System.out.println("Bus is speeding up!!!");
	}

	public void speedDown() {
		System.out.println("Bus is slowing down!!!");
	}
	
	public void repair() {
		System.out.println("Bus is being repaired!!!");
	}
}
