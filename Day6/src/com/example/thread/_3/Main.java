package com.example.thread._3;

public class Main {

	public static void main(String[] args) {

		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());

		try {
			System.out.printf("Thread '%s' gone to sleep mode!!%n", thread.getName());
			// thread.sleep(5000); //5s
			Thread.sleep(5000); // 5s
			System.out.printf("Thread '%s' is now woke up!!%n", thread.getName());
		} catch (InterruptedException e) {
			System.out.printf("Thread '%s' is distrubed by interrupting!!%n", thread.getName());
			e.printStackTrace();
		}

		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();

		// Thread workerA = new Thread(taskA);
		// Thread workerB = new Thread(taskB);

		// workerA.setName("Print-Worker");
		// workerB.setName("Save-Worker");

		Thread workerA = new Thread(taskA, "Worker-A");
		Thread workerB = new Thread(taskB, "Worker-B");

		System.out.println(workerA.getName());
		System.out.println(workerB.getName());

		workerA.start();
		workerB.start();
	}
}

class TaskA implements Runnable {

	public void run() {
		Thread thread = Thread.currentThread();
		for (int i = 1; i <= 20; i++) {
			try {
				System.out.printf("I : %s done by %s%n", i, thread.getName());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class TaskB implements Runnable {

	public void run() {
		Thread thread = Thread.currentThread();
		for (int j = 1; j <= 20; j++) {
			try {
				System.out.printf("J : %s done by %s%n", j, thread.getName());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
