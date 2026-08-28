package com.rohan.oop.Inheritance;

public class Main {


    public static void main(){

//        Developers d = new Developers("Rohan Mahanta",21,50000,20000);
//        d.salary();
      Employee obj  = new Developer("rohan",21,50000,20000);
      obj.show();
      Developer d = new Developer("rohan",22,60000,10000);


    }
}
