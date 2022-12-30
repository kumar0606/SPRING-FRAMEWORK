package com.EmployeDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeModel.Employe;
@Component("empdaoimpl")
public class EmployeDAOImpl implements EmployeDAO {
@Autowired
	private DataSource datasource;
	public void save(Employe employe) {
		System.out.println("dao impl method");
//		try {
//			datasource.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=datasource.getConnection();
			ps=con.prepareStatement("INSERT INTO EMPLOYEAUTO VALUES(?,?,?)");
			ps.setInt(1, employe.getEid());
			ps.setString(2, employe.getEname());
			ps.setDouble(3, employe.getEsal());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void update(Employe employe) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=datasource.getConnection();
			ps=con.prepareStatement("UPDATE EMPLOYEAUTO SET ENAME=?, ESAL=? WHERE EID=?");
			ps.setString(1, employe.getEname());
			ps.setInt(3, employe.getEid());
			ps.setDouble(2, employe.getEsal());
		
			//ps.setDouble(3, employe.getEsal());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	public void deleteByid(Integer eid) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=datasource.getConnection();
			ps=con.prepareStatement("DELETE  FROM EMPLOYEAUTO WHERE EID=?");
			ps.setInt(1, eid);
		
			//ps.setDouble(3, employe.getEsal());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
