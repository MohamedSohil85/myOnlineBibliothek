/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Person;
import java.util.List;

/**
 *
 * @author Mimo
 */
public interface PersonInterface {
    
    public void savePerson(Person p);
    public void editPerson(Person p);
    public List<Person>getAllPersons(Person p);
    public boolean checkEmailandPasswort(String p,String e);
    
    
}
