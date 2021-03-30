class BankManager {
	
	public static void main(String[]  args) {
		
		Bank bank = new Bank();

		Account account = new SavingsAccount("Bill Gates",100.00);

		bank.open(account);
		
		SavingsAccount savingsAccount = (SavingsAccount) account;

		savingsAccount.showWithdrawLimit();
		System.out.printf("Available Balance is : %s!!%n",savingsAccount.balance());
		savingsAccount.deposit(25000.00);
		savingsAccount.deposit(15000.00);
		System.out.printf("Available Balance is : %s!!%n",savingsAccount.balance());
		savingsAccount.withdraw(5000.00);
		System.out.printf("Available Balance is : %s!!%n",savingsAccount.balance());
		
		bank.close(savingsAccount.accountNo);

		Account currentAccount = new CurrentAccount("Vijay Malya",1000.00);	
		bank.open(currentAccount);

		System.out.println("Done!!!!");
	}


}
