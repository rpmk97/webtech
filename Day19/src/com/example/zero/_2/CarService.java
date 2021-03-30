package com.example.zero._2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	@Autowired
	CarDAO carDAO;

	@Value("${app.title}")
	String title;

	public void displayDetails(int vin) {
		carDAO.dbInfo();
		String[] details = carDAO.selectByVIN(vin);
		System.out.println(title);
		System.out.printf("Name : %s%n", details[0]);
		System.out.printf("Color : %s%n", details[1]);
		System.out.printf("Price : %s%n", details[2]);
	}
}
