package com.example.thread._7;

//Resource sharing demo
public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {

		GreetTask greetTask = new GreetTask();

		Thread workerA = new Thread(greetTask, "Raju");
		Thread workerB = new Thread(greetTask, "Bholu");
		Thread workerC = new Thread(greetTask, "Jaggu");

		workerA.start();
		workerB.start();
		workerC.start();
		
	}
}
