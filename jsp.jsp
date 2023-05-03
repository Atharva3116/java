<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
<br>
<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%> 
<br>

</body>
</html>