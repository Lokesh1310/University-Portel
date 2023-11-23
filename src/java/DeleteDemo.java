import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DeleteDemo extends HttpServlet{

public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
{
	
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	
	String s1=request.getParameter("u1");
	try{    
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql:///lucky","root","1234");
	 Statement st=con.createStatement();
	 
	 st.executeUpdate("delete from insmarks where rno='"+s1+"'");
	 response.sendRedirect("ShowAll");
	 con.close();
	}
	catch(Exception e){
		out.println(e);
		
	}
		
	
}}