<%@ page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
PrintWriter p=response.getWriter();
String day=request.getParameter("day");
String url="jdbc:mysql://localhost:3306/More11";
String uname="root";
String pass="dass2017";
String query="select * from Flight where Weekdays = '"+day+"'";
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	
     while(rs.next())
{
	   response.getWriter()
	            .append("Flight No: "+rs.getInt(1)+"\n")
	            .append("Airline name: "+rs.getString(2)+"\n")
	            .append("Weekday: "+rs.getString(3)+"\n")
	            .append("\n");
}
}
catch(Exception e)
{
e.printStackTrace();  
}



%>
<form action="ReserveOnline.jsp" method="get">
<br>
<input type ="submit" value="make reservation" ><br>
</form>
</body>
</html>