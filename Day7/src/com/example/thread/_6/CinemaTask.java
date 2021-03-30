package com.example.thread._6;

public class CinemaTask implements Runnable {

	int availableSeats;

	public CinemaTask() {
		this.availableSeats = 100;
	}

	public void run() {
		synchronized (this) {
			System.out.printf("Available Seats : %s when %s is checking%n", this.availableSeats,Thread.currentThread().getName());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.availableSeats--;
		}
	}
}