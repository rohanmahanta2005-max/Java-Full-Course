package com.rohan.oop.Inheritance;

public class Employee {

    protected String name;
    protected int age;
    protected double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void show(){
        System.out.println("Parent Class\n");
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary: "+salary);
    }

}
