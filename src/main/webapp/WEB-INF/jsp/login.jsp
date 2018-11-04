
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="/User/login" method="post">
    用户ID： <input type="text" name="user_id"/>
    用户密码：<input type="password" name="user_password">
    <input type="submit" value="提交">
</form>

</body>
</html>
