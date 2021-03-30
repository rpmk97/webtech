class Employee {

	int id;
	String name;
	double salary;
	String desig;
	String dept;
	String project;

	void updateSalary(double percentage) {
		this.salary = this.salary + this.salary * percentage;
		System.out.println("Salary is updated successfully!!!!");
	}	

	void assignProject(String project) {
		this.project = project;
		System.out.println(this.name+" is assigned a new project!!!!");
	}	

	void applyForLeave(int days) {
		System.out.println(this.name+" applyed for "+days+" days leave!!!!");
	}	

	void fillTimeSheet() {
		System.out.println(this.name+" filed time sheet for today!!!!");
	}	
	
}
