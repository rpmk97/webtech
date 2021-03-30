package com.example.client;

import com.example.exercise.Bus;
import com.example.exercise.Car;
import com.example.exercise.ERikshaw;

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Bus bus = new Bus();
		ERikshaw rikshaw = new ERikshaw();
		
		Driver driver = new Driver();
		Racer racer = new Racer();
		Mechanic mechanic = new Mechanic();
		HouseKeeper houseKeeper = new HouseKeeper();
		
		driver.drive(car);
		driver.drive(bus);
		driver.drive(rikshaw);
		
		racer.doRace(car);
		racer.doRace(bus);
	
		mechanic.doRepair(car);
		mechanic.doRepair(bus);
		mechanic.doRepair(rikshaw);
	
		houseKeeper.doWash(car);
	}

}
