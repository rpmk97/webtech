package com.example.nested;

class HouseOwner {

	String name = "Raju";
	private int rooms = 5;
	private int rentedRooms = 2;
	private int electricityLoad = 5; // KW

	void info() {
		System.out.printf("Name : %s%n", this.name);
	}
	
	void roomAvailability() {
		System.out.printf("Total Rooms : %s%n", this.rooms);
		System.out.printf("Available Rooms : %s%n", (this.rooms - this.rentedRooms));
	}
	
	void electricityLoadAvailability() {
		System.out.printf("Electricity Load Available in the house is : %s KW%n", this.electricityLoad);
	}

	void rentRoom() {
		this.rentedRooms++;
	}

	class Tenant {
		
		String name = "Jaggu";
		String phone = "9800000000";
		
		void info() {
			System.out.printf("Name : %s%n", this.name);
			System.out.printf("Phone : %s%n", this.phone);
		}
		
		void roomsUsed() {
			System.out.printf("Tenant %s is using %s rooms%n", this.name,rentedRooms);
		}

		void electricityUsed() {
			System.out.printf("Tenant %s is using %s KW electricity%n", this.name,(electricityLoad*.30));
		}

	}

}
