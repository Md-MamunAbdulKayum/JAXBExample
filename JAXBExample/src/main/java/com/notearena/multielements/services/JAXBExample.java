/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.multielements.services;

/**
 *
 * @author Kayum-603
 */
import com.notearena.multielements.model.Students;
import com.notearena.multielements.model.Address;
import com.notearena.multielements.model.Student;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class JAXBExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Student student=new Student();
        
        Students students=new Students();
        
        List<Address> list=new ArrayList<Address>();
        List<Student> liststd=new ArrayList<Student>();
        
        student.setStrID(1);
        student.setName("Mamun");
        student.setAge(10);
        student.setGender("Male");
       
        Address address=new  Address();
        address.setId(1);
        address.setDistrict("Mymensingh");
        address.setDivision("Mymensingh");
        address.setZipcode(2400);
        list.add(address);
        
        
        address=new Address();
        address.setId(2);
        address.setDistrict("Gazipur");
        address.setDivision("Dhaka");
        address.setZipcode(2200);
        list.add(address);
        
        student.setAdrList(list);
       
        liststd.add(student);
        students.setStdList(liststd);
                
        try {
            // code to create a xml file
            Writer file = new FileWriter("F://students.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            // output pretty printed
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(students, file);
            file.close();
            marshaller.marshal(students, System.out);// writing in a console
            //end code to create a xml file
            students=null;
            Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
            students =(Students) unMarshaller.unmarshal(new FileReader("F://students.xml"));
            System.out.println(students.toString());
           

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
