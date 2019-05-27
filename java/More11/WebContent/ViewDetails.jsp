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
 String name=request.getParameter("name");
int fno=Integer.parseInt(request.getParameter("fno"));
int sno=new Random().nextInt(500)+1;
String phone=request.getParameter("phone");
String date=request.getParameter("date");
String url="jdbc:mysql://localhost:3306/More11";
String uname="root";
String pass="dass2017";
String query="insert into SeatReservation values("+fno+",'"+date+"',"+sno+",'"+name+"','"+phone+"')";
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	
	try
	{
		st.executeUpdate(query);
		p.println("fno: "+fno+"<br> sno: "+sno+"<br>date: "+date+"<br>name: "+name+"<br>phone: "+phone);
	}
	catch(Exception e)
	{
		p.println("could not make reservation");
	}
}
	catch(Exception e)
	{
		e.printStackTrace();
	}




%>

</body>
</html>