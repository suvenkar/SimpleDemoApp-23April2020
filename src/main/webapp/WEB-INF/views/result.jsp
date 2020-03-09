<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Result</title>
</head>
<body>

<center>
<p style="margin:100px;font-size:x-large;font-face:calibri">
<c:forEach items="${dataMap}"  var="item">
	<c:out value="${item.key}"></c:out>: <c:out value="${item.value[0]}"></c:out><br>
</c:forEach>
</p>
</center>
</body>
</html>