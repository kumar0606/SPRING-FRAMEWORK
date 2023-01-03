package com.EmployeTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.EmployeController.EmployeController;
import com.EmployeModel.Employe;

public class EmployeTest {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
	EmployeController empc= (EmployeController) ac.getBean("employeController");
	Employe emp=new Employe(326, "prasad", 40000.00);
	//empc.save(emp);
	empc.FindAll().forEach(System.out::println);
	
	
}
}
