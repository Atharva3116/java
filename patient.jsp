<%@ page language="java" contentType="text/html; charset=UTF-8" import = "java.util.* ,java.sql.*,java.io.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border =1>
<tr>
<th>PatientNo</th>
<th>PatientName</th>
<th>Address</th>
<th>Age</th>
<th>Diseases</th>
</tr>
<%
try{
Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection("jdbc:postgresql:gayatri","postgres","postgres");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("Select * from patient");
while(rs.next())
{%>
<tr>
<td><%= rs.getInt(1)%></td>
<td><%= rs.getString(2)%></td>

<td><%= rs.getString(3)%></td>
<td><%= rs.getInt(4)%></td>
<td><%= rs.getString(5)%></td>
</tr>
<%} 
}catch(Exception e)
{}%>
</table>	
</body>
</html>