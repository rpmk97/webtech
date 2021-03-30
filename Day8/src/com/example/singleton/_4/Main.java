package com.example.singleton._4;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new Thread(new TaskA()).start();
		new Thread(new TaskB()).start();
	}

}

class TaskA implements Runnable {
	public void run() {
		BankManager bankManager = BankManager.instance;
		System.out.println(bankManager);
		bankManager.open();
		bankManager.close();
		bankManager.transferAccount();
	}
}

class TaskB implements Runnable {
	public void run() {
		BankManager bankManager = BankManager.instance;
		System.out.println(bankManager);
		bankManager.open();
		bankManager.close();
		bankManager.transferAccount();
	}
}

