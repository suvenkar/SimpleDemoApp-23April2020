<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please Enter User Details !</h1>
<a style = "float:right;margin-right:100px" href="index">Home</a><br> 
<center>
<form action="/result" method="post">
<p>User Name <input type = "text" name = "name" required></p>
<p>User Password <input type = "password" name = "pass" required></p>
<p>User Email <input type = "email" name = "email" required></p>
<p>User Contact <input type = "number" name = "contact" required></p>

<input type="submit" value="Register">
</form>
</center>

</body>
</html>