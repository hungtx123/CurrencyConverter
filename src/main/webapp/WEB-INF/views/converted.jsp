<%--
  Created by IntelliJ IDEA.
  User: hung
  Date: 10/2/19
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converted amount</title>
</head>
<body>
<h1>The amount of <c:out value="${requestScope['usd']}"/> USD is <c:out value="${requestScope['vnd']}"/>" VND</h1>
</body>
</html>
