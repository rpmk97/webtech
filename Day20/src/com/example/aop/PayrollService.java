package com.example.aop;

import org.springframework.stereotype.Service;

@Service("payrollServiceTarget")
public class PayrollService {

	public void calculateHRA(double salary) {
		System.out.printf("HRA : %s for %s Salary!!%n", (salary * .50), salary);
	}

	public void calculateDA(double salary) {
		System.out.printf("DA : %s for %s Salary!!%n", (salary * .10), salary);
	}

	public void calculateTA(double salary) {
		System.out.printf("TA : %s for %s Salary!!%n", (salary * .08), salary);
	}

	public void calculateTDS(double salary) {
		System.out.printf("TDS : %s for %s Salary!!%n", (salary * .30), salary);
	}

}
