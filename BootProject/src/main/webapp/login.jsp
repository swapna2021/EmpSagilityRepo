<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login form</h1>
	<form action="auth" >
	<label for="uname">Username</label>
	<input type="text" name="uname"><br>
	<label for="pwd">Password</label>
	<input type="password" name="pwd"> <br>
	<input type="submit" value="submit">
	</form>
</body>
</html>