package day31;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import day30.MySQLConnectionITV;

public class DeleteUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		Statement st=con.createStatement();
		
		String query="delete from emp where salary<1000";
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows + " Record Deleted");
		else
			System.out.println("No Record Deleted");
		

		st.close();
		con.close();
	}

}
