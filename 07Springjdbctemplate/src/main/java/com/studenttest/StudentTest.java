package com.studenttest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studentcontroller.Studentcontroller;
import com.studentmodel.Student;

public class StudentTest {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
	Studentcontroller stc=(Studentcontroller) ac.getBean("studentcontroller");
	Student student=new Student(106, "dileep kumar", 300000.00);
stc.save(student);
	//stc.update(student);
	//stc.deletebyid(102);
//	System.out.println("success query");
	//stc.findAll().forEach(System.out::println);
	
}
}
