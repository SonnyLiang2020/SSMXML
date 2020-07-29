<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<c:forEach  items="${requestScope.users}" var="user" varStatus="id" begin="1">
		<div class="form-group">
			<label for="username">  ID：</label>
			<p>${user.id}</p>
		</div>
		<div class="form-group">
			<label for="username">用户名：</label>
			<p>${user.username}</p>
		</div>
		<div class="form-group">
			<label for="username">密   码：</label>
			<p>${user.password}</p>
		</div>
		<div class="form-group">
			<label for="username">状  态：</label>
			<p>${user.status}</p>
		</div>
	</c:forEach>
</body>
</html>