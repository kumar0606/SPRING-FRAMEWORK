package Com.SpringReferance;

public class Student {
int sid;
String sname;
double sfee;
Address address;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public double getSfee() {
	return sfee;
}
public void setSfee(double sfee) {
	this.sfee = sfee;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", address=" + address + "]";
}



}
