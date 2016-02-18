/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.pesoa.jpa.core.beans;

import io.github.jass2125.pesoa.jpa.core.business.Person;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since 23:11:36, 17-Feb-2016 
 * Package io.github.jass2125.pesoa.jpa.core.beans
 * Project Name pessoa-jpa
 * Encoding UTF-8
 * File Name IRegisterPerson.java
 */

@Stateless
@Local(IManagerPerson.class)
public class ManagerPerson implements IManagerPerson {
    
    @Override
    public void add(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
