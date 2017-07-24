<%--
  Created by IntelliJ IDEA.
  User: chenhansen
  Date: 2017/7/23
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/mvnssm/login/login.do" method="post">
    姓名:<input type="text" name="userName"/>
    <br>
    密码:<input type="password" name="password"/>
    <br>
    <input type="submit" value="登陆"/>
</form>
</body>
</html>