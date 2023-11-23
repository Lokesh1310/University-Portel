import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;
import java.io.*;
public class MymenuDemo extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
{
	
	PrintWriter out=response.getWriter();

        	out.println("<html>");
	out.println("<head>");
HttpSession session=request.getSession();
 String s=(String)session.getAttribute("uname");
         
         if(s!=null){	
	out.println("<link rel='stylesheet' href='abc.css'>");
	out.println("</head>");
	out.println("<body>");
	out.println("<div id=\"mymenu\">\n" +"<ul><b>\n" +"<li><a href=\"InsertDemo.html\">Insert</a></li>\n" +"<li><a href=\"Search.html\">Search</a></li>\n" +"\n"+"<li><a href=\"Update.html\">Update</a></li>\n" +"<li><a href=\"Delete.html\">Delete</a></li>\n" +"<li><a href=\"ShowAll\">ShowAll</a></li>\n" +"<li><a href=\"LogoutDemo\">LogOut</a></li>\n" +"\n" +"    </b>\n" +"</ul>\n" +"</div>");	
        out.println("<center><big><b>Welcome "+s+"</b></big></center>");
	 
         }
         
         else{
       response.sendRedirect("login.html");	 
         }
	out.println("</head>");
         	out.println("</html>");

	
}}	
