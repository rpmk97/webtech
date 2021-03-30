package com.example.thread._4;

public class Main {

	public static void main(String[] args) {

		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();

		Thread workerA = new Thread(taskA, "Worker-Print");
		Thread workerB = new Thread(taskB, "Worker-Save");

		workerB.setPriority(Thread.MAX_PRIORITY);

		System.out.println(workerA.getPriority());
		System.out.println(workerB.getPriority());
		
		workerA.start();
		workerB.start();
	}
}

class TaskA implements Runnable {

	public void run() {
		Thread thread = Thread.currentThread();
		for (int i = 1; i <= 20; i++) {
			System.out.printf("I : %s done by %s%n", i, thread.getName());
		}
	}
}

class TaskB implements Runnable {

	public void run() {
		Thread thread = Thread.currentThread();
		for (int j = 1; j <= 20; j++) {
			System.out.printf("J : %s done by %s%n", j, thread.getName());
		}
	}
}
