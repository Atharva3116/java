

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ass4SetA1
 */
@WebServlet("/ass4seta1")
public class ass4seta1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		java.util.Properties p  = System.getProperties();
		out.println("Server Name : "+request.getServerName()+"<br>");
		out.println("Ip Address : "+request.getRemoteAddr()+"<br>");
		out.println("Remote User : "+request.getRemoteUser()+"<br>");
		out.println("Remote Host : "+request.getRemoteHost()+"<br>");
		out.println("Local Name : "+request.getLocalName()+"<br>");
		out.println("Server Port : "+request.getServerPort()+"<br>");
		out.println("Protocol Name : "+request.getProtocol()+"<br>");
		out.println("Os & Browser Details : "+request.getHeader("User-Agent")+"<br>");

	}

}