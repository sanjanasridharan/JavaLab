<%@ page import="java.io.*" %>
<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate</title>
</head>
<body>
 <%
   PrintWriter pw =response.getWriter();
   String name=request.getParameter("name");
   String pass=request.getParameter("pass");
   HashMap<String,String> hm=new HashMap<String,String>();
   hm.put("sanjana","sanjana");
   hm.put("manju","manju");
   hm.put("ram","ram");
   if(hm.containsKey(name)&& pass.equals(hm.get(name)))
   {
	     pw.println("WELCOME");
	     pw.println(new Date());
   
   %>
 <form  action ="CalculateTaxjsp.jsp" method="get">
   Enter Name:<input type="text" name="name"><br>
   Work:<select name="work">
     <option>Engineer</option>
     <option>Doc</option>
    </select><br>
   Gender:<select name="gender">
     <option>Female</option>
     <option>Male</option>
    </select><br>
    Annual Income:<input type="number" name="income">
    
    <input type="submit" value="calculate tax">    
 
 </form>
 
 <%
 }else
 {
 %>
  <jsp:forward page="index.html"></jsp:forward>
  <%
  }%>
</body>
</html>