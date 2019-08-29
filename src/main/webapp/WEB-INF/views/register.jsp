<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>Registration page.....</h1>

<form action="/register">
Name : <input type="text" name="name" placeholder="Enter your name"><br><br>
Date Of Birth : <input type="date" name="dob"><br><br>
Department Name : <input type="text" name="deptName"   placeholder="Enter department name"><br><br>
Street : <input type="text" name="street" placeholder="Enter street name"><br><br>
City : <input type="text" name="city" placeholder="Enter city name"><br><br>
State : <input type="text" name="state" placeholder="Enter state name"><br><br>
Zip : <input type="text" name="zip" placeholder="Enter zip"><br><br>
<button type="submit">Register</button>

</form>
</body>
</html>