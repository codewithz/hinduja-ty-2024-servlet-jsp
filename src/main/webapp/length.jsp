<%--
  Created by IntelliJ IDEA.
  User: VICTUS
  Date: 12/5/2024
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String value=request.getParameter("value");

    if(value.length()>=6){
        %>
    <h3> Length of String <%= value%> is equals or greater 6</h3>
<%
    }
    else{
        %>
<h3> Length of String <%= value%> is lesser than 6</h3>
<%
    }
%>
</body>
</html>
