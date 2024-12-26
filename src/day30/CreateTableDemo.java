package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   //8.0.33 com.mysql.cj.jdbc.Driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itvjdbcdb","root","");
		
		Statement st=con.createStatement();
		
		String query="create table emp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10),\r\n"
				+ "salary int(5))";
		
		st.execute(query);
		
		System.out.println("ITV Table Created");
		
		st.close();
		con.close();

	}

}
