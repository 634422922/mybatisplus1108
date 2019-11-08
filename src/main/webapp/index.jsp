<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/31
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<html>
<head>
    <title>Title</title>
    <script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
      <script type="application/javascript">
          function saveInfo() {
              $("#addreg").submit();
          }
      </script>
</head>
<body>
<form name="form1" id="addreg" action="${pageContext.request.contextPath}/regist/save" method="post">
name :<input type="text" name="rname"><br>
   radd:<input type="text" name="radd"><br>
    rdem<input type="text" name="rdem">
<%--    <input type="submit" value="提交">--%>
   <a href="javascript:saveInfo()"> <input type="button" value="提交"></a>
 </body>
</html>
