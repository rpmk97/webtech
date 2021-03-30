package com.example.singleton._4;

//Java 5
public enum BankManager {

	instance;
	
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
