<%@ page import="javax.servlet.http.Cookie" %>
<%
    String name = null;
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("username")) {
                name = c.getValue();
                break;
            }
        }
    }

    if (name != null) {
%>
        <p>Welcome back, <strong><%= name %></strong>! Your session is active.</p>
<%
    } else {
%>
        <p>No active session found. Please <a href="CookieExample.jsp">login here</a>.</p>
<%
    }
%>
