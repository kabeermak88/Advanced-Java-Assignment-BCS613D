<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*" %>
<%
    String username = request.getParameter("user");
    if (username != null && !username.isEmpty()) {
        Cookie userCookie = new Cookie("username", username);
        userCookie.setMaxAge(60 * 5); // Cookie valid for 5 minutes
        response.addCookie(userCookie);
%>
        <p>Hi <strong><%= username %></strong>, your session has been created using cookies.</p>
        <a href="CookieDisplay.jsp">Click here to view your session</a>
<%
    } else {
%>
        <form method="post" action="">
            Enter your name: <input type="text" name="user" required />
            <input type="submit" value="Create Session" />
        </form>
<%
    }
%>
