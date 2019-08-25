<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.08.2019
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Привет!!!</h1>
<h2>Это тестовоый пользователь...</h2>

<% by.les10.bean.User user;
user = (by.les10.bean.User)request.getAttribute("user");
out.print(user.getName());
%>
</body>
</html>
