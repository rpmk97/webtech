package com.example._interface;

public class Main {

	public static void main(String[] args) {
		

		SavingAccountService savingAccountService = new SavingAccountService();
		long accountNo = savingAccountService.open("Raju");
		System.out.printf("Account No : %s%n", accountNo);
		System.out.printf("Account Transfered : %s%n",
				savingAccountService.transfer(accountNo, "Kalyani Nagar", "Koregaon Park") ? "Yes" : "No");

		CurrentAccountService currentAccountService = new CurrentAccountService();
		accountNo = currentAccountService.open("Billu");
		System.out.printf("Account No : %s%n", accountNo);
		System.out.printf("Account Closed : %s%n", currentAccountService.close(accountNo) ? "Yes" : "No");

	}

}
