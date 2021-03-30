package com.example.thread._7;

public class GreetTask implements Runnable {

	public void run() {
		if (Thread.currentThread().getName().equals("Raju")) {
			hello();
		}
		if (Thread.currentThread().getName().equals("Bholu")) {
			hi();
		}
		if (Thread.currentThread().getName().equals("Jaggu")) {
			bye();
		}
	}

	public synchronized void hello() {
		System.out.println("Hello ji");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello ji");
	}

	public synchronized void hi() {
		System.out.println("Hi ji");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hi ji");
	}

	public void bye() {
		System.out.println("Bye ji");
		System.out.println("Bye ji");
	}

}