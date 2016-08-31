<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户登录</title>
    <%@include file="heade.jsp" %>
</head>
<body>
<form id="login" name="login_form" action="${contextPath}/sub_login" method="post">
    userName : <input id="userName" name="userName" type="text"/><br/>
    password : <input id="password" name="password" type="password"/><br/>
    <input id="sub" name="sub" type="submit" value="登录">&nbsp;&nbsp;
    <a href="${contextPath}/register" title="注册">注册</a>
</form>
</body>
</html>
