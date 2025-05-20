<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Start Session - URL Rewriting</title>
</head>
<body>
    <h2>Session Management using URL Rewriting</h2>
    <form action="URLSessionNext.jsp" method="get">
        <label for="username">Enter Name:</label>
        <input type="text" name="user" id="username" required />
        <br/><br/>
        <input type="submit" value="Proceed" />
    </form>
</body>
</html>
