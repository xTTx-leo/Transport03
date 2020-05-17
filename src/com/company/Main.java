package com.company;

import com.company.Person.Person;
import com.company.Transport.Aircraft;

public class Main {

    public static void main(String[] args) {
        Aircraft aircraft=new Aircraft();
        Person person=new Person();
        person.driveTransport(aircraft);
    }
}
