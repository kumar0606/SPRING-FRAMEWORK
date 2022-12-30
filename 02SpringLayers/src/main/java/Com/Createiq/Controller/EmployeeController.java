package Com.Createiq.Controller;



import Com.Createiq.Model.Employee;
import Com.Createiq.Service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}


	public void save(Employee Employee) {
		System.out.println("employee controller save method");
		employeeService.save(Employee);
	}
}
