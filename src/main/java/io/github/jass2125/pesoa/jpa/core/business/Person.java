/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.pesoa.jpa.core.business;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.FetchType;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since 11:30:20, 16-Feb-2016 
 * Package io.github.jass2125.pesoa.jpa
 * Project Name pesoa-jpa
 * Encoding UTF-8
 * File Name Person.java
 */
public class Person implements Serializable{
    private Long id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private byte img[];

    public Person() {
    }

    public Person(String name, Date birthday, byte[] img) {
        this.name = name;
        this.birthday = birthday;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Basic(fetch = LAZY)
    @Lob()
    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    
    
    
    

}
