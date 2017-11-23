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

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Students")
public class Students {


    @XmlElement(name="Student", type=Student.class)
    List<Student> stdList; 


    public void setStdList(List<Student> stdList) {
        this.stdList = stdList;
    }

    @Override
    public String toString() {
        return "Students{" + "stdList=" + stdList + '}';
    }
    

  

}
