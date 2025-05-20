import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        
        // Get existing cookie or create new one
        Cookie cookie = getCookie(request.getCookies(), "visitor");
        int visitCount = 0;
        
        if (cookie == null) {
            cookie = new Cookie("visitor", name + "|1");
            cookie.setMaxAge(30 * 24 * 60 * 60); // 30 days expiry
        } else {
            String[] parts = cookie.getValue().split("\\|");
            name = parts[0];
            visitCount = Integer.parseInt(parts[1]);
            visitCount++;
            cookie.setValue(name + "|" + visitCount);
        }
        
        response.addCookie(cookie);
        
        out.println("<html><head><title>Welcome</title></head><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("<p>Cookie will expire on: " + new Date(System.currentTimeMillis() + cookie.getMaxAge() * 1000) + "</p>");
        out.println("<a href='cookie.html'>Go Back</a>");
        out.println("</body></html>");
    }
    
    private Cookie getCookie(Cookie[] cookies, String name) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie;
                }
            }
        }
        return null;
    }
}
