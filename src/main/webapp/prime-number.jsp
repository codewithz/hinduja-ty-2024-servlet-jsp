<%--
  Created by IntelliJ IDEA.
  User: VICTUS
  Date: 12/5/2024
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int number=Integer.parseInt(request.getParameter("number"));

    boolean flag = false;
    for (int i = 2; i <= number / 2; ++i) {
        // condition for nonprime number
        if (number % i == 0) {
            flag = true;
            break;
        }
    }

    if(!flag){
        %>
    <h1>Number <%= number%> is a prime number </h1>
    <%
    }
    else{
        %>
        <h1> Number <%= number%> is not a prime number</h1>
        <%
    }

    %>

</body>
</html>
