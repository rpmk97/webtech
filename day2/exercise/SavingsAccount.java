class SavingsAccount extends Account {
	
	double dailyWithdrawLimit = 10000.00;

	SavingsAccount () {
	}

	SavingsAccount (String name,double balance) {
		super(name,balance);
	}
	
	SavingsAccount (long accountNo,String name,double balance) {
		super(accountNo,name,balance);
	}

	void showWithdrawLimit() {
		System.out.printf("Daily Withraw Limit for Saving Account is  %s%n!!",this.dailyWithdrawLimit);
	}
}
