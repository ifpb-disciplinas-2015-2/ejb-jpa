/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.pesoa.jpa.core.business;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author Anderson Souza 
 * @since 11:30:20, 16-Feb-2016 Package io.github.jass2125.pesoa.jpa Project
 * Name ejbjpa Encoding UTF-8 File Name Person.java
 */

@Entity(name = "Image")
public class Images implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Images() {
    }

    @Lob
    @Basic(fetch = LAZY)
    @Column(name = "pic")
    protected byte[] pic;

    public Images(byte[] img) {
        this.pic = img;
    }

    public byte[] getImg() {
        return pic;
    }

    public Long getId() {
        return id;
    }

    public void setImg(byte[] img) {
        this.pic = img;
    }

}
