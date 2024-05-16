package com.mycompany.inheritance.people;

public class Person {
    private String name;
    private String lastname;
    private String id;
    private int age;

    public Person(String name, String lastname, String id, int age) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
