package com.example.thread._5;

public class CinemaTask implements Runnable {

	int availableSeats;

	public CinemaTask() {
		this.availableSeats = 100;
	}

	public synchronized void run() {
		System.out.printf("Available Seats : %s%n", this.availableSeats);
		this.availableSeats--;
	}
}