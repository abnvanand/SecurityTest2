<%--
  Created by IntelliJ IDEA.
  User: abhin
  Date: 7/16/2015
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<html>
<head>
    <title>Terror Movies</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<% if (request.getParameter("error") != null) {
    out.println("Invalid Username Or Password");
}
%>
<form method="post" action="/j_spring_security_check">
    Username<input type="text" name="user_param"/><br/>
    Password<input type="password" name="pass_param"/><br/>
    <input type="submit">

</form>
</body>
</html>
