<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	#msg{
		font-family: Comic sans MS;
		color: green;
	}
	.h2{
		color: blue;
	}
	a{
	background-color: red;
	color: yellow;
	}
</style>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/add-location" method="post">
		Location Id<input type="text" name="id"><br>
		Location Code<input type="text" name="code"><br>
		Name Of Location<input type="text" name="name"><br>
		Type Of Location:<input type="radio" name="type" value="city">City<input type="radio" name="type" value="metro">Metro<input type="radio" name="type" value="village">Village<br>
		<input type="submit" value="Add">
	</form>
	<p id="msg">${message}</p>
	<h2>block <a href="/show-locations">See All owners</a></h2>
</body>
</html>