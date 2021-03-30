class Calculator {
	
	void sum(int arg1,int arg2) {
		System.out.println("Inside sum(int arg1,int arg2)");
		System.out.printf("SUM : %s%n",(arg1+arg2));
	}

	void sum(int arg1,int arg2,int arg3) {
		System.out.println("Inside sum(int arg1,int arg2,int arg3)");
		System.out.printf("SUM : %s%n",(arg1+arg2+arg3));
	}

	void sum(int arg1,long arg2) {
		System.out.println("Inside sum(int arg1,long arg2)");
		System.out.printf("SUM : %s%n",(arg1+arg2));
	}

	void sum(long arg1,int arg2) {
		System.out.println("Inside sum(long arg1,int arg2)");
		System.out.printf("SUM : %s%n",(arg1+arg2));
	}

	void sum(int... args) {
		System.out.println("Inside sum(int... args)");
		System.out.printf("Length : %s%n",args.length);
		int result = 0;
		for(int idx = 0;idx < args.length;idx++) {
			result = result + args[idx];	
		}
		System.out.printf("SUM : %s%n",result);
	}
}
