package com.StudentModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentORM")
public class Student {
	@Id
	private int sid;
	@Column
	private String sname;
	@Column
	private double sfee;
	@Column
	private String semail;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double sfee, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.semail = semail;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSfee(double sfee) {
		this.sfee = sfee;
	}

	public void setEmail(String semail) {
		this.semail = semail;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", semail=" + semail + "]";
	}

}
