package com.rohan.oop.Inheritance;

public class Manager extends Employee {

 protected String address;

 public Manager(String name, int age, double salary, String address){
     super(name,age,salary);
     this.address = address;
 }


public void address(){
    System.out.println("Manager address: "  + address);
}


}

