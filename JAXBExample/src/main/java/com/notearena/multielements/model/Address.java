/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.multielements.model;

/**
 *
 * @author Kayum-603
 */
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Address")
public class Address
{
    int id; 
    String district;
    String division;
    int zipcode;

    @XmlAttribute(name = "adrI")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDistrict() {
        return district;
    }
    @XmlElement
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getDivision() {
        return division;
    }
    @XmlElement
    public void setDivision(String division) {
        this.division = division;
    }
    
    public int getZipcode() {
        return zipcode;
    }
    @XmlElement
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
}
