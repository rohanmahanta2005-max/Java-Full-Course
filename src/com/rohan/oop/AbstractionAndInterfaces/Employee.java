package com.rohan.oop.AbstractionAndInterfaces;

public abstract class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void login(){
        System.out.println(name+" logged in...");
    }
    public void logout(){
        System.out.println(name+ " is logged out...");
    }

    public abstract void work();
}
