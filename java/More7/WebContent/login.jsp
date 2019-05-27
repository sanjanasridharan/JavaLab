<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Tshirt </h1>
<form action="Tshirt.java" method="get">
Accessories:<br><input type="checkbox" name="acc" value="belt">BELT<br>
            <input type="checkbox" name="acc" value="cap">CAP<br>
            <input type="checkbox" name="acc" value="hair Band">Hair Band<br>
TagLine:<input type="text" name="tag"><br>
ChestPacket:<br><input type="radio" name="poc" value="yes">YES<br>
               <input type="radio" name="poc" value="no">NO<br>
ShirtColor:<br>
<select name="color">
<option>Blue</option>
<option>Black</option>

</select><br>

<input type="submit">
</form>

</body>
</html>