package com.model;
// Generated 10.10.2018 22:56:44 by Hibernate Tools 4.3.1

import javax.persistence.Id;




/**
 * Buch generated by hbm2java
 */
public class Buch  implements java.io.Serializable {
     
   
    
     private String title;
     private Person person;

    public Buch() {
    }

	
    public Buch(String title) {
        this.title = title;
    }
    public Buch(String title, Person person) {
       this.title = title;
       this.person = person;
    }
   
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }




}


