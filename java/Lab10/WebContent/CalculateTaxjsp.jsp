<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tax</title>
</head>
<body>
<%
int income=Integer.parseInt(request.getParameter("income"));
PrintWriter pw=response.getWriter();
if(income<100000)
{
  	pw.println("There shall be no income tax for u");
  			
}
if(income>100000 && income<=500000)
{
	pw.println("You have to pay 15% of ur income as tax");
	double tax=(income-100000)*.15;
	pw.println(tax);
}
if(income>500000)
{
	pw.println("20% 500000 onwards");
	double tax=(income-500000)*.20+400000*.15;
	pw.println(tax);
}




%>








</body>
</html>