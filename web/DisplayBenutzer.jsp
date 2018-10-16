<%-- 
    Document   : DisplayBenutzer
    Created on : 16.10.2018, 22:40:18
    Author     : Mimo
--%>

<%@page import="java.util.List"%>
<%@page import="com.dao.Personen"%>
<%@page import="com.dao.PersonInterface"%>
<%@page import="com.model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <div>
            <%  
                 String BenutzerName=request.getParameter("nachname");
                    Person person=new Person();
                    person.setNachname(BenutzerName);
                    PersonInterface personen=new Personen();
                List<Person>persona=personen.getAllPersons(person);
                        for(Person p:persona){
                            out.println("<div>");
                            out.println(p.getNachname());
                            out.println(p.getVorname());
                            out.println(p.getAdresse());
                            out.println(p.getEmail());
                            out.println("</div>");
    }
                        %>
            </div>
    </body>
</html>
