package com.mycompany.inheritance;

import com.mycompany.inheritance.people.Admin;
import com.mycompany.inheritance.people.Student;
import com.mycompany.inheritance.people.Person;

public class Inheritance {

    public static void main(String[] args) {
        Person person = new Person("Arlecchino", "Peruere", "56", 25);
        Person person2 = new Person("Furina","Focalors","0",500);
        Student student = new Student("math","alv","56",19,5.0);
        Admin admin = new Admin("Javier","nose","65",23,"Ganador de gachas");
        System.out.println("tu nombre es: " + student.getName());
        System.out.println("tu promedio es: " + student.getAverage());
        System.out.println("hola " + admin.getName());
        System.out.println("Su rol es " + admin.getRole());
        admin.doWork();
    }
}
