package Com.SpringComboPool;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Combopool {
	public static void main(String[] args) throws PropertyVetoException {
		ComboPooledDataSource combo = new ComboPooledDataSource();
		combo.setJdbcUrl("jdbc:mysql://localhost:3306/Spring_db");
		combo.setDriverClass("com.mysql.cj.jdbc.Driver");
		combo.setUser("root");
		combo.setPassword("Ravi@1999");
		Connection con = null;
		try {
			con = combo.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(con);
	}
}
