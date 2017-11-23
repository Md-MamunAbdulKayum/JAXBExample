/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.multielements.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kayum-603
 */
@XmlRootElement(name = "Student")
public class Student {
    int strID;
    String name;
    int age;
    String gender;

    @XmlElement()
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @XmlElement(name="Address", type=Address.class)
    List<Address> adrList; 

    public int getStrID() {
        return strID;
    }
    @XmlAttribute
    public void setStrID(int strID) {
        this.strID = strID;
    }
    public String getName() {
        return name;
    }
    @XmlElement(name="std-name")
    public void setName(String name) {
        this.name = name;
    }
    
    public double getAge() {
        return age;
    }
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
        
    public void setAdrList(List<Address> adrList) {
        this.adrList = adrList;
    }

    @Override
    public String toString() {
        return "Students{" + "strID=" + strID + ", name=" + name + ", age=" + age + ", gender=" + gender + ", adrList=" + adrList + '}';
    }
}
