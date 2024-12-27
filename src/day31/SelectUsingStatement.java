package day31;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import day30.MySQLConnectionITV;

public class SelectUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		
		Statement st=con.createStatement();
		
		String query="select ename,eno from emp where salary<1000";
		
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			//System.out.println(rs.getInt(1) + " " + rs.getString(2));
			System.out.println(rs.getInt("eno") + " " + rs.getString("ename"));
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
