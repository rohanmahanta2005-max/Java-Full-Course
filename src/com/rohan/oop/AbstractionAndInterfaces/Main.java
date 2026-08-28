package com.rohan.oop.AbstractionAndInterfaces;

public class Main {
    public static void main(String[] args){

        Developer d = new Developer(123,"ROHAN",50000);
        d.login();
        Manager m = new Manager(125,"Rony",60000);
        m.login();
        d.conductMeeting();
        m.conductMeeting();
        m.leave();

    }

}
