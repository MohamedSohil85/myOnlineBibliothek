<%-- 
    Document   : logg_in
    Created on : 15.09.2018, 00:55:19
    Author     : Mimo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>log_in seite</title>
        <style>
              body{
            background-image: url(images/registration.jpg);
          
            background-size: cover;
        }
            @font-face{
               font-family:myfont;
               src:url(images/allerta/allerta_medium.otf);
            }
             td{
              
                height: 30px;
                padding: 8px;
                color:white;
                font-size: 1.2em;
                font-family: myfont;
            }
           
           input[type=text]{
               width: 70%;
               color:blue;
               border: 1px solid black;
               border-radius: 0.3em;
               outline: none;
               padding: 2px;
           }
           input[type=password]{
               width: 70%;
               color:blue;
               border: 1px solid black;
               border-radius: 0.3em;
               outline: none;
               padding: 2px;
           }
           input[type=submit]{
               width: 100%;
               padding: 7px;
               color: white;
               background: green;
               border:1px solid green;
               border-radius: 0.6em;
           }
            input[type=submit]:hover{
               
                background: white;
                color:green;
               border:1px solid green;
               border-radius: 0.6em;
               cursor: pointer;
            }
            input[type=reset]{
               width: 40%;
               padding: 7px;
               color: white;
               background: red;
               border:1px solid red;
               border-radius: 0.6em;
           }
        </style>
    </head>
    <body>
        <header>
            <jsp:include page="header.jsp">
                <jsp:param name="header_logg_in" value="Loggen Sie sich"/>
            </jsp:include>
        </header>
        <form action="loginValidation" method="post">
        <table style=" padding: 15px 10px; margin-top: 10px;margin-left: 15px; width: 50%; box-shadow: 5px 5px 15px white;">
      <tr><td>E-mail :</td>
                    <td><input type="text" name="email"></td>
                </tr>
                 <tr><td>Kennwort :</td>
                    <td><input type="password" name="loggin_kennwort"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit"></td>
                      <td><input type="reset" name="reset"></td>
                 </tr>
            </table>
        </form>
    </body>
</html>
