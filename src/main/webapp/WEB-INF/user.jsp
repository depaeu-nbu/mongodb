<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户信息</title>
    <%@include file="heade.jsp" %>
    <style type="text/css">
        .tb_ul {
            width: 800px;
            height: 20px;
            display: block;
        }
        .tb_ul li{
            display: block;
            margin: 0 auto;
            padding: 0;
            float: left;
        }
    </style>
</head>
<body>
<div id="user_list" style="width:600px; height: 450px; display:block; margin: 0 auto; padding: 0; text-align: center;">
    <ul class="tb_ul">
        <li style="width: 180px; text-align: right; padding-right: 10px;">id</li>
        <li style="width: 130px; text-align: left;">${user.id}</li>
    </ul>
    <ul class="tb_ul">
        <li style="width: 180px; text-align: right; padding-right: 10px;">userName</li>
        <li style="width: 130px; text-align: left">${user.userName}</li>
    </ul>
    <ul class="tb_ul">
        <li style="width: 180px; text-align: right; padding-right: 10px;">name</li>
        <li style="width: 130px; text-align: left">${user.name}</li>
    </ul>
    <ul class="tb_ul">
        <li style="width: 180px; text-align: right; padding-right: 10px;">sex</li>
        <li style="width: 130px; text-align: left">
            <c:if test="${user.sex == 0}">女</c:if>
            <c:if test="${user.sex == 1}">男</c:if>
        </li>
    </ul>
    <ul class="tb_ul">
        <li style="width: 180px; text-align: right; padding-right: 10px;">mobile</li>
        <li style="width: 130px; text-align: left">${user.mobile}</li>
    </ul>
    <ul class="tb_ul">
        <li style="width: 180px; text-align: right; padding-right: 10px;">createTime</li>
        <li style="width: 280px; text-align: left"><fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></li>
    </ul>
</div>
</body>
</html>
