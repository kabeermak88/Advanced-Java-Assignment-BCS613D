<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String user = request.getParameter("user");
%>
<html>
<head>
    <title>Continue Session</title>
</head>
<body>
    <%
        if (user != null && !user.trim().equals("")) {
    %>
        <p>Welcome, <strong><%= user %></strong>!</p>
        <p><a href="URLSessionDisplay.jsp?user=<%= user %>">Go to Dashboard</a></p>
    <%
        } else {
    %>
        <p>No username provided. <a href="URLSessionStart.jsp">Go back</a>.</p>
    <%
        }
    %>
</body>
</html>
