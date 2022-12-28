package Com.SpringHikari;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class Hikari {
public static void main(String[] args) {
	HikariDataSource hikari=new HikariDataSource();
	hikari.setJdbcUrl("jdbc:mysql://localhost:3306/Spring_db");
	hikari.setDriverClassName("com.mysql.cj.jdbc.Driver");
	hikari.setUsername("root");
	hikari.setPassword("Ravi@1999");
	
	Connection con=null;
	try {
		con=hikari.getConnection();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("hikari connection"+con);
}
}
