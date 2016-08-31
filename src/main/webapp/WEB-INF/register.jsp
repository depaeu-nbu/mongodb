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
    <form id="register" name="register_form" action="${contextPath}/sub_register" method="post">
        <ul class="tb_ul">
            <li style="width: 180px; text-align: right; padding-right: 10px;">userName</li>
            <li style="width: 130px; text-align: left">
                <input id="name" name="name" type="text"/>
            </li>
        </ul>
        <ul class="tb_ul">
            <li style="width: 180px; text-align: right; padding-right: 10px;">password</li>
            <li style="width: 130px; text-align: left">
                <input id="password" name="password" type="password"/>
            </li>
        </ul>
        <ul class="tb_ul">
            <li style="width: 180px; text-align: right; padding-right: 10px;">name</li>
            <li style="width: 130px; text-align: left">
                <input id="userName" name="userName" type="text"/>
            </li>
        </ul>
        <ul class="tb_ul">
            <li style="width: 180px; text-align: right; padding-right: 10px;">sex</li>
            <li style="width: 130px; text-align: left">
                <input id="sex_0" name="sex" type="radio" value="0" checked="checked"/> 女
                <input id="sex_1" name="sex" type="radio" value="1"/> 男
            </li>
        </ul>
        <ul class="tb_ul">
            <li style="width: 180px; text-align: right; padding-right: 10px;">mobile</li>
            <li style="width: 280px; text-align: left">
                <input id="mobile" name="mobile" type="text"/>
            </li>
        </ul>
        <br/>
        <input id="sub_reg" name="sub_reg" type="submit" value="注册"/>
    </form>
</div>
</body>
</html>
