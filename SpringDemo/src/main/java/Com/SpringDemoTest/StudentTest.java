package Com.SpringDemoTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.SpringDemo.Student;

public class StudentTest {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");
	Student st=(Student) ac.getBean("student");
	System.out.println(st);
}
}
