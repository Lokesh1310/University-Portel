import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LogoutDemo extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
{
	
	PrintWriter out=response.getWriter();
      HttpSession session=request.getSession();
              session.invalidate();
    
    
            response.sendRedirect("login.html");
            
            out.close();

}


}


























