import java.sql.*;
import java.io.*;
class ass3seta2
{
	public static void main(String[] args)throws SQLException
	{
		Connection con= null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con= DriverManager.getConnection("jdbc:postgresql:student","postgres","");
			DatabaseMetaData dbmd = con.getMetaData();
			rs = dbmd.getTables(null, null, null,new String[] {"TABLE"});
			while (rs.next())
				System.out.println( rs.getString("TABLE_NAME"));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("ERROR"+e);
		}
	}
}
			       
