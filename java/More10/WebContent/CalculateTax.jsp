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
  double tax;
  String name=request.getParameter("name");
  String work=request.getParameter("work");
  String gender=request.getParameter("gender");
  int income=Integer.parseInt(request.getParameter("income"));
  PrintWriter pw=response.getWriter();
  pw.println("Name: "+name+"<br>");
  pw.println("Work: "+work+"<br>"); 
  pw.println("Gender: "+gender+"<br>");
  if(income<100000)
  {
	  pw.println("\nYou shall not pay income tax");
	  
  }
  if(income>100000&&income<=500000)
  {
	  pw.println("\nYou will have to pay 15% of tax<br>");
	  tax=(income-100000)*0.15;
	  pw.println("Tax:"+tax);
  }
  if(income>500000)
  {
	  pw.println("\nYou will have to pay 20% of tax");
	  tax=(income-500000)*0.20+(400000*0.15);
  }

%>
<form action="Login.html" method="get">
 <br><br>
 <input type="submit" value="Logout">

</form>


</body>
</html>