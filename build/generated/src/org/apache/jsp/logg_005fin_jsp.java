package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logg_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>log_in seite</title>\n");
      out.write("        <style>\n");
      out.write("              body{\n");
      out.write("            background-image: url(images/registration.jpg);\n");
      out.write("          \n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("            @font-face{\n");
      out.write("               font-family:myfont;\n");
      out.write("               src:url(images/allerta/allerta_medium.otf);\n");
      out.write("            }\n");
      out.write("             td{\n");
      out.write("              \n");
      out.write("                height: 30px;\n");
      out.write("                padding: 8px;\n");
      out.write("                color:white;\n");
      out.write("                font-size: 1.2em;\n");
      out.write("                font-family: myfont;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("           input[type=text]{\n");
      out.write("               width: 70%;\n");
      out.write("               color:blue;\n");
      out.write("               border: 1px solid black;\n");
      out.write("               border-radius: 0.3em;\n");
      out.write("               outline: none;\n");
      out.write("               padding: 2px;\n");
      out.write("           }\n");
      out.write("           input[type=password]{\n");
      out.write("               width: 70%;\n");
      out.write("               color:blue;\n");
      out.write("               border: 1px solid black;\n");
      out.write("               border-radius: 0.3em;\n");
      out.write("               outline: none;\n");
      out.write("               padding: 2px;\n");
      out.write("           }\n");
      out.write("           input[type=submit]{\n");
      out.write("               width: 100%;\n");
      out.write("               padding: 7px;\n");
      out.write("               color: white;\n");
      out.write("               background: green;\n");
      out.write("               border:1px solid green;\n");
      out.write("               border-radius: 0.6em;\n");
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
      out.write("               width: 40%;\n");
      out.write("               padding: 7px;\n");
      out.write("               color: white;\n");
      out.write("               background: red;\n");
      out.write("               border:1px solid red;\n");
      out.write("               border-radius: 0.6em;\n");
      out.write("           }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("header_logg_in", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Loggen Sie sich", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <form action=\"loginValidation\" method=\"post\">\n");
      out.write("        <table style=\" padding: 15px 10px; margin-top: 10px;margin-left: 15px; width: 50%; box-shadow: 5px 5px 15px white;\">\n");
      out.write("      <tr><td>E-mail :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr><td>Kennwort :</td>\n");
      out.write("                    <td><input type=\"password\" name=\"loggin_kennwort\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\"></td>\n");
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
