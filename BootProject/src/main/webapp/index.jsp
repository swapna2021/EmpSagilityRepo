<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Sagility</h1>
	<form action="index" method="get" modelAttribute="user">
		<label for="uname">Username :</label>
		<input type="text" name="uname" >
		<label for="id">UserId :</label>
		<input type="number" name="id" >
		<input type="submit" value="submit">
	</form>
</body>
</html>