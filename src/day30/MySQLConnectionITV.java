package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionITV {

	private static Connection con;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");   //8.0.33 com.mysql.cj.jdbc.Driver
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itvjdbcdb","root","");
		return con;	
	}
}
