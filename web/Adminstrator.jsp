<%-- 
    Document   : Adminstrator
    Created on : 16.10.2018, 19:43:26
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
        <title>Adminstrator</title>
    </head>
    <body>
        <header><h3>Hallo , <%=session.getAttribute("AdminName") %> </h3></header>
        <section>
            <header><h4>Benutzer Suchen</h4></header>
            <form action="DisplayBenutzer.jsp" method="post">
            <table>
                 <tr>
                    <td>Name :</td>
                    <td><input type="text" name="nachname"></td>
                </tr>  
                <tr><td><input type="submit" value="Suchen"></td>
            </table>
            </form>
        </section>
        <section>
         
          
        </section>
    </body>
</html>
