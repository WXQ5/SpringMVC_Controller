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
<form action="${pageContext.request.contextPath}/dept/insert.action">
    <p>
        <label>部门编号</label>
        <input type="text" name="deptno">
    </p>
    <p>
        <label>部门名称</label>
        <input type="text" name="dname">
    </p>
    <p>
        <label>部门地址</label>
        <input type="text" name="loc">
    </p>
    <p>
        <input type="submit" value="添加">
    </p>
</form>
</body>
</html>
