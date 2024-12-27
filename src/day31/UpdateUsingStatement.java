package day31;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import day30.MySQLConnectionITV;

public class UpdateUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		
		Statement st=con.createStatement();  
		
		String query="update emp set ename='Nancy',salary=1800 where eno=101"; 
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows + " Record Updated");
		else
			System.out.println("No Record Updated");
		

		st.close();
		con.close();

	}

}
