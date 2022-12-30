package Com.Createiq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Createiq.Controller.EmployeeController;
import Com.Createiq.Model.Employee;

public class ControllerTest {


public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
	EmployeeController empcontroller= (EmployeeController) ac.getBean("empcontroller");
	Employee Employee=new Employee(101, "mahesh", 20.00);
	empcontroller.save(Employee);
	//System.out.println(empcontroller);
}
}
