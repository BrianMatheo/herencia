package com.mycompany.inheritance.people;

public class Admin extends Person{
    private String role;
    
    public Admin(String name, String lastname, String id, int age, String role) {
        super(name, lastname, id, age);
        this.role = role;
    }
    
    public void doWork(){
        System.out.println("Tu nombre es: ");
    }

    public String getRole() {
        return role;
    }
    
    
    
}
