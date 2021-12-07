<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/27
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<body><h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/user/login.do" method="post">
  <label>账号：</label><input name="username"/>
  <label>密码：</label><input name="pwd"/>
  <input type="submit" value="登录"/>
</form>
<a href="${pageContext.request.contextPath}/user/delete.do">删除操作</a>
</body>
</html>
