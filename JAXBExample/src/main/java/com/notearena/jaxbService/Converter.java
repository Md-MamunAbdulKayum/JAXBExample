/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.jaxbService;

/**
 *
 * @author Kayum-603
 */
import com.notearena.model.Student;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class Converter {
    
    
     private static final String XML_FILE_NAME = "students.xml";

    public static void main(String[] args) {
        Student std = new Student();
  
        std.setId(1);
        std.setAge(25);
        std.setName("Mamun");
        std.setGender("Male");
        std.setCollege("K.B College, Mymensingh, Bangladesh");
        std.setPassword("hidepass");
        
        jaxbObjectToXML(std);
        
        Student getStd  = jaxbXMLToObject();
        System.out.println(getStd.toString());
    }


    private static Student jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller un = context.createUnmarshaller();
            Student std = (Student) un.unmarshal(new File(XML_FILE_NAME));
            return std;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void jaxbObjectToXML(Student std) {

        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            // m.marshal(std, System.out);

            // Write to File
            m.marshal(std, new File(XML_FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
