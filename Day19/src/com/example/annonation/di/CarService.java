package com.example.annonation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarService {

	@Autowired
	@Qualifier("carDAOBean")
	CarDAO carDAOA;
	
	@Value("Luxury Cars App")
	String title;
	
	@Value("25")
	int count;	

	/*@Autowired
	public CarService(CarDAO carDAO) {
		System.out.println("===== Inside CarService(CarDAO carDAO) =====");
		this.carDAO = carDAO;
	}*/

	
	/*@Autowired
	public void setCarDAO(CarDAO carDAO) {
		System.out.println("===== Inside setCarDAO(CarDAO carDAO) =====");
		this.carDAO = carDAO;
	}*/

	public void displayDetails(int vin) {
		carDAOA.dbInfo();
		String[] details = carDAOA.selectByVIN(vin);
		System.out.println(title);
		System.out.println(count);
		System.out.printf("Name : %s%n", details[0]);
		System.out.printf("Color : %s%n", details[1]);
		System.out.printf("Price : %s%n", details[2]);
	}
}
