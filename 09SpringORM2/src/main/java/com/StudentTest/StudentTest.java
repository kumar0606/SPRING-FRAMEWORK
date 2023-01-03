package com.StudentTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.StudentController.StudentController;
import com.StudentModel.Student;

public class StudentTest {
	public static void main(String[] args) {
		
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	StudentController stc=(StudentController) ac.getBean("studentController");
	Student st = new Student(104, "venkatkumar", 80000.00, "manikumar@gmail.com");
	//stc.save(st);
	//stc.update(st);
	//stc.FindById(101);
	stc.deletebyid(104);
	//stc.FindAll().forEach(System.out::println);
}
}