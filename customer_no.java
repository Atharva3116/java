import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class Ass4Setb1
 */
@WebServlet("/ass4setb1")
public class ass4setb1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql:gayatri","postgres","postgres");
			if(con != null)
				out.println("COnnection Successfull");
			else
				out.println("Connection Failed");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from customer where cno = "+request.getParameter("cno"));
			if(rs.next())
			{
				out.println("<h3>"+rs.getInt(1)+" - "+rs.getString(2)+"</h3>");
			}
			else
				out.println("Record not found!");
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
}