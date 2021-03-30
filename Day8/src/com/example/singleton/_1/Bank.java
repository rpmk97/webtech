package com.example.singleton._1;

public class Bank {
	
	public static void main(String[] args) {
		BankManager bankManager1 = BankManager.instance();
		BankManager bankManager2 = BankManager.instance();
		System.out.println(bankManager1);
		System.out.println(bankManager2);
		
		bankManager1.open();
		bankManager1.close();
		bankManager1.transferAccount();
		
		
	}

}
