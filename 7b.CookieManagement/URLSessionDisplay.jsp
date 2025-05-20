<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String username = request.getParameter("user");
%>
<html>
<head>
    <title>Session Info</title>
</head>
<body>
    <%
        if (username != null) {
    %>
        <h3>Hello again, <%= username %>! Your session is still active.</h3>
    <%
        } else {
    %>
        <p>Session expired or user not found. <a href="URLSessionStart.jsp">Start over</a>.</p>
    <%
        }
    %>
</body>
</html>
