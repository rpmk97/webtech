package com.example._interface;

public class SavingAccountService implements AccountService,Transferable {

	public long open(String name) {
		System.out.printf("Saving account opened for Mr. %s%n",name);
		return (long)(Math.random()*1000);
	}
	
	public boolean transfer(long accountNo, String fromBranch, String toBranch) {
		System.out.printf("Saving account %s transfered from %s to %s branch%n",accountNo,fromBranch,toBranch);
		return true;
	}
}
