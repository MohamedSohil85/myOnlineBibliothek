<%-- 
    Document   : startsite
    Created on : 15.09.2018, 00:54:04
    Author     : Mimo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>startseite</title>
        <style>
         .myheader{
                background-image: url(images/header1.jpg);
                height: 150px;
                border:1px solid white;
                border-radius: 0.8em;
                box-shadow: 6px 6px 9px gray;
                margin-bottom: 15px;
            }
            header{
                height: 100px;
                border:1px solid white;
                border-radius: 0.8em;
                box-shadow: 6px 6px 9px gray;
                text-align: center;
                padding: 25px 15px;
            }
            ul{
                list-style-type: none;
              
                overflow: hidden;
              
                
            }
          
            
            a{
              
              padding: 1em;
                
              text-align: center;
              text-decoration: none;
              color: white;
              margin-top: 20px; 
              font-size: 1.2em;
          }
          a:hover{
              text-shadow: 0 0 10px white, 0 0 20px white;
              
          }
           div.mybooks{
            
              color:blue;
              float: right;
              font-size: 1em;
              border:1px solid grey;
              border-radius: 1em;
              padding: 0.5em;
              text-align: center;
              margin-top: 15px;
              margin-right: 50px;
              background-color: white;

          }
           div.mybooks:hover{
                box-shadow: 1px 2px 4px grey ,2px 3px 4px black;
                cursor: pointer;
          }
        
        </style>
    </head>
    <body>
       
        <div class="myheader">   
        <ul>
           <a href="logg_in.jsp">einloggen</a>
           <a href="registration.jsp">registration</a>
            <a href="admin.jsp">Adminstrator</a>
            
        </ul>
        </div>    
       
        <section>
            
            <div class="mybooks">
      
        
        <img src="images/AnnaKarenina.jpg" alt="Anna Karenina" title="Anna Karenina">
            
            
    
               <img src="images/ATaleofTwoCities.jpg" alt="At Tal of two Cities" title="A Tal of two Cities">   
               
               
     
        
        
        
        
        <img src="images/harrypotter.jpg"  alt="Harry Potter" title="Harry Potter">
             
      
        </div>
       
        <div class="mybooks">
        <img src="images/Hobbit.jpg" alt="the Hobbit" title="the Hobbit">
           
    
        
     
        <img src="images/lordofRings.jpg"  alt="Lord of Rings" title="Lord of Rings">
            
      
            
       
  
        
        
        <img src="images/WarandPeace.jpg" alt="War and Peace" title="War and Peace">
            
        
        </div>
      
        
        <div class="mybooks">
            
            <img src="images/night.jpg" alt="Night" title="Night">
          
            <img src="images/theRainbow.jpg" alt="the rainbow" title="the Rainbow">
      
            <img src="images/theThief.jpg" alt="the Thief" title="the Thief">
     
        </div>
        <div class="mybooks">
            
           <img src="images/theCurseofChalion.jpg" alt="the Curse of Chalion" title="the Curse of Chalion">
 
                  <img src="images/OliverTwist.jpg" alt="Oliver Twist" title="Olver Twist"> 
           
             <img src="images/GoneWithTheWind.jpg"  alt="Gone with the Wind" title="Gone with the Wind">
       
            
        </div>
        </section> 
      
    </body>
</html>
