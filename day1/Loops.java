class Loops {
	
	public static void main(String[]  args) {
		//UC1();
		//UC2();
		UC3();
	}

	static void UC1() {
		int count = 1;
		while(count <= 10) {
			System.out.println("How Are You?");
			count = count + 1;	
		}

		System.out.println("Finish Line");
	}

	static void UC2() {

		int count = 100;
		do {
			System.out.println("How Are You?");
			count = count + 1;	
		}while(count <= 10);

		System.out.println("Finish Line");
	}

	static void UC3() {
	
		for(int count = 1;count <= 10;count++) {
			System.out.println("How Are You?");
		}
		System.out.println("Finish Line");
	}

	static void UC4() {
	}

}
