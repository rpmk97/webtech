package com.example.exercise._2;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		//Will sort based on natural sorting order
		//Set<Car> cars = new TreeSet<>();
		
		//Will sort based on price comparator and will ignore natural sorting
		Set<Car> cars = new TreeSet<>(new CarPriceComparator());
	
		//Will sort based on make comparator and will ignore natural sorting
		//Set<Car> cars = new TreeSet<>(new CarMakeComparator());
	
		cars.add(new Car(1001,"X2","BMW",4500000.00,320,"Black"));
		cars.add(new Car(1005,"Q7","Audi",7800000.00,200,"Black"));
		cars.add(new Car(1006,"A1","Audi",1200000.00,220,"Yellow"));
		cars.add(new Car(1010,"CLA","Merc",6400000.00,300,"Black"));
		cars.add(new Car(1007,"A2","Audi",3400000.00,210,"White"));
		cars.add(new Car(1002,"X6","BMW",8500000.00,300,"Yellow"));
		cars.add(new Car(1003,"X1","BMW",3500000.00,280,"White"));
		cars.add(new Car(1008,"XE","Jaguar",9800000.00,290,"White"));
		cars.add(new Car(1004,"Q5","Audi",2500000.00,250,"Blue"));
		cars.add(new Car(1009,"XF","Jaguar",7400000.00,340,"Black"));
		
		for(Car car : cars) {
			System.out.println(car);
		}
	}

}
