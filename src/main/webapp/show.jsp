<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/4
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table width="60%" border="1" >
        <tr>
            <th>id</th>
            <th>name</th>
            <th>add</th>
            <th>dep</th>
            <th>other</th>
        </tr>
        <c:forEach items="${info}" var="reg">
            <tr>
                <td>${reg.rid}</td>
                <td>${reg.rname}</td>
                <td>${per.radd}</td>
                <td>${per.rdep}</td>
<%--                <td><a href="${pageContext.request.contextPath}/deleteByid?pid=${per.pid}">删除</a><a href="${pageContext.request.contextPath}/getOne?pid=${per.pid}">删除</a></td>--%>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
