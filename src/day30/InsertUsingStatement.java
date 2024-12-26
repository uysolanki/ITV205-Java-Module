package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");   //8.0.33 com.mysql.cj.jdbc.Driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itvjdbcdb","root","");
		
		Statement st=con.createStatement();
		
		String query="insert into emp values(101,'Alice',800)";
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows + " Record Inserted");
		else
			System.out.println("No Record Iserted");
		

		st.close();
		con.close();
	}

}
