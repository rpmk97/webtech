package com.example.thread._8;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

//Producer Consumer Problem
public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {

		LinkedList<Integer> numbers = new LinkedList<>();

		Thread producer = new Thread(new Producer(numbers));
		Thread consumer = new Thread(new Consumer(numbers));

		producer.start();
		consumer.start();
	}
}

class Producer implements Runnable {
	LinkedList<Integer> numbers = null;

	public Producer(LinkedList<Integer> numbers) {
		this.numbers = numbers;
	}

	public void run() {
		while (true) {
			synchronized (this.numbers) {
				if (!this.numbers.isEmpty()) {
					try {
						this.numbers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int value = (int) (Math.random() * 1000);
				this.numbers.addLast(value);
				System.out.printf("Producer Wrote : %s%n", value);
				this.numbers.notify();
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}

class Consumer implements Runnable {

	LinkedList<Integer> numbers = null;

	public Consumer(LinkedList<Integer> numbers) {
		this.numbers = numbers;
	}

	public void run() {
		while (true) {
			synchronized (this.numbers) {
				if (this.numbers.isEmpty()) {
					try {
						this.numbers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int value = this.numbers.removeFirst();
				System.out.printf("Consumer Processed : %s%n", value);
				this.numbers.notify();
			}
		}
	}
}
