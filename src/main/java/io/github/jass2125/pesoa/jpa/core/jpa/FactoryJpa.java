/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.pesoa.jpa.core.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com> <jair_anderson_bs@hotmail.com>
 * @since 11:40:36, 16-Feb-2016 
 * Package io.github.jass2125.pesoa.jpa.core.jpa
 * Project Name pesoa-jpa
 * Encoding UTF-8
 * File Name FactoryJpa.java
 */
public class FactoryJpa {
    private static EntityManager em;
    
    private FactoryJpa(){}
    
    public static EntityManager getEntityManager(){
        if(em == null) {
            em = Persistence.createEntityManagerFactory("default-mysql").createEntityManager();
        }
        return em;
    }
    
    public static void closeEntityManager(){
        em.close();
    }
    
    
}   
