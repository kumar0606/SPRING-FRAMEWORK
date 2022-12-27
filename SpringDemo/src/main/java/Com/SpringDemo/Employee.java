package Com.SpringDemo;

public class Employee {
int eid;
String ename;
Double salary;
public Employee(int eid, String ename, Double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}

}
