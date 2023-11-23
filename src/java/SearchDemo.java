import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class SearchDemo extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
{
	
	PrintWriter out=response.getWriter();
	
	out.println("<html>");
        out.println("<link rel='stylesheet' href='abc.css'>");
	
	out.println("<body>");
	out.println("<div id='mymenu'><ul><b><li><a href='InsertDemo.html'>Insert</a></li><li>Update</a></li><li>Delete</li><li>ShowAll</li></b></ul></div>");
	
	String s1=request.getParameter("u1");
	String s2=request.getParameter("u2");
	
        out.println("<center>");
	
	
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///lucky","root","1234");
  Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("select * from insmarks where rno='"+s1+"'");
  if(rs.next()){
 out.println("<table cellpadding='12' ");
 out.println("<tr>");
 out.println("<td>RollNo</td>");
 out.println("<td>"+rs.getString(1)+"</td>");
 
 out.println("<tr>");
 out.println("<td>Name</td>");
 out.println("<td>"+rs.getString(2)+"</td>");
 
 out.println("<tr>");
 out.println("<td>Chem</td>");
 out.println("<td>"+rs.getString(3)+"</td>");
 
 out.println("<tr>");
 out.println("<td>Phy</td>");
 out.println("<td>"+rs.getString(4)+"</td>");
 
 out.println("<tr>");
 out.println("<td>Maths</td>");
 out.println("<td>"+rs.getString(5)+"</td>");
 
 out.println("</tr>");
 
 
 
 out.println("</table>");
    
  }
  else{
  out.println("NOT FOUND");
  }  
con.close();
  
	
	}
	catch(Exception e){
	out.println(e);
	}
	
	
	
	
	out.println("</center>");
	out.println("<body>");
	
	out.println("</html>");
	out.close();
}


}