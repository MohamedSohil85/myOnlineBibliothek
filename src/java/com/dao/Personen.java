/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Person;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Mimo
 */
public class Personen implements PersonInterface{
 Session session = NewHibernateUtil.getSessionFactory().openSession();
    
    @Override
    public void savePerson(Person p) {
    
		//start transaction
              
		session.beginTransaction();
		//Save the Model object
		session.save(p);
		//Commit transaction
		session.getTransaction().commit();
           session.close();
              
    }

    @Override
    public void editPerson(Person p) {
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
    }

  

    @Override
    public boolean checkEmailandPasswort(String p,String e) {
       
        session.beginTransaction();
        Query q=session.createQuery("select email , passwort from Person where email =:email and passwort =:passwort");
              q.setParameter("email", e);
              q.setParameter("passwort", p);
              
      List<Person>list=q.list();
       for(Person person:list){
           if(p.equals(person.getEmail()) && e.equals(person.getPasswort())){
               return true;
       }
       else {
             return false ;  
               } 
      
      
    }
       session.getTransaction().commit();
    
        return true;
    }

    @Override
    public List<Person> getAllPersons(Person p) {
     Query q=session.createQuery("FROM Person  where nachname := nachname");
      q.setParameter("nachname",p.getNachname());
      return (List<Person>)q.list();
    }

 
    
}
