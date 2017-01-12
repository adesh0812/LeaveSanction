package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/initialize.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    //Db
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/leave_sanct","root","adesh");
    PreparedStatement stmt=null,stmt1=null,stmt2=null,stmt3=null,stmt4=null,stmt5=null;
    ResultSet rs=null,rs1=null,rs2=null,rs3=null,rs4=null;
    
    //users
    String username=null;
    String password=null;
    String type=null;
    String name=null;
    
    //faculty_info
    int id=0;
    String designation=null;
    
    //leave_record
    int leaveno=0;
    String dateStart=null;
    String dateEnd=null;
    String reason=null;
    String date=null;
    int month=0;
    int currentMonth=0;
    
    
    //extra
    String search=null;
 

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Page!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

    try
    {
    if(session!=null)
    {
    username=(String)session.getAttribute("username");
    out.println(username);
    stmt=conn.prepareStatement("select * from users where username=?");
    stmt.setString(1, username);
    rs=stmt.executeQuery();
    rs.next();
    name=rs.getString(4);
    designation=rs.getString(5);
    session.setAttribute("name", name);
    
      out.write("    \n");
      out.write("    \n");
      out.write("        <div>\n");
      out.write("            <h1>Hello ");
      out.print( name);
      out.write("!</h1>\n");
      out.write("            <h2>How are you today!</h2>\n");
      out.write("            <form action=\"logout.jsp\">\n");
      out.write("                <input type=\"submit\" value=\"Log out!\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <h1>Add Users!</h1>\n");
      out.write("            <form method=\"post\" action=\"");
      out.print( request.getRequestURI());
      out.write("\">\n");
      out.write("                Name : <input type=\"text\" name=\"name\" value=\"\" /><br>\n");
      out.write("                User Type : <select name=\"type\">\n");
      out.write("                    <option>user</option>\n");
      out.write("                    <option>admin</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                Username : <input type=\"text\" name=\"username\" value=\"\" /><br>\n");
      out.write("                Password : <input type=\"password\" name=\"password\" value=\"\" /><br>\n");
      out.write("                Confirm Password :<input type=\"text\" name=\"confirm_password\" value=\"\" /><br>\n");
      out.write("                <input type=\"submit\" value=\"Confirm!\" />\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    ");

    }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    
      out.write("   \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
