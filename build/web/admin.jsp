<%-- 
    Document   : admin
    Created on : 08.10.2018, 18:36:33
    Author     : Mimo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <style>
                input[type=submit]{
               width: 100%;
               padding: 7px;
               color: white;
               background: green;
               border:1px solid green;
               border-radius: 0.6em;
               margin-top: 1em;
           }
            input[type=submit]:hover{
               
                background: white;
                color:green;
               border:1px solid green;
               border-radius: 0.6em;
               cursor: pointer;
            }
            input[type=reset]{
               width: 60%;
               padding: 7px;
               color: white;
               background: red;
               border:1px solid red;
               border-radius: 0.6em;
                margin-top: 1em;
                outline: none;
           }
        </style>
    </head>
    <body>
        <form action="AdminServlet" method="post">
        <table >
      <tr><td>Name :</td>
                    <td><input type="text" name="name"></td>
                </tr>
                 <tr><td>Kennwort :</td>
                    <td><input type="password" name="admin_kennwort"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="logg in"></td>
                      <td><input type="reset" name="reset"></td>
                 </tr>
            </table>
        </form>
    </body>
</html>
