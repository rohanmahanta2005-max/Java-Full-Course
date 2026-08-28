package com.rohan.oop.AbstractionAndInterfaces;

public class HR extends Employee{

    public HR(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HR is hiring fresh candidates");
    }

}
