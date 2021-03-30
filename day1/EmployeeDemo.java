class EmployeeDemo {
	
	public static void main(String[]  args) {
		//UC1();
		//UC2();
		//UC3();
		UC4();
	}

	static void UC4() {

		Employee employee1 = new Employee(); 	
		Employee employee2 = new Employee(); 	

		employee1.id = 1001;
		employee1.name = "Jaggu";

		employee2.id = 1002;
		employee2.name = "Pintu";

		System.out.println(employee1);
		System.out.println(employee1.id);
		System.out.println(employee1.name);

		System.out.println(employee2);
		System.out.println(employee2.id);
		System.out.println(employee2.name);

		employee1.applyForLeave(10);
		employee2.applyForLeave(560);
		
		System.out.println("Done!!!!");
	}

	static void UC3() {
		Employee employee = new Employee(); 	
		System.out.println(employee);
		System.out.println("Done!!!!");
	}

	static void UC2() {
		Employee employee = null; //reference variable
		employee = new Employee(); //object creation	
		System.out.println(employee);
		System.out.println("Done!!!!");
	}

	static void UC1() {
		new Employee();		
		System.out.println("Done!!!!");
	}

}
