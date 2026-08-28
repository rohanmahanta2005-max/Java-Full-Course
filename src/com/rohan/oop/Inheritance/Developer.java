package com.rohan.oop.Inheritance;

public class Developer extends Employee {

    private double projectBonus;

    public Developer(String name, int age, double salary , double projectBonus) {
        super(name, age, salary);
        this.projectBonus = projectBonus;

    }
    //polymorphism -> same method in different forms

     public void salary(){
        double total = projectBonus + this.salary;
         System.out.println("Total Salary: " + total);
     }
     public void salary(double projectBonus){
         System.out.println(projectBonus);
     }
     public void salary(int projectBonus){
         System.out.println(projectBonus);
     }

}
