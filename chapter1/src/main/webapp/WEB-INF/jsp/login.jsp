<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xianyu.hxy
  Date: 2015/9/11
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>景区网站管理员登录</title>
</head>
<body>
<c:if test="${!empty error}">
  <font color="red"><c:out value="${error}"/></font>
</c:if>
<form action="<c:url value="/admin/loginCheck.html"/>" method="post">
  用户名：
  <input type="text" name="userName">
  <br>
  密 码：
  <input type="password" name="password">
  <br>
  <input type="submit" value="登录"/>
  <input type="reset" value="重置"/>
</form>
</body>
</html>