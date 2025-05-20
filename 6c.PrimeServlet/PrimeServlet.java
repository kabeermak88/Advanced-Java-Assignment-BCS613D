import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            int num = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = checkPrime(num);
            
            out.println("<html><head><title>Prime Check</title></head><body>");
            out.println("<h2>Prime Number Check</h2>");
            out.println("<p>" + num + " is " + (isPrime ? "" : "not ") + "a prime number.</p>");
            out.println("<a href='prime.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2>Error: Please enter a valid number</h2>");
            out.println("<a href='prime.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }
    
    private boolean checkPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
