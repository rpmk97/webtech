class Furniture {

	int id;
	String material;

	Furniture () {
		this.id = 1;
		this.material = "Wood";
		System.out.println("Inside Furniture() constructor!!!!!");
	}
	
	Furniture (int id,String material) {
		this.id = id;
		this.material = material;
		System.out.println("Inside Furniture(int id,String material) constructor!!!!!");
	}

	void info() {
		System.out.printf("ID : %s%n",this.id);
		System.out.printf("Material : %s%n",this.material);
	}

	void make() {
		System.out.printf("Furniture is made of %s%n",this.material);
	}
}
