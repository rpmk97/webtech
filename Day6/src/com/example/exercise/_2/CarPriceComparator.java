package com.example.exercise._2;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		return (int) (car2.price - car1.price);
	}

}
