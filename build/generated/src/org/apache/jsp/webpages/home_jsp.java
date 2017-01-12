package org.apache.jsp.webpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/webpages/../initialize.jsp");
    _jspx_dependants.add("/webpages/../header.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    //Db
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/leave_sanct","root","adesh");
    PreparedStatement stmt=null,stmt1=null,stmt2=null,stmt3=null,stmt4=null,stmt5=null,stmt6=null,stmt7=null;
    ResultSet rs=null,rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null,rs7=null;
    
    //users
    String username=null;
    String password=null;
    String type=null;
    String name=null;
    
    //faculty_info
    int id=0;
    int id_f=0;
    String name_f=null;
    String branch_f=null;
    String designation=null;
    String designation_f=null;
    
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
    
    //admin
    String username_a=null;
    String password_a=null;
    String confirmPassword_a=null;
    String type_a=null;
    String name_a=null;
    String designation_a=null;
 

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link href=\"stylesheets/login.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"images/logo.png\"><br><br>        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\" style=\"background-color: rgb(108,0,0);\"><a href=\"homepage.jsp\"><h1 style=\"font-size:22px;\"><b>HOMEPAGE</b></h1></a></div>\n");
      out.write("            <div class=\"col-sm-3\" style=\"background-color: rgb(108,0,0);\"><a href=\"Search.jsp\"><h1 style=\"font-size:22px;\"><b>ACCOUNT</b></h1></a></div>\n");
      out.write("            <div class=\"col-sm-3\" style=\"background-color: rgb(108,0,0);\"><a href=\"search.jsp\"><h1 style=\"font-size:22px;\"><b>SEARCH</b></h1></a></div>\n");
      out.write("            <div class=\"col-sm-3\" style=\"background-color: rgb(108,0,0);\"><a href=\"login.jsp\"><h1 style=\"font-size:22px;\"><b>LOGOUT</b></h1></a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
