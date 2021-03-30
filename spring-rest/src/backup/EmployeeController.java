package backup;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class EmployeeController {

	// Resource URI ---- http://localhost:8080/spring-rest/api/employee
	//@RequestMapping(path = "/employee", method = RequestMethod.GET, produces = "text/plain")
	//@ResponseBody
	public String readEmployee() {
		System.out.println("=====  EmployeeController.readEmployee() =====");
		return "ID:1000,Name:Rohan,Salary:120000.00";
	}

	// Resource URI ---- http://localhost:8080/spring-rest/api/employee
	//@RequestMapping(path = "/employee", method = RequestMethod.GET, produces = { "text/xml", "application/xml" })
	//@RequestMapping(path = "/employee", method = RequestMethod.GET, produces = { "text/xml", MediaType.APPLICATION_XML_VALUE })
	//@ResponseBody
	public String readEmployeeDataAsXML() {
		System.out.println("=====  EmployeeController.readEmployeeDataAsXML() =====");
		return "<employee><id>1000</id><name>Rohan</name><salary>120000.00</salary></employee>";
	}

	// Resource URI ---- http://localhost:8080/spring-rest/api/employee
	//@RequestMapping(path = "/employee", method = RequestMethod.GET, produces = { "text/json", "application/json" })
	//@RequestMapping(path = "/employee", method = RequestMethod.GET, produces = { "text/json", MediaType.APPLICATION_JSON_VALUE })
	//@ResponseBody
	public String readEmployeeDataAsJSON() {
		System.out.println("=====  EmployeeController.readEmployeeDataAsJSON() =====");
		return "{\"id\":1000,\"name\":\"Rohan\",\"salary\":120000.00}";
	}

}
