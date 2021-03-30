class Chair extends Furniture {

	int legs;
	int hands;

	Chair () {
		super(500,"Gold");
		this.legs = 4;
		this.hands = 2;
		System.out.println("Inside Chair() constructor!!!!!");
	}

	Chair (int id,String material) {
		super(id,material);
		this.legs = 4;
		this.hands = 2;
		System.out.println("Inside Chair(int id,String material) constructor!!!!!");
	}

	Chair (int id,String material,int legs,int hands) {
		super(id,material);
		this.legs = legs;
		this.hands = hands;
		System.out.println("Inside Chair(int id,String material) constructor!!!!!");
	}

	void info() {
		//System.out.printf("ID : %s%n",this.id);
		//System.out.printf("Material : %s%n",this.material);
		super.info();
		System.out.printf("Legs : %s%n",this.legs);
		System.out.printf("Hands : %s%n",this.hands);
	}


	void make() {
		System.out.printf("Chair is made of %s%n",this.material);
	}

	void sell() {
		System.out.println("Chair sold in $2 million!!");
	}
}
