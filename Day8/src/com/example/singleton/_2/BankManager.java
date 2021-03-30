package com.example.singleton._2;

public class BankManager {

	private static BankManager bankManager = new BankManager();

	private BankManager() {
	}

	public static BankManager instance() {
		return bankManager;
	}

	public void open() {
		System.out.println("Account Opened!!!!");
	}

	public void close() {
		System.out.println("Account Closed!!!!");
	}

	public void transferAccount() {
		System.out.println("Account Transferred!!!!");
	}

}
