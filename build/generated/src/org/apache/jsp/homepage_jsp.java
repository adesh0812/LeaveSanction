package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>   \n");
      out.write("    <title>homepage</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link href=\"stylesheets/home.css\" type=\"text/css\" rel=\"stylesheet\" />  \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"images/01.jpg\" alt=\"New York\">\n");
      out.write("      \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"images/04.jpg\" alt=\"Chicago\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"images/06.jpg\" alt=\"Los Angeles\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid bg-1 text-center\">\n");
      out.write("  <h3><B><font color=\"lavenderblush\">SRMSCET BAREILLY</font><B></h3>\n");
      out.write("  <p><em><font color=\"lavenderblush\">LEAVE SANCTION SOFTWARE</font></em></p>\n");
      out.write("  <p><font color=\"orange\"><strong><b>OPERATE ONLY IF YOU ARE AUTHORIZED...!!!!!</b></strong></font></p>\n");
      out.write("  <br>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      \n");
      out.write("      <a href=\"#demo\" data-toggle=\"collapse\"> \n");
      out.write("       <img src=\"images/prabhakar.jpg\" class=\"img-circle\"alt=\"Random Name\" width=\"150\" height=\"150\" style=\"align:left;\">\n");
      out.write("      </a>\n");
      out.write("      \n");
      out.write("        <p>MR.PRABHAKAR GUPTA</p>\n");
      out.write("        <p>DEAN,SRMSCET</p>\n");
      out.write("        <p>BAREILLY</p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      \n");
      out.write("      <a href=\"#demo2\" data-toggle=\"collapse\">\n");
      out.write("        <img src=\"images/dev.jpg\" class=\"img-circle\"alt=\"Random Name\" width=\"150\" height=\"150\" style=\"align:left;\">\n");
      out.write("      </a>\n");
      out.write("        <p>MR.DEV MURTI</p>\n");
      out.write("        <p>CHAIRMAN,SRMSCET</p>\n");
      out.write("        <p>BAREILLY</p>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("   \n");
      out.write("      <a href=\"#demo3\" data-toggle=\"collapse\">\n");
      out.write("         <img src=\"images/LSM.jpg\" class=\"img-circle\"alt=\"Random Name\" width=\"150\" height=\"150\" style=\"align:left;\">\n");
      out.write("      </a>\n");
      out.write("      \n");
      out.write("        <p>MR.L.S.MAURYA</p>\n");
      out.write("        <p>HOD(CSE.),SRMSCET</p>\n");
      out.write("        <p>BAREILLY</p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
