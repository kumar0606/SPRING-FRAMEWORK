package Com.SpringDataSource;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;



public class Basicdatasource {
public static void main(String[] args) {
	BasicDataSource basic = new BasicDataSource();
	basic.setUrl("jdbc:mysql://localhost/spring_db");
	basic.setDriverClassName("com.mysql.cj.jdbc.Driver");
	basic.setUsername("root");
	basic.setPassword("Ravi@1999");
	Connection con=null;
	try {
		con=basic.getConnection();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("connection"+con);
}
}
