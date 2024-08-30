package contrroler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sahan
 */
@WebServlet(name = "X", urlPatterns = {"/X"})
public class X extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet X GET");
        System.out.println(request.getParameter("name"));
        response.getWriter().write("Hello");
        
    }

    
}
