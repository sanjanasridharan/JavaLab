<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>


    Check availablity --><a href="ShowFlights.jsp">Click Here</a>
 
  <form action="ViewReservation.jsp" method="get">
   Flight Number:<input type="text" name="fno"><br>
   Date:<input type="text" name="date"><br>
   Name:<input type="text" name="name"><br>
   Phone No:<input type="text" name="phno"><br>
    <input type="submit" value="reserve"><br><br>
  </form>


  
  



</body>
</html>