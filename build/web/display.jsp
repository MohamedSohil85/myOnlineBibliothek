<%-- 
    Document   : display
    Created on : 15.09.2018, 00:55:53
    Author     : Mimo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bibliothek</title>
        
        <style>
           body{
            background-image: url(images/registration.jpg);
          
            background-size: cover;
        }
            @font-face{
               font-family:myfont;
               src:url(images/allerta/allerta_medium.otf);
            }
            header{
                color:white;
                font-family: myfont;
                text-align: center;
                margin-bottom: 10px;
                margin-top: 20px;
                
            }
            a{
                float:right;
                color:white;
                font-family: myfont;
                font-size: 1em;
                margin-top: 10px;
                margin-right: 10px;
            }
            .clear{
               clear: right; 
            }
            .mydiv{
                border:1px solid white;
                border-radius: 1em;
                margin-top: 10px;
               
            }
            .romance{
                text-align: center;
                margin-left: 10px;
                border:1px solid white;
                border-radius: 1em;
                float: left;
                 background: gray;
                padding: 5px 10px;
            }
              input[type=submit]{
              
               width: 70%;
               padding: 7px;
               color: white;
               background: green;
               border:1px solid green;
               border-radius: 0.6em;
               font-family: myfont;
           }
            input[type=submit]:hover{
               
                background: white;
                color:green;
               border:1px solid green;
               border-radius: 0.6em;
               cursor: pointer;
            }
          
        </style>
        
    </head>
    <body>
       
            <jsp:include page="header.jsp">
                <jsp:param name="Bibliothek" value="Bibliothek"/>
            </jsp:include>
    <li style="color:white; font-family: myfont;margin-top: 15px;"><% out.println("Hallo "+session.getAttribute("name")+" , "+session.getAttribute("vorname")); %></li>
          <a href="startsite.jsp">Sign out</a></li>
        <div class="clear"></div>
        <form action="AddBooksServlet" method="post">
        <section>
            <header><h4>Romanice</h4></header>
            <div class="mydiv">
                <div class="romance">
                    
                         <img src="romance/foto1.jpg" />
                         <input type="checkbox" name="checkboxes" value="Romance1"/>
                </div>
                <div class="romance">
                    
                         <img src="romance/foto2.jpg" />
                         <input type="checkbox" name="checkboxes" value="Romanic2"/>
                </div>
                <div class="romance">
                    
                         <img src="romance/foto3.jpg" />
                         <input type="checkbox" name="checkboxes" value="Romanice3"/>
                </div>
                <div class="romance">
                    
                         <img src="romance/foto4.jpg" />
                         <input type="checkbox" name="checkboxes" value="Romanice4"/>
                </div>
                <div class="romance">
                    
                         <img src="romance/foto5.jpg" />
                         <input type="checkbox" name="checkboxes" value="Romanice5"/>
                </div>
                <div class="romance">
                    
                         <img src="romance/foto6.jpg" />
                         <input type="checkbox" name="checkboxes" value="Romanice6"/>
                </div>
            </div>
        </section>
        <div class="clear"></div>
         <section>
            <header><h4>Geschichte</h4></header>
            <div class="mydiv">
                <div class="romance">
                    
                         <img src="geschichte/g1.jpg" />
                         <input type="checkbox" name="checkboxes" value="Geschichte1"/>
                </div>
                <div class="romance">
                    
                         <img src="geschichte/g2.jpg" />
                         <input type="checkbox" name="checkboxes" value="Geschichte2"/>
                </div>
                <div class="romance">
                    
                         <img src="geschichte/g3.jpg" />
                         <input type="checkbox" name="checkboxes" value="Geschichte3"/>
                </div>
                <div class="romance">
                    
                         <img src="geschichte/g4.jpg" />
                         <input type="checkbox" name="checkboxes" value="Geschichte4"/>
                </div>
                <div class="romance">
                    
                         <img src="geschichte/g5.jpg" />
                         <input type="checkbox" name="checkboxes" value="Geschichte5"/>
                </div>
                <div class="romance">
                    
                         <img src="geschichte/g6.jpg" />
                         <input type="checkbox" name="checkboxes" value="Geschichte6"/>
                </div>
            </div>
        </section>
        <input type="submit" value="Ausleihen">
    </body>
</html>
