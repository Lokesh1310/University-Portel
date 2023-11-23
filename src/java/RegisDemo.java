import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegisDemo extends HttpServlet{

public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
{
	
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	
	String s1=request.getParameter("un");
	String s2=request.getParameter("up");
	try{    
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql:///lucky","root","1234");
	 Statement st=con.createStatement();
	 
	 st.executeUpdate("insert into login values('"+s1+"','"+s2+"');");
	 out.println("Data inserted");
	 con.close();
	}
	catch(Exception e){
		out.println(e);
		
	}
		
	
}}