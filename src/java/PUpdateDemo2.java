import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class PUpdateDemo2 extends HttpServlet{

public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
{
	
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	
	String s1=request.getParameter("u1");
	String s2=request.getParameter("u2");
	String s3=request.getParameter("u3");
	String s4=request.getParameter("u4");
	String s5=request.getParameter("u5");
        
        
        try{    
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql:///lucky","root","1234");
	 Statement st=con.createStatement();
	 
	 st.executeUpdate("update insmarks set rno='"+s1+"',phy='"+s3+"',chem='"+s4+"',maths='"+s5+"' where name='"+s2+"'");
	 response.sendRedirect("ShowAll");
	 
	 con.close();
	}
	catch(Exception e){
		out.println(e);
		
	} 
           	out.println("</body>");
	
		out.println("</html>");
		
	
}}