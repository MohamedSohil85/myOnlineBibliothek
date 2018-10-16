/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Buch;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Mimo
 */
public class BuchStore implements BuchInterface {
     Session session = NewHibernateUtil.getSessionFactory().openSession();

    @Override
    public void saveBuch(Buch buch) {
       //start transaction
              
		session.beginTransaction();
		//Save the Model object
		session.save(buch);
		//Commit transaction
		session.getTransaction().commit();
                session.close();
    }

    @Override
    public void searchBuch(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Buch> getAllBuecher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
