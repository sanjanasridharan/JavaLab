<%@page import="java.io.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fill Form</title>
</head>
<body>
<%
PrintWriter pw=response.getWriter();
String name=request.getParameter("name");
String password=request.getParameter("pass");
HashMap<String,String> hm=new HashMap<String,String>();
hm.put("sanjana","sanjana");
hm.put("manju","manju");
hm.put("ram","ram");
if(hm.containsKey(name)&&password.equals(hm.get(name)))
{
  pw.println("Welcome "+name);
  pw.println("Date: "+new Date());

	%>
<form action="CalculateTax.jsp" method="get">
 Name:<input type="text" name="name"><br>
 Place of Work:<select name="work">
   <option >Doc</option>
   <option >Engineer</option>
   <option >Nurse</option>
   
</select><br>
Gender:<select name="gender">
   <option  >Female</option>
   <option >Male</option>
   
</select><br>
Annual Income:<input type="number" name="income">
<br>
<input type="submit">
</form>
<%
}else{

%>
<jsp:forward page="Login.html"></jsp:forward>
<%
}%>

</body>
</html>