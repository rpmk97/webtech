package com.example.nested;

class Main {
	public static void main(String[] args) {
		
		HouseOwner houseOwner = new HouseOwner();
		houseOwner.info();
		houseOwner.roomAvailability();
		houseOwner.electricityLoadAvailability();
		
		HouseOwner.Tenant tenant = houseOwner.new Tenant();
		tenant.info();
		tenant.roomsUsed();
		tenant.electricityUsed();
	}
	
	
}
