<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr{
	border: 20px green;
	}
	a{
	background-color: yellow;
	color: red;
	}
	.edit{
	background-color: blue;
	color: yellow;
	}
	.back:hover{
		background-color: purple;
	}
	
</style>
</head>
<body>
	<table>
		<c:forEach items="${locations}" var="location">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="/deleteLocation?id=${location.id}">delete</a> </td>
				<td><a href="/editLocaion?id=${location.id}" class="edit">edit</a>
			</tr>
		</c:forEach>
	</table>
	<h2>
		<a href="/show-page" class="back">Go back</a>
	</h2>
</body>
</html>

