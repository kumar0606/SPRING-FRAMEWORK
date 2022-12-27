package Com.SpringDemo;

public class Student {
private int sid;
private String sname;
private double sfee;


public void setSid(int sid) {
	this.sid = sid;
}


public void setSname(String sname) {
	this.sname = sname;
}


public void setSfee(double sfee) {
	this.sfee = sfee;
}


@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
}


}
