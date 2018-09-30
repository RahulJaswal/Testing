import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class odbc {
	public static void main(String str[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("jdbc:odbc:driver");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("Select * from myTable");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
			rs.close();
			st.close();
			c.close();
		}
		catch(Exception c)
		{
			System.out.println("error occured!");
			System.out.println(c);
		}
		
	}

}
