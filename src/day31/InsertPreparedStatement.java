package day31;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import day30.MySQLConnectionITV;

public class InsertPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Eno"); //18
		int a=sc.nextInt();
		
		System.out.println("Enter Ename");  //Sam
		String b=sc.next();
		
		System.out.println("Enter Sal"); //900
		int c=sc.nextInt();
		
		String query="insert into emp values(?,?,?)"; 			//first
		PreparedStatement ps=con.prepareStatement(query);		//second
		
		ps.setInt(1, a);										//third
		ps.setString(2, b);
		ps.setInt(3, c);
		
		int rows=ps.executeUpdate();							//fourth - no need to pass query again
		
		if(rows>0)
			System.out.println(rows + " Record Inserted");
		else
			System.out.println("No Record Iserted");
		

		ps.close();
		con.close();
		
		
	}

}
