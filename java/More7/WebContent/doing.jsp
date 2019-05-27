<%@ page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String url="jdbc:mysql://localhost:3306/More7";
	String uname="root";
	String password="dass2017";
	String query="select * from Tshirt";
	Connection con=null;
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(url,uname,password);
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Order Details</h1>
<table border=1>

  <thead>
    <th> Order no</th>
     <th> accessories</th>
     <th>tag</th>
     <th>pocket</th>
     <th>color</th>
  </thead>
  <tbody>
      <%while(rs.next()) {%>
  
        <tr>
          <td><%=rs.getInt("ono") %></td>
             <td><%=rs.getString("acc") %></td>
              <td><%=rs.getString("tag") %></td>
              <td><%=rs.getString("cpocket") %></td>
              <td><%=rs.getString("color") %></td>
  
        </tr>
   <%} %>
  
  
  
  
  
  </tbody>














</table>
</body>
</html>