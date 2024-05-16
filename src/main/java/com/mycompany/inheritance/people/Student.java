package com.mycompany.inheritance.people;
public class Student extends Person{
    private Double average;

    public Student(String name, String lastname, String id, int age, Double average) {
        super(name, lastname, id, age);
        this.average = average;
    }
    
    public void study(){
        System.out.println("mi bro "  + "Voy a estudiar");
}
    public void homework(){
        System.out.println("Voy a hacer tareas");
    }
    public void goToClass(){
        System.out.println("Me voy pa' clase");
    }

    public Double getAverage() {
        return average;
    }
}
