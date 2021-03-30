class Account {

	long accountNo;
	String name;
	double balance;

	Account () {
	}

	Account (String name,double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	Account (long accountNo,String name,double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	double withdraw(double amount) {
		this.balance = this.balance - amount;
		System.out.printf("Rs/- %s Amount Debited from Account %s!!%n",amount,this.accountNo);
		return this.balance;
	}

	double deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.printf("Rs/- %s Amount Credited in Account %s!!%n",amount,this.accountNo);
		return this.balance;
	}

	double balance() {
		return this.balance;
	}
}
