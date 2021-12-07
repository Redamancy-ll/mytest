<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/30
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎${sessionScope.user.username}登录！<br>
<a href="${pageContext.request.contextPath}/user/delete.do">删除操作</a>
欢迎你
</body>
</html>
