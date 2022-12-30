package Com.Createiq.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.Createiq.DAO.EmployeeDAO;
import Com.Createiq.Model.Employee;
@Component("empserviceimpl")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	


	public void save(Employee employee) {
		System.out.println("employee service method called....");
		employeeDAO.save(employee);
	}

}
