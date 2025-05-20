import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            int num = Integer.parseInt(request.getParameter("number"));
            long factorial = calculateFactorial(num);
            
            out.println("<html><head><title>Factorial Result</title></head><body>");
            out.println("<h2>Factorial Calculation</h2>");
            out.println("<p>Factorial of " + num + " is: " + factorial + "</p>");
            out.println("<a href='factorial.html'>Calculate Another</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2>Error: Please enter a valid number</h2>");
            out.println("<a href='factorial.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }
    
    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
