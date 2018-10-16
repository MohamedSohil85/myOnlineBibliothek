/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Buch;
import java.util.List;

/**
 *
 * @author Mimo
 */
public interface BuchInterface {
    
    public void saveBuch(Buch buch);
    public void searchBuch(String title);
    public List<Buch> getAllBuecher();
}
