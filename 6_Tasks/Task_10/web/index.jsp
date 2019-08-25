<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.08.2019
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Index Page</title>
  </head>
  <body>
  <form action="controller" method="post">
    <input type="hidden" name="command" value="authorization"/>
    <input type="text" name="login" value=""/>
    <input type="password" name="pass" value=""/>
    <input type="submit" value="sign in"/>
    <br>


  </form>
  </body>
</html>
