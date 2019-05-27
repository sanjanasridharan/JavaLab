<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flights</title>
</head>
<body>

<%
  
  String url="jdbc:mysql://localhost:3306/Lab11";
  String name="root";
  String password="dass2017";
  %>
  <form action="ShowFlights.jsp" method="get">
Day:<input type="text" name="day">
<input type ="submit"><br>
</form>
 <% 
 String day =request.getParameter("day");
 if(day!=null){
  String query="select * from Flight where Weekdays= '"+day+"'";
  try
  {
	  Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection(url,name,password);
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

 }
 
 %>
<form action="Reservation.jsp" method="get">
<br>
<input type ="submit" value="make reservation" ><br>
</form>

</body>
</html>