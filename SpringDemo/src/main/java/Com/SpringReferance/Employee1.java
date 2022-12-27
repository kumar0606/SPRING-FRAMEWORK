package Com.SpringReferance;

public class Employee1 {
	int eid;
	String ename;
	double esal;
	Address adress;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", adress=" + adress + "]";
	}

}
