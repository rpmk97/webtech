package com.example.di;

public class CarDAO {

	public String[] selectByVIN(int vin) {
		if (vin == 100) {
			return new String[] {"Jaguar XE","Yellow","12000000.00"};
		}
		if (vin == 200) {
			return new String[] {"Jaguar XF","Black","12000000.00"};
		}
		return new String[] {};
	}
}
