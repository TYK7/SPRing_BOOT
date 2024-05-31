package com.tyk;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.tyk.binding.Address;
import com.tyk.binding.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        Person p= new  Person();
        
        p.setPersonId(101);
        p.setPersonName("Venu Gopal");
        
        p.setPersonAge(24);
        p.setPersonPhoneNum(8431439741l);
        Address ad= new Address();
        ad.setCity("Vijayawada");
        ad.setState("Andhra Pradesh");
        ad.setCountry("India");
        p.setPersonAddress(ad);
        
        
        JAXBContext ins=JAXBContext.newInstance(Person.class);
        
        Marshaller marshaller = ins.createMarshaller();
        
        marshaller.marshal(p, new File("Person.xml"));
        System.out.println("Marshall was Completed");
        
    }
}
