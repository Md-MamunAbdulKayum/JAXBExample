/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Kayum
 */
@XmlRootElement(name = "Students")
@XmlType(propOrder = {"name", "age", "gender", "college"})
public class Student {
    private int id;

    private String gender;

    private int age;
    private String name;
    private String college;

    private String password;
    
    @XmlAttribute   // it will be written as an attribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement(name = "std-name")  // this tag will be renamed from name to std-name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @XmlTransient   // @XmlTransient means it will not to xml file
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id=" + id + ", gender=" + gender + ", age=" + age + ", name=" + name + ", college=" + college + ", password=" + password;
    }
    
    
    
}
