import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class PUpdateDemo extends HttpServlet{
 public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
 
 PrintWriter out=response.getWriter();
 
 out.println("<html>");
 out.println("<body>");
String s=request.getParameter("u"); 
 
try{ 
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///lucky","root","1234");    
Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from  insmarks where rno='"+s+"'");

while(rs.next()){
     out.println("<form action='PUpdateDemo2'>");
 out.println("<table cellpadding=12>");
 out.println("<tr>");
 out.println("<td>Rollno</td>");
out.println("<td><input type='text' value='"+rs.getString(1)+"' name='u1' ></td>");
 out.println("</tr>");

 out.println("<tr>");
 out.println("<td>Name</td>");
out.println("<td><input type='text' value='"+rs.getString(2)+"'name='u2' ></td>");
 out.println("</tr>");

 out.println("<tr>");
 out.println("<td>Phy</td>");
out.println("<td><input type='text' value='"+rs.getString(3)+"' name='u3' ></td>");
 out.println("</tr>");

 out.println("<tr>");
 out.println("<td>Chem</td>");
out.println("<td><input type='text' value='"+rs.getString(4)+"' name='u4' ></td>");
 out.println("</tr>");

 out.println("<tr>");
 out.println("<td>Maths</td>");
out.println("<td><input type='text' value='"+rs.getString(5)+"' name='u5' ></td>");
 out.println("</tr>");
 
 out.println("<tr>");
out.println("<th colspan='2'><input type='submit' value='Update'></th>");
 out.println("</tr>");


out.println("</table>");
 out.println("</form>");
}
}
catch(Exception e){

}out.println("</body>");
 out.println("</html>");
 
 
 }


}