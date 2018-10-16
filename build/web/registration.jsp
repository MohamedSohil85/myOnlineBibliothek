<%-- 
    Document   : registration
    Created on : 15.09.2018, 00:55:38
    Author     : Mimo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Registration</title>
    <style>
        @font-face{
            font-family: myfont;
            src:url(images/allerta/allerta_medium.otf);
        }
     
   
        body{
            background-image: url(images/registration.jpg);
          
            background-size: cover;
        }
           td{
              
                height: 30px;
                padding: 8px;
                color:white;
                font-size: 1em;
                font-family: myfont;
                text-shadow: 5px 5px 15px white;
              
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
               font-family: myfont;
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
               outline: none;
               font-family: myfont;
           }
           
           select{
              width: 20%;
               padding: 2px; 
           }
    
    
    </style>
    
    </head>
    <body>
        <header><h3>
            <jsp:include page="header.jsp">
                <jsp:param name="header" value="Registraion"/>
            </jsp:include>
            </h3>  
        </header>


  
      <form name="regForm" action="RegistrationServlet" onSubmit="return formValidation();"  method="POST">
            
            <table style=" padding: 15px 10px; margin-top: 10px;margin-left: 15px; width: 50%; box-shadow: 5px 5px 15px white;">
              
                
            
                <tr>
                    <td>Name :</td>
                    <td><input type="text" name="nachname"></td>
                </tr>  
                <tr>
                    <td>Vorname :</td>
                    <td><input type="text" name="vorname"></td>
                </tr>
                <tr><td>Adresse :</td>
                    <td><input type="text" name="adresse"></td>
                </tr>
                 <tr><td>E-mail :</td>
                    <td><input type="text" name="email"></td>
                </tr>
                 <tr><td>Kennwort :</td>
                    <td><input type="password" name="kennwort"></td>
                </tr>
                <tr>
                    <td><input type="submit" ></td>
                      <td><input type="reset"></td>
                 </tr>
                         

            </table>
          
            </form>
           
            
            
        <script>        
            
    

function formValidation(){
           
           var Nachname=document.forms["regForm"]["nachname"];
           var vorname=document.forms["regForm"]["vorname"];
           var adresse=document.forms["regForm"]["adresse"];
           var email=document.forms["regForm"]["email"];
           var kennwort=document.forms["regForm"]["kennwort"];
           
           if(checkNachname(Nachname) && checkVorname(vorname)
               && checkAdresse(adresse) && checkEmail(email)
                && checkPasswort(kennwort)){
          
                            
                  return true;  
                          
        } 
              
               
           return false;
          
       }
            function checkNachname(nachname_){
                var Nachname_lenght=nachname_.value.length;
                var number=/[0-9]/g;
                if(Nachname_lenght===0 || nachname_.value.match(number)){
                    alert("falsche Eingabe! es darf nicht leer sein oder zahl enthalten ");
                    nachname_.focus();
                    return false;
                }else {
                    return true;
                }
            }
            function checkVorname(vorname_){
                var vorname_lenght=vorname_.value.length;
                var number=/[0-9]/g;
                if(vorname_.value.match(number) || vorname_lenght ===0){
                    alert("falsche Eingabe! es darf nicht leer sein oder zahl enthalten ");
                    return false;
                    vorname_.focus();
                }else{
                    return true;
                }
            }
           function checkEmail(email){
               var Email_lenght=email.value.length;
               var EmailFormat= /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
               if(Email_lenght !==0 && email.value.match(EmailFormat)){
                   return true;
               }else {
                   return false;
                   email.focus();
                   window.alert("Falsch Eingabe ! E-mail Feld");
               }
           }
           function checkPasswort(password){
               if(password.value===""){
                   return false;
                   password.focus();
                    window.alert("Kennword Feld ist Leer !");
               }else {
                
                   return true;
                 
               }
           }
          function checkAdresse(adresse){
               if(adresse.value===""){
                   return false;
                   adresse.focus();
                   window.alert("Adresse Feld ist Leer !");
               }else {
                   return true;
               }
           }
        </script>
    
    
    
   
    </body>
</html>
