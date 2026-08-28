package com.rohan.oop.AbstractionAndInterfaces;

public class Manager extends Employee implements ConductMeeting,Leave {

    public Manager(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("Manager is leading the company..");
    }

    @Override
    public void conductMeeting(){
        System.out.println("Manager is coducting meeting");
    }
    @Override
    public void leave(){
        System.out.println("Manager is taking leave from the project team..");
    }
}
