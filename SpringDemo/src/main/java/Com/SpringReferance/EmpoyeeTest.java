package Com.SpringReferance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmpoyeeTest {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring_referance.xml");
	 Employee1 emp1= (Employee1) ac.getBean("employee");
	 System.out.println(emp1);
	 Student st= (Student) ac.getBean("stu");
	 System.out.println(st);
}
}
