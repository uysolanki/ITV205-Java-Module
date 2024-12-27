package day31;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day30.MySQLConnectionITV;

public class SelectPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Base Sal"); //900
		int c=sc.nextInt();
		
		String query="select ename,eno from emp where salary>?"; 		
		PreparedStatement ps=con.prepareStatement(query);		
		
		ps.setInt(1, c);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			//System.out.println(rs.getInt(1) + " " + rs.getString(2));
			System.out.println(rs.getInt("eno") + " " + rs.getString("ename"));
		}
		
		rs.close();
		ps.close();
		con.close();
		
		
	}

}
