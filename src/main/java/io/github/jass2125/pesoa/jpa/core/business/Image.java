/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.pesoa.jpa.core.business;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since 11:30:20, 16-Feb-2016 
 * Package io.github.jass2125.pesoa.jpa
 * Project Name pesoa-jpa
 * Encoding UTF-8
 * File Name Person.java
 */
@Entity
public class Image implements Serializable{
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    
    @Lob
    private byte img[];

    public Image() {
    }

    public Image(byte[] img) {
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    
    
    
    
    
}