<%-- 
    Document   : header
    Created on : 02.10.2018, 00:06:43
    Author     : Mimo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             @font-face{
               font-family:myfont;
               src:url(images/allerta/allerta_medium.otf);
            }
            .meinHeader{
            text-align: center;
            padding: 20px 25px;
            color:white;
            box-shadow: 5px 5px 15px white;
            border-radius: 14px;
            font-family: myfont; 
            height: 50px;
            }
        </style>
    </head>
    <body>
        <div class="meinHeader">
        ${param.header}
        ${param.header_logg_in}
        ${param.Bibliothek}
        </div>
    </body>
</html>
