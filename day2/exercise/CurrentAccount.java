class CurrentAccount extends Account {
	
	double dailyWithdrawLimit;
	double overDraftLimit;

	CurrentAccount () {
		this.dailyWithdrawLimit = 200000.00;
		this.overDraftLimit = 1000000.00;
	}

	CurrentAccount (String name,double balance) {
		super(name,balance);
	}
	
	CurrentAccount (long accountNo,String name,double balance) {
		super(accountNo,name,balance);
	}

	void showWithdrawLimit() {
		System.out.printf("Daily Withraw Limit for Current Account is  %s%n!!",this.dailyWithdrawLimit);
	}

	void showOverDraftLimit() {
		System.out.printf("OD Limit Set for Current Account is  %s%n!!",this.overDraftLimit);
	}

	void setOverDraftLimit(double newODLimit) {
		this.overDraftLimit = newODLimit;
	}
}
