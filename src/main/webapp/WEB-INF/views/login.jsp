<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Page!!!! </h1>

<h2>${error}</h2>
<form action="/login" method="post">

USERNAME : <input type="text" placeholder="Enter user name" name="name"><br><br>
PASSWORD : <input type="password" placeholder="Enter password" name="password"><br><br>

<button type="submit">Login</button>
</form>
</body>
</html>