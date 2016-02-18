/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.pesoa.jpa.core.dao;

import io.github.jass2125.pesoa.jpa.core.business.Images;
import io.github.jass2125.pesoa.jpa.core.jpa.FactoryJpa;
import javax.persistence.EntityManager;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com> <jair_anderson_bs@hotmail.com>
 * @since 11:38:55, 16-Feb-2016 
 * Package io.github.jass2125.pesoa.jpa.core.dao
 * Project Name pesoa-jpa
 * Encoding UTF-8
 * File Name IPersonDao.java
 */
public class PersonDao implements IPersonDao {

    @Override
    public void add(Images person) {
        EntityManager em = FactoryJpa.getEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }
    
    

}
