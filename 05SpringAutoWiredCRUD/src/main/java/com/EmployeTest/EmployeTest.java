package com.EmployeTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.EmployeController.EmployeController;
import com.EmployeModel.Employe;

public class EmployeTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeController empcont = (EmployeController) ac.getBean("empcontroller");
		Employe employe = new Employe(204, "pawan kumar", 80000.00);
		//empcont.save(employe);
		empcont.update(employe);
		//empcont.deleteByid(202);
		
	}
}
