package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ins {
	
	public static void main(String aegs[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_d","root","");
		PreparedStatement ps = con.prepareStatement("insert into reg values (2,'Nikunj')");
		int i = ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("Connect");
		}
		else
		{
			System.out.println("Error");
		}
	}
}
