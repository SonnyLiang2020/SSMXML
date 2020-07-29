<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login.jsp</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<div class="form-group">
			<label for="username">用户名：</label>
			<input type="text" name="username" id="username" placeholder="请输入用户名"/>
		</div>

		<div class="form-group">
			<label for="password">密码：</label>
			<input type="password" name="password" id="password"  placeholder="请输入密码"/>
		</div>
		<input class="btn btn btn-primary" type="submit" value="登录">
	</form>
	<a href="register.jsp">去注册</a>
	<p class="color:red;">${msg}</p>
</body>
</html>