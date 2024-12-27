package day30;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteBatchDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnectionITV.getConnection();
		
		Statement st=con.createStatement();
		String query;
		query="insert into emp values(101,'David',1000)";
		st.addBatch(query);
		
		query="insert into emp values(103,'Chris',700)";
		st.addBatch(query);
		
		query="insert into emp values(104,'Ben',1100)";
		st.addBatch(query);
		
		query="insert into emp values(105,'Elcid',900)";
		st.addBatch(query);
		int rows[]=st.executeBatch();
		
		System.out.println(rows.length + " Records Inserted");
		
		
		st.close();
		con.close();

	}

}
