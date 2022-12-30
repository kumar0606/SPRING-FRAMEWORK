package Com.Createiq.Service;


import Com.Createiq.DAO.EmployeeDAO;
import Com.Createiq.Model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}


	public void save(Employee employee) {
		System.out.println("employee service method called....");
		employeeDAO.save(employee);
	}

}
