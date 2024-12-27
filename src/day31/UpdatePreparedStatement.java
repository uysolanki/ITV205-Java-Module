package day31;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import day30.MySQLConnectionITV;

public class UpdatePreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Eno to be updated"); //18
		int a=sc.nextInt();
		
		System.out.println("Enter New Ename");  //Sam
		String b=sc.next();
		
		System.out.println("Enter New Sal"); //900
		int c=sc.nextInt();
		
		String query="update emp set ename=?,salary=? where eno=?";  		
		PreparedStatement ps=con.prepareStatement(query);		
		
		ps.setString(1, b);
		ps.setInt(2, c);
		ps.setInt(3, a);										
		
		
		
		int rows=ps.executeUpdate();							
		
		if(rows>0)
			System.out.println(rows + " Record Updated");
		else
			System.out.println("No Record Updated");
		

		ps.close();
		con.close();
		
		
	}

}
