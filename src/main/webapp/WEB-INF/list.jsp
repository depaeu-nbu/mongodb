<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户列表</title>
    <%@include file="heade.jsp" %>
</head>
<body>
<div id="user_list" style="display:block; margin: 0 auto; padding: 0; text-align: center;">
    <table align="left" border="1">
        <tr class="tb_ul" align="left">
            <td style="width: 200px;">id</td>
            <td style="width: 150px;">name</td>
            <td style="width: 100px;">userName</td>
            <td style="width: 50px;">sex</td>
            <td style="width: 120px;">mobile</td>
            <td style="width: 200px;">createTime</td>
            <td style="width: 160px;">operation</td>
        </tr>
        <c:forEach var="list" items="${list}">
            <tr class="tb_ul" align="left">
                <td>${list.id}</td>
                <td>
                    <a href="${contextPath}/user?lId=${list.id}" target="_blank" title="查看">${list.name}</a>
                </td>
                <td>${list.userName}</td>
                <td>
                    <c:if test="${list.sex == 0}">女</c:if>
                    <c:if test="${list.sex == 1}">男</c:if>
                </td>
                <td>${list.mobile}</td>
                <td>
                    <fmt:formatDate value="${list.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                </td>
                <td>
                    <a href="${contextPath}/editor?lId=${list.id}" title="编辑">编辑</a>&nbsp;
                    <a href="${contextPath}/delete?lId=${list.id}" title="删除">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
