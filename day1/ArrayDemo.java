class ArrayDemo {
	
	public static void main(String[]  args) {
		//UC1();
		//UC2();
		//UC3();
		UC4();
	}

	static void UC1() {
		
		//array declaration
		int[] numbers;
	
		//array initialization
		numbers = new int[5];

		//array population
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
	
		System.out.println(numbers);
		System.out.println(numbers.length);
	
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
	}

	static void UC2() {

		//array declaration & initialization
		int[] numbers = new int[5];

		//array population
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
	
		System.out.println(numbers);
		System.out.println(numbers.length);
	
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
	}

	static void UC3() {

		//array declaration & initialization & population
		//int[] numbers = new int[] {11,22,33,44,55,66,77,88};
		int[] numbers = {11,22,33,44,55,66,77,88};

		System.out.println(numbers);
		System.out.println(numbers.length);
	
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		System.out.println(numbers[7]);
	
	}

	static void UC4() {
		
		int[][] numbers = new int[2][4];
			
		//Row 1	
		numbers[0][0] = 100;
		numbers[0][1] = 200;
		numbers[0][2] = 300;
		numbers[0][3] = 400;

		
		//Row 2	
		numbers[1][0] = 1000;
		numbers[1][1] = 2000;
		numbers[1][2] = 3000;
		numbers[1][3] = 4000;

		System.out.println(numbers[1]);
		System.out.println(numbers[1][2]);
	}

}
