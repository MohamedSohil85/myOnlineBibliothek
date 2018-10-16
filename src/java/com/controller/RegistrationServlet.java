package com.controller;




import com.dao.BuchInterface;
import com.dao.BuchStore;
import com.dao.PersonInterface;
import com.dao.Personen;
import com.model.Buch;
import com.model.Person;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mimo
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {
      RequestDispatcher rd;
    
           
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
  
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session=request.getSession();
         PersonInterface personen=new Personen();
      Person person=new Person();
         String name_=request.getParameter("nachname");
           String vorname_=request.getParameter("vorname");
           String email_=request.getParameter("email");
          String adresse_=request.getParameter("adresse");
           String kennwort_=request.getParameter("kennwort");
           //
          
           if(name_ !=null &&vorname_ !=null &&
                   email_ !=null && adresse_ !=null && kennwort_ !=null){
            
                person.setVorname(vorname_);
           person.setNachname(name_);
          
           person.setEmail(email_);
           person.setAdresse(adresse_);
           person.setPasswort(kennwort_);
           Buch buch=new Buch();
           buch.setPerson(person);
           
          personen.savePerson(person);
         
           }
        
           session.setAttribute("name", name_);
           session.setAttribute("vorname", vorname_);
              
               
              
             rd = request.getRequestDispatcher("logg_in.jsp");
               rd.forward(request, response);
            
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
