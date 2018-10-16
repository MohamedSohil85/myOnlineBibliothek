package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <title>Registration</title>\n");
      out.write("    <style>\n");
      out.write("        @font-face{\n");
      out.write("            font-family: myfont;\n");
      out.write("            src:url(images/allerta/allerta_medium.otf);\n");
      out.write("        }\n");
      out.write("     \n");
      out.write("   \n");
      out.write("        body{\n");
      out.write("            background-image: url(images/registration.jpg);\n");
      out.write("          \n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("           td{\n");
      out.write("              \n");
      out.write("                height: 30px;\n");
      out.write("                padding: 8px;\n");
      out.write("                color:white;\n");
      out.write("                font-size: 1em;\n");
      out.write("                font-family: myfont;\n");
      out.write("                text-shadow: 5px 5px 15px white;\n");
      out.write("              \n");
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
      out.write("              \n");
      out.write("               width: 100%;\n");
      out.write("               padding: 7px;\n");
      out.write("               color: white;\n");
      out.write("               background: green;\n");
      out.write("               border:1px solid green;\n");
      out.write("               border-radius: 0.6em;\n");
      out.write("               font-family: myfont;\n");
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
      out.write("               outline: none;\n");
      out.write("               font-family: myfont;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           select{\n");
      out.write("              width: 20%;\n");
      out.write("               padding: 2px; \n");
      out.write("           }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header><h3>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("header", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Registraion", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("            </h3>  \n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("      <form name=\"regForm\" action=\"RegistrationServlet\" onSubmit=\"return formValidation();\"  method=\"POST\">\n");
      out.write("            \n");
      out.write("            <table style=\" padding: 15px 10px; margin-top: 10px;margin-left: 15px; width: 50%; box-shadow: 5px 5px 15px white;\">\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <td>Name :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nachname\"></td>\n");
      out.write("                </tr>  \n");
      out.write("                <tr>\n");
      out.write("                    <td>Vorname :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"vorname\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Adresse :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"adresse\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr><td>E-mail :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr><td>Kennwort :</td>\n");
      out.write("                    <td><input type=\"password\" name=\"kennwort\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" ></td>\n");
      out.write("                      <td><input type=\"reset\"></td>\n");
      out.write("                 </tr>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("          \n");
      out.write("            </form>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <script>        \n");
      out.write("            \n");
      out.write("    \n");
      out.write("\n");
      out.write("function formValidation(){\n");
      out.write("           \n");
      out.write("           var Nachname=document.forms[\"regForm\"][\"nachname\"];\n");
      out.write("           var vorname=document.forms[\"regForm\"][\"vorname\"];\n");
      out.write("           var adresse=document.forms[\"regForm\"][\"adresse\"];\n");
      out.write("           var email=document.forms[\"regForm\"][\"email\"];\n");
      out.write("           var kennwort=document.forms[\"regForm\"][\"kennwort\"];\n");
      out.write("           \n");
      out.write("           if(checkNachname(Nachname) && checkVorname(vorname)\n");
      out.write("               && checkAdresse(adresse) && checkEmail(email)\n");
      out.write("                && checkPasswort(kennwort)){\n");
      out.write("          \n");
      out.write("                            \n");
      out.write("                  return true;  \n");
      out.write("                          \n");
      out.write("        } \n");
      out.write("              \n");
      out.write("               \n");
      out.write("           return false;\n");
      out.write("          \n");
      out.write("       }\n");
      out.write("            function checkNachname(nachname_){\n");
      out.write("                var Nachname_lenght=nachname_.value.length;\n");
      out.write("                var number=/[0-9]/g;\n");
      out.write("                if(Nachname_lenght===0 || nachname_.value.match(number)){\n");
      out.write("                    alert(\"falsche Eingabe! es darf nicht leer sein oder zahl enthalten \");\n");
      out.write("                    nachname_.focus();\n");
      out.write("                    return false;\n");
      out.write("                }else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function checkVorname(vorname_){\n");
      out.write("                var vorname_lenght=vorname_.value.length;\n");
      out.write("                var number=/[0-9]/g;\n");
      out.write("                if(vorname_.value.match(number) || vorname_lenght ===0){\n");
      out.write("                    alert(\"falsche Eingabe! es darf nicht leer sein oder zahl enthalten \");\n");
      out.write("                    return false;\n");
      out.write("                    vorname_.focus();\n");
      out.write("                }else{\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("           function checkEmail(email){\n");
      out.write("               var Email_lenght=email.value.length;\n");
      out.write("               var EmailFormat= /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\n");
      out.write("               if(Email_lenght !==0 && email.value.match(EmailFormat)){\n");
      out.write("                   return true;\n");
      out.write("               }else {\n");
      out.write("                   return false;\n");
      out.write("                   email.focus();\n");
      out.write("                   window.alert(\"Falsch Eingabe ! E-mail Feld\");\n");
      out.write("               }\n");
      out.write("           }\n");
      out.write("           function checkPasswort(password){\n");
      out.write("               if(password.value===\"\"){\n");
      out.write("                   return false;\n");
      out.write("                   password.focus();\n");
      out.write("                    window.alert(\"Kennword Feld ist Leer !\");\n");
      out.write("               }else {\n");
      out.write("                \n");
      out.write("                   return true;\n");
      out.write("                 \n");
      out.write("               }\n");
      out.write("           }\n");
      out.write("          function checkAdresse(adresse){\n");
      out.write("               if(adresse.value===\"\"){\n");
      out.write("                   return false;\n");
      out.write("                   adresse.focus();\n");
      out.write("                   window.alert(\"Adresse Feld ist Leer !\");\n");
      out.write("               }else {\n");
      out.write("                   return true;\n");
      out.write("               }\n");
      out.write("           }\n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
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
