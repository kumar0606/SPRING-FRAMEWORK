package Com.Createiq.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.Createiq.Model.Employee;
import Com.Createiq.Service.EmployeeService;
@Component("empcontroller")
public class EmployeeController {
@Autowired
	private EmployeeService employeeService;
	


	public void save(Employee Employee) {
		System.out.println("employee controller save method");
		employeeService.save(Employee);
	}
}
