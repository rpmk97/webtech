package com.example.singleton._1;

public class BankManager {

	private static BankManager bankManager = null;

	private BankManager() {
	}

	public synchronized static BankManager instance() {
		if (bankManager == null)
			bankManager = new BankManager();
	
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
