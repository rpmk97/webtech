class EmployeeDemo {
	
	public static void main(String[]  args) {
		//UC1();
		//UC2();
		//UC3();
		//UC4();
		//UC5();
		//UC6();
		UC7();
	}

	static void UC7() {

		Employee employee1 = new Employee(1,"Ghanshu",12000.00,"Lead","SW","WallMart Retail"); 	
		Employee employee2 = new Employee(2,"Chandu",15000.00,"Sr Developer","SW","JLR"); 	
		Employee employee3 = new Employee(3,"Jaggu",18000.00,"Architect","SW","HSBC Banking"); 	

		employee1.display();
		employee2.display();
		employee3.display();

		System.out.println("Done!!!!");
	}



	static void UC6() {

		Employee employee1 = new Employee(1,"Ghanshu",12000.00,"Lead","SW","WallMart Retail"); 	
		Employee employee2 = new Employee(2,"Chandu",15000.00,"Sr Developer","SW","JLR"); 	
		Employee employee3 = new Employee(3,"Jaggu",18000.00,"Architect","SW","HSBC Banking"); 	

		System.out.println(employee1.id);
		System.out.println(employee1.name);
		System.out.println(employee1.salary);
		System.out.println(employee1.desig);
		System.out.println(employee1.dept);
		System.out.println(employee1.project);

		System.out.println(employee2.id);
		System.out.println(employee2.name);
		System.out.println(employee2.salary);
		System.out.println(employee2.desig);
		System.out.println(employee2.dept);
		System.out.println(employee2.project);

		System.out.println(employee3.id);
		System.out.println(employee3.name);
		System.out.println(employee3.salary);
		System.out.println(employee3.desig);
		System.out.println(employee3.dept);
		System.out.println(employee3.project);


		System.out.println("Done!!!!");
	}




	static void UC5() {

		Employee employee1 = new Employee(); 	
		Employee employee2 = new Employee(); 	

		System.out.println(employee1.id);
		System.out.println(employee1.name);
		System.out.println(employee1.salary);
		System.out.println(employee1.desig);
		System.out.println(employee1.dept);
		System.out.println(employee1.project);

		System.out.println(employee2.id);
		System.out.println(employee2.name);
		System.out.println(employee2.salary);
		System.out.println(employee2.desig);
		System.out.println(employee2.dept);
		System.out.println(employee2.project);

		employee1.applyForLeave(10);
		employee2.applyForLeave(560);

		employee1.fillTimeSheet();
		employee2.fillTimeSheet();

		employee1.updateSalary(500.00);
		System.out.println(employee1.salary);

		employee2.updateSalary(2.00);
		System.out.println(employee2.salary);

		System.out.println("Done!!!!");
	}



	static void UC4() {

		Employee employee1 = new Employee(); 	
		Employee employee2 = new Employee(); 	

		employee1.id = 1001;
		employee1.name = "Jaggu";
		employee1.salary = 500.00;
		employee1.desig = "Jr Developer";
		employee1.dept = "SW";
		employee1.project = "Core Banking";


		employee2.id = 1002;
		employee2.name = "Pintu";
		employee2.salary = 9000000.00;
		employee2.desig = "Sr Developer";
		employee2.dept = "SW";
		employee2.project = "Loan Banking";

		System.out.println(employee1);
		System.out.println(employee1.id);
		System.out.println(employee1.name);
		System.out.println(employee1.salary);
		System.out.println(employee1.desig);
		System.out.println(employee1.dept);
		System.out.println(employee1.project);



		System.out.println(employee2);
		System.out.println(employee2.id);
		System.out.println(employee2.name);
		System.out.println(employee2.salary);
		System.out.println(employee2.desig);
		System.out.println(employee2.dept);
		System.out.println(employee2.project);

		employee1.applyForLeave(10);
		employee2.applyForLeave(560);

		employee1.fillTimeSheet();
		employee2.fillTimeSheet();

		employee1.updateSalary(500.00);
		System.out.println(employee1.salary);

		employee2.updateSalary(2.00);
		System.out.println(employee2.salary);

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
