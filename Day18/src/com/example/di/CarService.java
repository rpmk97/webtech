package com.example.di;

public class CarService {

	String title;
	CarDAO carDAO;

	public CarService(CarDAO carDAO) {
		System.out.println("===== Inside CarService(CarDAO carDAO) =====");
		this.carDAO = carDAO;
	}

	public CarService(CarDAO carDAO, String title) {
		System.out.println("===== Inside CarService(CarDAO carDAO, String title) =====");
		this.carDAO = carDAO;
		this.title = title;
	}
	
	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void displayDetails(int vin) {
		String[] details = carDAO.selectByVIN(vin);
		System.out.println(title);
		System.out.printf("Name : %s%n", details[0]);
		System.out.printf("Color : %s%n", details[1]);
		System.out.printf("Price : %s%n", details[2]);
	}
}
