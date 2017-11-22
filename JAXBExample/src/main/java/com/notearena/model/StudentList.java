/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Kayum
 */
@XmlRootElement(name = "Students")
@XmlType(propOrder = {"name", "age", "gender", "college"})
public class StudentList {
    private List<Integer> id;
    private List<String> gender;
    private List<Integer> age;
    private List<String> name;
    private List<String> college;
    private List<String> password;

    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id = id;
    }

    public List<String> getGender() {
        return gender;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public List<Integer> getAge() {
        return age;
    }

    public void setAge(List<Integer> age) {
        this.age = age;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getCollege() {
        return college;
    }

    public void setCollege(List<String> college) {
        this.college = college;
    }

    public List<String> getPassword() {
        return password;
    }

    public void setPassword(List<String> password) {
        this.password = password;
    }
    
    
}
