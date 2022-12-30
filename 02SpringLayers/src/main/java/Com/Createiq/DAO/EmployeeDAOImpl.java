package Com.Createiq.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.Createiq.Model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
  private DataSource dataSource;


	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}


	public void save(Employee employee) {
		System.out.println("employee dao save method called");
//		try {
//			System.out.println(dataSource.getConnection());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=dataSource.getConnection();
			ps=con.prepareStatement("INSERT INTO EMPLOYE VALUES(?,?,?)");
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setDouble(3, employee.getEsal());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
