package com.example.singleton._3;

public class BankManager {

	private static BankManager bankManager = null;
	
	private BankManager() {
	}
	
	static {
		bankManager = new BankManager();
		System.out.println("BankManager is ready in memory!!");
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
