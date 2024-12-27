package day31;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import day30.MySQLConnectionITV;

public class DeletePreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Eno to be updated"); //18
		int a=sc.nextInt();
			
		String query="delete from emp where eno=?";  		
		PreparedStatement ps=con.prepareStatement(query);		
		
		ps.setInt(1, a);
											
		
		int rows=ps.executeUpdate();							
		
		if(rows>0)
			System.out.println(rows + " Record Deleted");
		else
			System.out.println("No Record Deleted");
		

		ps.close();
		con.close();
		
		
	}

}
