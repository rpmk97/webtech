package com.example.client;

import com.example.exercise.Washable;

public class HouseKeeper {
	
	void doWash(Washable vehicle) {
		System.out.println("HouseKeeper is ready to clean!!!");
		vehicle.wash();
	}

}
