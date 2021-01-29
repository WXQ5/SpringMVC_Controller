<%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/27
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${msg}</h1>
<form action="${pageContext.request.contextPath}/login.action">
    <p>
        <label>用户名</label>
        <input type="text" name="username">
    </p>
    <p>
        <label>密码</label>
        <input type="text" name="password">
    </p>
    <p>
        <input type="submit" value="登录">
    </p>
</form>
</body>
</html>
