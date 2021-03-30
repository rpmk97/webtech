package com.example.annonation.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarDAO {

	@Value("${jdbc.driver}")
	String driver;

	@Value("${jdbc.url}")
	String url;

	@Value("${jdbc.user}")
	String user;

	@Value("${jdbc.password}")
	String password;

	public void dbInfo() {
		System.out.printf("Driver : %s%n", this.driver);
		System.out.printf("URL : %s%n", this.url);
		System.out.printf("User : %s%n", this.user);
		System.out.printf("Password : %s%n", this.password);
	}

	public String[] selectByVIN(int vin) {
		if (vin == 100) {
			return new String[] { "Jaguar XE", "Yellow", "12000000.00" };
		}
		if (vin == 200) {
			return new String[] { "Jaguar XF", "Black", "12000000.00" };
		}
		return new String[] {};
	}
}
