package com.example.client;

import com.example.exercise.Repairable;

public class Mechanic {
	
	void doRepair(Repairable vehicle) {
		System.out.println("Mechanic is ready to repair!!!");
		vehicle.repair();
	}

}
