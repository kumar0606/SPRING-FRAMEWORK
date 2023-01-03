package com.EmployeTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.EmployeController.EmployeController;
import com.EmployeModel.Employe;

public class EmployeTest {
	static Logger logger = LoggerFactory.getLogger(EmployeTest.class);

	public static void main(String[] args) {
		logger.info("employetest starting");

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		EmployeController empc = (EmployeController) ac.getBean("employeController");
//		logger.info("save method starting");
		Employe emp = new Employe(328, "jyotish", 40000.00);
		empc.save(emp);
//		logger.info("save method ending");

//		logger.info("update method starting");
		Employe emp1 = new Employe(327, "dileep", 50000.00);
		empc.update(emp1);
//		logger.info("update method ending here");
//		empc.deletebyid(326);
//		logger.info("EmployeTest findall method start");
//		empc.FindAll().forEach(System.out::println);
//		logger.info("EmployeTest findall method end");

	}
}
