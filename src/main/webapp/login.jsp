<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please Enter Login Credentials !</h1>
<a style = "float:right;margin-right:100px" href="index">Home</a><br> 
<center>
<form action="/result" method="post">
<p>User Name <input type = "text" name = "name" required></p>
<p>User Password <input type = "password" name = "pass" required></p>
<input type = "submit" value = "Login">
</form>
</center>
</body>
</html>