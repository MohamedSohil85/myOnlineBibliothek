package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class startsite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>startseite</title>\n");
      out.write("        <style>\n");
      out.write("         .myheader{\n");
      out.write("                background-image: url(images/header1.jpg);\n");
      out.write("                height: 150px;\n");
      out.write("                border:1px solid white;\n");
      out.write("                border-radius: 0.8em;\n");
      out.write("                box-shadow: 6px 6px 9px gray;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("            header{\n");
      out.write("                height: 100px;\n");
      out.write("                border:1px solid white;\n");
      out.write("                border-radius: 0.8em;\n");
      out.write("                box-shadow: 6px 6px 9px gray;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 25px 15px;\n");
      out.write("            }\n");
      out.write("            ul{\n");
      out.write("                list-style-type: none;\n");
      out.write("              \n");
      out.write("                overflow: hidden;\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("              \n");
      out.write("              padding: 1em;\n");
      out.write("                \n");
      out.write("              text-align: center;\n");
      out.write("              text-decoration: none;\n");
      out.write("              color: white;\n");
      out.write("              margin-top: 20px; \n");
      out.write("              font-size: 1.2em;\n");
      out.write("          }\n");
      out.write("          a:hover{\n");
      out.write("              text-shadow: 0 0 10px white, 0 0 20px white;\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("           div.mybooks{\n");
      out.write("            \n");
      out.write("              color:blue;\n");
      out.write("              float: right;\n");
      out.write("              font-size: 1em;\n");
      out.write("              border:1px solid grey;\n");
      out.write("              border-radius: 1em;\n");
      out.write("              padding: 0.5em;\n");
      out.write("              text-align: center;\n");
      out.write("              margin-top: 15px;\n");
      out.write("              margin-right: 50px;\n");
      out.write("              background-color: white;\n");
      out.write("\n");
      out.write("          }\n");
      out.write("           div.mybooks:hover{\n");
      out.write("                box-shadow: 1px 2px 4px grey ,2px 3px 4px black;\n");
      out.write("                cursor: pointer;\n");
      out.write("          }\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"myheader\">   \n");
      out.write("        <ul>\n");
      out.write("           <a href=\"logg_in.jsp\">einloggen</a>\n");
      out.write("           <a href=\"registration.jsp\">registration</a>\n");
      out.write("            <a href=\"admin.jsp\">Adminstrator</a>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("        </div>    \n");
      out.write("       \n");
      out.write("        <section>\n");
      out.write("            \n");
      out.write("            <div class=\"mybooks\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <img src=\"images/AnnaKarenina.jpg\" alt=\"Anna Karenina\" title=\"Anna Karenina\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    \n");
      out.write("               <img src=\"images/ATaleofTwoCities.jpg\" alt=\"At Tal of two Cities\" title=\"A Tal of two Cities\">   \n");
      out.write("               \n");
      out.write("               \n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <img src=\"images/harrypotter.jpg\"  alt=\"Harry Potter\" title=\"Harry Potter\">\n");
      out.write("             \n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"mybooks\">\n");
      out.write("        <img src=\"images/Hobbit.jpg\" alt=\"the Hobbit\" title=\"the Hobbit\">\n");
      out.write("           \n");
      out.write("    \n");
      out.write("        \n");
      out.write("     \n");
      out.write("        <img src=\"images/lordofRings.jpg\"  alt=\"Lord of Rings\" title=\"Lord of Rings\">\n");
      out.write("            \n");
      out.write("      \n");
      out.write("            \n");
      out.write("       \n");
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <img src=\"images/WarandPeace.jpg\" alt=\"War and Peace\" title=\"War and Peace\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <div class=\"mybooks\">\n");
      out.write("            \n");
      out.write("            <img src=\"images/night.jpg\" alt=\"Night\" title=\"Night\">\n");
      out.write("          \n");
      out.write("            <img src=\"images/theRainbow.jpg\" alt=\"the rainbow\" title=\"the Rainbow\">\n");
      out.write("      \n");
      out.write("            <img src=\"images/theThief.jpg\" alt=\"the Thief\" title=\"the Thief\">\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("        <div class=\"mybooks\">\n");
      out.write("            \n");
      out.write("           <img src=\"images/theCurseofChalion.jpg\" alt=\"the Curse of Chalion\" title=\"the Curse of Chalion\">\n");
      out.write(" \n");
      out.write("                  <img src=\"images/OliverTwist.jpg\" alt=\"Oliver Twist\" title=\"Olver Twist\"> \n");
      out.write("           \n");
      out.write("             <img src=\"images/GoneWithTheWind.jpg\"  alt=\"Gone with the Wind\" title=\"Gone with the Wind\">\n");
      out.write("       \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </section> \n");
      out.write("      \n");
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
