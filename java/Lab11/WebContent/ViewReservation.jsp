<%@page import ="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Details</title>
</head>
<body>

 <%
     PrintWriter pw=response.getWriter();
     int fno=Integer.parseInt(request.getParameter("fno"));
     String date=request.getParameter("date");
     int sno=new Random().nextInt(500)+1;
     String name=request.getParameter("name");
     String ph=request.getParameter("phno");
     String url="jdbc:mysql://localhost:3306/Lab11";
     String uname="root";
     String password="dass2017";
     String query="insert into SeatReservation values("+fno+",'"+date+"',"+sno+",'"+name+"','"+ph+"')";
     
     try
     {
    	 Class.forName("com.mysql.jdbc.Driver");
    	 Connection con= DriverManager.getConnection(url,uname,password);
    	 Statement st =con.createStatement();
    	 try
    	 {
    		 st.executeUpdate(query);
    		 pw.println("Flight no: "+fno+"\nDate: "+date+"\nseat no: "+sno+"\nName: "+name+"\nPhone no: "+ph);
    	 }
    	 catch(Exception e)
    	 {
    		 pw.println("Could not make reservation");
    	 }
    }
 
      catch(Exception e)
     {
    	  e.printStackTrace();
     }
 
 %>

</body>
</html>