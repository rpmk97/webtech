package com.example.thread._6;

//Resource sharing demo
public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {

		CinemaTask task = new CinemaTask();

		Thread workerA = new Thread(task, "Raju");
		Thread workerB = new Thread(task, "Bholu");

		workerA.start();
		workerB.start();
	}
}
