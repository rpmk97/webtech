class Employee {

	int id;
	String name;
	double salary;
	String desig;
	String dept;
	String project;

	/*Employee () {
		this.id = 1001;
		this.name = "Jaggu";
		this.salary = 500.00;
		this.desig = "Jr Developer";
		this.dept = "SW";
		this.project = "Core Banking";
		System.out.println("Inside Employee() constructor!!!!!");
	}*/

	Employee () {
		this(100,"Sheru",3000.00,"Developer","SW","Retail");
		System.out.println("Inside Employee() constructor!!!!!");
	}


	Employee (int id,String name,double salary,String desig,String dept,String project) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
		this.dept = dept;
		this.project = project;
		System.out.println("Inside Employee(int id,String name,double salary,String desig,String dept,String project) constructor!!!!!");
	}

	void display() {
		System.out.println("ID : "+this.id);
		System.out.println("NAME : "+this.name);
		System.out.println("SALARY : "+this.salary);
		System.out.println("DESIG : "+this.desig);
		System.out.println("DEPT : "+this.dept);
		System.out.println("PROJECT : "+this.project);
		System.out.println("=====================================");
	}

	void updateSalary(double percentage) {
		this.salary = this.salary + this.salary * percentage;
		System.out.println("Salary is updated successfully!!!!");
	}	

	void assignProject(String project) {
		this.project = project;
		System.out.println(this.name+" is assigned a new project!!!!");
	}	

	void applyForLeave(int days) {
		System.out.println(this.name+" applied for "+days+" days leave!!!!");
	}	

	void fillTimeSheet() {
		System.out.println(this.name+" filled time sheet for today!!!!");
	}	
	
}
