<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Please type below blank.......</h1>
	<form action="${pageContext.request.contextPath}/register" method="post">
		<div class="form-group">
			<label for="user">用户名：</label>
			<input type="text" name="username" class="form-control" id="user" placeholder="请输入用户名"/>
		</div>

		<div class="form-group">
			<label for="password">密码：</label>
			<input type="password" name="password" class="form-control" id="password"  placeholder="请输入密码"/>
		</div>

		<div class="form-group" style="text-align: center;">
			<input class="btn btn btn-primary" type="submit" value="注册">
		</div>
		<div class="form-group">
			<a href="login.jsp" style="float: right">已有账号?去登陆</a>
		</div>
	</form>
</body>
</html>