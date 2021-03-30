package com.example.exercise._2;

import java.util.Comparator;

public class CarMakeComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		return car1.make.compareTo(car2.make);
	}

}
