package com.example.client;

import com.example.exercise.Acceleratable;

public class Racer {
	
	void doRace(Acceleratable vehicle) {
		System.out.println("Racer is ready to race!!!");
		vehicle.speedUp();
	}

}
