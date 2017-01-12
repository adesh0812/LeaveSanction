package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.time.ZoneId;
import java.time.LocalDate;
import java.sql.*;
import java.util.Date;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/initialize.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("\n");
      out.write("\n");

    
    //Db
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/leave_sanct","root","adesh");
    PreparedStatement stmt=null,stmt1=null,stmt2=null,stmt3=null,stmt4=null,stmt5=null,stmt6=null,stmt7=null,stmt8=null;
    ResultSet rs=null,rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null,rs7=null,rs8=null;
    
    //Date
    Date dateTime = new Date();
    LocalDate localDate = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
    
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
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link href=\"stylesheets/home.css\" type=\"text/css\" rel=\"stylesheet\" />  \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <font color=\"white\"><marquee direction=\"left\" style=\"background:rgb(108,0,0)\">\n");
      out.write("    <H1 STYLE =\"FONT-SIZE:15PX\"><B>SHRI RAM MURTI SMARAK COLLEGE OF ENGINEERING AND TECHNOLOGY</H1>\n");
      out.write("</B></marquee>\n");
      out.write("</font>\n");
      out.write("<BR><BR>\n");
      out.write("<img style=\"position:absolute;top:54px;left:0px;height:90px;width:600px;\" src=\"images/logo.png\">\n");
      out.write("<p style=\"position:absolute;top:85px;left:1020px;width:356px;height:34px\">\n");
      out.write("<u><b><u>PROMOTING EDUCATION AND HEALTHCARE</b></u></p>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<hr style=\"top:10%;width:100%;color:black;\"/>\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"home.jsp\">Home</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        \n");
      out.write("          \n");
      out.write("          <li><a href=\"search.jsp\">Search</a></li>\n");
      out.write("        <li><a href=\"account.jsp\">Account</a></li>\n");
      out.write("        <li><a href=\"grant.jsp\">Grant</a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          ");

          if(session.getAttribute("username")!=null)
            out.println("<li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Log Out </a></li> ");
          else
            out.println("<li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Log In </a></li> ");
          
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <title>Login Portal</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link href=\"stylesheets/login.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>    \n");
      out.write("        <script type=\"text/javascript\">function alertbox(){\n");
      out.write("            alert(\"login successful\");\n");
      out.write("           }\n");
      out.write("        function alertb(){\n");
      out.write("            alert(\"successfully loged out!\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("                </head>\n");
      out.write("    \n");
      out.write("    <body background=\"images/2.jpg\">\n");
      out.write("           \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <BR>\n");
      out.write("        \n");
      out.write("        ");

        try
        {
        if(session.getAttribute("username")==null)
        {
            
        
      out.write(" \n");
      out.write("    <center>\n");
      out.write("        <form action=\"");
      out.print(request.getRequestURI());
      out.write("\" method=\"POST\" class=\"smart-green\">\n");
      out.write("            <center>\n");
      out.write("                <h1> </h1>\n");
      out.write("                <h1>\n");
      out.write("                    \n");
      out.write("                    <p style=\"position:absolute;top:280px;left:600px;width:165px;height:62px\">Enter Details</p>\n");
      out.write("                </h1>\n");
      out.write("            </center>\n");
      out.write("            <br>\n");
      out.write("            <label>\n");
      out.write("                <span>Username :</span>\n");
      out.write("                <input id=\"name\" type=\"text\" name=\"username\" placeholder=\"Your USER ID\" />\n");
      out.write("            </label>\n");
      out.write("            <br>\n");
      out.write("            <label>\n");
      out.write("                <span>Password :</span>\n");
      out.write("                <input id=\"pass\" type=\"password\" name=\"password\" placeholder=\"Your PASSWORD\"/>\n");
      out.write("            </label>\n");
      out.write("            <br>\n");
      out.write("            <label>\n");
      out.write("                <span>User Type :</span>\n");
      out.write("                <select name=\"selection\">\n");
      out.write("                    <option value=\"USER\">user</option>\n");
      out.write("                    <option value=\"ADMINISTRATOR\">admin</option>\n");
      out.write("                </select>\n");
      out.write("            </label>  \n");
      out.write("            <br><br>  \n");
      out.write("            <label>\n");
      out.write("                <span>&nbsp;</span> \n");
      out.write("                <div class=\"btn\">\n");
      out.write("                <center>\n");
      out.write("                    <input type=\"submit\" value=\"Login\" onClick=\"alertbox()\" type=\"button\" class=\"btn btn-info btn-sm\" data-toggle=\"modal\" data-target=\"#myModal\"/>\n");
      out.write("                </center>\n");
      out.write("                </div> \n");
      out.write("            </label>    \n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("        ");

        username=request.getParameter("username");
        if(username=="")
        {
            
        }
        password=request.getParameter("password");
        type=request.getParameter("type");
        stmt=conn.prepareStatement("select * from users where username=? and password=?");
        stmt.setString(1, username);
        stmt.setString(2, password);
        rs=stmt.executeQuery();
        if(rs.next())   
        {
            if(rs.getString(3).equals("user"))
            {
                session.setAttribute("username", username);
                response.sendRedirect("./home.jsp");     
            }
            else if(rs.getString(3).equals("admin"))
            {
                session.setAttribute("username", password);
                session.setAttribute("type", "admin");
                response.sendRedirect("./home.jsp");     
            }
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        }
        else
        //logout
        {
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <center> <h1>Hello ");
      out.print( (String)session.getAttribute("username"));
      out.write("!</h1></center>\n");
      out.write("            <br>\n");
      out.write("            <center> <h2>Confirm Logout!</h2></center>\n");
      out.write("            <br><br>\n");
      out.write("            <center> <form action=\"logout.jsp\">\n");
      out.write("                 <input type=\"submit\" value=\"Log out!\" onClick=\"alertb()\" type=\"button\" class=\"btn btn-info btn-sm\" data-toggle=\"modal\" data-target=\"#myModal\"/>\n");
      out.write("\n");
      out.write("                </form></center>\n");
      out.write("        </div>\n");
      out.write("        ");

        }
        
        
        
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div style=\"background-color:black;font-color:white\";>  \n");
      out.write("\n");
      out.write("        <h3><font style=\"color:white;\">Developed By :</font></h3>\n");
      out.write("  <p><b><font style=\"color:white;\">© \"UVaA\"- Utkarsh Vishal and Adesh</font></b></p>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        \n");
      out.write("        ");
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
