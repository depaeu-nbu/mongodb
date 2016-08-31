<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>添加/修改用户</title>
    <%@include file="heade.jsp" %>
</head>
<body>
<form id="editor" name="editor_form" action="${contextPath}/sub_editor" method="post">
    <input id="id" name="id" type="hidden" value="${user.id}"/>
    <table align="left" border="1" >
        <tr>
            <td>userName</td>
            <td>
                <input id="userName" name="userName" type="text" value="${user.userName}">
            </td>
        </tr>
        <tr>
            <td>password</td>
            <td>
                <input id="password" name="password" type="password">
            </td>
        </tr>
        <tr>
            <td>name</td>
            <td>
                <input id="name" name="name" type="text" value="${user.name}">
            </td>
        </tr>
        <tr>
            <td>sex</td>
            <td>
                <input id="sex_0" name="sex" type="radio" value="0" <c:if test="${user.sex == 0}">checked="checked"</c:if>/> 女
                <input id="sex_1" name="sex" type="radio" value="1" <c:if test="${user.sex == 1}">checked="checked"</c:if>/> 男
            </td>
        </tr>
        <tr>
            <td>userName</td>
            <td>
                <input id="mobile" name="mobile" type="text" value="${user.mobile}">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input id="sub_editor" name="sub_editor" type="submit" value="修改"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
