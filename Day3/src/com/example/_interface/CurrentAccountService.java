package com.example._interface;

public class CurrentAccountService implements AccountService,Closable {

	public long open(String name) {
		System.out.printf("Current account opened for Mr. %s%n",name);
		return (long)(Math.random()*5000);
	}
	
	public boolean close(long accountNo) {
		System.out.printf("Current account %s closed%n",accountNo);
		return true;
	}
}
