<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <a href="Check.jsp">Check Flight</a><br>
 <form action="ViewDetails.jsp" method="get">
 Flight Number:<input type="number" name="fno"><br>
 Date:<input type="text" name="date"><br>
 Name:<input type="text" name="name"><br>
 Phone:<input type="text" name="phone"><br>
 <input type="submit">
 </form>

</body>
</html>