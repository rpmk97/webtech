class FurnitureDemo {
	
	public static void main(String[]  args) {
		//UC1();
		//UC2();
		//UC3();
		//UC4();
		//UC5();
		//UC6();
		//UC7();
		//UC8();
		UC9();
		System.out.println("Done!!!!");
	}


	static void UC9() {
		Furniture furniture = new Chair(200,"Iron",2,2);
		furniture.make();
	
		furniture = new Desk();
		furniture.make();
	}

	static void UC8() {
		Furniture furniture = new Chair(200,"Iron",2,2);
		System.out.println(furniture);
		furniture.info();
		furniture.make();
	}

	static void UC7() {

		Chair chair1 = new Chair(200,"Iron",2,2);
		Chair chair2 = new Chair(300,"Plastic",4,2);
		Chair chair3 = chair2;
		
		chair3.legs = 10;		

		chair1.info();
		chair2.info();
		chair3.info();

		System.out.println(chair2);
		System.out.println(chair3);
	}


	static void UC6() {

		Furniture furniture = new Furniture(10,"Plastic");
		Chair chair = new Chair(200,"Iron",2,2);

		furniture.info();
		furniture.make();

		chair.info();
		chair.make();
		chair.sell();
	}


	static void UC5() {

		Furniture furniture = new Furniture(10,"Plastic");
		Chair chair = new Chair(200,"Iron",2,2);

		furniture.info();
		furniture.make();

		chair.info();
		System.out.println(chair.legs);
		System.out.println(chair.hands);
		chair.make();
		chair.sell();

	}



	static void UC4() {

		Furniture furniture = new Furniture(10,"Plastic");
		Chair chair = new Chair(200,"Iron",2,2);

		System.out.println(furniture.id);
		System.out.println(furniture.material);

		System.out.println(chair.id);
		System.out.println(chair.material);
		System.out.println(chair.legs);
		System.out.println(chair.hands);

		furniture.make();

		chair.make();
		chair.sell();

	}

	static void UC3() {

		Furniture furniture = new Furniture(10,"Plastic");
		Chair chair = new Chair(200,"Iron");

		System.out.println(furniture.id);
		System.out.println(furniture.material);

		System.out.println(chair.id);
		System.out.println(chair.material);

		furniture.make();
		chair.make();
	
	}



	static void UC2() {
		
		Furniture furniture = new Furniture(10,"Plastic");
		Chair chair = new Chair();

		System.out.println(furniture.id);
		System.out.println(furniture.material);

		System.out.println(chair.id);
		System.out.println(chair.material);

		furniture.make();
		chair.make();
	}

	static void UC1() {

		Furniture furniture = new Furniture();
		Chair chair = new Chair();

		System.out.println(furniture.id);
		System.out.println(furniture.material);

		System.out.println(chair.id);
		System.out.println(chair.material);

		furniture.make();
		chair.make();
	}
}
