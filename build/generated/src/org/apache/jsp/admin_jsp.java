package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin</title>\n");
      out.write("        <style>\n");
      out.write("                input[type=submit]{\n");
      out.write("               width: 100%;\n");
      out.write("               padding: 7px;\n");
      out.write("               color: white;\n");
      out.write("               background: green;\n");
      out.write("               border:1px solid green;\n");
      out.write("               border-radius: 0.6em;\n");
      out.write("               margin-top: 1em;\n");
      out.write("           }\n");
      out.write("            input[type=submit]:hover{\n");
      out.write("               \n");
      out.write("                background: white;\n");
      out.write("                color:green;\n");
      out.write("               border:1px solid green;\n");
      out.write("               border-radius: 0.6em;\n");
      out.write("               cursor: pointer;\n");
      out.write("            }\n");
      out.write("            input[type=reset]{\n");
      out.write("               width: 60%;\n");
      out.write("               padding: 7px;\n");
      out.write("               color: white;\n");
      out.write("               background: red;\n");
      out.write("               border:1px solid red;\n");
      out.write("               border-radius: 0.6em;\n");
      out.write("                margin-top: 1em;\n");
      out.write("                outline: none;\n");
      out.write("           }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"AdminServlet\" method=\"post\">\n");
      out.write("        <table >\n");
      out.write("      <tr><td>Name :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr><td>Kennwort :</td>\n");
      out.write("                    <td><input type=\"password\" name=\"admin_kennwort\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" value=\"logg in\"></td>\n");
      out.write("                      <td><input type=\"reset\" name=\"reset\"></td>\n");
      out.write("                 </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
