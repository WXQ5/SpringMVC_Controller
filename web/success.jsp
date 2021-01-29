<%--
  Created by IntelliJ IDEA.
  User: 落凤
  Date: 2021/1/27
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>登录成功</h1>
    <h1>欢迎您，${user.getUsername()}</h1>
    <a href="${pageContext.request.contextPath}/insertDept.jsp">添加部门</a>
    <c:if test="${! empty depts}">
        <table>
            <tr>
                <th>部门编号</th>
                <th>部门名称</th>
                <th>部门地址</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${depts }" var="dept">
                <tr>
                    <td>${dept.deptno}</td>
                    <td>${dept.dname}</td>
                    <td>${dept.loc}</td>
                    <td>删除</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>
