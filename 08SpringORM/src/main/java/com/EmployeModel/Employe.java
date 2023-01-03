package com.EmployeModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeORM")
public class Employe {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eid;
	@Column
	String ename;
	@Column
	double esal;
	public Employe() {
	}

	public Employe(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

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

	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
