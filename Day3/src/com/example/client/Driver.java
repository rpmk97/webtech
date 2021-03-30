package com.example.client;

import com.example.exercise.Vehicle;

public class Driver {
	
	void drive(Vehicle vehicle) {
		System.out.println("Driver is ready to drive!!!");
		vehicle.start();
		vehicle.stop();
	}

}
